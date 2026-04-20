package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <source-directory>");
            System.exit(1);
        }

        Path sourceDir = java.nio.file.Paths.get(args[0]);
        SourceRoot sourceRoot = new SourceRoot(sourceDir);

        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);
        JavaParser javaParser = new JavaParser(config);
        sourceRoot.setParserConfiguration(config);

        List<UnitInfo> units = new ArrayList<>();
        sourceRoot.parse("", new SourceRoot.Callback() {
            @Override
            public Result process(Path localPath, Path absolutePath, ParseResult<CompilationUnit> result) {
                result.getResult().ifPresent(cu -> units.add(new UnitInfo(cu, absolutePath)));
                return Result.DONT_SAVE;
            }
        });

        for (UnitInfo info : units) {
            CompilationUnit cu = info.cu;
            
            IsAllBlankFixer fixer1 = new IsAllBlankFixer();
            fixer1.visit(cu, null);
            fixer1.applyChanges(cu);
            
            ClientHelperFixer fixer2 = new ClientHelperFixer();
            fixer2.visit(cu, null);
            fixer2.applyChanges();
            
            try (FileWriter writer = new FileWriter(info.path.toFile())) {
                writer.write(cu.toString());
            }
        }

        System.out.println("Transformation complete! Modified " + units.size() + " files.");
    }

    static class UnitInfo {
        CompilationUnit cu;
        Path path;
        UnitInfo(CompilationUnit cu, Path path) {
            this.cu = cu;
            this.path = path;
        }
    }

    static class IsAllBlankFixer extends VoidVisitorAdapter<Void> {
        private final List<MethodCallExpr> toReplace = new ArrayList<>();
        private boolean removedIsAllBlankImport = false;
        private boolean hasIsBlankImport = false;

        @Override
        public void visit(MethodCallExpr n, Void arg) {
            super.visit(n, arg);
            if (isIsAllBlankCall(n)) {
                toReplace.add(n);
            }
        }

        @Override
        public void visit(ImportDeclaration n, Void arg) {
            super.visit(n, arg);
            String name = n.getNameAsString();
            if (name.equals("org.apache.commons.lang3.StringUtils.isAllBlank")) {
                removedIsAllBlankImport = true;
            }
            if (name.equals("org.apache.commons.lang3.StringUtils.isBlank")) {
                hasIsBlankImport = true;
            }
            if (name.equals("org.apache.commons.lang3.StringUtils") && n.isAsterisk()) {
                hasIsBlankImport = true;
            }
        }

        private boolean isIsAllBlankCall(MethodCallExpr methodCall) {
            return methodCall.getName().asString().equals("isAllBlank");
        }

        private Expression createIsAllBlankReplacement(MethodCallExpr methodCall) {
            List<Expression> args = methodCall.getArguments();
            if (args.isEmpty()) {
                return methodCall;
            }

            Expression result = createIsBlankCheck(args.get(0));

            for (int i = 1; i < args.size(); i++) {
                result = new BinaryExpr(
                        result,
                        createIsBlankCheck(args.get(i)),
                        BinaryExpr.Operator.AND
                );
            }

            return result;
        }

        private Expression createIsBlankCheck(Expression arg) {
            return new MethodCallExpr("isBlank", arg);
        }

        public void applyChanges(CompilationUnit cu) {
            for (MethodCallExpr n : toReplace) {
                Expression replacement = createIsAllBlankReplacement(n);
                n.replace(replacement);
            }
            
            if (removedIsAllBlankImport && !hasIsBlankImport) {
                cu.addImport("static org.apache.commons.lang3.StringUtils.isBlank");
            }
            
            cu.getImports().removeIf(n -> 
                n.getNameAsString().equals("org.apache.commons.lang3.StringUtils.isAllBlank")
            );
        }
    }

    static class ClientHelperFixer extends VoidVisitorAdapter<Void> {
        private final List<ObjectCreationExpr> toFix = new ArrayList<>();

        @Override
        public void visit(CompilationUnit cu, Void arg) {
            super.visit(cu, arg);
            cu.findAll(ObjectCreationExpr.class).forEach(creation -> {
                if (isClientHelperConstructor(creation)) {
                    toFix.add(creation);
                }
            });
        }

        private boolean isClientHelperConstructor(ObjectCreationExpr creation) {
            return creation.getType().getNameAsString().equals("ClientHelper");
        }

        public void applyChanges() {
            for (ObjectCreationExpr creation : toFix) {
                List<Expression> args = creation.getArguments();
                if (args.size() >= 4) {
                    Expression newFirstArg = new MethodCallExpr(
                            new NameExpr("build"),
                            "getParent"
                    );
                    creation.setArgument(0, newFirstArg);
                }
            }
        }
    }
}
