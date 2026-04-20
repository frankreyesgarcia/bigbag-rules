package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;

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
        
        if (!Files.exists(sourceDir)) {
            System.err.println("Source directory does not exist: " + sourceDir);
            System.exit(1);
        }

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11);
        
        JavaParser javaParser = new JavaParser(config);

        List<Path> javaFiles = Files.walk(sourceDir)
            .filter(p -> p.toString().endsWith(".java"))
            .collect(Collectors.toList());

        for (Path javaFile : javaFiles) {
            try {
                ParseResult<CompilationUnit> parseResult = javaParser.parse(javaFile);
                
                if (parseResult.isSuccessful() && parseResult.getResult().isPresent()) {
                    CompilationUnit cu = parseResult.getResult().get();
                    boolean modified = fixCompilationErrors(cu);
                    
                    if (modified) {
                        Files.write(javaFile, cu.toString().getBytes());
                        System.out.println("Fixed: " + javaFile);
                    }
                }
            } catch (Exception e) {
                System.err.println("Error processing " + javaFile + ": " + e.getMessage());
            }
        }

        System.out.println("Transformation complete.");
    }

    private static boolean fixCompilationErrors(CompilationUnit cu) {
        boolean modified = false;
        
        // Remove the problematic import: org.codehaus.plexus.util.xml.Xpp3Dom
        List<ImportDeclaration> importsToRemove = cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().equals("org.codehaus.plexus.util.xml.Xpp3Dom"))
            .collect(Collectors.toList());
        
        for (ImportDeclaration imp : importsToRemove) {
            imp.remove();
            modified = true;
        }

        // Fix the collectUsedClassesFromProcessors method
        List<MethodDeclaration> methodsToFix = cu.findAll(MethodDeclaration.class).stream()
            .filter(md -> md.getNameAsString().equals("collectUsedClassesFromProcessors"))
            .collect(Collectors.toList());
        
        for (MethodDeclaration md : methodsToFix) {
            fixCollectUsedClassesFromProcessors(md);
            modified = true;
        }

        return modified;
    }

    private static void fixCollectUsedClassesFromProcessors(MethodDeclaration method) {
        // New method body that doesn't use Xpp3Dom - uses reflection instead
        String newBodyCode = 
            "{\n" +
            "    getLog().debug(\"# collectUsedClassesFromProcessors()\");\n" +
            "    return java.util.Optional.ofNullable(project.getPlugin(\"org.bsc.maven:maven-processor-plugin\"))\n" +
            "        .map(plugin -> plugin.getExecutionsAsMap().get(\"process\"))\n" +
            "        .map(exec -> exec.getConfiguration())\n" +
            "        .filter(config -> config != null)\n" +
            "        .map(config -> {\n" +
            "            try {\n" +
            "                Object processors = config.getClass().getMethod(\"getChild\", String.class)\n" +
            "                    .invoke(config, \"processors\");\n" +
            "                if (processors != null) {\n" +
            "                    Object[] children = (Object[]) processors.getClass()\n" +
            "                        .getMethod(\"getChildren\").invoke(processors);\n" +
            "                    return java.util.Arrays.stream(children)\n" +
            "                        .map(child -> {\n" +
            "                            try {\n" +
            "                                return (String) child.getClass()\n" +
            "                                    .getMethod(\"getValue\").invoke(child);\n" +
            "                            } catch (Exception e) {\n" +
            "                                return null;\n" +
            "                            }\n" +
            "                        })\n" +
            "                        .filter(val -> val != null)\n" +
            "                        .collect(java.util.stream.Collectors.toSet());\n" +
            "                }\n" +
            "            } catch (Exception e) {\n" +
            "                // Ignore reflection errors\n" +
            "            }\n" +
            "            return java.util.Collections.emptySet();\n" +
            "        })\n" +
            "        .orElse(java.util.Set.of());\n" +
            "}";
        
        // Parse the new body as a block statement
        BlockStmt newBody = StaticJavaParser.parseBlock(newBodyCode);
        method.setBody(newBody);
    }
}
