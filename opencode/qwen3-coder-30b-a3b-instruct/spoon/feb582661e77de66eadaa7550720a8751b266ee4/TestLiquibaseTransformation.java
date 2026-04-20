import spoon.Launcher;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.util.List;

/**
 * Test class to demonstrate the transformation functionality
 */
public class TestLiquibaseTransformation {
    
    public static void main(String[] args) {
        // Create a simple test to verify the pattern matching
        Launcher launcher = new Launcher();
        
        // Add a test file with the old API pattern
        String testCode = 
            "public class TestClass {\n" +
            "    public void testMethod() {\n" +
            "        ExecutorService.getInstance().getExecutor(database).execute(statement);\n" +
            "    }\n" +
            "}";
        
        // Create a virtual file with the test code
        launcher.addInputResource(new spoon.support.compiler.VirtualFile(testCode, "TestClass.java"));
        
        // Build model
        launcher.buildModel();
        
        // Get the factory
        Factory factory = launcher.getFactory();
        
        // Find all invocations to verify pattern matching
        List<CtInvocation> invocations = factory.Query().getModel().getElements(
            e -> e instanceof CtInvocation && 
                  ((CtInvocation) e).getExecutable() != null && 
                  "execute".equals(((CtInvocation) e).getExecutable().getSimpleName())
        );
        
        System.out.println("Found " + invocations.size() + " execute invocations");
        
        // Process with our transformation (this would be done by the processor automatically)
        // This is just a demonstration of how the transformation would work
        System.out.println("Test completed. The transformation would replace:");
        System.out.println("ExecutorService.getInstance().getExecutor(database).execute(statement)");
        System.out.println("With:");
        System.out.println("ExecutorService.getInstance().execute(database, statement)");
    }
}