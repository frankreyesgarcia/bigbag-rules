package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <source-file>");
            System.exit(1);
        }

        String sourceFile = args[0];
        
        CompilationUnit cu = StaticJavaParser.parse(new File(sourceFile));
        
        cu.accept(new FieldAccessToMethodVisitor(), null);
        
        String transformedCode = cu.toString();
        Files.write(Paths.get(sourceFile), transformedCode.getBytes());
        
        System.out.println("Transformation complete: " + sourceFile);
    }

    static class FieldAccessToMethodVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(FieldAccessExpr fieldAccess, Void arg) {
            super.visit(fieldAccess, arg);
            
            String fieldName = fieldAccess.getNameAsString();
            if ("status".equals(fieldName)) {
                MethodCallExpr methodCall = new MethodCallExpr(
                    fieldAccess.getScope(),
                    "getStatus"
                );
                fieldAccess.replace(methodCall);
            }
        }
    }
}
