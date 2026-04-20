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
                transformFlywayMethod(method);
            }
        });
        
        Files.write(Paths.get(filePath), cu.toString().getBytes());
        System.out.println("Transformation complete: " + filePath);
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        List<Statement> statementsToRemove = new ArrayList<>();
        ReturnStmt newReturnStmt = null;
        int insertIndex = -1;

        if (method.getBody().isPresent()) {
            List<Statement> statements = method.getBody().get().getStatements();
            
            Expression dataSourceArg = null;
            Expression classLoaderArg = null;
            Expression locationsArg = null;
            Expression validateArg = null;

            for (int i = 0; i < statements.size(); i++) {
                Statement stmt = statements.get(i);
                
                if (stmt instanceof ExpressionStmt) {
                    ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                    Expression innerExpr = exprStmt.getExpression();
                    
                    if (innerExpr instanceof VariableDeclarationExpr) {
                        VariableDeclarationExpr varDecl = (VariableDeclarationExpr) innerExpr;
                        for (VariableDeclarator var : varDecl.getVariables()) {
                            if (var.getInitializer().isPresent() && 
                                var.getInitializer().get() instanceof ObjectCreationExpr) {
                                ObjectCreationExpr creation = (ObjectCreationExpr) var.getInitializer().get();
                                if ("Flyway".equals(creation.getType().asString())) {
                                    statementsToRemove.add(stmt);
                                    insertIndex = i;
                                    break;
                                }
                            }
                        }
                    }
                    
                    if (innerExpr instanceof MethodCallExpr) {
                        MethodCallExpr methodCall = (MethodCallExpr) innerExpr;
                        if (methodCall.getScope().isPresent()) {
                            Expression scope = methodCall.getScope().get();
                            if (scope instanceof NameExpr && 
                                "flyway".equals(((NameExpr) scope).getNameAsString())) {
                                String methodName = methodCall.getNameAsString();
                                if (methodName.equals("setDataSource") && methodCall.getArguments().size() > 0) {
                                    dataSourceArg = methodCall.getArgument(0);
                                    statementsToRemove.add(stmt);
                                } else if (methodName.equals("setClassLoader") && methodCall.getArguments().size() > 0) {
                                    classLoaderArg = methodCall.getArgument(0);
                                    statementsToRemove.add(stmt);
                                } else if (methodName.equals("setLocations") && methodCall.getArguments().size() > 0) {
                                    locationsArg = methodCall.getArgument(0);
                                    statementsToRemove.add(stmt);
                                } else if (methodName.equals("setValidateOnMigrate") && methodCall.getArguments().size() > 0) {
                                    validateArg = methodCall.getArgument(0);
                                    statementsToRemove.add(stmt);
                                }
                            }
                        }
                    }
                }
                
                if (stmt instanceof ReturnStmt) {
                    ReturnStmt returnStmt = (ReturnStmt) stmt;
                    if (returnStmt.getExpression().isPresent() &&
                        returnStmt.getExpression().get() instanceof NameExpr) {
                        NameExpr returnExpr = (NameExpr) returnStmt.getExpression().get();
                        if ("flyway".equals(returnExpr.getNameAsString())) {
                            MethodCallExpr loadCall = new MethodCallExpr(null, "load");
                            MethodCallExpr validateCall = new MethodCallExpr(loadCall, "validateOnMigrate", 
                                new NodeList<>(validateArg));
                            MethodCallExpr locationsCall = new MethodCallExpr(validateCall, "locations", 
                                new NodeList<>(locationsArg));
                            MethodCallExpr classLoaderCall = new MethodCallExpr(locationsCall, "classListLoader", 
                                new NodeList<>(classLoaderArg));
                            MethodCallExpr dataSourceCall = new MethodCallExpr(classLoaderCall, "dataSource", 
                                new NodeList<>(dataSourceArg));
                            MethodCallExpr configureCall = new MethodCallExpr(new NameExpr("Flyway"), "configure");
                            dataSourceCall.setScope(configureCall);
                            
                            newReturnStmt = new ReturnStmt(dataSourceCall);
                            statementsToRemove.add(stmt);
                        }
                    }
                }
            }

            if (insertIndex >= 0 && newReturnStmt != null) {
                for (Statement stmt : statementsToRemove) {
                    statements.remove(stmt);
                }
                
                statements.add(insertIndex, newReturnStmt);
            }
        }
    }
}
