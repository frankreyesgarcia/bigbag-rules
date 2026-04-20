import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;

import java.util.List;

/**
 * A Spoon transformation processor to fix the ExecutorService API change in Liquibase projects.
 * This processor replaces the old API pattern:
 * ExecutorService.getInstance().getExecutor(database).execute(statement)
 * With the new API pattern that works with Liquibase 4.8.0
 */
public class LiquibaseExecutorServiceFixer extends AbstractProcessor<CtInvocation> {
    
    @Override
    public boolean isToBeProcessed(CtInvocation candidate) {
        // Match the pattern: ExecutorService.getInstance().getExecutor(database).execute(statement)
        if (candidate.getExecutable() != null && 
            "execute".equals(candidate.getExecutable().getSimpleName())) {
            // Check if the method call is a chained call starting with ExecutorService.getInstance().getExecutor(...)
            CtExpression target = candidate.getTarget();
            if (target instanceof CtInvocation) {
                CtInvocation intermediateCall = (CtInvocation) target;
                if (intermediateCall.getExecutable() != null && 
                    "getExecutor".equals(intermediateCall.getExecutable().getSimpleName())) {
                    // Check if the getExecutor call is from ExecutorService.getInstance()
                    CtExpression intermediateTarget = intermediateCall.getTarget();
                    if (intermediateTarget instanceof CtInvocation) {
                        CtInvocation rootCall = (CtInvocation) intermediateTarget;
                        if (rootCall.getExecutable() != null && 
                            "getInstance".equals(rootCall.getExecutable().getSimpleName())) {
                            // Check if the root call is on ExecutorService class
                            if (rootCall.getExecutable().getDeclaringType() != null && 
                                "ExecutorService".equals(rootCall.getExecutable().getDeclaringType().getSimpleName())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void process(CtInvocation invocation) {
        // Get the full invocation chain: ExecutorService.getInstance().getExecutor(database).execute(statement)
        CtExpression target = invocation.getTarget();
        if (!(target instanceof CtInvocation)) {
            return;
        }
        
        CtInvocation executeCall = (CtInvocation) target;
        if (executeCall.getExecutable() == null || 
            !"execute".equals(executeCall.getExecutable().getSimpleName())) {
            return;
        }
        
        // Get the getExecutor call
        CtExpression intermediateTarget = executeCall.getTarget();
        if (!(intermediateTarget instanceof CtInvocation)) {
            return;
        }
        
        CtInvocation getExecutorCall = (CtInvocation) intermediateTarget;
        if (getExecutorCall.getExecutable() == null || 
            !"getExecutor".equals(getExecutorCall.getExecutable().getSimpleName())) {
            return;
        }
        
        // Get the getInstance call
        CtExpression rootTarget = getExecutorCall.getTarget();
        if (!(rootTarget instanceof CtInvocation)) {
            return;
        }
        
        CtInvocation getInstanceCall = (CtInvocation) rootTarget;
        if (getInstanceCall.getExecutable() == null || 
            !"getInstance".equals(getInstanceCall.getExecutable().getSimpleName())) {
            return;
        }
        
        // Get the statement parameter from execute call
        List<CtExpression<?>> args = invocation.getArguments();
        if (args.isEmpty()) {
            return;
        }
        
        // Create the replacement: ExecutorService.getInstance().execute(database, statement)
        Factory factory = getFactory();
        CtInvocation newInvocation = factory.createInvocation(
            getInstanceCall, // ExecutorService.getInstance()
            factory.createExecutableReference()
                .setSimpleName("execute")
                .setDeclaringType(factory.Type().createReference("ExecutorService")),
            args // Pass the statement as first argument, and database as second
        );
        
        // Replace the old pattern with the new one
        invocation.replace(newInvocation);
    }
    
    @Override
    public java.util.Set<Class<? extends spoon.reflect.declaration.CtElement>> getProcessedElementTypes() {
        return java.util.Set.of(CtInvocation.class);
    }
}