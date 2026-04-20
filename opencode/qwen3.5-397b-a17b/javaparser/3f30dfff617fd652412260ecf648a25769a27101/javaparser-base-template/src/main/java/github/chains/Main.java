package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        if (!Files.isDirectory(sourceDir)) {
            System.err.println("Error: " + sourceDir + " is not a directory");
            System.exit(1);
        }

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
    }

    private static void transformFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            ImportReplacer visitor = new ImportReplacer();
            cu.accept(visitor, null);
            
            Files.writeString(filePath, cu.toString());
            System.out.println("Transformed: " + filePath);
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    static class ImportReplacer extends ModifierVisitor<Void> {
        @Override
        public com.github.javaparser.ast.Node visit(ImportDeclaration importDecl, Void arg) {
            String name = importDecl.getNameAsString();
            
            if (name.startsWith("javax.interceptor.")) {
                String newName = "jakarta.interceptor." + name.substring("javax.interceptor.".length());
                importDecl.setName(newName);
            } else if ("javax.interceptor".equals(name)) {
                importDecl.setName("jakarta.interceptor");
            } else if ("jakarta.annotation.Priority".equals(name)) {
                importDecl.setName("javax.annotation.Priority");
            } else if ("jakarta.annotation".equals(name)) {
                importDecl.setName("javax.annotation");
            } else if ("jakarta.annotation.Priority".equals(name)) {
                importDecl.setName("javax.annotation.Priority");
            } else if ("jakarta.annotation".equals(name)) {
                importDecl.setName("javax.annotation");
            }
            
            return super.visit(importDecl, arg);
        }
    }
}
