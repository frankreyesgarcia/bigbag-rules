package github.chains;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <pom-file>");
            System.exit(1);
        }

        Path pomFile = Paths.get(args[0]);
        transformPom(pomFile);
    }

    public static void transformPom(Path pomFile) throws Exception {
        String content = Files.readString(pomFile);
        
        // Remove the jakarta.servlet-api 6.0.0 override that conflicts with Dropwizard 2.x
        // which uses jakarta.servlet-api 4.0.4 (with javax.servlet package)
        Pattern pattern = Pattern.compile(
            "<!-- Required for dependency convergence -->\\s*" +
            "<dependency>\\s*" +
            "<groupId>jakarta\\.servlet</groupId>\\s*" +
            "<artifactId>jakarta\\.servlet-api</artifactId>\\s*" +
            "<version>6\\.0\\.0</version>\\s*" +
            "</dependency>",
            Pattern.DOTALL
        );
        
        String transformed = pattern.matcher(content).replaceAll("");
        
        // Also add jakarta.servlet-api as a direct dependency if not present
        if (!transformed.contains("<artifactId>jakarta.servlet-api</artifactId>") ||
            !transformed.contains("<scope>compile</scope>")) {
            
            // Add jakarta.servlet-api dependency after dropwizard-core
            transformed = transformed.replaceAll(
                "(<artifactId>dropwizard-core</artifactId>\\s*<scope>provided</scope>\\s*</dependency>)",
                "$1\n    <dependency>\n      <groupId>jakarta.servlet</groupId>\n      <artifactId>jakarta.servlet-api</artifactId>\n    </dependency>"
            );
        }
        
        Files.writeString(pomFile, transformed);
        System.out.println("Transformed POM: " + pomFile);
    }
}
