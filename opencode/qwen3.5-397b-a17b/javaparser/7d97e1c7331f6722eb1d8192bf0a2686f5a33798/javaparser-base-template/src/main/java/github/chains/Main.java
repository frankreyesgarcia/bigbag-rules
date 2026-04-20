package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        String content = Files.readString(filePath);
        
        CompilationUnit cu = StaticJavaParser.parse(content);
        
        cu.getImports().removeIf(
            importDecl -> importDecl.getNameAsString().equals("com.jcabi.aspects.Tv")
        );
        
        new TvReplacementVisitor().visit(cu, null);
        
        String transformed = cu.toString();
        Files.writeString(filePath, transformed);
        
        System.out.println("Transformation completed successfully");
    }

    private static class TvReplacementVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(FieldAccessExpr fieldAccess, Void arg) {
            super.visit(fieldAccess, arg);
            
            if (fieldAccess.getScope().toString().equals("Tv")) {
                String fieldName = fieldAccess.getNameAsString();
                IntegerLiteralExpr replacement = null;
                
                switch (fieldName) {
                    case "TEN":
                        replacement = new IntegerLiteralExpr("10");
                        break;
                    case "EIGHT":
                        replacement = new IntegerLiteralExpr("8");
                        break;
                    default:
                        break;
                }
                
                if (replacement != null) {
                    fieldAccess.replace(replacement);
                }
            }
        }
    }
}
