package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        transformFile(filePath);
    }

    public static void transformFile(Path filePath) throws Exception {
        String content = Files.readString(filePath);
        CompilationUnit cu = StaticJavaParser.parse(content);

        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("com.jcabi.aspects.Tv")
        );

        cu.accept(new TvRemovalVisitor(), null);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformed: " + filePath);
    }

    static class TvRemovalVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(FieldAccessExpr fieldAccessExpr, Void arg) {
            super.visit(fieldAccessExpr, arg);
            
            if (fieldAccessExpr.getScope() instanceof NameExpr) {
                NameExpr scope = (NameExpr) fieldAccessExpr.getScope();
                if (scope.getNameAsString().equals("Tv")) {
                    String fieldName = fieldAccessExpr.getNameAsString();
                    IntegerLiteralExpr replacement = new IntegerLiteralExpr(getTvValue(fieldName));
                    fieldAccessExpr.replace(replacement);
                }
            }
        }

        private int getTvValue(String fieldName) {
            switch (fieldName) {
                case "TWENTY":
                    return 20;
                case "TEN":
                    return 10;
                case "FIVE":
                    return 5;
                case "THREE":
                    return 3;
                case "ONE":
                    return 1;
                case "ZERO":
                    return 0;
                default:
                    return 0;
            }
        }
    }
}
