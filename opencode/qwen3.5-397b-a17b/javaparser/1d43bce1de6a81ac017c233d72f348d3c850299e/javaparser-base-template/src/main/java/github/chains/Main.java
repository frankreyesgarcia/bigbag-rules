package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
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
        
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (method.getTypeAsString().equals("Flyway") || method.getType().asString().contains("Flyway")) {
                transformFlywayMethod(method);
            }
        });

        String transformedCode = cu.toString();
        Files.write(Paths.get(filePath), transformedCode.getBytes());
        
        System.out.println("Transformation complete: " + filePath);
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        BlockStmt body = method.getBody().orElseThrow();
        NodeList<Statement> statements = body.getStatements();
        
        VariableDeclarationExpr flywayVarDecl = null;
        List<ExpressionStmt> setterCalls = new ArrayList<>();
        ReturnStmt returnStmt = null;
        
        for (Statement stmt : statements) {
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariable(0).getNameAsString().equals("flyway")) {
                        flywayVarDecl = varDecl;
                        continue;
                    }
                }
                
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    if (methodCall.getScope().isPresent() && 
                        methodCall.getScope().get() instanceof NameExpr) {
                        NameExpr scope = (NameExpr) methodCall.getScope().get();
                        if (scope.getNameAsString().equals("flyway")) {
                            setterCalls.add(exprStmt);
                            continue;
                        }
                    }
                }
            }
            
            if (stmt instanceof ReturnStmt) {
                returnStmt = (ReturnStmt) stmt;
            }
        }
        
        if (flywayVarDecl != null && !setterCalls.isEmpty()) {
            MethodCallExpr configureCall = new MethodCallExpr(
                new NameExpr("Flyway"),
                "configure"
            );
            
            MethodCallExpr finalCall = configureCall;
            
            for (ExpressionStmt setterStmt : setterCalls) {
                MethodCallExpr setterCall = (MethodCallExpr) setterStmt.getExpression();
                String setterName = setterCall.getNameAsString();
                
                if (setterCall.getArguments().size() > 0) {
                    Expression arg = setterCall.getArgument(0);
                    
                    if (setterName.equals("setDataSource")) {
                        finalCall = new MethodCallExpr(finalCall, "dataSource").addArgument(arg);
                    } else if (setterName.equals("setLocations")) {
                        finalCall = new MethodCallExpr(finalCall, "locations").addArgument(arg);
                    } else if (setterName.equals("setValidateOnMigrate")) {
                        finalCall = new MethodCallExpr(finalCall, "validateOnMigrate").addArgument(arg);
                    }
                }
            }
            
            finalCall = new MethodCallExpr(finalCall, "load");
            
            VariableDeclarator declarator = new VariableDeclarator(
                flywayVarDecl.getCommonType(),
                "flyway",
                finalCall
            );
            
            VariableDeclarationExpr newVarDecl = new VariableDeclarationExpr(declarator);
            
            NodeList<Statement> newStatementList = new NodeList<>();
            newStatementList.add(new ExpressionStmt(newVarDecl));
            
            if (returnStmt != null) {
                newStatementList.add(returnStmt);
            }
            
            body.setStatements(newStatementList);
        }
    }
}
