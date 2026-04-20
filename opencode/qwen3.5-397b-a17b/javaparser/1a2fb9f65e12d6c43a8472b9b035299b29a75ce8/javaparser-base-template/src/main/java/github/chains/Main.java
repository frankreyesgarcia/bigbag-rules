package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }

        Path inputPath = Paths.get(args[0]);
        
        if (Files.isDirectory(inputPath)) {
            Files.walk(inputPath)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::transformFile);
        } else {
            transformFile(inputPath);
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
                if (importName.startsWith("javax.validation")) {
                    String newImportName = importName.replace("javax.validation", "jakarta.validation");
                    importDecl.setName(newImportName);
                    modified = true;
                    System.out.println("  Replaced import: " + importName + " -> " + newImportName);
                }
            }
            
            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("  File updated: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
