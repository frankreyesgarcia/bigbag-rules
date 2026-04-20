package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.InitializerDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.body.Parameter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java -jar javaparser.jar <source-file-or-directory>");
            System.exit(1);
        }

        Path sourcePath = Paths.get(args[0]);
        
        if (Files.isDirectory(sourcePath)) {
            Files.walk(sourcePath)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::transformFile);
        } else {
            transformFile(sourcePath);
        }
    }

    private static void transformFile(Path filePath) {
        try {
            String sourceCode = Files.readString(filePath);
            CompilationUnit cu = StaticJavaParser.parse(sourceCode);
            
            boolean modified = false;
            
            List<FieldDeclaration> fieldDeclarations = cu.findAll(FieldDeclaration.class);
            for (FieldDeclaration field : fieldDeclarations) {
                for (VariableDeclarator variable : field.getVariables()) {
                    if (variable.getInitializer().isPresent()) {
                        var initializer = variable.getInitializer().get();
                        if (initializer instanceof ObjectCreationExpr) {
                            ObjectCreationExpr objectCreation = (ObjectCreationExpr) initializer;
                            if (objectCreation.getType().asString().equals("TSerializer")) {
                                wrapTSerializerInitialization(cu, field, variable);
                                modified = true;
                            }
                        }
                    }
                }
            }
            
            if (modified) {
                Files.writeString(filePath, cu.toString());
                System.out.println("Transformed: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
        }
    }

    private static void wrapTSerializerInitialization(CompilationUnit cu, FieldDeclaration field, VariableDeclarator variable) {
        variable.setInitializer((com.github.javaparser.ast.expr.Expression) null);
        
        TryStmt tryStmt = new TryStmt();
        BlockStmt tryBlock = new BlockStmt();
        
        ObjectCreationExpr serializerCreation = new ObjectCreationExpr(
            null,
            new ClassOrInterfaceType(null, "TSerializer"),
            new NodeList<>()
        );
        ExpressionStmt assignmentStmt = new ExpressionStmt(
            new com.github.javaparser.ast.expr.AssignExpr(
                new com.github.javaparser.ast.expr.NameExpr(variable.getNameAsString()),
                serializerCreation,
                com.github.javaparser.ast.expr.AssignExpr.Operator.ASSIGN
            )
        );
        tryBlock.addStatement(assignmentStmt);
        tryStmt.setTryBlock(tryBlock);
        
        Parameter catchParam = new Parameter();
        catchParam.setType(new ClassOrInterfaceType(null, "TTransportException"));
        catchParam.setName(new com.github.javaparser.ast.expr.SimpleName("e"));
        
        CatchClause catchClause = new CatchClause(catchParam, new BlockStmt());
        ThrowStmt throwStmt = new ThrowStmt(
            new ObjectCreationExpr(
                null,
                new ClassOrInterfaceType(null, "RuntimeException"),
                new NodeList<>(
                    new com.github.javaparser.ast.expr.StringLiteralExpr("Failed to initialize TSerializer"),
                    new com.github.javaparser.ast.expr.NameExpr("e")
                )
            )
        );
        catchClause.getBody().addStatement(throwStmt);
        tryStmt.getCatchClauses().add(catchClause);
        
        BlockStmt staticInitializerBody = new BlockStmt();
        staticInitializerBody.addStatement(tryStmt);
        
        InitializerDeclaration staticInitializer = new InitializerDeclaration();
        staticInitializer.setStatic(true);
        staticInitializer.setBody(staticInitializerBody);
        
        cu.getClassByName("AuditEventKafkaSender").ifPresent(type -> {
            type.getMembers().addFirst(staticInitializer);
        });
    }
}
