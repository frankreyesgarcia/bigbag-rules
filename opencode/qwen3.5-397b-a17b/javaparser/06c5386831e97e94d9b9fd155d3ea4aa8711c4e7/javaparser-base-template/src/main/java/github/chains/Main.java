package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.LongLiteralExpr;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        Path sourcePath = Paths.get(sourceDir);

        List<Path> javaFiles = Files.walk(sourcePath)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        for (Path javaFile : javaFiles) {
            try {
                CompilationUnit cu = StaticJavaParser.parse(javaFile);
                
                SerialVersionUIDVisitor visitor = new SerialVersionUIDVisitor();
                visitor.visit(cu, null);
                
                if (visitor.isModified()) {
                    try (FileWriter writer = new FileWriter(javaFile.toFile())) {
                        writer.write(cu.toString());
                    }
                    System.out.println("Modified: " + javaFile);
                }
            } catch (Exception e) {
                System.err.println("Error processing " + javaFile + ": " + e.getMessage());
            }
        }

        System.out.println("Transformation complete.");
    }

    static class SerialVersionUIDVisitor extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        public boolean isModified() {
            return modified;
        }

        @Override
        public void visit(ClassOrInterfaceDeclaration classDecl, Void arg) {
            super.visit(classDecl, arg);

            if (classDecl.isInterface()) {
                return;
            }

            boolean implementsSerializable = classDecl.getImplementedTypes().stream()
                    .anyMatch(t -> t.getNameAsString().equals("Serializable") ||
                                   t.toString().contains("java.io.Serializable"));

            if (!implementsSerializable) {
                return;
            }

            boolean hasSerialVersionUID = classDecl.getFields().stream()
                    .anyMatch(f -> f.getVariables().stream()
                            .anyMatch(v -> v.getNameAsString().equals("serialVersionUID")));

            if (!hasSerialVersionUID) {
                Type longType = PrimitiveType.longType();
                VariableDeclarator declarator = new VariableDeclarator(longType, "serialVersionUID", new LongLiteralExpr("1L"));
                FieldDeclaration fieldDecl = new FieldDeclaration();
                fieldDecl.addModifier(Modifier.Keyword.PRIVATE);
                fieldDecl.addModifier(Modifier.Keyword.STATIC);
                fieldDecl.addModifier(Modifier.Keyword.FINAL);
                fieldDecl.getVariables().add(declarator);

                classDecl.getMembers().add(0, fieldDecl);
                modified = true;
            }
        }
    }
}
