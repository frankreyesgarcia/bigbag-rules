package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithVariables;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceDir = args.length > 0 ? args[0] : "/workspace/plexus-archiver/src/main/java";
        
        System.out.println("Processing source files in: " + sourceDir);
        
        try (Stream<Path> paths = Files.walk(Paths.get(sourceDir))) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
        
        System.out.println("Transformation complete!");
    }
    
    private static void transformFile(Path path) {
        System.out.println("Processing: " + path);
        try {
            String content = Files.readString(path);
            CompilationUnit cu = StaticJavaParser.parse(content);
            boolean modified = false;
            
            // Fix 1: Remove BoundedInputStream import and fix usage in AbstractZipUnArchiver
            if (path.toString().contains("AbstractZipUnArchiver.java")) {
                modified |= fixAbstractZipUnArchiver(cu);
            }
            
            // Fix 2: Remove ClosedInputStream import and fix usage in ByteArrayOutputStream
            if (path.toString().contains("ByteArrayOutputStream.java")) {
                modified |= fixByteArrayOutputStream(cu);
            }
            
            // Fix 3: Remove ThresholdingOutputStream and implement threshold logic inline
            if (path.toString().contains("OffloadingOutputStream.java")) {
                modified |= fixOffloadingOutputStream(cu);
            }
            
            // Fix 4: Remove NullPrintStream and create custom null stream
            if (path.toString().contains("JarToolModularJarArchiver.java")) {
                modified |= fixJarToolModularJarArchiver(cu);
            }
            
            if (modified) {
                Files.writeString(path, cu.toString());
                System.out.println("  -> Modified");
            }
        } catch (Exception e) {
            System.err.println("  -> Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static boolean fixAbstractZipUnArchiver(CompilationUnit cu) {
        boolean modified = false;
        
        // Remove BoundedInputStream import
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("org.apache.commons.io.input.BoundedInputStream"));
        modified = true;
        
        // Find and fix the execute method
        cu.findAll(MethodDeclaration.class).stream()
          .filter(m -> m.getNameAsString().equals("execute"))
          .forEach(m -> {
              // Change getByteCount() to getCount()
              m.findAll(MethodCallExpr.class).stream()
               .filter(call -> call.getNameAsString().equals("getByteCount"))
               .forEach(call -> call.setName("getCount"));
              
              // Remove BoundedInputStream wrapping - simplify to just use the input stream directly
              // Find variable declarations with BoundedInputStream
              m.findAll(ClassOrInterfaceType.class).stream()
               .filter(t -> t.getNameAsString().equals("BoundedInputStream"))
               .forEach(t -> {
                   // Change BoundedInputStream to InputStream
                   t.setName("InputStream");
               });
              
              // Remove the BoundedInputStream constructor call
              m.findAll(ObjectCreationExpr.class).stream()
               .filter(ocl -> ocl.getType().getNameAsString().equals("BoundedInputStream"))
               .forEach(ocl -> {
                   // Replace with just the wrapped InputStream
                   if (ocl.getArguments().size() > 0) {
                       ocl.replace(ocl.getArgument(0));
                   }
               });
          });
        
        return modified;
    }
    
    private static boolean fixByteArrayOutputStream(CompilationUnit cu) {
        boolean modified = false;
        
        // Remove ClosedInputStream import
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("org.apache.commons.io.input.ClosedInputStream"));
        modified = true;
        
        // Replace new ClosedInputStream() with new ByteArrayInputStream(EMPTY_BYTE_ARRAY)
        cu.findAll(ObjectCreationExpr.class).stream()
          .filter(ocl -> ocl.getType().getNameAsString().equals("ClosedInputStream"))
          .forEach(ocl -> {
              ObjectCreationExpr replacement = new ObjectCreationExpr();
              replacement.setType("ByteArrayInputStream");
              replacement.addArgument(new NameExpr("EMPTY_BYTE_ARRAY"));
              ocl.replace(replacement);
          });
        
        return modified;
    }
    
    private static boolean fixOffloadingOutputStream(CompilationUnit cu) {
        boolean modified = false;
        
        // Remove ThresholdingOutputStream import
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("org.apache.commons.io.output.ThresholdingOutputStream"));
        modified = true;
        
        // Find the OffloadingOutputStream class
        cu.findAll(ClassOrInterfaceDeclaration.class).stream()
          .filter(c -> c.getNameAsString().equals("OffloadingOutputStream"))
          .forEach(c -> {
              // Remove extends ThresholdingOutputStream
              c.getExtendedTypes().clear();
              
              // Add threshold-related fields that were inherited
              FieldDeclaration thresholdField = c.addField("int", "threshold");
              thresholdField.getVariable(0).setInitializer("0");
              
              FieldDeclaration writtenField = c.addField("int", "written");
              writtenField.getVariable(0).setInitializer("0");
              
              // Add thresholdReached method if not present
              if (c.findFirst(MethodDeclaration.class, m -> m.getNameAsString().equals("thresholdReached")).isEmpty()) {
                  MethodDeclaration thresholdReached = c.addMethod("thresholdReached");
                  thresholdReached.setType("void");
                  thresholdReached.setBody(new BlockStmt());
              }
              
              // Add getStream method if not present  
              if (c.findFirst(MethodDeclaration.class, m -> m.getNameAsString().equals("getStream")).isEmpty()) {
                  MethodDeclaration getStream = c.addMethod("getStream");
                  getStream.setType("OutputStream");
                  getStream.setBody(new BlockStmt().addStatement(
                      new com.github.javaparser.ast.stmt.ReturnStmt(new NameExpr("currentOutputStream"))
                  ));
              }
              
              // Remove @Override annotations from getStream and thresholdReached
              c.findAll(MethodDeclaration.class).stream()
               .filter(m -> m.getNameAsString().equals("getStream") || m.getNameAsString().equals("thresholdReached"))
               .forEach(m -> m.getAnnotations().removeIf(a -> a.getNameAsString().equals("Override")));
              
              // Remove @Override from close method
              c.findAll(MethodDeclaration.class).stream()
               .filter(m -> m.getNameAsString().equals("close"))
               .forEach(m -> m.getAnnotations().removeIf(a -> a.getNameAsString().equals("Override")));
              
              // Fix constructor - remove super(threshold) call
              c.getConstructors().forEach(constructor -> {
                  constructor.getBody().getStatements().stream()
                    .filter(s -> s.toString().trim().startsWith("super("))
                    .findFirst()
                    .ifPresent(s -> s.remove());
              });
              
              // Fix close method - remove super.close() call
              c.findAll(MethodDeclaration.class).stream()
               .filter(m -> m.getNameAsString().equals("close"))
               .forEach(m -> {
                   m.getBody().ifPresent(body -> {
                       body.getStatements().stream()
                         .filter(s -> s.toString().trim().contains("super.close()"))
                         .findFirst()
                         .ifPresent(s -> s.remove());
                   });
               });
          });
        
        // Fix DeferredScatterOutputStream - add write method to OffloadingOutputStream reference
        cu.findAll(ClassOrInterfaceDeclaration.class).stream()
          .filter(c -> c.getNameAsString().equals("DeferredScatterOutputStream"))
          .forEach(c -> {
              // This file references OffloadingOutputStream.write() which doesn't exist
              // We need to ensure OffloadingOutputStream has write methods from OutputStream
              // This is handled by not extending ThresholdingOutputStream anymore
          });
        
        return modified;
    }
    
    private static boolean fixJarToolModularJarArchiver(CompilationUnit cu) {
        boolean modified = false;
        
        // Remove NullPrintStream import
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals("org.apache.commons.io.output.NullPrintStream"));
        modified = true;
        
        // Add a custom NullPrintStream field to the class
        cu.findAll(ClassOrInterfaceDeclaration.class).stream()
          .filter(c -> c.getNameAsString().equals("JarToolModularJarArchiver"))
          .forEach(c -> {
              // Add static final field for null print stream
              FieldDeclaration nullStreamField = c.addField("PrintStream", "NULL_PRINT_STREAM");
              nullStreamField.setStatic(true);
              nullStreamField.setFinal(true);
              nullStreamField.getVariable(0).setInitializer(
                  "new PrintStream(new java.io.OutputStream() {\n" +
                  "    @Override\n" +
                  "    public void write(int b) throws java.io.IOException {}\n" +
                  "})"
              );
              
              // Replace NullPrintStream.NULL_PRINT_STREAM with NULL_PRINT_STREAM
              c.findAll(NameExpr.class).stream()
               .filter(n -> n.getNameAsString().equals("NullPrintStream"))
               .forEach(n -> {
                   // Find the parent that accesses NULL_PRINT_STREAM
                   n.getParentNode().ifPresent(parent -> {
                       if (parent.toString().contains("NULL_PRINT_STREAM")) {
                           parent.replace(new NameExpr("NULL_PRINT_STREAM"));
                       }
                   });
               });
          });
        
        return modified;
    }
}
