package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.LongLiteralExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.WildcardType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        System.out.println("Processing source directory: " + sourceDir);

        List<Path> javaFiles = findJavaFiles(sourceDir);
        System.out.println("Found " + javaFiles.size() + " Java files");

        for (Path javaFile : javaFiles) {
            processFile(javaFile);
        }

        System.out.println("Transformation complete!");
    }

    private static List<Path> findJavaFiles(String directory) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(directory))) {
            return paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }
    }

    private static void processFile(Path filePath) {
        try {
            System.out.println("Processing: " + filePath);
            CompilationUnit cu = StaticJavaParser.parse(filePath);

            SerialVersionUIDVisitor serialVisitor = new SerialVersionUIDVisitor();
            serialVisitor.visit(cu, null);

            RawTypeFixVisitor rawTypeVisitor = new RawTypeFixVisitor();
            rawTypeVisitor.visit(cu, null);

            if (serialVisitor.isModified() || rawTypeVisitor.isModified()) {
                Files.writeString(filePath, cu.toString());
                System.out.println("  -> Modified: " + filePath);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + filePath + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    static class SerialVersionUIDVisitor extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        @Override
        public void visit(ClassOrInterfaceDeclaration node, Void arg) {
            super.visit(node, arg);

            if (node.isInterface() || node.isAbstract() && !hasSerializableInterface(node)) {
                return;
            }

            if (!hasSerializableInterface(node)) {
                return;
            }

            boolean hasSerialVersionUID = node.getFields().stream()
                    .anyMatch(field -> field.getVariables().stream()
                            .anyMatch(v -> v.getNameAsString().equals("serialVersionUID")));

            if (!hasSerialVersionUID) {
                FieldDeclaration field = node.addField("long", "serialVersionUID",
                        Modifier.Keyword.PRIVATE, Modifier.Keyword.STATIC, Modifier.Keyword.FINAL);
                field.getVariables().forEach(v -> v.setInitializer(new LongLiteralExpr("1L")));

                NormalAnnotationExpr annotation = new NormalAnnotationExpr();
                annotation.setName("SuppressWarnings");
                annotation.addPair("value", "\"all\"");
                field.addAnnotation(annotation);

                modified = true;
                System.out.println("    Added serialVersionUID to " + node.getNameAsString());
            }
        }

        private boolean hasSerializableInterface(ClassOrInterfaceDeclaration node) {
            for (ClassOrInterfaceType implementedType : node.getImplementedTypes()) {
                if (implementedType.getNameAsString().equals("Serializable")) {
                    return true;
                }
            }
            for (ClassOrInterfaceType extendedType : node.getExtendedTypes()) {
                String name = extendedType.getNameAsString();
                if (name.equals("Exception") || name.equals("RuntimeException") || 
                    name.equals("Throwable") || name.equals("Error")) {
                    return true;
                }
            }
            return false;
        }

        public boolean isModified() {
            return modified;
        }
    }

    static class RawTypeFixVisitor extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        @Override
        public void visit(ClassOrInterfaceType node, Void arg) {
            super.visit(node, arg);

            if (!node.getTypeArguments().isPresent() && node.getTypeArguments().isEmpty()) {
                String typeName = node.getNameAsString();

                if (typeName.contains(".")) {
                    String[] parts = typeName.split("\\.");
                    typeName = parts[parts.length - 1];
                }

                if (shouldFixRawType(typeName)) {
                    NodeList<Type> typeArgs = new NodeList<>();
                    if ("AbstractProject".equals(typeName)) {
                        typeArgs.add(new WildcardType());
                        typeArgs.add(new WildcardType());
                    } else {
                        typeArgs.add(new WildcardType());
                    }

                    node.setTypeArguments(typeArgs);
                    modified = true;
                    System.out.println("    Fixed raw type: " + node.getNameAsString());
                }
            }
        }

        private boolean shouldFixRawType(String typeName) {
            return "Class".equals(typeName) ||
                   "Constructor".equals(typeName) ||
                   "AbstractProject".equals(typeName) ||
                   "CoverageReportAdapterDescriptor".equals(typeName) ||
                   "DefaultSourceFileResolverDescriptor".equals(typeName);
        }

        public boolean isModified() {
            return modified;
        }
    }
}
