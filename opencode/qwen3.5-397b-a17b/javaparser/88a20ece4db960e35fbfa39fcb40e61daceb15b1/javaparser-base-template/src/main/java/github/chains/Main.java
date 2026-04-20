package github.chains;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.VoidType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    
    private static final String PUBLISH_METADATA_IMPORT = "com.google.cloud.pubsublite.PublishMetadata";
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: java Main <file-to-transform>");
            System.exit(1);
        }
        
        Path filePath = Paths.get(args[0]);
        String content = Files.readString(filePath);
        
        JavaParser parser = new JavaParser();
        ParseResult<CompilationUnit> result = parser.parse(content);
        
        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            System.err.println("Failed to parse file: " + filePath);
            result.getProblems().forEach(System.err::println);
            System.exit(1);
        }
        
        CompilationUnit cu = result.getResult().get();
        
        removePublishMetadataImport(cu);
        replacePublishMetadataType(cu);
        fixPartitionPublisherFactoryLambda(cu);
        
        String transformed = cu.toString();
        Files.writeString(filePath, transformed);
        
        System.out.println("Successfully transformed: " + filePath);
    }
    
    private static void removePublishMetadataImport(CompilationUnit cu) {
        cu.getImports().removeIf(importDecl -> 
            importDecl.getNameAsString().equals(PUBLISH_METADATA_IMPORT)
        );
    }
    
    private static void replacePublishMetadataType(CompilationUnit cu) {
        cu.findAll(ClassOrInterfaceType.class).forEach(type -> {
            if (type.getNameAsString().equals("PublishMetadata")) {
                type.setName("Void");
            }
        });
    }
    
    private static void fixPartitionPublisherFactoryLambda(CompilationUnit cu) {
        cu.findAll(LambdaExpr.class).forEach(lambda -> {
            if (lambda.getParentNode().isPresent() && 
                lambda.getParentNode().get() instanceof MethodCallExpr) {
                MethodCallExpr methodCall = (MethodCallExpr) lambda.getParentNode().get();
                if (methodCall.getNameAsString().equals("setPublisherFactory")) {
                    ObjectCreationExpr anonymousClass = createAnonymousClass(lambda);
                    methodCall.setArgument(0, anonymousClass);
                }
            }
        });
    }
    
    private static ObjectCreationExpr createAnonymousClass(LambdaExpr lambda) {
        ObjectCreationExpr anonymous = new ObjectCreationExpr();
        
        ClassOrInterfaceType type = new ClassOrInterfaceType();
        type.setName("PartitionPublisherFactory");
        anonymous.setType(type);
        
        NodeList<Parameter> parameters = lambda.getParameters();
        String paramName = parameters.isEmpty() ? "partition" : parameters.get(0).getNameAsString();
        
        MethodDeclaration method = new MethodDeclaration();
        method.setName("newPartitionPublisherBuilder");
        method.setType("SinglePartitionPublisherBuilder");
        
        Parameter param = new Parameter();
        param.setName(paramName);
        param.setType("int");
        method.addParameter(param);
        
        BlockStmt body = new BlockStmt();
        
        MethodCallExpr newBuilderCall = new MethodCallExpr(null, "newBuilder");
        newBuilderCall.setScope(new NameExpr("SinglePartitionPublisherBuilder"));
        
        MethodCallExpr chain = newBuilderCall;
        
        MethodCallExpr setTopic = new MethodCallExpr(chain, "setTopic");
        setTopic.addArgument(new NameExpr("topic"));
        chain = setTopic;
        
        MethodCallExpr setPartition = new MethodCallExpr(chain, "setPartition");
        setPartition.addArgument(new NameExpr(paramName));
        chain = setPartition;
        
        MethodCallExpr ofCall = new MethodCallExpr(null, "of");
        ofCall.addArgument(new NameExpr("FRAMEWORK"));
        
        MethodCallExpr setContext = new MethodCallExpr(chain, "setContext");
        MethodCallExpr pubsubContextCall = new MethodCallExpr(null, "PubsubContext");
        pubsubContextCall.addArgument(ofCall);
        setContext.addArgument(pubsubContextCall);
        chain = setContext;
        
        MethodCallExpr build = new MethodCallExpr(chain, "build");
        
        ReturnStmt returnStmt = new ReturnStmt(build);
        body.addStatement(returnStmt);
        method.setBody(body);
        
        anonymous.setAnonymousClassBody(new NodeList<>(method));
        
        return anonymous;
    }
}
