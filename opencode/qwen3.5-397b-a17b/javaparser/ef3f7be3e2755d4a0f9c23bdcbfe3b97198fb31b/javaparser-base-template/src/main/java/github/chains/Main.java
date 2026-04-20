package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.VarType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * JavaParser transformation to fix PGS compilation errors related to tinspin-index API changes.
 * 
 * Fixes:
 * 1. Removes import org.tinspin.index.PointIndex
 * 2. Removes import org.tinspin.index.PointDistanceFunction
 * 3. Removes import org.tinspin.index.PointEntryDist
 * 4. Changes KDTree.create(dim, lambda) to KDTree.create(dim)
 * 5. Changes CoverTree.create(dim, slots, metric) to CoverTree.create(dim, slots)
 * 6. Fixes query1NN() return type usage (PointEntryDist -> KDTree.Entry)
 */
public class Main {

    private static final String POINT_INDEX_IMPORT = "org.tinspin.index.PointIndex";
    private static final String POINT_DISTANCE_FUNCTION_IMPORT = "org.tinspin.index.PointDistanceFunction";
    private static final String POINT_ENTRY_DIST_IMPORT = "org.tinspin.index.PointEntryDist";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = Paths.get(args[0]);
        JavaParser parser = createJavaParser();

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            List<Path> javaFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());

            int fixedCount = 0;
            for (Path javaFile : javaFiles) {
                if (fixFile(parser, javaFile)) {
                    fixedCount++;
                    System.out.println("Fixed: " + javaFile);
                }
            }
            System.out.println("Total files fixed: " + fixedCount);
        }
    }

    private static JavaParser createJavaParser() {
        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_8);
        return new JavaParser(config);
    }

    private static boolean fixFile(JavaParser parser, Path javaFile) throws IOException {
        String content = Files.readString(javaFile);
        
        // Quick check if file contains any of the problematic imports
        if (!content.contains("org.tinspin.index.PointIndex") &&
            !content.contains("org.tinspin.index.PointDistanceFunction") &&
            !content.contains("org.tinspin.index.PointEntryDist") &&
            !content.contains("KDTree.create(") &&
            !content.contains("CoverTree.create(")) {
            return false;
        }

        ParseResult<CompilationUnit> result = parser.parse(content);
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + javaFile);
            result.getProblems().forEach(p -> System.err.println("  " + p.getMessage()));
            return false;
        }

        CompilationUnit cu = result.getResult().get();
        boolean modified = false;

        // Fix 1-3: Remove problematic imports
        modified |= removeImports(cu);

        // Fix 4-5: Fix KDTree.create() and CoverTree.create() calls
        modified |= fixCreateCalls(cu);

        // Fix 6: Fix query1NN() return type usage
        modified |= fixQuery1NNCalls(cu);

        if (modified) {
            Files.writeString(javaFile, cu.toString());
        }

        return modified;
    }

    private static boolean removeImports(CompilationUnit cu) {
        boolean modified = false;
        NodeList<ImportDeclaration> imports = cu.getImports();
        
        String[] toRemove = {
            POINT_INDEX_IMPORT,
            POINT_DISTANCE_FUNCTION_IMPORT,
            POINT_ENTRY_DIST_IMPORT
        };

        for (String importName : toRemove) {
            if (imports.removeIf(imp -> imp.getNameAsString().equals(importName))) {
                modified = true;
            }
        }

        return modified;
    }

    private static boolean fixCreateCalls(CompilationUnit cu) {
        CreateCallFixer fixer = new CreateCallFixer();
        fixer.visit(cu, null);
        return fixer.isModified();
    }

    private static boolean fixQuery1NNCalls(CompilationUnit cu) {
        Query1NNFixer fixer = new Query1NNFixer();
        fixer.visit(cu, null);
        return fixer.isModified();
    }

    /**
     * Visitor to fix KDTree.create() and CoverTree.create() calls.
     * Removes the lambda/function parameter from create() calls.
     */
    private static class CreateCallFixer extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);

            if ("create".equals(n.getNameAsString())) {
                String scopeName = n.getScope()
                        .map(Expression::toString)
                        .orElse("");

                if ("KDTree".equals(scopeName) || "CoverTree".equals(scopeName)) {
                    List<Expression> args = n.getArguments();
                    
                    // KDTree.create(2, lambda) -> KDTree.create(2)
                    // CoverTree.create(3, 2, metric) -> CoverTree.create(3, 2)
                    if (args.size() >= 2) {
                        Expression lastArg = args.get(args.size() - 1);
                        if (lastArg instanceof LambdaExpr || isMetricReference(lastArg)) {
                            args.remove(args.size() - 1);
                            modified = true;
                        }
                    }
                }
            }
        }

        private boolean isMetricReference(Expression expr) {
            if (expr instanceof NameExpr) {
                String name = ((NameExpr) expr).getNameAsString();
                return name.contains("Metric") || name.contains("metric") || 
                       name.contains("Distance") || name.contains("distance");
            }
            return false;
        }

        boolean isModified() {
            return modified;
        }
    }

    /**
     * Visitor to fix query1NN() calls and type declarations.
     * The return type changed from PointEntryDist to KDTree.Entry or CoverTree.Entry.
     * We need to update variable declarations and method calls on the result.
     * Also handles PointIndex and PointDistanceFunction type declarations.
     */
    private static class Query1NNFixer extends VoidVisitorAdapter<Void> {
        private boolean modified = false;

        @Override
        public void visit(VariableDeclarator n, Void arg) {
            super.visit(n, arg);

            var type = n.getType();
            String typeStr = type.toString();
            
            // Replace PointEntryDist, PointIndex, PointDistanceFunction with var
            if (typeStr.contains("PointEntryDist") || 
                typeStr.contains("PointIndex") || 
                typeStr.contains("PointDistanceFunction")) {
                n.setType(new VarType());
                modified = true;
            }
        }

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);

            if ("query1NN".equals(n.getNameAsString())) {
                // The method itself is fine, but we need to handle the return type
                // The caller's variable declaration will be fixed by VariableDeclarator visitor
            }
        }

        boolean isModified() {
            return modified;
        }
    }
}
