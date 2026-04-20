package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * JavaParser-based source code transformation to fix jadler compilation errors.
 * This transformation fixes:
 * 1. Maven pom.xml: Updates Java source/target from 1.6 to 1.7
 * 2. JettyStubHttpServer.java: Updates Jetty 8 APIs to Jetty 11 APIs
 * 3. JadlerHandler.java: Updates javax.servlet to jakarta.servlet for Jetty 11
 * 4. RequestUtils.java: Updates javax.servlet to jakarta.servlet for Jetty 11
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String jadlerRoot = "/workspace/jadler";
        
        fixPomXml(jadlerRoot + "/pom.xml");
        fixJettyStubHttpServer(jadlerRoot + "/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JettyStubHttpServer.java");
        fixJadlerHandler(jadlerRoot + "/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JadlerHandler.java");
        fixRequestUtils(jadlerRoot + "/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/RequestUtils.java");
        
        System.out.println("All transformations completed successfully.");
    }

    public static void fixPomXml(String pomPath) throws Exception {
        File pomFile = new File(pomPath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(pomFile);
        doc.getDocumentElement().normalize();
        
        boolean modified = false;
        NodeList sourceNodes = doc.getElementsByTagName("source");
        for (int i = 0; i < sourceNodes.getLength(); i++) {
            Element sourceElem = (Element) sourceNodes.item(i);
            if ("1.6".equals(sourceElem.getTextContent().trim())) {
                sourceElem.setTextContent("1.7");
                modified = true;
                System.out.println("Updated source from 1.6 to 1.7 in " + pomPath);
            }
        }
        
        NodeList targetNodes = doc.getElementsByTagName("target");
        for (int i = 0; i < targetNodes.getLength(); i++) {
            Element targetElem = (Element) targetNodes.item(i);
            if ("1.6".equals(targetElem.getTextContent().trim())) {
                targetElem.setTextContent("1.7");
                modified = true;
                System.out.println("Updated target from 1.6 to 1.7 in " + pomPath);
            }
        }
        
        if (modified) {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(pomFile);
            transformer.transform(source, result);
            System.out.println("Saved changes to " + pomPath);
        }
    }

    public static void fixJettyStubHttpServer(String filePath) throws Exception {
        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> result = parser.parse(new File(filePath));
        CompilationUnit cu = result.getResult().orElseThrow();
        
        cu.getImports().stream()
            .filter(i -> i.getNameAsString().equals("org.eclipse.jetty.server.Connector"))
            .findFirst()
            .ifPresent(i -> i.setName("org.eclipse.jetty.server.ServerConnector"));
        
        cu.getImports().stream()
            .filter(i -> i.getNameAsString().equals("org.eclipse.jetty.server.nio.SelectChannelConnector"))
            .findFirst()
            .ifPresent(cu::remove);
        
        Optional<ClassOrInterfaceDeclaration> classOpt = cu.getClassByName("JettyStubHttpServer");
        if (classOpt.isPresent()) {
            ClassOrInterfaceDeclaration cls = classOpt.get();
            
            Optional<FieldDeclaration> fieldOpt = cls.getFieldByName("httpConnector");
            if (fieldOpt.isPresent()) {
                FieldDeclaration field = fieldOpt.get();
                field.getVariables().forEach(v -> v.setType("ServerConnector"));
            }
            
            cls.getConstructors().forEach(ctor -> {
                if (ctor.getNameAsString().equals("JettyStubHttpServer")) {
                    ctor.getBody().getStatements().removeIf(s -> 
                        s.toString().contains("setSendServerVersion") || 
                        s.toString().contains("setSendDateHeader") ||
                        s.toString().contains("httpConnector.setPort"));
                    
                    ctor.getBody().getStatements().stream()
                        .filter(s -> s.toString().contains("SelectChannelConnector"))
                        .findFirst()
                        .ifPresent(stmt -> {
                            int idx = ctor.getBody().getStatements().indexOf(stmt);
                            ctor.getBody().getStatements().remove(idx);
                        });
                }
            });
            
            cls.getMethodsByName("getPort").stream().findFirst().ifPresent(method -> {
                method.getBody().ifPresent(body -> {
                    body.getStatements().clear();
                    body.addStatement("return ((ServerConnector) this.server.getConnectors()[0]).getLocalPort();");
                });
            });
        }
        
        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("Fixed JettyStubHttpServer.java using JavaParser");
    }

    public static void fixJadlerHandler(String filePath) throws Exception {
        String content = Files.readString(Paths.get(filePath));
        content = content.replace("javax.servlet.ServletException", "jakarta.servlet.ServletException");
        content = content.replace("javax.servlet.http.HttpServletRequest", "jakarta.servlet.http.HttpServletRequest");
        content = content.replace("javax.servlet.http.HttpServletResponse", "jakarta.servlet.http.HttpServletResponse");
        Files.writeString(Paths.get(filePath), content);
        System.out.println("Fixed JadlerHandler.java (javax -> jakarta servlet)");
    }

    public static void fixRequestUtils(String filePath) throws Exception {
        String content = Files.readString(Paths.get(filePath));
        content = content.replace("javax.servlet.http.HttpServletRequest", "jakarta.servlet.http.HttpServletRequest");
        content = content.replace("{@link javax.servlet.http.HttpServletRequest}", "{@link jakarta.servlet.http.HttpServletRequest}");
        Files.writeString(Paths.get(filePath), content);
        System.out.println("Fixed RequestUtils.java (javax -> jakarta servlet)");
    }
}
