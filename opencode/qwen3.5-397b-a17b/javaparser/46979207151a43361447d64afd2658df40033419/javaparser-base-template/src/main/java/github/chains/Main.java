package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <directory>");
            System.exit(1);
        }

        String directory = args[0];
        JavaParser javaParser = new JavaParser();

        try (Stream<Path> paths = Files.walk(Paths.get(directory))) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     try {
                         fixFile(javaParser, path);
                     } catch (IOException e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        }

        System.out.println("Transformation complete.");
    }

    private static void fixFile(JavaParser javaParser, Path path) throws IOException {
        String content = Files.readString(path);
        ParseResult<CompilationUnit> parseResult = javaParser.parse(content);

        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + path);
            return;
        }

        CompilationUnit cu = parseResult.getResult().get();
        ToStringStrategyFixer fixer = new ToStringStrategyFixer();
        fixer.visit(cu, null);

        String modifiedContent = cu.toString();
        Files.writeString(path, modifiedContent);
        System.out.println("Fixed: " + path);
    }

    static class ToStringStrategyFixer extends ModifierVisitor<Void> {

        @Override
        public Visitable visit(MethodCallExpr methodCall, Void arg) {
            if (isJAXBToStringStrategyGetInstance(methodCall)) {
                NameExpr instanceAccess = new NameExpr("JAXBToStringStrategy.INSTANCE");
                return instanceAccess;
            }
            return super.visit(methodCall, arg);
        }

        private boolean isJAXBToStringStrategyGetInstance(MethodCallExpr methodCall) {
            Expression scope = methodCall.getScope().orElse(null);
            String methodName = methodCall.getNameAsString();

            if (!"getInstance".equals(methodName)) {
                return false;
            }

            if (scope instanceof NameExpr) {
                NameExpr nameExpr = (NameExpr) scope;
                return "JAXBToStringStrategy".equals(nameExpr.getNameAsString());
            }

            return false;
        }
    }
}
