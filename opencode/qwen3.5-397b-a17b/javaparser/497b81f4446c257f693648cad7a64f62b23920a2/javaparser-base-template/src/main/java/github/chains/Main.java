package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.ast.Modifier;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static final String CACTOOS_BYTES_IMPORT = "org.cactoos.io.BytesOf";
    private static final String CACTOOS_HEX_IMPORT = "org.cactoos.text.HexOf";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::processFile);
        }
    }

    private static void processFile(Path filePath) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            boolean modified = false;
            
            modified |= removeCactoosImports(cu);
            modified |= fixHexOfBytesOfExpressions(cu);
            
            if (modified) {
                addHexHelperMethodIfNeeded(cu);
                
                try (FileWriter writer = new FileWriter(filePath.toFile())) {
                    writer.write(cu.toString());
                }
                System.out.println("Fixed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    private static boolean removeCactoosImports(CompilationUnit cu) {
        boolean modified = false;
        NodeList<ImportDeclaration> imports = cu.getImports();
        
        List<ImportDeclaration> toRemove = new ArrayList<>();
        for (ImportDeclaration imp : imports) {
            String name = imp.getNameAsString();
            if (CACTOOS_BYTES_IMPORT.equals(name) || CACTOOS_HEX_IMPORT.equals(name)) {
                toRemove.add(imp);
                modified = true;
            }
        }
        
        for (ImportDeclaration imp : toRemove) {
            imports.remove(imp);
        }
        
        return modified;
    }

    private static boolean fixHexOfBytesOfExpressions(CompilationUnit cu) {
        HexOfBytesOfReplacer replacer = new HexOfBytesOfReplacer();
        cu.accept(replacer, null);
        return replacer.isModified();
    }

    private static class HexOfBytesOfReplacer extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        @Override
        public void visit(ObjectCreationExpr expr, Void arg) {
            super.visit(expr, arg);
            
            if (isHexOfBytesOfPattern(expr)) {
                ObjectCreationExpr bytesOf = (ObjectCreationExpr) expr.getArguments().get(0);
                Expression innerExpr = bytesOf.getArguments().get(0);
                
                NodeList<com.github.javaparser.ast.expr.Expression> args = new NodeList<>();
                args.add(innerExpr);
                MethodCallExpr replacement = new MethodCallExpr(
                    null,
                    new com.github.javaparser.ast.expr.SimpleName("bytesToHex"),
                    args
                );
                
                expr.replace(replacement);
                modified = true;
            }
        }

        @Override
        public void visit(MethodCallExpr methodCall, Void arg) {
            super.visit(methodCall, arg);
            
            if (methodCall.getNameAsString().equals("asString")) {
                Expression scope = methodCall.getScope().orElse(null);
                if (scope instanceof MethodCallExpr) {
                    MethodCallExpr scopeMethod = (MethodCallExpr) scope;
                    if (scopeMethod.getNameAsString().equals("bytesToHex")) {
                        methodCall.replace(scopeMethod);
                        modified = true;
                    }
                }
            }
        }

        private boolean isHexOfBytesOfPattern(ObjectCreationExpr expr) {
            if (!expr.getType().getNameAsString().equals("HexOf")) {
                return false;
            }
            
            if (expr.getArguments().size() != 1) {
                return false;
            }
            
            Expression arg = expr.getArguments().get(0);
            if (!(arg instanceof ObjectCreationExpr)) {
                return false;
            }
            
            ObjectCreationExpr inner = (ObjectCreationExpr) arg;
            return inner.getType().getNameAsString().equals("BytesOf");
        }

        public boolean isModified() {
            return modified;
        }
    }

    private static void addHexHelperMethodIfNeeded(CompilationUnit cu) {
        cu.getPrimaryType().ifPresent(type -> {
            boolean needsHelper = cu.findAll(MethodCallExpr.class).stream()
                .anyMatch(mce -> "bytesToHex".equals(mce.getNameAsString()));
            
            if (needsHelper) {
                boolean hasMethod = cu.findAll(MethodDeclaration.class).stream()
                    .anyMatch(md -> "bytesToHex".equals(md.getNameAsString()));
                
                if (!hasMethod) {
                    MethodDeclaration helper = new MethodDeclaration();
                    helper.setName("bytesToHex");
                    helper.setType("String");
                    helper.addModifier(Modifier.Keyword.PUBLIC);
                    helper.addModifier(Modifier.Keyword.STATIC);
                    
                    com.github.javaparser.ast.body.Parameter param = 
                        new com.github.javaparser.ast.body.Parameter(
                            StaticJavaParser.parseType("byte[]"),
                            new com.github.javaparser.ast.expr.SimpleName("bytes")
                        );
                    helper.addParameter(param);
                    
                    String methodBody = 
                        "StringBuilder sb = new StringBuilder();\n" +
                        "for (byte b : bytes) {\n" +
                        "    sb.append(String.format(\"%02x\", b));\n" +
                        "}\n" +
                        "return sb.toString();";
                    
                    helper.setBody(new com.github.javaparser.ast.stmt.BlockStmt(
                        StaticJavaParser.parseBlock("{" + methodBody + "}").getStatements()
                    ));
                    
                    if (type instanceof ClassOrInterfaceDeclaration) {
                        ((ClassOrInterfaceDeclaration) type).addMember(helper);
                    }
                }
            }
        });
    }
}
