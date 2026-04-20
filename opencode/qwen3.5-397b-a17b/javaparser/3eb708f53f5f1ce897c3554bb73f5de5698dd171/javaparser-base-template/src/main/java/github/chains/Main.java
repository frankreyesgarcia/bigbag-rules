package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final Pattern FULLY_QUALIFIED_CLASS_PATTERN = 
        Pattern.compile("com\\.google\\.cloud\\.bigquery\\.connection\\.v1\\.(\\w+)");

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java Main <source-file> <output-file>");
            return;
        }

        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        String sourceCode = Files.readString(inputFile);
        
        CompilationUnit cu = StaticJavaParser.parse(sourceCode);
        
        Set<String> requiredImports = findRequiredImports(sourceCode);
        NodeList<ImportDeclaration> existingImports = cu.getImports();
        Set<String> existingImportNames = new HashSet<>();
        
        for (ImportDeclaration imp : existingImports) {
            existingImportNames.add(imp.getNameAsString());
        }
        
        for (String importName : requiredImports) {
            if (!existingImportNames.contains(importName)) {
                cu.addImport(importName);
                existingImportNames.add(importName);
            }
        }
        
        Files.writeString(outputFile, cu.toString());
        System.out.println("Transformation complete. Output written to: " + outputFile);
    }

    private static Set<String> findRequiredImports(String sourceCode) {
        Set<String> imports = new HashSet<>();
        Matcher matcher = FULLY_QUALIFIED_CLASS_PATTERN.matcher(sourceCode);
        
        while (matcher.find()) {
            String className = matcher.group(1);
            if (isValidClassName(className)) {
                imports.add("com.google.cloud.bigquery.connection.v1." + className);
            }
        }
        
        return imports;
    }

    private static boolean isValidClassName(String className) {
        return className.matches("[A-Z][a-zA-Z0-9_]*");
    }
}
