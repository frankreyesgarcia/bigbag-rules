package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "/workspace/polyglot-maven/polyglot-yaml/src/main/java/org/sonatype/maven/polyglot/yaml/ModelRepresenter.java";
        String backupFile = inputFile + ".backup";
        
        Path inputPath = Paths.get(inputFile);
        Path backupPath = Paths.get(backupFile);
        
        Files.copy(inputPath, backupPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Backup created: " + backupFile);
        
        String sourceCode = Files.readString(inputPath);
        
        JavaParser javaParser = new JavaParser();
        ParseResult<CompilationUnit> parseResult = javaParser.parse(sourceCode);
        
        if (!parseResult.isSuccessful() || !parseResult.getResult().isPresent()) {
            System.err.println("Failed to parse file: " + parseResult.getProblems());
            return;
        }
        
        CompilationUnit cu = parseResult.getResult().get();
        
        int modifications = 0;
        
        for (MethodDeclaration method : cu.findAll(MethodDeclaration.class)) {
            if ("getProperties".equals(method.getNameAsString()) || 
                "sortTypeWithOrder".equals(method.getNameAsString())) {
                if (method.isThrown("IntrospectionException") || 
                    method.isThrown("java.beans.IntrospectionException")) {
                    method.getThrownExceptions().clear();
                    modifications++;
                    System.out.println("Removed IntrospectionException from method: " + method.getNameAsString());
                }
            }
        }
        
        for (ImportDeclaration importDecl : cu.getImports()) {
            if (importDecl.getNameAsString().equals("java.beans.IntrospectionException")) {
                importDecl.remove();
                modifications++;
                System.out.println("Removed unused import: java.beans.IntrospectionException");
                break;
            }
        }
        
        if (modifications > 0) {
            Files.writeString(inputPath, cu.toString());
            System.out.println("Transformation complete! Modified " + modifications + " element(s).");
        } else {
            System.out.println("No modifications needed.");
            Files.copy(backupPath, inputPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
