package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser javaParser = new JavaParser();

        List<Path> javaFiles = Files.walk(sourceDir)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        for (Path file : javaFiles) {
            try {
                ParseResult<CompilationUnit> result = javaParser.parse(file);
                if (result.isSuccessful() && result.getResult().isPresent()) {
                    CompilationUnit cu = result.getResult().get();
                    boolean modified = fixCompilationUnit(cu);
                    if (modified) {
                        Files.writeString(file, cu.toString());
                        System.out.println("Fixed: " + file);
                    }
                }
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }
    }

    private static boolean fixCompilationUnit(CompilationUnit cu) {
        PGSTransformer transformer = new PGSTransformer();
        transformer.visit(cu, null);
        return transformer.isModified();
    }

    static class PGSTransformer extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        boolean isModified() {
            return modified;
        }

        @Override
        public void visit(CompilationUnit cu, Void arg) {
            super.visit(cu, arg);
            
            NodeList<ImportDeclaration> imports = cu.getImports();
            List<ImportDeclaration> toRemove = new ArrayList<>();
            
            for (ImportDeclaration imp : imports) {
                String name = imp.getNameAsString();
                if (name.equals("org.tinspin.index.PointIndex") ||
                    name.equals("org.tinspin.index.PointDistanceFunction") ||
                    name.equals("org.tinspin.index.PointEntryDist")) {
                    toRemove.add(imp);
                }
            }
            
            for (ImportDeclaration imp : toRemove) {
                imports.remove(imp);
                modified = true;
            }
        }

        @Override
        public void visit(VariableDeclarator var, Void arg) {
            super.visit(var, arg);
            
            Type type = var.getType();
            if (type instanceof ClassOrInterfaceType) {
                ClassOrInterfaceType classType = (ClassOrInterfaceType) type;
                String typeName = classType.getNameAsString();
                
                if (typeName.equals("PointIndex")) {
                    classType.setName("KDTree");
                    modified = true;
                } else if (typeName.equals("PointEntryDist")) {
                    classType.setName("KDTree");
                    modified = true;
                } else if (typeName.equals("PointDistanceFunction")) {
                    classType.setName("java.util.function.BiFunction");
                    classType.setTypeArguments(new NodeList<>(
                        new ClassOrInterfaceType(null, "double[]"),
                        new ClassOrInterfaceType(null, "double[]"),
                        new ClassOrInterfaceType(null, "Double")
                    ));
                    modified = true;
                }
            }
        }

        @Override
        public void visit(MethodCallExpr methodCall, Void arg) {
            super.visit(methodCall, arg);
            
            String methodName = methodCall.getNameAsString();
            
            if (methodName.equals("query1NN")) {
                methodCall.setName("query1nn");
                modified = true;
            }
            
            if (methodName.equals("create") && methodCall.getScope().isPresent()) {
                String scope = methodCall.getScope().get().toString();
                if (scope.equals("KDTree") || scope.endsWith(".KDTree")) {
                    NodeList<com.github.javaparser.ast.expr.Expression> args = methodCall.getArguments();
                    if (args.size() == 2 && args.get(1) instanceof LambdaExpr) {
                        args.remove(1);
                        modified = true;
                    }
                }
            }
            
            if (methodName.equals("create") && methodCall.getScope().isPresent()) {
                String scope = methodCall.getScope().get().toString();
                if (scope.equals("CoverTree") || scope.endsWith(".CoverTree")) {
                    NodeList<com.github.javaparser.ast.expr.Expression> args = methodCall.getArguments();
                    if (args.size() == 3 && args.get(2) instanceof LambdaExpr) {
                        args.remove(2);
                        modified = true;
                    }
                }
            }
        }
    }
}
