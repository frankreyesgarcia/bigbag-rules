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
    private static final String OLD_IMPORT = "com.gargoylesoftware.htmlunit.ScriptResult";
    private static final String NEW_IMPORT = "org.htmlunit.ScriptResult";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        transformFile(filePath);
    }

    public static void transformFile(Path filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        boolean modified = false;
        for (ImportDeclaration importDecl : cu.getImports()) {
            if (importDecl.getNameAsString().equals(OLD_IMPORT)) {
                cu.remove(importDecl);
                cu.addImport(NEW_IMPORT);
                modified = true;
                System.out.println("Replaced import: " + OLD_IMPORT + " -> " + NEW_IMPORT);
                break;
            }
        }

        if (modified) {
            Files.writeString(filePath, cu.toString());
            System.out.println("File updated: " + filePath);
        } else {
            System.out.println("No changes needed for: " + filePath);
        }
    }
}
