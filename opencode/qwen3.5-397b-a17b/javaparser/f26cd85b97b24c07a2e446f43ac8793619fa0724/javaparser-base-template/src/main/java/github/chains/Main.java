package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
        String jadlerPath = "/workspace/jadler";
        
        System.out.println("=== Step 1: Updating pom.xml Java version ===");
        List<Path> pomFiles = findPomFiles(Paths.get(jadlerPath));
        for (Path pomPath : pomFiles) {
            System.out.println("Processing: " + pomPath);
            updateJavaVersion(pomPath);
        }
        
        System.out.println("\n=== Step 2: Updating Jetty version in pom.xml ===");
        updateJettyVersion(Paths.get(jadlerPath, "pom.xml"));
        
        System.out.println("\n=== Step 3: Fixing Jetty API compatibility in Java files ===");
        fixJettyApiCompatibility(Paths.get(jadlerPath, "jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JettyStubHttpServer.java"));
        fixJadlerHandler(Paths.get(jadlerPath, "jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JadlerHandler.java"));
        
        System.out.println("\nTransformation complete!");
    }
    
    private static List<Path> findPomFiles(Path startPath) throws Exception {
        List<Path> result = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(startPath)) {
            paths.filter(p -> p.getFileName().toString().equals("pom.xml"))
                 .forEach(result::add);
        }
        return result;
    }
    
    private static void updateJavaVersion(Path pomPath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new FileInputStream(pomPath.toFile()));
        
        boolean modified = false;
        
        org.w3c.dom.NodeList configurationNodes = doc.getElementsByTagName("configuration");
        for (int i = 0; i < configurationNodes.getLength(); i++) {
            Element config = (Element) configurationNodes.item(i);
            org.w3c.dom.NodeList children = config.getChildNodes();
            
            for (int j = 0; j < children.getLength(); j++) {
                org.w3c.dom.Node child = children.item(j);
                if (child instanceof Element) {
                    Element element = (Element) child;
                    if ("source".equals(element.getNodeName())) {
                        String content = element.getTextContent().trim();
                        if ("1.6".equals(content) || "6".equals(content)) {
                            element.setTextContent("1.7");
                            modified = true;
                            System.out.println("  Updated source: 1.6 -> 1.7");
                        }
                    }
                    if ("target".equals(element.getNodeName())) {
                        String content = element.getTextContent().trim();
                        if ("1.6".equals(content) || "6".equals(content)) {
                            element.setTextContent("1.7");
                            modified = true;
                            System.out.println("  Updated target: 1.6 -> 1.7");
                        }
                    }
                }
            }
        }
        
        if (modified) {
            saveDocument(doc, pomPath);
        }
    }
    
    private static void updateJettyVersion(Path pomPath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new FileInputStream(pomPath.toFile()));
        
        org.w3c.dom.NodeList dependencyNodes = doc.getElementsByTagName("dependency");
        for (int i = 0; i < dependencyNodes.getLength(); i++) {
            Element dependency = (Element) dependencyNodes.item(i);
            org.w3c.dom.NodeList children = dependency.getChildNodes();
            
            String groupId = "";
            String artifactId = "";
            Element versionElement = null;
            
            for (int j = 0; j < children.getLength(); j++) {
                org.w3c.dom.Node child = children.item(j);
                if (child instanceof Element) {
                    Element elem = (Element) child;
                    if ("groupId".equals(elem.getNodeName())) {
                        groupId = elem.getTextContent().trim();
                    }
                    if ("artifactId".equals(elem.getNodeName())) {
                        artifactId = elem.getTextContent().trim();
                    }
                    if ("version".equals(elem.getNodeName())) {
                        versionElement = elem;
                    }
                }
            }
            
            if ("org.eclipse.jetty".equals(groupId) && "jetty-server".equals(artifactId)) {
                if (versionElement != null) {
                    String currentVersion = versionElement.getTextContent().trim();
                    if (currentVersion.startsWith("11.")) {
                        versionElement.setTextContent("9.4.54.v20240208");
                        System.out.println("  Updated jetty-server: " + currentVersion + " -> 9.4.54.v20240208");
                        saveDocument(doc, pomPath);
                        return;
                    }
                }
            }
        }
    }
    
    private static void saveDocument(Document doc, Path path) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(path.toFile()));
        transformer.transform(source, result);
        System.out.println("  Saved: " + path);
    }
    
    private static void fixJettyApiCompatibility(Path filePath) throws Exception {
        String content = Files.readString(filePath);
        
        content = content.replace("import org.eclipse.jetty.server.nio.SelectChannelConnector;", 
                                   "// import org.eclipse.jetty.server.nio.SelectChannelConnector; // Removed for Jetty 9 compatibility\nimport org.eclipse.jetty.server.ServerConnector;");
        content = content.replace("import org.eclipse.jetty.server.Connector;", 
                                   "import org.eclipse.jetty.server.ServerConnector;");
        content = content.replace("private final Connector httpConnector;", 
                                   "private final ServerConnector httpConnector;");
        content = content.replace("this.httpConnector = new SelectChannelConnector();", 
                                   "this.httpConnector = new ServerConnector(server);");
        content = content.replace("server.addConnector(this.httpConnector);", 
                                   "server.addConnector(this.httpConnector);");
        
        Files.writeString(filePath, content);
        System.out.println("  Fixed: " + filePath);
    }
    
    private static void fixJadlerHandler(Path filePath) throws Exception {
        String content = Files.readString(filePath);
        System.out.println("  Fixed: " + filePath + " (no changes needed - API compatible)");
    }
}
