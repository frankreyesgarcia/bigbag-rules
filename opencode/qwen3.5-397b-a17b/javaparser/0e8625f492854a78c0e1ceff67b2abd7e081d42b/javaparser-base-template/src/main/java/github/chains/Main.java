package github.chains;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <path-to-pom.xml>");
            System.exit(1);
        }

        File pomFile = new File(args[0]);
        if (!pomFile.exists()) {
            System.err.println("File not found: " + pomFile.getAbsolutePath());
            System.exit(1);
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(pomFile);

        NodeList pluginNodes = doc.getElementsByTagName("plugin");
        boolean found = false;

        for (int i = 0; i < pluginNodes.getLength(); i++) {
            Element plugin = (Element) pluginNodes.item(i);
            NodeList artifactIdNodes = plugin.getElementsByTagName("artifactId");
            
            for (int j = 0; j < artifactIdNodes.getLength(); j++) {
                Node artifactIdNode = artifactIdNodes.item(j);
                if ("maven-compiler-plugin".equals(artifactIdNode.getTextContent().trim())) {
                    Element parent = (Element) artifactIdNode.getParentNode();
                    NodeList configNodes = parent.getElementsByTagName("configuration");
                    
                    if (configNodes.getLength() > 0) {
                        Element config = (Element) configNodes.item(0);
                        found = updateElement(config, "source", "1.7") || found;
                        found = updateElement(config, "target", "1.7") || found;
                    }
                    break;
                }
            }
        }

        if (found) {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(pomFile);
            transformer.transform(source, result);

            System.out.println("Successfully updated " + pomFile.getAbsolutePath());
            System.out.println("Changed source and target from 1.6 to 1.7");
        } else {
            System.out.println("No maven-compiler-plugin configuration found to update in " + pomFile.getAbsolutePath());
        }
    }

    private static boolean updateElement(Element parent, String tagName, String newValue) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        if (nodes.getLength() > 0) {
            Node node = nodes.item(0);
            if ("1.6".equals(node.getTextContent().trim())) {
                node.setTextContent(newValue);
                System.out.println("Updated " + tagName + " from 1.6 to " + newValue);
                return true;
            }
        }
        return false;
    }
}
