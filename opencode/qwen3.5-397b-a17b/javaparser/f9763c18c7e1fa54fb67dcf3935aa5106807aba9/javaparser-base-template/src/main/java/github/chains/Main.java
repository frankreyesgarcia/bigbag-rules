package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        ParserConfiguration config = new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11);
        
        JavaParser parser = new JavaParser(config);

        List<Path> javaFiles = Files.walk(sourceDir)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        for (Path file : javaFiles) {
            try {
                ParseResult<CompilationUnit> result = parser.parse(file);
                result.getResult().ifPresent(cu -> {
                    boolean modified = false;
                    
                    modified = fixCanConvertMethods(cu) || modified;
                    modified = fixIsApplicableMethods(cu) || modified;
                    
                    if (modified) {
                        try {
                            Files.writeString(file, cu.toString());
                            System.out.println("Fixed: " + file);
                        } catch (IOException e) {
                            System.err.println("Error writing " + file + ": " + e.getMessage());
                        }
                    }
                });
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }

        System.out.println("Transformation complete.");
    }

    private static boolean fixCanConvertMethods(CompilationUnit cu) {
        boolean modified = false;
        
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
        
        for (MethodDeclaration method : methods) {
            if ("canConvert".equals(method.getNameAsString())) {
                Type returnType = method.getType();
                if ("boolean".equals(returnType.toString())) {
                    NodeList<Parameter> params = method.getParameters();
                    if (params.size() == 1) {
                        Type paramType = params.get(0).getType();
                        String paramTypeStr = paramType.toString();
                        if (paramTypeStr.equals("Class<?>") || paramTypeStr.startsWith("Class<? extends")) {
                            ClassOrInterfaceType rawType = new ClassOrInterfaceType(null, "Class");
                            params.get(0).setType(rawType);
                            modified = true;
                            System.out.println("  Fixed canConvert in: " + cu.getPrimaryTypeName().orElse("unknown"));
                        }
                    }
                }
            }
        }
        
        return modified;
    }

    private static boolean fixIsApplicableMethods(CompilationUnit cu) {
        boolean modified = false;
        
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
        
        for (MethodDeclaration method : methods) {
            if ("isApplicable".equals(method.getNameAsString())) {
                NodeList<Parameter> params = method.getParameters();
                if (params.size() == 1) {
                    Type paramType = params.get(0).getType();
                    String paramTypeStr = paramType.toString();
                    if (paramTypeStr.contains("AbstractProject")) {
                        ClassOrInterfaceType rawType = new ClassOrInterfaceType(null, "Class");
                        params.get(0).setType(rawType);
                        modified = true;
                        System.out.println("  Fixed isApplicable in: " + cu.getPrimaryTypeName().orElse("unknown"));
                    }
                }
            }
        }
        
        return modified;
    }
}
