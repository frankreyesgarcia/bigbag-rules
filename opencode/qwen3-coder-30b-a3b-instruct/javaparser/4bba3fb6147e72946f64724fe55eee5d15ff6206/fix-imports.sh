#!/bin/bash

# Simple script to fix javax.annotation imports to jakarta.annotation in all Java files

if [ $# -lt 1 ]; then
    echo "Usage: $0 <source-directory>"
    exit 1
fi

SOURCE_DIR="$1"

# Find all Java files and replace javax.annotation with jakarta.annotation in import statements
find "$SOURCE_DIR" -name "*.java" -type f -exec sed -i 's/import javax\.annotation\./import jakarta.annotation./g' {} \;

echo "Successfully replaced javax.annotation imports with jakarta.annotation in all Java files."