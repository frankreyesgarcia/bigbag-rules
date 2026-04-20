package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.ClassExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <source-directory> <output-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        Path outputDir = Paths.get(args[1]);

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(path -> {
                     try {
                         CompilationUnit cu = StaticJavaParser.parse(path);
                         
                         ConstructorFixVisitor visitor = new ConstructorFixVisitor();
                         visitor.visit(cu, null);
                         
                         if (visitor.wasModified()) {
                             Path relativePath = sourceDir.relativize(path);
                             Path fileOutputPath = outputDir.resolve(relativePath);
                             fileOutputPath.getParent().toFile().mkdirs();
                             
                             try (FileWriter writer = new FileWriter(fileOutputPath.toFile())) {
                                 writer.write(cu.toString());
                                 System.out.println("Fixed: " + path);
                             }
                         }
                     } catch (IOException e) {
                         System.err.println("Error processing " + path + ": " + e.getMessage());
                     }
                 });
        } catch (IOException e) {
            System.err.println("Error walking directory: " + e.getMessage());
        }

        System.out.println("Transformation complete.");
    }

    static class ConstructorFixVisitor extends VoidVisitorAdapter<Void> {
        private boolean wasModified = false;

        @Override
        public void visit(ObjectCreationExpr node, Void arg) {
            super.visit(node, arg);

            if ("Constructor".equals(node.getType().getNameAsString())) {
                java.util.List<Expression> arguments = node.getArguments();
                
                if (arguments.size() == 1) {
                    Expression firstArg = arguments.get(0);
                    if (firstArg instanceof ClassExpr) {
                        ClassExpr classExpr = (ClassExpr) firstArg;
                        
                        ObjectCreationExpr loaderOptionsExpr = new ObjectCreationExpr();
                        loaderOptionsExpr.setType("LoaderOptions");
                        
                        node.getArguments().clear();
                        node.getArguments().add(classExpr);
                        node.getArguments().add(loaderOptionsExpr);
                        
                        wasModified = true;
                        
                        CompilationUnit cu = node.findAncestor(CompilationUnit.class).orElse(null);
                        if (cu != null) {
                            cu.addImport("org.yaml.snakeyaml.LoaderOptions");
                        }
                    }
                }
            }
        }

        public boolean wasModified() {
            return wasModified;
        }
    }
}
