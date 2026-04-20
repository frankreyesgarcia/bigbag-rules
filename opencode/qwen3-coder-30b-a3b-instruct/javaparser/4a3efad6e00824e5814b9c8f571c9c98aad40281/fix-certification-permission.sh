#!/bin/bash

# Generic JavaParser-based fix for CertificationPermission breaking change
# Usage: ./fix-certification-permission.sh <source_directory>

SOURCE_DIR="${1:-/workspace/open-pdf-sign/src/main/java}"

echo "Applying CertificationPermission import fix to $SOURCE_DIR"

# Create a temporary directory for our JavaParser tool
mkdir -p /tmp/javaparser-fix

# Create a simple Java file that fixes the import
cat > /tmp/javaparser-fix/Main.java << 'EOF'
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceDir = args.length > 0 ? args[0] : "/workspace/open-pdf-sign/src/main/java";
        
        CertificationPermissionFixVisitor visitor = new CertificationPermissionFixVisitor();
        
        Files.walk(Paths.get(sourceDir))
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    try {
                        System.out.println("Processing: " + path);
                        CompilationUnit cu = StaticJavaParser.parse(new FileInputStream(path.toFile()));
                        cu.accept(visitor, null);
                        // Save changes back to file
                        cu.toString().writeTo(path.toFile());
                    } catch (Exception e) {
                        System.err.println("Error processing " + path + ": " + e.getMessage());
                    }
                });
    }
    
    static class CertificationPermissionFixVisitor extends ModifierVisitor<Void> {
        @Override
        public Visitable visit(ImportDeclaration importDeclaration, Void arg) {
            if (importDeclaration.getNameAsString().equals("eu.europa.esig.dss.pades.CertificationPermission")) {
                importDeclaration.setName("eu.europa.esig.dss.enumerations.CertificationPermission");
            }
            return super.visit(importDeclaration, arg);
        }
    }
}
EOF

# Create a simple script to compile and run it
cat > /tmp/javaparser-fix/run.sh << 'EOF'
#!/bin/bash
cd /tmp/javaparser-fix
javac -cp "/workspace/javaparser-base-template/target/classes:/workspace/javaparser-base-template/lib/*" Main.java
java -cp "/tmp/javaparser-fix:/workspace/javaparser-base-template/target/classes:/workspace/javaparser-base-template/lib/*" Main "$1"
EOF

chmod +x /tmp/javaparser-fix/run.sh

echo "Created fix script at /tmp/javaparser-fix/run.sh"
echo "Please run: /tmp/javaparser-fix/run.sh $SOURCE_DIR"