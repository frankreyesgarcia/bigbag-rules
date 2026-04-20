package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.VoidType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("File not found: " + file.getAbsolutePath());
            System.exit(1);
        }

        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        CompilationUnit cu = StaticJavaParser.parse(content);

        boolean modified = false;

        if (filePath.contains("JettyStubHttpServer.java")) {
            modified = transformJettyStubHttpServer(cu);
        } else if (filePath.contains("JadlerHandler.java")) {
            modified = transformJadlerHandler(cu);
        }

        if (modified) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(cu.toString());
            }
            System.out.println("Successfully transformed: " + filePath);
        } else {
            System.out.println("No changes needed: " + filePath);
        }
    }

    private static boolean transformJettyStubHttpServer(CompilationUnit cu) {
        boolean modified = false;

        List<ImportDeclaration> toRemove = cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().equals("org.eclipse.jetty.server.nio.SelectChannelConnector"))
            .collect(Collectors.toList());
        toRemove.forEach(ImportDeclaration::remove);
        if (!toRemove.isEmpty()) modified = true;

        cu.addImport("org.eclipse.jetty.server.ServerConnector");
        cu.addImport("org.eclipse.jetty.server.HttpConfiguration");
        cu.addImport("org.eclipse.jetty.server.HttpConnectionFactory");

        for (ClassOrInterfaceDeclaration cls : cu.findAll(ClassOrInterfaceDeclaration.class)) {
            if (cls.getNameAsString().equals("JettyStubHttpServer")) {
                for (ConstructorDeclaration ctor : cls.getConstructors()) {
                    BlockStmt body = ctor.getBody();
                    NodeList<Parameter> params = ctor.getParameters();
                    
                    if (params.size() == 1 && params.get(0).getNameAsString().equals("port")) {
                        List<Statement> toRemoveStmts = body.getStatements().stream()
                            .filter(stmt -> {
                                if (stmt instanceof ExpressionStmt) {
                                    ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                                    if (exprStmt.getExpression() instanceof MethodCallExpr) {
                                        MethodCallExpr method = (MethodCallExpr) exprStmt.getExpression();
                                        return method.getNameAsString().equals("setSendServerVersion") ||
                                            method.getNameAsString().equals("setSendDateHeader") ||
                                            method.getNameAsString().equals("setPort");
                                    }
                                }
                                if (stmt instanceof ExpressionStmt) {
                                    ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                                    if (exprStmt.getExpression() instanceof VariableDeclarationExpr) {
                                        VariableDeclarationExpr var = (VariableDeclarationExpr) exprStmt.getExpression();
                                        for (com.github.javaparser.ast.body.VariableDeclarator declarator : var.getVariables()) {
                                            if (declarator.getType().asString().contains("SelectChannelConnector")) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                                return false;
                            })
                            .collect(Collectors.toList());
                        toRemoveStmts.forEach(body::remove);

                        int insertIndex = 0;
                        for (int i = 0; i < body.getStatements().size(); i++) {
                            if (body.getStatement(i).toString().contains("new Server()")) {
                                insertIndex = i + 1;
                                break;
                            }
                        }

                        Statement httpConfigStmt = StaticJavaParser.parseStatement("HttpConfiguration httpConfig = new HttpConfiguration();");
                        Statement sendServerStmt = StaticJavaParser.parseStatement("httpConfig.setSendServerVersion(false);");
                        Statement sendDateStmt = StaticJavaParser.parseStatement("httpConfig.setSendDateHeader(false);");
                        Statement connectorStmt = StaticJavaParser.parseStatement("this.httpConnector = new ServerConnector(server, new HttpConnectionFactory(httpConfig));");
                        Statement portStmt = StaticJavaParser.parseStatement("((ServerConnector) this.httpConnector).setPort(port);");

                        body.addStatement(insertIndex, httpConfigStmt);
                        body.addStatement(insertIndex + 1, sendServerStmt);
                        body.addStatement(insertIndex + 2, sendDateStmt);
                        body.addStatement(insertIndex + 3, connectorStmt);
                        body.addStatement(insertIndex + 4, portStmt);

                        modified = true;
                    }
                }

                for (MethodDeclaration method : cls.getMethods()) {
                    if (method.getNameAsString().equals("getPort")) {
                        method.getBody().ifPresent(body -> {
                            body.getStatements().clear();
                            body.addStatement(StaticJavaParser.parseStatement("return server.getPort();"));
                        });
                        modified = true;
                    }
                }
            }
        }

        return modified;
    }

    private static boolean transformJadlerHandler(CompilationUnit cu) {
        boolean modified = false;

        for (MethodDeclaration method : cu.findAll(MethodDeclaration.class)) {
            if (method.getNameAsString().equals("handle") && method.getParameters().size() == 4) {
                Parameter targetParam = method.getParameter(0);
                if (targetParam.getType().asString().equals("String")) {
                    method.getAnnotations().removeIf(a -> a.getNameAsString().equals("Override"));
                    
                    NodeList<Parameter> newParams = new NodeList<>();
                    newParams.add(new Parameter(new ClassOrInterfaceType(null, "java.lang.String"), "target"));
                    newParams.add(new Parameter(new ClassOrInterfaceType(null, "org.eclipse.jetty.server.Request"), "baseRequest"));
                    newParams.add(new Parameter(new ClassOrInterfaceType(null, "javax.servlet.http.HttpServletRequest"), "request"));
                    newParams.add(new Parameter(new ClassOrInterfaceType(null, "javax.servlet.http.HttpServletResponse"), "response"));
                    
                    method.setParameters(newParams);
                    modified = true;
                }
            }
        }

        return modified;
    }
}
