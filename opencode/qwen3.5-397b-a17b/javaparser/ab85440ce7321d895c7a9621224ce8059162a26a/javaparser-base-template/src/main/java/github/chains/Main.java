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
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Path.of(args[0]);
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(path -> fixFile(parser, path));
        }
    }

    private static void fixFile(JavaParser parser, Path path) {
        try {
            String content = Files.readString(path);
            ParseResult<CompilationUnit> result = parser.parse(content);

            if (result.isSuccessful() && result.getResult().isPresent()) {
                CompilationUnit cu = result.getResult().get();
                new HamcrestFixVisitor().visit(cu, null);
                String fixed = cu.toString();
                if (!fixed.equals(content)) {
                    Files.writeString(path, fixed);
                    System.out.println("Fixed: " + path);
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }

    private static class HamcrestFixVisitor extends VoidVisitorAdapter<Void> {

        @Override
        public void visit(ObjectCreationExpr node, Void arg) {
            super.visit(node, arg);

            String typeName = node.getType().getNameAsString();
            if ("StringContains".equals(typeName) || "StringStartsWith".equals(typeName)) {
                NodeList<Expression> args = node.getArguments();
                if (args.size() == 2) {
                    Expression secondArg = args.get(1);
                    args.clear();
                    args.add(secondArg);
                }
            }
        }
    }
}
