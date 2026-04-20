package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    private static final Set<String> REMOVED_JEDIS_INTERFACES = new HashSet<>(Arrays.asList(
        "MultiKeyBinaryRedisPipeline",
        "MultiKeyCommandsPipeline",
        "ClusterPipeline",
        "BinaryScriptingCommandsPipeline",
        "ScriptingCommandsPipeline",
        "BasicRedisPipeline",
        "BinaryRedisPipeline",
        "RedisPipeline"
    ));

    private static final Set<String> REMOVED_JEDIS_IMPORTS = new HashSet<>(Arrays.asList(
        "redis.clients.jedis.commands.BasicRedisPipeline",
        "redis.clients.jedis.commands.BinaryRedisPipeline",
        "redis.clients.jedis.commands.BinaryScriptingCommandsPipeline",
        "redis.clients.jedis.commands.ClusterPipeline",
        "redis.clients.jedis.commands.MultiKeyBinaryRedisPipeline",
        "redis.clients.jedis.commands.MultiKeyCommandsPipeline",
        "redis.clients.jedis.commands.RedisPipeline",
        "redis.clients.jedis.commands.ScriptingCommandsPipeline",
        "redis.clients.jedis.Client"
    ));

    public static void main(String[] args) throws IOException {
        String baseDir = "/workspace/JRedisGraph/src/main/java";
        
        List<String> interfaceFiles = Arrays.asList(
            baseDir + "/com/redislabs/redisgraph/RedisGraphTransaction.java",
            baseDir + "/com/redislabs/redisgraph/RedisGraphPipeline.java"
        );

        List<String> implFiles = Arrays.asList(
            baseDir + "/com/redislabs/redisgraph/impl/api/RedisGraphTransaction.java",
            baseDir + "/com/redislabs/redisgraph/impl/api/RedisGraphPipeline.java",
            baseDir + "/com/redislabs/redisgraph/impl/api/ContextedRedisGraph.java"
        );

        for (String file : interfaceFiles) {
            System.out.println("Processing interface: " + file);
            fixInterface(file);
        }

        for (String file : implFiles) {
            System.out.println("Processing implementation: " + file);
            fixImplementation(file);
        }

        System.out.println("Transformation complete!");
    }

    private static void fixInterface(String filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Paths.get(filePath));

        for (ClassOrInterfaceDeclaration type : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (type.isInterface()) {
                List<ClassOrInterfaceType> extendedTypes = type.getExtendedTypes();
                
                extendedTypes.removeIf(ext -> 
                    REMOVED_JEDIS_INTERFACES.contains(ext.getNameAsString()) ||
                    ext.getNameAsString().endsWith("RedisPipeline") ||
                    ext.getNameAsString().endsWith("CommandsPipeline") ||
                    ext.getNameAsString().endsWith("ScriptingCommandsPipeline")
                );
            }
        }

        cu.getImports().removeIf(importDecl -> 
            REMOVED_JEDIS_IMPORTS.contains(importDecl.getNameAsString())
        );

        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("  Fixed interface: " + filePath);
    }

    private static void fixImplementation(String filePath) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Paths.get(filePath));

        cu.getImports().removeIf(importDecl -> 
            REMOVED_JEDIS_IMPORTS.contains(importDecl.getNameAsString())
        );

        for (ClassOrInterfaceDeclaration type : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (!type.isInterface()) {
                List<ClassOrInterfaceType> extendedTypes = type.getExtendedTypes();
                
                extendedTypes.removeIf(ext -> 
                    REMOVED_JEDIS_INTERFACES.contains(ext.getNameAsString())
                );
            }
        }

        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("  Fixed implementation: " + filePath);
    }
}
