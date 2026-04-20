# Breaking Changes: org.apache.maven.shared:maven-dependency-tree 2.2 → 3.1.0
Total: 32 (binary-breaking: 29, source-breaking: 32)

## org.apache.maven.shared.dependency.graph.DependencyGraphBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter,java.util.Collection<org.apache.maven.project.MavenProject>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder`
+ MUST NOW IMPLEMENT: `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest,org.apache.maven.artifact.resolver.filter.ArtifactFilter)`

## org.apache.maven.shared.dependency.graph.DependencyNode

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.maven.shared.dependency.graph.DependencyNode`
+ MUST NOW IMPLEMENT: `org.apache.maven.shared.dependency.graph.DependencyNode.getExclusions()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.maven.shared.dependency.graph.DependencyNode`
+ MUST NOW IMPLEMENT: `org.apache.maven.shared.dependency.graph.DependencyNode.getOptional()`

## org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter,java.util.Collection<org.apache.maven.project.MavenProject>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder.isMaven2x()`

## org.apache.maven.shared.dependency.graph.internal.Maven2DependencyGraphBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.graph.internal.Maven2DependencyGraphBuilder`

## org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter,java.util.Collection<org.apache.maven.project.MavenProject>)`

## org.apache.maven.shared.dependency.graph.internal.Maven3DependencyGraphBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.Maven3DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.maven.shared.dependency.graph.internal.Maven3DependencyGraphBuilder.buildDependencyGraph(org.apache.maven.project.MavenProject,org.apache.maven.artifact.resolver.filter.ArtifactFilter,java.util.Collection<org.apache.maven.project.MavenProject>)`

## org.apache.maven.shared.dependency.tree.DefaultDependencyTreeBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DefaultDependencyTreeBuilder`

## org.apache.maven.shared.dependency.tree.DependencyNode

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyNode`

## org.apache.maven.shared.dependency.tree.DependencyTree

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTree`

## org.apache.maven.shared.dependency.tree.DependencyTreeBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTreeBuilder`

## org.apache.maven.shared.dependency.tree.DependencyTreeBuilderException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTreeBuilderException`

## org.apache.maven.shared.dependency.tree.DependencyTreeInverseIterator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTreeInverseIterator`

## org.apache.maven.shared.dependency.tree.DependencyTreePreorderIterator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTreePreorderIterator`

## org.apache.maven.shared.dependency.tree.DependencyTreeResolutionListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.DependencyTreeResolutionListener`

## org.apache.maven.shared.dependency.tree.filter.AncestorOrSelfDependencyNodeFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.filter.AncestorOrSelfDependencyNodeFilter`

## org.apache.maven.shared.dependency.tree.filter.AndDependencyNodeFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.filter.AndDependencyNodeFilter`

## org.apache.maven.shared.dependency.tree.filter.ArtifactDependencyNodeFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.filter.ArtifactDependencyNodeFilter`

## org.apache.maven.shared.dependency.tree.filter.DependencyNodeFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.filter.DependencyNodeFilter`

## org.apache.maven.shared.dependency.tree.filter.StateDependencyNodeFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.filter.StateDependencyNodeFilter`

## org.apache.maven.shared.dependency.tree.traversal.BuildingDependencyNodeVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.BuildingDependencyNodeVisitor`

## org.apache.maven.shared.dependency.tree.traversal.CollectingDependencyNodeVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.CollectingDependencyNodeVisitor`

## org.apache.maven.shared.dependency.tree.traversal.DependencyNodeVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.DependencyNodeVisitor`

## org.apache.maven.shared.dependency.tree.traversal.FilteringDependencyNodeVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.FilteringDependencyNodeVisitor`

## org.apache.maven.shared.dependency.tree.traversal.SerializingDependencyNodeVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.SerializingDependencyNodeVisitor`

## org.apache.maven.shared.dependency.tree.traversal.SerializingDependencyNodeVisitor$TreeTokens

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.maven.shared.dependency.tree.traversal.SerializingDependencyNodeVisitor$TreeTokens`

