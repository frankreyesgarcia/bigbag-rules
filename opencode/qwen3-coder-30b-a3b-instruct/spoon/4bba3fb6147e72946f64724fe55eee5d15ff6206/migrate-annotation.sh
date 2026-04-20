#!/bin/bash

# Script to migrate javax.annotation to jakarta.annotation across Java files
# Usage: ./migrate-annotation.sh <source_directory>

SOURCE_DIR="${1:-/workspace/cdi-test}"
OLD_PACKAGE="javax.annotation"
NEW_PACKAGE="jakarta.annotation"

echo "Migrating $OLD_PACKAGE to $NEW_PACKAGE in $SOURCE_DIR"

# Find and replace imports
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.Priority;/import '"$NEW_PACKAGE"'\.Priority;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.PostConstruct;/import '"$NEW_PACKAGE"'\.PostConstruct;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.Resource;/import '"$NEW_PACKAGE"'\.Resource;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.ManagedBean;/import '"$NEW_PACKAGE"'\.ManagedBean;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.Generated;/import '"$NEW_PACKAGE"'\.Generated;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.PreDestroy;/import '"$NEW_PACKAGE"'\.PreDestroy;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.Resources;/import '"$NEW_PACKAGE"'\.Resources;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.security\..*;/import '"$NEW_PACKAGE"'\.security\..*;/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/import '"$OLD_PACKAGE"'\.sql\..*;/import '"$NEW_PACKAGE"'\.sql\..*;/g' {} \;

# Find and replace annotation usages (without the import)
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.Priority\(@/@"'"$NEW_PACKAGE"'\.Priority(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.PostConstruct\(@/@"'"$NEW_PACKAGE"'\.PostConstruct(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.Resource\(@/@"'"$NEW_PACKAGE"'\.Resource(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.ManagedBean\(@/@"'"$NEW_PACKAGE"'\.ManagedBean(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.Generated\(@/@"'"$NEW_PACKAGE"'\.Generated(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.PreDestroy\(@/@"'"$NEW_PACKAGE"'\.PreDestroy(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.Resources\(@/@"'"$NEW_PACKAGE"'\.Resources(@/g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.security\./@"'"$NEW_PACKAGE"'\.security\./g' {} \;
find "$SOURCE_DIR" -name "*.java" -exec sed -i 's/@'"$OLD_PACKAGE"'\.sql\./@"'"$NEW_PACKAGE"'\.sql\./g' {} \;

echo "Migration complete!"