import spoon.Launcher;
import spoon.processing.Processor;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtImport;

public class ByteBuddyImportReplacer {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ByteBuddyImportReplacer <path-to-project>");
            return;
        }
        
        String projectPath = args[0];
        
        // Create the launcher
        Launcher launcher = new Launcher();
        launcher.addInputResource(projectPath);
        launcher.setSourceOutputDirectory(projectPath + "/src/main/java");
        
        // Add our processor
        Processor<CtImport> processor = new ByteBuddyImportProcessor();
        launcher.addProcessor(processor);
        
        // Process the model
        CtModel model = launcher.buildModel();
        launcher.process();
        
        System.out.println("ByteBuddy import replacement completed.");
    }
}