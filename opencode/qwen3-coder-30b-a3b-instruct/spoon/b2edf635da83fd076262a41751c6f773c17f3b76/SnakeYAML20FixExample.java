import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

/**
 * Example usage of SnakeYAML 2.0 fix transformation
 */
public class SnakeYAML20FixExample {
    public static void main(String[] args) {
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        
        // Set the source directory to process
        launcher.addInputResource("src/main/java");
        
        // Set the output directory
        launcher.setSourceOutputDirectory("src/main/java-fixed");
        
        // Add the processor
        launcher.addProcessor(new SnakeYAML20Fix());
        
        // Build the model
        CtModel model = launcher.buildModel();
        
        // Process the model
        launcher.process();
        
        // Export the fixed code
        launcher.export();
        
        System.out.println("SnakeYAML 2.0 fix transformation completed!");
    }
}