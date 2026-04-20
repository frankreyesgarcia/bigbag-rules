package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
        
        CompilationUnit cu = StaticJavaParser.parse(file);
        
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if ("flyway".equals(method.getNameAsString())) {
                fixFlywayMethod(method);
            }
        });
        
        String transformedCode = cu.toString();
        Files.write(Paths.get(filePath), transformedCode.getBytes(StandardCharsets.UTF_8));
        
        System.out.println("Transformation complete: " + filePath);
    }

    private static void fixFlywayMethod(MethodDeclaration method) {
        List<Statement> statements = method.getBody().orElseThrow().getStatements();
        
        if (statements.size() < 6) {
            return;
        }
        
        int newFlywayIndex = -1;
        int setDataSourceIndex = -1;
        int setClassLoaderIndex = -1;
        int setLocationsIndex = -1;
        int setValidateOnMigrateIndex = -1;
        int returnIndex = -1;
        
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDeclExpr = (VariableDeclarationExpr) expr;
                    VariableDeclarator declarator = varDeclExpr.getVariable(0);
                    if ("flyway".equals(declarator.getNameAsString())) {
                        Expression initializer = declarator.getInitializer().orElse(null);
                        if (initializer instanceof ObjectCreationExpr) {
                            ObjectCreationExpr oce = (ObjectCreationExpr) initializer;
                            if ("Flyway".equals(oce.getType().getNameAsString())) {
                                newFlywayIndex = i;
                            }
                        }
                    }
                } else if (expr instanceof MethodCallExpr) {
                    MethodCallExpr mce = (MethodCallExpr) expr;
                    if (mce.getScope().isPresent() && mce.getScope().get() instanceof NameExpr) {
                        NameExpr scope = (NameExpr) mce.getScope().get();
                        if ("flyway".equals(scope.getNameAsString())) {
                            String methodName = mce.getNameAsString();
                            switch (methodName) {
                                case "setDataSource":
                                    setDataSourceIndex = i;
                                    break;
                                case "setClassLoader":
                                    setClassLoaderIndex = i;
                                    break;
                                case "setLocations":
                                    setLocationsIndex = i;
                                    break;
                                case "setValidateOnMigrate":
                                    setValidateOnMigrateIndex = i;
                                    break;
                            }
                        }
                    }
                }
            } else if (stmt instanceof ReturnStmt) {
                ReturnStmt returnStmt = (ReturnStmt) stmt;
                if (returnStmt.getExpression().isPresent() && 
                    returnStmt.getExpression().get() instanceof NameExpr) {
                    NameExpr expr = (NameExpr) returnStmt.getExpression().get();
                    if ("flyway".equals(expr.getNameAsString())) {
                        returnIndex = i;
                    }
                }
            }
        }
        
        if (newFlywayIndex == -1 || setDataSourceIndex == -1 || 
            setClassLoaderIndex == -1 || setLocationsIndex == -1 || 
            setValidateOnMigrateIndex == -1 || returnIndex == -1) {
            return;
        }
        
        List<Statement> statementsToKeep = new ArrayList<>();
        for (int i = 0; i < statements.size(); i++) {
            if (i != newFlywayIndex && i != setDataSourceIndex && 
                i != setClassLoaderIndex && i != setLocationsIndex && 
                i != setValidateOnMigrateIndex && i != returnIndex) {
                statementsToKeep.add(statements.get(i));
            }
        }
        
        Expression setDataSourceArg = null;
        Expression setClassLoaderArg = null;
        Expression setLocationsArg = null;
        Expression setValidateOnMigrateArg = null;
        
        for (Statement stmt : statements) {
            if (stmt instanceof ExpressionStmt) {
                Expression expr = ((ExpressionStmt) stmt).getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr mce = (MethodCallExpr) expr;
                    if (mce.getScope().isPresent() && mce.getScope().get() instanceof NameExpr) {
                        NameExpr scope = (NameExpr) mce.getScope().get();
                        if ("flyway".equals(scope.getNameAsString())) {
                            String methodName = mce.getNameAsString();
                            switch (methodName) {
                                case "setDataSource":
                                    setDataSourceArg = mce.getArguments().get(0);
                                    break;
                                case "setClassLoader":
                                    setClassLoaderArg = mce.getArguments().get(0);
                                    break;
                                case "setLocations":
                                    setLocationsArg = mce.getArguments().get(0);
                                    break;
                                case "setValidateOnMigrate":
                                    setValidateOnMigrateArg = mce.getArguments().get(0);
                                    break;
                            }
                        }
                    }
                }
            }
        }
        
        MethodCallExpr configureCall = new MethodCallExpr(
            new NameExpr("Flyway"),
            "configure"
        );
        
        MethodCallExpr chainedCall = new MethodCallExpr(
            configureCall,
            "dataSource"
        );
        chainedCall.getArguments().add(setDataSourceArg);
        
        chainedCall = new MethodCallExpr(
            chainedCall,
            "validateOnMigrate"
        );
        chainedCall.getArguments().add(setValidateOnMigrateArg);
        
        MethodCallExpr loadCall = new MethodCallExpr(
            chainedCall,
            "load"
        );
        
        ReturnStmt newReturnStmt = new ReturnStmt(loadCall);
        statementsToKeep.add(newReturnStmt);
        
        method.getBody().get().getStatements().clear();
        for (Statement stmt : statementsToKeep) {
            method.getBody().get().addStatement(stmt);
        }
    }
}
