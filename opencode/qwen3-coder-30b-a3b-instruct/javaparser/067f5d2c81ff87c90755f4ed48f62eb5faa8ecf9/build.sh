#!/bin/bash

# Create a simple test to verify the transformer works
echo "Creating test files..."

# Create a simple Java file to test with
cat > TestThriftProcessor.java << 'EOF'
import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TBase;

// Simple test class
public class TestThriftProcessor extends ProcessFunction<MyService, MyService.Args> {
    
    public TestThriftProcessor(String name) {
        super(name);
    }
    
    @Override
    public MyService.Result getResult(MyService service, MyService.Args args) throws org.apache.thrift.TException {
        return service.process(args);
    }
    
    @Override
    public MyService.Args getEmptyArgsInstance() {
        return new MyService.Args();
    }
    
    @Override
    protected boolean isOneway() {
        return false;
    }
}
EOF

# Compile the transformer
javac -cp "/workspace/javaparser-core-3.27.1.jar:/workspace/javaparser-symbol-solver-core-3.27.1.jar" \
    ThriftUpgradeTransformer.java

echo "Transformer compiled successfully"
echo "Usage: java -cp \"/workspace/javaparser-core-3.27.1.jar:/workspace/javaparser-symbol-solver-core-3.27.1.jar:.\" ThriftUpgradeTransformer TestThriftProcessor.java"