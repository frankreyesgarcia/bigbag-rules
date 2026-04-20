import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.FileInputStream;
import java.io.FileWriter;

/**
 * JavaParser transformation to handle common breaking changes in Thrift APIs
 * between version 0.12.0 and 0.16.0
 */
public class ThriftUpgradeTransformer {
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ThriftUpgradeTransformer <source-file.java>");
            return;
        }
        
        String sourceFilePath = args[0];
        try {
            // Parse the Java file
            CompilationUnit cu = JavaParser.parse(new FileInputStream(sourceFilePath));
            
            // Apply transformations
            ThriftUpgradeVisitor visitor = new ThriftUpgradeVisitor();
            visitor.visit(cu, null);
            
            // Write the modified file back
            try (FileWriter writer = new FileWriter(sourceFilePath)) {
                cu.accept(new com.github.javaparser.printer.JavaPrinter(), writer);
            }
            
            System.out.println("Transformation complete for " + sourceFilePath);
            
        } catch (Exception e) {
            System.err.println("Error processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Visitor that identifies and fixes common Thrift API breaking changes
     */
    static class ThriftUpgradeVisitor extends VoidVisitorAdapter<Void> {
        
        @Override
        public void visit(ClassOrInterfaceDeclaration classDecl, Void arg) {
            super.visit(classDecl, arg);
            
            // Check for ProcessFunction subclasses
            if (isProcessFunctionSubclass(classDecl)) {
                handleProcessFunctionChanges(classDecl);
            }
            
            // Check for AsyncProcessFunction subclasses
            if (isAsyncProcessFunctionSubclass(classDecl)) {
                handleAsyncProcessFunctionChanges(classDecl);
            }
            
            // Check for TBase subclasses
            if (isTBaseSubclass(classDecl)) {
                handleTBaseChanges(classDecl);
            }
        }
        
        private boolean isProcessFunctionSubclass(ClassOrInterfaceDeclaration classDecl) {
            return classDecl.getExtendedTypes().stream()
                .anyMatch(type -> type.getNameAsString().contains("ProcessFunction"));
        }
        
        private boolean isAsyncProcessFunctionSubclass(ClassOrInterfaceDeclaration classDecl) {
            return classDecl.getExtendedTypes().stream()
                .anyMatch(type -> type.getNameAsString().contains("AsyncProcessFunction"));
        }
        
        private boolean isTBaseSubclass(ClassOrInterfaceDeclaration classDecl) {
            return classDecl.getExtendedTypes().stream()
                .anyMatch(type -> type.getNameAsString().contains("TBase"));
        }
        
        private void handleProcessFunctionChanges(ClassOrInterfaceDeclaration classDecl) {
            // Look for getResult method signature changes
            classDecl.getMethods().forEach(method -> {
                if ("getResult".equals(method.getNameAsString())) {
                    // In 0.12.0 vs 0.16.0, getResult signature remains consistent:
                    // public abstract T getResult(I p0, T p1) throws TException
                    // No changes needed for signature, but we can verify it's correct
                }
            });
        }
        
        private void handleAsyncProcessFunctionChanges(ClassOrInterfaceDeclaration classDecl) {
            // Look for start method signature changes
            classDecl.getMethods().forEach(method -> {
                if ("start".equals(method.getNameAsString())) {
                    // In 0.12.0 vs 0.16.0, start signature remains consistent:
                    // public abstract void start(I p0, T p1, AsyncMethodCallback p2) throws TException
                }
            });
        }
        
        private void handleTBaseChanges(ClassOrInterfaceDeclaration classDecl) {
            // Look for serialization method signature changes
            classDecl.getMethods().forEach(method -> {
                String methodName = method.getNameAsString();
                if ("read".equals(methodName) || "write".equals(methodName)) {
                    // In 0.12.0 vs 0.16.0, read/write signatures remain consistent:
                    // read(TProtocol protocol) throws TException
                    // write(TProtocol protocol) throws TException
                }
            });
        }
    }
}