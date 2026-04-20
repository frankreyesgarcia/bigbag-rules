package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            processFile(parser, path);
                        } catch (IOException e) {
                            System.err.println("Error processing " + path + ": " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.err.println("Error walking directory: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Transformation completed successfully.");
    }

    private static void processFile(JavaParser parser, Path path) throws IOException {
        ParseResult<CompilationUnit> result = parser.parse(path);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + path);
            return;
        }

        CompilationUnit cu = result.getResult().get();
        
        SourceCodeTransformer transformer = new SourceCodeTransformer();
        transformer.visit(cu, null);

        Files.writeString(path, cu.toString());
        System.out.println("Processed: " + path);
    }

    static class SourceCodeTransformer extends VoidVisitorAdapter<Void> {

        @Override
        public void visit(ClassOrInterfaceDeclaration node, Void arg) {
            super.visit(node, arg);
            
            if (node.isInterface()) {
                ensureOverrideAnnotations(node);
            }
        }

        @Override
        public void visit(MethodDeclaration node, Void arg) {
            super.visit(node, arg);
            
            addOverrideAnnotation(node);
            ensureFinalParameters(node);
        }

        private void ensureOverrideAnnotations(ClassOrInterfaceDeclaration node) {
            node.getMethods().forEach(this::addOverrideAnnotation);
        }

        private void addOverrideAnnotation(MethodDeclaration method) {
            boolean hasOverride = method.getAnnotations().stream()
                    .anyMatch(a -> a.getNameAsString().equals("Override"));
            
            if (!hasOverride && method.getParameters().isEmpty()) {
                boolean isOverrideCandidate = method.getNameAsString().equals("toString")
                        || method.getNameAsString().equals("equals")
                        || method.getNameAsString().equals("hashCode")
                        || method.getNameAsString().equals("compareTo")
                        || method.getNameAsString().equals("call")
                        || method.getNameAsString().equals("run");
                
                if (isOverrideCandidate) {
                    method.addAnnotation("Override");
                }
            }
        }

        private void ensureFinalParameters(MethodDeclaration method) {
            for (Parameter param : method.getParameters()) {
                if (!param.isFinal()) {
                    param.addModifier(com.github.javaparser.ast.Modifier.Keyword.FINAL);
                }
            }
        }
    }
}
