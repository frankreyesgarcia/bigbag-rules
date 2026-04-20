package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.ThrowStmt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "/workspace/license-maven-plugin/license-maven-plugin/src/main/java/com/mycila/maven/plugin/license/dependencies/MavenProjectLicenses.java";
        
        Path filePath = Paths.get(sourceFile);
        CompilationUnit cu = StaticJavaParser.parse(filePath);
        AtomicBoolean modified = new AtomicBoolean(false);
        
        // Remove the problematic import
        cu.getImports().stream()
          .filter(importDecl -> importDecl.getNameAsString()
              .equals("org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder"))
          .findFirst()
          .ifPresent(importDecl -> {
              importDecl.remove();
              modified.set(true);
          });
        
        // Find and fix the setGraph method
        cu.findAll(MethodDeclaration.class).stream()
          .filter(method -> method.getNameAsString().equals("setGraph"))
          .forEach(method -> {
              method.getBody().ifPresent(body -> {
                  body.getStatements().stream()
                      .filter(stmt -> stmt.toString().contains("Maven31DependencyGraphBuilder"))
                      .findFirst()
                      .ifPresent(stmt -> {
                          ThrowStmt throwStmt = new ThrowStmt(
                              new ObjectCreationExpr()
                                  .setType("IllegalStateException")
                                  .addArgument("\"DependencyGraphBuilder cannot be null\"")
                          );
                          stmt.replace(throwStmt);
                          modified.set(true);
                      });
              });
          });
        
        if (modified.get()) {
            Files.writeString(filePath, cu.toString());
            System.out.println("Fixed: " + filePath);
        }
    }
}
