package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        transformFile(filePath);
    }

    public static void transformFile(Path filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(filePath);

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if ("between".equals(method.getNameAsString())) {
                method.getAnnotations().stream()
                    .filter(annotation -> "Override".equals(annotation.getNameAsString()))
                    .findFirst()
                    .ifPresent(AnnotationExpr::remove);
                System.out.println("Removed @Override from method: " + method.getSignature());

                for (Parameter param : method.getParameters()) {
                    param.setType(new ClassOrInterfaceType(null, "Timestamp"));
                }
                System.out.println("Changed parameters to Timestamp");

                method.findAll(MethodCallExpr.class).forEach(call -> {
                    if ("between".equals(call.getNameAsString()) && 
                        call.getScope().isPresent() &&
                        "super".equals(call.getScope().get().toString())) {
                        call.removeScope();
                        System.out.println("Fixed between call to not use super");
                    }
                });

                method.getBody().ifPresent(body -> {
                    body.findAll(MethodCallExpr.class)
                        .stream()
                        .filter(call -> "getTime".equals(call.getNameAsString()))
                        .forEach(call -> {
                            call.replace(call.getScope().orElseThrow());
                            System.out.println("Removed .getTime() call");
                        });
                });
            }
        });

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation complete: " + filePath);
    }
}
