package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "/workspace/HAP-Java/src/main/java/io/github/hapjava/server/impl/crypto/ChachaDecoder.java";
        
        CompilationUnit cu = StaticJavaParser.parse(new File(sourceFile));
        
        cu.getImports().removeIf(importDecl -> {
            String name = importDecl.getNameAsString();
            return name.equals("org.bouncycastle.crypto.tls.AlertDescription") ||
                   name.equals("org.bouncycastle.crypto.tls.TlsFatalAlert");
        });
        
        cu.accept(new VoidVisitorAdapter<Void>() {
            @Override
            public void visit(ThrowStmt n, Void arg) {
                super.visit(n, arg);
                if (n.getExpression() instanceof ObjectCreationExpr) {
                    ObjectCreationExpr expr = (ObjectCreationExpr) n.getExpression();
                    if (expr.getType().asString().equals("TlsFatalAlert")) {
                        expr.setType("IOException");
                        expr.getArguments().clear();
                        expr.addArgument("\"bad_record_mac\"");
                    }
                }
            }
        }, null);
        
        String transformedCode = cu.toString();
        System.out.println(transformedCode);
    }
}
