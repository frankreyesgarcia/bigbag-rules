package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }
        
        Path path = Paths.get(args[0]);
        
        if (Files.isDirectory(path)) {
            Files.walk(path)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(Main::transformFile);
        } else {
            transformFile(path);
        }
    }
    
    private static void transformFile(Path path) {
        try {
            String source = Files.readString(path);
            JavaParser parser = new JavaParser();
            ParseResult<CompilationUnit> result = parser.parse(source);
            
            if (result.isSuccessful() && result.getResult().isPresent()) {
                CompilationUnit cu = result.getResult().get();
                boolean modified = false;
                
                List<ImportDeclaration> imports = cu.getImports();
                for (ImportDeclaration importDecl : imports) {
                    String name = importDecl.getNameAsString();
                    if (name.startsWith("javax.annotation.")) {
                        String newName = name.replace("javax.annotation.", "jakarta.annotation.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.startsWith("javax.enterprise.")) {
                        String newName = name.replace("javax.enterprise.", "jakarta.enterprise.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.startsWith("javax.inject.")) {
                        String newName = name.replace("javax.inject.", "jakarta.inject.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.startsWith("javax.persistence.")) {
                        String newName = name.replace("javax.persistence.", "jakarta.persistence.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.startsWith("javax.transaction.")) {
                        String newName = name.replace("javax.transaction.", "jakarta.transaction.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.equals("javax.ws.rs.ApplicationPath")) {
                        importDecl.setName("jakarta.ws.rs.ApplicationPath");
                        modified = true;
                    } else if (name.startsWith("javax.ws.rs.")) {
                        String newName = name.replace("javax.ws.rs.", "jakarta.ws.rs.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.startsWith("javax.servlet.")) {
                        String newName = name.replace("javax.servlet.", "jakarta.servlet.");
                        importDecl.setName(newName);
                        modified = true;
                    } else if (name.equals("javax.faces.bean.ApplicationScoped")) {
                        importDecl.setName("jakarta.faces.bean.ApplicationScoped");
                        modified = true;
                    }
                }
                
                if (modified) {
                    String transformed = cu.toString();
                    Files.writeString(path, transformed);
                    System.out.println("Transformed: " + path);
                }
            }
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }
}
