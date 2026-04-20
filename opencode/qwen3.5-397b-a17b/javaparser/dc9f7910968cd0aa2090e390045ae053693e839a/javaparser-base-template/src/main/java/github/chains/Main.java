package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
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
        
        CompilationUnit cu = StaticJavaParser.parse(file);
        
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if ("flyway".equals(method.getNameAsString())) {
                fixFlywayMethod(method);
            }
        });
        
        Files.write(Paths.get(filePath), cu.toString().getBytes());
        System.out.println("Transformation complete: " + filePath);
    }

    private static void fixFlywayMethod(MethodDeclaration method) {
        BlockStmt body = method.getBody().orElseThrow();
        List<Statement> statementsToRemove = new ArrayList<>();
        
        NodeList<Statement> stmtList = body.getStatements();
        
        for (int i = 0; i < stmtList.size(); i++) {
            Statement stmt = stmtList.get(i);
            
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariables().size() > 0) {
                        var variable = varDecl.getVariables().get(0);
                        Expression initializer = variable.getInitializer().orElse(null);
                        
                        if (initializer instanceof ObjectCreationExpr) {
                            ObjectCreationExpr creation = (ObjectCreationExpr) initializer;
                            if (creation.getType().asString().equals("org.flywaydb.core.Flyway") ||
                                creation.getType().asString().equals("Flyway")) {
                                String varName = variable.getNameAsString();
                                
                                MethodCallExpr configureCall = new MethodCallExpr(
                                    new NameExpr("Flyway"),
                                    "configure"
                                );
                                
                                for (int j = i + 1; j < stmtList.size(); j++) {
                                    Statement nextStmt = stmtList.get(j);
                                    if (nextStmt instanceof ExpressionStmt) {
                                        Expression nextExpr = ((ExpressionStmt) nextStmt).getExpression();
                                        if (nextExpr instanceof MethodCallExpr) {
                                            MethodCallExpr methodCall = (MethodCallExpr) nextExpr;
                                            Expression scope = methodCall.getScope().orElse(null);
                                            
                                            if (scope instanceof NameExpr && 
                                                ((NameExpr) scope).getNameAsString().equals(varName)) {
                                                String methodName = methodCall.getNameAsString();
                                                String newMethodName = null;
                                                
                                                switch (methodName) {
                                                    case "setDataSource":
                                                        newMethodName = "dataSource";
                                                        break;
                                                    case "setClassLoader":
                                                        newMethodName = null;
                                                        statementsToRemove.add(nextStmt);
                                                        break;
                                                    case "setLocations":
                                                        newMethodName = "locations";
                                                        break;
                                                    case "setValidateOnMigrate":
                                                        newMethodName = "validateOnMigrate";
                                                        break;
                                                }
                                                
                                                if (newMethodName != null) {
                                                    methodCall.setName(newMethodName);
                                                    methodCall.setScope(null);
                                                    configureCall = new MethodCallExpr(configureCall, newMethodName, methodCall.getArguments());
                                                    statementsToRemove.add(nextStmt);
                                                }
                                            }
                                        }
                                    }
                                }
                                
                                configureCall = new MethodCallExpr(configureCall, "load");
                                variable.setInitializer(configureCall);
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        for (Statement stmt : statementsToRemove) {
            stmtList.remove(stmt);
        }
    }
}
