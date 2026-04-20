package github.chains;

import spoon.Launcher;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlywayMigrationTransformation {
    public static void main(String[] args) {
        // Process all Java files in the source directory
        Launcher launcher = new Launcher();
        launcher.addInputResource("/workspace/nem");
        launcher.setSourceOutputDirectory("/workspace/nem");
        launcher.getEnvironment().setAutoImports(true);
        launcher.getEnvironment().setComplianceLevel(8);
        
        // Process the code
        launcher.run();
        
        // Apply transformations
        applyFlywayTransformation(launcher.getFactory());
        
        // Write the modified code back to files
        launcher.writeProcessedSourceFiles();
    }
    
    public static void applyFlywayTransformation(Factory factory) {
        // Find all Flyway constructor calls with no arguments
        List<CtNewClass> flywayConstructors = factory.Query()
            .select(new TypeFilter<>(CtNewClass.class))
            .filter(c -> {
                if (c.getExecutable() != null && c.getExecutable().getDeclaringType() != null) {
                    return c.getExecutable().getDeclaringType().getQualifiedName().equals("org.flywaydb.core.Flyway");
                }
                return false;
            })
            .filter(c -> c.getArguments().size() == 0);
        
        for (CtNewClass flywayConstructor : flywayConstructors) {
            // Find the assignment that uses this constructor
            CtAssignment assignment = flywayConstructor.getParent(CtAssignment.class);
            if (assignment == null) {
                continue;
            }
            
            // Find the variable being assigned to
            CtExpression<?> assignedVar = assignment.getAssigned();
            if (!(assignedVar instanceof CtVariableRead)) {
                continue;
            }
            
            // Find all method calls on this variable to extract configuration
            List<CtInvocation> methodCalls = findMethodCallsOnVariable(factory, (CtVariableRead) assignedVar);
            
            // Replace the constructor with the new fluent API
            replaceWithFluentAPI(factory, flywayConstructor, methodCalls);
        }
    }
    
    private static List<CtInvocation> findMethodCallsOnVariable(Factory factory, CtVariableRead variableRead) {
        List<CtInvocation> methodCalls = new ArrayList<>();
        
        // Find all invocation expressions that are called on the variable
        factory.Query()
            .select(new TypeFilter<>(CtInvocation.class))
            .filter(invocation -> {
                CtExpression<?> target = invocation.getTarget();
                if (target instanceof CtVariableRead) {
                    CtVariableRead targetVar = (CtVariableRead) target;
                    return targetVar.getVariable().getSimpleName().equals(variableRead.getVariable().getSimpleName());
                }
                return false;
            })
            .forEach(methodCalls::add);
            
        return methodCalls;
    }
    
    private static void replaceWithFluentAPI(Factory factory, CtNewClass flywayConstructor, List<CtInvocation> methodCalls) {
        // Create a map of method calls for easy access
        Map<String, CtInvocation> methodCallMap = new HashMap<>();
        for (CtInvocation call : methodCalls) {
            if (call.getExecutable() != null) {
                String methodName = call.getExecutable().getSimpleName();
                methodCallMap.put(methodName, call);
            }
        }
        
        // Create the new fluent API call: Flyway.configure()
        CtTypeReference<?> flywayType = factory.Type().createReference("org.flywaydb.core.Flyway");
        CtExecutableReference<?> configureMethod = factory.Executable().createReference(flywayType, "configure");
        CtInvocation<?> configureCall = factory.Code().createInvocation(null, configureMethod, new ArrayList<>());
        
        // Build the fluent chain
        CtInvocation fluentCall = configureCall;
        
        // Add dataSource if present
        if (methodCallMap.containsKey("setDataSource")) {
            CtInvocation dataSourceCall = methodCallMap.get("setDataSource");
            CtExpression<?> dataSourceArg = dataSourceCall.getArguments().get(0);
            CtExecutableReference<?> dataSourceMethod = factory.Executable().createReference(flywayType, "dataSource", dataSourceArg.getType());
            CtInvocation newDataSourceCall = factory.Code().createInvocation(fluentCall, dataSourceMethod, dataSourceArg);
            fluentCall = newDataSourceCall;
        }
        
        // Add classLoader if present
        if (methodCallMap.containsKey("setClassLoader")) {
            CtInvocation classLoaderCall = methodCallMap.get("setClassLoader");
            CtExpression<?> classLoaderArg = classLoaderCall.getArguments().get(0);
            CtExecutableReference<?> classLoaderMethod = factory.Executable().createReference(flywayType, "classLoader", classLoaderArg.getType());
            CtInvocation newClassLoaderCall = factory.Code().createInvocation(fluentCall, classLoaderMethod, classLoaderArg);
            fluentCall = newClassLoaderCall;
        }
        
        // Add locations if present
        if (methodCallMap.containsKey("setLocations")) {
            CtInvocation locationsCall = methodCallMap.get("setLocations");
            CtExpression<?> locationsArg = locationsCall.getArguments().get(0);
            CtExecutableReference<?> locationsMethod = factory.Executable().createReference(flywayType, "locations", locationsArg.getType());
            CtInvocation newLocationsCall = factory.Code().createInvocation(fluentCall, locationsMethod, locationsArg);
            fluentCall = newLocationsCall;
        }
        
        // Add validateOnMigrate if present
        if (methodCallMap.containsKey("setValidateOnMigrate")) {
            CtInvocation validateCall = methodCallMap.get("setValidateOnMigrate");
            CtExpression<?> validateArg = validateCall.getArguments().get(0);
            CtExecutableReference<?> validateMethod = factory.Executable().createReference(flywayType, "validateOnMigrate", validateArg.getType());
            CtInvocation newValidateCall = factory.Code().createInvocation(fluentCall, validateMethod, validateArg);
            fluentCall = newValidateCall;
        }
        
        // Add load() to complete the fluent chain
        CtExecutableReference<?> loadMethod = factory.Executable().createReference(flywayType, "load");
        CtInvocation loadCall = factory.Code().createInvocation(fluentCall, loadMethod, new ArrayList<>());
        
        // Replace the constructor with the new fluent API call
        flywayConstructor.replace(loadCall);
        
        // Remove the old method calls since they're now part of the fluent chain
        for (CtInvocation call : methodCalls) {
            if (call.getParent() != null) {
                call.getParent().removeStatement(call);
            }
        }
    }
}