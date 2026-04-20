package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(file);
        
        cu.findAll(MethodDeclaration.class).stream()
            .filter(method -> method.getNameAsString().equals("flyway"))
            .forEach(Main::transformFlywayMethod);
        
        String transformedCode = cu.toString();
        Files.write(Paths.get(filePath), transformedCode.getBytes());
        
        System.out.println("Transformation complete: " + filePath);
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        BlockStmt body = method.getBody().orElseThrow();
        List<Statement> statements = new ArrayList<>(body.getStatements());
        
        int flywayVarIndex = -1;
        
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                Expression expr = ((ExpressionStmt) stmt).getExpression();
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariables().stream()
                            .anyMatch(v -> v.getNameAsString().equals("flyway"))) {
                        flywayVarIndex = i;
                        break;
                    }
                }
            }
        }
        
        if (flywayVarIndex == -1) {
            return;
        }
        
        List<Expression> dataSourceArgs = new ArrayList<>();
        List<Expression> classLoaderArgs = new ArrayList<>();
        List<Expression> locationsArgs = new ArrayList<>();
        List<Expression> validateOnMigrateArgs = new ArrayList<>();
        
        List<Integer> setterIndices = new ArrayList<>();
        
        for (int i = flywayVarIndex + 1; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                Expression expr = ((ExpressionStmt) stmt).getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    String methodName = methodCall.getNameAsString();
                    
                    if (methodCall.getScope().isPresent() && 
                        methodCall.getScope().get() instanceof NameExpr &&
                        ((NameExpr) methodCall.getScope().get()).getNameAsString().equals("flyway")) {
                        
                        switch (methodName) {
                            case "setDataSource":
                                dataSourceArgs.addAll(methodCall.getArguments());
                                setterIndices.add(i);
                                break;
                            case "setClassLoader":
                                classLoaderArgs.addAll(methodCall.getArguments());
                                setterIndices.add(i);
                                break;
                            case "setLocations":
                                locationsArgs.addAll(methodCall.getArguments());
                                setterIndices.add(i);
                                break;
                            case "setValidateOnMigrate":
                                validateOnMigrateArgs.addAll(methodCall.getArguments());
                                setterIndices.add(i);
                                break;
                        }
                    }
                }
            }
        }
        
        for (int i = setterIndices.size() - 1; i >= 0; i--) {
            statements.remove((int) setterIndices.get(i));
        }
        
        statements.remove(flywayVarIndex);
        
        MethodCallExpr configureCall = new MethodCallExpr("Flyway.configure");
        
        Expression chainedCall = configureCall;
        if (!dataSourceArgs.isEmpty()) {
            chainedCall = new MethodCallExpr(chainedCall, "dataSource", new NodeList<>(dataSourceArgs));
        }
        if (!classLoaderArgs.isEmpty()) {
            chainedCall = new MethodCallExpr(chainedCall, "classLoader", new NodeList<>(classLoaderArgs));
        }
        if (!locationsArgs.isEmpty()) {
            chainedCall = new MethodCallExpr(chainedCall, "locations", new NodeList<>(locationsArgs));
        }
        if (!validateOnMigrateArgs.isEmpty()) {
            chainedCall = new MethodCallExpr(chainedCall, "validateOnMigrate", new NodeList<>(validateOnMigrateArgs));
        }
        
        MethodCallExpr loadCall = new MethodCallExpr(chainedCall, "load");
        
        ReturnStmt returnStmt = new ReturnStmt(loadCall);
        statements.add(returnStmt);
        
        method.setBody(new BlockStmt(new NodeList<>(statements)));
    }
}
