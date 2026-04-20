package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.ArrayAccessExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.EnclosedExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        List<Path> javaFiles = Files.walk(sourceDir)
            .filter(p -> p.toString().endsWith(".java"))
            .collect(Collectors.toList());

        for (Path file : javaFiles) {
            try {
                CompilationUnit cu = StaticJavaParser.parse(file);
                CactoosRemovalVisitor visitor = new CactoosRemovalVisitor();
                visitor.visit(cu, null);

                if (visitor.hasChanges()) {
                    Files.writeString(file, cu.toString());
                    System.out.println("Fixed: " + file);
                }
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }
    }

    static class CactoosRemovalVisitor extends VoidVisitorAdapter<Void> {

        private boolean hasChanges = false;
        private boolean needsHelperMethod = false;

        public boolean hasChanges() {
            return hasChanges;
        }

        @Override
        public void visit(CompilationUnit cu, Void arg) {
            NodeList<ImportDeclaration> imports = cu.getImports();
            imports.removeIf(imp -> {
                String name = imp.getNameAsString();
                if ("org.cactoos.io.BytesOf".equals(name) || "org.cactoos.text.HexOf".equals(name)) {
                    hasChanges = true;
                    return true;
                }
                return false;
            });
            super.visit(cu, arg);
        }

        @Override
        public void visit(ClassOrInterfaceDeclaration node, Void arg) {
            super.visit(node, arg);
            if (needsHelperMethod) {
                node.addMethod("bytesToHex", Modifier.Keyword.PRIVATE, Modifier.Keyword.STATIC);
                MethodDeclaration method = node.getMethodsByName("bytesToHex").get(0);
                method.setType("String");
                method.addParameter(new ClassOrInterfaceType(null, "byte[]"), "bytes");

                StringBuilder code = new StringBuilder();
                code.append("{\n");
                code.append("    StringBuilder sb = new StringBuilder();\n");
                code.append("    for (byte b : bytes) {\n");
                code.append("        sb.append(String.format(\"%02x\", b));\n");
                code.append("    }\n");
                code.append("    return sb.toString();\n");
                code.append("}");

                method.setBody(StaticJavaParser.parseBlock(code.toString()));
                hasChanges = true;
            }
            needsHelperMethod = false;
        }

        @Override
        public void visit(ObjectCreationExpr node, Void arg) {
            super.visit(node, arg);

            if (isHexOfBytesOfPattern(node)) {
                MethodCallExpr replacement = createHexConversion(node);
                node.replace(replacement);
                hasChanges = true;
                needsHelperMethod = true;
            }
        }

        private boolean isHexOfBytesOfPattern(ObjectCreationExpr expr) {
            if (!expr.getType().getNameAsString().equals("HexOf")) {
                return false;
            }

            NodeList<Expression> args = expr.getArguments();
            if (args.size() != 1) {
                return false;
            }

            Expression inner = args.get(0);
            if (inner instanceof ObjectCreationExpr) {
                ObjectCreationExpr innerExpr = (ObjectCreationExpr) inner;
                return innerExpr.getType().getNameAsString().equals("BytesOf");
            }

            return false;
        }

        private MethodCallExpr createHexConversion(ObjectCreationExpr hexOfExpr) {
            NodeList<Expression> hexArgs = hexOfExpr.getArguments();
            ObjectCreationExpr bytesOfExpr = (ObjectCreationExpr) hexArgs.get(0);
            NodeList<Expression> bytesArgs = bytesOfExpr.getArguments();
            Expression digestExpr = bytesArgs.get(0);

            MethodCallExpr toHexString = new MethodCallExpr(
                null,
                "bytesToHex"
            );
            toHexString.addArgument(digestExpr);

            return toHexString;
        }
    }
}
