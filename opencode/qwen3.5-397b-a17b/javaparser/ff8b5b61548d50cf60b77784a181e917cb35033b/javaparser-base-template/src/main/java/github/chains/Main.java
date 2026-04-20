package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    private static final String OLD_IMPORT = "org.mockito.runners.MockitoJUnitRunner";
    private static final String NEW_IMPORT = "org.mockito.junit.MockitoJUnitRunner";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        int[] fixedCount = {0};

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     try {
                         if (fixMockitoImport(path)) {
                             fixedCount[0]++;
                             System.out.println("Fixed: " + path);
                         }
                     } catch (IOException e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        }

        System.out.println("Total files fixed: " + fixedCount[0]);
    }

    private static boolean fixMockitoImport(Path filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(filePath);
        NodeList<ImportDeclaration> imports = cu.getImports();
        
        boolean modified = false;
        for (ImportDeclaration importDecl : imports) {
            String importName = importDecl.getNameAsString();
            if (importName.equals(OLD_IMPORT)) {
                importDecl.setName(NEW_IMPORT);
                modified = true;
            }
        }

        if (modified) {
            Files.writeString(filePath, cu.toString());
        }

        return modified;
    }
}
