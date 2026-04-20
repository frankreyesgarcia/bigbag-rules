package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.TryStmt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: Main <input-file> <output-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        CompilationUnit cu = StaticJavaParser.parse(new File(inputFile));

        removeImport(cu, "org.apache.maven.doxia.module.xhtml.decoration.render.RenderingContext");
        removeImport(cu, "org.apache.maven.doxia.siterenderer.sink.SiteRendererSink");

        fixExecuteMethod(cu);

        Files.writeString(Paths.get(outputFile), cu.toString());
        System.out.println("Transformation complete: " + outputFile);
    }

    private static void removeImport(CompilationUnit cu, String importName) {
        List<ImportDeclaration> imports = cu.getImports();
        Iterator<ImportDeclaration> iterator = imports.iterator();
        while (iterator.hasNext()) {
            ImportDeclaration imp = iterator.next();
            if (imp.getNameAsString().equals(importName)) {
                iterator.remove();
                System.out.println("Removed import: " + importName);
            }
        }
    }

    private static void fixExecuteMethod(CompilationUnit cu) {
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (method.getNameAsString().equals("execute")) {
                BlockStmt body = method.getBody().orElseThrow();
                
                List<Statement> statements = body.getStatements();
                for (int i = 0; i < statements.size(); i++) {
                    Statement stmt = statements.get(i);
                    if (stmt instanceof TryStmt) {
                        TryStmt tryStmt = (TryStmt) stmt;
                        BlockStmt tryBlock = tryStmt.getTryBlock();
                        List<Statement> tryStatements = tryBlock.getStatements();
                        
                        Iterator<Statement> it = tryStatements.iterator();
                        while (it.hasNext()) {
                            Statement tryStmtInner = it.next();
                            boolean removed = false;
                            
                            if (tryStmtInner instanceof ExpressionStmt) {
                                Expression expr = ((ExpressionStmt) tryStmtInner).getExpression();
                                if (expr instanceof VariableDeclarationExpr) {
                                    VariableDeclarationExpr varDecl = (VariableDeclarationExpr) expr;
                                    String type = varDecl.getVariable(0).getType().asString();
                                    if (type.equals("RenderingContext") || type.equals("SiteRendererSink")) {
                                        it.remove();
                                        removed = true;
                                        System.out.println("Removed statement with type: " + type);
                                    }
                                }
                                
                                if (!removed && expr instanceof MethodCallExpr) {
                                    MethodCallExpr methodCall = (MethodCallExpr) expr;
                                    if (methodCall.getNameAsString().equals("generate")) {
                                        it.remove();
                                        removed = true;
                                        System.out.println("Removed generate() call");
                                    }
                                }
                            }
                        }
                        
                        if (tryBlock.getStatements().isEmpty()) {
                            List<Statement> newStatements = new java.util.ArrayList<>();
                            newStatements.add(new ExpressionStmt(new MethodCallExpr("getLog")
                                .addArgument(new MethodCallExpr("info")
                                    .addArgument(new MethodCallExpr("getName")
                                        .addArgument("Locale.ENGLISH"))
                                    .addArgument("\" - report generated via Maven site lifecycle\""))));
                            
                            int tryStmtIndex = statements.indexOf(tryStmt);
                            statements.remove(tryStmtIndex);
                            statements.addAll(tryStmtIndex, newStatements);
                        }
                    }
                }
            }
        });
    }
}
