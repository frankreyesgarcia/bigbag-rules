package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <path-to-java-file>");
            System.exit(1);
        }

        Path filePath = Paths.get(args[0]);
        String sourceCode = Files.readString(filePath);

        ParserConfiguration config = new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);
        JavaParser parser = new JavaParser(config);

        ParseResult<CompilationUnit> parseResult = parser.parse(sourceCode);
        
        if (!parseResult.isSuccessful() || parseResult.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + parseResult.getProblems());
            System.exit(1);
        }

        CompilationUnit cu = parseResult.getResult().get();
        cu.accept(new ThriftApiTransformer(), null);

        String transformedCode = cu.toString();
        Files.writeString(filePath, transformedCode);

        System.out.println("Transformation completed successfully.");
    }

    static class ThriftApiTransformer extends ModifierVisitor<Void> {

        @Override
        public Node visit(ImportDeclaration importDecl, Void arg) {
            String importName = importDecl.getNameAsString();
            if (importName.equals("org.apache.thrift.transport.TFastFramedTransport")) {
                importDecl.setName("org.apache.thrift.transport.layered.TFramedTransport");
            } else if (importName.equals("org.apache.thrift.transport.TFramedTransport")) {
                importDecl.setName("org.apache.thrift.transport.layered.TFramedTransport");
            }
            return super.visit(importDecl, arg);
        }

        @Override
        public Node visit(ClassOrInterfaceType type, Void arg) {
            if (type.getNameAsString().equals("TFastFramedTransport")) {
                type.setName("TFramedTransport");
            }
            return (Node) super.visit(type, arg);
        }

        @Override
        public Node visit(ObjectCreationExpr expr, Void arg) {
            if (expr.getType().getNameAsString().equals("TFastFramedTransport")) {
                expr.setType(new ClassOrInterfaceType(null, "TFramedTransport"));
                List<Expression> arguments = expr.getArguments();
                if (arguments.size() == 2) {
                    arguments.remove(1);
                }
            }
            return (Node) super.visit(expr, arg);
        }
    }
}
