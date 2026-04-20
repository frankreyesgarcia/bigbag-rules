package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        String sourceCode = Files.readString(Paths.get(filePath));
        CompilationUnit cu = StaticJavaParser.parse(sourceCode);

        cu.accept(new ScriptResultRemover(), null);

        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class ScriptResultRemover extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(CompilationUnit n, Void arg) {
            super.visit(n, arg);
            
            n.getImports().removeIf(importDecl -> 
                importDecl.getNameAsString().equals("com.gargoylesoftware.htmlunit.ScriptResult")
            );
        }

        @Override
        public void visit(VariableDeclarator n, Void arg) {
            super.visit(n, arg);
            
            if (n.getType().asString().equals("ScriptResult")) {
                n.setType("Object");
                
                if (n.getInitializer().isPresent() && 
                    n.getInitializer().get() instanceof ObjectCreationExpr) {
                    ObjectCreationExpr oce = (ObjectCreationExpr) n.getInitializer().get();
                    if (oce.getType().asString().equals("ScriptResult") && 
                        oce.getArguments().size() == 1) {
                        n.setInitializer(oce.getArgument(0));
                    }
                }
            }
        }

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            
            if (n.getNameAsString().equals("getJavaScriptResult")) {
                if (n.getScope().isPresent()) {
                    n.replace(n.getScope().get());
                }
            }
        }
    }
}
