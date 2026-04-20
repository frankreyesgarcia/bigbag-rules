package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(file);

        EnableLoggingRemover remover = new EnableLoggingRemover();
        remover.visit(cu, null);
        remover.removeCollectedNodes();

        UnusedImportRemover importRemover = new UnusedImportRemover();
        importRemover.visit(cu, null);
        importRemover.removeCollectedImports();

        Files.write(Paths.get(filePath), cu.toString().getBytes());
        
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class EnableLoggingRemover extends VoidVisitorAdapter<Void> {
        private final List<Node> nodesToRemove = new ArrayList<>();

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            
            if ("enableLogging".equals(n.getNameAsString())) {
                n.getParentNode().ifPresent(parent -> {
                    if (parent instanceof ExpressionStmt) {
                        nodesToRemove.add(parent);
                    }
                });
            }
        }

        public void removeCollectedNodes() {
            for (Node node : nodesToRemove) {
                node.remove();
            }
        }
    }

    static class UnusedImportRemover extends VoidVisitorAdapter<Void> {
        private final List<ImportDeclaration> importsToRemove = new ArrayList<>();

        @Override
        public void visit(CompilationUnit cu, Void arg) {
            super.visit(cu, arg);
            
            for (ImportDeclaration importDecl : cu.getImports()) {
                String name = importDecl.getNameAsString();
                if ("org.codehaus.plexus.logging.Logger".equals(name) ||
                    "org.codehaus.plexus.logging.console.ConsoleLogger".equals(name)) {
                    importsToRemove.add(importDecl);
                }
            }
        }

        public void removeCollectedImports() {
            for (ImportDeclaration importDecl : importsToRemove) {
                importDecl.remove();
            }
        }
    }
}
