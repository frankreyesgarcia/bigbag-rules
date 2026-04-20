package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        Path sourcePath = Paths.get(sourceDir);

        Files.walk(sourcePath)
            .filter(path -> path.toString().endsWith(".java"))
            .forEach(path -> {
                try {
                    transformFile(path);
                } catch (Exception e) {
                    System.err.println("Error processing " + path + ": " + e.getMessage());
                    e.printStackTrace();
                }
            });

        System.out.println("Transformation complete.");
    }

    private static void transformFile(Path filePath) throws Exception {
        CompilationUnit cu = StaticJavaParser.parse(filePath);
        new getClassInfoFixVisitor().visit(cu, null);
        Files.writeString(filePath, cu.toString());
        System.out.println("Transformed: " + filePath);
    }

    static class getClassInfoFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr methodCallExpr, Void arg) {
            super.visit(methodCallExpr, arg);

            if ("getClassInfo".equals(methodCallExpr.getNameAsString())) {
                methodCallExpr.getScope().ifPresent(scope -> {
                    if ("coverage".equals(scope.toString())) {
                        Expression replacement = StaticJavaParser.parseExpression("Collections.emptySet()");
                        methodCallExpr.getParentNode().ifPresent(parent -> {
                            parent.replace(methodCallExpr, replacement);
                        });
                    }
                });
            }
        }
    }
}
