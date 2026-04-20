package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    private static final Map<String, String> IMPORT_REPLACEMENTS = new HashMap<>();
    
    static {
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.Member", "com.hazelcast.cluster.Member");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.Cluster", "com.hazelcast.cluster.Cluster");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MembershipListener", "com.hazelcast.cluster.MembershipListener");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MembershipEvent", "com.hazelcast.cluster.MembershipEvent");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.IMap", "com.hazelcast.map.IMap");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MapEvent", "com.hazelcast.map.MapEvent");
        IMPORT_REPLACEMENTS.put("com.hazelcast.monitor.LocalMapStats", "com.hazelcast.map.LocalMapStats");
    }

    public static void main(String[] args) throws IOException {
        String sourceDir = "/workspace/openfire-hazelcast-plugin/src/java";
        
        if (args.length > 0) {
            sourceDir = args[0];
        }
        
        Path sourcePath = Paths.get(sourceDir);
        if (!Files.exists(sourcePath)) {
            System.err.println("Source directory does not exist: " + sourceDir);
            return;
        }
        
        try (Stream<Path> paths = Files.walk(sourcePath)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
        
        System.out.println("Transformation complete!");
    }
    
    private static void transformFile(Path path) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(path);
            boolean[] modified = {false};
            
            List<ImportDeclaration> importsToRemove = new ArrayList<>();
            for (ImportDeclaration importDecl : cu.getImports()) {
                String importName = importDecl.getNameAsString();
                
                if (IMPORT_REPLACEMENTS.containsKey(importName)) {
                    String newImport = IMPORT_REPLACEMENTS.get(importName);
                    importDecl.setName(newImport);
                    modified[0] = true;
                    System.out.println("Updated import: " + importName + " -> " + newImport);
                }
                
                if (importName.equals("com.hazelcast.core.MemberAttributeEvent")) {
                    importsToRemove.add(importDecl);
                    modified[0] = true;
                    System.out.println("Removed import: " + importName);
                }
                
                if (importName.equals("com.hazelcast.config.MaxSizeConfig")) {
                    importsToRemove.add(importDecl);
                    modified[0] = true;
                    System.out.println("Removed import: " + importName);
                }
            }
            
            for (ImportDeclaration importDecl : importsToRemove) {
                importDecl.remove();
            }
            
            List<MethodDeclaration> methodsToRemove = new ArrayList<>();
            cu.findAll(MethodDeclaration.class).forEach(method -> {
                if (method.getNameAsString().equals("memberAttributeChanged")) {
                    methodsToRemove.add(method);
                }
            });
            for (MethodDeclaration method : methodsToRemove) {
                method.remove();
                modified[0] = true;
                System.out.println("Removed method: memberAttributeChanged from " + path.getFileName());
            }
            
            cu.findAll(MethodCallExpr.class).forEach(expr -> {
                if (expr.getNameAsString().equals("getStringAttribute")) {
                    expr.setName("getAttribute");
                    modified[0] = true;
                    System.out.println("Updated method call: getStringAttribute -> getAttribute");
                }
            });
            
            if (modified[0]) {
                Files.writeString(path, cu.toString());
                System.out.println("Transformed: " + path);
            }
            
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
