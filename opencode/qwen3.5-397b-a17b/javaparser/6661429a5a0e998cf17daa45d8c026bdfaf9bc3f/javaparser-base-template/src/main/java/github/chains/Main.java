package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "/workspace/code-coverage-api-plugin/ui-tests/src/main/java/io/jenkins/plugins/coverage/util/ChartUtil.java";
        String outputFile = inputFile;
        
        if (args.length >= 1) {
            inputFile = args[0];
        }
        if (args.length >= 2) {
            outputFile = args[1];
        }
        
        CompilationUnit cu = StaticJavaParser.parse(new File(inputFile));
        
        // Remove the import for com.gargoylesoftware.htmlunit.ScriptResult
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("com.gargoylesoftware.htmlunit.ScriptResult"));
        
        // Find all ObjectCreationExpr for ScriptResult and replace them
        cu.findAll(ObjectCreationExpr.class).stream()
            .filter(creation -> creation.getType().asString().equals("ScriptResult"))
            .forEach(creation -> {
                var parent = creation.getParentNode().orElse(null);
                
                if (parent instanceof VariableDeclarator) {
                    VariableDeclarator varDecl = (VariableDeclarator) parent;
                    
                    // Replace the initializer with just the argument
                    if (!creation.getArguments().isEmpty()) {
                        varDecl.setInitializer(creation.getArgument(0));
                    }
                    
                    // Change the type from ScriptResult to Object
                    varDecl.setType("Object");
                }
            });
        
        // Find all method calls to getJavaScriptResult() and replace with scope
        cu.findAll(MethodCallExpr.class).stream()
            .filter(method -> method.getNameAsString().equals("getJavaScriptResult"))
            .forEach(method -> {
                var scope = method.getScope().orElse(null);
                if (scope != null) {
                    // Replace the entire method call with just the scope
                    method.replace(scope);
                }
            });
        
        // Write the modified file
        Files.writeString(Paths.get(outputFile), cu.toString());
        
        System.out.println("Transformation complete. Fixed file written to: " + outputFile);
    }
}
