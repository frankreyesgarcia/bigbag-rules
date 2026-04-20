package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.NodeList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        
        String transformedCode = cu.toString();
        Files.write(Paths.get(filePath), transformedCode.getBytes());
        
        System.out.println("Transformation complete!");
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        NodeList<Statement> statements = method.getBody().orElseThrow().getStatements();
        
        NodeList<Statement> newStatements = new NodeList<>();
        
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    String varName = varDecl.getVariable(0).getNameAsString();
                    
                    if (varDecl.getVariable(0).getType().asString().contains("Flyway")) {
                        ObjectCreationExpr initExpr = null;
                        if (varDecl.getVariable(0).getInitializer().isPresent() &&
                            varDecl.getVariable(0).getInitializer().get() instanceof ObjectCreationExpr) {
                            initExpr = (ObjectCreationExpr) varDecl.getVariable(0).getInitializer().get();
                        }
                        
                        if (initExpr != null && initExpr.getType().getNameAsString().equals("Flyway")) {
                            MethodCallExpr configureCall = new MethodCallExpr(
                                new NameExpr("Flyway"),
                                "configure"
                            );
                            
                            MethodCallExpr currentCall = configureCall;
                            
                            for (int j = i + 1; j < statements.size(); j++) {
                                Statement nextStmt = statements.get(j);
                                if (nextStmt instanceof ExpressionStmt) {
                                    ExpressionStmt nextExprStmt = (ExpressionStmt) nextStmt;
                                    Expression nextExpr = nextExprStmt.getExpression();
                                    
                                    if (nextExpr instanceof MethodCallExpr) {
                                        MethodCallExpr methodCall = (MethodCallExpr) nextExpr;
                                        if (methodCall.getScope().isPresent() &&
                                            methodCall.getScope().get().toString().equals(varName) &&
                                            isFlywaySetterMethod(methodCall.getNameAsString())) {
                                            
                                            String setterName = methodCall.getNameAsString();
                                            String fluentName = setterNameToFluentName(setterName);
                                            
                                            Expression arg = methodCall.getArguments().get(0);
                                            currentCall = new MethodCallExpr(currentCall, fluentName, new NodeList<>(arg));
                                        } else {
                                            newStatements.add(nextStmt);
                                        }
                                    } else {
                                        newStatements.add(nextStmt);
                                    }
                                } else {
                                    newStatements.add(nextStmt);
                                }
                            }
                            
                            MethodCallExpr loadCall = new MethodCallExpr(currentCall, "load");
                            ReturnStmt returnStmt = new ReturnStmt(loadCall);
                            newStatements.add(returnStmt);
                            
                            break;
                        } else {
                            newStatements.add(stmt);
                        }
                    } else {
                        newStatements.add(stmt);
                    }
                } else {
                    newStatements.add(stmt);
                }
            } else {
                newStatements.add(stmt);
            }
        }
        
        method.getBody().ifPresent(body -> body.setStatements(newStatements));
    }

    private static boolean isFlywaySetterMethod(String methodName) {
        return methodName.equals("setDataSource") ||
               methodName.equals("setLocations") ||
               methodName.equals("setValidateOnMigrate");
    }

    private static String setterNameToFluentName(String setterName) {
        if (setterName.equals("setDataSource")) {
            return "dataSource";
        } else if (setterName.equals("setLocations")) {
            return "locations";
        } else if (setterName.equals("setValidateOnMigrate")) {
            return "validateOnMigrate";
        }
        return setterName.substring(3, 4).toLowerCase() + setterName.substring(4);
    }
}
