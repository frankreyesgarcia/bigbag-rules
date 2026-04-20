package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.NullLiteralExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputPath = "/workspace/poc-multi-module-arch-hexagonal-springboot/application/src/main/java/io/github/wesleyosantos91/api/v1/mapper/PersonHttpMapper.java";
        String outputPath = inputPath;

        CompilationUnit cu = StaticJavaParser.parse(new File(inputPath));

        // Remove MapStruct imports
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("org.mapstruct.Mapper") ||
            importDecl.getNameAsString().equals("org.mapstruct.factory.Mappers")
        );

        // Get the class/interface declaration
        Optional<ClassOrInterfaceDeclaration> typeDeclOpt = cu.getClassByName("PersonHttpMapper");
        if (typeDeclOpt.isPresent()) {
            ClassOrInterfaceDeclaration typeDeclaration = typeDeclOpt.get();
            
            // Remove all annotations (including @Mapper)
            typeDeclaration.setAnnotations(new NodeList<>());

            // Convert interface to class
            typeDeclaration.setInterface(false);

            // Remove all fields (including INSTANCE)
            typeDeclaration.getFields().forEach(FieldDeclaration::remove);

            // Convert methods to concrete static methods with implementations
            typeDeclaration.getMethods().forEach(method -> {
                // Skip default methods (they already have implementation)
                if (method.getBody().isPresent()) {
                    method.setStatic(true);
                    return;
                }
                
                method.setStatic(true);
                BlockStmt body = createMapperMethodBody(method);
                method.setBody(body);
            });
        }

        // Write the transformed file
        Files.writeString(Paths.get(outputPath), cu.toString());

        System.out.println("Transformation complete: " + outputPath);
    }

    private static BlockStmt createMapperMethodBody(MethodDeclaration method) {
        BlockStmt body = new BlockStmt();
        
        String returnType = method.getType().asString();
        NodeList<Parameter> parameters = method.getParameters();
        
        if (parameters.isEmpty()) {
            return body;
        }

        Parameter param = parameters.get(0);
        String paramType = param.getType().asString();
        String paramName = param.getNameAsString();

        // Create new instance of return type
        ObjectCreationExpr creationExpr = new ObjectCreationExpr();
        creationExpr.setType(new ClassOrInterfaceType(null, returnType));
        
        // Get field names from return type and create constructor arguments
        NodeList<Expression> constructorArgs = new NodeList<>();
        
        // Based on the classes we analyzed:
        // PersonDomain: id, name, dateOfBirth, cpf, email
        // PersonRequest: name, dateOfBirth, cpf, email (no id)
        // PersonResponse: id, name, dateOfBirth, cpf, email
        
        if (returnType.equals("PersonDomain")) {
            if (paramType.equals("PersonRequest")) {
                // PersonRequest -> PersonDomain (no id in request)
                constructorArgs.add(new NullLiteralExpr());
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getName"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getDateOfBirth"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getCpf"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getEmail"));
            } else if (paramType.equals("PersonResponse")) {
                // PersonResponse -> PersonDomain
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getId"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getName"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getDateOfBirth"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getCpf"));
                constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getEmail"));
            }
        } else if (returnType.equals("PersonRequest")) {
            // PersonDomain -> PersonRequest
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getName"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getDateOfBirth"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getCpf"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getEmail"));
        } else if (returnType.equals("PersonResponse")) {
            // PersonDomain -> PersonResponse
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getId"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getName"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getDateOfBirth"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getCpf"));
            constructorArgs.add(new MethodCallExpr(new NameExpr(paramName), "getEmail"));
        }

        creationExpr.setArguments(constructorArgs);

        // Return statement
        body.addStatement(new ReturnStmt(creationExpr));
        
        return body;
    }
}
