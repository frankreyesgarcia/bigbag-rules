package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Path.of(args[0]);
        String sourceCode = Files.readString(filePath);

        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> parseResult = parser.parse(sourceCode);

        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + parseResult.getProblems());
            System.exit(1);
        }

        CompilationUnit cu = parseResult.getResult().get();
        transformFlywayUsage(cu);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation complete: " + filePath);
    }

    public static void transformFlywayUsage(CompilationUnit cu) {
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (method.getTypeAsString().equals("org.flywaydb.core.Flyway") || 
                method.getTypeAsString().equals("Flyway")) {
                
                if (!method.getBody().isPresent()) {
                    return;
                }
                
                List<Statement> statements = method.getBody().get().getStatements();
                List<Statement> newStatements = new ArrayList<>();
                
                List<ExpressionStmt> setterCalls = new ArrayList<>();
                ReturnStmt returnStmt = null;
                boolean hasFlywayCreation = false;
                
                for (Statement stmt : statements) {
                    if (stmt instanceof ExpressionStmt) {
                        ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                        Expression expr = exprStmt.getExpression();
                        
                        if (expr instanceof VariableDeclarationExpr) {
                            VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                            if (varDecl.getElementType().asString().endsWith("Flyway")) {
                                if (varDecl.getVariable(0).getInitializer().isPresent() &&
                                    varDecl.getVariable(0).getInitializer().get() instanceof ObjectCreationExpr) {
                                    ObjectCreationExpr creation = (ObjectCreationExpr) varDecl.getVariable(0).getInitializer().get();
                                    if (creation.getType().asString().endsWith("Flyway")) {
                                        hasFlywayCreation = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        
                        if (expr instanceof MethodCallExpr) {
                            MethodCallExpr methodCall = (MethodCallExpr) expr;
                            if (isFlywaySetter(methodCall) && !shouldSkipSetter(methodCall.getNameAsString())) {
                                setterCalls.add(exprStmt);
                                continue;
                            }
                        }
                        
                        newStatements.add(stmt);
                    } else if (stmt instanceof ReturnStmt) {
                        returnStmt = (ReturnStmt) stmt;
                    } else {
                        newStatements.add(stmt);
                    }
                }
                
                if (hasFlywayCreation && !setterCalls.isEmpty() && returnStmt != null) {
                    MethodCallExpr configureCall = new MethodCallExpr(
                        new NameExpr("Flyway"),
                        "configure"
                    );
                    
                    MethodCallExpr chainedCall = configureCall;
                    for (ExpressionStmt setter : setterCalls) {
                        MethodCallExpr setterCall = (MethodCallExpr) setter.getExpression();
                        String setterName = setterCall.getNameAsString();
                        String builderName = setterName.substring(3);
                        builderName = Character.toLowerCase(builderName.charAt(0)) + builderName.substring(1);
                        
                        chainedCall = new MethodCallExpr(
                            chainedCall,
                            builderName,
                            setterCall.getArguments()
                        );
                    }
                    
                    MethodCallExpr loadCall = new MethodCallExpr(chainedCall, "load");
                    ReturnStmt newReturn = new ReturnStmt(loadCall);
                    newStatements.add(newReturn);
                    
                    method.getBody().get().setStatements(new NodeList<>(newStatements));
                }
            }
        });
    }

    private static boolean isFlywaySetter(MethodCallExpr methodCall) {
        String name = methodCall.getNameAsString();
        return name.equals("setDataSource") ||
               name.equals("setClassLoader") ||
               name.equals("setLocations") ||
               name.equals("setValidateOnMigrate") ||
               name.equals("setBaselineOnMigrate") ||
               name.equals("setBaselineVersion") ||
               name.equals("setCleanDisabled") ||
               name.equals("setEncoding") ||
               name.equals("setGroup") ||
               name.equals("setIgnoreMissingMigrations") ||
               name.equals("setIgnoreIgnoredMigrations") ||
               name.equals("setIgnoreFutureMigrations") ||
               name.equals("setInstalledBy") ||
               name.equals("setInitSql") ||
               name.equals("setLockRetryCount") ||
               name.equals("setMixed") ||
               name.equals("setOutOfOrder") ||
               name.equals("setPlaceholderReplacement") ||
               name.equals("setPlaceholders") ||
               name.equals("setPlaceholderPrefix") ||
               name.equals("setPlaceholderSeparator") ||
               name.equals("setPlaceholderSuffix") ||
               name.equals("setRepeatableSqlMigrationPrefix") ||
               name.equals("setResolvers") ||
               name.equals("setSkipDefaultCallbacks") ||
               name.equals("setSkipDefaultResolvers") ||
               name.equals("setSqlMigrationPrefix") ||
               name.equals("setSqlMigrationSuffixes") ||
               name.equals("setTable") ||
               name.equals("setTablespace") ||
               name.equals("setTarget") ||
               name.equals("setValidateMigrationNaming") ||
               name.equals("setValidateTimestampFormat") ||
               name.equals("setWorkingDirectory");
    }

    private static boolean shouldSkipSetter(String setterName) {
        return setterName.equals("setClassLoader");
    }
}
