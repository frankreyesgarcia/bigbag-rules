package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
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
            String methodName = method.getNameAsString();
            if ("nullSafeGet".equals(methodName) || "nullSafeSet".equals(methodName)) {
                method.getParameters().forEach(param -> {
                    if (param.getType().asString().equals("SessionImplementor")) {
                        ClassOrInterfaceType newType = new ClassOrInterfaceType();
                        newType.setName("SharedSessionContractImplementor");
                        param.setType(newType);
                    }
                });
            }
        });

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().equals("org.hibernate.engine.spi.SessionImplementor"))
            .findFirst()
            .ifPresent(imp -> {
                imp.setName("org.hibernate.engine.spi.SharedSessionContractImplementor");
            });

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformed: " + filePath);
    }
}
