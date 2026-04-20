import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.processing.AbstractProcessor;
import spoon.reflect.visitor.filter.TypeFilter;

public class JakartaMvcImportFixer {
    
    public static void main(String[] args) {
        System.out.println("Starting Jakarta MVC import fixer...");
        
        // Create a Spoon launcher
        Launcher launcher = new Launcher();
        
        // Set the source directories
        launcher.addInputResource("./jakartaee-mvc-sample/src");
        
        // Set the output directory
        launcher.setSourceOutputDirectory("./output");
        
        // Add the processor to fix javax.mvc imports to jakarta.mvc
        launcher.addProcessor(new AbstractProcessor<CtImport>() {
            @Override
            public void process(CtImport ctImport) {
                // Check if this import is from javax.mvc package
                if (ctImport.getReference() != null && 
                    ctImport.getReference().getQualifiedName().startsWith("javax.mvc")) {
                    
                    // Create the new jakarta.mvc import reference
                    String newQualifiedName = ctImport.getReference().getQualifiedName().replace("javax.mvc", "jakarta.mvc");
                    
                    // Replace the import reference
                    CtTypeReference<?> newReference = getFactory().Type().createReference(newQualifiedName);
                    ctImport.setReference(newReference);
                }
            }
        });
        
        try {
            // Build and process the model
            CtModel model = launcher.buildModel();
            launcher.process();
            
            System.out.println("Transformation completed successfully!");
            System.out.println("Files with javax.mvc imports have been updated to use jakarta.mvc");
        } catch (Exception e) {
            System.err.println("Error during transformation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}