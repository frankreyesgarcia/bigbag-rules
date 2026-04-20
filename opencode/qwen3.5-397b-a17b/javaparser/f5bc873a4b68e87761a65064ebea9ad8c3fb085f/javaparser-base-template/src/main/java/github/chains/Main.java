package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.TryStmt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceDir = args.length > 0 ? args[0] : "/workspace/myfaces-tobago";
        
        System.out.println("Scanning for Java files in: " + sourceDir);
        
        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> p.toString().contains("tobago-theme-plugin"))
                .forEach(Main::processFile);
        }
        
        System.out.println("Transformation complete!");
    }
    
    private static void processFile(Path path) {
        try {
            System.out.println("Processing: " + path);
            
            CompilationUnit cu = StaticJavaParser.parse(path);
            boolean modified = false;
            
            for (int i = cu.getImports().size() - 1; i >= 0; i--) {
                String importName = cu.getImports().get(i).getNameAsString();
                if (importName.equals("org.apache.maven.artifact.DependencyResolutionRequiredException")) {
                    cu.getImports().get(i).remove();
                    modified = true;
                    System.out.println("  Removed import: " + importName);
                }
            }
            
            cu.findAll(TryStmt.class).forEach(tryStmt -> {
                for (int i = tryStmt.getCatchClauses().size() - 1; i >= 0; i--) {
                    CatchClause catchClause = tryStmt.getCatchClauses().get(i);
                    String exceptionName = catchClause.getParameter().getType().asString();
                    if (exceptionName.equals("DependencyResolutionRequiredException")) {
                        catchClause.remove();
                        System.out.println("  Removed catch clause for: DependencyResolutionRequiredException");
                    }
                }
            });
            
            if (modified) {
                Files.writeString(path, cu.toString());
                System.out.println("  File updated: " + path);
            }
            
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }
}
