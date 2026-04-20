package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.LongLiteralExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    
    public static void main(String[] args) throws IOException {
        String sourceDir = "/workspace/code-coverage-api-plugin/plugin/src/main/java";
        JavaParser parser = new JavaParser();
        
        int iteration = 0;
        while (true) {
            iteration++;
            System.out.println("Iteration " + iteration);
            
            Set<String> serializableClasses = new HashSet<>();
            final boolean[] fileModified = {false};
            
            try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
                paths.filter(Files::isRegularFile)
                     .filter(p -> p.toString().endsWith(".java"))
                     .forEach(p -> {
                         try {
                             collectSerializableClasses(parser, p, serializableClasses);
                         } catch (IOException e) {
                             System.err.println("Error: " + e.getMessage());
                         }
                     });
            }
            
            try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
                paths.filter(Files::isRegularFile)
                     .filter(p -> p.toString().endsWith(".java"))
                     .forEach(p -> {
                         try {
                             if (processFile(parser, p, serializableClasses)) {
                                 fileModified[0] = true;
                             }
                         } catch (IOException e) {
                             System.err.println("Error: " + e.getMessage());
                         }
                     });
            }
            
            if (!fileModified[0]) {
                break;
            }
        }
        
        System.out.println("Transformation complete after " + iteration + " iterations!");
    }
    
    private static void collectSerializableClasses(JavaParser parser, Path filePath, Set<String> serializableClasses) throws IOException {
        String content = Files.readString(filePath);
        ParseResult<CompilationUnit> result = parser.parse(content);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            return;
        }
        
        CompilationUnit cu = result.getResult().get();
        
        for (ClassOrInterfaceDeclaration classDecl : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (isSerializable(classDecl, serializableClasses)) {
                String qualifiedName = classDecl.getFullyQualifiedName().orElse(classDecl.getNameAsString());
                serializableClasses.add(qualifiedName);
                serializableClasses.add(classDecl.getNameAsString());
            }
        }
    }
    
    private static boolean processFile(JavaParser parser, Path filePath, Set<String> serializableClasses) throws IOException {
        String content = Files.readString(filePath);
        ParseResult<CompilationUnit> result = parser.parse(content);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            return false;
        }
        
        CompilationUnit cu = result.getResult().get();
        boolean modified = false;
        
        for (ClassOrInterfaceDeclaration classDecl : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (!classDecl.isInterface() && isSerializable(classDecl, serializableClasses) && !hasSerialVersionUID(classDecl)) {
                addSerialVersionUID(classDecl);
                modified = true;
            }
        }
        
        if (modified) {
            Files.writeString(filePath, cu.toString());
            System.out.println("Modified: " + filePath);
        }
        
        return modified;
    }
    
    private static boolean implementsSerializable(ClassOrInterfaceDeclaration classDecl) {
        for (ClassOrInterfaceType implementedType : classDecl.getImplementedTypes()) {
            if ("Serializable".equals(implementedType.getNameAsString())) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isSerializable(ClassOrInterfaceDeclaration classDecl, Set<String> serializableClasses) {
        if (implementsSerializable(classDecl)) {
            return true;
        }
        
        for (ClassOrInterfaceType extendedType : classDecl.getExtendedTypes()) {
            String extendedName = extendedType.getNameAsString();
            if (serializableClasses.contains(extendedName) || 
                "Exception".equals(extendedName) || 
                "RuntimeException".equals(extendedName)) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean hasSerialVersionUID(ClassOrInterfaceDeclaration classDecl) {
        return classDecl.findAll(FieldDeclaration.class).stream()
            .anyMatch(field -> field.getVariables().stream()
                .anyMatch(var -> "serialVersionUID".equals(var.getNameAsString())));
    }
    
    private static void addSerialVersionUID(ClassOrInterfaceDeclaration classDecl) {
        FieldDeclaration field = classDecl.addFieldWithInitializer(
            new ClassOrInterfaceType(null, "long"),
            "serialVersionUID",
            new LongLiteralExpr("1L")
        );
        field.addModifier(Modifier.Keyword.PRIVATE);
        field.addModifier(Modifier.Keyword.STATIC);
        field.addModifier(Modifier.Keyword.FINAL);
    }
}
