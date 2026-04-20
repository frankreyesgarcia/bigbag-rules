package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Path.of(args[0]);
        File file = filePath.toFile();

        CompilationUnit cu = StaticJavaParser.parse(file);

        cu.findAll(ObjectCreationExpr.class).forEach(objectCreationExpr -> {
            ClassOrInterfaceType type = objectCreationExpr.getType();
            if (type.getNameAsString().equals("Constructor")) {
                NodeList<Expression> arguments = objectCreationExpr.getArguments();
                if (arguments.size() == 1) {
                    Expression arg = arguments.get(0);
                    if (arg.toString().contains(".class")) {
                        ObjectCreationExpr loaderOptionsExpr = new ObjectCreationExpr();
                        loaderOptionsExpr.setType(new ClassOrInterfaceType(null, "LoaderOptions"));
                        
                        NodeList<Expression> newArguments = new NodeList<>();
                        newArguments.add(arg);
                        newArguments.add(loaderOptionsExpr);
                        
                        objectCreationExpr.setArguments(newArguments);
                    }
                }
            }
        });

        boolean hasLoaderOptionsImport = cu.getImports().stream()
            .anyMatch(importDecl -> importDecl.getNameAsString().equals("org.yaml.snakeyaml.LoaderOptions"));
        
        if (!hasLoaderOptionsImport) {
            cu.addImport("org.yaml.snakeyaml.LoaderOptions");
        }

        Files.writeString(filePath, cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }
}
