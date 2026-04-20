package github.chains;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.utils.SourceRoot;

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

    private static final Set<String> LOMBOK_ANNOTATIONS = new HashSet<>(Arrays.asList(
        "EqualsAndHashCode", "ToString", "RequiredArgsConstructor",
        "AllArgsConstructor", "NoArgsConstructor", "Data", "Value",
        "Builder", "Getter", "Setter", "SneakyThrows", "NonNull", "Cleanup"
    ));

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java github.chains.Main <sourceDir> <outputDir>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        Path outputDir = Paths.get(args[1]);

        if (!Files.exists(sourceDir)) {
            System.err.println("Source directory does not exist: " + sourceDir);
            System.exit(1);
        }

        Files.createDirectories(outputDir);
        SourceRoot sourceRoot = new SourceRoot(sourceDir);
        
        List<CompilationUnit> compilationUnits = sourceRoot.tryToParse().stream()
            .filter(r -> r.isSuccessful())
            .map(r -> r.getResult().orElse(null))
            .filter(cu -> cu != null)
            .collect(Collectors.toList());
        
        int transformedCount = 0;
        for (CompilationUnit cu : compilationUnits) {
            if (hasLombokAnnotations(cu)) {
                transformCompilationUnit(cu);
                transformedCount++;
            }
        }

        sourceRoot.saveAll(outputDir);
        System.out.println("Total files transformed: " + transformedCount);
    }

    private static boolean hasLombokAnnotations(CompilationUnit cu) {
        return cu.findAll(AnnotationExpr.class).stream()
            .anyMatch(a -> LOMBOK_ANNOTATIONS.contains(a.getNameAsString()));
    }

    private static void transformCompilationUnit(CompilationUnit cu) {
        cu.getImports().removeIf(i -> i.getNameAsString().startsWith("lombok."));

        cu.findAll(ClassOrInterfaceDeclaration.class).forEach(cls -> {
            cls.getAnnotations().removeIf(a -> LOMBOK_ANNOTATIONS.contains(a.getNameAsString()));
            
            cls.findAll(FieldDeclaration.class).forEach(f -> 
                f.getAnnotations().removeIf(a -> LOMBOK_ANNOTATIONS.contains(a.getNameAsString())));
            
            cls.findAll(MethodDeclaration.class).forEach(m -> 
                m.getAnnotations().removeIf(a -> LOMBOK_ANNOTATIONS.contains(a.getNameAsString())));

            List<FieldDeclaration> fields = cls.getFields();
            if (!fields.isEmpty()) {
                addToString(cls, fields);
                addEqualsAndHashCode(cls);
            }
        });
    }

    private static void addToString(ClassOrInterfaceDeclaration cls, List<FieldDeclaration> fields) {
        MethodDeclaration method = cls.addMethod("toString");
        method.setPublic(true);
        method.addAnnotation("Override");
        method.setType("String");
        method.setBody(new com.github.javaparser.ast.stmt.BlockStmt()
            .addStatement(new com.github.javaparser.ast.stmt.ReturnStmt(
                new com.github.javaparser.ast.expr.StringLiteralExpr(cls.getNameAsString() + "()"))));
    }

    private static void addEqualsAndHashCode(ClassOrInterfaceDeclaration cls) {
        MethodDeclaration equals = cls.addMethod("equals");
        equals.setPublic(true);
        equals.addAnnotation("Override");
        equals.setType("boolean");
        equals.addParameter("Object", "o");
        equals.setBody(new com.github.javaparser.ast.stmt.BlockStmt()
            .addStatement(new com.github.javaparser.ast.stmt.ReturnStmt(
                new com.github.javaparser.ast.expr.BooleanLiteralExpr(true))));

        MethodDeclaration hashCode = cls.addMethod("hashCode");
        hashCode.setPublic(true);
        hashCode.addAnnotation("Override");
        hashCode.setType("int");
        hashCode.setBody(new com.github.javaparser.ast.stmt.BlockStmt()
            .addStatement(new com.github.javaparser.ast.stmt.ReturnStmt(
                new com.github.javaparser.ast.expr.IntegerLiteralExpr("0"))));
    }
}
