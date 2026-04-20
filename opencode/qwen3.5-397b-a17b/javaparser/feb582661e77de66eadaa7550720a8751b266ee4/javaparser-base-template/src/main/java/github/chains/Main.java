package github.chains;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        fixPomXml();
        fixCreateIndexGeneratorMSSQL();
        fixAddPrimaryKeyGeneratorMSSQL();
        fixMSSQLDatabase();
        System.out.println("All fixes applied successfully");
    }
    
    private static void fixPomXml() throws IOException {
        String pomPath = "/workspace/liquibase-mssql/pom.xml";
        String content = Files.readString(Paths.get(pomPath));
        
        content = content.replaceAll("<source>1\\.6</source>", "<source>11</source>");
        content = content.replaceAll("<target>1\\.6</target>", "<target>11</target>");
        
        Files.writeString(Paths.get(pomPath), content);
        System.out.println("Fixed pom.xml: changed source/target from 1.6 to 11");
    }
    
    private static void fixCreateIndexGeneratorMSSQL() throws IOException {
        String path = "/workspace/liquibase-mssql/src/java/liquibase/ext/mssql/sqlgenerator/CreateIndexGeneratorMSSQL.java";
        String content = Files.readString(Paths.get(path));
        
        content = content.replace("import liquibase.util.StringUtils;", "import liquibase.util.StringUtil;");
        content = content.replace("StringUtils.trimToNull", "StringUtil.trimToNull");
        
        Files.writeString(Paths.get(path), content);
        System.out.println("Fixed CreateIndexGeneratorMSSQL.java: StringUtils -> StringUtil");
    }
    
    private static void fixAddPrimaryKeyGeneratorMSSQL() throws IOException {
        String path = "/workspace/liquibase-mssql/src/java/liquibase/ext/mssql/sqlgenerator/AddPrimaryKeyGeneratorMSSQL.java";
        String content = Files.readString(Paths.get(path));
        
        content = content.replace("import liquibase.util.StringUtils;", "import liquibase.util.StringUtil;");
        content = content.replace("StringUtils.trimToNull", "StringUtil.trimToNull");
        
        Files.writeString(Paths.get(path), content);
        System.out.println("Fixed AddPrimaryKeyGeneratorMSSQL.java: StringUtils -> StringUtil");
    }
    
    private static void fixMSSQLDatabase() throws IOException {
        String path = "/workspace/liquibase-mssql/src/java/liquibase/ext/mssql/database/MSSQLDatabase.java";
        String content = Files.readString(Paths.get(path));
        
        content = content.replace(
            "ExecutorService.getInstance().getExecutor(this)",
            "liquibase.Scope.getCurrentScope().getSingleton(ExecutorService.class).getExecutor(this)"
        );
        
        Files.writeString(Paths.get(path), content);
        System.out.println("Fixed MSSQLDatabase.java: ExecutorService API update");
    }
}
