package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        CompilationUnit cu = StaticJavaParser.parse(file);
        
        new RemoveAddEnabledLanguagesVisitor().visit(cu, null);
        
        String modifiedCode = cu.toString();
        Files.write(Paths.get(filePath), modifiedCode.getBytes());
        
        System.out.println("Transformation applied successfully to: " + filePath);
    }
    
    static class RemoveAddEnabledLanguagesVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr methodCallExpr, Void arg) {
            super.visit(methodCallExpr, arg);
            
            if ("addEnabledLanguages".equals(methodCallExpr.getNameAsString())) {
                Optional<Expression> scope = methodCallExpr.getScope();
                if (scope.isPresent()) {
                    methodCallExpr.replace(scope.get());
                }
            }
        }
    }
}
