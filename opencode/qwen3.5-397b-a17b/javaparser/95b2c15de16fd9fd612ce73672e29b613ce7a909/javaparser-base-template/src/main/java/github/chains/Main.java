package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <project-root-path>");
            System.exit(1);
        }

        String projectRoot = args[0];
        
        fixPomXml(Paths.get(projectRoot, "pom.xml"));
        fixJettyStubHttpServer(Paths.get(projectRoot, "jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JettyStubHttpServer.java"));
        fixJadlerHandler(Paths.get(projectRoot, "jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JadlerHandler.java"));
        fixRequestUtils(Paths.get(projectRoot, "jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/RequestUtils.java"));
        
        System.out.println("Transformation completed successfully");
    }

    private static void fixPomXml(Path pomPath) throws Exception {
        if (!Files.exists(pomPath)) {
            System.err.println("pom.xml not found at: " + pomPath);
            return;
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(pomPath.toFile());

        NodeList buildNodes = doc.getElementsByTagName("build");
        for (int i = 0; i < buildNodes.getLength(); i++) {
            Node buildNode = buildNodes.item(i);
            if (buildNode.getParentNode().getNodeName().equals("project")) {
                fixCompilerPlugin(doc, (Element) buildNode);
                break;
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(pomPath.toFile());
        transformer.transform(source, result);

        System.out.println("Successfully updated pom.xml");
    }

    private static void fixCompilerPlugin(Document doc, Element buildElement) {
        NodeList pluginNodes = buildElement.getElementsByTagName("plugin");
        for (int i = 0; i < pluginNodes.getLength(); i++) {
            Element plugin = (Element) pluginNodes.item(i);
            NodeList artifactIdNodes = plugin.getElementsByTagName("artifactId");
            for (int j = 0; j < artifactIdNodes.getLength(); j++) {
                if ("maven-compiler-plugin".equals(artifactIdNodes.item(j).getTextContent())) {
                    Element parent = (Element) plugin.getParentNode();
                    if ("plugins".equals(parent.getNodeName())) {
                        NodeList configNodes = plugin.getElementsByTagName("configuration");
                        if (configNodes.getLength() > 0) {
                            Element config = (Element) configNodes.item(0);
                            updateVersionElement(doc, config, "source", "1.8");
                            updateVersionElement(doc, config, "target", "1.8");
                        }
                        return;
                    }
                }
            }
        }
    }

    private static void updateVersionElement(Document doc, Element parent, String tagName, String newValue) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        if (nodes.getLength() > 0) {
            Node node = nodes.item(0);
            node.setTextContent(newValue);
            System.out.println("Updated " + tagName + " to " + newValue);
        }
    }

    private static void fixJettyStubHttpServer(Path filePath) throws Exception {
        if (!Files.exists(filePath)) {
            System.err.println("File not found: " + filePath);
            return;
        }

        CompilationUnit cu = StaticJavaParser.parse(filePath);
        
        cu.getImports().removeIf(i -> i.getNameAsString().equals("org.eclipse.jetty.server.nio.SelectChannelConnector"));
        
        cu.getImports().stream()
            .filter(i -> i.getNameAsString().equals("org.eclipse.jetty.server.Connector"))
            .findFirst()
            .ifPresent(connectorImport -> connectorImport.setName("org.eclipse.jetty.server.ServerConnector"));
        
        cu.findAll(FieldDeclaration.class).stream()
            .filter(f -> f.getVariable(0).getNameAsString().equals("httpConnector"))
            .findFirst()
            .ifPresent(field -> {
                if (field.getElementType().isClassOrInterfaceType()) {
                    field.getElementType().asClassOrInterfaceType().setName("ServerConnector");
                }
            });
        
        cu.findAll(ClassOrInterfaceDeclaration.class).stream()
            .filter(c -> c.getNameAsString().equals("JettyStubHttpServer"))
            .findFirst()
            .ifPresent(clazz -> {
                clazz.findAll(ConstructorDeclaration.class).stream()
                    .filter(c -> c.getNameAsString().equals("JettyStubHttpServer"))
                    .filter(c -> c.getParameters().size() > 0)
                    .findFirst()
                    .ifPresent(constructor -> {
                        constructor.getBody().getStatements().removeIf(stmt -> {
                            if (stmt instanceof ExpressionStmt) {
                                ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                                if (exprStmt.getExpression() instanceof MethodCallExpr) {
                                    MethodCallExpr methodCall = (MethodCallExpr) exprStmt.getExpression();
                                    if (methodCall.getScope().isPresent() && 
                                        methodCall.getScope().get().toString().equals("this.server")) {
                                        String methodName = methodCall.getNameAsString();
                                        return methodName.equals("setSendServerVersion") || methodName.equals("setSendDateHeader");
                                    }
                                }
                            }
                            return false;
                        });
                        
                        constructor.getBody().getStatements().stream()
                            .filter(s -> s instanceof ExpressionStmt)
                            .map(s -> (ExpressionStmt) s)
                            .filter(e -> e.getExpression() instanceof AssignExpr)
                            .map(e -> (AssignExpr) e.getExpression())
                            .filter(a -> a.getTarget().toString().equals("this.httpConnector"))
                            .findFirst()
                            .ifPresent(assignExpr -> {
                                ObjectCreationExpr creation = assignExpr.getValue().asObjectCreationExpr();
                                creation.setType("ServerConnector");
                                creation.getArguments().clear();
                                creation.addArgument(new NameExpr("this.server"));
                                
                                constructor.getBody().getStatements().removeIf(stmt -> {
                                    if (stmt instanceof ExpressionStmt) {
                                        ExpressionStmt exprStmt = (ExpressionStmt) stmt;
                                        if (exprStmt.getExpression() instanceof MethodCallExpr) {
                                            MethodCallExpr methodCall = (MethodCallExpr) exprStmt.getExpression();
                                            if (methodCall.getScope().isPresent() && 
                                                methodCall.getScope().get().toString().equals("this.httpConnector") &&
                                                methodCall.getNameAsString().equals("setPort")) {
                                                return true;
                                            }
                                        }
                                    }
                                    return false;
                                });
                                
                                int insertIndex = -1;
                                for (int i = 0; i < constructor.getBody().getStatements().size(); i++) {
                                    if (constructor.getBody().getStatement(i).toString().contains("new ServerConnector")) {
                                        insertIndex = i + 1;
                                        break;
                                    }
                                }
                                if (insertIndex >= 0) {
                                    MethodCallExpr setPortCall = new MethodCallExpr();
                                    setPortCall.setScope(new NameExpr("this.httpConnector"));
                                    setPortCall.setName("setPort");
                                    setPortCall.addArgument(new NameExpr(constructor.getParameters().get(0).getNameAsString()));
                                    constructor.getBody().addStatement(insertIndex, setPortCall);
                                }
                            });
                    });
            });
        
        Files.writeString(filePath, cu.toString());
        System.out.println("Fixed JettyStubHttpServer.java");
    }

    private static void fixJadlerHandler(Path filePath) throws Exception {
        if (!Files.exists(filePath)) {
            System.err.println("File not found: " + filePath);
            return;
        }

        CompilationUnit cu = StaticJavaParser.parse(filePath);
        
        cu.getImports().stream()
            .filter(i -> i.getNameAsString().startsWith("javax.servlet"))
            .forEach(importDecl -> {
                importDecl.setName(importDecl.getNameAsString().replace("javax.servlet", "jakarta.servlet"));
            });
        
        Files.writeString(filePath, cu.toString());
        System.out.println("Fixed JadlerHandler.java");
    }

    private static void fixRequestUtils(Path filePath) throws Exception {
        if (!Files.exists(filePath)) {
            System.err.println("File not found: " + filePath);
            return;
        }

        CompilationUnit cu = StaticJavaParser.parse(filePath);
        
        cu.getImports().stream()
            .filter(i -> i.getNameAsString().startsWith("javax.servlet"))
            .forEach(importDecl -> {
                importDecl.setName(importDecl.getNameAsString().replace("javax.servlet", "jakarta.servlet"));
            });
        
        Files.writeString(filePath, cu.toString());
        System.out.println("Fixed RequestUtils.java");
    }
}
