import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.reference.CtTypeReference;

public class ByteBuddyImportProcessor extends AbstractProcessor<CtImport> {
    @Override
    public void process(CtImport ctImport) {
        CtTypeReference<?> importedType = ctImport.getReference();
        if (importedType != null && importedType.getQualifiedName().startsWith("org.assertj.core.internal.bytebuddy")) {
            // Create a new import for the external ByteBuddy package
            CtTypeReference<?> newImport = getFactory().createTypeReference();
            String qualifiedName = importedType.getQualifiedName();
            // Replace the old package with the new one
            String newQualifiedName = qualifiedName.replace("org.assertj.core.internal.bytebuddy", "net.bytebuddy");
            newImport.setQualifiedName(newQualifiedName);
            ctImport.setReference(newImport);
        }
    }
}