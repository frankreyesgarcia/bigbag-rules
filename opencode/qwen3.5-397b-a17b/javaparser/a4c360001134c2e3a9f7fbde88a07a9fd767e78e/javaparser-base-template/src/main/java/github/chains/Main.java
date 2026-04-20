package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }
        
        String sourceDir = args[0];
        JavaParser javaParser = new JavaParser();
        
        Files.walk(Paths.get(sourceDir))
            .filter(path -> path.toString().endsWith(".java"))
            .forEach(path -> {
                try {
                    transformFile(javaParser, path);
                } catch (Exception e) {
                    System.err.println("Error processing " + path + ": " + e.getMessage());
                }
            });
    }
    
    private static void transformFile(JavaParser javaParser, Path path) throws IOException {
        String source = Files.readString(path);
        ParseResult<CompilationUnit> parseResult = javaParser.parse(source);
        
        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + path);
            return;
        }
        
        CompilationUnit cu = parseResult.getResult().get();
        
        // Transform FilterBuilder.apply() to FilterBuilder.test()
        cu.accept(new FilterBuilderApplyVisitor(), null);
        
        Files.writeString(path, cu.toString());
        System.out.println("Transformed: " + path);
    }
    
    static class FilterBuilderApplyVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr methodCallExpr, Void arg) {
            super.visit(methodCallExpr, arg);
            
            // Check if this is a method call to "apply" 
            if ("apply".equals(methodCallExpr.getNameAsString())) {
                // Check if the scope is a FilterBuilder (chained from include/exclude)
                if (isFilterBuilderCall(methodCallExpr)) {
                    methodCallExpr.setName("test");
                }
            }
        }
        
        private boolean isFilterBuilderCall(MethodCallExpr methodCallExpr) {
            // Check if this is called on a FilterBuilder instance
            // FilterBuilder chains like: new FilterBuilder().include(...).apply(s)
            // or: new FilterBuilder().exclude(...).apply(s)
            if (methodCallExpr.getScope().isPresent()) {
                var scope = methodCallExpr.getScope().get();
                if (scope instanceof MethodCallExpr) {
                    MethodCallExpr scopeCall = (MethodCallExpr) scope;
                    String scopeMethodName = scopeCall.getNameAsString();
                    // FilterBuilder has include() and exclude() methods that return FilterBuilder
                    return "include".equals(scopeMethodName) || "exclude".equals(scopeMethodName);
                }
            }
            return false;
        }
    }
}
