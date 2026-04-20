package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    private static final String BYTEBUDDY_PACKAGE = "org.assertj.core.internal.bytebuddy";

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Main <source-directory> <action>");
            System.err.println("  action: 'remove' to delete files with ByteBuddy imports");
            System.exit(1);
        }

        String sourceDir = args[0];
        String action = args[1];

        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     try {
                         processFile(parser, path, action);
                     } catch (IOException e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        }
    }

    private static void processFile(JavaParser parser, Path path, String action) throws IOException {
        ParseResult<CompilationUnit> result = parser.parse(path);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            return;
        }

        CompilationUnit cu = result.getResult().get();
        
        boolean hasByteBuddyImport = cu.getImports().stream()
            .anyMatch(importDecl -> hasByteBuddyImport(importDecl));

        if (hasByteBuddyImport) {
            if ("remove".equals(action)) {
                Files.delete(path);
                System.out.println("Removed: " + path);
            } else if ("list".equals(action)) {
                System.out.println("Has ByteBuddy import: " + path);
            }
        }
    }

    private static boolean hasByteBuddyImport(ImportDeclaration importDecl) {
        String name = importDecl.getNameAsString();
        return name.startsWith(BYTEBUDDY_PACKAGE);
    }
}
