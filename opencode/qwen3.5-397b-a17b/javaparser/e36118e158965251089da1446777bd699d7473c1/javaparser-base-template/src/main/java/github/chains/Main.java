package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        String source = Files.readString(Paths.get(filePath));
        CompilationUnit cu = StaticJavaParser.parse(source);

        new ImportReplacer().visit(cu, null);
        new MapEntryReplacer().visit(cu, null);

        Files.writeString(Paths.get(filePath), cu.toString());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class ImportReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(CompilationUnit cu, Void arg) {
            cu.getImports().stream()
                .filter(imp -> imp.getNameAsString().equals("org.cactoos.map.MapEntry"))
                .findFirst()
                .ifPresent(oldImport -> {
                    cu.remove(oldImport);
                    cu.addImport("java.util.AbstractMap.SimpleEntry");
                });
            super.visit(cu, arg);
        }
    }

    static class MapEntryReplacer extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(ObjectCreationExpr expr, Void arg) {
            if (expr.getType().getNameAsString().equals("MapEntry")) {
                expr.setType("SimpleEntry<String, String>");
            }
            super.visit(expr, arg);
        }
    }
}
