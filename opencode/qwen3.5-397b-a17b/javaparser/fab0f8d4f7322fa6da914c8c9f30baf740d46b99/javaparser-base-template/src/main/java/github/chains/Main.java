package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import java.io.IOException;
import java.util.Optional;
import java.util.Optional;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <source-directory>");
            System.exit(1);
        }
        
        Path sourceDir = Paths.get(args[0]);
        
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(Main::transformFile);
        }
    }
    
    private static void transformFile(Path path) {
        try {
            CompilationUnit cu = StaticJavaParser.parse(path);
            boolean[] modified = {false};
            
            if (cu.getImports().removeIf(
                    imp -> imp.getNameAsString().equals("org.cactoos.io.BytesOf") ||
                           imp.getNameAsString().equals("org.cactoos.text.HexOf"))) {
                modified[0] = true;
            }
            
            cu.findAll(ObjectCreationExpr.class).stream()
              .filter(Main::isHexOfBytesOf)
              .forEach(expr -> {
                  Expression replacement = createHexConversion(expr);
                  if (expr.getParentNode().isPresent() && 
                      expr.getParentNode().get() instanceof MethodCallExpr) {
                      MethodCallExpr methodCall = (MethodCallExpr) expr.getParentNode().get();
                      if ("asString".equals(methodCall.getNameAsString())) {
                          methodCall.replace(replacement);
                      } else {
                          expr.replace(replacement);
                      }
                  } else {
                      expr.replace(replacement);
                  }
                  modified[0] = true;
              });
            
            if (modified[0]) {
                cu.addImport("java.math.BigInteger");
                Files.writeString(path, cu.toString());
                System.out.println("Transformed: " + path);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + path + ": " + e.getMessage());
        }
    }
    
    private static boolean isHexOfBytesOf(ObjectCreationExpr expr) {
        if (!expr.getType().getNameAsString().equals("HexOf")) {
            return false;
        }
        
        if (expr.getArguments().size() != 1) {
            return false;
        }
        
        Expression arg = expr.getArgument(0);
        if (!(arg instanceof ObjectCreationExpr)) {
            return false;
        }
        
        ObjectCreationExpr inner = (ObjectCreationExpr) arg;
        return inner.getType().getNameAsString().equals("BytesOf");
    }
    
    private static Expression createHexConversion(ObjectCreationExpr hexOfExpr) {
        Expression innerExpr = hexOfExpr.getArgument(0);
        if (!(innerExpr instanceof ObjectCreationExpr)) {
            return hexOfExpr;
        }
        
        ObjectCreationExpr bytesOfExpr = (ObjectCreationExpr) innerExpr;
        if (bytesOfExpr.getArguments().isEmpty()) {
            return hexOfExpr;
        }
        
        Expression digestExpr = bytesOfExpr.getArgument(0);
        
        MethodCallExpr formatCall = new MethodCallExpr(
            new NameExpr("String"),
            "format"
        );
        formatCall.addArgument(new StringLiteralExpr("%064x"));
        
        NodeList<Expression> bigIntArgs = new NodeList<>();
        bigIntArgs.add(new NameExpr("1"));
        bigIntArgs.add(digestExpr.clone());
        
        ObjectCreationExpr bigInteger = new ObjectCreationExpr(
            null,
            new com.github.javaparser.ast.type.ClassOrInterfaceType(null, "BigInteger"),
            bigIntArgs
        );
        
        formatCall.addArgument(bigInteger);
        
        return formatCall;
    }
}
