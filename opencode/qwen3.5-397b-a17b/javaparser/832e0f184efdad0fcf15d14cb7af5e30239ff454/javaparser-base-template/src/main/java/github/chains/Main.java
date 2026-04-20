package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        System.out.println("Processing directory: " + sourceDir);

        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::processFile);
        }

        System.out.println("Transformation complete!");
    }

    private static void processFile(Path path) {
        try {
            System.out.println("Processing: " + path);
            
            CompilationUnit cu = StaticJavaParser.parse(path);
            
            new ParseEnchantmentFixVisitor().visit(cu, null);
            
            Files.writeString(path, cu.toString());
            System.out.println("  Fixed: " + path);
            
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class ParseEnchantmentFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr methodCall, Void arg) {
            super.visit(methodCall, arg);
            
            String methodName = methodCall.getNameAsString();
            Expression scope = methodCall.getScope().orElse(null);
            
            if (scope instanceof MethodCallExpr) {
                MethodCallExpr scopeMethod = (MethodCallExpr) scope;
                String scopeName = scopeMethod.getNameAsString();
                
                if (("parseEnchantment".equals(methodName) || "getEnchantment".equals(methodName) || "get".equals(methodName))
                    && "get".equals(scopeName)) {
                    methodCall.setName("getEnchant");
                    System.out.println("  Replaced " + methodName + "() with getEnchant() at line " + 
                        methodCall.getBegin().map(p -> p.line).orElse(0));
                }
            }
        }
    }
}
