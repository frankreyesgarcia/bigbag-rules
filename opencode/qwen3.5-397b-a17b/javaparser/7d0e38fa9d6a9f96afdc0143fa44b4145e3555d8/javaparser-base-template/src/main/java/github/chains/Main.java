package github.chains;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.printer.PrettyPrinter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-file-or-directory>");
            System.exit(1);
        }
        File input = new File(args[0]);
        if (input.isDirectory()) {
            processDirectory(input);
        } else {
            processFile(input);
        }
    }

    private static void processDirectory(File dir) throws Exception {
        for (File file : dir.listFiles((d, name) -> name.endsWith(".java"))) {
            processFile(file);
        }
    }

    private static void processFile(File file) throws Exception {
        try {
            CompilationUnit cu = StaticJavaParser.parse(file);
            DnsApiFixVisitor visitor = new DnsApiFixVisitor();
            visitor.visit(cu, null);
            if (visitor.hasChanges()) {
                PrettyPrinter prettyPrinter = new PrettyPrinter();
                String code = prettyPrinter.print(cu);
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(code);
                }
                System.out.println("Fixed: " + file.getPath());
            }
        } catch (Exception e) {
            System.err.println("Error processing " + file.getPath() + ": " + e.getMessage());
        }
    }

    static class DnsApiFixVisitor extends VoidVisitorAdapter<Void> {
        private boolean hasChanges = false;
        public boolean hasChanges() { return hasChanges; }

        @Override
        public void visit(MethodCallExpr methodCall, Void arg) {
            super.visit(methodCall, arg);
            String methodName = methodCall.getNameAsString();
            if ("create".equals(methodName)) {
                List<Expression> args = methodCall.getArguments();
                if (args.size() == 2) {
                    Expression secondArg = args.get(1);
                    String argStr = secondArg.toString();
                    if (argStr.contains("zone") && !argStr.contains("zoneName")) {
                        Expression firstArg = args.get(0);
                        NodeList<Expression> newArgs = new NodeList<>();
                        newArgs.add(firstArg);
                        methodCall.setArguments(newArgs);
                        MethodCallExpr setContentCall = new MethodCallExpr(methodCall, "setContent");
                        setContentCall.addArgument(secondArg);
                        methodCall.replace(setContentCall);
                        hasChanges = true;
                    }
                } else if (args.size() == 3) {
                    Expression firstArg = args.get(0);
                    Expression secondArg = args.get(1);
                    Expression thirdArg = args.get(2);
                    String argStr = thirdArg.toString();
                    if (argStr.contains("change")) {
                        NodeList<Expression> newArgs = new NodeList<>();
                        newArgs.add(firstArg);
                        newArgs.add(secondArg);
                        methodCall.setArguments(newArgs);
                        MethodCallExpr setContentCall = new MethodCallExpr(methodCall, "setContent");
                        setContentCall.addArgument(thirdArg);
                        methodCall.replace(setContentCall);
                        hasChanges = true;
                    }
                }
            }
        }
    }
}
