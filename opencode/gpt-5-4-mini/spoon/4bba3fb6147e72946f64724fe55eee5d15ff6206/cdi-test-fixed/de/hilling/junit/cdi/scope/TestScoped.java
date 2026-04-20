package de.hilling.junit.cdi.scope;
import Value.Immutable;
import java.lang.annotation.*;
import javax.inject.Scope;
import javax.enterprise.context.NormalScope;
import org.immutables.value.Value;
/**
 * Unit test scope valid for for the execution of one test.
 *
 * @see de.hilling.junit.cdi.scope.TestSuiteScoped
 */
@Scope
@NormalScope
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Value.Immutable
public @interface TestScoped {}
