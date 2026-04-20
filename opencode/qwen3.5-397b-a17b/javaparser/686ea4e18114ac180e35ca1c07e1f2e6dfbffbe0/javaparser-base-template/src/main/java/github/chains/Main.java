package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    private static final String[] JAVAX_PREFIXES = {
        "javax.ws.rs.",
        "javax.servlet.",
        "javax.inject.",
        "javax.validation.",
        "javax.persistence.",
        "javax.transaction.",
        "javax.jms.",
        "javax.mail.",
        "javax.security.",
        "javax.naming.",
        "javax.management.",
        "javax.imageio.",
        "javax.sound.",
        "javax.swing.",
        "javax.net.",
        "javax.print.",
        "javax.sql.",
        "javax.accessibility.",
        "javax.activity.",
        "javax.batch.",
        "javax.cache.",
        "javax.crypto.",
        "javax.decorator.",
        "javax.directory.",
        "javax.enterprise.",
        "javax.faces.",
        "javax.interceptor.",
        "javax.jws.",
        "javax.resource.",
        "javax.script.",
        "javax.smartcardio.",
        "javax.tools.",
        "javax.transaction.",
        "javax.websocket.",
        "javax.xml.bind.",
        "javax.xml.ws.",
        "javax.xml.soap."
    };

    private static final String[] EXCLUDED_PREFIXES = {
        "javax.annotation.",
        "javax.xml."
    };

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        int[] fileCount = {0};
        int[] modifiedCount = {0};

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     fileCount[0]++;
                     try {
                         if (transformFile(path)) {
                             modifiedCount[0]++;
                             System.out.println("Modified: " + path);
                         }
                     } catch (Exception e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        }

        System.out.println("\nProcessed " + fileCount[0] + " files, modified " + modifiedCount[0] + " files.");
    }

    private static boolean transformFile(Path path) throws IOException {
        String content = Files.readString(path);
        
        CompilationUnit cu;
        try {
            cu = StaticJavaParser.parse(content);
        } catch (Exception e) {
            System.err.println("Parse error in " + path + ": " + e.getMessage());
            return false;
        }

        NodeList<ImportDeclaration> imports = cu.getImports();
        boolean modified = false;

        for (ImportDeclaration importDecl : imports) {
            String importName = importDecl.getNameAsString();
            String newImportName = convertJavaxToJakarta(importName);
            
            if (!newImportName.equals(importName)) {
                importDecl.setName(newImportName);
                modified = true;
            }
        }

        if (modified) {
            String transformed = cu.toString();
            Files.writeString(path, transformed);
        }

        return modified;
    }

    private static String convertJavaxToJakarta(String importName) {
        for (String excluded : EXCLUDED_PREFIXES) {
            if (importName.startsWith(excluded)) {
                return importName;
            }
        }
        
        if (importName.startsWith("jakarta.annotation.")) {
            return "javax" + importName.substring(7);
        }
        
        for (String prefix : JAVAX_PREFIXES) {
            if (importName.startsWith(prefix)) {
                return "jakarta" + importName.substring(5);
            }
        }
        
        if (importName.startsWith("javax.")) {
            return "jakarta" + importName.substring(5);
        }
        
        return importName;
    }
}
