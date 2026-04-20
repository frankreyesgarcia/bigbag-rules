package github.chains;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.utils.SourceRoot;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private static final String TARGET_FILE = "/workspace/qa-catalogue/src/main/java/de/gwdg/metadataqa/marc/MarcFactory.java";

    public static void main(String[] args) throws Exception {
        System.out.println("Fixing MarcFactory.java using JavaParser AST...");

        String content = Files.readString(Paths.get(TARGET_FILE));
        CompilationUnit cu = com.github.javaparser.StaticJavaParser.parse(content);

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().equals("de.gwdg.metadataqa.api.json.JsonBranch"))
            .findFirst()
            .ifPresent(imp -> {
                imp.setName("de.gwdg.metadataqa.api.json.DataElement");
            });

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            method.getParameters().forEach(param -> {
                if (param.getType().asString().equals("JsonBranch")) {
                    param.setType(new ClassOrInterfaceType(null, "DataElement"));
                }
            });
            if (method.getType().asString().equals("JsonBranch")) {
                method.setType(new ClassOrInterfaceType(null, "DataElement"));
            }
        });

        cu.findAll(ClassOrInterfaceType.class).forEach(type -> {
            if (type.getNameAsString().equals("JsonBranch")) {
                type.setName("DataElement");
            }
        });

        Files.write(Paths.get(TARGET_FILE), cu.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));

        System.out.println("Fixed: " + TARGET_FILE);
        System.out.println("Transformation complete!");
    }
}
