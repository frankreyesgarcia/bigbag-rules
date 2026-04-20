package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.printer.PrettyPrinter;

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

        File sourceFile = new File(args[0]);
        CompilationUnit cu = StaticJavaParser.parse(sourceFile);

        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("eu.europa.esig.dss.pades.CertificationPermission")
        );

        List<Node> nodesToRemove = new ArrayList<>();
        
        cu.accept(new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodCallExpr n, Void arg) {
                super.visit(n, arg);
                if (n.getNameAsString().equals("setPermission")) {
                    n.getParentNode().ifPresent(parent -> {
                        if (parent instanceof com.github.javaparser.ast.stmt.ExpressionStmt) {
                            nodesToRemove.add(parent);
                        }
                    });
                }
            }
        }, null);

        for (Node node : nodesToRemove) {
            node.remove();
        }

        PrettyPrinter prettyPrinter = new PrettyPrinter();
        String modifiedCode = prettyPrinter.print(cu);
        Files.write(Paths.get(args[0]), modifiedCode.getBytes());
        
        System.out.println("Transformation applied successfully to " + args[0]);
    }
}
