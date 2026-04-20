package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("com.gargoylesoftware.htmlunit.ScriptResult"));

        new ScriptResultRemover().visit(cu, null);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation applied to: " + filePath);
    }

    static class ScriptResultRemover extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(VariableDeclarator node, Void arg) {
            super.visit(node, arg);

            if (node.getType().asString().equals("ScriptResult")) {
                Expression initializer = node.getInitializer().orElse(null);
                if (initializer instanceof ObjectCreationExpr) {
                    ObjectCreationExpr creation = (ObjectCreationExpr) initializer;
                    if (creation.getType().asString().equals("ScriptResult")) {
                        node.setType("Object");
                        node.setInitializer(creation.getArgument(0));
                    }
                }
            }

            Expression initializer = node.getInitializer().orElse(null);
            if (initializer instanceof MethodCallExpr) {
                MethodCallExpr methodCall = (MethodCallExpr) initializer;
                if (methodCall.getName().asString().equals("getJavaScriptResult")) {
                    Expression scope = methodCall.getScope().orElse(null);
                    if (scope instanceof ObjectCreationExpr) {
                        ObjectCreationExpr creation = (ObjectCreationExpr) scope;
                        if (creation.getType().asString().equals("ScriptResult")) {
                            node.setInitializer(creation.getArgument(0));
                        }
                    }
                }
            }
        }

        @Override
        public void visit(MethodCallExpr node, Void arg) {
            super.visit(node, arg);

            if (node.getName().asString().equals("getJavaScriptResult")) {
                node.getScope().ifPresent(scope -> node.replace(scope));
            }

            if (node.getName().asString().equals("ScriptResult")) {
                node.getScope().ifPresent(scope -> {
                    if (scope instanceof ObjectCreationExpr) {
                        ObjectCreationExpr creation = (ObjectCreationExpr) scope;
                        if (creation.getType().asString().equals("ScriptResult") && creation.getArguments().size() == 1) {
                            node.replace(creation.getArgument(0));
                        }
                    }
                });
            }
        }

        @Override
        public void visit(ObjectCreationExpr node, Void arg) {
            super.visit(node, arg);

            if (node.getType().asString().equals("ScriptResult")) {
                node.replace(node.getArgument(0));
            }
        }
    }
}
