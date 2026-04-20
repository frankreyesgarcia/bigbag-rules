#!/bin/bash

# Script to migrate javax.validation to jakarta.validation in wicket-crudifier project
# This addresses the breaking change in jakarta.validation-api 3.0.1

echo "Starting migration of javax.validation to jakarta.validation..."

# Find all Java files in the project
find /workspace/wicket-crudifier/src -name "*.java" -type f | while read -r file; do
    echo "Processing $file"
    
    # Replace javax.validation imports with jakarta.validation
    sed -i 's|import javax.validation|import jakarta.validation|g' "$file"
    
    # Replace specific constraint annotations that were moved
    sed -i 's|javax.validation.constraints.NotNull|jakarta.validation.constraints.NotNull|g' "$file"
    sed -i 's|javax.validation.constraints.NotEmpty|jakarta.validation.constraints.NotEmpty|g' "$file"
    sed -i 's|javax.validation.constraints.NotBlank|jakarta.validation.constraints.NotBlank|g' "$file"
    
    # Replace metadata imports
    sed -i 's|javax.validation.metadata.BeanDescriptor|jakarta.validation.metadata.BeanDescriptor|g' "$file"
    sed -i 's|javax.validation.metadata.ConstraintDescriptor|jakarta.validation.metadata.ConstraintDescriptor|g' "$file"
    sed -i 's|javax.validation.metadata.ElementDescriptor|jakarta.validation.metadata.ElementDescriptor|g' "$file"
    
    # Replace Validator import
    sed -i 's|javax.validation.Validator|jakarta.validation.Validator|g' "$file"
done

echo "Migration completed."