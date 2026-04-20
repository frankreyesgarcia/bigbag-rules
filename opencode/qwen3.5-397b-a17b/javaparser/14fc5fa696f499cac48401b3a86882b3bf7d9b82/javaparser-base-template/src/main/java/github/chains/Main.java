package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);

        CompilationUnit cu = StaticJavaParser.parse(file);

        cu.findAll(MethodDeclaration.class).stream()
                .filter(method -> method.getNameAsString().equals("flyway"))
                .forEach(Main::fixFlywayMethod);

        Files.write(Paths.get(filePath), cu.toString().getBytes());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    private static void fixFlywayMethod(MethodDeclaration method) {
        if (!method.getBody().isPresent()) {
            return;
        }

        var statements = method.getBody().get().getStatements();
        Iterator<Statement> iterator = statements.iterator();

        int index = 0;
        Statement flywayDeclStmt = null;
        VariableDeclarationExpr flywayDecl = null;
        String flywayVarName = null;

        while (iterator.hasNext()) {
            Statement stmt = iterator.next();
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariables().size() == 1) {
                        var var = varDecl.getVariables().get(0);
                        if (var.getTypeAsString().contains("Flyway")) {
                            if (var.getInitializer().isPresent() &&
                                    var.getInitializer().get() instanceof ObjectCreationExpr) {
                                ObjectCreationExpr creation = (ObjectCreationExpr) var.getInitializer().get();
                                if (creation.getType().asString().contains("Flyway")) {
                                    flywayDeclStmt = stmt;
                                    flywayDecl = varDecl;
                                    flywayVarName = var.getNameAsString();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            index++;
        }

        if (flywayDeclStmt == null || flywayVarName == null) {
            return;
        }

        Expression dataSourceArg = null;
        Expression classLoaderArg = null;
        Expression locationsArg = null;
        Expression validateOnMigrateArg = null;

        int setDataSourceIdx = -1;
        int setClassLoaderIdx = -1;
        int setLocationsIdx = -1;
        int setValidateOnMigrateIdx = -1;

        for (int i = index + 1; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    String methodName = methodCall.getNameAsString();
                    Expression scope = methodCall.getScope().orElse(null);

                    if (scope instanceof NameExpr &&
                            ((NameExpr) scope).getNameAsString().equals(flywayVarName)) {

                        if (methodName.equals("setDataSource") && methodCall.getArguments().size() == 1) {
                            dataSourceArg = methodCall.getArgument(0);
                            setDataSourceIdx = i;
                        } else if (methodName.equals("setClassLoader") && methodCall.getArguments().size() == 1) {
                            classLoaderArg = methodCall.getArgument(0);
                            setClassLoaderIdx = i;
                        } else if (methodName.equals("setLocations") && methodCall.getArguments().size() == 1) {
                            locationsArg = methodCall.getArgument(0);
                            setLocationsIdx = i;
                        } else if (methodName.equals("setValidateOnMigrate") && methodCall.getArguments().size() == 1) {
                            validateOnMigrateArg = methodCall.getArgument(0);
                            setValidateOnMigrateIdx = i;
                        }
                    }
                }
            }
        }

        Statement returnStmt = null;
        int returnIdx = -1;
        for (int i = index + 1; i < statements.size(); i++) {
            if (statements.get(i) instanceof ReturnStmt) {
                ReturnStmt ret = (ReturnStmt) statements.get(i);
                Expression returnExpr = ret.getExpression().orElse(null);
                if (returnExpr instanceof NameExpr &&
                        ((NameExpr) returnExpr).getNameAsString().equals(flywayVarName)) {
                    returnStmt = ret;
                    returnIdx = i;
                    break;
                }
            }
        }

        if (dataSourceArg == null || locationsArg == null || validateOnMigrateArg == null || returnStmt == null) {
            return;
        }

        MethodCallExpr configureCall = new MethodCallExpr(new NameExpr("Flyway"), "configure");
        MethodCallExpr dataSourceCall = new MethodCallExpr(configureCall, "dataSource");
        dataSourceCall.addArgument(dataSourceArg);
        MethodCallExpr locationsCall = new MethodCallExpr(dataSourceCall, "locations");
        locationsCall.addArgument(locationsArg);
        MethodCallExpr validateCall = new MethodCallExpr(locationsCall, "validateOnMigrate");
        validateCall.addArgument(validateOnMigrateArg);
        MethodCallExpr loadCall = new MethodCallExpr(validateCall, "load");

        ReturnStmt newReturnStmt = new ReturnStmt(loadCall);

        statements.remove(returnIdx);
        if (setValidateOnMigrateIdx > setLocationsIdx) {
            statements.remove(setValidateOnMigrateIdx);
        }
        if (setLocationsIdx > setDataSourceIdx) {
            statements.remove(setLocationsIdx);
        }
        if (setDataSourceIdx > index) {
            statements.remove(setDataSourceIdx);
        }
        if (setClassLoaderIdx > index) {
            for (int i = statements.size() - 1; i >= 0; i--) {
                Statement stmt = statements.get(i);
                if (stmt instanceof ExpressionStmt) {
                    ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                    Expression expr = exprStmt.getExpression();
                    if (expr instanceof MethodCallExpr) {
                        MethodCallExpr methodCall = (MethodCallExpr) expr;
                        String methodName = methodCall.getNameAsString();
                        Expression scope = methodCall.getScope().orElse(null);
                        if (scope instanceof NameExpr &&
                                ((NameExpr) scope).getNameAsString().equals(flywayVarName) &&
                                methodName.equals("setClassLoader")) {
                            statements.remove(i);
                            break;
                        }
                    }
                }
            }
        }
        statements.remove(index);

        statements.add(newReturnStmt);
    }
}
