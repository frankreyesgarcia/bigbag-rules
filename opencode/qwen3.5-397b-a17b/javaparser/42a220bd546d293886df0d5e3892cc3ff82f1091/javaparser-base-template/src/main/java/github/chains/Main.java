package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(file);
        
        AtomicBoolean modified = new AtomicBoolean(false);
        
        // Remove the DigestUtils import
        cu.getImports().removeIf(imp -> {
            boolean removed = imp.getNameAsString().equals("org.apache.commons.codec.digest.DigestUtils");
            if (removed) modified.set(true);
            return removed;
        });
        
        // Add required imports for MessageDigest, BigInteger, StandardCharsets
        if (!cu.getImports().stream().anyMatch(imp -> imp.getNameAsString().equals("java.security.MessageDigest"))) {
            cu.addImport("java.security.MessageDigest");
            modified.set(true);
        }
        if (!cu.getImports().stream().anyMatch(imp -> imp.getNameAsString().equals("java.math.BigInteger"))) {
            cu.addImport("java.math.BigInteger");
            modified.set(true);
        }
        if (!cu.getImports().stream().anyMatch(imp -> imp.getNameAsString().equals("java.nio.charset.StandardCharsets"))) {
            cu.addImport("java.nio.charset.StandardCharsets");
            modified.set(true);
        }
        
        // Find and replace DigestUtils.md5Hex calls
        cu.findAll(MethodCallExpr.class).stream()
            .filter(mce -> mce.getScope().isPresent() && 
                   mce.getScope().get().toString().equals("DigestUtils") &&
                   mce.getNameAsString().equals("md5Hex"))
            .forEach(mce -> {
                mce.getScope().ifPresent(scope -> {
                    scope.replace(new NameExpr("Main"));
                    modified.set(true);
                });
            });
        
        // Add md5Hex helper method to the class
        cu.findAll(TypeDeclaration.class).forEach(type -> {
            boolean hasMd5Hex = false;
            for (var member : type.getMembers()) {
                if (member instanceof MethodDeclaration) {
                    MethodDeclaration md = (MethodDeclaration) member;
                    if (md.getNameAsString().equals("md5Hex")) {
                        hasMd5Hex = true;
                        break;
                    }
                }
            }
            
            if (!hasMd5Hex) {
                MethodDeclaration md5HexMethod = new MethodDeclaration();
                md5HexMethod.addModifier(Modifier.Keyword.PRIVATE);
                md5HexMethod.addModifier(Modifier.Keyword.STATIC);
                md5HexMethod.setName("md5Hex");
                md5HexMethod.setType("String");
                
                md5HexMethod.addParameter("String", "input");
                
                BlockStmt body = new BlockStmt();
                
                TryStmt tryStmt = new TryStmt();
                BlockStmt tryBlock = new BlockStmt();
                
                Statement md5Stmt = StaticJavaParser.parseStatement(
                    "MessageDigest md = MessageDigest.getInstance(\"MD5\");"
                );
                Statement digestStmt = StaticJavaParser.parseStatement(
                    "byte[] digestBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));"
                );
                Statement bigIntStmt = StaticJavaParser.parseStatement(
                    "BigInteger bigInt = new BigInteger(1, digestBytes);"
                );
                Statement hexStringStmt = StaticJavaParser.parseStatement(
                    "String hexString = bigInt.toString(16);"
                );
                Statement padStmt = StaticJavaParser.parseStatement(
                    "while (hexString.length() < 32) hexString = \"0\" + hexString;"
                );
                ReturnStmt returnStmt = new ReturnStmt(new NameExpr("hexString"));
                
                tryBlock.addStatement(md5Stmt);
                tryBlock.addStatement(digestStmt);
                tryBlock.addStatement(bigIntStmt);
                tryBlock.addStatement(hexStringStmt);
                tryBlock.addStatement(padStmt);
                tryBlock.addStatement(returnStmt);
                
                tryStmt.setTryBlock(tryBlock);
                
                CatchClause catchClause = new CatchClause(
                    StaticJavaParser.parseParameter("NoSuchAlgorithmException e"),
                    new BlockStmt().addStatement(new ThrowStmt(new ObjectCreationExpr(null, new ClassOrInterfaceType(null, "RuntimeException"), new com.github.javaparser.ast.NodeList<>(new NameExpr("e")))))
                );
                tryStmt.getCatchClauses().add(catchClause);
                
                body.addStatement(tryStmt);
                md5HexMethod.setBody(body);
                
                type.addMember(md5HexMethod);
                modified.set(true);
            }
        });
        
        if (modified.get()) {
            String code = cu.toString();
            java.nio.file.Files.writeString(file.toPath(), code);
            System.out.println("Transformed: " + filePath);
        } else {
            System.out.println("No changes needed: " + filePath);
        }
    }
}
