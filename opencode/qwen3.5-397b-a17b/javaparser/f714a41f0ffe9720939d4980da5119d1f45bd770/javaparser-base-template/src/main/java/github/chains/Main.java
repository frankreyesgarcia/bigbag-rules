package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

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

        String sourceCode = Files.readString(Paths.get(filePath));
        CompilationUnit cu = StaticJavaParser.parse(sourceCode);

        removeImports(cu);
        fixConstructorCall(cu);
        removeDeprecatedMethods(cu);
        addFileMethod(cu);

        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    private static void removeImports(CompilationUnit cu) {
        cu.getImports().removeIf(importDecl -> {
            String name = importDecl.getNameAsString();
            return name.equals("com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult") ||
                   name.equals("com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult") ||
                   name.equals("com.pubnub.api.models.consumer.pubsub.objects.PNUserResult");
        });
    }

    private static void fixConstructorCall(CompilationUnit cu) {
        cu.findAll(ObjectCreationExpr.class).stream()
            .filter(oce -> oce.getType().getNameAsString().equals("PNConfiguration"))
            .forEach(oce -> {
                if (oce.getArguments().isEmpty()) {
                    oce.addArgument(new StringLiteralExpr("default-user"));
                }
            });
    }

    private static void removeDeprecatedMethods(CompilationUnit cu) {
        cu.findAll(MethodDeclaration.class).stream()
            .filter(md -> {
                String name = md.getNameAsString();
                return name.equals("user") || name.equals("space") || name.equals("membership");
            })
            .forEach(MethodDeclaration::remove);
    }

    private static void addFileMethod(CompilationUnit cu) {
        cu.findAll(ObjectCreationExpr.class).stream()
            .filter(oce -> oce.getType().getNameAsString().equals("SubscribeCallback"))
            .forEach(oce -> {
                boolean hasFileMethod = oce.getAnonymousClassBody()
                    .map(body -> body.stream()
                        .filter(bd -> bd instanceof MethodDeclaration)
                        .map(bd -> (MethodDeclaration) bd)
                        .anyMatch(md -> md.getNameAsString().equals("file")))
                    .orElse(false);

                if (!hasFileMethod) {
                    String fileMethod = 
                        "@Override\n" +
                        "public void file(PubNub pubNub, PNFileEventResult pnFileEventResult) {\n" +
                        "  LOG.debug(\"PubNub file: {}\", pnFileEventResult.toString());\n" +
                        "}";
                    oce.getAnonymousClassBody().ifPresent(body -> {
                        MethodDeclaration fileMethodDecl = StaticJavaParser.parseMethodDeclaration(fileMethod);
                        body.add(fileMethodDecl);
                    });
                }
            });
    }
}
