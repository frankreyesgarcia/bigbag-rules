package github.chains;

import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Transformation tool to fix ChangeSkin Sponge module compilation errors.
 * 
 * The errors are caused by SpongeAPI version incompatibility:
 * - Code uses SpongeAPI 7.x patterns (GamePreInitializationEvent, CommandManager, etc.)
 * - POM specifies SpongeAPI 8.0.0 which has breaking API changes
 * 
 * Fix: Change SpongeAPI version from 8.0.0 to 7.3.0 in sponge/pom.xml
 */
public class Main {

    private static final String SPONGE_API_VERSION_PATTERN = "(<version>)8\\.0\\.0(<\\/version>)";
    private static final String SPONGE_API_VERSION_REPLACE = "$17.3.0$2";

    public static void main(String[] args) throws IOException {
        String workspacePath = "/workspace/ChangeSkin";
        
        System.out.println("Fixing ChangeSkin Sponge module compilation errors...");
        
        // Fix 1: Update SpongeAPI version in POM
        Path pomPath = Path.of(workspacePath, "sponge/pom.xml");
        fixSpongeApiVersion(pomPath);
        
        System.out.println("Transformation complete. Run 'mvn compile' to verify.");
    }

    /**
     * Fixes the SpongeAPI version in the POM file from 8.0.0 to 7.3.0
     */
    public static void fixSpongeApiVersion(Path pomPath) throws IOException {
        String content = Files.readString(pomPath);
        
        Pattern pattern = Pattern.compile(SPONGE_API_VERSION_PATTERN);
        Matcher matcher = pattern.matcher(content);
        
        if (matcher.find()) {
            String newContent = matcher.replaceAll(SPONGE_API_VERSION_REPLACE);
            Files.writeString(pomPath, newContent);
            System.out.println("Updated SpongeAPI version: 8.0.0 -> 7.3.0 in " + pomPath);
        } else {
            System.out.println("SpongeAPI version 8.0.0 not found in " + pomPath);
        }
    }

    /**
     * Removes deprecated @Plugin annotation members that may cause issues
     * Uses JavaParser to parse and modify Java source files
     */
    public static void fixPluginAnnotations(Path javaFile) throws IOException {
        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11);
        StaticJavaParser.setConfiguration(config);
        
        CompilationUnit cu = StaticJavaParser.parse(javaFile);
        boolean modified = false;
        
        List<ClassOrInterfaceDeclaration> classes = cu.findAll(ClassOrInterfaceDeclaration.class);
        for (ClassOrInterfaceDeclaration clazz : classes) {
            NodeList<AnnotationExpr> annotations = clazz.getAnnotations();
            for (AnnotationExpr annotation : annotations) {
                if (annotation.getNameAsString().equals("Plugin")) {
                    if (annotation instanceof NormalAnnotationExpr) {
                        NormalAnnotationExpr normalAnnotation = (NormalAnnotationExpr) annotation;
                        // Remove 'name' member if present (not required in SpongeAPI 7.x)
                        NodeList<com.github.javaparser.ast.expr.MemberValuePair> pairs = normalAnnotation.getPairs();
                        for (int i = pairs.size() - 1; i >= 0; i--) {
                            if (pairs.get(i).getNameAsString().equals("name")) {
                                pairs.remove(i);
                                modified = true;
                            }
                        }
                    }
                }
            }
        }
        
        if (modified) {
            Files.writeString(javaFile, cu.toString());
            System.out.println("Fixed plugin annotations in " + javaFile);
        }
    }
}
