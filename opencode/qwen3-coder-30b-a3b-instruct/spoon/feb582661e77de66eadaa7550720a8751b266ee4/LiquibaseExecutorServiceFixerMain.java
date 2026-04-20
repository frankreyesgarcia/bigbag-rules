import spoon.Launcher;
import spoon.processing.Processor;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.VirtualFile;

import java.io.File;
import java.util.Arrays;

/**
 * Main class to run the Liquibase ExecutorService API fix transformation
 */
public class LiquibaseExecutorServiceFixerMain {
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java LiquibaseExecutorServiceFixerMain <source-directory> [output-directory]");
            System.exit(1);
        }
        
        String sourceDir = args[0];
        String outputDir = args.length > 1 ? args[1] : sourceDir + "_fixed";
        
        // Create launcher
        Launcher launcher = new Launcher();
        
        // Add the source directory
        launcher.addInputResource(sourceDir);
        
        // Set output directory
        launcher.setSourceOutputDirectory(outputDir);
        
        // Add our processor
        launcher.addProcessor(new LiquibaseExecutorServiceFixer());
        
        // Build the model
        launcher.buildModel();
        
        // Process the model
        launcher.process();
        
        // Pretty print the results
        launcher.prettyprint();
        
        System.out.println("Transformation completed. Fixed files are in: " + outputDir);
    }
}