package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        System.out.println("Transforming Java files in: " + sourceDir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }

        System.out.println("Transformation complete.");
    }

    private static void transformFile(Path filePath) {
        try {
            System.out.println("Processing: " + filePath);
            
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            boolean modified = false;

            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();
                
                if (importName.startsWith("io.dropwizard.") && 
                    !importName.startsWith("io.dropwizard.core.")) {
                    
                    String newImportName = "io.dropwizard.core." + importName.substring("io.dropwizard.".length());
                    importDecl.setName(newImportName);
                    modified = true;
                    System.out.println("  Updated import: " + importName + " -> " + newImportName);
                }
            }

            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("  Saved: " + filePath);
            }

        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
