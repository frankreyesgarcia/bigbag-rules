package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
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

        CompilationUnit cu = StaticJavaParser.parse(file);

        new FixAddEnabledLanguagesVisitor().visit(cu, null);

        Files.writeString(Paths.get(filePath), cu.toString());
        
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class FixAddEnabledLanguagesVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            
            if ("addEnabledLanguages".equals(n.getNameAsString()) || "setEnabledLanguages".equals(n.getNameAsString())) {
                n.remove();
            }
        }
    }
}
