import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleJakartaMvcFixer {
    
    public static void main(String[] args) throws IOException {
        // Process all Java files in the source directory
        String sourceDir = "./jakartaee-mvc-sample/src";
        
        // Find all Java files
        List<String> javaFiles = Files.walk(Paths.get(sourceDir))
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".java"))
                .map(path -> path.toString())
                .collect(Collectors.toList());
        
        System.out.println("Found " + javaFiles.size() + " Java files to process");
        
        // Process each file
        for (String filePath : javaFiles) {
            processJavaFile(filePath);
        }
        
        System.out.println("Transformation completed successfully!");
    }
    
    private static void processJavaFile(String filePath) throws IOException {
        // Read the file content
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        
        // Replace javax.mvc with jakarta.mvc
        String updatedContent = content.replace("javax.mvc", "jakarta.mvc");
        
        // Only write if content changed
        if (!content.equals(updatedContent)) {
            Files.write(Paths.get(filePath), updatedContent.getBytes());
            System.out.println("Updated: " + filePath);
        }
    }
}