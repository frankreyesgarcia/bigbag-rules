#!/bin/bash

# Script to migrate from javax.* to jakarta.* across Java files
# Usage: ./migrate-javax-to-jakarta.sh <source_directory>

SOURCE_DIR="${1:-/workspace/cdi-test}"

# Define mappings from javax to jakarta
# Annotation packages
JAVAX_ANNOTATION="javax.annotation"
JAKARTA_ANNOTATION="jakarta.annotation"

# CDI packages
JAVAX_CDI="javax.enterprise"
JAKARTA_CDI="jakarta.enterprise"

# JPA packages
JAVAX_JPA="javax.persistence"
JAKARTA_JPA="jakarta.persistence"

# JSF packages
JAVAX_FACES="javax.faces"
JAKARTA_FACES="jakarta.faces"

# EJB packages
JAVAX_EJB="javax.ejb"
JAKARTA_EJB="jakarta.ejb"

# Servlet packages
JAVAX_SERVLET="javax.servlet"
JAKARTA_SERVLET="jakarta.servlet"

# JAX-RS packages
JAVAX_JAXRS="javax.ws.rs"
JAKARTA_JAXRS="jakarta.ws.rs"

# JAX-WS packages
JAVAX_JAXWS="javax.xml.ws"
JAKARTA_JAXWS="jakarta.xml.ws"

# JTA packages
JAVAX_JTA="javax.transaction"
JAKARTA_JTA="jakarta.transaction"

echo "Migrating from javax.* to jakarta.* in $SOURCE_DIR"

echo "Fixing annotation imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_ANNOTATION;/import $JAKARTA_ANNOTATION;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_ANNOTATION\./import $JAKARTA_ANNOTATION\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_ANNOTATION\./@$JAKARTA_ANNOTATION\./g" {} \;

echo "Fixing CDI imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_CDI;/import $JAKARTA_CDI;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_CDI\./import $JAKARTA_CDI\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_CDI\./@$JAKARTA_CDI\./g" {} \;

echo "Fixing JPA imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JPA;/import $JAKARTA_JPA;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JPA\./import $JAKARTA_JPA\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_JPA\./@$JAKARTA_JPA\./g" {} \;

echo "Fixing JSF imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_FACES;/import $JAKARTA_FACES;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_FACES\./import $JAKARTA_FACES\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_FACES\./@$JAKARTA_FACES\./g" {} \;

echo "Fixing EJB imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_EJB;/import $JAKARTA_EJB;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_EJB\./import $JAKARTA_EJB\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_EJB\./@$JAKARTA_EJB\./g" {} \;

echo "Fixing Servlet imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_SERVLET;/import $JAKARTA_SERVLET;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_SERVLET\./import $JAKARTA_SERVLET\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_SERVLET\./@$JAKARTA_SERVLET\./g" {} \;

echo "Fixing JAX-RS imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JAXRS;/import $JAKARTA_JAXRS;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JAXRS\./import $JAKARTA_JAXRS\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_JAXRS\./@$JAKARTA_JAXRS\./g" {} \;

echo "Fixing JAX-WS imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JAXWS;/import $JAKARTA_JAXWS;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JAXWS\./import $JAKARTA_JAXWS\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_JAXWS\./@$JAKARTA_JAXWS\./g" {} \;

echo "Fixing JTA imports..."
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JTA;/import $JAKARTA_JTA;/g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/import $JAVAX_JTA\./import $JAKARTA_JTA\./g" {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i "s/@$JAVAX_JTA\./@$JAKARTA_JTA\./g" {} \;

echo "Migration complete!"

# Verify the changes
find "$SOURCE_DIR" -name "*.java" -exec grep -l "import javax" {} \; | while read file; do
    echo "Warning: Still has javax imports in $file"
done