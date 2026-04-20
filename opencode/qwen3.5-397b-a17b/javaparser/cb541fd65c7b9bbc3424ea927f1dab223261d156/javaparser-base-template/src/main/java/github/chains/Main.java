package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String MATCHERS_IMPORT = "org.hamcrest.Matchers";
    
    private static final Set<String> REQUIRED_STATIC_IMPORTS = new HashSet<>();
    
    static {
        REQUIRED_STATIC_IMPORTS.add("org.hamcrest.Matchers.hasItems");
        REQUIRED_STATIC_IMPORTS.add("org.hamcrest.Matchers.not");
        REQUIRED_STATIC_IMPORTS.add("org.hamcrest.Matchers.emptyIterableOf");
        REQUIRED_STATIC_IMPORTS.add("org.hamcrest.Matchers.notNullValue");
        REQUIRED_STATIC_IMPORTS.add("org.hamcrest.Matchers.hasProperty");
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }
        
        Path sourceDir = Paths.get(args[0]);
        
        Files.walk(sourceDir)
            .filter(path -> path.toString().endsWith(".java"))
            .forEach(path -> {
                try {
                    processFile(path);
                } catch (Exception e) {
                    System.err.println("Error processing " + path + ": " + e.getMessage());
                    e.printStackTrace();
                }
            });
        
        System.out.println("Transformation complete.");
    }
    
    private static void processFile(Path filePath) throws IOException {
        String content = Files.readString(filePath);
        
        if (!content.contains("import " + MATCHERS_IMPORT + ";")) {
            return;
        }
        
        CompilationUnit cu = StaticJavaParser.parse(filePath);
        
        NodeList<ImportDeclaration> imports = cu.getImports();
        
        List<ImportDeclaration> toRemove = new ArrayList<>();
        for (ImportDeclaration imp : imports) {
            if (imp.getNameAsString().equals(MATCHERS_IMPORT) && !imp.isStatic()) {
                toRemove.add(imp);
            }
        }
        
        for (ImportDeclaration imp : toRemove) {
            imp.remove();
        }
        
        for (String staticImport : REQUIRED_STATIC_IMPORTS) {
            if (usageExists(content, staticImport.substring(staticImport.lastIndexOf('.') + 1))) {
                cu.addImport(staticImport, true, false);
            }
        }
        
        String transformed = cu.toString();
        Files.writeString(filePath, transformed);
        
        System.out.println("Transformed: " + filePath);
    }
    
    private static boolean usageExists(String content, String methodName) {
        Pattern pattern = Pattern.compile("\\bMatchers\\.(?:<[^>]+>)?" + Pattern.quote(methodName) + "\\s*\\(");
        Matcher matcher = pattern.matcher(content);
        return matcher.find();
    }
}
