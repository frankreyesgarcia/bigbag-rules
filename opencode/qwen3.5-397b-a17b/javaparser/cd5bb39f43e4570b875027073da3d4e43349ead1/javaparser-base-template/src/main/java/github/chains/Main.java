package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final String PROBLEMATIC_IMPORT = "org.codehaus.plexus.util.xml.Xpp3Dom";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser javaParser = new JavaParser();

        List<Path> javaFiles = Files.walk(sourceDir)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        System.out.println("Scanning for problematic imports...");
        int foundCount = 0;
        for (Path file : javaFiles) {
            if (checkFile(javaParser, file)) {
                foundCount++;
                System.out.println("Found problematic import in: " + file);
            }
        }

        System.out.println("\nFiles with problematic import: " + foundCount);
        System.out.println("\nFix: Add the following dependency to pom.xml:");
        System.out.println("<dependency>");
        System.out.println("    <groupId>org.codehaus.plexus</groupId>");
        System.out.println("    <artifactId>plexus-xml</artifactId>");
        System.out.println("    <version>3.0.0</version>");
        System.out.println("</dependency>");
    }

    private static boolean checkFile(JavaParser javaParser, Path file) throws IOException {
        String content = Files.readString(file);
        ParseResult<CompilationUnit> parseResult = javaParser.parse(content);

        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            return false;
        }

        CompilationUnit cu = parseResult.getResult().get();
        NodeList<ImportDeclaration> imports = cu.getImports();
        
        for (ImportDeclaration importDecl : imports) {
            String importName = importDecl.getNameAsString();
            if (importName.equals(PROBLEMATIC_IMPORT)) {
                return true;
            }
        }

        return false;
    }
}
