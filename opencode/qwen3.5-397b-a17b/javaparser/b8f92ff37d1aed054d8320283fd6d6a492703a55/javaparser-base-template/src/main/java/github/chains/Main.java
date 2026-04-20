package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
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
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
    }

    private static void transformFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            MethodCallRemovalVisitor visitor = new MethodCallRemovalVisitor();
            visitor.visit(cu, null);
            
            if (visitor.hasChanges()) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Transformed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    static class MethodCallRemovalVisitor extends VoidVisitorAdapter<Void> {
        private boolean hasChanges = false;

        @Override
        public void visit(MethodCallExpr methodCall, Void arg) {
            super.visit(methodCall, arg);
            
            if (isGetWildcardCall(methodCall)) {
                ObjectCreationExpr replacement = new ObjectCreationExpr(
                    null,
                    new com.github.javaparser.ast.type.ClassOrInterfaceType(null, "TestListResolver"),
                    com.github.javaparser.ast.NodeList.nodeList(new com.github.javaparser.ast.expr.StringLiteralExpr(""))
                );
                methodCall.replace(replacement);
                hasChanges = true;
            }
        }

        private boolean isGetWildcardCall(MethodCallExpr methodCall) {
            return "getWildcard".equals(methodCall.getNameAsString()) &&
                   methodCall.getScope()
                           .map(s -> s.toString().equals("TestListResolver"))
                           .orElse(false);
        }

        public boolean hasChanges() {
            return hasChanges;
        }
    }
}
