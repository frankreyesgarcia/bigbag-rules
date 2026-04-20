package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }

        Path path = Paths.get(args[0]);
        
        if (Files.isDirectory(path)) {
            Files.walk(path)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::transformFile);
        } else {
            transformFile(path);
        }
    }

    private static void transformFile(Path filePath) {
        try {
            String originalContent = Files.readString(filePath);
            CompilationUnit cu = StaticJavaParser.parse(filePath);
            
            IntToFloatConversionVisitor visitor = new IntToFloatConversionVisitor();
            visitor.visit(cu, null);
            
            String transformedContent = cu.toString();
            
            if (!originalContent.equals(transformedContent)) {
                Files.writeString(filePath, transformedContent);
                System.out.println("Transformed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class IntToFloatConversionVisitor extends VoidVisitorAdapter<Void> {
        
        @Override
        public void visit(MethodCallExpr methodCallExpr, Void arg) {
            super.visit(methodCallExpr, arg);
            
            String methodName = methodCallExpr.getNameAsString();
            
            if ("setLineWidth".equals(methodName)) {
                NodeList<Expression> arguments = methodCallExpr.getArguments();
                
                if (arguments.size() == 1) {
                    Expression expression = arguments.get(0);
                    
                    if (!isFloatType(expression)) {
                        ObjectCreationExpr floatWrapper = new ObjectCreationExpr();
                        floatWrapper.setType("Float");
                        floatWrapper.getArguments().add(expression);
                        
                        arguments.set(0, floatWrapper);
                    }
                }
            }
                }
            }
        }
        
        private boolean isFloatType(Expression expr) {
            if (expr instanceof ObjectCreationExpr) {
                ObjectCreationExpr oce = (ObjectCreationExpr) expr;
                return "Float".equals(oce.getType().asString());
            }
            return false;
        }
    }
}
