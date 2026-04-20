package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

/**
 * JavaParser transformation to fix ScriptResult compilation errors.
 * 
 * This transformation:
 * 1. Removes the import for com.gargoylesoftware.htmlunit.ScriptResult
 * 2. Replaces "new ScriptResult(x)" with just "x"
 * 3. Removes calls to ".getJavaScriptResult()" by replacing with the receiver
 * 4. Simplifies variable declarations that used ScriptResult wrapper
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        // Remove the problematic import
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("com.gargoylesoftware.htmlunit.ScriptResult"));

        // First pass: collect all ObjectCreationExpr of ScriptResult that need replacement
        List<ObjectCreationExpr> toReplace = new ArrayList<>();
        cu.findAll(ObjectCreationExpr.class).forEach(oce -> {
            if (oce.getType().asString().equals("ScriptResult")) {
                toReplace.add(oce);
            }
        });

        // Replace ScriptResult constructor calls with their argument
        for (ObjectCreationExpr oce : toReplace) {
            if (oce.getArguments().size() == 1) {
                oce.replace(oce.getArgument(0));
            }
        }

        // Second pass: collect all getJavaScriptResult() method calls
        List<MethodCallExpr> toRemove = new ArrayList<>();
        cu.findAll(MethodCallExpr.class).forEach(methodCall -> {
            if (methodCall.getNameAsString().equals("getJavaScriptResult")) {
                toRemove.add(methodCall);
            }
        });

        // Remove getJavaScriptResult() calls by replacing with scope
        for (MethodCallExpr methodCall : toRemove) {
            methodCall.getScope().ifPresent(scope -> {
                methodCall.replace(scope);
            });
        }

        // Third pass: simplify variable declarations where initializer is now a simple expression
        cu.findAll(VariableDeclarator.class).forEach(varDecl -> {
            varDecl.getInitializer().ifPresent(init -> {
                // If the variable type was ScriptResult, change it to Object
                if (varDecl.getTypeAsString().equals("ScriptResult")) {
                    varDecl.setType("Object");
                }
            });
        });

        String result = cu.toString();
        Files.write(filePath, result.getBytes());
        System.out.println("Transformation applied successfully to: " + filePath);
    }
}
