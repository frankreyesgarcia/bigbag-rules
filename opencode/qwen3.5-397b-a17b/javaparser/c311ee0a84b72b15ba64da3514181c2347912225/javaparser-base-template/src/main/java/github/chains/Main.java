package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <directory>");
            System.exit(1);
        }

        Path directory = Path.of(args[0]);
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(directory)) {
            List<Path> javaFiles = paths
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

            for (Path file : javaFiles) {
                fixFile(parser, file);
            }
        }

        System.out.println("Transformation complete!");
    }

    private static void fixFile(JavaParser parser, Path file) throws IOException {
        String content = Files.readString(file);
        ParseResult<CompilationUnit> result = parser.parse(content);

        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + file);
            return;
        }

        CompilationUnit cu = result.getResult().get();
        boolean modified = false;

        List<ObjectCreationExpr> creations = cu.findAll(ObjectCreationExpr.class);
        for (ObjectCreationExpr creation : creations) {
            if (shouldFix(creation)) {
                NodeList<Expression> args = creation.getArguments();
                if (args.size() == 2) {
                    Expression secondArg = args.get(1);
                    args.clear();
                    args.add(secondArg);
                    modified = true;
                    System.out.println("Fixed: " + file + " - " + creation.getType().getNameAsString());
                }
            }
        }

        if (modified) {
            Files.writeString(file, cu.toString());
        }
    }

    private static boolean shouldFix(ObjectCreationExpr creation) {
        String typeName = creation.getType().getNameAsString();
        return "StringContains".equals(typeName) || "StringStartsWith".equals(typeName);
    }
}
