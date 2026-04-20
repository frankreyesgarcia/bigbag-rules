import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.declaration.CtMethod;

/**
 * Spoon processor to fix SnakeYAML 2.0 breaking changes
 * 
 * This processor handles common constructor and method changes in SnakeYAML 2.0:
 * 1. Yaml() constructor without parameters now requires LoaderOptions
 * 2. Yaml(boolean allowDuplicateKeys) constructor has been updated
 * 3. Yaml(Representer, Constructor) constructor has changed
 * 4. LoaderOptions method calls may have changed
 */
public class SnakeYAML20Fix extends AbstractProcessor {
    
    @Override
    public void process(CtElement element) {
        if (element instanceof CtConstructorCall) {
            CtConstructorCall<?> constructorCall = (CtConstructorCall<?>) element;
            
            // Check if it's a Yaml constructor call
            if ("org.yaml.snakeyaml.Yaml".equals(constructorCall.getExecutable().getDeclaringType().getQualifiedName())) {
                handleYamlConstructor(constructorCall);
            }
        }
        else if (element instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) element;
            String qualifiedName = invocation.getExecutable().getDeclaringType().getQualifiedName();
            
            // Handle LoaderOptions method calls that may have changed
            if ("org.yaml.snakeyaml.LoaderOptions".equals(qualifiedName)) {
                handleLoaderOptionsMethodCall(invocation);
            }
        }
    }
    
    private void handleYamlConstructor(CtConstructorCall<?> constructorCall) {
        Factory factory = constructorCall.getFactory();
        
        // Handle old constructor: new Yaml()
        if (constructorCall.getArguments().isEmpty()) {
            // Replace with new constructor: new Yaml(new LoaderOptions())
            CtNewClass loaderOptions = factory.Code().createNewClass();
            CtTypeReference<?> loaderOptionsType = factory.Type().createReference("org.yaml.snakeyaml.LoaderOptions");
            loaderOptions.setType(loaderOptionsType);
            
            constructorCall.getArguments().clear();
            constructorCall.getArguments().add(loaderOptions);
        }
        
        // Handle old constructor: new Yaml(boolean allowDuplicateKeys)
        else if (constructorCall.getArguments().size() == 1 && 
                 constructorCall.getArguments().get(0) instanceof CtLiteral && 
                 constructorCall.getArguments().get(0).getType().isBoolean()) {
            
            // Replace with new constructor: new Yaml(new LoaderOptions().setAllowDuplicateKeys(allowDuplicateKeys))
            CtNewClass loaderOptions = factory.Code().createNewClass();
            CtTypeReference<?> loaderOptionsType = factory.Type().createReference("org.yaml.snakeyaml.LoaderOptions");
            loaderOptions.setType(loaderOptionsType);
            
            // Create method call: setAllowDuplicateKeys(allowDuplicateKeys)
            CtMethod<?> setMethod = loaderOptionsType.getReference().getDeclaredMethod("setAllowDuplicateKeys", factory.Type().createReference(boolean.class));
            CtExpression<?> methodCall = factory.Code().createMethodCall(loaderOptions, setMethod, constructorCall.getArguments().get(0));
            
            constructorCall.getArguments().clear();
            constructorCall.getArguments().add(methodCall);
        }
        
        // Handle old constructor: new Yaml(Representer, Constructor)
        else if (constructorCall.getArguments().size() == 2) {
            // SnakeYAML 2.0 has changed how Representer and Constructor are handled
            // Replace with new Yaml with LoaderOptions
            CtNewClass loaderOptions = factory.Code().createNewClass();
            CtTypeReference<?> loaderOptionsType = factory.Type().createReference("org.yaml.snakeyaml.LoaderOptions");
            loaderOptions.setType(loaderOptionsType);
            
            constructorCall.getArguments().clear();
            constructorCall.getArguments().add(loaderOptions);
        }
    }
    
    private void handleLoaderOptionsMethodCall(CtInvocation invocation) {
        // This method can be extended to handle any method call changes in LoaderOptions
        // For example, if setAllowDuplicateKeys() was renamed or moved
    }
    
    @Override
    public boolean isToBeProcessed(CtElement element) {
        if (element instanceof CtConstructorCall) {
            CtConstructorCall<?> constructorCall = (CtConstructorCall<?>) element;
            String qualifiedName = constructorCall.getExecutable().getDeclaringType().getQualifiedName();
            return "org.yaml.snakeyaml.Yaml".equals(qualifiedName);
        }
        else if (element instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) element;
            String qualifiedName = invocation.getExecutable().getDeclaringType().getQualifiedName();
            return "org.yaml.snakeyaml.Yaml".equals(qualifiedName) || 
                   "org.yaml.snakeyaml.LoaderOptions".equals(qualifiedName);
        }
        return false;
    }
}