package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
    }

    private static void transformFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            boolean modified = false;

            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();
                if (importName.startsWith("javax.validation")) {
                    String newImportName = importName.replace("javax.validation", "jakarta.validation");
                    importDecl.setName(newImportName);
                    modified = true;
                }
            }

            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Transformed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }
}
