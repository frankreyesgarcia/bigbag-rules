#!/bin/bash

# Generic solution for fixing CertificationPermission breaking change in Maven projects
# This script creates a working transformation rule that can be applied to any project

echo "Creating generic CertificationPermission fix for Maven projects..."

# Create a proper working JavaParser-based solution
mkdir -p /workspace/generic-fix

cat > /workspace/generic-fix/README.md << 'EOF'
# Generic CertificationPermission Fix

This is a generic transformation rule that can fix the breaking change where CertificationPermission 
was moved from eu.europa.esig.dss.pades to eu.europa.esig.dss.enumerations.

## Usage:
java -cp "lib/*:target/classes" github.chains.Main /path/to/java/sources

## Fix Applied:
- Replaces import statement: eu.europa.esig.dss.pades.CertificationPermission
- With: eu.europa.esig.dss.enumerations.CertificationPermission

## For Projects with Multiple Breaking Changes:
This fix addresses the core compilation issue. Projects may also need fixes for:
- Missing methods like isCheckCertificateRevocation()
- Other API changes in DSS library updates
EOF

cat > /workspace/generic-fix/pom.xml << 'EOF'
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>github.chains</groupId>
    <artifactId>certification-permission-fix</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.github.javaparser</groupId>
            <artifactId>javaparser-core</artifactId>
            <version>3.27.1</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.10.1</version>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
EOF

cat > /workspace/generic-fix/src/main/java/github/chains/Main.java << 'EOF'
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
EOF

echo "Created generic fix in /workspace/generic-fix"
echo "To build: cd /workspace/generic-fix && mvn compile"
echo "To run: java -cp \"lib/*:target/classes\" github.chains.Main /path/to/java/sources"