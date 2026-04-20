package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        System.out.println("Processing source directory: " + sourceDir);

        AtomicInteger fixedCount = new AtomicInteger(0);
        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths.filter(p -> p.toString().endsWith(".java"))
                 .forEach(p -> {
                     try {
                         if (fixFile(p)) {
                             fixedCount.incrementAndGet();
                         }
                     } catch (Exception e) {
                         System.err.println("Error processing " + p + ": " + e.getMessage());
                     }
                 });
        }

        System.out.println("Transformation complete. Fixed " + fixedCount.get() + " files.");
    }

    private static boolean fixFile(Path filePath) throws IOException {
        String content = Files.readString(filePath);
        
        boolean hasJavaxValidation = content.contains("import javax.validation");
        boolean hasBeanutils = content.contains("import org.apache.commons.beanutils");
        boolean hasPropertyUtils = content.contains("PropertyUtils");
        
        if (!hasJavaxValidation && !hasBeanutils) {
            return false;
        }

        CompilationUnit cu = StaticJavaParser.parse(content);

        boolean modified = false;

        for (ImportDeclaration importDecl : cu.getImports()) {
            String importName = importDecl.getNameAsString();
            
            if (importName.startsWith("javax.validation")) {
                String jakartaImport = importName.replace("javax.validation", "jakarta.validation");
                importDecl.setName(jakartaImport);
                modified = true;
                System.out.println("  Replaced import: " + importName + " -> " + jakartaImport);
            }
            
            if (importName.equals("org.apache.commons.beanutils.PropertyUtils")) {
                importDecl.remove();
                modified = true;
                System.out.println("  Removed import: " + importName);
                
                if (!hasImport(cu, "java.beans.Introspector")) {
                    cu.addImport("java.beans.Introspector");
                    cu.addImport("java.beans.PropertyDescriptor");
                    cu.addImport("java.beans.IntrospectionException");
                    System.out.println("  Added java.beans imports");
                }
            }
        }

        AtomicBoolean modifiedRef = new AtomicBoolean(false);
        cu.findAll(MethodCallExpr.class).forEach(methodCall -> {
            if (methodCall.getScope().isPresent() && 
                methodCall.getScope().get() instanceof NameExpr) {
                NameExpr scope = (NameExpr) methodCall.getScope().get();
                
                if ("PropertyUtils".equals(scope.getNameAsString())) {
                    String methodName = methodCall.getNameAsString();
                    
                    if ("getPropertyDescriptors".equals(methodName)) {
                        methodCall.replace(createGetPropertyDescriptorsReplacement(methodCall.getArguments()));
                        modifiedRef.set(true);
                        System.out.println("  Replaced PropertyUtils.getPropertyDescriptors call");
                    } else if ("getPropertyDescriptor".equals(methodName)) {
                        methodCall.replace(createGetPropertyDescriptorReplacement(methodCall.getArguments()));
                        modifiedRef.set(true);
                        System.out.println("  Replaced PropertyUtils.getPropertyDescriptor call");
                    }
                }
            }
        });
        modified = modifiedRef.get();
        modified = modifiedRef.get();

        if (modified) {
            String fixedContent = cu.toString();
            fixedContent = removeUnusedIntrospectionExceptionImport(fixedContent, content);
            Files.writeString(filePath, fixedContent);
        }

        return modified;
    }

    private static String removeUnusedIntrospectionExceptionImport(String newContent, String oldContent) {
        if (!oldContent.contains("IntrospectionException") && 
            newContent.contains("import java.beans.IntrospectionException;")) {
            return newContent.replace("import java.beans.IntrospectionException;\n", "");
        }
        return newContent;
    }

    private static boolean hasImport(CompilationUnit cu, String importName) {
        return cu.getImports().stream()
            .anyMatch(i -> i.getNameAsString().equals(importName));
    }

    private static MethodCallExpr createGetPropertyDescriptorsReplacement(NodeList<com.github.javaparser.ast.expr.Expression> args) {
        MethodCallExpr getBeanInfo = new MethodCallExpr(
            new NameExpr("Introspector"),
            "getBeanInfo",
            args
        );
        
        MethodCallExpr getPropertyDescriptors = new MethodCallExpr(
            getBeanInfo,
            "getPropertyDescriptors"
        );
        
        return getPropertyDescriptors;
    }

    private static MethodCallExpr createGetPropertyDescriptorReplacement(NodeList<com.github.javaparser.ast.expr.Expression> args) {
        if (args.size() >= 2) {
            com.github.javaparser.ast.expr.Expression objArg = args.get(0);
            com.github.javaparser.ast.expr.Expression nameArg = args.get(1);
            
            MethodCallExpr getBeanInfo = new MethodCallExpr(
                new NameExpr("Introspector"),
                "getBeanInfo",
                new NodeList<>(
                    new MethodCallExpr(objArg, "getClass")
                )
            );
            
            MethodCallExpr getPropertyDescriptors = new MethodCallExpr(
                getBeanInfo,
                "getPropertyDescriptors"
            );
            
            MethodCallExpr streamCall = new MethodCallExpr(
                new MethodCallExpr(
                    new NameExpr("java.util.Arrays"),
                    "stream",
                    new NodeList<>(getPropertyDescriptors)
                ),
                "filter"
            );
            
            com.github.javaparser.ast.expr.LambdaExpr lambda = new com.github.javaparser.ast.expr.LambdaExpr(
                new NodeList<Parameter>(new Parameter(
                    new ClassOrInterfaceType(null, "PropertyDescriptor"),
                    new com.github.javaparser.ast.expr.SimpleName("pd")
                )),
                new MethodCallExpr(
                    new MethodCallExpr(
                        new NameExpr("pd"),
                        "getName"
                    ),
                    "equals",
                    new NodeList<>(nameArg)
                )
            );
            streamCall.getArguments().add(0, lambda);
            
            MethodCallExpr findFirst = new MethodCallExpr(streamCall, "findFirst");
            MethodCallExpr orElse = new MethodCallExpr(findFirst, "orElse", new NodeList<>(new NameExpr("null")));
            
            return orElse;
        }
        
        return new MethodCallExpr(null, "null");
    }
}
