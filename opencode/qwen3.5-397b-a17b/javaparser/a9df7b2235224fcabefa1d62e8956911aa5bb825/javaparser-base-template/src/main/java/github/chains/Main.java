package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.ReferenceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Main <input-file> <output-file>");
            System.exit(1);
        }

        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        String sourceCode = Files.readString(inputFile);
        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> result = parser.parse(sourceCode);

        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + result.getProblems());
            System.exit(1);
        }

        CompilationUnit cu = result.getResult().get();

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if ("getProperties".equals(method.getNameAsString())) {
                NodeList<ReferenceType> thrownExceptions = method.getThrownExceptions();
                for (int i = thrownExceptions.size() - 1; i >= 0; i--) {
                    ReferenceType exception = thrownExceptions.get(i);
                    if (exception instanceof ClassOrInterfaceType) {
                        ClassOrInterfaceType cit = (ClassOrInterfaceType) exception;
                        if ("IntrospectionException".equals(cit.getNameAsString())) {
                            thrownExceptions.remove(i);
                        }
                    }
                }

                BlockStmt body = method.getBody().orElseThrow();
                NodeList<Statement> statements = body.getStatements();
                
                for (int i = 0; i < statements.size(); i++) {
                    Statement stmt = statements.get(i);
                    if (stmt instanceof ReturnStmt) {
                        ReturnStmt returnStmt = (ReturnStmt) stmt;
                        Expression expr = returnStmt.getExpression().orElse(null);
                        if (expr instanceof MethodCallExpr) {
                            MethodCallExpr methodCall = (MethodCallExpr) expr;
                            if (methodCall.getScope().isPresent() && 
                                methodCall.getScope().get() instanceof NameExpr &&
                                "super".equals(((NameExpr) methodCall.getScope().get()).getNameAsString())) {
                                
                                TryStmt tryStmt = new TryStmt();
                                BlockStmt tryBlock = new BlockStmt();
                                
                                MethodCallExpr newCall = new MethodCallExpr(
                                    methodCall.getScope().orElse(null),
                                    methodCall.getName(),
                                    methodCall.getArguments()
                                );
                                ReturnStmt innerReturn = new ReturnStmt(newCall);
                                tryBlock.addStatement(innerReturn);
                                
                                tryStmt.setTryBlock(tryBlock);
                                
                                CatchClause catchClause = new CatchClause();
                                Parameter param = new Parameter(
                                    new ClassOrInterfaceType(null, "IntrospectionException"),
                                    new com.github.javaparser.ast.expr.SimpleName("e")
                                );
                                catchClause.setParameter(param);
                                
                                BlockStmt catchBlock = new BlockStmt();
                                ObjectCreationExpr runtimeException = new ObjectCreationExpr(
                                    null,
                                    new ClassOrInterfaceType(null, "RuntimeException"),
                                    new NodeList<>(new StringLiteralExpr("IntrospectionException occurred"))
                                );
                                catchBlock.addStatement(new ThrowStmt(runtimeException));
                                catchClause.setBody(catchBlock);
                                
                                tryStmt.getCatchClauses().add(catchClause);
                                
                                body.replace(stmt, tryStmt);
                            }
                        }
                    }
                }
            }
        });

        Files.writeString(outputFile, cu.toString());
        System.out.println("Transformation complete. Output written to: " + outputFile);
    }
}
