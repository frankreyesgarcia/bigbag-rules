package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.ArrayCreationExpr;
import com.github.javaparser.ast.expr.NullLiteralExpr;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ArrayType;
import com.github.javaparser.ast.type.PrimitiveType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <path-to-source-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File sourceFile = new File(filePath);

        if (!sourceFile.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(sourceFile);

        cu.findAll(ClassOrInterfaceDeclaration.class).forEach(classDecl -> {
            if ("LogMessageEncoder".equals(classDecl.getNameAsString())) {
                for (MethodDeclaration method : classDecl.getMethods()) {
                    if ("doEncode".equals(method.getNameAsString())) {
                        method.setName("encode");
                        method.setType(new ArrayType(PrimitiveType.byteType()));
                        method.getParameters().clear();
                        method.setBody(null);
                        System.out.println("Renamed doEncode to encode");
                    }
                    if ("init".equals(method.getNameAsString())) {
                        method.remove();
                        System.out.println("Removed init method");
                    }
                    if ("close".equals(method.getNameAsString())) {
                        method.remove();
                        System.out.println("Removed close method");
                    }
                }
                
                boolean hasHeaderBytes = !classDecl.getMethodsByName("headerBytes").isEmpty();
                if (!hasHeaderBytes) {
                    MethodDeclaration headerBytesMethod = classDecl.addMethod("headerBytes");
                    headerBytesMethod.setType(new ArrayType(PrimitiveType.byteType()));
                    headerBytesMethod.setPublic(true);
                    headerBytesMethod.addMarkerAnnotation("Override");
                    ReturnStmt returnNull = new ReturnStmt(new NullLiteralExpr());
                    headerBytesMethod.setBody(headerBytesMethod.createBody());
                    headerBytesMethod.getBody().ifPresent(body -> {
                        body.getStatements().clear();
                        body.addStatement(returnNull);
                    });
                    System.out.println("Added headerBytes() method");
                }
                
                boolean hasFooterBytes = !classDecl.getMethodsByName("footerBytes").isEmpty();
                if (!hasFooterBytes) {
                    MethodDeclaration footerBytesMethod = classDecl.addMethod("footerBytes");
                    footerBytesMethod.setType(new ArrayType(PrimitiveType.byteType()));
                    footerBytesMethod.setPublic(true);
                    footerBytesMethod.addMarkerAnnotation("Override");
                    ReturnStmt returnNull = new ReturnStmt(new NullLiteralExpr());
                    footerBytesMethod.setBody(footerBytesMethod.createBody());
                    footerBytesMethod.getBody().ifPresent(body -> {
                        body.getStatements().clear();
                        body.addStatement(returnNull);
                    });
                    System.out.println("Added footerBytes() method");
                }
            }
        });

        String modifiedCode = cu.toString();
        Files.write(Paths.get(filePath), modifiedCode.getBytes());
        
        System.out.println("Transformation complete. Modified file: " + filePath);
    }
}
