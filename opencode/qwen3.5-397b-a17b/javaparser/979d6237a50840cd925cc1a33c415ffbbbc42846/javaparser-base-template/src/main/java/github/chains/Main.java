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

public class Main {

    private static final String OLD_IMPORT = "org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter";
    private static final String CORRECT_IMPORT = "org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }

        Path path = Paths.get(args[0]);
        if (Files.isDirectory(path)) {
            Files.walk(path)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::fixFile);
        } else {
            fixFile(path);
        }
        System.out.println("Transformation complete.");
    }

    private static void fixFile(Path path) {
        try {
            String content = Files.readString(path);
            if (!content.contains(OLD_IMPORT)) {
                return;
            }

            CompilationUnit cu = StaticJavaParser.parse(path);
            boolean modified = false;

            List<ImportDeclaration> imports = cu.getImports();
            for (ImportDeclaration importDecl : imports) {
                if (importDecl.getNameAsString().equals(OLD_IMPORT)) {
                    importDecl.setName(CORRECT_IMPORT);
                    modified = true;
                    System.out.println("Fixed import in " + path + ": " + OLD_IMPORT + " -> " + CORRECT_IMPORT);
                }
            }

            if (modified) {
                Files.writeString(path, cu.toString());
            }
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }
}
