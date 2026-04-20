package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        cu.findAll(MethodDeclaration.class).stream()
                .filter(method -> method.getNameAsString().equals("flyway"))
                .forEach(Main::fixFlywayMethod);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    private static void fixFlywayMethod(MethodDeclaration method) {
        List<Statement> statements = method.getBody().orElseThrow().getStatements();

        Optional<Statement> flywayCreationStmt = statements.stream()
                .filter(stmt -> stmt instanceof ExpressionStmt)
                .filter(stmt -> {
                    Expression expr = ((ExpressionStmt) stmt).getExpression();
                    if (expr instanceof VariableDeclarationExpr) {
                        VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                        return varDecl.getVariables().stream()
                                .anyMatch(v -> v.getInitializer().isPresent() &&
                                        v.getInitializer().get() instanceof ObjectCreationExpr &&
                                        ((ObjectCreationExpr) v.getInitializer().get())
                                                .getType().getNameAsString().equals("Flyway"));
                    }
                    return false;
                })
                .findFirst();

        if (!flywayCreationStmt.isPresent()) {
            return;
        }

        int creationIndex = statements.indexOf(flywayCreationStmt.get());

        ExpressionStmt creationStmt = (ExpressionStmt) flywayCreationStmt.get();
        VariableDeclarationExpr varDeclExpr = (VariableDeclarationExpr) creationStmt.getExpression();
        VariableDeclarator varDeclarator = varDeclExpr.getVariable(0);
        String flywayVarName = varDeclarator.getNameAsString();

        Expression dataSourceExpr = null;
        Expression locationsExpr = null;
        Expression validateOnMigrateExpr = null;

        List<Integer> indicesToRemove = new ArrayList<>();
        for (int i = creationIndex + 1; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                Expression expr = ((ExpressionStmt) stmt).getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    if (methodCall.getScope().isPresent() &&
                            methodCall.getScope().get().toString().equals(flywayVarName)) {
                        String methodName = methodCall.getNameAsString();
                        if (methodName.equals("setDataSource") && methodCall.getArguments().size() == 1) {
                            dataSourceExpr = methodCall.getArgument(0);
                            indicesToRemove.add(i);
                        } else if (methodName.equals("setLocations") && methodCall.getArguments().size() == 1) {
                            locationsExpr = methodCall.getArgument(0);
                            indicesToRemove.add(i);
                        } else if (methodName.equals("setValidateOnMigrate") && methodCall.getArguments().size() == 1) {
                            validateOnMigrateExpr = methodCall.getArgument(0);
                            indicesToRemove.add(i);
                        } else if (methodName.equals("setClassLoader")) {
                            indicesToRemove.add(i);
                        }
                    }
                }
            }
        }

        for (int i = indicesToRemove.size() - 1; i >= 0; i--) {
            statements.remove((int) indicesToRemove.get(i));
        }

        MethodCallExpr configureCall = new MethodCallExpr(new NameExpr("Flyway"), "configure");

        if (dataSourceExpr != null) {
            MethodCallExpr dataSourceCall = new MethodCallExpr(configureCall, "dataSource");
            dataSourceCall.addArgument(dataSourceExpr);
            configureCall = dataSourceCall;
        }

        if (locationsExpr != null) {
            MethodCallExpr locationsCall = new MethodCallExpr(configureCall, "locations");
            locationsCall.addArgument(locationsExpr);
            configureCall = locationsCall;
        }

        if (validateOnMigrateExpr != null) {
            MethodCallExpr validateCall = new MethodCallExpr(configureCall, "validateOnMigrate");
            validateCall.addArgument(validateOnMigrateExpr);
            configureCall = validateCall;
        }

        MethodCallExpr loadCall = new MethodCallExpr(configureCall, "load");

        VariableDeclarator newVarDeclarator = new VariableDeclarator(
                varDeclarator.getType(),
                flywayVarName,
                loadCall
        );

        VariableDeclarationExpr newVarDecl = new VariableDeclarationExpr(newVarDeclarator);
        ExpressionStmt newCreationStmt = new ExpressionStmt(newVarDecl);
        statements.set(creationIndex, newCreationStmt);

        Optional<Statement> returnStmtOpt = statements.stream()
                .filter(stmt -> stmt instanceof ReturnStmt)
                .filter(stmt -> {
                    ReturnStmt ret = (ReturnStmt) stmt;
                    Expression expr = ret.getExpression().orElse(null);
                    return expr != null && expr.toString().equals(flywayVarName);
                })
                .findFirst();

        if (returnStmtOpt.isPresent()) {
            int returnIndex = statements.indexOf(returnStmtOpt.get());
            while (creationIndex + 1 < returnIndex) {
                statements.remove(creationIndex + 1);
                returnIndex--;
            }
        }
    }
}
