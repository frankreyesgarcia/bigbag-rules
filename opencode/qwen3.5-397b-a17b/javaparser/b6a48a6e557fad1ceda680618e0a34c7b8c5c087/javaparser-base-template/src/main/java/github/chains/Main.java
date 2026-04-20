package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
            if ("flyway".equals(method.getNameAsString())) {
                transformFlywayMethod(method);
            }
        });

        String transformedCode = cu.toString();
        Files.write(file.toPath(), transformedCode.getBytes());
        
        System.out.println("Transformation complete: " + filePath);
    }

    private static void transformFlywayMethod(MethodDeclaration method) {
        BlockStmt body = method.getBody().orElseThrow();
        List<Statement> statements = new ArrayList<>(body.getStatements());
        
        int flywayVarIndex = -1;
        String flywayVarName = null;
        List<Integer> setterIndices = new ArrayList<>();
        int returnIndex = -1;
        
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    if (methodCall.getScope().isPresent()) {
                        Expression scope = methodCall.getScope().get();
                        if (scope instanceof NameExpr && flywayVarName != null &&
                            ((NameExpr) scope).getNameAsString().equals(flywayVarName)) {
                            setterIndices.add(i);
        }
    }
}
            } else if (stmt instanceof ReturnStmt) {
                ReturnStmt returnStmt = (ReturnStmt) stmt;
                if (returnStmt.getExpression().isPresent()) {
                    Expression retExpr = returnStmt.getExpression().get();
                    if (retExpr instanceof NameExpr && flywayVarName != null &&
                        ((NameExpr) retExpr).getNameAsString().equals(flywayVarName)) {
                        returnIndex = i;
                    }
                }
            }
            
            if (stmt.toString().contains("Flyway") && stmt.toString().contains("new Flyway()")) {
                flywayVarIndex = i;
                String stmtStr = stmt.toString();
                int varStart = stmtStr.indexOf("Flyway") + 7;
                int varEnd = stmtStr.indexOf("=", varStart);
                if (varEnd > varStart) {
                    flywayVarName = stmtStr.substring(varStart, varEnd).trim();
                }
            }
        }
        
        if (flywayVarIndex == -1 || flywayVarName == null) {
            return;
        }
        
        List<MethodCallExpr> setterCalls = new ArrayList<>();
        for (int idx : setterIndices) {
            ExpressionStmt exprStmt = (ExpressionStmt) statements.get(idx);
            setterCalls.add((MethodCallExpr) exprStmt.getExpression());
        }
        
        StringBuilder fluentCode = new StringBuilder();
        fluentCode.append("return Flyway.configure()");
        
        for (MethodCallExpr setter : setterCalls) {
            String setterName = setter.getNameAsString();
            String newMethodName = convertSetterToConfigureMethod(setterName);
            if (newMethodName != null) {
                String args = setter.getArguments().toString();
                fluentCode.append("\n            .").append(newMethodName).append("(").append(args.substring(1, args.length() - 1)).append(")");
            }
        }
        
        fluentCode.append("\n            .load();");
        
        List<Statement> newStatements = new ArrayList<>();
        for (int i = 0; i < statements.size(); i++) {
            if (i == flywayVarIndex) {
                Statement newStmt = StaticJavaParser.parseStatement(fluentCode.toString());
                newStatements.add(newStmt);
            } else if (!setterIndices.contains(i) && i != returnIndex) {
                newStatements.add(statements.get(i));
            }
        }
        
        NodeList<Statement> statementList = new NodeList<>();
        for (Statement stmt : newStatements) {
            statementList.add(stmt);
        }
        body.setStatements(statementList);
    }

    private static String convertSetterToConfigureMethod(String setterName) {
        switch (setterName) {
            case "setDataSource":
                return "dataSource";
            case "setClassLoader":
                return null;
            case "setLocations":
                return "locations";
            case "setValidateOnMigrate":
                return "validateOnMigrate";
            default:
                return setterName.substring(3, 4).toLowerCase() + setterName.substring(4);
        }
    }
}
