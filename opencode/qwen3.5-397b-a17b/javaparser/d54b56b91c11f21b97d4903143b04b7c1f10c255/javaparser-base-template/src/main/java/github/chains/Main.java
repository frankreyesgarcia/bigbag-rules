package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        String sourceDir = args[0];
        List<Path> javaFiles = Files.walk(Paths.get(sourceDir))
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        ParserConfiguration config = new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_8);
        JavaParser parser = new JavaParser(config);

        for (Path file : javaFiles) {
            try {
                ParseResult<CompilationUnit> result = parser.parse(file);
                if (result.isSuccessful() && result.getResult().isPresent()) {
                    CompilationUnit cu = result.getResult().get();

                    cu.getImports().removeIf(importDecl -> 
                        importDecl.getNameAsString().equals("com.google.cloud.pubsublite.PublishMetadata"));

                    cu.accept(new VoidVisitorAdapter<Void>() {
                        @Override
                        public void visit(ClassOrInterfaceType type, Void arg) {
                            super.visit(type, arg);
                            if (type.getNameAsString().equals("Publisher") && type.getTypeArguments().isPresent()) {
                                NodeList<Type> typeArgs = type.getTypeArguments().get();
                                if (!typeArgs.isEmpty()) {
                                    Type firstArg = typeArgs.get(0);
                                    if (firstArg instanceof ClassOrInterfaceType) {
                                        ClassOrInterfaceType argType = (ClassOrInterfaceType) firstArg;
                                        if (argType.getNameAsString().equals("PublishMetadata")) {
                                            typeArgs.set(0, new ClassOrInterfaceType(null, "Void"));
                                        }
                                    }
                                }
                            }
                        }

                        @Override
                        public void visit(MethodCallExpr methodCall, Void arg) {
                            super.visit(methodCall, arg);
                            if (methodCall.getNameAsString().equals("setContext")) {
                                methodCall.remove();
                            }
                        }
                    }, null);

                    Files.writeString(file, cu.toString());
                    System.out.println("Processed: " + file);
                }
            } catch (Exception e) {
                System.err.println("Error processing " + file + ": " + e.getMessage());
            }
        }
    }
}
