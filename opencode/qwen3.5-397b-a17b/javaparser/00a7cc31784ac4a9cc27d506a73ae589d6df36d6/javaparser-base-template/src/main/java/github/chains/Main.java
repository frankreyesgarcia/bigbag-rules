package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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
                 .forEach(Main::fixFile);
        }
        
        System.out.println("Transformation complete!");
    }

    private static void fixFile(Path path) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(path);
            
            new SSLFilterFixVisitor().visit(cu, null);
            new SetUseClientModeFixVisitor().visit(cu, null);
            new InitiateHandshakeFixVisitor().visit(cu, null);
            new PeerAddressFixVisitor().visit(cu, null);
            
            Files.writeString(path, cu.toString());
            System.out.println("Fixed: " + path);
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }

    private static class SSLFilterFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(ObjectCreationExpr node, Void arg) {
            super.visit(node, arg);
            
            String typeName = node.getType().asString();
            if ("SSLFilter".equals(typeName) || "quickfix.mina.ssl.SSLFilter".equals(typeName)) {
                List<Expression> arguments = node.getArguments();
                if (arguments.size() == 2) {
                    arguments.remove(1);
                }
            }
        }
    }

    private static class SetUseClientModeFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr node, Void arg) {
            super.visit(node, arg);
            
            if ("setUseClientMode".equals(node.getNameAsString())) {
                node.getParentNode()
                    .filter(n -> n instanceof ExpressionStmt)
                    .map(n -> (ExpressionStmt) n)
                    .ifPresent(ExpressionStmt::remove);
            }
        }
    }

    private static class InitiateHandshakeFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr node, Void arg) {
            super.visit(node, arg);
            
            if ("initiateHandshake".equals(node.getNameAsString())) {
                node.getParentNode()
                    .filter(n -> n instanceof ExpressionStmt)
                    .map(n -> (ExpressionStmt) n)
                    .ifPresent(ExpressionStmt::remove);
            }
        }
    }

    private static class PeerAddressFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(MethodCallExpr node, Void arg) {
            super.visit(node, arg);
            
            if ("setAttribute".equals(node.getNameAsString())) {
                List<Expression> args = node.getArguments();
                if (args.size() >= 1) {
                    Expression firstArg = args.get(0);
                    if (firstArg.isNameExpr()) {
                        String name = firstArg.asNameExpr().getNameAsString();
                        if ("PEER_ADDRESS".equals(name)) {
                            node.getParentNode()
                                .filter(n -> n instanceof ExpressionStmt)
                                .map(n -> (ExpressionStmt) n)
                                .ifPresent(ExpressionStmt::remove);
                        }
                    }
                }
            }
        }
    }
}
