package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
        String jadlerPath = args.length > 0 ? args[0] : "/workspace/jadler";
        
        System.out.println("Applying Java version transformation to: " + jadlerPath);
        
        findAndTransformPomFiles(Paths.get(jadlerPath));
        
        System.out.println("Transformation complete!");
    }

    public static void findAndTransformPomFiles(Path basePath) throws Exception {
        try (Stream<Path> paths = Files.walk(basePath)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.getFileName().toString().equals("pom.xml"))
                 .forEach(Main::transformPomFile);
        }
    }

    public static void transformPomFile(Path pomPath) {
        try {
            System.out.println("Processing: " + pomPath);
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(pomPath.toFile());
            
            boolean modified = updateJavaVersion(doc);
            
            if (modified) {
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                transformer.setOutputProperty("indent", "yes");
                
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(pomPath.toFile());
                transformer.transform(source, result);
                
                System.out.println("  Updated: " + pomPath);
            } else {
                System.out.println("  No changes needed: " + pomPath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + pomPath + ": " + e.getMessage());
        }
    }

    private static boolean updateJavaVersion(Document doc) {
        boolean modified = false;
        
        org.w3c.dom.NodeList sourceNodes = doc.getElementsByTagName("source");
        for (int i = 0; i < sourceNodes.getLength(); i++) {
            Element sourceElem = (Element) sourceNodes.item(i);
            if (sourceElem.getTextContent().trim().equals("1.6")) {
                sourceElem.setTextContent("1.7");
                modified = true;
                System.out.println("  Changed source from 1.6 to 1.7");
            }
        }
        
        org.w3c.dom.NodeList targetNodes = doc.getElementsByTagName("target");
        for (int i = 0; i < targetNodes.getLength(); i++) {
            Element targetElem = (Element) targetNodes.item(i);
            if (targetElem.getTextContent().trim().equals("1.6")) {
                targetElem.setTextContent("1.7");
                modified = true;
                System.out.println("  Changed target from 1.6 to 1.7");
            }
        }
        
        org.w3c.dom.NodeList signatureNodes = doc.getElementsByTagName("artifactId");
        for (int i = 0; i < signatureNodes.getLength(); i++) {
            Element sigElem = (Element) signatureNodes.item(i);
            if (sigElem.getTextContent().trim().equals("java16")) {
                Element parent = (Element) sigElem.getParentNode();
                org.w3c.dom.NodeList groupIdNodes = parent.getElementsByTagName("groupId");
                if (groupIdNodes.getLength() > 0) {
                    String groupId = groupIdNodes.item(0).getTextContent().trim();
                    if (groupId.equals("org.codehaus.mojo.signature")) {
                        org.w3c.dom.NodeList versionNodes = parent.getElementsByTagName("version");
                        if (versionNodes.getLength() > 0) {
                            versionNodes.item(0).setTextContent("1.3");
                            sigElem.setTextContent("java17");
                            modified = true;
                            System.out.println("  Changed signature from java16 to java17");
                        }
                    }
                }
            }
        }
        
        org.w3c.dom.NodeList jettyNodes = doc.getElementsByTagName("artifactId");
        for (int i = 0; i < jettyNodes.getLength(); i++) {
            Element jettyElem = (Element) jettyNodes.item(i);
            if (jettyElem.getTextContent().trim().equals("jetty-server")) {
                Element parent = (Element) jettyElem.getParentNode();
                org.w3c.dom.NodeList versionNodes = parent.getElementsByTagName("version");
                if (versionNodes.getLength() > 0) {
                    String version = versionNodes.item(0).getTextContent().trim();
                    if (version.startsWith("11.") || version.startsWith("9.") || version.startsWith("10.")) {
                        versionNodes.item(0).setTextContent("8.1.11.v20130520");
                        modified = true;
                        System.out.println("  Changed jetty-server version from " + version + " to 8.1.11.v20130520");
                    }
                }
            }
        }
        
        return modified;
    }
}
