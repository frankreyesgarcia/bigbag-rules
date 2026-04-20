package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-source-files>");
            System.exit(1);
        }

        String sourcePath = args[0];
        JavaParser parser = new JavaParser();

        List<Path> javaFiles = Files.walk(Paths.get(sourcePath))
            .filter(p -> p.toString().endsWith(".java"))
            .collect(Collectors.toList());

        for (Path file : javaFiles) {
            try {
                ParseResult<CompilationUnit> result = parser.parse(file);
                if (result.isSuccessful() && result.getResult().isPresent()) {
                    CompilationUnit cu = result.getResult().get();
                    boolean modified = fixAuthenticationUserReferences(cu);
                    if (modified) {
                        Files.writeString(file, cu.toString());
                        System.out.println("Fixed: " + file);
                    }
                }
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }
    }

    private static boolean fixAuthenticationUserReferences(CompilationUnit cu) {
        boolean[] modified = {false};

        cu.accept(new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(MethodCallExpr call, Void arg) {
                super.visit(call, arg);
                if (call.getNameAsString().equals("of") && 
                    call.getScope().isPresent() &&
                    call.getScope().get().toString().equals("Optional")) {
                    if (call.getArguments().size() == 1 && 
                        call.getArgument(0).isObjectCreationExpr()) {
                        ObjectCreationExpr creation = call.getArgument(0).asObjectCreationExpr();
                        if (creation.getType().isClassOrInterfaceType()) {
                            ClassOrInterfaceType type = creation.getType().asClassOrInterfaceType();
                            if (isAuthenticationUser(type)) {
                                MethodCallExpr empty = new MethodCallExpr("Optional", "empty");
                                call.replace(empty);
                                modified[0] = true;
                            }
                        }
                    }
                }
            }

            @Override
            public void visit(ObjectCreationExpr expr, Void arg) {
                super.visit(expr, arg);
                if (expr.getType().isClassOrInterfaceType()) {
                    ClassOrInterfaceType type = expr.getType().asClassOrInterfaceType();
                    if (isAuthenticationUser(type)) {
                        MethodCallExpr empty = new MethodCallExpr("Optional", "empty");
                        if (expr.getParentNode().isPresent() && 
                            expr.getParentNode().get() instanceof MethodCallExpr) {
                            MethodCallExpr parent = (MethodCallExpr) expr.getParentNode().get();
                            if (parent.getNameAsString().equals("map")) {
                                expr.replace(new MethodCallExpr("Optional", "empty"));
                                modified[0] = true;
                            }
                        }
                    }
                }
            }
        }, null);

        if (modified[0]) {
            cu.getImports().stream()
                .filter(i -> i.getNameAsString().equals("com.artipie.http.auth.Authentication"))
                .findFirst()
                .ifPresent(imp -> {
                    imp.setName("com.artipie.http.auth.AuthUser");
                    modified[0] = true;
                });

            boolean hasAuthUserImport = cu.getImports().stream()
                .anyMatch(i -> i.getNameAsString().equals("com.artipie.http.auth.AuthUser"));

            if (!hasAuthUserImport) {
                cu.addImport("com.artipie.http.auth.AuthUser");
            }
        }

        return modified[0];
    }

    private static boolean isAuthenticationUser(ClassOrInterfaceType type) {
        if (type.getNameAsString().equals("User")) {
            if (type.getScope().isPresent()) {
                String scope = type.getScope().get().asString();
                return scope.equals("Authentication") || scope.endsWith(".Authentication");
            }
        }
        return type.getNameAsString().equals("Authentication.User");
    }
}
