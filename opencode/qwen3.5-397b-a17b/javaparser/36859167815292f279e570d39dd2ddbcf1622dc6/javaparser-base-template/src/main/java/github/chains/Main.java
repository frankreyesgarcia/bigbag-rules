package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file>");
            System.exit(1);
        }

        Path sourcePath = Paths.get(args[0]);
        processFile(sourcePath);
        System.out.println("Transformation complete.");
    }

    private static void processFile(Path javaFile) {
        try {
            System.out.println("Processing: " + javaFile);
            
            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            
            new VoidVisitorAdapter<Void>() {
                @Override
                public void visit(MethodCallExpr methodCall, Void arg) {
                    super.visit(methodCall, arg);
                    
                    String scopeStr = methodCall.getScope()
                        .map(Object::toString)
                        .orElse("");
                    
                    if ("FopFactory".equals(scopeStr) && 
                        "newInstance".equals(methodCall.getNameAsString()) &&
                        methodCall.getArguments().isEmpty()) {
                        
                        ObjectCreationExpr fileCreation = new ObjectCreationExpr();
                        fileCreation.setType("File");
                        fileCreation.addArgument("\".\"");
                        methodCall.addArgument(fileCreation);
                        
                        System.out.println("  Fixed: FopFactory.newInstance() -> FopFactory.newInstance(new File(\".\"))");
                    }
                }
            }.visit(cu, null);
            
            try (FileWriter writer = new FileWriter(javaFile.toFile())) {
                writer.write(cu.toString());
            }
            
        } catch (IOException e) {
            System.err.println("Error processing " + javaFile + ": " + e.getMessage());
        }
    }
}
