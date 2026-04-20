package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.expr.InstanceOfExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * JavaParser transformation to fix MySQL connector compatibility issues.
 * Removes the deprecated MySQLTimeoutException import and instanceof check
 * which was removed in MySQL Connector/J 8.0+.
 */
public class Main {
    private static final String OLD_IMPORT = "com.mysql.jdbc.exceptions.MySQLTimeoutException";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        transformDirectory(sourceDir);
    }

    public static void transformDirectory(Path sourceDir) throws IOException {
        Files.walk(sourceDir)
            .filter(path -> path.toString().endsWith(".java"))
            .forEach(Main::transformFile);
    }

    public static void transformFile(Path javaFile) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile.toFile());
            boolean modified = false;

            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();
                if (importName.equals(OLD_IMPORT) || 
                    importName.equals("com.mysql.cj.exceptions.MySQLTimeoutException")) {
                    importDecl.remove();
                    modified = true;
                }
            }

            cu.findAll(InstanceOfExpr.class).forEach(instanceOf -> {
                if (instanceOf.getType() instanceof ClassOrInterfaceType) {
                    ClassOrInterfaceType type = (ClassOrInterfaceType) instanceOf.getType();
                    if (type.getNameAsString().equals("MySQLTimeoutException")) {
                        instanceOf.replace(new NameExpr("false"));
                    }
                }
            });

            if (modified) {
                simplifyBinaryExpressions(cu);
                Files.writeString(javaFile, cu.toString());
                System.out.println("Fixed: " + javaFile);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + javaFile + ": " + e.getMessage());
        }
    }

    private static void simplifyBinaryExpressions(CompilationUnit cu) {
        cu.findAll(com.github.javaparser.ast.expr.BinaryExpr.class).forEach(expr -> {
            if (expr.getLeft().toString().equals("false")) {
                expr.replace(expr.getRight());
            }
        });
    }
}
