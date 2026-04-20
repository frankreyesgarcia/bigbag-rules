package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
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

        new ScriptResultRemoverVisitor().visit(cu, null);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class ScriptResultRemoverVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(CompilationUnit cu, Void arg) {
            cu.getImports().removeIf(importDecl -> 
                importDecl.getNameAsString().equals("com.gargoylesoftware.htmlunit.ScriptResult")
            );
            super.visit(cu, arg);
        }

        @Override
        public void visit(VariableDeclarator vd, Void arg) {
            if (vd.getTypeAsString().equals("ScriptResult")) {
                vd.getParentNode().ifPresent(parent -> {
                    if (parent instanceof VariableDeclarationExpr) {
                        parent.remove();
                    }
                });
            }
            super.visit(vd, arg);
        }

        @Override
        public void visit(MethodCallExpr mce, Void arg) {
            if (mce.getNameAsString().equals("getJavaScriptResult")) {
                mce.getScope().ifPresent(scope -> {
                    if (scope instanceof ObjectCreationExpr) {
                        ObjectCreationExpr oce = (ObjectCreationExpr) scope;
                        if (oce.getType().getNameAsString().equals("ScriptResult")) {
                            mce.replace(oce.getArgument(0).clone());
                        }
                    } else if (scope instanceof NameExpr) {
                        NameExpr ne = (NameExpr) scope;
                        if (ne.getNameAsString().startsWith("scriptResult")) {
                            mce.replace(ne.clone());
                        }
                    }
                });
            }
            super.visit(mce, arg);
        }

        @Override
        public void visit(ObjectCreationExpr oce, Void arg) {
            if (oce.getType().getNameAsString().equals("ScriptResult")) {
                oce.getParentNode().ifPresent(parent -> {
                    if (parent instanceof MethodCallExpr) {
                        MethodCallExpr mce = (MethodCallExpr) parent;
                        if (mce.getNameAsString().equals("getJavaScriptResult")) {
                            mce.replace(oce.getArgument(0).clone());
                        }
                    }
                });
            }
            super.visit(oce, arg);
        }
    }
}
