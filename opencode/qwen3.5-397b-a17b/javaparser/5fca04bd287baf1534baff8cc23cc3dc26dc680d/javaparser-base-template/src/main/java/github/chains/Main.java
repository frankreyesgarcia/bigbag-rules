package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Path.of(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
    }

    private static void transformFile(Path path) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(path);
            
            AtomicBoolean modified = new AtomicBoolean(false);
            
            if (cu.getImports().removeIf(
                    imp -> imp.getNameAsString().equals("org.cactoos.io.BytesOf") ||
                           imp.getNameAsString().equals("org.cactoos.text.HexOf"))) {
                modified.set(true);
            }
            
            cu.accept(new HexReplacementVisitor(), null);
            
            if (!cu.getTypes().isEmpty()) {
                cu.getTypes().forEach(type -> {
                    if (!type.getMethods().stream()
                            .anyMatch(m -> m.getNameAsString().equals("bytesToHex"))) {
                        MethodDeclaration hexMethod = type.addMethod("bytesToHex", 
                            com.github.javaparser.ast.Modifier.Keyword.PRIVATE,
                            com.github.javaparser.ast.Modifier.Keyword.STATIC);
                        hexMethod.addParameter("byte[]", "bytes");
                        hexMethod.setType("String");
                        
                        BlockStmt body = new BlockStmt();
                        
                        Statement sbDecl = StaticJavaParser.parseStatement(
                            "StringBuilder sb = new StringBuilder();"
                        );
                        body.addStatement(sbDecl);
                        
                        Statement forLoop = StaticJavaParser.parseStatement(
                            "for (byte b : bytes) { sb.append(String.format(\"%02x\", b)); }"
                        );
                        body.addStatement(forLoop);
                        
                        ReturnStmt returnStmt = new ReturnStmt(
                            StaticJavaParser.parseExpression("sb.toString()")
                        );
                        body.addStatement(returnStmt);
                        
                        hexMethod.setBody(body);
                        modified.set(true);
                    }
                });
            }
            
            if (modified.get()) {
                Files.writeString(path, cu.toString());
                System.out.println("Transformed: " + path);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }

    private static class HexReplacementVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(ObjectCreationExpr expr, Void arg) {
            super.visit(expr, arg);
            
            if (expr.getType().asString().equals("HexOf")) {
                if (expr.getArguments().size() == 1) {
                    Expression inner = expr.getArgument(0);
                    if (inner instanceof ObjectCreationExpr) {
                        ObjectCreationExpr innerExpr = (ObjectCreationExpr) inner;
                        if (innerExpr.getType().asString().equals("BytesOf")) {
                            if (innerExpr.getArguments().size() == 1) {
                                Expression bytesArg = innerExpr.getArgument(0);
                                MethodCallExpr replacement = new MethodCallExpr(
                                    null,
                                    "bytesToHex"
                                );
                                replacement.addArgument(bytesArg);
                                expr.replace(replacement);
                            }
                        }
                    }
                }
            }
        }
        
        @Override
        public void visit(MethodCallExpr expr, Void arg) {
            super.visit(expr, arg);
            
            if (expr.getNameAsString().equals("asString")) {
                Expression scope = expr.getScope().orElse(null);
                if (scope instanceof MethodCallExpr) {
                    MethodCallExpr methodScope = (MethodCallExpr) scope;
                    if (methodScope.getNameAsString().equals("bytesToHex")) {
                        expr.replace(methodScope);
                    }
                }
            }
        }
    }
}
