package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Usage: java Main <source-directory>");
            return;
        }

        String sourceDir = args[0];
        Path sourcePath = Paths.get(sourceDir);

        Files.walk(sourcePath)
            .filter(p -> p.toString().endsWith(".java"))
            .forEach(Main::transformFile);

        System.out.println("Transformation complete.");
    }

    private static void transformFile(Path filePath) {
        try {
            String content = Files.readString(filePath);
            JavaParser parser = new JavaParser();
            ParseResult<CompilationUnit> result = parser.parse(content);

            if (result.isSuccessful() && result.getResult().isPresent()) {
                CompilationUnit cu = result.getResult().get();

                JavaVersionFixVisitor visitor = new JavaVersionFixVisitor();
                visitor.visit(cu, null);

                Files.writeString(filePath, cu.toString());
                System.out.println("Transformed: " + filePath);
            }
        } catch (IOException e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    static class JavaVersionFixVisitor extends VoidVisitorAdapter<Void> {

        @Override
        public void visit(MethodDeclaration n, Void arg) {
            super.visit(n, arg);
        }

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
        }
    }
}
