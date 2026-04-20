package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.NodeList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String targetFile = "/workspace/license-maven-plugin/license-maven-plugin/src/main/java/com/mycila/maven/plugin/license/dependencies/MavenProjectLicenses.java";
        transformFile(Paths.get(targetFile));
    }

    private static void transformFile(Path path) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(path);
        
        cu.findAll(MethodCallExpr.class).forEach(methodCall -> {
            if ("buildDependencyGraph".equals(methodCall.getNameAsString())) {
                NodeList<com.github.javaparser.ast.expr.Expression> args = methodCall.getArguments();
                System.out.println("Found buildDependencyGraph with " + args.size() + " args");
                if (args.size() == 2) {
                    com.github.javaparser.ast.expr.Expression firstArg = args.get(0);
                    if (firstArg instanceof NameExpr) {
                        NameExpr firstExpr = (NameExpr) firstArg;
                        if ("project".equals(firstExpr.getNameAsString())) {
                            args.set(0, new NameExpr("getBuildingRequest()"));
                            System.out.println("  Transformed: project -> getBuildingRequest()");
                        }
                    }
                }
            }
        });
        
        Files.writeString(path, cu.toString());
        System.out.println("Written: " + path);
    }
}
