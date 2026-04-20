package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        String sourceCode = Files.readString(file.toPath());

        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> parseResult = parser.parse(sourceCode);

        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + filePath);
            parseResult.getProblems().forEach(p -> System.err.println(p.getMessage()));
            System.exit(1);
        }

        CompilationUnit cu = parseResult.getResult().get();

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if ("flyway".equals(method.getNameAsString())) {
                fixFlywayMethod(method);
            }
        });

        String transformedCode = cu.toString();
        Files.writeString(file.toPath(), transformedCode);
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    private static void fixFlywayMethod(MethodDeclaration method) {
        BlockStmt body = method.getBody().orElseThrow();
        List<Statement> statements = body.getStatements();

        int flywayVarIndex = -1;
        String flywayVarName = null;

        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariables().size() > 0) {
                        String varType = varDecl.getVariable(0).getType().asString();
                        if (varType.contains("Flyway")) {
                            Expression initializer = varDecl.getVariable(0).getInitializer().orElse(null);
                            if (initializer instanceof ObjectCreationExpr) {
                                ObjectCreationExpr creation = (ObjectCreationExpr) initializer;
                                if (creation.getType().asString().equals("Flyway") && creation.getArguments().isEmpty()) {
                                    flywayVarIndex = i;
                                    flywayVarName = varDecl.getVariable(0).getNameAsString();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (flywayVarIndex == -1 || flywayVarName == null) {
            return;
        }

        MethodCallExpr dataSourceCall = null;
        MethodCallExpr classLoaderCall = null;
        MethodCallExpr locationsCall = null;
        MethodCallExpr validateOnMigrateCall = null;
        int returnIndex = -1;

        for (int i = flywayVarIndex + 1; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    if (methodCall.getScope().isPresent() && 
                        methodCall.getScope().get().toString().equals(flywayVarName)) {
                        String methodName = methodCall.getNameAsString();
                        switch (methodName) {
                            case "setDataSource":
                                dataSourceCall = methodCall;
                                break;
                            case "setClassLoader":
                                classLoaderCall = methodCall;
                                break;
                            case "setLocations":
                                locationsCall = methodCall;
                                break;
                            case "setValidateOnMigrate":
                                validateOnMigrateCall = methodCall;
                                break;
                        }
                    }
                }
            } else if (stmt instanceof ReturnStmt) {
                returnIndex = i;
                break;
            }
        }

        if (dataSourceCall == null) {
            return;
        }

        MethodCallExpr configureCall = new MethodCallExpr(null, "configure");
        configureCall.setScope(new NameExpr("Flyway"));

        MethodCallExpr chainedCall = configureCall;

        if (dataSourceCall != null && !dataSourceCall.getArguments().isEmpty()) {
            MethodCallExpr dsCall = new MethodCallExpr(configureCall, "dataSource");
            dsCall.addArgument(dataSourceCall.getArguments().get(0));
            chainedCall = dsCall;
        }

        if (classLoaderCall != null && !classLoaderCall.getArguments().isEmpty()) {
            MethodCallExpr clCall = new MethodCallExpr(chainedCall, "classLoader");
            clCall.addArgument(classLoaderCall.getArguments().get(0));
            chainedCall = clCall;
        }

        if (locationsCall != null && !locationsCall.getArguments().isEmpty()) {
            MethodCallExpr locCall = new MethodCallExpr(chainedCall, "locations");
            locCall.addArgument(locationsCall.getArguments().get(0));
            chainedCall = locCall;
        }

        if (validateOnMigrateCall != null && !validateOnMigrateCall.getArguments().isEmpty()) {
            MethodCallExpr valCall = new MethodCallExpr(chainedCall, "validateOnMigrate");
            valCall.addArgument(validateOnMigrateCall.getArguments().get(0));
            chainedCall = valCall;
        }

        MethodCallExpr loadCall = new MethodCallExpr(chainedCall, "load");

        ReturnStmt newReturnStmt = new ReturnStmt(loadCall);

        int statementsToRemove = (returnIndex != -1 ? returnIndex : statements.size()) - flywayVarIndex;
        for (int i = 0; i < statementsToRemove && flywayVarIndex < statements.size(); i++) {
            if (flywayVarIndex < statements.size()) {
                statements.remove(flywayVarIndex);
            }
        }

        if (returnIndex != -1 && returnIndex > flywayVarIndex) {
            statements.add(flywayVarIndex, newReturnStmt);
        } else {
            statements.add(newReturnStmt);
        }
    }
}
