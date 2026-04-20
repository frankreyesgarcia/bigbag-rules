package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String OLD_PACKAGE_PREFIX = "net.lingala.zip4j.core.";
    private static final String NEW_PACKAGE_PREFIX = "net.lingala.zip4j.";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        int fixedCount = 0;

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            List<Path> javaFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());

            for (Path javaFile : javaFiles) {
                if (fixImports(javaFile)) {
                    fixedCount++;
                    System.out.println("Fixed: " + javaFile);
                }
            }
        }

        System.out.println("Total files fixed: " + fixedCount);
    }

    private static boolean fixImports(Path javaFile) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(javaFile);
        List<ImportDeclaration> imports = cu.getImports();
        boolean modified = false;

        for (ImportDeclaration importDecl : imports) {
            String nameAsString = importDecl.getNameAsString();
            if (nameAsString.startsWith(OLD_PACKAGE_PREFIX)) {
                String newName = nameAsString.replace(OLD_PACKAGE_PREFIX, NEW_PACKAGE_PREFIX);
                importDecl.setName(newName);
                modified = true;
            }
        }

        if (modified) {
            Files.writeString(javaFile, cu.toString());
        }

        return modified;
    }
}
