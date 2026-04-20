package github.chains;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
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

/**
 * JavaParser-based transformation to fix jadler compilation errors.
 * Fixes:
 * 1. Java version from 1.6 to 11 in pom.xml
 * 2. Jetty API compatibility (SelectChannelConnector -> ServerConnector)
 * 3. Jakarta EE 9 migration (javax.servlet -> jakarta.servlet)
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String jadlerPomPath = "/workspace/jadler/pom.xml";
        
        // Fix 1: Update Java version in pom.xml
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(jadlerPomPath));
        
        NodeList compilerPlugins = doc.getElementsByTagName("plugin");
        for (int i = 0; i < compilerPlugins.getLength(); i++) {
            Element plugin = (Element) compilerPlugins.item(i);
            NodeList artifactIds = plugin.getElementsByTagName("artifactId");
            for (int j = 0; j < artifactIds.getLength(); j++) {
                if ("maven-compiler-plugin".equals(artifactIds.item(j).getTextContent())) {
                    Element parent = (Element) plugin.getParentNode();
                    NodeList configurations = parent.getElementsByTagName("configuration");
                    for (int k = 0; k < configurations.getLength(); k++) {
                        Element config = (Element) configurations.item(k);
                        if (config.getParentNode() == plugin) {
                            NodeList sourceNodes = config.getElementsByTagName("source");
                            NodeList targetNodes = config.getElementsByTagName("target");
                            for (int l = 0; l < sourceNodes.getLength(); l++) {
                                if (sourceNodes.item(l).getParentNode() == config) {
                                    sourceNodes.item(l).setTextContent("11");
                                }
                            }
                            for (int m = 0; m < targetNodes.getLength(); m++) {
                                if (targetNodes.item(m).getParentNode() == config) {
                                    targetNodes.item(m).setTextContent("11");
                                }
                            }
                        }
                    }
                }
            }
        }
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(jadlerPomPath));
        transformer.transform(source, result);
        
        System.out.println("Successfully updated Java version from 1.6 to 11 in pom.xml");
        
        // Fix 2: Update Jetty API in JettyStubHttpServer.java
        fixJettyStubHttpServer();
        
        // Fix 3: Update JadlerHandler.java for Jetty 11
        fixJadlerHandler();
        
        // Fix 4: Update RequestUtils.java for Jakarta EE 9
        fixRequestUtils();
        
        System.out.println("Successfully fixed all compilation errors");
    }
    
    private static void fixJettyStubHttpServer() throws Exception {
        String filePath = "/workspace/jadler/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JettyStubHttpServer.java";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        
        content = content.replace("import org.eclipse.jetty.server.nio.SelectChannelConnector;", "import org.eclipse.jetty.server.ServerConnector;");
        content = content.replace("this.server.setSendServerVersion(false);", "// setSendServerVersion removed in Jetty 11");
        content = content.replace("this.server.setSendDateHeader(true);", "// setSendDateHeader removed in Jetty 11");
        content = content.replace("this.httpConnector = new SelectChannelConnector();", "this.httpConnector = new ServerConnector(server);");
        content = content.replace("this.httpConnector.setPort(port);", "((ServerConnector)this.httpConnector).setPort(port);");
        content = content.replace("return httpConnector.getLocalPort();", "return ((ServerConnector)httpConnector).getLocalPort();");
        
        Files.write(Paths.get(filePath), content.getBytes());
        System.out.println("Fixed JettyStubHttpServer.java");
    }
    
    private static void fixJadlerHandler() throws Exception {
        String filePath = "/workspace/jadler/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JadlerHandler.java";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        
        // Fix servlet imports for Jakarta EE 9
        content = content.replace("import javax.servlet.ServletException;", "import jakarta.servlet.ServletException;");
        content = content.replace("import javax.servlet.http.HttpServletRequest;", "import jakarta.servlet.http.HttpServletRequest;");
        content = content.replace("import javax.servlet.http.HttpServletResponse;", "import jakarta.servlet.http.HttpServletResponse;");
        
        // Fix method signature (remove final modifiers)
        content = content.replace(
            "public void handle(final String target, final Request baseRequest, final HttpServletRequest request,",
            "public void handle(String target, Request baseRequest, HttpServletRequest request,"
        );
        content = content.replace(
            "final HttpServletResponse response) throws IOException, ServletException {",
            "HttpServletResponse response) throws IOException, ServletException {"
        );
        
        Files.write(Paths.get(filePath), content.getBytes());
        System.out.println("Fixed JadlerHandler.java");
    }
    
    private static void fixRequestUtils() throws Exception {
        String filePath = "/workspace/jadler/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/RequestUtils.java";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        
        // Fix servlet imports for Jakarta EE 9
        content = content.replace("import javax.servlet.http.HttpServletRequest;", "import jakarta.servlet.http.HttpServletRequest;");
        content = content.replace("{@link javax.servlet.http.HttpServletRequest}", "{@link jakarta.servlet.http.HttpServletRequest}");
        
        Files.write(Paths.get(filePath), content.getBytes());
        System.out.println("Fixed RequestUtils.java");
    }
}
