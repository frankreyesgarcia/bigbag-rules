package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final Map<String, String> IMPORT_REPLACEMENTS = new HashMap<>();

    static {
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.Member", "com.hazelcast.cluster.Member");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.Cluster", "com.hazelcast.cluster.Cluster");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MembershipEvent", "com.hazelcast.cluster.MembershipEvent");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MembershipListener", "com.hazelcast.cluster.MembershipListener");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.IMap", "com.hazelcast.map.IMap");
        IMPORT_REPLACEMENTS.put("com.hazelcast.core.MapEvent", "com.hazelcast.map.MapEvent");
        IMPORT_REPLACEMENTS.put("com.hazelcast.monitor.LocalMapStats", "com.hazelcast.map.LocalMapStats");
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            List<Path> javaFiles = paths
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

            System.out.println("Found " + javaFiles.size() + " Java files");

            for (Path javaFile : javaFiles) {
                processFile(javaFile);
            }

            System.out.println("Transformation complete!");
        }
    }

    private static void processFile(Path javaFile) throws IOException {
        System.out.println("Processing: " + javaFile);
        
        String originalContent = Files.readString(javaFile);
        CompilationUnit cu = StaticJavaParser.parse(javaFile);

        AtomicBoolean modified = new AtomicBoolean(false);

        // Fix imports
        List<ImportDeclaration> imports = cu.getImports();
        for (ImportDeclaration importDecl : imports) {
            String importName = importDecl.getNameAsString();
            
            if (IMPORT_REPLACEMENTS.containsKey(importName)) {
                String newImportName = IMPORT_REPLACEMENTS.get(importName);
                System.out.println("  Replacing import: " + importName + " -> " + newImportName);
                importDecl.setName(new Name(newImportName));
                modified.set(true);
            }
            
            // Remove MemberAttributeEvent import
            if (importName.equals("com.hazelcast.core.MemberAttributeEvent") || 
                importName.equals("com.hazelcast.cluster.MemberAttributeEvent")) {
                System.out.println("  Removing import: " + importName);
                modified.set(true);
            }
            
            // Remove MaxSizeConfig import
            if (importName.equals("com.hazelcast.config.MaxSizeConfig")) {
                System.out.println("  Removing import: " + importName);
                modified.set(true);
            }
        }
        
        // Remove MemberAttributeEvent and MaxSizeConfig imports from the list
        imports.removeIf(imp -> {
            boolean remove = imp.getNameAsString().equals("com.hazelcast.core.MemberAttributeEvent") || 
                imp.getNameAsString().equals("com.hazelcast.cluster.MemberAttributeEvent") ||
                imp.getNameAsString().equals("com.hazelcast.config.MaxSizeConfig");
            if (remove) modified.set(true);
            return remove;
        });

        // Remove memberAttributeChanged method from ClusterListener
        cu.findAll(MethodDeclaration.class).stream()
            .filter(m -> m.getNameAsString().equals("memberAttributeChanged"))
            .forEach(m -> {
                System.out.println("  Removing method: memberAttributeChanged");
                m.remove();
                modified.set(true);
            });

        // Remove MembershipListener from implements clause in ClusterListener
        cu.findAll(ClassOrInterfaceDeclaration.class).stream()
            .filter(c -> "ClusterListener".equals(c.getNameAsString()))
            .forEach(c -> {
                NodeList<ClassOrInterfaceType> implementedTypes = c.getImplementedTypes();
                for (int i = implementedTypes.size() - 1; i >= 0; i--) {
                    String typeName = implementedTypes.get(i).getNameAsString();
                    if ("MembershipListener".equals(typeName)) {
                        System.out.println("  Removing MembershipListener from implements clause");
                        implementedTypes.remove(i);
                        modified.set(true);
                    }
                }
            });

        if (modified.get()) {
            String newContent = cu.toString();
            Files.writeString(javaFile, newContent);
            System.out.println("  File updated: " + javaFile);
        }
    }
}
