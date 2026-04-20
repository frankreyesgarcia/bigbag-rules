package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <path-to-java-file>");
            System.exit(1);
        }
        
        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }
        
        System.out.println("Processing: " + filePath);
        
        CompilationUnit cu = StaticJavaParser.parse(file);
        
        FieldAccessToMethodTransformer transformer = new FieldAccessToMethodTransformer("status", "getStatus");
        transformer.visit(cu, null);
        transformer.applyTransformations();
        
        if (transformer.getModifiedCount() == 0) {
            System.out.println("No modifications needed.");
        } else {
            System.out.println("Transformed " + transformer.getModifiedCount() + " field access(es).");
            
            String modifiedCode = cu.toString();
            Files.write(Paths.get(filePath), modifiedCode.getBytes());
            System.out.println("File updated: " + filePath);
        }
    }
    
    static class FieldAccessToMethodTransformer extends VoidVisitorAdapter<Void> {
        private final String fieldName;
        private final String methodName;
        private final List<FieldAccessExpr> nodesToTransform = new ArrayList<>();
        private int modifiedCount = 0;
        
        public FieldAccessToMethodTransformer(String fieldName, String methodName) {
            this.fieldName = fieldName;
            this.methodName = methodName;
        }
        
        @Override
        public void visit(FieldAccessExpr fieldAccess, Void arg) {
            super.visit(fieldAccess, arg);
            
            if (fieldName.equals(fieldAccess.getNameAsString())) {
                Expression scope = fieldAccess.getScope();
                if (scope != null) {
                    nodesToTransform.add(fieldAccess);
                }
            }
        }
        
        public void applyTransformations() {
            for (FieldAccessExpr fieldAccess : nodesToTransform) {
                Expression scope = fieldAccess.getScope();
                if (scope != null) {
                    MethodCallExpr methodCall = new MethodCallExpr(scope.clone(), methodName);
                    fieldAccess.replace(methodCall);
                    modifiedCount++;
                }
            }
        }
        
        public int getModifiedCount() {
            return modifiedCount;
        }
    }
}
