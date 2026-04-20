package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.WildcardType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        String sourceCode = Files.readString(Paths.get(file.getAbsolutePath()));

        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> parseResult = parser.parse(sourceCode);

        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + filePath);
            parseResult.getProblems().forEach(System.err::println);
            System.exit(1);
        }

        CompilationUnit cu = parseResult.getResult().get();

        cu.findAll(VariableDeclarator.class).forEach(variableDeclarator -> {
            Type type = variableDeclarator.getType();
            if (type instanceof ClassOrInterfaceType) {
                fixType((ClassOrInterfaceType) type);
            }
        });

        String fixedCode = cu.toString();
        Files.writeString(Paths.get(file.getAbsolutePath()), fixedCode);
        System.out.println("Fixed file: " + filePath);
    }

    private static void fixType(ClassOrInterfaceType type) {
        if ("ManagedObject".equals(type.getNameAsString()) && type.getTypeArguments().isEmpty()) {
            WildcardType wildcardType = new WildcardType();
            type.setTypeArguments(new NodeList<>(wildcardType));
        }

        if (type.getTypeArguments().isPresent()) {
            type.getTypeArguments().get().forEach(typeArg -> {
                if (typeArg instanceof ClassOrInterfaceType) {
                    fixType((ClassOrInterfaceType) typeArg);
                }
            });
        }
    }
}
