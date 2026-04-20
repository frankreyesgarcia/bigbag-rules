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
            System.err.println("Usage: java github.chains.Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        if (!Files.isDirectory(sourceDir)) {
            System.err.println("Error: " + sourceDir + " is not a directory");
            System.exit(1);
        }

        int[] modifiedCount = {0};
        int[] errorCount = {0};

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(p -> {
                     try {
                         if (transformFile(p)) {
                             modifiedCount[0]++;
                             System.out.println("Transformed: " + p);
                         }
                     } catch (Exception e) {
                         errorCount[0]++;
                         System.err.println("Error processing " + p + ": " + e.getMessage());
                     }
                 });
        }

        System.out.println("Transformation complete. Modified: " + modifiedCount[0] + ", Errors: " + errorCount[0]);
    }

    private static boolean transformFile(Path filePath) throws IOException {
        String content = Files.readString(filePath);
        
        boolean modified = false;
        
        if (content.contains("javax.jws")) {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();
                if (importName.startsWith("javax.jws")) {
                    String jakartaImport = importName.replace("javax.jws", "jakarta.jws");
                    importDecl.setName(jakartaImport);
                    modified = true;
                }
            }
            
            if (modified) {
                Files.writeString(filePath, cu.toString());
            }
        }
        
        return modified;
    }
}
