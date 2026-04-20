#!/bin/bash

# Jakarta JAX-WS Migration Script
# This script updates javax.jws imports to jakarta.jws for the Billy project

echo "Starting Jakarta JAX-WS migration..."

# Find all Java files with javax.jws imports
echo "Finding files with javax.jws imports..."
find /workspace/billy -name "*.java" -exec grep -l "javax.jws" {} \; | while read -r file; do
    echo "Processing $file"
    
    # Replace javax.jws imports with jakarta.jws
    sed -i 's/import javax\.jws\.\*/import jakarta.jws.*;/g' "$file"
    
    # Replace javax.jws annotations with jakarta.jws
    sed -i 's/@javax\.jws\.WebService/@jakarta.jws.WebService/g' "$file"
    sed -i 's/@javax\.jws\.WebMethod/@jakarta.jws.WebMethod/g' "$file"
    sed -i 's/@javax\.jws\.WebParam/@jakarta.jws.WebParam/g' "$file"
    sed -i 's/@javax\.jws\.WebResult/@jakarta.jws.WebResult/g' "$file"
    
    # Replace javax.xml.ws imports (if any)
    sed -i 's/import javax\.xml\.ws\.\*/import jakarta.xml.ws.*;/g' "$file"
    
    # Replace javax.xml.ws annotations (if any)
    sed -i 's/@javax\.xml\.ws\.WebService/@jakarta.xml.ws.WebService/g' "$file"
done

echo "Jakarta JAX-WS migration completed!"
echo "Please run 'mvn compile' to verify the fix."