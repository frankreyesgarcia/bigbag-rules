#!/bin/bash

# Script to demonstrate the ByteBuddy import replacement processor

echo "Running ByteBuddy import replacement on assertj-vavr project..."

# First, let's backup the original files
cp -r /workspace/assertj-vavr/src/main/java /workspace/assertj-vavr/src/main/java.backup

# Compile our processor
cd /workspace/bytebuddy-replacer
mvn compile

# Run the processor on the assertj-vavr project
java -cp target/classes:$(mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q) com.example.bytebuddy.ByteBuddyImportReplacer /workspace/assertj-vavr

echo "ByteBuddy import replacement completed!"
echo "Original files are backed up in /workspace/assertj-vavr/src/main/java.backup"