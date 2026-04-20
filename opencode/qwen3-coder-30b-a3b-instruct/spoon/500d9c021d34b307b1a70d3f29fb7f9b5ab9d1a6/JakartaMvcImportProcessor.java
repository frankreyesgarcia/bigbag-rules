import spoon.reflect.factory.Factory;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.processing.AbstractProcessor;
import spoon.reflect.visitor.filter.TypeFilter;
import java.util.List;

public class JakartaMvcImportProcessor extends AbstractProcessor<CtImport> {
    
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
}