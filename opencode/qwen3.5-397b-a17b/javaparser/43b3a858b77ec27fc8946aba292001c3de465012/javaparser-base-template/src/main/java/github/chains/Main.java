package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

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

        String sourceDir = args[0];
        JavaParser parser = new JavaParser();

        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     try {
                         transformFile(parser, path);
                     } catch (IOException e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        }
    }

    private static void transformFile(JavaParser parser, Path path) throws IOException {
        String content = Files.readString(path);
        ParseResult<CompilationUnit> parseResult = parser.parse(content);

        if (parseResult.isSuccessful() && parseResult.getResult().isPresent()) {
            CompilationUnit cu = parseResult.getResult().get();

            new RootLoggerNameReplacer().visit(cu, null);
            new ImportReplacer().visit(cu, null);

            String transformed = cu.toString();
            if (!transformed.equals(content)) {
                Files.writeString(path, transformed);
                System.out.println("Transformed: " + path);
            }
        } else {
            parseResult.getProblems().forEach(problem ->
                System.err.println("Parse error in " + path + ": " + problem.getMessage())
            );
        }
    }

    static class RootLoggerNameReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(FieldAccessExpr fieldAccess, Void arg) {
            super.visit(fieldAccess, arg);

            if ("ROOT_LOGGER_NAME".equals(fieldAccess.getName().asString())) {
                Expression scope = fieldAccess.getScope();
                if (scope instanceof NameExpr) {
                    NameExpr nameExpr = (NameExpr) scope;
                    if ("Logger".equals(nameExpr.getName().asString())) {
                        StringLiteralExpr replacement = new StringLiteralExpr("ROOT");
                        fieldAccess.replace(replacement);
                        System.out.println("Replaced Logger.ROOT_LOGGER_NAME with \"ROOT\"");
                    }
                }
            }
        }
    }

    static class ImportReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(CompilationUnit cu, Void arg) {
            super.visit(cu, arg);

            cu.getImports().stream()
              .filter(importDecl -> "org.slf4j.LoggerFactory".equals(importDecl.getNameAsString()))
              .findFirst()
              .ifPresent(importDecl -> {
                  importDecl.setName("ch.qos.logback.classic.LoggerFactory");
                  System.out.println("Replaced import org.slf4j.LoggerFactory with ch.qos.logback.classic.LoggerFactory");
              });
        }
    }
}
