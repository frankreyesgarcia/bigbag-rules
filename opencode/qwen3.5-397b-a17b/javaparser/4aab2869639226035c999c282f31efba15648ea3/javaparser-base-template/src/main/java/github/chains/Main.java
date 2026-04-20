package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;

import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <file-to-transform>");
            System.exit(1);
        }

        String inputFile = args[0];
        
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(inputFile)));
        
        cu.getImports().removeIf(imp -> 
            imp.getNameAsString().equals("com.artipie.asto.factory.Storages")
        );
        
        cu.accept(new StoragesRemover(), null);
        
        String transformed = cu.toString();
        Files.write(Paths.get(inputFile), transformed.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        
        System.out.println("Transformation complete: " + inputFile);
    }
    
    static class StoragesRemover extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(ObjectCreationExpr expr, Void arg) {
            super.visit(expr, arg);
            
            if (expr.getType().getNameAsString().equals("Storages")) {
                Expression parent = expr.getParentNode().isPresent() 
                    ? expr.getParentNode().get() instanceof MethodCallExpr 
                        ? (Expression) expr.getParentNode().get() 
                        : null 
                    : null;
                
                if (parent instanceof MethodCallExpr) {
                    MethodCallExpr methodCall = (MethodCallExpr) parent;
                    if ("newStorage".equals(methodCall.getNameAsString())) {
                        Expression grandParent = methodCall.getParentNode().isPresent()
                            ? (Expression) methodCall.getParentNode().get()
                            : null;
                        
                        if (grandParent != null && grandParent.getParentNode().isPresent()) {
                            ObjectCreationExpr newFsStorage = new ObjectCreationExpr();
                            newFsStorage.setType("FileSystemStorage");
                            
                            if (methodCall.getArguments().size() >= 1) {
                                Expression pathArg = methodCall.getArguments().get(0);
                                MethodCallExpr stringCall = new MethodCallExpr();
                                stringCall.setScope(new NameExpr("sub"));
                                stringCall.setName("string");
                                stringCall.addArgument("\"path\"");
                                newFsStorage.addArgument(stringCall);
                            }
                            
                            grandParent.replace(newFsStorage);
                            
                            CompilationUnit cu = expr.findAncestor(CompilationUnit.class).orElse(null);
                            if (cu != null) {
                                boolean hasImport = cu.getImports().stream()
                                    .anyMatch(imp -> imp.getNameAsString().equals("com.artipie.asto.fs.FileSystemStorage"));
                                if (!hasImport) {
                                    cu.addImport("com.artipie.asto.fs.FileSystemStorage");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
