package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * JavaParser transformation to fix JAXBToStringStrategy compatibility issues.
 * 
 * Problem: jaxb2-basics plugin 0.13.1 generates code calling JAXBToStringStrategy.getInstance()
 * but jaxb2-basics-runtime 1.11.1 doesn't have this static method.
 * 
 * Solution: Replace JAXBToStringStrategy.getInstance() with new JAXBToStringStrategy()
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        int[] count = {0};
        transformDirectory(sourceDir, count);
        System.out.println("Transformed " + count[0] + " files");
    }

    public static void transformDirectory(String directoryPath, int[] count) throws IOException {
        Path dir = Paths.get(directoryPath);
        
        try (Stream<Path> paths = Files.walk(dir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(p -> {
                     transformFile(p, count);
                 });
        }
    }

    public static void transformFile(Path filePath, int[] count) {
        try {
            String content = Files.readString(filePath);
            
            if (!content.contains("JAXBToStringStrategy.getInstance()")) {
                return;
            }

            CompilationUnit cu = StaticJavaParser.parse(filePath);
            boolean modified = false;

            var methodCalls = cu.findAll(MethodCallExpr.class);
            for (MethodCallExpr methodCall : methodCalls) {
                if (isJAXBToStringStrategyGetInstance(methodCall)) {
                    ObjectCreationExpr creationExpr = new ObjectCreationExpr();
                    creationExpr.setType("JAXBToStringStrategy");
                    
                    methodCall.replace(creationExpr);
                    modified = true;
                }
            }

            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Transformed: " + filePath);
                count[0]++;
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    private static boolean isJAXBToStringStrategyGetInstance(MethodCallExpr methodCall) {
        if (!"getInstance".equals(methodCall.getNameAsString())) {
            return false;
        }

        var scope = methodCall.getScope();
        if (scope.isPresent()) {
            String scopeStr = scope.get().toString();
            return "JAXBToStringStrategy".equals(scopeStr);
        }

        return false;
    }
}
