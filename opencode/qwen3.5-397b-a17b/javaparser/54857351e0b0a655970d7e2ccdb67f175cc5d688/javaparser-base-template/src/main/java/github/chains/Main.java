package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        transformDirectory(sourceDir);
    }

    public static void transformDirectory(Path sourceDir) throws IOException {
        Files.walk(sourceDir)
                .filter(path -> path.toString().endsWith(".java"))
                .filter(path -> !path.toString().contains("/target/"))
                .forEach(Main::transformFile);
    }

    public static void transformFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            boolean modified = false;

            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();

                if ("net.lingala.zip4j.core.ZipFile".equals(importName)) {
                    importDecl.setName("net.lingala.zip4j.ZipFile");
                    modified = true;
                }
            }

            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Fixed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }
}
