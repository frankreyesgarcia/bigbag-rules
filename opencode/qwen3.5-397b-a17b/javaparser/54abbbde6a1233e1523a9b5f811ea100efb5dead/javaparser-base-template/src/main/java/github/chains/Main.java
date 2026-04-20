package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Integer> TV_CONSTANTS = new HashMap<>();

    static {
        TV_CONSTANTS.put("SEVEN", 7);
        TV_CONSTANTS.put("TEN", 10);
        TV_CONSTANTS.put("MILLION", 1000000);
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }

        String path = args[0];
        File file = new File(path);

        if (file.isDirectory()) {
            for (File f : file.listFiles((dir, name) -> name.endsWith(".java"))) {
                processFile(f);
            }
        } else {
            processFile(file);
        }

        System.out.println("Transformation completed successfully.");
    }

    private static void processFile(File file) throws Exception {
        System.out.println("Processing: " + file.getAbsolutePath());

        String content = Files.readString(file.toPath());

        content = content.replaceAll("import com\\.jcabi\\.aspects\\.Tv;", "");

        for (Map.Entry<String, Integer> entry : TV_CONSTANTS.entrySet()) {
            content = content.replaceAll("\\bTv\\." + entry.getKey() + "\\b", String.valueOf(entry.getValue()));
        }

        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> result = parser.parse(content);

        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse: " + file.getAbsolutePath());
            result.getProblems().forEach(p -> System.err.println(p.getMessage()));
            return;
        }

        CompilationUnit cu = result.getResult().get();

        TvReplacementVisitor visitor = new TvReplacementVisitor();
        cu.accept(visitor, null);

        Files.writeString(file.toPath(), cu.toString());
        System.out.println("  Fixed: " + file.getAbsolutePath());
    }

    private static class TvReplacementVisitor extends ModifierVisitor<Void> {

        @Override
        public Node visit(NameExpr node, Void arg) {
            String name = node.getNameAsString();
            if (name.startsWith("Tv.")) {
                String constant = name.substring(3);
                if (TV_CONSTANTS.containsKey(constant)) {
                    return new IntegerLiteralExpr(String.valueOf(TV_CONSTANTS.get(constant)));
                }
            }
            return node;
        }
    }
}
