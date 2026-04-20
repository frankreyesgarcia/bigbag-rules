package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read the source directory
        String sourceDir = args.length > 0 ? args[0] : "/workspace/open-pdf-sign/src/main/java";
        
        System.out.println("Applying CertificationPermission fix to: " + sourceDir);
        
        // Create the transformation visitor
        CertificationPermissionFixVisitor visitor = new CertificationPermissionFixVisitor();
        
        // Process all Java files in the directory
        Files.walk(Paths.get(sourceDir))
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    try {
                        System.out.println("Processing: " + path);
                        CompilationUnit cu = StaticJavaParser.parse(new FileInputStream(path.toFile()));
                        cu.accept(visitor, null);
                        
                        // Save changes back to file
                        try (FileWriter writer = new FileWriter(path.toFile())) {
                            cu.accept(new com.github.javaparser.ast.visitor.VoidVisitorAdapter<Void>() {
                                @Override
                                public void visit(com.github.javaparser.ast.CompilationUnit cu, Void arg) {
                                    try {
                                        cu.toString().writeTo(writer);
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            }, null);
                        }
                    } catch (Exception e) {
                        System.err.println("Error processing " + path + ": " + e.getMessage());
                        e.printStackTrace();
                    }
                });
        
        System.out.println("Fix applied successfully!");
    }
    
    static class CertificationPermissionFixVisitor extends ModifierVisitor<Void> {
        @Override
        public Visitable visit(ImportDeclaration importDeclaration, Void arg) {
            // Check if this is the old import that needs to be replaced
            if (importDeclaration.getNameAsString().equals("eu.europa.esig.dss.pades.CertificationPermission")) {
                // Replace with the new import
                importDeclaration.setName("eu.europa.esig.dss.enumerations.CertificationPermission");
                System.out.println("  Fixed import statement");
            }
            return super.visit(importDeclaration, arg);
        }
    }
}
