package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        transformFile(filePath);
    }

    public static void transformFile(Path filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        new RemoveAddEnabledLanguagesVisitor().visit(cu, null);

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation complete: " + filePath);
    }

    static class RemoveAddEnabledLanguagesVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);

            if ("addEnabledLanguages".equals(n.getNameAsString())) {
                n.getParentNode().ifPresent(parent -> {
                    if (parent instanceof MethodCallExpr) {
                        MethodCallExpr parentCall = (MethodCallExpr) parent;
                        n.getScope().ifPresent(parentCall::setScope);
                    }
                });
                n.remove();
            }
        }
    }
}
