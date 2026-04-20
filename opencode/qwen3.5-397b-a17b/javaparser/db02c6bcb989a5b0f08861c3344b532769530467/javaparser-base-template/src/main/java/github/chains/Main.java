package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> transformFile(parser, path));
        }
    }

    private static void transformFile(JavaParser parser, Path path) {
        try {
            String content = Files.readString(path);
            ParseResult<CompilationUnit> result = parser.parse(content);

            if (result.isSuccessful() && result.getResult().isPresent()) {
                CompilationUnit cu = result.getResult().get();

                new HamcrestMatcherFixVisitor().visit(cu, null);

                String transformed = cu.toString();
                if (!transformed.equals(content)) {
                    Files.writeString(path, transformed);
                    System.out.println("Fixed: " + path);
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }

    static class HamcrestMatcherFixVisitor extends VoidVisitorAdapter<Void> {

        @Override
        public void visit(ObjectCreationExpr expr, Void arg) {
            super.visit(expr, arg);

            String typeName = expr.getType().getNameAsString();

            if ("StringContains".equals(typeName) || "StringStartsWith".equals(typeName)) {
                NodeList<Expression> args = expr.getArguments();

                if (args.size() == 2) {
                    Expression firstArg = args.get(0);
                    Expression secondArg = args.get(1);

                    if (isBooleanLiteral(firstArg)) {
                        args.remove(0);
                    }
                }
            }
        }

        private boolean isBooleanLiteral(Expression expr) {
            return expr.toString().equals("true") || expr.toString().equals("false");
        }
    }
}
