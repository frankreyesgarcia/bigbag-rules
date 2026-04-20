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
import java.util.stream.Stream;

public class Main {

    private static final String[][] IMPORT_MAPPINGS = {
        {"javax.mvc.", "jakarta.mvc."},
        {"javax.mvc.binding.", "jakarta.mvc.binding."},
        {"javax.mvc.event.", "jakarta.mvc.event."},
        {"javax.mvc.locale.", "jakarta.mvc.locale."},
        {"javax.mvc.security.", "jakarta.mvc.security."},
        {"javax.enterprise.", "jakarta.enterprise."},
        {"javax.inject.", "jakarta.inject."},
        {"javax.ws.rs.", "jakarta.ws.rs."},
        {"javax.validation.", "jakarta.validation."},
        {"javax.annotation.", "jakarta.annotation."},
        {"javax.ejb.", "jakarta.ejb."},
    };

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> transformFile(parser, path));
        }
    }

    private static void transformFile(JavaParser parser, Path path) {
        try {
            String content = Files.readString(path);
            ParseResult<CompilationUnit> result = parser.parse(content);

            if (result.isSuccessful() && result.getResult().isPresent()) {
                CompilationUnit cu = result.getResult().get();
                boolean modified = false;

                List<ImportDeclaration> imports = cu.getImports();
                for (ImportDeclaration importDecl : imports) {
                    String importName = importDecl.getNameAsString();
                    String newImportName = transformImport(importName);
                    if (!newImportName.equals(importName)) {
                        importDecl.setName(newImportName);
                        modified = true;
                    }
                }

                if (modified) {
                    Files.writeString(path, cu.toString());
                    System.out.println("Transformed: " + path);
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing file: " + path + " - " + e.getMessage());
        }
    }

    private static String transformImport(String importName) {
        for (String[] mapping : IMPORT_MAPPINGS) {
            if (importName.startsWith(mapping[0])) {
                return mapping[1] + importName.substring(mapping[0].length());
            }
        }
        return importName;
    }
}
