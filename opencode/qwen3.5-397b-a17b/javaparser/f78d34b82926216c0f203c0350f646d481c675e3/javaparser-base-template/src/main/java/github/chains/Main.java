package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.VoidType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String TARGET_DIR = "/workspace/PeyangSuperbAntiCheat/src/main/java";

    public static void main(String[] args) throws IOException {
        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_8);
        JavaParser parser = new JavaParser(config);

        fixNeuron(parser);
        fixDecorations(parser);
        fixNPCTeleport(parser);
        fixPlayerUtils(parser);
        createWaveCreator();
        createLeetConverter();

        System.out.println("Transformation completed successfully!");
    }

    private static void fixNeuron(JavaParser parser) throws IOException {
        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Learn/Neuron.java");
        ParseResult<CompilationUnit> result = parser.parse(Files.newInputStream(path));
        CompilationUnit cu = result.getResult().orElseThrow();

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().startsWith("develop.p2p.lib"))
            .forEach(ImportDeclaration::remove);

        ClassOrInterfaceDeclaration neuronClass = cu.getClassByName("Neuron").orElseThrow();

        MethodDeclaration sigmoidMethod = neuronClass.addMethod("sigmoid", Modifier.Keyword.PRIVATE, Modifier.Keyword.STATIC);
        sigmoidMethod.setType(PrimitiveType.DOUBLE);
        Parameter param = new Parameter(PrimitiveType.DOUBLE, "x");
        sigmoidMethod.addParameter(param);

        BlockStmt body = new BlockStmt();
        body.addStatement(new ExpressionStmt(
            new VariableDeclarationExpr(
                PrimitiveType.DOUBLE,
                "expVal",
                new MethodCallExpr("Math", "exp", new NameExpr("-x"))
            )
        ));
        body.addStatement(new ReturnStmt(
            new BinaryExpr(
                new DoubleLiteralExpr(1.0),
                new BinaryExpr(
                    new DoubleLiteralExpr(1.0),
                    new NameExpr("expVal"),
                    BinaryExpr.Operator.PLUS
                ),
                BinaryExpr.Operator.MINUS
            )
        ));
        sigmoidMethod.setBody(body);

        Files.writeString(path, cu.toString());
        System.out.println("Fixed: Neuron.java");
    }

    private static void fixDecorations(JavaParser parser) throws IOException {
        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Objects/Decorations.java");
        ParseResult<CompilationUnit> result = parser.parse(Files.newInputStream(path));
        CompilationUnit cu = result.getResult().orElseThrow();

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().startsWith("develop.p2p.lib"))
            .forEach(ImportDeclaration::remove);

        Files.writeString(path, cu.toString());
        System.out.println("Fixed: Decorations.java");
    }

    private static void fixNPCTeleport(JavaParser parser) throws IOException {
        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Detect/NPCTeleport.java");
        ParseResult<CompilationUnit> result = parser.parse(Files.newInputStream(path));
        CompilationUnit cu = result.getResult().orElseThrow();

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().startsWith("develop.p2p.lib"))
            .forEach(ImportDeclaration::remove);

        Files.writeString(path, cu.toString());
        System.out.println("Fixed: NPCTeleport.java");
    }

    private static void fixPlayerUtils(JavaParser parser) throws IOException {
        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Utils/PlayerUtils.java");
        ParseResult<CompilationUnit> result = parser.parse(Files.newInputStream(path));
        CompilationUnit cu = result.getResult().orElseThrow();

        cu.getImports().stream()
            .filter(imp -> imp.getNameAsString().startsWith("develop.p2p.lib"))
            .forEach(ImportDeclaration::remove);

        cu.findAll(MethodCallExpr.class).stream()
            .filter(call -> call.getScope().isPresent() &&
                           call.getScope().get().toString().equals("develop.p2p.lib.LeetConverter") &&
                           call.getNameAsString().equals("convert"))
            .forEach(call -> {
                call.setScope(null);
                call.setName("convertToLeet");
            });

        Files.writeString(path, cu.toString());
        System.out.println("Fixed: PlayerUtils.java");
    }

    private static void createWaveCreator() throws IOException {
        String content = """
            package ml.peya.plugins.Utils;

            public class WaveCreator {
                private final double min;
                private final double max;
                private final double amplitude;
                private double position = 0.0;

                public WaveCreator(double min, double max, double amplitude) {
                    this.min = min;
                    this.max = max;
                    this.amplitude = amplitude;
                }

                public double get(double speed, boolean reset) {
                    if (reset) {
                        position = 0.0;
                    }
                    position += speed;
                    return min + (Math.sin(position) + 1) / 2 * (max - min);
                }

                public double getStatic() {
                    return (min + max) / 2;
                }
            }
            """;

        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Utils/WaveCreator.java");
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
        System.out.println("Created: WaveCreator.java");
    }

    private static void createLeetConverter() throws IOException {
        String content = """
            package ml.peya.plugins.Utils;

            import java.util.HashMap;
            import java.util.Map;
            import java.util.Random;

            public class LeetConverter {
                private static final Map<Character, Character[]> LEET_MAP = new HashMap<>();

                static {
                    LEET_MAP.put('a', new Character[]{'4', '@'});
                    LEET_MAP.put('e', new Character[]{'3'});
                    LEET_MAP.put('i', new Character[]{'1', '!'});
                    LEET_MAP.put('o', new Character[]{'0'});
                    LEET_MAP.put('s', new Character[]{'5', '$'});
                    LEET_MAP.put('t', new Character[]{'7'});
                    LEET_MAP.put('l', new Character[]{'1'});
                }

                private static final Random RANDOM = new Random();

                public static String convert(String input) {
                    if (input == null || input.isEmpty()) {
                        return input;
                    }
                    StringBuilder result = new StringBuilder();
                    for (char c : input.toLowerCase().toCharArray()) {
                        if (LEET_MAP.containsKey(c) && RANDOM.nextBoolean()) {
                            Character[] replacements = LEET_MAP.get(c);
                            result.append(replacements[RANDOM.nextInt(replacements.length)]);
                        } else {
                            result.append(c);
                        }
                    }
                    return result.toString();
                }
            }
            """;

        Path path = Paths.get(TARGET_DIR, "ml/peya/plugins/Utils/LeetConverter.java");
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
        System.out.println("Created: LeetConverter.java");
    }
}
