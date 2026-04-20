package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "/workspace/nem/nis/src/main/java/org/nem/specific/deploy/appconfig/NisAppConfig.java";
        
        CompilationUnit cu = StaticJavaParser.parse(new File(sourceFile));
        
        cu.findAll(MethodDeclaration.class).stream()
            .filter(method -> method.getNameAsString().equals("flyway"))
            .forEach(method -> {
                BlockStmt body = method.getBody().orElseThrow();
                
                NodeList<Statement> statements = body.getStatements();
                
                for (int i = 0; i < statements.size(); i++) {
                    Statement stmt = statements.get(i);
                    
                    if (stmt instanceof VariableDeclarationExpr) {
                        VariableDeclarationExpr varDecl = (VariableDeclarationExpr) stmt;
                        if (varDecl.getVariables().size() > 0 && 
                            varDecl.getVariable(0).getNameAsString().equals("flyway")) {
                            
                            VariableDeclarator varDeclarator = varDecl.getVariable(0);
                            
                            ObjectCreationExpr newFlyway = new ObjectCreationExpr();
                            newFlyway.setType("org.flywaydb.core.Flyway");
                            newFlyway.setArguments(new NodeList<>());
                            
                            varDeclarator.setInitializer(newFlyway);
                        }
                    }
                    
                    if (stmt instanceof ExpressionStmt) {
                        ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                        Expression expr = exprStmt.getExpression();
                        
                        if (expr instanceof MethodCallExpr) {
                            MethodCallExpr methodCall = (MethodCallExpr) expr;
                            Optional<Expression> scopeOpt = methodCall.getScope();
                            
                            if (scopeOpt.isPresent() && scopeOpt.get() instanceof NameExpr) {
                                NameExpr scope = (NameExpr) scopeOpt.get();
                                if (scope.getNameAsString().equals("flyway")) {
                                    
                                    String methodName = methodCall.getNameAsString();
                                    
                                    switch (methodName) {
                                        case "setDataSource":
                                            methodCall.setName("dataSource");
                                            break;
                                        case "setClassLoader":
                                            methodCall.setName("classLoader");
                                            break;
                                        case "setLocations":
                                            methodCall.setName("locations");
                                            break;
                                        case "setValidateOnMigrate":
                                            methodCall.setName("validateOnMigrate");
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
                
                VariableDeclarationExpr flywayDecl = null;
                for (int j = 0; j < statements.size(); j++) {
                    Statement stmt = statements.get(j);
                    if (stmt instanceof VariableDeclarationExpr) {
                        VariableDeclarationExpr varDecl = (VariableDeclarationExpr) stmt;
                        if (varDecl.getVariables().size() > 0 && 
                            varDecl.getVariable(0).getNameAsString().equals("flyway")) {
                            flywayDecl = varDecl;
                            break;
                        }
                    }
                }
                
                if (flywayDecl != null) {
                    int insertPos = statements.indexOf(flywayDecl) + 1;
                    
                    VariableDeclarator builderVar = new VariableDeclarator();
                    builderVar.setType(new com.github.javaparser.ast.type.VarType());
                    builderVar.setName("flywayBuilder");
                    builderVar.setInitializer(new MethodCallExpr(new NameExpr("org.flywaydb.core.Flyway"), "configure"));
                    
                    VariableDeclarationExpr builderDecl = new VariableDeclarationExpr(builderVar);
                    ExpressionStmt builderStmt = new ExpressionStmt(builderDecl);
                    statements.add(insertPos, builderStmt);
                    insertPos++;
                    
                    for (int i = insertPos; i < statements.size(); i++) {
                        Statement stmt = statements.get(i);
                        if (stmt instanceof ExpressionStmt) {
                            ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                            Expression expr = exprStmt.getExpression();
                            
                            if (expr instanceof MethodCallExpr) {
                                MethodCallExpr methodCall = (MethodCallExpr) expr;
                                Optional<Expression> scopeOpt = methodCall.getScope();
                                
                                if (scopeOpt.isPresent() && scopeOpt.get() instanceof NameExpr) {
                                    NameExpr scope = (NameExpr) scopeOpt.get();
                                    if (scope.getNameAsString().equals("flyway")) {
                                        
                                        String methodName = methodCall.getNameAsString();
                                        NodeList<Expression> methodArgs = methodCall.getArguments();
                                        
                                        MethodCallExpr newCall = new MethodCallExpr();
                                        newCall.setScope(new NameExpr("flywayBuilder"));
                                        newCall.setName(methodName);
                                        newCall.setArguments(methodArgs);
                                        
                                        statements.set(i, new ExpressionStmt(newCall));
                                    }
                                }
                            }
                        }
                    }
                    
                    for (int i = statements.size() - 1; i >= 0; i--) {
                        Statement stmt = statements.get(i);
                        if (stmt instanceof ReturnStmt) {
                            ReturnStmt returnStmt = (ReturnStmt) stmt;
                            Optional<Expression> returnExprOpt = returnStmt.getExpression();
                            if (returnExprOpt.isPresent() && returnExprOpt.get() instanceof NameExpr) {
                                NameExpr nameExpr = (NameExpr) returnExprOpt.get();
                                if (nameExpr.getNameAsString().equals("flyway")) {
                                    MethodCallExpr buildCall = new MethodCallExpr();
                                    buildCall.setScope(new NameExpr("flywayBuilder"));
                                    buildCall.setName("build");
                                    returnStmt.setExpression(buildCall);
                                }
                            }
                        }
                    }
                    
                    flywayDecl.getVariables().forEach(var -> {
                        var.setType("org.flywaydb.core.Flyway");
                        var.setInitializer((Expression) null);
                    });
                }
            });
        
        java.nio.file.Files.writeString(new File(sourceFile).toPath(), cu.toString());
        
        System.out.println("Transformation complete!");
    }
}
