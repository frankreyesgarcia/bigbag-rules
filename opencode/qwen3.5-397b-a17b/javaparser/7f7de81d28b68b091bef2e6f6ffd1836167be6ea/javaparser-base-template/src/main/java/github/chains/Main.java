package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.WildcardType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.github.javaparser.ast.NodeList;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            System.exit(1);
        }

        CompilationUnit cu = StaticJavaParser.parse(file);

        cu.accept(new ManagedObjectFixVisitor(), null);

        Files.write(Paths.get(filePath), cu.toString().getBytes());
        System.out.println("Transformation applied successfully to: " + filePath);
    }

    static class ManagedObjectFixVisitor extends VoidVisitorAdapter<Void> {
        @Override
        public void visit(VariableDeclarator n, Void arg) {
            super.visit(n, arg);
            
            if (n.getType().isArrayType() || n.getType().isPrimitiveType()) {
                return;
            }
            
            ClassOrInterfaceType type = n.getType().asClassOrInterfaceType();
            
            if (type.getNameAsString().equals("SortedMap") && type.getTypeArguments().isPresent()) {
                var typeArgs = type.getTypeArguments().get();
                if (typeArgs.size() == 2) {
                    Type valueType = typeArgs.get(1);
                    if (valueType instanceof ClassOrInterfaceType) {
                        ClassOrInterfaceType valueClassType = (ClassOrInterfaceType) valueType;
                        if (valueClassType.getNameAsString().equals("ManagedObject") && 
                            !valueClassType.getTypeArguments().isPresent()) {
                            WildcardType wildcard = new WildcardType();
                            ClassOrInterfaceType managedObjectWithWildcard = new ClassOrInterfaceType();
                            managedObjectWithWildcard.setName("ManagedObject");
                            NodeList<Type> wildcardArgs = new NodeList<>();
                            wildcardArgs.add(wildcard);
                            managedObjectWithWildcard.setTypeArguments(wildcardArgs);
                            typeArgs.set(1, managedObjectWithWildcard);
                        }
                    }
                }
            }
        }
    }
}
