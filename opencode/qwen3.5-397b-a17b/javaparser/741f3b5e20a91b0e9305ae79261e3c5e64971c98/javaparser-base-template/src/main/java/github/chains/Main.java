package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {

    private static final String JACKSON_DATABIND_VERSION = "2.13.4";
    private static final String JACKSON_CORE_ARTIFACT = "jackson-core";
    private static final String JACKSON_DATATYPE_ARTIFACT = "jackson-datatype-jsr310";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <path-to-pom.xml>");
            System.exit(1);
        }

        String pomPath = args[0];
        File pomFile = new File(pomPath);

        if (!pomFile.exists()) {
            System.err.println("POM file not found: " + pomPath);
            System.exit(1);
        }

        System.out.println("Fixing Jackson dependency versions in: " + pomPath);
        fixJacksonVersions(pomFile);
        System.out.println("Jackson dependency versions updated successfully!");
    }

    public static void fixJacksonVersions(File pomFile) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new FileInputStream(pomFile));

        NodeList dependencies = document.getElementsByTagName("dependency");
        
        for (int i = 0; i < dependencies.getLength(); i++) {
            Element dependency = (Element) dependencies.item(i);
            
            NodeList artifactIdNodes = dependency.getElementsByTagName("artifactId");
            NodeList versionNodes = dependency.getElementsByTagName("version");
            
            if (artifactIdNodes.getLength() > 0 && versionNodes.getLength() > 0) {
                String artifactId = artifactIdNodes.item(0).getTextContent();
                
                if (JACKSON_CORE_ARTIFACT.equals(artifactId) || JACKSON_DATATYPE_ARTIFACT.equals(artifactId)) {
                    Element versionElement = (Element) versionNodes.item(0);
                    versionElement.setTextContent(JACKSON_DATABIND_VERSION);
                    System.out.println("Updated " + artifactId + " version to " + JACKSON_DATABIND_VERSION);
                }
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(pomFile);
        transformer.transform(source, result);
    }

    public static void analyzeJavaSource(File javaFile) throws Exception {
        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> result = parser.parse(javaFile);
        
        if (result.isSuccessful() && result.getResult().isPresent()) {
            CompilationUnit cu = result.getResult().get();
            
            cu.accept(new VoidVisitorAdapter<Void>() {
                @Override
                public void visit(MethodCallExpr n, Void arg) {
                    super.visit(n, arg);
                    System.out.println("Found method call: " + n.getName());
                }
            }, null);
        }
    }
}
