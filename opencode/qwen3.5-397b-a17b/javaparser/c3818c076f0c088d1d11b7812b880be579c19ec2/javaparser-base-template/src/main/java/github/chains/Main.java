package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        System.out.println("Processing source directory: " + sourceDir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(p -> p.toString().endsWith(".java"))
                 .filter(p -> !p.toString().contains("/target/"))
                 .forEach(Main::transformFile);
        }

        System.out.println("Transformation complete!");
    }

    private static void transformFile(Path filePath) {
        try {
            System.out.println("Processing: " + filePath);
            
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            AtomicBoolean modified = new AtomicBoolean(false);

            // Fix: Change javax.validation.Valid to jakarta.validation.Valid
            cu.getImports().stream()
              .filter(importDecl -> importDecl.getNameAsString().equals("javax.validation.Valid"))
              .forEach(importDecl -> {
                  importDecl.setName("jakarta.validation.Valid");
                  modified.set(true);
              });

            // Also check for any other javax.validation imports
            cu.getImports().stream()
              .filter(importDecl -> importDecl.getNameAsString().startsWith("javax.validation."))
              .forEach(importDecl -> {
                  String newName = importDecl.getNameAsString().replace("javax.validation.", "jakarta.validation.");
                  importDecl.setName(newName);
                  modified.set(true);
              });

            if (modified.get()) {
                Files.writeString(filePath, cu.toString());
                System.out.println("  -> Fixed javax.validation imports");
            }

        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }
}
