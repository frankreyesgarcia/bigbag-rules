package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    
    private static final String JASYPT_SPRING_SECURITY_PACKAGE = "org.jasypt.spring.security";
    private static final String PASSWORD_ENCODER_CLASS = "PasswordEncoder";
    private static final String PBE_PASSWORD_ENCODER_CLASS = "PBEPasswordEncoder";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }
        
        String sourceDir = args[0];
        System.out.println("Processing source directory: " + sourceDir);
        
        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::processFile);
        }
        
        System.out.println("Transformation complete!");
    }
    
    private static void processFile(Path filePath) {
        try {
            String content = Files.readString(filePath);
            
            JavaParser parser = new JavaParser();
            ParseResult<CompilationUnit> result = parser.parse(content);
            
            if (!result.isSuccessful() || result.getResult().isEmpty()) {
                System.out.println("Skipping " + filePath + " - parse failed");
                return;
            }
            
            CompilationUnit cu = result.getResult().get();
            boolean[] modified = {false};
            
            // Step 1: Remove imports from org.jasypt.spring.security
            List<String> importsToRemove = cu.getImports().stream()
                .filter(importDecl -> importDecl.getNameAsString().startsWith(JASYPT_SPRING_SECURITY_PACKAGE))
                .map(importDecl -> importDecl.getNameAsString())
                .collect(Collectors.toList());
            
            for (String importName : importsToRemove) {
                cu.getImports().removeIf(importDecl -> importDecl.getNameAsString().equals(importName));
                System.out.println("Removed import: " + importName + " from " + filePath);
                modified[0] = true;
            }
            
            // Step 2: Find and fix methods that use the removed classes
            for (MethodDeclaration method : cu.findAll(MethodDeclaration.class)) {
                if (fixMethod(method, cu)) {
                    modified[0] = true;
                }
            }
            
            // Save if modified
            if (modified[0]) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Updated file: " + filePath);
            }
            
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static boolean fixMethod(MethodDeclaration method, CompilationUnit cu) {
        boolean modified = false;
        
        // Check if method body exists
        Optional<BlockStmt> bodyOpt = method.getBody();
        if (bodyOpt.isEmpty()) {
            return false;
        }
        
        BlockStmt body = bodyOpt.get();
        
        // Look for ObjectCreationExpr that creates PasswordEncoder or PBEPasswordEncoder
        List<ObjectCreationExpr> creationExprs = body.findAll(ObjectCreationExpr.class);
        
        for (ObjectCreationExpr creation : creationExprs) {
            ClassOrInterfaceType type = creation.getType();
            String typeName = type.getNameAsString();
            
            if (PASSWORD_ENCODER_CLASS.equals(typeName) || PBE_PASSWORD_ENCODER_CLASS.equals(typeName)) {
                // Replace the entire method body with an anonymous class implementation
                System.out.println("Found problematic creation of " + typeName + " in method " + method.getName());
                
                if (method.getNameAsString().equals("createStringEncoder")) {
                    fixCreateStringEncoder(method, cu);
                    return true;
                }
            }
        }
        
        return modified;
    }
    
    private static void fixCreateStringEncoder(MethodDeclaration method, CompilationUnit cu) {
        // Check which class we're in by looking at the file name or parent class
        String fileName = cu.getStorage().map(s -> s.getPath().getFileName().toString()).orElse("");
        
        BlockStmt newBody = new BlockStmt();
        
        if (fileName.contains("GeoStoreDigestPasswordEncoder")) {
            // For GeoStoreDigestPasswordEncoder, create anonymous PasswordEncoder using StrongPasswordEncryptor
            String code = 
                "return new org.acegisecurity.providers.encoding.PasswordEncoder() {\n" +
                "    private final org.jasypt.util.password.StrongPasswordEncryptor encryptor = new org.jasypt.util.password.StrongPasswordEncryptor();\n" +
                "    \n" +
                "    @Override\n" +
                "    public String encodePassword(String rawPass, Object salt) {\n" +
                "        return encryptor.encryptPassword(rawPass);\n" +
                "    }\n" +
                "    \n" +
                "    @Override\n" +
                "    public boolean isPasswordValid(String encPass, String rawPass, Object salt) {\n" +
                "        return encryptor.checkPassword(encPass, rawPass);\n" +
                "    }\n" +
                "};";
            newBody = parser.parseBlock(code).getResult().orElse(newBody);
            
        } else if (fileName.contains("GeoStorePBEPasswordEncoder")) {
            // For GeoStorePBEPasswordEncoder, create anonymous PasswordEncoder using StandardPBEStringEncryptor
            String code = 
                "byte[] password = lookupPasswordFromKeyStore();\n" +
                "char[] chars = it.geosolutions.geostore.core.security.password.SecurityUtils.toChars(password);\n" +
                "try {\n" +
                "    org.jasypt.encryption.pbe.StandardPBEStringEncryptor stringEncrypter = new org.jasypt.encryption.pbe.StandardPBEStringEncryptor();\n" +
                "    stringEncrypter.setPasswordCharArray(chars);\n" +
                "    \n" +
                "    if (getProviderName() != null && !getProviderName().isEmpty()) {\n" +
                "        stringEncrypter.setProviderName(getProviderName());\n" +
                "    }\n" +
                "    stringEncrypter.setAlgorithm(getAlgorithm());\n" +
                "    \n" +
                "    return new org.acegisecurity.providers.encoding.PasswordEncoder() {\n" +
                "        private final org.jasypt.encryption.pbe.StandardPBEStringEncryptor encryptor = stringEncrypter;\n" +
                "        \n" +
                "        @Override\n" +
                "        public String encodePassword(String rawPass, Object salt) {\n" +
                "            return encryptor.encrypt(rawPass);\n" +
                "        }\n" +
                "        \n" +
                "        @Override\n" +
                "        public boolean isPasswordValid(String encPass, String rawPass, Object salt) {\n" +
                "            try {\n" +
                "                String decrypted = encryptor.decrypt(encPass);\n" +
                "                return decrypted.equals(rawPass);\n" +
                "            } catch (Exception e) {\n" +
                "                return false;\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "} finally {\n" +
                "    it.geosolutions.geostore.core.security.password.SecurityUtils.scramble(password);\n" +
                "    it.geosolutions.geostore.core.security.password.SecurityUtils.scramble(chars);\n" +
                "}";
            newBody = parser.parseBlock(code).getResult().orElse(newBody);
        }
        
        method.setBody(newBody);
    }
    
    private static final JavaParser parser = new JavaParser();
}
