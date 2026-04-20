# Fix for Dropwizard JerseyClientBuilder Constructor Change

## Problem Analysis

In Dropwizard 4.0.0, the JerseyClientBuilder constructor signature changed:

**Old (Dropwizard 2.1.5):**
```java
public JerseyClientBuilder(Environment env)
```

**New (Dropwizard 4.0.0):**
```java
public JerseyClientBuilder(MetricRegistry metricRegistry)
```

## Solution

The transformation rule should:
1. Replace `new JerseyClientBuilder(env)` with `new JerseyClientBuilder(env.metrics())` or similar
2. Ensure proper handling of the Environment parameter

## Generic Transformation Pattern

**Before:**
```java
Client client = new JerseyClientBuilder(env)
    .using(config.getJerseyClient())
    .build("my-client");
```

**After:**
```java
Client client = new JerseyClientBuilder(env.metrics())
    .using(config.getJerseyClient())
    .build("my-client");
```

## Implementation Strategy

Since the JavaParser compilation is problematic, here's the conceptual implementation:

```java
// In a JavaParser visitor:
@Override
public Expression visit(ObjectCreationExpr n, Void arg) {
    if (n.getType().getNameAsString().equals("JerseyClientBuilder")) {
        String fullyQualifiedName = n.getType().asString();
        if (fullyQualifiedName.equals("io.dropwizard.client.JerseyClientBuilder")) {
            if (n.getArguments().size() == 1) {
                Expression argument = n.getArguments().get(0);
                if (argument instanceof NameExpr) {
                    // Convert new JerseyClientBuilder(env) to new JerseyClientBuilder(env.metrics())
                    ObjectCreationExpr newBuilder = new ObjectCreationExpr();
                    newBuilder.setType(n.getType());
                    newBuilder.setArguments(NodeList.nodeList(
                        new MethodCallExpr(argument, "metrics")
                    ));
                    
                    MethodCallExpr usingCall = new MethodCallExpr();
                    usingCall.setScope(newBuilder);
                    usingCall.setName("using");
                    usingCall.setArguments(NodeList.nodeList(argument));
                    
                    return usingCall;
                }
            }
        }
    }
    return super.visit(n, arg);
}
```

## Manual Fix for Lithium Project

In `/workspace/lithium/src/main/java/com/wire/lithium/Server.java`, line 160:

Replace:
```java
return new JerseyClientBuilder(env)
    .using(config.getJerseyClient())
    .withProvider(MultiPartFeature.class)
    .withProvider(JacksonJsonProvider.class)
    .build(getName());
```

With:
```java
return new JerseyClientBuilder(env.metrics())
    .using(config.getJerseyClient())
    .withProvider(MultiPartFeature.class)
    .withProvider(JacksonJsonProvider.class)
    .build(getName());
```

This should fix the compilation error.