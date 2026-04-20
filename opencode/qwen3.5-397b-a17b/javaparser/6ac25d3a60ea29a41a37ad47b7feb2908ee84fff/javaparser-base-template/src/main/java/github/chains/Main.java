package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::processFile);
        }
    }

    private static void processFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            cu.getImports().removeIf(importDecl -> 
                importDecl.getNameAsString().equals("jakarta.servlet.http.HttpSessionContext"));
            
            HttpSessionContextRemover remover = new HttpSessionContextRemover();
            cu.accept(remover, null);
            remover.removeMethods();
            
            Files.writeString(filePath, cu.toString());
            System.out.println("Processed: " + filePath);
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e);
            e.printStackTrace();
        }
    }

    private static class HttpSessionContextRemover extends VoidVisitorAdapter<Void> {
        private final List<MethodDeclaration> methodsToRemove = new ArrayList<>();

        @Override
        public void visit(MethodDeclaration method, Void arg) {
            super.visit(method, arg);
            
            if ("getSessionContext".equals(method.getNameAsString())) {
                methodsToRemove.add(method);
            }
        }

        public void removeMethods() {
            methodsToRemove.forEach(MethodDeclaration::remove);
        }
    }
}
