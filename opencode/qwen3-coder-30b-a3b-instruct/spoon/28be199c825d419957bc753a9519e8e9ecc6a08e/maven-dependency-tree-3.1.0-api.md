# API Specification: org.apache.maven.shared:maven-dependency-tree 3.1.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `org.apache.maven.shared.dependency.graph.DependencyCollectorBuilder`

**Methods:**
- `public abstract org.apache.maven.shared.dependency.graph.DependencyNode collectDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyCollectorBuilderException`

---

## public class `org.apache.maven.shared.dependency.graph.DependencyCollectorBuilderException`
extends `java.lang.Exception`  

**Constructors:**
- `public DependencyCollectorBuilderException(java.lang.String p0)`
- `public DependencyCollectorBuilderException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder`

**Methods:**
- `public abstract org.apache.maven.shared.dependency.graph.DependencyNode buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`
- `public default org.apache.maven.shared.dependency.graph.DependencyNode buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1, java.util.Collection p2) throws org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`

---

## public class `org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`
extends `java.lang.Exception`  

**Constructors:**
- `public DependencyGraphBuilderException(java.lang.String p0)`
- `public DependencyGraphBuilderException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `org.apache.maven.shared.dependency.graph.DependencyNode`

**Methods:**
- `public abstract boolean accept(org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor p0)`
- `public abstract org.apache.maven.artifact.Artifact getArtifact()`
- `public abstract java.util.List getChildren()`
- `public abstract java.util.List getExclusions()`
- `public abstract java.lang.Boolean getOptional()`
- `public abstract org.apache.maven.shared.dependency.graph.DependencyNode getParent()`
- `public abstract java.lang.String getPremanagedScope()`
- `public abstract java.lang.String getPremanagedVersion()`
- `public abstract java.lang.String getVersionConstraint()`
- `public abstract java.lang.String toNodeString()`

---

## public class `org.apache.maven.shared.dependency.graph.filter.AncestorOrSelfDependencyNodeFilter`
implements `org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter`  

**Constructors:**
- `public AncestorOrSelfDependencyNodeFilter(java.util.List p0)`
- `public AncestorOrSelfDependencyNodeFilter(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

**Methods:**
- `public boolean accept(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public class `org.apache.maven.shared.dependency.graph.filter.AndDependencyNodeFilter`
implements `org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter`  

**Constructors:**
- `public AndDependencyNodeFilter(java.util.List p0)`
- `public AndDependencyNodeFilter(org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter p0, org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter p1)`

**Methods:**
- `public boolean accept(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public java.util.List getDependencyNodeFilters()`

---

## public class `org.apache.maven.shared.dependency.graph.filter.ArtifactDependencyNodeFilter`
implements `org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter`  

**Constructors:**
- `public ArtifactDependencyNodeFilter(org.apache.maven.artifact.resolver.filter.ArtifactFilter p0)`

**Methods:**
- `public boolean accept(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public org.apache.maven.artifact.resolver.filter.ArtifactFilter getArtifactFilter()`

---

## public abstract interface `org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter`

**Methods:**
- `public abstract boolean accept(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public class `org.apache.maven.shared.dependency.graph.internal.ConflictData`

**Constructors:**
- `public ConflictData(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getIgnoredScope()`
- `public java.lang.Boolean getOriginaOptionality()`
- `public java.lang.String getOriginalScope()`
- `public java.lang.String getWinnerVersion()`
- `public void setOriginaOptionality(java.lang.Boolean p0)`
- `public void setOriginalScope(java.lang.String p0)`

---

## public class `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyCollectorBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyCollectorBuilder`, `org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable`  

**Constructors:**
- `public DefaultDependencyCollectorBuilder()`

**Fields:**
- `protected org.codehaus.plexus.PlexusContainer container`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode collectDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyCollectorBuilderException`
- `public void contextualize(org.codehaus.plexus.context.Context p0) throws org.codehaus.plexus.context.ContextException`
- `protected static boolean isMaven31()`

---

## public class `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyGraphBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder`, `org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable`  

**Constructors:**
- `public DefaultDependencyGraphBuilder()`

**Fields:**
- `protected org.codehaus.plexus.PlexusContainer container`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`
- `public void contextualize(org.codehaus.plexus.context.Context p0) throws org.codehaus.plexus.context.ContextException`
- `protected static boolean isMaven31()`

---

## public class `org.apache.maven.shared.dependency.graph.internal.DefaultDependencyNode`
implements `org.apache.maven.shared.dependency.graph.DependencyNode`  

**Constructors:**
- `public DefaultDependencyNode(org.apache.maven.artifact.Artifact p0)`
- `public DefaultDependencyNode(org.apache.maven.shared.dependency.graph.DependencyNode p0, org.apache.maven.artifact.Artifact p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `public DefaultDependencyNode(org.apache.maven.shared.dependency.graph.DependencyNode p0, org.apache.maven.artifact.Artifact p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Boolean p5, java.util.List p6)`

**Methods:**
- `public boolean accept(org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor p0)`
- `public org.apache.maven.artifact.Artifact getArtifact()`
- `public java.util.List getChildren()`
- `public java.util.List getExclusions()`
- `public java.lang.Boolean getOptional()`
- `public org.apache.maven.shared.dependency.graph.DependencyNode getParent()`
- `public java.lang.String getPremanagedScope()`
- `public java.lang.String getPremanagedVersion()`
- `public java.lang.String getVersionConstraint()`
- `public void setChildren(java.util.List p0)`
- `public java.lang.String toNodeString()`

---

## public class `org.apache.maven.shared.dependency.graph.internal.Maven31DependencyCollectorBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyCollectorBuilder`  

**Constructors:**
- `public Maven31DependencyCollectorBuilder()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode collectDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyCollectorBuilderException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.Maven31DependencyGraphBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder`  

**Constructors:**
- `public Maven31DependencyGraphBuilder()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.Maven3DependencyCollectorBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyCollectorBuilder`  

**Constructors:**
- `public Maven3DependencyCollectorBuilder()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode collectDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyCollectorBuilderException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.Maven3DependencyGraphBuilder`
annotations: @org.codehaus.plexus.component.annotations.Component  
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.apache.maven.shared.dependency.graph.DependencyGraphBuilder`  

**Constructors:**
- `public Maven3DependencyGraphBuilder()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.DependencyNode buildDependencyGraph(org.apache.maven.project.ProjectBuildingRequest p0, org.apache.maven.artifact.resolver.filter.ArtifactFilter p1) throws org.apache.maven.shared.dependency.graph.DependencyGraphBuilderException`

---

## public final class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictIdSorter`
implements `org.sonatype.aether.collection.DependencyGraphTransformer`  

**Constructors:**
- `public ConflictIdSorter()`

**Methods:**
- `public org.sonatype.aether.graph.DependencyNode transformGraph(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`

---

## public final class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver`
implements `org.sonatype.aether.collection.DependencyGraphTransformer`  

**Constructors:**
- `public ConflictResolver(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$VersionSelector p0, org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeSelector p1, org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$OptionalitySelector p2, org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeDeriver p3)`

**Fields:**
- `public final static java.lang.String CONFIG_PROP_VERBOSE`
- `public final static java.lang.String NODE_DATA_ORIGINAL_OPTIONALITY`
- `public final static java.lang.String NODE_DATA_ORIGINAL_SCOPE`
- `public final static java.lang.String NODE_DATA_WINNER`

**Methods:**
- `public org.sonatype.aether.graph.DependencyNode transformGraph(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`

---

## public final static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext`

**Constructors:**
- `public ConflictContext(org.sonatype.aether.graph.DependencyNode p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3)`

**Methods:**
- `public java.util.Collection getItems()`
- `public java.lang.Boolean getOptional()`
- `public org.sonatype.aether.graph.DependencyNode getRoot()`
- `public java.lang.String getScope()`
- `public org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictItem getWinner()`
- `public boolean isIncluded(org.sonatype.aether.graph.DependencyNode p0)`
- `public void setOptional(java.lang.Boolean p0)`
- `public void setScope(java.lang.String p0)`
- `public void setWinner(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictItem p0)`
- `public java.lang.String toString()`

---

## public final static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictItem`

**Constructors:**
- `public ConflictItem(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.graph.DependencyNode p1, int p2, int p3, java.lang.String... p4)`

**Fields:**
- `public final static int OPTIONAL_FALSE`
- `public final static int OPTIONAL_TRUE`

**Methods:**
- `public org.sonatype.aether.graph.Dependency getDependency()`
- `public int getDepth()`
- `public org.sonatype.aether.graph.DependencyNode getNode()`
- `public int getOptionalities()`
- `public java.util.Collection getScopes()`
- `public boolean isSibling(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictItem p0)`
- `public java.lang.String toString()`

---

## public abstract static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$OptionalitySelector`

**Constructors:**
- `public OptionalitySelector()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$OptionalitySelector getInstance(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`
- `public abstract void selectOptionality(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public final static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeContext`

**Constructors:**
- `public ScopeContext(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getChildScope()`
- `public java.lang.String getDerivedScope()`
- `public java.lang.String getParentScope()`
- `public void setDerivedScope(java.lang.String p0)`

---

## public abstract static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeDeriver`

**Constructors:**
- `public ScopeDeriver()`

**Methods:**
- `public abstract void deriveScope(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeContext p0) throws org.sonatype.aether.RepositoryException`
- `public org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeDeriver getInstance(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`

---

## public abstract static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeSelector`

**Constructors:**
- `public ScopeSelector()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeSelector getInstance(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`
- `public abstract void selectScope(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public abstract static class `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$VersionSelector`

**Constructors:**
- `public VersionSelector()`

**Methods:**
- `public org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$VersionSelector getInstance(org.sonatype.aether.graph.DependencyNode p0, org.sonatype.aether.collection.DependencyGraphTransformationContext p1) throws org.sonatype.aether.RepositoryException`
- `public abstract void selectVersion(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven30.ExclusionDependencySelector`
implements `org.sonatype.aether.collection.DependencySelector`  

**Constructors:**
- `public ExclusionDependencySelector()`
- `public ExclusionDependencySelector(java.util.Collection p0)`

**Methods:**
- `public org.sonatype.aether.collection.DependencySelector deriveChildSelector(org.sonatype.aether.collection.DependencyCollectionContext p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean selectDependency(org.sonatype.aether.graph.Dependency p0)`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven30.JavaScopeDeriver`
extends `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeDeriver`  

**Constructors:**
- `public JavaScopeDeriver()`

**Methods:**
- `public void deriveScope(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeContext p0) throws org.sonatype.aether.RepositoryException`

---

## public final class `org.apache.maven.shared.dependency.graph.internal.maven30.JavaScopeSelector`
extends `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeSelector`  

**Constructors:**
- `public JavaScopeSelector()`

**Methods:**
- `public void selectScope(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven30.Maven3DirectScopeDependencySelector`
implements `org.sonatype.aether.collection.DependencySelector`  

**Constructors:**
- `public Maven3DirectScopeDependencySelector(java.lang.String p0)`

**Methods:**
- `public org.sonatype.aether.collection.DependencySelector deriveChildSelector(org.sonatype.aether.collection.DependencyCollectionContext p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean selectDependency(org.sonatype.aether.graph.Dependency p0)`

---

## public final class `org.apache.maven.shared.dependency.graph.internal.maven30.NearestVersionSelector`
extends `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$VersionSelector`  

**Constructors:**
- `public NearestVersionSelector()`

**Methods:**
- `public void selectVersion(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven30.SimpleOptionalitySelector`
extends `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$OptionalitySelector`  

**Constructors:**
- `public SimpleOptionalitySelector()`

**Methods:**
- `public void selectOptionality(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven30.VerboseJavaScopeSelector`
extends `org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ScopeSelector`  

**Constructors:**
- `public VerboseJavaScopeSelector()`

**Fields:**
- `public final static java.lang.String REDUCED_SCOPE`

**Methods:**
- `public void selectScope(org.apache.maven.shared.dependency.graph.internal.maven30.ConflictResolver$ConflictContext p0) throws org.sonatype.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven31.Maven31DirectScopeDependencySelector`
implements `org.eclipse.aether.collection.DependencySelector`  

**Constructors:**
- `public Maven31DirectScopeDependencySelector(java.lang.String p0)`

**Methods:**
- `public org.eclipse.aether.collection.DependencySelector deriveChildSelector(org.eclipse.aether.collection.DependencyCollectionContext p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean selectDependency(org.eclipse.aether.graph.Dependency p0)`

---

## public class `org.apache.maven.shared.dependency.graph.internal.maven31.VerboseJavaScopeSelector`
extends `org.eclipse.aether.util.graph.transformer.ConflictResolver$ScopeSelector`  

**Constructors:**
- `public VerboseJavaScopeSelector()`

**Fields:**
- `public final static java.lang.String REDUCED_SCOPE`

**Methods:**
- `public void selectScope(org.eclipse.aether.util.graph.transformer.ConflictResolver$ConflictContext p0) throws org.eclipse.aether.RepositoryException`

---

## public class `org.apache.maven.shared.dependency.graph.traversal.BuildingDependencyNodeVisitor`
implements `org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor`  

**Constructors:**
- `public BuildingDependencyNodeVisitor()`
- `public BuildingDependencyNodeVisitor(org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor p0)`

**Methods:**
- `public boolean endVisit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor getDependencyNodeVisitor()`
- `public org.apache.maven.shared.dependency.graph.DependencyNode getDependencyTree()`
- `public boolean visit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public class `org.apache.maven.shared.dependency.graph.traversal.CollectingDependencyNodeVisitor`
implements `org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor`  

**Constructors:**
- `public CollectingDependencyNodeVisitor()`

**Methods:**
- `public boolean endVisit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public java.util.List getNodes()`
- `public boolean visit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public abstract interface `org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor`

**Methods:**
- `public abstract boolean endVisit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public abstract boolean visit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public class `org.apache.maven.shared.dependency.graph.traversal.FilteringDependencyNodeVisitor`
implements `org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor`  

**Constructors:**
- `public FilteringDependencyNodeVisitor(org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor p0, org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter p1)`

**Methods:**
- `public boolean endVisit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public org.apache.maven.shared.dependency.graph.filter.DependencyNodeFilter getDependencyNodeFilter()`
- `public org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor getDependencyNodeVisitor()`
- `public boolean visit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public class `org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor`
implements `org.apache.maven.shared.dependency.graph.traversal.DependencyNodeVisitor`  

**Constructors:**
- `public SerializingDependencyNodeVisitor(java.io.Writer p0)`
- `public SerializingDependencyNodeVisitor(java.io.Writer p0, org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor$GraphTokens p1)`

**Fields:**
- `public final static org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor$GraphTokens EXTENDED_TOKENS`
- `public final static org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor$GraphTokens STANDARD_TOKENS`
- `public final static org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor$GraphTokens WHITESPACE_TOKENS`

**Methods:**
- `public boolean endVisit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`
- `public boolean visit(org.apache.maven.shared.dependency.graph.DependencyNode p0)`

---

## public static class `org.apache.maven.shared.dependency.graph.traversal.SerializingDependencyNodeVisitor$GraphTokens`

**Constructors:**
- `public GraphTokens(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

**Methods:**
- `public java.lang.String getFillIndent(boolean p0)`
- `public java.lang.String getNodeIndent(boolean p0)`

---

