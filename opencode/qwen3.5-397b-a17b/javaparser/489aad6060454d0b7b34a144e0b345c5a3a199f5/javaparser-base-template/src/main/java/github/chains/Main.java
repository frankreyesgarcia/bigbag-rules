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

        String sourceCode = Files.readString(Paths.get(filePath));
        CompilationUnit cu = StaticJavaParser.parse(sourceCode);

        boolean modified = transformFlywayUsage(cu);

        if (modified) {
            Files.writeString(Paths.get(filePath), cu.toString());
            System.out.println("Transformation applied successfully to: " + filePath);
        } else {
            System.out.println("No transformations needed for: " + filePath);
        }
    }

    public static boolean transformFlywayUsage(CompilationUnit cu) {
        boolean modified = false;

        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
        
        for (MethodDeclaration method : methods) {
            if (method.getNameAsString().equals("flyway") && 
                method.getTypeAsString().contains("Flyway")) {
                
                if (transformFlywayMethod(method)) {
                    modified = true;
                }
            }
        }

        return modified;
    }

    private static boolean transformFlywayMethod(MethodDeclaration method) {
        if (!method.getBody().isPresent()) {
            return false;
        }

        BlockStmt body = method.getBody().get();
        List<Statement> statements = body.getStatements();
        
        int flywayVarIndex = -1;
        String flywayVarName = null;
        List<Integer> setterIndices = new ArrayList<>();
        int returnIndex = -1;

        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                
                if (expr instanceof VariableDeclarationExpr) {
                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                    if (varDecl.getVariables().size() == 1) {
                        var varVar = varDecl.getVariable(0);
                        if (varVar.getTypeAsString().contains("Flyway") && 
                            varVar.getInitializer().isPresent() &&
                            varVar.getInitializer().get() instanceof ObjectCreationExpr) {
                            ObjectCreationExpr init = (ObjectCreationExpr) varVar.getInitializer().get();
                            if (init.getType().asString().contains("Flyway") && 
                                init.getArguments().isEmpty()) {
                                flywayVarIndex = i;
                                flywayVarName = varVar.getNameAsString();
                            }
                        }
                    }
                } else if (expr instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                    if (isFlywaySetter(methodCall, flywayVarName)) {
                        setterIndices.add(i);
                    }
                }
            } else if (stmt instanceof ReturnStmt) {
                ReturnStmt returnStmt = (ReturnStmt) stmt;
                if (returnStmt.getExpression().isPresent() &&
                    returnStmt.getExpression().get() instanceof NameExpr) {
                    NameExpr nameExpr = (NameExpr) returnStmt.getExpression().get();
                    if (nameExpr.getNameAsString().equals(flywayVarName)) {
                        returnIndex = i;
                    }
                }
            }
        }

        if (flywayVarIndex == -1 || setterIndices.isEmpty() || returnIndex == -1) {
            return false;
        }

        List<Statement> newStatements = new ArrayList<>();
        
        for (int i = 0; i < statements.size(); i++) {
            if (i == flywayVarIndex) {
                newStatements.add(createFlywayConfigureStatement(setterIndices, statements));
            } else if (i == returnIndex) {
            } else if (setterIndices.contains(i)) {
            } else {
                newStatements.add(statements.get(i));
            }
        }

        body.setStatements(new NodeList<>(newStatements));
        return true;
    }

    private static boolean isFlywaySetter(MethodCallExpr methodCall, String expectedVarName) {
        if (expectedVarName == null) {
            return false;
        }
        
        Expression scope = methodCall.getScope().orElse(null);
        if (scope instanceof NameExpr) {
            NameExpr nameExpr = (NameExpr) scope;
            String methodName = methodCall.getNameAsString();
            return nameExpr.getNameAsString().equals(expectedVarName) &&
                   (methodName.equals("setDataSource") ||
                    methodName.equals("setLocations") ||
                    methodName.equals("setValidateOnMigrate"));
        }
        return false;
    }

    private static Statement createFlywayConfigureStatement(List<Integer> setterIndices, List<Statement> statements) {
        MethodCallExpr configureCall = new MethodCallExpr(null, "configure");
        configureCall.setScope(new NameExpr("Flyway"));

        MethodCallExpr currentCall = configureCall;

        for (Integer setterIndex : setterIndices) {
            Statement stmt = statements.get(setterIndex);
            if (stmt instanceof ExpressionStmt) {
                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                Expression expr = exprStmt.getExpression();
                if (expr instanceof MethodCallExpr) {
                    MethodCallExpr setterCall = (MethodCallExpr) expr;
                    String setterName = setterCall.getNameAsString();
                    String newMethodName = setterName.substring(3, 4).toLowerCase() + setterName.substring(4);
                    
                    MethodCallExpr newCall = new MethodCallExpr(currentCall, newMethodName);
                    newCall.setArguments(setterCall.getArguments());
                    
                    currentCall = newCall;
                }
            }
        }

        MethodCallExpr loadCall = new MethodCallExpr(currentCall, "load");
        
        return new ReturnStmt(loadCall);
    }
}
