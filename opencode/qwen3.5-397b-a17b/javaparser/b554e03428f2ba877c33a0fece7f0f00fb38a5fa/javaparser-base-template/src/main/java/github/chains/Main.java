package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NullLiteralExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private static final String OLD_IMPORT = "org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder";
    private static final String NEW_IMPORT = "org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file>");
            System.exit(1);
        }

        String sourceFile = args[0];
        File file = new File(sourceFile);

        if (!file.exists()) {
            System.err.println("File not found: " + sourceFile);
            System.exit(1);
        }

        String originalContent = Files.readString(Paths.get(sourceFile));
        CompilationUnit cu = StaticJavaParser.parse(originalContent);

        ImportReplacer importReplacer = new ImportReplacer();
        importReplacer.visit(cu, null);

        ConstructorReplacer constructorReplacer = new ConstructorReplacer();
        constructorReplacer.visit(cu, null);

        String transformedContent = cu.toString();
        Files.writeString(Paths.get(sourceFile), transformedContent);

        System.out.println("Transformation complete: " + sourceFile);
        System.out.println("  Replaced import: " + OLD_IMPORT);
        System.out.println("  With import: " + NEW_IMPORT);
    }

    private static class ImportReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(CompilationUnit cu, Void arg) {
            super.visit(cu, arg);

            cu.getImports().stream()
                .filter(imp -> imp.getNameAsString().equals(OLD_IMPORT))
                .findFirst()
                .ifPresent(oldImport -> {
                    int importIndex = cu.getImports().indexOf(oldImport);
                    cu.getImports().remove(importIndex);
                    cu.addImport(NEW_IMPORT, false, false);
                });
        }
    }

    private static class ConstructorReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodDeclaration method, Void arg) {
            super.visit(method, arg);

            if (method.getNameAsString().equals("setGraph")) {
                method.findAll(MethodCallExpr.class).forEach(methodCall -> {
                    if (methodCall.getNameAsString().equals("orElse")) {
                        methodCall.setArgument(0, new NullLiteralExpr());
                    }
                });
            }
        }
    }
}
