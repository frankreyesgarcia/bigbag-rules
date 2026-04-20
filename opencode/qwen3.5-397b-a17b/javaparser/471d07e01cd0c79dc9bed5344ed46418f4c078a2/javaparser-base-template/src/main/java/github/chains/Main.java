package github.chains;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final List<String> PROBLEMATIC_IMPORTS = Arrays.asList(
        "com.google.api.services.cloudresourcemanager.model.BooleanConstraint",
        "com.google.api.services.cloudresourcemanager.model.Constraint",
        "com.google.api.services.cloudresourcemanager.model.ListConstraint",
        "com.google.api.services.cloudresourcemanager.model.Policy",
        "com.google.api.services.cloudresourcemanager.model.Project"
    );

    private static final List<String> PROBLEMATIC_TYPES = Arrays.asList(
        "BooleanConstraint",
        "Constraint", 
        "ListConstraint",
        "Policy",
        "Project"
    );

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        List<Path> javaFiles = Files.walk(sourceDir)
            .filter(p -> p.toString().endsWith(".java"))
            .collect(Collectors.toList());

        System.out.println("Found " + javaFiles.size() + " Java files to process");

        int fixedCount = 0;
        for (Path javaFile : javaFiles) {
            if (fixFile(javaFile)) {
                fixedCount++;
                System.out.println("Fixed: " + javaFile);
            }
        }

        System.out.println("Fixed " + fixedCount + " files");
    }

    private static boolean fixFile(Path javaFile) throws IOException {
        String content = Files.readString(javaFile);
        
        boolean hasProblematicImport = PROBLEMATIC_IMPORTS.stream()
            .anyMatch(content::contains);
        
        boolean hasProblematicType = PROBLEMATIC_TYPES.stream()
            .anyMatch(type -> content.contains(type));

        if (!hasProblematicImport && !hasProblematicType) {
            return false;
        }

        CompilationUnit cu;
        try {
            cu = StaticJavaParser.parse(javaFile);
        } catch (ParseProblemException e) {
            System.err.println("Skipping unparseable file: " + javaFile);
            return false;
        }

        cu.getImports().removeIf(importDecl -> 
            PROBLEMATIC_IMPORTS.stream()
                .anyMatch(problematic -> importDecl.getNameAsString().equals(problematic))
        );

        cu.accept(new TypeReplacementVisitor(), null);

        Files.writeString(javaFile, cu.toString());
        return true;
    }

    static class TypeReplacementVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(ClassOrInterfaceType type, Void arg) {
            super.visit(type, arg);
            
            String typeName = type.getNameAsString();
            if (PROBLEMATIC_TYPES.contains(typeName)) {
                type.setName("Object");
                type.setTypeArguments(new NodeList<>());
            }
        }

        @Override
        public void visit(FieldDeclaration field, Void arg) {
            super.visit(field, arg);
            
            Type fieldType = field.getElementType();
            if (fieldType.isClassOrInterfaceType()) {
                String typeName = fieldType.asClassOrInterfaceType().getNameAsString();
                if (PROBLEMATIC_TYPES.contains(typeName)) {
                    fieldType.asClassOrInterfaceType().setName("Object");
                    fieldType.asClassOrInterfaceType().setTypeArguments(new NodeList<>());
                }
            }
        }

        @Override
        public void visit(MethodDeclaration method, Void arg) {
            super.visit(method, arg);
            
            Type returnType = method.getType();
            if (returnType.isClassOrInterfaceType()) {
                String typeName = returnType.asClassOrInterfaceType().getNameAsString();
                if (PROBLEMATIC_TYPES.contains(typeName)) {
                    returnType.asClassOrInterfaceType().setName("Object");
                    returnType.asClassOrInterfaceType().setTypeArguments(new NodeList<>());
                }
            }

            for (Parameter param : method.getParameters()) {
                Type paramType = param.getType();
                if (paramType.isClassOrInterfaceType()) {
                    String typeName = paramType.asClassOrInterfaceType().getNameAsString();
                    if (PROBLEMATIC_TYPES.contains(typeName)) {
                        paramType.asClassOrInterfaceType().setName("Object");
                        paramType.asClassOrInterfaceType().setTypeArguments(new NodeList<>());
                    }
                }
            }
        }
    }
}
