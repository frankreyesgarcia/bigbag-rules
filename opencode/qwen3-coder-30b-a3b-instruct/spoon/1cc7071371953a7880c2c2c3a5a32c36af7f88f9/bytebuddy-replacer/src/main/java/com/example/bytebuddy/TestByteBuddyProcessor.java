import spoon.Launcher;
import spoon.processing.Processor;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtImport;

public class TestByteBuddyProcessor {
    public static void main(String[] args) {
        // Test the processor with a simple example
        System.out.println("Testing ByteBuddyImportProcessor...");
        
        // Create a minimal test case
        Launcher launcher = new Launcher();
        launcher.addInputResource("/workspace/assertj-vavr/src/main/java/org/assertj/vavr/api/VavrAssumptions.java");
        
        // Add our processor
        Processor<CtImport> processor = new ByteBuddyImportProcessor();
        launcher.addProcessor(processor);
        
        // Process the model
        CtModel model = launcher.buildModel();
        launcher.process();
        
        System.out.println("Processor test completed successfully!");
    }
}