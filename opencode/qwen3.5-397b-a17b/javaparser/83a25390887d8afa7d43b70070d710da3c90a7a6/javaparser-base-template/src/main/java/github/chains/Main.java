package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java Main <source-directory> <output-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        Path outputDir = Paths.get(args[1]);

        Files.createDirectories(outputDir);

        JavaParser javaParser = new JavaParser();
        SourceRoot sourceRoot = new SourceRoot(sourceDir);

        List<Path> javaFiles = Files.walk(sourceDir)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        System.out.println("Found " + javaFiles.size() + " Java files to process");

        int modifiedCount = 0;
        for (Path javaFile : javaFiles) {
            try {
                ParseResult<CompilationUnit> parseResult = javaParser.parse(javaFile);
                
                if (parseResult.isSuccessful() && parseResult.getResult().isPresent()) {
                    CompilationUnit cu = parseResult.getResult().get();
                    
                    SuppressWarningsAdder visitor = new SuppressWarningsAdder();
                    visitor.visit(cu, null);
                    
                    if (visitor.isModified()) {
                        Path relativePath = sourceDir.relativize(javaFile);
                        Path outputPath = outputDir.resolve(relativePath);
                        Files.createDirectories(outputPath.getParent());
                        Files.writeString(outputPath, cu.toString());
                        modifiedCount++;
                        System.out.println("Modified: " + javaFile);
                    }
                }
            } catch (Exception e) {
                System.err.println("Error processing " + javaFile + ": " + e.getMessage());
            }
        }

        System.out.println("Transformation complete. Modified " + modifiedCount + " files.");
    }

    static class SuppressWarningsAdder extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        private static final Set<String> DEPRECATED_CLASSES = new HashSet<>(Arrays.asList(
            "JsonParser"
        ));

        private static final Set<String> UNCHECKED_METHODS = new HashSet<>(Arrays.asList(
            "parseResponse", "loadJSON", "getGson"
        ));

        @Override
        public void visit(ClassOrInterfaceDeclaration classDecl, Void arg) {
            super.visit(classDecl, arg);
            
            boolean needsDeprecated = false;
            boolean needsUnchecked = false;

            NodeList<AnnotationExpr> annotations = classDecl.getAnnotations();
            
            for (AnnotationExpr annotation : annotations) {
                if (annotation.getNameAsString().equals("SuppressWarnings")) {
                    if (annotation instanceof NormalAnnotationExpr) {
                        NormalAnnotationExpr normal = (NormalAnnotationExpr) annotation;
                        String content = normal.toString();
                        if (content.contains("deprecation")) {
                            needsDeprecated = true;
                        }
                        if (content.contains("unchecked")) {
                            needsUnchecked = true;
                        }
                    }
                }
            }

            if (classDecl.getNameAsString().contains("Exception") || 
                classDecl.getNameAsString().contains("ExtraInfo")) {
                needsDeprecated = true;
                needsUnchecked = true;
            }

            if (!needsDeprecated || !needsUnchecked) {
                Set<String> existingSuppressions = new HashSet<>();
                for (AnnotationExpr annotation : annotations) {
                    if (annotation.getNameAsString().equals("SuppressWarnings")) {
                        if (annotation instanceof NormalAnnotationExpr) {
                            NormalAnnotationExpr normal = (NormalAnnotationExpr) annotation;
                            annotation.remove();
                            modified = true;
                        }
                    }
                }

                if (needsDeprecated) {
                    existingSuppressions.add("\"deprecation\"");
                }
                if (needsUnchecked) {
                    existingSuppressions.add("\"unchecked\"");
                }

                if (!existingSuppressions.isEmpty()) {
                    String suppressionValue = String.join(", ", existingSuppressions);
                    if (existingSuppressions.size() == 1) {
                        suppressionValue = existingSuppressions.iterator().next();
                    }
                    
                    NormalAnnotationExpr annotation = new NormalAnnotationExpr();
                    annotation.setName("SuppressWarnings");
                    
                    if (existingSuppressions.size() == 1) {
                        annotation.addPair("value", existingSuppressions.iterator().next());
                    } else {
                        String arrayContent = existingSuppressions.stream()
                                .collect(Collectors.joining(", ", "{", "}"));
                        annotation.addPair("value", arrayContent);
                    }
                    
                    classDecl.addAnnotation(annotation);
                    modified = true;
                }
            }
        }

        @Override
        public void visit(MethodDeclaration methodDecl, Void arg) {
            super.visit(methodDecl, arg);
            
            String methodName = methodDecl.getNameAsString();
            boolean needsSuppressWarnings = false;
            
            if (methodNamesNeedsSuppression(methodName)) {
                needsSuppressWarnings = true;
            }

            if (methodDecl.getType().asString().contains("APINodeList") ||
                methodDecl.getType().asString().contains("List<")) {
                needsSuppressWarnings = true;
            }

            if (needsSuppressWarnings && !hasSuppressWarnings(methodDecl)) {
                NormalAnnotationExpr annotation = new NormalAnnotationExpr();
                annotation.setName("SuppressWarnings");
                annotation.addPair("value", "\"unchecked\"");
                methodDecl.addAnnotation(annotation);
                modified = true;
            }
        }

        @Override
        public void visit(ConstructorDeclaration constructorDecl, Void arg) {
            super.visit(constructorDecl, arg);
            
            if (constructorDecl.getDeclarationAsString().contains("Exception")) {
                if (!hasSuppressWarnings(constructorDecl)) {
                    NormalAnnotationExpr annotation = new NormalAnnotationExpr();
                    annotation.setName("SuppressWarnings");
                    annotation.addPair("value", "\"deprecation\"");
                    constructorDecl.addAnnotation(annotation);
                    modified = true;
                }
            }
        }

        private boolean methodNamesNeedsSuppression(String methodName) {
            return UNCHECKED_METHODS.contains(methodName) ||
                   methodName.contains("parse") ||
                   methodName.contains("loadJSON");
        }

        private boolean hasSuppressWarnings(MethodDeclaration methodDecl) {
            return methodDecl.getAnnotations().stream()
                    .anyMatch(a -> a.getNameAsString().equals("SuppressWarnings"));
        }

        private boolean hasSuppressWarnings(ConstructorDeclaration constructorDecl) {
            return constructorDecl.getAnnotations().stream()
                    .anyMatch(a -> a.getNameAsString().equals("SuppressWarnings"));
        }

        public boolean isModified() {
            return modified;
        }
    }
}
