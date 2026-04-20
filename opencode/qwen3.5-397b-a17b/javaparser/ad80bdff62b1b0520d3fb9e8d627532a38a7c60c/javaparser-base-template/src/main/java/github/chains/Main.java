package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;

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
        
        CompilationUnit cu = StaticJavaParser.parse(file);
        
        cu.findAll(MethodDeclaration.class).stream()
            .filter(method -> method.getNameAsString().equals("flyway"))
            .forEach(Main::transformFlywayMethod);
        
        Files.write(Paths.get(filePath), cu.toString().getBytes());
        System.out.println("Transformation complete: " + filePath);
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        method.getBody().ifPresent(body -> {
            NodeList<Statement> statements = body.getStatements();
            
            List<Integer> toRemove = new ArrayList<>();
            
            for (int i = 0; i < statements.size(); i++) {
                Statement stmt = statements.get(i);
                
                if (stmt instanceof ExpressionStmt) {
                    ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                    Expression expr = exprStmt.getExpression();
                    
                    if (expr instanceof VariableDeclarationExpr) {
                        VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                        
                        if (varDecl.getVariables().size() == 1) {
                            var variable = varDecl.getVariables().get(0);
                            Expression initializer = variable.getInitializer().orElse(null);
                            
                            if (initializer instanceof ObjectCreationExpr) {
                                ObjectCreationExpr creation = (ObjectCreationExpr) initializer;
                                
                                if (creation.getType().asString().equals("org.flywaydb.core.Flyway") ||
                                    creation.getType().asString().equals("Flyway")) {
                                    
                                    String varName = variable.getNameAsString();
                                    
                                    List<MethodCallExpr> setterCalls = new ArrayList<>();
                                    List<Integer> setterIndices = new ArrayList<>();
                                    
                                    for (int j = i + 1; j < statements.size(); j++) {
                                        Statement nextStmt = statements.get(j);
                                        if (nextStmt instanceof ExpressionStmt) {
                                            ExpressionStmt nextExprStmt = (ExpressionStmt) nextStmt;
                                            Expression nextExpr = nextExprStmt.getExpression();
                                            
                                            if (nextExpr instanceof MethodCallExpr) {
                                                MethodCallExpr methodCall = (MethodCallExpr) nextExpr;
                                                Expression scope = methodCall.getScope().orElse(null);
                                                
                                                if (scope instanceof NameExpr &&
                                                    ((NameExpr) scope).getNameAsString().equals(varName)) {
                                                    setterCalls.add(methodCall);
                                                    setterIndices.add(j);
                                                }
                                            }
                                        }
                                    }
                                    
                                    if (!setterCalls.isEmpty()) {
                                        MethodCallExpr configureCall = new MethodCallExpr(
                                            new NameExpr("Flyway"),
                                            "configure"
                                        );
                                        
                                        MethodCallExpr finalCall = configureCall;
                                        for (MethodCallExpr setter : setterCalls) {
                                            String methodName = setter.getNameAsString();
                                            
                                            if (methodName.equals("setClassLoader")) {
                                                continue;
                                            }
                                            
                                            String builderMethodName = methodName;
                                            if (methodName.startsWith("set")) {
                                                builderMethodName = methodName.substring(3);
                                                builderMethodName = Character.toLowerCase(builderMethodName.charAt(0)) 
                                                                    + (builderMethodName.length() > 1 ? builderMethodName.substring(1) : "");
                                            }
                                            
                                            finalCall = new MethodCallExpr(
                                                finalCall,
                                                builderMethodName,
                                                setter.getArguments()
                                            );
                                        }
                                        
                                        MethodCallExpr loadCall = new MethodCallExpr(finalCall, "load");
                                        
                                        variable.setInitializer(loadCall);
                                        
                                        for (int k = setterIndices.size() - 1; k >= 0; k--) {
                                            toRemove.add(setterIndices.get(k));
                                        }
                                        
                                        toRemove.sort((a, b) -> b - a);
                                        for (Integer idx : toRemove) {
                                            statements.remove((int) idx);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
