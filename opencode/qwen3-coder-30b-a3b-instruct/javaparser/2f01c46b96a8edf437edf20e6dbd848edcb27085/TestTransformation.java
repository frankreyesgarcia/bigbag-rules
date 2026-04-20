import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import java.io.File;
import java.io.IOException;

public class TestTransformation {
    public static void main(String[] args) throws IOException {
        // Parse our test file
        CompilationUnit cu = StaticJavaParser.parse(new File("/workspace/test_xpp3dom.java"));
        
        // Apply our transformation
        Main.Xpp3DomReplacementRule.applyTransformation("/workspace/test_xpp3dom.java");
        
        System.out.println("Transformation applied successfully!");
        
        // Let's verify it was removed
        cu = StaticJavaParser.parse(new File("/workspace/test_xpp3dom.java"));
        
        // Check if Xpp3Dom import was removed
        boolean hasXpp3DomImport = cu.getImports().stream()
            .anyMatch(importDecl -> importDecl.getNameAsString().equals("org.codehaus.plexus.util.xml.Xpp3Dom"));
        
        if (!hasXpp3DomImport) {
            System.out.println("✓ Xpp3Dom import successfully removed");
        } else {
            System.out.println("✗ Xpp3Dom import still present");
        }
        
        System.out.println("Test completed successfully");
    }
}