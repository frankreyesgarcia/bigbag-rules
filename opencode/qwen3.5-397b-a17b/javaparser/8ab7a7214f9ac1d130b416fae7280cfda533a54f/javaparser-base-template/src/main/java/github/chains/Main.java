package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        transformFile(filePath);
    }

    public static void transformFile(Path filePath) throws IOException {
        JavaParser parser = new JavaParser();
        String sourceCode = Files.readString(filePath);
        
        ParseResult<CompilationUnit> parseResult = parser.parse(sourceCode);
        
        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + filePath);
            parseResult.getProblems().forEach(problem -> 
                System.err.println("Parse error: " + problem.getMessage()));
            return;
        }

        CompilationUnit cu = parseResult.getResult().get();
        boolean modified = false;

        List<ImportDeclaration> imports = cu.getImports();
        for (ImportDeclaration importDecl : imports) {
            String importName = importDecl.getNameAsString();
            
            if (importName.startsWith("com.gargoylesoftware.htmlunit")) {
                String newImportName = importName.replace("com.gargoylesoftware.htmlunit", "org.htmlunit");
                importDecl.setName(newImportName);
                modified = true;
                System.out.println("Replaced import: " + importName + " -> " + newImportName);
            }
        }

        if (modified) {
            String transformedCode = cu.toString();
            Files.writeString(filePath, transformedCode);
            System.out.println("File transformed successfully: " + filePath);
        } else {
            System.out.println("No transformations needed for: " + filePath);
        }
    }
}
