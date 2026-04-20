package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <file-to-fix>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(file);

        GetLoggerManagerRemover remover = new GetLoggerManagerRemover();
        remover.visit(cu, null);
        
        List<Node> toRemove = remover.getNodesToRemove();
        for (Node node : toRemove) {
            node.remove();
        }

        Files.write(Paths.get(filePath), cu.toString().getBytes());
        
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class GetLoggerManagerRemover extends VoidVisitorAdapter<Void> {
        private final List<Node> nodesToRemove = new ArrayList<>();

        public List<Node> getNodesToRemove() {
            return nodesToRemove;
        }

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            
            if ("getLoggerManager".equals(n.getNameAsString())) {
                Node parent = n.getParentNode().orElse(null);
                if (parent instanceof ExpressionStmt) {
                    nodesToRemove.add(parent);
                } else if (parent instanceof MethodCallExpr) {
                    Node grandparent = parent.getParentNode().orElse(null);
                    if (grandparent instanceof ExpressionStmt) {
                        nodesToRemove.add(grandparent);
                    }
                }
            }
        }
    }
}
