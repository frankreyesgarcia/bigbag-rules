package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: java Main <source-directory> <pom-file-path>");
            System.exit(1);
        }

        String sourceDir = args[0];
        String pomPath = args[1];
        
        fixJacksonVersion(pomPath);
        System.out.println("Fixed Jackson version mismatch in: " + pomPath);
        
        List<Path> javaFiles = findJavaFiles(Paths.get(sourceDir));
        for (Path file : javaFiles) {
            try {
                fixJacksonExceptionHandling(file);
                System.out.println("Processed: " + file);
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }
    }

    private static List<Path> findJavaFiles(Path directory) throws IOException {
        List<Path> javaFiles = new ArrayList<>();
        Files.walk(directory)
            .filter(p -> p.toString().endsWith(".java"))
            .forEach(javaFiles::add);
        return javaFiles;
    }

    public static void fixJacksonVersion(String pomPath) throws Exception {
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document doc = builder.parse(new File(pomPath));

        org.w3c.dom.NodeList dependencies = doc.getElementsByTagName("dependency");
        
        String jacksonDatabindVersion = null;
        org.w3c.dom.Element jacksonCoreElement = null;
        
        for (int i = 0; i < dependencies.getLength(); i++) {
            org.w3c.dom.Element dep = (org.w3c.dom.Element) dependencies.item(i);
            String groupId = getCellValue(dep, "groupId");
            String artifactId = getCellValue(dep, "artifactId");
            
            if ("com.fasterxml.jackson.core".equals(groupId) && "jackson-databind".equals(artifactId)) {
                jacksonDatabindVersion = getCellValue(dep, "version");
            }
            
            if ("com.fasterxml.jackson.core".equals(groupId) && "jackson-core".equals(artifactId)) {
                jacksonCoreElement = dep;
            }
        }
        
        if (jacksonDatabindVersion != null && jacksonCoreElement != null) {
            org.w3c.dom.Element versionElement = (org.w3c.dom.Element) jacksonCoreElement.getElementsByTagName("version").item(0);
            if (versionElement != null) {
                versionElement.setTextContent(jacksonDatabindVersion);
            }
        }

        javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
        javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
        javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
        javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File(pomPath));
        transformer.transform(source, result);
    }

    private static String getCellValue(org.w3c.dom.Element element, String tagName) {
        org.w3c.dom.NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return null;
    }

    private static void fixJacksonExceptionHandling(Path filePath) throws IOException {
        String content = Files.readString(filePath);
        
        if (!content.contains("ObjectWriter") || !content.contains("writeValue")) {
            return;
        }

        CompilationUnit cu = StaticJavaParser.parse(filePath);

        cu.findAll(MethodDeclaration.class).forEach(method -> {
            method.findAll(MethodCallExpr.class).forEach(methodCall -> {
                if ("writeValue".equals(methodCall.getNameAsString())) {
                    if (methodCall.getScope().isPresent()) {
                        String scope = methodCall.getScope().get().toString();
                        if (scope.contains("writer") || scope.contains("ObjectWriter")) {
                            wrapWriteValueInTryCatch(methodCall);
                        }
                    }
                }
            });
        });

        Files.writeString(filePath, cu.toString());
    }

    private static void wrapWriteValueInTryCatch(MethodCallExpr methodCall) {
        if (methodCall.getParentNode().isEmpty()) {
            return;
        }

        if (!(methodCall.getParentNode().get() instanceof BlockStmt)) {
            return;
        }

        BlockStmt parentBlock = (BlockStmt) methodCall.getParentNode().get();
        
        NodeList<Statement> originalStatements = parentBlock.getStatements();
        int methodCallIndex = -1;
        
        for (int i = 0; i < originalStatements.size(); i++) {
            if (originalStatements.get(i).toString().contains("writeValue")) {
                methodCallIndex = i;
                break;
            }
        }
        
        if (methodCallIndex == -1) {
            return;
        }

        TryStmt tryStmt = new TryStmt();
        BlockStmt tryBlock = new BlockStmt();
        tryBlock.addStatement(originalStatements.get(methodCallIndex));
        tryStmt.setTryBlock(tryBlock);

        CatchClause catchClause = new CatchClause(
            new Parameter(
                new ClassOrInterfaceType(null, "IOException"),
                new SimpleName("e")
            ),
            new BlockStmt()
        );
        catchClause.getBody().addStatement(
            new ThrowStmt(
                new com.github.javaparser.ast.expr.ObjectCreationExpr(
                    null,
                    new ClassOrInterfaceType(null, "IOException"),
                    new NodeList<>(new StringLiteralExpr("Error writing JSON"))
                )
            )
        );
        
        NodeList<CatchClause> catchClauses = new NodeList<>();
        catchClauses.add(catchClause);
        tryStmt.setCatchClauses(catchClauses);

        NodeList<Statement> newStatements = new NodeList<>();
        for (int i = 0; i < originalStatements.size(); i++) {
            if (i == methodCallIndex) {
                newStatements.add(tryStmt);
            } else {
                newStatements.add(originalStatements.get(i));
            }
        }
        parentBlock.setStatements(newStatements);
    }
}
