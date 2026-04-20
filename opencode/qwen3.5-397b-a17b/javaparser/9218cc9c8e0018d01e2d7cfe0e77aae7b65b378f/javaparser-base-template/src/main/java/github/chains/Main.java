package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <directory>");
            System.exit(1);
        }

        Path rootDir = Paths.get(args[0]);
        List<Path> javaFiles = Files.walk(rootDir)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        int modifiedCount = 0;
        for (Path javaFile : javaFiles) {
            if (transformFile(javaFile)) {
                modifiedCount++;
                System.out.println("Transformed: " + javaFile);
            }
        }

        System.out.println("Total files transformed: " + modifiedCount);
    }

    private static boolean transformFile(Path javaFile) throws IOException {
        String originalContent = Files.readString(javaFile);
        CompilationUnit cu = StaticJavaParser.parse(javaFile);

        boolean modified = false;
        List<ImportDeclaration> imports = cu.getImports();
        for (ImportDeclaration importDecl : imports) {
            String name = importDecl.getNameAsString();
            if (name.startsWith("jakarta.validation")) {
                String newName = name.replace("jakarta.validation", "javax.validation");
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
