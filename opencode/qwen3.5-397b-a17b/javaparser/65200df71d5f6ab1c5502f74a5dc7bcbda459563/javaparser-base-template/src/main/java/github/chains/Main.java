package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

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

        new RemoveAddEnabledLanguagesVisitor().visit(cu, null);

        Files.write(Paths.get(filePath), cu.toString().getBytes());
        
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class RemoveAddEnabledLanguagesVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            
            if ("addEnabledLanguages".equals(n.getNameAsString())) {
                Optional<Expression> scope = n.getScope();
                if (scope.isPresent()) {
                    Expression parentScope = scope.get();
                    n.replace(parentScope);
                }
            }
        }
    }
}
