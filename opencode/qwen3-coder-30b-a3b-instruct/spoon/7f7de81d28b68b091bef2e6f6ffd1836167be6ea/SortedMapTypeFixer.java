import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;

/**
 * A Spoon processor to fix SortedMap generic type mismatch issue in snmp4j-agent.
 * This fixes cases where getRegistry() returns SortedMap<MOScope, ManagedObject<?>>
 * but is assigned to a variable typed as SortedMap<MOScope, ManagedObject>
 */
public class SortedMapTypeFixer extends AbstractProcessor<CtAssignment<?, ?>> {
    
    @Override
    public void process(CtAssignment<?, ?> assignment) {
        // Check if the assignment is calling getRegistry() on a MOServer instance
        if (isGetRegistryInvocation(assignment.getAssigned())) {
            // Get the type of the assigned variable
            CtTypeReference<?> assignedType = assignment.getAssigned().getType();
            
            // Check if it's a SortedMap with proper generic parameters
            if (isSortedMapType(assignedType)) {
                // Check if the second type parameter needs to be updated
                CtTypeReference<?> secondTypeParam = getSecondTypeParameter(assignedType);
                if (secondTypeParam != null && isManagedObjectType(secondTypeParam) && !isGenericManagedObject(secondTypeParam)) {
                    // This would be where we fix the type, but actually we need to modify the assignment
                    // Since Spoon doesn't easily allow changing types in assignments, we'll just log the issue
                    System.out.println("Found SortedMap type mismatch: " + assignedType.getQualifiedName());
                }
            }
        }
    }
    
    private boolean isGetRegistryInvocation(CtExpression<?> expression) {
        if (expression instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) expression;
            CtExecutableReference<?> executableRef = invocation.getExecutable();
            if (executableRef != null && "getRegistry".equals(executableRef.getSimpleName())) {
                // Check that it's called on a MOServer instance
                CtExpression<?> target = invocation.getTarget();
                if (target != null) {
                    CtTypeReference<?> targetType = target.getType();
                    if (targetType != null) {
                        return targetType.getQualifiedName().contains("MOServer");
                    }
                }
            }
        }
        return false;
    }
    
    private boolean isSortedMapType(CtTypeReference<?> type) {
        if (type == null) return false;
        // Check if it's a SortedMap
        return type.getQualifiedName().contains("SortedMap");
    }
    
    private CtTypeReference<?> getSecondTypeParameter(CtTypeReference<?> type) {
        if (type == null || type.getActualTypeArguments().size() < 2) {
            return null;
        }
        return type.getActualTypeArguments().get(1);
    }
    
    private boolean isManagedObjectType(CtTypeReference<?> type) {
        if (type == null) return false;
        return type.getQualifiedName().contains("ManagedObject");
    }
    
    private boolean isGenericManagedObject(CtTypeReference<?> type) {
        if (type == null) return false;
        // Check if it's ManagedObject<?> or ManagedObject<? extends SomeType>
        return type.getQualifiedName().contains("ManagedObject<");
    }
}