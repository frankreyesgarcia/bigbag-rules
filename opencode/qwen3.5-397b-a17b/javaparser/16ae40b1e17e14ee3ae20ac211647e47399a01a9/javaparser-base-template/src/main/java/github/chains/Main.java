package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }

        Path path = Paths.get(args[0]);
        
        if (Files.isDirectory(path)) {
            Files.walk(path)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::fixImports);
        } else {
            fixImports(path);
        }
        
        System.out.println("Transformation complete!");
    }

    private static void fixImports(Path filePath) {
        try {
            System.out.println("Processing: " + filePath);
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            List<ImportDeclaration> imports = cu.getImports();
            
            for (ImportDeclaration importDecl : imports) {
                String importName = importDecl.getNameAsString();
                
                if (importName.equals("net.lingala.zip4j.core.ZipFile")) {
                    importDecl.setName("net.lingala.zip4j.ZipFile");
                    System.out.println("  Fixed: net.lingala.zip4j.core.ZipFile -> net.lingala.zip4j.ZipFile");
                }
            }
            
            Files.writeString(filePath, cu.toString());
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }
}
