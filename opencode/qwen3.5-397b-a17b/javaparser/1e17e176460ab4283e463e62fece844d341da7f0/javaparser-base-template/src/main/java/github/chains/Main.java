package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.ObjectCreationExpr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    
    private static final JavaParser javaParser = new JavaParser();
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }
        
        Path sourceDir = Paths.get(args[0]);
        
        List<Path> javaFiles = Files.walk(sourceDir)
            .filter(p -> p.toString().endsWith(".java"))
            .collect(Collectors.toList());
        
        for (Path file : javaFiles) {
            transformFile(file);
        }
        
        System.out.println("Transformation complete!");
    }
    
    private static void transformFile(Path file) throws IOException {
        String content = Files.readString(file);
        String originalContent = content;
        
        // Fix 1: ModelConstructor - Change super(Model.class) to super()
        // Using regex for this transformation as JavaParser SuperExpr doesn't have setArguments
        Pattern superPattern = Pattern.compile("super\\s*\\(\\s*[^)]+\\s*\\)");
        Matcher matcher = superPattern.matcher(content);
        if (matcher.find()) {
            content = matcher.replaceAll("super()");
        }
        
        // Fix 2 & 3: Use JavaParser for Representer -> ModelRepresenter and remove throws clause
        ParseResult<CompilationUnit> result = javaParser.parse(content);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + file);
            return;
        }
        
        CompilationUnit cu = result.getResult().get();
        boolean modified = false;
        
        // Fix 2: YamlModelReader - Change new Representer() to new ModelRepresenter()
        List<ObjectCreationExpr> objectCreations = cu.findAll(ObjectCreationExpr.class);
        for (ObjectCreationExpr creation : objectCreations) {
            if (creation.getType().asString().equals("Representer")) {
                creation.setType("ModelRepresenter");
                modified = true;
            }
        }
        
        // Fix 3: ModelRepresenter - Remove throws IntrospectionException from getProperties
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
        for (MethodDeclaration method : methods) {
            if (method.getNameAsString().equals("getProperties")) {
                method.getThrownExceptions().removeIf(t -> t.asString().equals("IntrospectionException"));
                modified = true;
            }
        }
        
        if (modified) {
            content = cu.toString();
        }
        
        if (!content.equals(originalContent)) {
            Files.writeString(file, content);
            System.out.println("Transformed: " + file);
        }
    }
}
