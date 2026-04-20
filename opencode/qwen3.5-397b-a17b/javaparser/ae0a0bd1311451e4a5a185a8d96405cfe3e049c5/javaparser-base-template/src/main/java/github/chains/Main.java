package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
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
            List<Path> javaFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());

            for (Path javaFile : javaFiles) {
                try {
                    ParseResult<CompilationUnit> parseResult = parser.parse(javaFile);
                    if (parseResult.isSuccessful() && parseResult.getResult().isPresent()) {
                        CompilationUnit cu = parseResult.getResult().get();
                        boolean modified = fixHamcrestConstructors(cu);
                        if (modified) {
                            Files.writeString(javaFile, cu.toString());
                            System.out.println("Fixed: " + javaFile);
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error processing " + javaFile + ": " + e.getMessage());
                }
            }
        }
    }

    private static boolean fixHamcrestConstructors(CompilationUnit cu) {
        boolean modified = false;
        List<ObjectCreationExpr> objectCreations = cu.findAll(ObjectCreationExpr.class);

        for (ObjectCreationExpr oce : objectCreations) {
            ClassOrInterfaceType type = oce.getType();
            String typeName = type.getNameAsString();

            if ("StringContains".equals(typeName) || "StringStartsWith".equals(typeName)) {
                NodeList<Expression> arguments = oce.getArguments();
                if (arguments.size() == 2) {
                    Expression secondArg = arguments.get(1);
                    NodeList<Expression> newArgs = new NodeList<>();
                    newArgs.add(secondArg);
                    oce.setArguments(newArgs);
                    modified = true;
                }
            }
        }

        return modified;
    }
}
