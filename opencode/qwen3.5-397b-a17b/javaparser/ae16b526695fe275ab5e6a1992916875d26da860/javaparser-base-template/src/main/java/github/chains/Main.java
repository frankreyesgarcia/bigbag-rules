package github.chains;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String OLD_SOURCE = "<source>1.6</source>";
    private static final String NEW_SOURCE = "<source>1.7</source>";
    private static final String OLD_TARGET = "<target>1.6</target>";
    private static final String NEW_TARGET = "<target>1.7</target>";

    private static final String OLD_JETTY_IMPORT = "import org.eclipse.jetty.server.nio.SelectChannelConnector;";
    private static final String NEW_JETTY_IMPORTS = "import org.eclipse.jetty.server.ServerConnector;\n" +
            "import org.eclipse.jetty.server.HttpConfiguration;\n" +
            "import org.eclipse.jetty.server.HttpConnectionFactory;";

    private static final String OLD_CONNECTOR_TYPE = "private final Connector httpConnector;";
    private static final String NEW_CONNECTOR_TYPE = "private final ServerConnector httpConnector;";

    private static final String OLD_SERVER_CONFIG = "this.server = new Server();\n" +
            "        this.server.setSendServerVersion(false);\n" +
            "        this.server.setSendDateHeader(true);\n" +
            "        \n" +
            "        this.httpConnector = new SelectChannelConnector();\n" +
            "        this.httpConnector.setPort(port);";

    private static final String NEW_SERVER_CONFIG = "HttpConfiguration httpConfig = new HttpConfiguration();\n" +
            "        httpConfig.setSendServerVersion(false);\n" +
            "        httpConfig.setSendDateHeader(true);\n" +
            "        \n" +
            "        this.server = new Server();\n" +
            "        this.httpConnector = new ServerConnector(server, new HttpConnectionFactory(httpConfig));\n" +
            "        this.httpConnector.setPort(port);";

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java github.chains.Main <jadler-project-root>");
            System.exit(1);
        }

        String jadlerRoot = args[0];
        
        List<String> pomFiles = Arrays.asList(
            jadlerRoot + "/pom.xml",
            jadlerRoot + "/jadler-core/pom.xml",
            jadlerRoot + "/jadler-jetty/pom.xml",
            jadlerRoot + "/jadler-junit/pom.xml",
            jadlerRoot + "/jadler-jdk/pom.xml",
            jadlerRoot + "/jadler-all/pom.xml"
        );

        int fixedCount = 0;
        for (String pomPath : pomFiles) {
            File pomFile = new File(pomPath);
            if (pomFile.exists()) {
                if (fixPomFile(pomFile)) {
                    System.out.println("Fixed: " + pomPath);
                    fixedCount++;
                } else {
                    System.out.println("No changes needed: " + pomPath);
                }
            } else {
                System.out.println("Not found: " + pomPath);
            }
        }

        String jettyFile = jadlerRoot + "/jadler-jetty/src/main/java/net/jadler/stubbing/server/jetty/JettyStubHttpServer.java";
        File jettySrc = new File(jettyFile);
        if (jettySrc.exists()) {
            if (fixJettyFile(jettySrc)) {
                System.out.println("Fixed: " + jettyFile);
                fixedCount++;
            } else {
                System.out.println("No changes needed: " + jettyFile);
            }
        }

        System.out.println("Transformation complete. Fixed " + fixedCount + " file(s).");
    }

    private static boolean fixPomFile(File pomFile) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(pomFile.getPath())), StandardCharsets.UTF_8);
        String original = content;
        
        content = content.replace(OLD_SOURCE, NEW_SOURCE);
        content = content.replace(OLD_TARGET, NEW_TARGET);
        
        if (!content.equals(original)) {
            Files.write(Paths.get(pomFile.getPath()), content.getBytes(StandardCharsets.UTF_8));
            return true;
        }
        
        return false;
    }

    private static boolean fixJettyFile(File jettyFile) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(jettyFile.getPath())), StandardCharsets.UTF_8);
        String original = content;
        
        content = content.replace(OLD_JETTY_IMPORT, NEW_JETTY_IMPORTS);
        content = content.replace(OLD_CONNECTOR_TYPE, NEW_CONNECTOR_TYPE);
        content = content.replace(OLD_SERVER_CONFIG, NEW_SERVER_CONFIG);
        
        if (!content.equals(original)) {
            Files.write(Paths.get(jettyFile.getPath()), content.getBytes(StandardCharsets.UTF_8));
            return true;
        }
        
        return false;
    }
}
