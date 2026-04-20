# API Specification: org.kohsuke:github-api 1.313

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `org.kohsuke.github.AbuseLimitHandler`
annotations: @java.lang.Deprecated  
extends `org.kohsuke.github.GitHubAbuseLimitHandler`  

**Constructors:**
- `public AbuseLimitHandler()`

**Fields:**
- `public final static org.kohsuke.github.AbuseLimitHandler FAIL`
- `public final static org.kohsuke.github.AbuseLimitHandler WAIT`

**Methods:**
- `public abstract void onError(java.io.IOException p0, java.net.HttpURLConnection p1) throws java.io.IOException`
- `public void onError(org.kohsuke.github.connector.GitHubConnectorResponse p0) throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.BetaApi`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public final enum `org.kohsuke.github.EnforcementLevel`
annotations: @java.lang.Deprecated  
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.EnforcementLevel EVERYONE`
- `public final static org.kohsuke.github.EnforcementLevel NON_ADMINS`
- `public final static org.kohsuke.github.EnforcementLevel OFF`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHApp`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHApp()`

**Methods:**
- `public java.lang.String getDescription()`
- `public java.util.List getEvents()`
- `public java.lang.String getExternalUrl()`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHAppInstallation getInstallationById(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHAppInstallation getInstallationByOrganization(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHAppInstallation getInstallationByRepository(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHAppInstallation getInstallationByUser(java.lang.String p0) throws java.io.IOException`
- `public long getInstallationsCount()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHUser getOwner()`
- `public java.util.Map getPermissions()`
- `public java.lang.String getSlug()`
- `public org.kohsuke.github.PagedIterable listInstallations()`
- `public void setDescription(java.lang.String p0)`
- `public void setEvents(java.util.List p0)`
- `public void setExternalUrl(java.lang.String p0)`
- `public void setInstallationsCount(long p0)`
- `public void setName(java.lang.String p0)`
- `public void setOwner(org.kohsuke.github.GHUser p0)`
- `public void setPermissions(java.util.Map p0)`

---

## public class `org.kohsuke.github.GHAppCreateTokenBuilder`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Fields:**
- `protected final org.kohsuke.github.Requester builder`

**Methods:**
- `public org.kohsuke.github.GHAppInstallationToken create() throws java.io.IOException`
- `public org.kohsuke.github.GHAppCreateTokenBuilder permissions(java.util.Map p0)`
- `public org.kohsuke.github.GHAppCreateTokenBuilder repositories(java.util.List p0)`
- `public org.kohsuke.github.GHAppCreateTokenBuilder repositoryIds(java.util.List p0)`

---

## public class `org.kohsuke.github.GHAppInstallation`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHAppInstallation()`

**Methods:**
- `public org.kohsuke.github.GHAppCreateTokenBuilder createToken()`
- `public org.kohsuke.github.GHAppCreateTokenBuilder createToken(java.util.Map p0)`
- `public void deleteInstallation() throws java.io.IOException`
- `public java.lang.String getAccessTokenUrl()`
- `public org.kohsuke.github.GHUser getAccount()`
- `public long getAppId()`
- `public java.util.List getEvents()`
- `public java.net.URL getHtmlUrl()`
- `public java.util.Map getPermissions()`
- `public java.lang.String getRepositoriesUrl()`
- `public org.kohsuke.github.GHRepositorySelection getRepositorySelection()`
- `public java.lang.String getSingleFileName()`
- `public long getTargetId()`
- `public org.kohsuke.github.GHTargetType getTargetType()`
- `public org.kohsuke.github.PagedSearchIterable listRepositories()`
- `public void setAccessTokenUrl(java.lang.String p0)`
- `public void setAccount(org.kohsuke.github.GHUser p0)`
- `public void setAppId(long p0)`
- `public void setEvents(java.util.List p0)`
- `public void setPermissions(java.util.Map p0)`
- `public void setRepositoriesUrl(java.lang.String p0)`
- `public void setRepositorySelection(org.kohsuke.github.GHRepositorySelection p0)`
- `public void setRoot(org.kohsuke.github.GitHub p0)`
- `public void setSingleFileName(java.lang.String p0)`
- `public void setTargetId(long p0)`
- `public void setTargetType(org.kohsuke.github.GHTargetType p0)`

---

## public class `org.kohsuke.github.GHAppInstallationToken`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHAppInstallationToken()`

**Fields:**
- `protected java.lang.String expires_at`

**Methods:**
- `public java.util.Date getExpiresAt() throws java.io.IOException`
- `public java.util.Map getPermissions()`
- `public java.util.List getRepositories()`
- `public org.kohsuke.github.GHRepositorySelection getRepositorySelection()`
- `public java.lang.String getToken()`
- `public void setPermissions(java.util.Map p0)`
- `public void setRepositories(java.util.List p0)`
- `public void setRepositorySelection(org.kohsuke.github.GHRepositorySelection p0)`
- `public void setRoot(org.kohsuke.github.GitHub p0)`
- `public void setToken(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHArtifact`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHArtifact()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public <T extends java.lang.Object> T download(org.kohsuke.github.function.InputStreamFunction p0) throws java.io.IOException`
- `public java.net.URL getArchiveDownloadUrl()`
- `public java.util.Date getExpiresAt()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public long getSizeInBytes()`
- `public boolean isExpired()`

---

## public class `org.kohsuke.github.GHAsset`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHAsset()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public java.lang.String getBrowserDownloadUrl()`
- `public java.lang.String getContentType()`
- `public long getDownloadCount()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getLabel()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public long getSize()`
- `public java.lang.String getState()`
- `public void setContentType(java.lang.String p0) throws java.io.IOException`
- `public void setLabel(java.lang.String p0) throws java.io.IOException`
- `public static org.kohsuke.github.GHAsset[] wrap(org.kohsuke.github.GHAsset[] p0, org.kohsuke.github.GHRelease p1)`

---

## public class `org.kohsuke.github.GHAuthenticatedAppInstallation`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `protected GHAuthenticatedAppInstallation(org.kohsuke.github.GitHub p0)`

**Methods:**
- `public org.kohsuke.github.PagedSearchIterable listRepositories()`

---

## public class `org.kohsuke.github.GHAuthorization`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHAuthorization()`

**Fields:**
- `public final static java.lang.String ADMIN_KEY`
- `public final static java.lang.String ADMIN_ORG`
- `public final static java.lang.String AMIN_HOOK`
- `public final static java.lang.String DELETE_REPO`
- `public final static java.lang.String GIST`
- `public final static java.lang.String NOTIFICATIONS`
- `public final static java.lang.String PUBLIC_REPO`
- `public final static java.lang.String READ_HOOK`
- `public final static java.lang.String READ_KEY`
- `public final static java.lang.String READ_ORG`
- `public final static java.lang.String REPO`
- `public final static java.lang.String REPO_STATUS`
- `public final static java.lang.String USER`
- `public final static java.lang.String USER_EMAIL`
- `public final static java.lang.String USER_FOLLOW`
- `public final static java.lang.String WRITE_HOOK`
- `public final static java.lang.String WRITE_KEY`
- `public final static java.lang.String WRITE_ORG`

**Methods:**
- `public java.net.URL getApiURL()`
- `public java.lang.String getAppName()`
- `public java.net.URL getAppUrl()`
- `public java.lang.String getFingerprint()`
- `public java.lang.String getHashedToken()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getNote()`
- `public java.net.URL getNoteUrl()`
- `public java.util.List getScopes()`
- `public java.lang.String getToken()`
- `public java.lang.String getTokenLastEight()`

---

## public class `org.kohsuke.github.GHBlob`

**Constructors:**
- `public GHBlob()`

**Methods:**
- `public java.lang.String getContent()`
- `public java.lang.String getEncoding()`
- `public java.lang.String getSha()`
- `public long getSize()`
- `public java.net.URL getUrl()`
- `public java.io.InputStream read()`

---

## public class `org.kohsuke.github.GHBlobBuilder`

**Methods:**
- `public org.kohsuke.github.GHBlobBuilder binaryContent(byte[] p0)`
- `public org.kohsuke.github.GHBlob create() throws java.io.IOException`
- `public org.kohsuke.github.GHBlobBuilder textContent(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHBranch`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Methods:**
- `public void disableProtection() throws java.io.IOException`
- `public org.kohsuke.github.GHBranchProtectionBuilder enableProtection()`
- `public void enableProtection(org.kohsuke.github.EnforcementLevel p0, java.util.Collection p1) throws java.io.IOException`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public org.kohsuke.github.GHBranchProtection getProtection() throws java.io.IOException`
- `public java.net.URL getProtectionUrl()`
- `public java.lang.String getSHA1()`
- `public boolean isProtected()`
- `public org.kohsuke.github.GHCommit merge(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHCommit merge(org.kohsuke.github.GHBranch p0, java.lang.String p1) throws java.io.IOException`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHBranch$Commit`

**Constructors:**
- `public Commit()`

---

## public class `org.kohsuke.github.GHBranchProtection`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHBranchProtection()`

**Methods:**
- `public void disableSignedCommits() throws java.io.IOException`
- `public void enabledSignedCommits() throws java.io.IOException`
- `public org.kohsuke.github.GHBranchProtection$EnforceAdmins getEnforceAdmins()`
- `public org.kohsuke.github.GHBranchProtection$RequiredReviews getRequiredReviews()`
- `public boolean getRequiredSignatures() throws java.io.IOException`
- `public org.kohsuke.github.GHBranchProtection$RequiredStatusChecks getRequiredStatusChecks()`
- `public org.kohsuke.github.GHBranchProtection$Restrictions getRestrictions()`
- `public java.lang.String getUrl()`

---

## public static class `org.kohsuke.github.GHBranchProtection$EnforceAdmins`

**Constructors:**
- `public EnforceAdmins()`

**Methods:**
- `public java.lang.String getUrl()`
- `public boolean isEnabled()`

---

## public static class `org.kohsuke.github.GHBranchProtection$RequiredReviews`

**Constructors:**
- `public RequiredReviews()`

**Methods:**
- `public org.kohsuke.github.GHBranchProtection$Restrictions getDismissalRestrictions()`
- `public int getRequiredReviewers()`
- `public java.lang.String getUrl()`
- `public boolean isDismissStaleReviews()`
- `public boolean isRequireCodeOwnerReviews()`

---

## public static class `org.kohsuke.github.GHBranchProtection$RequiredStatusChecks`

**Constructors:**
- `public RequiredStatusChecks()`

**Methods:**
- `public java.util.Collection getContexts()`
- `public java.lang.String getUrl()`
- `public boolean isRequiresBranchUpToDate()`

---

## public static class `org.kohsuke.github.GHBranchProtection$Restrictions`

**Constructors:**
- `public Restrictions()`

**Methods:**
- `public java.util.Collection getTeams()`
- `public java.lang.String getTeamsUrl()`
- `public java.lang.String getUrl()`
- `public java.util.Collection getUsers()`
- `public java.lang.String getUsersUrl()`

---

## public class `org.kohsuke.github.GHBranchProtectionBuilder`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Methods:**
- `public org.kohsuke.github.GHBranchProtectionBuilder addRequiredChecks(java.lang.String... p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder addRequiredChecks(java.util.Collection p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder dismissStaleReviews()`
- `public org.kohsuke.github.GHBranchProtectionBuilder dismissStaleReviews(boolean p0)`
- `public org.kohsuke.github.GHBranchProtection enable() throws java.io.IOException`
- `public org.kohsuke.github.GHBranchProtectionBuilder includeAdmins()`
- `public org.kohsuke.github.GHBranchProtectionBuilder includeAdmins(boolean p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder requireBranchIsUpToDate()`
- `public org.kohsuke.github.GHBranchProtectionBuilder requireBranchIsUpToDate(boolean p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder requireCodeOwnReviews()`
- `public org.kohsuke.github.GHBranchProtectionBuilder requireCodeOwnReviews(boolean p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder requireReviews()`
- `public org.kohsuke.github.GHBranchProtectionBuilder requiredReviewers(int p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder restrictPushAccess()`
- `public org.kohsuke.github.GHBranchProtectionBuilder restrictReviewDismissals()`
- `public org.kohsuke.github.GHBranchProtectionBuilder teamPushAccess(java.util.Collection p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder teamPushAccess(org.kohsuke.github.GHTeam... p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder teamReviewDismissals(java.util.Collection p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder teamReviewDismissals(org.kohsuke.github.GHTeam... p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder userPushAccess(java.util.Collection p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder userPushAccess(org.kohsuke.github.GHUser... p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder userReviewDismissals(java.util.Collection p0)`
- `public org.kohsuke.github.GHBranchProtectionBuilder userReviewDismissals(org.kohsuke.github.GHUser... p0)`

---

## public class `org.kohsuke.github.GHCheckRun`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded, @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHCheckRun()`

**Methods:**
- `public org.kohsuke.github.GHApp getApp()`
- `public org.kohsuke.github.GHCheckSuite getCheckSuite()`
- `public java.util.Date getCompletedAt()`
- `public org.kohsuke.github.GHCheckRun$Conclusion getConclusion()`
- `public java.net.URL getDetailsUrl()`
- `public java.lang.String getExternalId()`
- `public java.lang.String getHeadSha()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getName()`
- `public java.lang.String getNodeId()`
- `public org.kohsuke.github.GHCheckRun$Output getOutput()`
- `public java.util.List getPullRequests() throws java.io.IOException`
- `public java.util.Date getStartedAt()`
- `public org.kohsuke.github.GHCheckRun$Status getStatus()`
- `public org.kohsuke.github.GHCheckRunBuilder update()`

---

## public final static enum `org.kohsuke.github.GHCheckRun$AnnotationLevel`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCheckRun$AnnotationLevel FAILURE`
- `public final static org.kohsuke.github.GHCheckRun$AnnotationLevel NOTICE`
- `public final static org.kohsuke.github.GHCheckRun$AnnotationLevel WARNING`

---

## public final static enum `org.kohsuke.github.GHCheckRun$Conclusion`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCheckRun$Conclusion ACTION_REQUIRED`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion CANCELLED`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion FAILURE`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion NEUTRAL`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion SKIPPED`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion STALE`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion SUCCESS`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion TIMED_OUT`
- `public final static org.kohsuke.github.GHCheckRun$Conclusion UNKNOWN`

**Methods:**
- `public static org.kohsuke.github.GHCheckRun$Conclusion from(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHCheckRun$Output`

**Constructors:**
- `public Output()`

**Methods:**
- `public int getAnnotationsCount()`
- `public java.net.URL getAnnotationsUrl()`
- `public java.lang.String getSummary()`
- `public java.lang.String getText()`
- `public java.lang.String getTitle()`

---

## public final static enum `org.kohsuke.github.GHCheckRun$Status`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCheckRun$Status COMPLETED`
- `public final static org.kohsuke.github.GHCheckRun$Status IN_PROGRESS`
- `public final static org.kohsuke.github.GHCheckRun$Status QUEUED`
- `public final static org.kohsuke.github.GHCheckRun$Status UNKNOWN`

**Methods:**
- `public static org.kohsuke.github.GHCheckRun$Status from(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public final class `org.kohsuke.github.GHCheckRunBuilder`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings, @org.kohsuke.github.Preview  

**Methods:**
- `public org.kohsuke.github.GHCheckRunBuilder add(org.kohsuke.github.GHCheckRunBuilder$Action p0)`
- `public org.kohsuke.github.GHCheckRunBuilder add(org.kohsuke.github.GHCheckRunBuilder$Output p0)`
- `public org.kohsuke.github.GHCheckRun create() throws java.io.IOException`
- `public org.kohsuke.github.GHCheckRunBuilder withCompletedAt(java.util.Date p0)`
- `public org.kohsuke.github.GHCheckRunBuilder withConclusion(org.kohsuke.github.GHCheckRun$Conclusion p0)`
- `public org.kohsuke.github.GHCheckRunBuilder withDetailsURL(java.lang.String p0)`
- `public org.kohsuke.github.GHCheckRunBuilder withExternalID(java.lang.String p0)`
- `public org.kohsuke.github.GHCheckRunBuilder withStartedAt(java.util.Date p0)`
- `public org.kohsuke.github.GHCheckRunBuilder withStatus(org.kohsuke.github.GHCheckRun$Status p0)`

---

## public final static class `org.kohsuke.github.GHCheckRunBuilder$Action`
annotations: @com.fasterxml.jackson.annotation.JsonInclude  

**Constructors:**
- `public Action(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

---

## public final static class `org.kohsuke.github.GHCheckRunBuilder$Annotation`
annotations: @com.fasterxml.jackson.annotation.JsonInclude  

**Constructors:**
- `public Annotation(java.lang.String p0, int p1, int p2, org.kohsuke.github.GHCheckRun$AnnotationLevel p3, java.lang.String p4)`
- `public Annotation(java.lang.String p0, int p1, org.kohsuke.github.GHCheckRun$AnnotationLevel p2, java.lang.String p3)`

**Methods:**
- `public org.kohsuke.github.GHCheckRunBuilder$Annotation withEndColumn(java.lang.Integer p0)`
- `public org.kohsuke.github.GHCheckRunBuilder$Annotation withRawDetails(java.lang.String p0)`
- `public org.kohsuke.github.GHCheckRunBuilder$Annotation withStartColumn(java.lang.Integer p0)`
- `public org.kohsuke.github.GHCheckRunBuilder$Annotation withTitle(java.lang.String p0)`

---

## public final static class `org.kohsuke.github.GHCheckRunBuilder$Image`
annotations: @com.fasterxml.jackson.annotation.JsonInclude  

**Constructors:**
- `public Image(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public org.kohsuke.github.GHCheckRunBuilder$Image withCaption(java.lang.String p0)`

---

## public final static class `org.kohsuke.github.GHCheckRunBuilder$Output`
annotations: @com.fasterxml.jackson.annotation.JsonInclude  

**Constructors:**
- `public Output(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public org.kohsuke.github.GHCheckRunBuilder$Output add(org.kohsuke.github.GHCheckRunBuilder$Annotation p0)`
- `public org.kohsuke.github.GHCheckRunBuilder$Output add(org.kohsuke.github.GHCheckRunBuilder$Image p0)`
- `public org.kohsuke.github.GHCheckRunBuilder$Output withText(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHCheckSuite`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHCheckSuite()`

**Methods:**
- `public java.lang.String getAfter()`
- `public org.kohsuke.github.GHApp getApp()`
- `public java.lang.String getBefore()`
- `public java.net.URL getCheckRunsUrl()`
- `public java.lang.String getConclusion()`
- `public java.lang.String getHeadBranch()`
- `public org.kohsuke.github.GHCheckSuite$HeadCommit getHeadCommit()`
- `public java.lang.String getHeadSha()`
- `public java.net.URL getHtmlUrl()`
- `public int getLatestCheckRunsCount()`
- `public java.lang.String getNodeId()`
- `public java.util.List getPullRequests() throws java.io.IOException`
- `public java.lang.String getStatus()`

---

## public static class `org.kohsuke.github.GHCheckSuite$HeadCommit`

**Constructors:**
- `public HeadCommit()`

**Methods:**
- `public org.kohsuke.github.GitUser getAuthor()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getId()`
- `public java.lang.String getMessage()`
- `public java.util.Date getTimestamp()`
- `public java.lang.String getTreeId()`

---

## public final enum `org.kohsuke.github.GHCommentAuthorAssociation`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCommentAuthorAssociation COLLABORATOR`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation CONTRIBUTOR`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation FIRST_TIMER`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation FIRST_TIME_CONTRIBUTOR`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation MEMBER`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation NONE`
- `public final static org.kohsuke.github.GHCommentAuthorAssociation OWNER`

---

## public class `org.kohsuke.github.GHCommit`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHCommit()`

**Methods:**
- `public org.kohsuke.github.GHCommitComment createComment(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCommitComment createComment(java.lang.String p0, java.lang.String p1, java.lang.Integer p2, java.lang.Integer p3) throws java.io.IOException`
- `public org.kohsuke.github.GHUser getAuthor() throws java.io.IOException`
- `public java.util.Date getAuthoredDate() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getCheckRuns() throws java.io.IOException`
- `public java.util.Date getCommitDate() throws java.io.IOException`
- `public org.kohsuke.github.GHCommit$ShortInfo getCommitShortInfo() throws java.io.IOException`
- `public org.kohsuke.github.GHUser getCommitter() throws java.io.IOException`
- `public java.util.List getFiles() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHCommitStatus getLastStatus() throws java.io.IOException`
- `public int getLinesAdded() throws java.io.IOException`
- `public int getLinesChanged() throws java.io.IOException`
- `public int getLinesDeleted() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.util.List getParentSHA1s()`
- `public java.util.List getParents() throws java.io.IOException`
- `public java.lang.String getSHA1()`
- `public org.kohsuke.github.GHTree getTree() throws java.io.IOException`
- `public java.net.URL getUrl()`
- `public org.kohsuke.github.PagedIterable listBranchesWhereHead() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listComments()`
- `public org.kohsuke.github.PagedIterable listPullRequests()`
- `public org.kohsuke.github.PagedIterable listStatuses() throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHCommit$File`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public File()`

**Methods:**
- `public java.net.URL getBlobUrl()`
- `public java.lang.String getFileName()`
- `public int getLinesAdded()`
- `public int getLinesChanged()`
- `public int getLinesDeleted()`
- `public java.lang.String getPatch()`
- `public java.lang.String getPreviousFilename()`
- `public java.net.URL getRawUrl()`
- `public java.lang.String getSha()`
- `public java.lang.String getStatus()`

---

## public static class `org.kohsuke.github.GHCommit$GHAuthor`
annotations: @java.lang.Deprecated  
extends `org.kohsuke.github.GitUser`  

**Constructors:**
- `public GHAuthor()`
- `public GHAuthor(org.kohsuke.github.GitUser p0)`

---

## public static class `org.kohsuke.github.GHCommit$Parent`

**Constructors:**
- `public Parent()`

---

## public static class `org.kohsuke.github.GHCommit$ShortInfo`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitCommit`  

**Constructors:**
- `public ShortInfo()`

**Methods:**
- `public int getCommentCount() throws org.kohsuke.github.GHException`
- `public java.util.List getParentSHA1s()`

---

## public static class `org.kohsuke.github.GHCommit$Stats`

**Constructors:**
- `public Stats()`

---

## public class `org.kohsuke.github.GHCommitBuilder`

**Methods:**
- `public org.kohsuke.github.GHCommitBuilder author(java.lang.String p0, java.lang.String p1, java.util.Date p2)`
- `public org.kohsuke.github.GHCommitBuilder committer(java.lang.String p0, java.lang.String p1, java.util.Date p2)`
- `public org.kohsuke.github.GHCommit create() throws java.io.IOException`
- `public org.kohsuke.github.GHCommitBuilder message(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitBuilder parent(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitBuilder tree(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitBuilder withSignature(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHCommitComment`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  
implements `org.kohsuke.github.Reactable`  

**Constructors:**
- `public GHCommitComment()`

**Methods:**
- `public org.kohsuke.github.GHReaction createReaction(org.kohsuke.github.ReactionContent p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public void deleteReaction(org.kohsuke.github.GHReaction p0) throws java.io.IOException`
- `public java.lang.String getBody()`
- `public org.kohsuke.github.GHCommit getCommit() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public int getLine()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.lang.String getPath()`
- `public java.lang.String getSHA1()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReactions()`
- `public void update(java.lang.String p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHCommitPointer`

**Constructors:**
- `public GHCommitPointer()`

**Methods:**
- `public org.kohsuke.github.GHCommit getCommit() throws java.io.IOException`
- `public java.lang.String getLabel()`
- `public java.lang.String getRef()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public java.lang.String getSha()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHCommitQueryBuilder`

**Methods:**
- `public org.kohsuke.github.GHCommitQueryBuilder author(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder from(java.lang.String p0)`
- `public org.kohsuke.github.PagedIterable list()`
- `public org.kohsuke.github.GHCommitQueryBuilder pageSize(int p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder path(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder since(java.util.Date p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder since(long p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder until(java.util.Date p0)`
- `public org.kohsuke.github.GHCommitQueryBuilder until(long p0)`

---

## public class `org.kohsuke.github.GHCommitSearchBuilder`
annotations: @org.kohsuke.github.Preview  
extends `org.kohsuke.github.GHSearchBuilder`  

**Methods:**
- `public org.kohsuke.github.GHCommitSearchBuilder author(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder authorDate(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder authorEmail(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder authorName(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder committer(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder committerDate(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder committerEmail(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder committerName(java.lang.String p0)`
- `protected java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHCommitSearchBuilder hash(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder is(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder merge(boolean p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder order(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder org(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder parent(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder q(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder repo(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder sort(org.kohsuke.github.GHCommitSearchBuilder$Sort p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder tree(java.lang.String p0)`
- `public org.kohsuke.github.GHCommitSearchBuilder user(java.lang.String p0)`

---

## public final static enum `org.kohsuke.github.GHCommitSearchBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCommitSearchBuilder$Sort AUTHOR_DATE`
- `public final static org.kohsuke.github.GHCommitSearchBuilder$Sort COMMITTER_DATE`

---

## public final enum `org.kohsuke.github.GHCommitState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCommitState ERROR`
- `public final static org.kohsuke.github.GHCommitState FAILURE`
- `public final static org.kohsuke.github.GHCommitState PENDING`
- `public final static org.kohsuke.github.GHCommitState SUCCESS`

---

## public class `org.kohsuke.github.GHCommitStatus`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHCommitStatus()`

**Methods:**
- `public java.lang.String getContext()`
- `public org.kohsuke.github.GHUser getCreator() throws java.io.IOException`
- `public java.lang.String getDescription()`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHCommitState getState()`
- `public java.lang.String getTargetUrl()`

---

## public class `org.kohsuke.github.GHCompare`

**Constructors:**
- `public GHCompare()`

**Methods:**
- `public int getAheadBy()`
- `public org.kohsuke.github.GHCompare$Commit getBaseCommit()`
- `public int getBehindBy()`
- `public org.kohsuke.github.GHCompare$Commit[] getCommits()`
- `public java.net.URL getDiffUrl()`
- `public org.kohsuke.github.GHCommit$File[] getFiles()`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHCompare$Commit getMergeBaseCommit()`
- `public java.net.URL getPatchUrl()`
- `public java.net.URL getPermalinkUrl()`
- `public org.kohsuke.github.GHCompare$Status getStatus()`
- `public int getTotalCommits()`
- `public java.net.URL getUrl()`
- `public org.kohsuke.github.PagedIterable listCommits()`
- `public org.kohsuke.github.GHCompare wrap(org.kohsuke.github.GHRepository p0)`

---

## public static class `org.kohsuke.github.GHCompare$Commit`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHCommit`  

**Constructors:**
- `public Commit()`

**Methods:**
- `public org.kohsuke.github.GHCompare$InnerCommit getCommit()`

---

## public static class `org.kohsuke.github.GHCompare$InnerCommit`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  

**Constructors:**
- `public InnerCommit()`

**Methods:**
- `public org.kohsuke.github.GitUser getAuthor()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getMessage()`
- `public java.lang.String getSha()`
- `public org.kohsuke.github.GHCompare$Tree getTree()`
- `public java.lang.String getUrl()`

---

## public final static enum `org.kohsuke.github.GHCompare$Status`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHCompare$Status ahead`
- `public final static org.kohsuke.github.GHCompare$Status behind`
- `public final static org.kohsuke.github.GHCompare$Status diverged`
- `public final static org.kohsuke.github.GHCompare$Status identical`

---

## public static class `org.kohsuke.github.GHCompare$Tree`

**Constructors:**
- `public Tree()`

**Methods:**
- `public java.lang.String getSha()`
- `public java.lang.String getUrl()`

---

## public static class `org.kohsuke.github.GHCompare$User`
extends `org.kohsuke.github.GitUser`  

**Constructors:**
- `public User()`

---

## public class `org.kohsuke.github.GHContent`
extends `org.kohsuke.github.GitHubInteractiveObject`  
implements `org.kohsuke.github.Refreshable`  

**Constructors:**
- `public GHContent()`

**Methods:**
- `public org.kohsuke.github.GHContentUpdateResponse delete(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse delete(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public java.lang.String getContent() throws java.io.IOException`
- `public java.lang.String getDownloadUrl() throws java.io.IOException`
- `public java.lang.String getEncodedContent() throws java.io.IOException`
- `public java.lang.String getEncoding()`
- `public java.lang.String getGitUrl()`
- `public java.lang.String getHtmlUrl()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.lang.String getPath()`
- `public java.lang.String getSha()`
- `public long getSize()`
- `public java.lang.String getTarget()`
- `public java.lang.String getType()`
- `public java.lang.String getUrl()`
- `public boolean isDirectory()`
- `public boolean isFile()`
- `public org.kohsuke.github.PagedIterable listDirectoryContent() throws java.io.IOException`
- `protected synchronized void populate() throws java.io.IOException`
- `public java.io.InputStream read() throws java.io.IOException`
- `public synchronized void refresh() throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse update(byte[] p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse update(byte[] p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse update(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse update(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`

---

## public final class `org.kohsuke.github.GHContentBuilder`

**Methods:**
- `public org.kohsuke.github.GHContentBuilder branch(java.lang.String p0)`
- `public org.kohsuke.github.GHContentUpdateResponse commit() throws java.io.IOException`
- `public org.kohsuke.github.GHContentBuilder content(byte[] p0)`
- `public org.kohsuke.github.GHContentBuilder content(java.lang.String p0)`
- `public org.kohsuke.github.GHContentBuilder message(java.lang.String p0)`
- `public org.kohsuke.github.GHContentBuilder path(java.lang.String p0)`
- `public org.kohsuke.github.GHContentBuilder sha(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHContentSearchBuilder`
extends `org.kohsuke.github.GHSearchBuilder`  

**Methods:**
- `public org.kohsuke.github.GHContentSearchBuilder extension(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder filename(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder fork(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder fork(org.kohsuke.github.GHFork p0)`
- `protected java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHContentSearchBuilder in(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder language(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder order(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHContentSearchBuilder path(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder q(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder repo(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder size(java.lang.String p0)`
- `public org.kohsuke.github.GHContentSearchBuilder sort(org.kohsuke.github.GHContentSearchBuilder$Sort p0)`
- `public org.kohsuke.github.GHContentSearchBuilder user(java.lang.String p0)`

---

## public final static enum `org.kohsuke.github.GHContentSearchBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHContentSearchBuilder$Sort BEST_MATCH`
- `public final static org.kohsuke.github.GHContentSearchBuilder$Sort INDEXED`

---

## public class `org.kohsuke.github.GHContentUpdateResponse`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  

**Constructors:**
- `public GHContentUpdateResponse()`

**Methods:**
- `public org.kohsuke.github.GitCommit getCommit()`
- `public org.kohsuke.github.GHContent getContent()`

---

## public class `org.kohsuke.github.GHCreateRepositoryBuilder`
extends `org.kohsuke.github.GHRepositoryBuilder`  

**Constructors:**
- `public GHCreateRepositoryBuilder(java.lang.String p0, org.kohsuke.github.GitHub p1, java.lang.String p2)`

**Methods:**
- `public org.kohsuke.github.GHCreateRepositoryBuilder autoInit(boolean p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository create() throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder fromTemplateRepository(java.lang.String p0, java.lang.String p1)`
- `public org.kohsuke.github.GHCreateRepositoryBuilder gitignoreTemplate(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder licenseTemplate(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder owner(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder team(org.kohsuke.github.GHTeam p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder templateRepository(boolean p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHDeployKey`

**Constructors:**
- `public GHDeployKey()`

**Fields:**
- `protected long id`
- `protected java.lang.String key`
- `protected java.lang.String title`
- `protected java.lang.String url`
- `protected boolean verified`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public long getId()`
- `public java.lang.String getKey()`
- `public java.lang.String getTitle()`
- `public java.lang.String getUrl()`
- `public boolean isVerified()`
- `public java.lang.String toString()`
- `public org.kohsuke.github.GHDeployKey wrap(org.kohsuke.github.GHRepository p0)`

---

## public class `org.kohsuke.github.GHDeployment`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHDeployment()`

**Fields:**
- `protected org.kohsuke.github.GHUser creator`
- `protected java.lang.String description`
- `protected java.lang.String environment`
- `protected java.lang.String original_environment`
- `protected java.lang.Object payload`
- `protected boolean production_environment`
- `protected java.lang.String ref`
- `protected java.lang.String repository_url`
- `protected java.lang.String sha`
- `protected java.lang.String statuses_url`
- `protected java.lang.String task`
- `protected boolean transient_environment`

**Methods:**
- `public org.kohsuke.github.GHDeploymentStatusBuilder createStatus(org.kohsuke.github.GHDeploymentState p0)`
- `public org.kohsuke.github.GHUser getCreator() throws java.io.IOException`
- `public java.lang.String getEnvironment()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getOriginalEnvironment()`
- `public java.lang.String getPayload()`
- `public java.util.Map getPayloadMap()`
- `public java.lang.Object getPayloadObject()`
- `public java.lang.String getRef()`
- `public java.net.URL getRepositoryUrl()`
- `public java.lang.String getSha()`
- `public java.net.URL getStatusesUrl()`
- `public java.lang.String getTask()`
- `public boolean isProductionEnvironment()`
- `public boolean isTransientEnvironment()`
- `public org.kohsuke.github.PagedIterable listStatuses()`

---

## public class `org.kohsuke.github.GHDeploymentBuilder`

**Constructors:**
- `public GHDeploymentBuilder(org.kohsuke.github.GHRepository p0)`
- `public GHDeploymentBuilder(org.kohsuke.github.GHRepository p0, java.lang.String p1)`

**Methods:**
- `public org.kohsuke.github.GHDeploymentBuilder autoMerge(boolean p0)`
- `public org.kohsuke.github.GHDeployment create() throws java.io.IOException`
- `public org.kohsuke.github.GHDeploymentBuilder description(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentBuilder environment(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentBuilder payload(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentBuilder productionEnvironment(boolean p0)`
- `public org.kohsuke.github.GHDeploymentBuilder ref(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentBuilder requiredContexts(java.util.List p0)`
- `public org.kohsuke.github.GHDeploymentBuilder task(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentBuilder transientEnvironment(boolean p0)`

---

## public final enum `org.kohsuke.github.GHDeploymentState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHDeploymentState ERROR`
- `public final static org.kohsuke.github.GHDeploymentState FAILURE`
- `public final static org.kohsuke.github.GHDeploymentState INACTIVE`
- `public final static org.kohsuke.github.GHDeploymentState IN_PROGRESS`
- `public final static org.kohsuke.github.GHDeploymentState PENDING`
- `public final static org.kohsuke.github.GHDeploymentState QUEUED`
- `public final static org.kohsuke.github.GHDeploymentState SUCCESS`

---

## public class `org.kohsuke.github.GHDeploymentStatus`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHDeploymentStatus()`

**Fields:**
- `protected org.kohsuke.github.GHUser creator`
- `protected java.lang.String deployment_url`
- `protected java.lang.String description`
- `protected java.lang.String environment_url`
- `protected java.lang.String log_url`
- `protected java.lang.String repository_url`
- `protected java.lang.String state`
- `protected java.lang.String target_url`

**Methods:**
- `public java.net.URL getDeploymentUrl()`
- `public java.net.URL getEnvironmentUrl()`
- `public java.net.URL getHtmlUrl()`
- `public java.net.URL getLogUrl()`
- `public java.net.URL getRepositoryUrl()`
- `public org.kohsuke.github.GHDeploymentState getState()`
- `public java.net.URL getTargetUrl()`
- `public org.kohsuke.github.GHDeploymentStatus wrap(org.kohsuke.github.GHRepository p0)`

---

## public class `org.kohsuke.github.GHDeploymentStatusBuilder`

**Constructors:**
- `public GHDeploymentStatusBuilder(org.kohsuke.github.GHRepository p0, int p1, org.kohsuke.github.GHDeploymentState p2)`

**Methods:**
- `public org.kohsuke.github.GHDeploymentStatusBuilder autoInactive(boolean p0)`
- `public org.kohsuke.github.GHDeploymentStatus create() throws java.io.IOException`
- `public org.kohsuke.github.GHDeploymentStatusBuilder description(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentStatusBuilder environment(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentStatusBuilder environmentUrl(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentStatusBuilder logUrl(java.lang.String p0)`
- `public org.kohsuke.github.GHDeploymentStatusBuilder targetUrl(java.lang.String p0)`

---

## public final enum `org.kohsuke.github.GHDirection`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHDirection ASC`
- `public final static org.kohsuke.github.GHDirection DESC`

---

## public class `org.kohsuke.github.GHDiscussion`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHDiscussion()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getBody()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public long getId()`
- `public long getNumber()`
- `public org.kohsuke.github.GHTeam getTeam()`
- `public java.lang.String getTitle()`
- `public int hashCode()`
- `public boolean isPrivate()`
- `public org.kohsuke.github.GHDiscussion$Setter set()`
- `public org.kohsuke.github.GHDiscussion$Updater update()`

---

## public static class `org.kohsuke.github.GHDiscussion$Creator`
extends `org.kohsuke.github.GHDiscussionBuilder`  

**Methods:**
- `public org.kohsuke.github.GHDiscussion$Creator private_(boolean p0) throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHDiscussion$Setter`
extends `org.kohsuke.github.GHDiscussionBuilder`  

---

## public static class `org.kohsuke.github.GHDiscussion$Updater`
extends `org.kohsuke.github.GHDiscussionBuilder`  

---

## public class `org.kohsuke.github.GHEmail`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHEmail()`

**Fields:**
- `protected java.lang.String email`
- `protected boolean primary`
- `protected boolean verified`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getEmail()`
- `public int hashCode()`
- `public boolean isPrimary()`
- `public boolean isVerified()`
- `public java.lang.String toString()`

---

## public final enum `org.kohsuke.github.GHEvent`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHEvent ALL`
- `public final static org.kohsuke.github.GHEvent BRANCH_PROTECTION_RULE`
- `public final static org.kohsuke.github.GHEvent CHECK_RUN`
- `public final static org.kohsuke.github.GHEvent CHECK_SUITE`
- `public final static org.kohsuke.github.GHEvent CODE_SCANNING_ALERT`
- `public final static org.kohsuke.github.GHEvent COMMIT_COMMENT`
- `public final static org.kohsuke.github.GHEvent CONTENT_REFERENCE`
- `public final static org.kohsuke.github.GHEvent CREATE`
- `public final static org.kohsuke.github.GHEvent DELETE`
- `public final static org.kohsuke.github.GHEvent DEPLOYMENT`
- `public final static org.kohsuke.github.GHEvent DEPLOYMENT_STATUS`
- `public final static org.kohsuke.github.GHEvent DEPLOY_KEY`
- `public final static org.kohsuke.github.GHEvent DISCUSSION`
- `public final static org.kohsuke.github.GHEvent DISCUSSION_COMMENT`
- `public final static org.kohsuke.github.GHEvent DOWNLOAD`
- `public final static org.kohsuke.github.GHEvent FOLLOW`
- `public final static org.kohsuke.github.GHEvent FORK`
- `public final static org.kohsuke.github.GHEvent FORK_APPLY`
- `public final static org.kohsuke.github.GHEvent GIST`
- `public final static org.kohsuke.github.GHEvent GITHUB_APP_AUTHORIZATION`
- `public final static org.kohsuke.github.GHEvent GOLLUM`
- `public final static org.kohsuke.github.GHEvent INSTALLATION`
- `public final static org.kohsuke.github.GHEvent INSTALLATION_REPOSITORIES`
- `public final static org.kohsuke.github.GHEvent INTEGRATION_INSTALLATION_REPOSITORIES`
- `public final static org.kohsuke.github.GHEvent ISSUES`
- `public final static org.kohsuke.github.GHEvent ISSUE_COMMENT`
- `public final static org.kohsuke.github.GHEvent LABEL`
- `public final static org.kohsuke.github.GHEvent MARKETPLACE_PURCHASE`
- `public final static org.kohsuke.github.GHEvent MEMBER`
- `public final static org.kohsuke.github.GHEvent MEMBERSHIP`
- `public final static org.kohsuke.github.GHEvent MERGE_QUEUE_ENTRY`
- `public final static org.kohsuke.github.GHEvent META`
- `public final static org.kohsuke.github.GHEvent MILESTONE`
- `public final static org.kohsuke.github.GHEvent ORGANIZATION`
- `public final static org.kohsuke.github.GHEvent ORG_BLOCK`
- `public final static org.kohsuke.github.GHEvent PACKAGE`
- `public final static org.kohsuke.github.GHEvent PAGE_BUILD`
- `public final static org.kohsuke.github.GHEvent PING`
- `public final static org.kohsuke.github.GHEvent PROJECT`
- `public final static org.kohsuke.github.GHEvent PROJECT_CARD`
- `public final static org.kohsuke.github.GHEvent PROJECT_COLUMN`
- `public final static org.kohsuke.github.GHEvent PUBLIC`
- `public final static org.kohsuke.github.GHEvent PULL_REQUEST`
- `public final static org.kohsuke.github.GHEvent PULL_REQUEST_REVIEW`
- `public final static org.kohsuke.github.GHEvent PULL_REQUEST_REVIEW_COMMENT`
- `public final static org.kohsuke.github.GHEvent PULL_REQUEST_REVIEW_THREAD`
- `public final static org.kohsuke.github.GHEvent PUSH`
- `public final static org.kohsuke.github.GHEvent REGISTRY_PACKAGE`
- `public final static org.kohsuke.github.GHEvent RELEASE`
- `public final static org.kohsuke.github.GHEvent REPOSITORY`
- `public final static org.kohsuke.github.GHEvent REPOSITORY_DISPATCH`
- `public final static org.kohsuke.github.GHEvent REPOSITORY_IMPORT`
- `public final static org.kohsuke.github.GHEvent REPOSITORY_VULNERABILITY_ALERT`
- `public final static org.kohsuke.github.GHEvent SCHEDULE`
- `public final static org.kohsuke.github.GHEvent SECURITY_ADVISORY`
- `public final static org.kohsuke.github.GHEvent STAR`
- `public final static org.kohsuke.github.GHEvent STATUS`
- `public final static org.kohsuke.github.GHEvent TEAM`
- `public final static org.kohsuke.github.GHEvent TEAM_ADD`
- `public final static org.kohsuke.github.GHEvent UNKNOWN`
- `public final static org.kohsuke.github.GHEvent WATCH`
- `public final static org.kohsuke.github.GHEvent WORKFLOW_DISPATCH`
- `public final static org.kohsuke.github.GHEvent WORKFLOW_JOB`
- `public final static org.kohsuke.github.GHEvent WORKFLOW_RUN`

---

## public class `org.kohsuke.github.GHEventInfo`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHEventInfo()`

**Methods:**
- `public org.kohsuke.github.GHUser getActor() throws java.io.IOException`
- `public java.lang.String getActorLogin() throws java.io.IOException`
- `public java.util.Date getCreatedAt()`
- `public long getId()`
- `public org.kohsuke.github.GHOrganization getOrganization() throws java.io.IOException`
- `public <T extends org.kohsuke.github.GHEventPayload> T getPayload(java.lang.Class p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepository() throws java.io.IOException`
- `public org.kohsuke.github.GHEvent getType()`

---

## public static class `org.kohsuke.github.GHEventInfo$GHEventRepository`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHEventRepository()`

---

## public abstract class `org.kohsuke.github.GHEventPayload`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Methods:**
- `public java.lang.String getAction()`
- `public org.kohsuke.github.GHAppInstallation getInstallation()`
- `public org.kohsuke.github.GHOrganization getOrganization()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public org.kohsuke.github.GHUser getSender()`
- `public void setOrganization(org.kohsuke.github.GHOrganization p0)`
- `public void setRepository(org.kohsuke.github.GHRepository p0)`
- `public void setSender(org.kohsuke.github.GHUser p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$CheckRun`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public CheckRun()`

**Methods:**
- `public org.kohsuke.github.GHCheckRun getCheckRun()`
- `public int getNumber()`
- `public org.kohsuke.github.GHRequestedAction getRequestedAction()`
- `public void setCheckRun(org.kohsuke.github.GHCheckRun p0)`
- `public void setRequestedAction(org.kohsuke.github.GHRequestedAction p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$CheckSuite`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public CheckSuite()`

**Methods:**
- `public org.kohsuke.github.GHCheckSuite getCheckSuite()`

---

## public static class `org.kohsuke.github.GHEventPayload$CommentChanges`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public CommentChanges()`

**Methods:**
- `public org.kohsuke.github.GHEventPayload$CommentChanges$GHFrom getBody()`

---

## public static class `org.kohsuke.github.GHEventPayload$CommentChanges$GHFrom`

**Constructors:**
- `public GHFrom()`

**Methods:**
- `public java.lang.String getFrom()`

---

## public static class `org.kohsuke.github.GHEventPayload$CommitComment`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public CommitComment()`

**Methods:**
- `public org.kohsuke.github.GHCommitComment getComment()`
- `public void setComment(org.kohsuke.github.GHCommitComment p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Create`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Create()`

**Methods:**
- `public java.lang.String getDescription()`
- `public java.lang.String getMasterBranch()`
- `public java.lang.String getRef()`
- `public java.lang.String getRefType()`

---

## public static class `org.kohsuke.github.GHEventPayload$Delete`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Delete()`

**Methods:**
- `public java.lang.String getRef()`
- `public java.lang.String getRefType()`

---

## public static class `org.kohsuke.github.GHEventPayload$Deployment`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Deployment()`

**Methods:**
- `public org.kohsuke.github.GHDeployment getDeployment()`
- `public void setDeployment(org.kohsuke.github.GHDeployment p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$DeploymentStatus`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public DeploymentStatus()`

**Methods:**
- `public org.kohsuke.github.GHDeployment getDeployment()`
- `public org.kohsuke.github.GHDeploymentStatus getDeploymentStatus()`
- `public void setDeployment(org.kohsuke.github.GHDeployment p0)`
- `public void setDeploymentStatus(org.kohsuke.github.GHDeploymentStatus p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Discussion`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Discussion()`

**Methods:**
- `public org.kohsuke.github.GHRepositoryDiscussion getDiscussion()`
- `public org.kohsuke.github.GHLabel getLabel()`

---

## public static class `org.kohsuke.github.GHEventPayload$Fork`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Fork()`

**Methods:**
- `public org.kohsuke.github.GHRepository getForkee()`
- `public void setForkee(org.kohsuke.github.GHRepository p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Installation`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Installation()`

**Methods:**
- `public java.util.List getRepositories()`

---

## public static class `org.kohsuke.github.GHEventPayload$InstallationRepositories`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public InstallationRepositories()`

**Methods:**
- `public java.util.List getRepositoriesAdded()`
- `public java.util.List getRepositoriesRemoved()`
- `public java.lang.String getRepositorySelection()`

---

## public static class `org.kohsuke.github.GHEventPayload$Issue`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Issue()`

**Methods:**
- `public org.kohsuke.github.GHIssueChanges getChanges()`
- `public org.kohsuke.github.GHIssue getIssue()`
- `public org.kohsuke.github.GHLabel getLabel()`
- `public void setIssue(org.kohsuke.github.GHIssue p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$IssueComment`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public IssueComment()`

**Methods:**
- `public org.kohsuke.github.GHEventPayload$CommentChanges getChanges()`
- `public org.kohsuke.github.GHIssueComment getComment()`
- `public org.kohsuke.github.GHIssue getIssue()`
- `public void setComment(org.kohsuke.github.GHIssueComment p0)`
- `public void setIssue(org.kohsuke.github.GHIssue p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Label`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Label()`

**Methods:**
- `public org.kohsuke.github.GHLabelChanges getChanges()`
- `public org.kohsuke.github.GHLabel getLabel()`

---

## public static class `org.kohsuke.github.GHEventPayload$Ping`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Ping()`

---

## public static class `org.kohsuke.github.GHEventPayload$ProjectsV2Item`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public ProjectsV2Item()`

**Methods:**
- `public org.kohsuke.github.GHProjectsV2ItemChanges getChanges()`
- `public org.kohsuke.github.GHProjectsV2Item getProjectsV2Item()`

---

## public static class `org.kohsuke.github.GHEventPayload$Public`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Public()`

---

## public static class `org.kohsuke.github.GHEventPayload$PullRequest`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public PullRequest()`

**Methods:**
- `public org.kohsuke.github.GHPullRequestChanges getChanges()`
- `public org.kohsuke.github.GHLabel getLabel()`
- `public int getNumber()`
- `public org.kohsuke.github.GHPullRequest getPullRequest()`

---

## public static class `org.kohsuke.github.GHEventPayload$PullRequestReview`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public PullRequestReview()`

**Methods:**
- `public org.kohsuke.github.GHPullRequest getPullRequest()`
- `public org.kohsuke.github.GHPullRequestReview getReview()`

---

## public static class `org.kohsuke.github.GHEventPayload$PullRequestReviewComment`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public PullRequestReviewComment()`

**Methods:**
- `public org.kohsuke.github.GHEventPayload$CommentChanges getChanges()`
- `public org.kohsuke.github.GHPullRequestReviewComment getComment()`
- `public org.kohsuke.github.GHPullRequest getPullRequest()`

---

## public static class `org.kohsuke.github.GHEventPayload$Push`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Push()`

**Methods:**
- `public java.lang.String getBefore()`
- `public java.util.List getCommits()`
- `public java.lang.String getCompare()`
- `public java.lang.String getHead()`
- `public org.kohsuke.github.GHEventPayload$Push$Pusher getPusher()`
- `public java.lang.String getRef()`
- `public int getSize()`
- `public boolean isCreated()`
- `public boolean isDeleted()`
- `public boolean isForced()`
- `public void setPusher(org.kohsuke.github.GHEventPayload$Push$Pusher p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Push$PushCommit`

**Constructors:**
- `public PushCommit()`

**Methods:**
- `public java.util.List getAdded()`
- `public org.kohsuke.github.GitUser getAuthor()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getMessage()`
- `public java.util.List getModified()`
- `public java.util.List getRemoved()`
- `public java.lang.String getSha()`
- `public java.util.Date getTimestamp()`
- `public java.lang.String getUrl()`
- `public boolean isDistinct()`

---

## public static class `org.kohsuke.github.GHEventPayload$Push$Pusher`

**Constructors:**
- `public Pusher()`

**Methods:**
- `public java.lang.String getEmail()`
- `public java.lang.String getName()`
- `public void setEmail(java.lang.String p0)`
- `public void setName(java.lang.String p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Release`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Release()`

**Methods:**
- `public org.kohsuke.github.GHRelease getRelease()`
- `public void setRelease(org.kohsuke.github.GHRelease p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$Repository`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Repository()`

---

## public static class `org.kohsuke.github.GHEventPayload$Star`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Star()`

**Methods:**
- `public java.util.Date getStarredAt()`

---

## public static class `org.kohsuke.github.GHEventPayload$Status`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public Status()`

**Methods:**
- `public org.kohsuke.github.GHCommit getCommit()`
- `public java.lang.String getContext()`
- `public java.lang.String getDescription()`
- `public org.kohsuke.github.GHCommitState getState()`
- `public java.lang.String getTargetUrl()`
- `public void setCommit(org.kohsuke.github.GHCommit p0)`
- `public void setState(org.kohsuke.github.GHCommitState p0)`

---

## public static class `org.kohsuke.github.GHEventPayload$WorkflowDispatch`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public WorkflowDispatch()`

**Methods:**
- `public java.util.Map getInputs()`
- `public java.lang.String getRef()`
- `public java.lang.String getWorkflow()`

---

## public static class `org.kohsuke.github.GHEventPayload$WorkflowJob`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public WorkflowJob()`

**Methods:**
- `public org.kohsuke.github.GHWorkflowJob getWorkflowJob()`

---

## public static class `org.kohsuke.github.GHEventPayload$WorkflowRun`
extends `org.kohsuke.github.GHEventPayload`  

**Constructors:**
- `public WorkflowRun()`

**Methods:**
- `public org.kohsuke.github.GHWorkflow getWorkflow()`
- `public org.kohsuke.github.GHWorkflowRun getWorkflowRun()`

---

## public class `org.kohsuke.github.GHException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public GHException(java.lang.String p0)`
- `public GHException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.kohsuke.github.GHFileNotFoundException`
extends `java.io.FileNotFoundException`  

**Constructors:**
- `public GHFileNotFoundException()`
- `public GHFileNotFoundException(java.lang.String p0)`
- `public GHFileNotFoundException(java.lang.String p0, java.lang.Throwable p1)`

**Fields:**
- `protected java.util.Map responseHeaderFields`

**Methods:**
- `public java.util.Map getResponseHeaderFields()`

---

## public final enum `org.kohsuke.github.GHFork`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHFork FORKS_ONLY`
- `public final static org.kohsuke.github.GHFork PARENT_AND_FORKS`
- `public final static org.kohsuke.github.GHFork PARENT_ONLY`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHGist`
extends `org.kohsuke.github.GHObject`  

**Methods:**
- `public void delete() throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public org.kohsuke.github.GHGist fork() throws java.io.IOException`
- `public int getCommentCount()`
- `public java.lang.String getCommentsUrl()`
- `public java.lang.String getCommitsUrl()`
- `public java.lang.String getDescription()`
- `public org.kohsuke.github.GHGistFile getFile(java.lang.String p0)`
- `public java.util.Map getFiles()`
- `public java.lang.String getForksUrl()`
- `public java.lang.String getGistId()`
- `public java.lang.String getGitPullUrl()`
- `public java.lang.String getGitPushUrl()`
- `public java.net.URL getHtmlUrl()`
- `public long getId()`
- `public org.kohsuke.github.GHUser getOwner() throws java.io.IOException`
- `public int hashCode()`
- `public boolean isPublic()`
- `public boolean isStarred() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listForks()`
- `public void star() throws java.io.IOException`
- `public void unstar() throws java.io.IOException`
- `public org.kohsuke.github.GHGistUpdater update() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHGistBuilder`

**Constructors:**
- `public GHGistBuilder(org.kohsuke.github.GitHub p0)`

**Methods:**
- `public org.kohsuke.github.GHGist create() throws java.io.IOException`
- `public org.kohsuke.github.GHGistBuilder description(java.lang.String p0)`
- `public org.kohsuke.github.GHGistBuilder file(java.lang.String p0, java.lang.String p1)`
- `public org.kohsuke.github.GHGistBuilder public_(boolean p0)`

---

## public class `org.kohsuke.github.GHGistFile`

**Constructors:**
- `public GHGistFile()`

**Methods:**
- `public java.lang.String getContent()`
- `public java.lang.String getFileName()`
- `public java.lang.String getLanguage()`
- `public java.lang.String getRawUrl()`
- `public int getSize()`
- `public java.lang.String getType()`
- `public boolean isTruncated()`

---

## public class `org.kohsuke.github.GHGistUpdater`

**Methods:**
- `public org.kohsuke.github.GHGistUpdater addFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHGistUpdater deleteFile(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHGistUpdater description(java.lang.String p0)`
- `public org.kohsuke.github.GHGistUpdater renameFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHGist update() throws java.io.IOException`
- `public org.kohsuke.github.GHGistUpdater updateFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHGistUpdater updateFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`

---

## public abstract class `org.kohsuke.github.GHHook`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHHook()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public java.util.Map getConfig()`
- `public java.util.EnumSet getEvents()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getName()`
- `public boolean isActive()`
- `public void ping() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHIOException`
extends `java.io.IOException`  

**Constructors:**
- `public GHIOException()`
- `public GHIOException(java.lang.String p0)`
- `public GHIOException(java.lang.String p0, java.lang.Throwable p1)`

**Fields:**
- `protected java.util.Map responseHeaderFields`

**Methods:**
- `public java.util.Map getResponseHeaderFields()`

---

## public class `org.kohsuke.github.GHInvitation`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHInvitation()`

**Methods:**
- `public void accept() throws java.io.IOException`
- `public void decline() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`

---

## public class `org.kohsuke.github.GHIssue`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  
extends `org.kohsuke.github.GHObject`  
implements `org.kohsuke.github.Reactable`  

**Constructors:**
- `public GHIssue()`

**Fields:**
- `protected org.kohsuke.github.GHUser assignee`
- `protected org.kohsuke.github.GHUser[] assignees`
- `protected java.lang.String body`
- `protected java.lang.String closed_at`
- `protected org.kohsuke.github.GHUser closed_by`
- `protected int comments`
- `protected java.lang.String html_url`
- `protected java.util.List labels`
- `protected boolean locked`
- `protected org.kohsuke.github.GHMilestone milestone`
- `protected int number`
- `protected org.kohsuke.github.GHIssue$PullRequest pull_request`
- `protected java.lang.String state`
- `protected java.lang.String title`
- `protected org.kohsuke.github.GHUser user`

**Methods:**
- `public void addAssignees(java.util.Collection p0) throws java.io.IOException`
- `public void addAssignees(org.kohsuke.github.GHUser... p0) throws java.io.IOException`
- `public java.util.List addLabels(java.lang.String... p0) throws java.io.IOException`
- `public java.util.List addLabels(java.util.Collection p0) throws java.io.IOException`
- `public java.util.List addLabels(org.kohsuke.github.GHLabel... p0) throws java.io.IOException`
- `public void assignTo(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `public org.kohsuke.github.GHIssueComment comment(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHReaction createReaction(org.kohsuke.github.ReactionContent p0) throws java.io.IOException`
- `public void deleteReaction(org.kohsuke.github.GHReaction p0) throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public java.net.URL getApiURL()`
- `public org.kohsuke.github.GHUser getAssignee() throws java.io.IOException`
- `public java.util.List getAssignees()`
- `public java.lang.String getBody()`
- `public java.util.Date getClosedAt()`
- `public org.kohsuke.github.GHUser getClosedBy() throws java.io.IOException`
- `public java.util.List getComments() throws java.io.IOException`
- `public int getCommentsCount()`
- `public java.net.URL getHtmlUrl()`
- `protected java.lang.String getIssuesApiRoute()`
- `public java.util.Collection getLabels()`
- `protected static java.util.List getLogins(java.util.Collection p0)`
- `public org.kohsuke.github.GHMilestone getMilestone()`
- `public int getNumber()`
- `public org.kohsuke.github.GHIssue$PullRequest getPullRequest()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public org.kohsuke.github.GHIssueState getState()`
- `public java.lang.String getTitle()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public boolean isLocked()`
- `public boolean isPullRequest()`
- `public org.kohsuke.github.PagedIterable listComments() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReactions()`
- `public void lock() throws java.io.IOException`
- `public org.kohsuke.github.GHIssueCommentQueryBuilder queryComments()`
- `public void removeAssignees(java.util.Collection p0) throws java.io.IOException`
- `public void removeAssignees(org.kohsuke.github.GHUser... p0) throws java.io.IOException`
- `public java.util.List removeLabel(java.lang.String p0) throws java.io.IOException`
- `public java.util.List removeLabels(java.lang.String... p0) throws java.io.IOException`
- `public java.util.List removeLabels(java.util.Collection p0) throws java.io.IOException`
- `public java.util.List removeLabels(org.kohsuke.github.GHLabel... p0) throws java.io.IOException`
- `public void reopen() throws java.io.IOException`
- `public void setAssignees(java.util.Collection p0) throws java.io.IOException`
- `public void setAssignees(org.kohsuke.github.GHUser... p0) throws java.io.IOException`
- `public void setBody(java.lang.String p0) throws java.io.IOException`
- `public void setLabels(java.lang.String... p0) throws java.io.IOException`
- `public void setMilestone(org.kohsuke.github.GHMilestone p0) throws java.io.IOException`
- `public void setTitle(java.lang.String p0) throws java.io.IOException`
- `public void unlock() throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHIssue$PullRequest`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public PullRequest()`

**Methods:**
- `public java.net.URL getDiffUrl()`
- `public java.net.URL getPatchUrl()`
- `public java.net.URL getUrl()`

---

## public class `org.kohsuke.github.GHIssueBuilder`

**Methods:**
- `public org.kohsuke.github.GHIssueBuilder assignee(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueBuilder assignee(org.kohsuke.github.GHUser p0)`
- `public org.kohsuke.github.GHIssueBuilder body(java.lang.String p0)`
- `public org.kohsuke.github.GHIssue create() throws java.io.IOException`
- `public org.kohsuke.github.GHIssueBuilder label(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueBuilder milestone(org.kohsuke.github.GHMilestone p0)`

---

## public class `org.kohsuke.github.GHIssueChanges`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHIssueChanges()`

**Methods:**
- `public org.kohsuke.github.GHIssueChanges$GHFrom getBody()`
- `public org.kohsuke.github.GHIssueChanges$GHFrom getTitle()`

---

## public static class `org.kohsuke.github.GHIssueChanges$GHFrom`

**Constructors:**
- `public GHFrom()`

**Methods:**
- `public java.lang.String getFrom()`

---

## public class `org.kohsuke.github.GHIssueComment`
extends `org.kohsuke.github.GHObject`  
implements `org.kohsuke.github.Reactable`  

**Constructors:**
- `public GHIssueComment()`

**Methods:**
- `public org.kohsuke.github.GHReaction createReaction(org.kohsuke.github.ReactionContent p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public void deleteReaction(org.kohsuke.github.GHReaction p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCommentAuthorAssociation getAuthorAssociation()`
- `public java.lang.String getBody()`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHIssue getParent()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public java.lang.String getUserName()`
- `public org.kohsuke.github.PagedIterable listReactions()`
- `public void update(java.lang.String p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHIssueCommentQueryBuilder`

**Methods:**
- `public org.kohsuke.github.PagedIterable list()`
- `public org.kohsuke.github.GHIssueCommentQueryBuilder since(java.util.Date p0)`
- `public org.kohsuke.github.GHIssueCommentQueryBuilder since(long p0)`

---

## public class `org.kohsuke.github.GHIssueEvent`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHIssueEvent()`

**Methods:**
- `public org.kohsuke.github.GHUser getActor()`
- `public org.kohsuke.github.GHUser getAssignee()`
- `public java.lang.String getCommitId()`
- `public java.lang.String getCommitUrl()`
- `public java.util.Date getCreatedAt()`
- `public java.lang.String getEvent()`
- `public long getId()`
- `public org.kohsuke.github.GHIssue getIssue()`
- `public org.kohsuke.github.GHLabel getLabel()`
- `public org.kohsuke.github.GHMilestone getMilestone()`
- `public java.lang.String getNodeId()`
- `public org.kohsuke.github.GHIssueRename getRename()`
- `public org.kohsuke.github.GHUser getRequestedReviewer()`
- `public org.kohsuke.github.GHUser getReviewRequester()`
- `public java.lang.String getUrl()`
- `public java.lang.String toString()`

---

## public abstract class `org.kohsuke.github.GHIssueQueryBuilder`
extends `org.kohsuke.github.GHQueryBuilder`  

**Methods:**
- `public org.kohsuke.github.GHIssueQueryBuilder direction(org.kohsuke.github.GHDirection p0)`
- `public abstract java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHIssueQueryBuilder label(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder pageSize(int p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder since(java.util.Date p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder since(long p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder sort(org.kohsuke.github.GHIssueQueryBuilder$Sort p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder state(org.kohsuke.github.GHIssueState p0)`

---

## public static class `org.kohsuke.github.GHIssueQueryBuilder$ForRepository`
extends `org.kohsuke.github.GHIssueQueryBuilder`  

**Methods:**
- `public org.kohsuke.github.GHIssueQueryBuilder$ForRepository assignee(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder$ForRepository creator(java.lang.String p0)`
- `public java.lang.String getApiUrl()`
- `public org.kohsuke.github.PagedIterable list()`
- `public org.kohsuke.github.GHIssueQueryBuilder$ForRepository mentioned(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueQueryBuilder$ForRepository milestone(java.lang.String p0)`

---

## public final static enum `org.kohsuke.github.GHIssueQueryBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHIssueQueryBuilder$Sort COMMENTS`
- `public final static org.kohsuke.github.GHIssueQueryBuilder$Sort CREATED`
- `public final static org.kohsuke.github.GHIssueQueryBuilder$Sort UPDATED`

---

## public class `org.kohsuke.github.GHIssueRename`

**Constructors:**
- `public GHIssueRename()`

**Methods:**
- `public java.lang.String getFrom()`
- `public java.lang.String getTo()`

---

## public class `org.kohsuke.github.GHIssueSearchBuilder`
extends `org.kohsuke.github.GHSearchBuilder`  

**Methods:**
- `protected java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHIssueSearchBuilder isClosed()`
- `public org.kohsuke.github.GHIssueSearchBuilder isMerged()`
- `public org.kohsuke.github.GHIssueSearchBuilder isOpen()`
- `public org.kohsuke.github.GHIssueSearchBuilder mentions(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueSearchBuilder mentions(org.kohsuke.github.GHUser p0)`
- `public org.kohsuke.github.GHIssueSearchBuilder order(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHIssueSearchBuilder q(java.lang.String p0)`
- `public org.kohsuke.github.GHIssueSearchBuilder sort(org.kohsuke.github.GHIssueSearchBuilder$Sort p0)`

---

## public final static enum `org.kohsuke.github.GHIssueSearchBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHIssueSearchBuilder$Sort COMMENTS`
- `public final static org.kohsuke.github.GHIssueSearchBuilder$Sort CREATED`
- `public final static org.kohsuke.github.GHIssueSearchBuilder$Sort UPDATED`

---

## public final enum `org.kohsuke.github.GHIssueState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHIssueState ALL`
- `public final static org.kohsuke.github.GHIssueState CLOSED`
- `public final static org.kohsuke.github.GHIssueState OPEN`

---

## public class `org.kohsuke.github.GHKey`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHKey()`

**Fields:**
- `protected int id`
- `protected java.lang.String key`
- `protected java.lang.String title`
- `protected java.lang.String url`
- `protected boolean verified`

**Methods:**
- `public int getId()`
- `public java.lang.String getKey()`
- `public java.lang.String getTitle()`
- `public java.lang.String getUrl()`
- `public boolean isVerified()`
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHLabel`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Methods:**
- `public void delete() throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getColor()`
- `public java.lang.String getDescription()`
- `public long getId()`
- `public java.lang.String getName()`
- `public java.lang.String getNodeId()`
- `public java.lang.String getUrl()`
- `public int hashCode()`
- `public boolean isDefault()`
- `public org.kohsuke.github.GHLabel$Setter set()`
- `public void setColor(java.lang.String p0) throws java.io.IOException`
- `public void setDescription(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHLabel$Updater update()`

---

## public static class `org.kohsuke.github.GHLabel$Creator`
annotations: @org.kohsuke.github.BetaApi  
extends `org.kohsuke.github.GHLabelBuilder`  

---

## public static class `org.kohsuke.github.GHLabel$Setter`
annotations: @org.kohsuke.github.BetaApi  
extends `org.kohsuke.github.GHLabelBuilder`  

---

## public static class `org.kohsuke.github.GHLabel$Updater`
annotations: @org.kohsuke.github.BetaApi  
extends `org.kohsuke.github.GHLabelBuilder`  

---

## public class `org.kohsuke.github.GHLabelChanges`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHLabelChanges()`

**Methods:**
- `public org.kohsuke.github.GHLabelChanges$GHFrom getColor()`
- `public org.kohsuke.github.GHLabelChanges$GHFrom getName()`

---

## public static class `org.kohsuke.github.GHLabelChanges$GHFrom`

**Constructors:**
- `public GHFrom()`

**Methods:**
- `public java.lang.String getFrom()`

---

## public class `org.kohsuke.github.GHLicense`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHLicense()`

**Fields:**
- `protected java.lang.String body`
- `protected java.lang.String category`
- `protected java.lang.String description`
- `protected java.lang.Boolean featured`
- `protected java.util.List forbidden`
- `protected java.lang.String html_url`
- `protected java.lang.String implementation`
- `protected java.lang.String key`
- `protected java.lang.String name`
- `protected java.util.List permitted`
- `protected java.util.List required`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getBody() throws java.io.IOException`
- `public java.lang.String getCategory() throws java.io.IOException`
- `public java.lang.String getDescription() throws java.io.IOException`
- `public java.util.List getForbidden() throws java.io.IOException`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getImplementation() throws java.io.IOException`
- `public java.lang.String getKey()`
- `public java.lang.String getName()`
- `public java.util.List getPermitted() throws java.io.IOException`
- `public java.util.List getRequired() throws java.io.IOException`
- `public int hashCode()`
- `public java.lang.Boolean isFeatured() throws java.io.IOException`
- `protected synchronized void populate() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHMarketplaceAccount`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMarketplaceAccount()`

**Methods:**
- `public java.lang.String getEmail()`
- `public long getId()`
- `public java.lang.String getLogin()`
- `public java.lang.String getOrganizationBillingEmail()`
- `public org.kohsuke.github.GHMarketplaceAccountType getType()`
- `public java.net.URL getUrl()`

---

## public class `org.kohsuke.github.GHMarketplaceAccountPlan`
extends `org.kohsuke.github.GHMarketplaceAccount`  

**Constructors:**
- `public GHMarketplaceAccountPlan()`

**Methods:**
- `public org.kohsuke.github.GHMarketplacePendingChange getMarketplacePendingChange()`
- `public org.kohsuke.github.GHMarketplacePurchase getMarketplacePurchase()`

---

## public final enum `org.kohsuke.github.GHMarketplaceAccountType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMarketplaceAccountType ORGANIZATION`
- `public final static org.kohsuke.github.GHMarketplaceAccountType USER`

---

## public class `org.kohsuke.github.GHMarketplaceListAccountBuilder`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Methods:**
- `public org.kohsuke.github.PagedIterable createRequest() throws java.io.IOException`
- `public org.kohsuke.github.GHMarketplaceListAccountBuilder direction(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHMarketplaceListAccountBuilder sort(org.kohsuke.github.GHMarketplaceListAccountBuilder$Sort p0)`

---

## public final static enum `org.kohsuke.github.GHMarketplaceListAccountBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMarketplaceListAccountBuilder$Sort CREATED`
- `public final static org.kohsuke.github.GHMarketplaceListAccountBuilder$Sort UPDATED`

---

## public class `org.kohsuke.github.GHMarketplacePendingChange`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMarketplacePendingChange()`

**Methods:**
- `public java.util.Date getEffectiveDate()`
- `public long getId()`
- `public org.kohsuke.github.GHMarketplacePlan getPlan()`
- `public java.lang.Long getUnitCount()`

---

## public class `org.kohsuke.github.GHMarketplacePlan`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMarketplacePlan()`

**Methods:**
- `public java.lang.String getAccountsUrl()`
- `public java.util.List getBullets()`
- `public java.lang.String getDescription()`
- `public long getId()`
- `public long getMonthlyPriceInCents()`
- `public java.lang.String getName()`
- `public long getNumber()`
- `public org.kohsuke.github.GHMarketplacePriceModel getPriceModel()`
- `public java.lang.String getState()`
- `public java.lang.String getUnitName()`
- `public java.net.URL getUrl()`
- `public long getYearlyPriceInCents()`
- `public boolean isFreeTrial()`
- `public org.kohsuke.github.GHMarketplaceListAccountBuilder listAccounts()`

---

## public final enum `org.kohsuke.github.GHMarketplacePriceModel`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMarketplacePriceModel FLAT_RATE`
- `public final static org.kohsuke.github.GHMarketplacePriceModel FREE`
- `public final static org.kohsuke.github.GHMarketplacePriceModel PER_UNIT`

**Methods:**
- `public java.lang.String symbol()`

---

## public class `org.kohsuke.github.GHMarketplacePurchase`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMarketplacePurchase()`

**Methods:**
- `public java.lang.String getBillingCycle()`
- `public java.util.Date getFreeTrialEndsOn()`
- `public java.util.Date getNextBillingDate()`
- `public org.kohsuke.github.GHMarketplacePlan getPlan()`
- `public java.lang.Long getUnitCount()`
- `public java.util.Date getUpdatedAt()`
- `public boolean isOnFreeTrial()`

---

## public class `org.kohsuke.github.GHMarketplaceUserPurchase`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMarketplaceUserPurchase()`

**Methods:**
- `public org.kohsuke.github.GHMarketplaceAccount getAccount()`
- `public java.lang.String getBillingCycle()`
- `public java.util.Date getFreeTrialEndsOn()`
- `public java.util.Date getNextBillingDate()`
- `public org.kohsuke.github.GHMarketplacePlan getPlan()`
- `public java.lang.Long getUnitCount()`
- `public java.util.Date getUpdatedAt()`
- `public boolean isOnFreeTrial()`

---

## public class `org.kohsuke.github.GHMembership`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHMembership()`

**Methods:**
- `public void activate() throws java.io.IOException`
- `public org.kohsuke.github.GHOrganization getOrganization()`
- `public org.kohsuke.github.GHMembership$Role getRole()`
- `public org.kohsuke.github.GHMembership$State getState()`
- `public java.net.URL getUrl()`
- `public org.kohsuke.github.GHUser getUser()`

---

## public final static enum `org.kohsuke.github.GHMembership$Role`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMembership$Role ADMIN`
- `public final static org.kohsuke.github.GHMembership$Role MEMBER`

---

## public final static enum `org.kohsuke.github.GHMembership$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMembership$State ACTIVE`
- `public final static org.kohsuke.github.GHMembership$State PENDING`

---

## public class `org.kohsuke.github.GHMeta`

**Constructors:**
- `public GHMeta()`

**Methods:**
- `public java.util.List getActions()`
- `public java.util.List getApi()`
- `public java.util.List getDependabot()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPackages()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`

---

## public class `org.kohsuke.github.GHMilestone`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHMilestone()`

**Fields:**
- `protected java.lang.String closed_at`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public java.util.Date getClosedAt() throws java.io.IOException`
- `public int getClosedIssues()`
- `public org.kohsuke.github.GHUser getCreator() throws java.io.IOException`
- `public java.lang.String getDescription()`
- `public java.util.Date getDueOn()`
- `public java.net.URL getHtmlUrl()`
- `public int getNumber()`
- `public int getOpenIssues()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public org.kohsuke.github.GHMilestoneState getState()`
- `public java.lang.String getTitle()`
- `public void reopen() throws java.io.IOException`
- `public void setDescription(java.lang.String p0) throws java.io.IOException`
- `public void setDueOn(java.util.Date p0) throws java.io.IOException`
- `public void setTitle(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHMilestone wrap(org.kohsuke.github.GHRepository p0)`

---

## public final enum `org.kohsuke.github.GHMilestoneState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMilestoneState CLOSED`
- `public final static org.kohsuke.github.GHMilestoneState OPEN`

---

## public class `org.kohsuke.github.GHMyself`
extends `org.kohsuke.github.GHUser`  

**Constructors:**
- `public GHMyself()`

**Methods:**
- `public org.kohsuke.github.GHPersonSet getAllOrganizations() throws java.io.IOException`
- `public synchronized java.util.Map getAllRepositories() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getAppInstallations()`
- `public java.util.List getEmails() throws java.io.IOException`
- `public java.util.List getEmails2() throws java.io.IOException`
- `public org.kohsuke.github.GHMembership getMembership(org.kohsuke.github.GHOrganization p0) throws java.io.IOException`
- `public java.util.List getPublicKeys() throws java.io.IOException`
- `public java.util.List getPublicVerifiedKeys() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listAllRepositories()`
- `public org.kohsuke.github.PagedIterable listOrgMemberships()`
- `public org.kohsuke.github.PagedIterable listOrgMemberships(org.kohsuke.github.GHMembership$State p0)`
- `public org.kohsuke.github.PagedIterable listRepositories()`
- `public org.kohsuke.github.PagedIterable listRepositories(int p0)`
- `public org.kohsuke.github.PagedIterable listRepositories(int p0, org.kohsuke.github.GHMyself$RepositoryListFilter p1)`

---

## public final static enum `org.kohsuke.github.GHMyself$RepositoryListFilter`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHMyself$RepositoryListFilter ALL`
- `public final static org.kohsuke.github.GHMyself$RepositoryListFilter MEMBER`
- `public final static org.kohsuke.github.GHMyself$RepositoryListFilter OWNER`
- `public final static org.kohsuke.github.GHMyself$RepositoryListFilter PRIVATE`
- `public final static org.kohsuke.github.GHMyself$RepositoryListFilter PUBLIC`

---

## public class `org.kohsuke.github.GHNotificationStream`
extends `org.kohsuke.github.GitHubInteractiveObject`  
implements `java.lang.Iterable<org.kohsuke.github.GHThread>`  

**Methods:**
- `public java.util.Iterator iterator()`
- `public void markAsRead() throws java.io.IOException`
- `public void markAsRead(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHNotificationStream nonBlocking(boolean p0)`
- `public org.kohsuke.github.GHNotificationStream participating(boolean p0)`
- `public org.kohsuke.github.GHNotificationStream read(boolean p0)`
- `public org.kohsuke.github.GHNotificationStream since(java.util.Date p0)`
- `public org.kohsuke.github.GHNotificationStream since(long p0)`

---

## public class `org.kohsuke.github.GHOTPRequiredException`
extends `org.kohsuke.github.GHIOException`  

**Constructors:**
- `public GHOTPRequiredException()`

---

## public abstract class `org.kohsuke.github.GHObject`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded, @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Fields:**
- `protected transient java.util.Map responseHeaderFields`

**Methods:**
- `public java.util.Date getCreatedAt() throws java.io.IOException`
- `public abstract java.net.URL getHtmlUrl() throws java.io.IOException`
- `public long getId()`
- `public java.lang.String getNodeId()`
- `public java.util.Map getResponseHeaderFields()`
- `public java.util.Date getUpdatedAt() throws java.io.IOException`
- `public java.net.URL getUrl()`
- `protected void setResponseHeaderFields(org.kohsuke.github.connector.GitHubConnectorResponse p0)`
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHOrganization`
extends `org.kohsuke.github.GHPerson`  

**Constructors:**
- `public GHOrganization()`

**Methods:**
- `public void add(org.kohsuke.github.GHUser p0, org.kohsuke.github.GHOrganization$Role p1) throws java.io.IOException`
- `public boolean areOrganizationProjectsEnabled()`
- `public void conceal(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public org.kohsuke.github.GHHook createHook(java.lang.String p0, java.util.Map p1, java.util.Collection p2, boolean p3) throws java.io.IOException`
- `public org.kohsuke.github.GHProject createProject(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder createRepository(java.lang.String p0)`
- `public org.kohsuke.github.GHRepository createRepository(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository createRepository(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.kohsuke.github.GHTeam p3, boolean p4) throws java.io.IOException`
- `public org.kohsuke.github.GHTeamBuilder createTeam(java.lang.String p0)`
- `public org.kohsuke.github.GHTeam createTeam(java.lang.String p0, java.util.Collection p1) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam createTeam(java.lang.String p0, org.kohsuke.github.GHOrganization$Permission p1, java.util.Collection p2) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam createTeam(java.lang.String p0, org.kohsuke.github.GHOrganization$Permission p1, org.kohsuke.github.GHRepository... p2) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam createTeam(java.lang.String p0, org.kohsuke.github.GHRepository... p1) throws java.io.IOException`
- `public org.kohsuke.github.GHHook createWebHook(java.net.URL p0) throws java.io.IOException`
- `public org.kohsuke.github.GHHook createWebHook(java.net.URL p0, java.util.Collection p1) throws java.io.IOException`
- `public void deleteHook(int p0) throws java.io.IOException`
- `public void enableOrganizationProjects(boolean p0) throws java.io.IOException`
- `public org.kohsuke.github.GHHook getHook(int p0) throws java.io.IOException`
- `public java.util.List getHooks() throws java.io.IOException`
- `public java.util.List getMembers() throws java.io.IOException`
- `public java.util.List getPullRequests() throws java.io.IOException`
- `public java.util.List getRepositoriesWithOpenPullRequests() throws java.io.IOException`
- `public org.kohsuke.github.GHTeam getTeam(int p0) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam getTeam(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam getTeamByName(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam getTeamBySlug(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map getTeams() throws java.io.IOException`
- `public boolean hasMember(org.kohsuke.github.GHUser p0)`
- `public boolean hasPublicMember(org.kohsuke.github.GHUser p0)`
- `public org.kohsuke.github.PagedIterable listEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembers() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembersWithFilter(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembersWithRole(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listProjects() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listProjects(org.kohsuke.github.GHProject$ProjectStateFilter p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listPublicMembers() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listRepositories(int p0)`
- `public org.kohsuke.github.PagedIterable listTeams() throws java.io.IOException`
- `public void publicize(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public void remove(org.kohsuke.github.GHUser p0) throws java.io.IOException`

---

## public final static enum `org.kohsuke.github.GHOrganization$Permission`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHOrganization$Permission ADMIN`
- `public final static org.kohsuke.github.GHOrganization$Permission MAINTAIN`
- `public final static org.kohsuke.github.GHOrganization$Permission PULL`
- `public final static org.kohsuke.github.GHOrganization$Permission PUSH`
- `public final static org.kohsuke.github.GHOrganization$Permission TRIAGE`

---

## public static class `org.kohsuke.github.GHOrganization$RepositoryRole`

**Methods:**
- `public static org.kohsuke.github.GHOrganization$RepositoryRole custom(java.lang.String p0)`
- `public static org.kohsuke.github.GHOrganization$RepositoryRole from(org.kohsuke.github.GHOrganization$Permission p0)`
- `public java.lang.String toString()`

---

## public final static enum `org.kohsuke.github.GHOrganization$Role`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHOrganization$Role ADMIN`
- `public final static org.kohsuke.github.GHOrganization$Role MEMBER`

---

## public final enum `org.kohsuke.github.GHPermissionType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHPermissionType ADMIN`
- `public final static org.kohsuke.github.GHPermissionType NONE`
- `public final static org.kohsuke.github.GHPermissionType READ`
- `public final static org.kohsuke.github.GHPermissionType WRITE`

---

## public abstract class `org.kohsuke.github.GHPerson`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHPerson()`

**Fields:**
- `protected java.lang.String avatar_url`
- `protected java.lang.String bio`
- `protected java.lang.String blog`
- `protected java.lang.String company`
- `protected java.lang.String email`
- `protected int followers`
- `protected int following`
- `protected boolean hireable`
- `protected java.lang.String html_url`
- `protected java.lang.String location`
- `protected java.lang.String login`
- `protected java.lang.String name`
- `protected int public_gists`
- `protected int public_repos`
- `protected boolean site_admin`
- `protected java.lang.Integer total_private_repos`
- `protected java.lang.String twitter_username`
- `protected java.lang.String type`

**Methods:**
- `public java.lang.String getAvatarUrl()`
- `public java.lang.String getBlog() throws java.io.IOException`
- `public java.lang.String getCompany() throws java.io.IOException`
- `public java.util.Date getCreatedAt() throws java.io.IOException`
- `public java.lang.String getEmail() throws java.io.IOException`
- `public int getFollowersCount() throws java.io.IOException`
- `public int getFollowingCount() throws java.io.IOException`
- `public java.lang.String getGravatarId()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getLocation() throws java.io.IOException`
- `public java.lang.String getLogin()`
- `public java.lang.String getName() throws java.io.IOException`
- `public int getPublicGistCount() throws java.io.IOException`
- `public int getPublicRepoCount() throws java.io.IOException`
- `public synchronized java.util.Map getRepositories() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepository(java.lang.String p0) throws java.io.IOException`
- `public java.util.Optional getTotalPrivateRepoCount() throws java.io.IOException`
- `public java.lang.String getTwitterUsername() throws java.io.IOException`
- `public java.lang.String getType() throws java.io.IOException`
- `public java.util.Date getUpdatedAt() throws java.io.IOException`
- `public boolean isSiteAdmin() throws java.io.IOException`
- `public synchronized java.lang.Iterable iterateRepositories(int p0)`
- `public abstract org.kohsuke.github.PagedIterable listEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listRepositories()`
- `public org.kohsuke.github.PagedIterable listRepositories(int p0)`
- `protected synchronized void populate() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHPersonSet`<T extends org.kohsuke.github.GHPerson>
extends `java.util.HashSet`  

**Constructors:**
- `public GHPersonSet()`
- `public GHPersonSet(T... p0)`
- `public GHPersonSet(int p0)`
- `public GHPersonSet(int p0, float p1)`
- `public GHPersonSet(java.util.Collection p0)`

**Methods:**
- `public T byLogin(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHProject`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHProject()`

**Fields:**
- `protected org.kohsuke.github.GHObject owner`

**Methods:**
- `public org.kohsuke.github.GHProjectColumn createColumn(java.lang.String p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public java.lang.String getBody()`
- `public org.kohsuke.github.GHUser getCreator()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getName()`
- `public java.lang.String getNode_id()`
- `public int getNumber()`
- `public org.kohsuke.github.GHObject getOwner() throws java.io.IOException`
- `public java.net.URL getOwnerUrl()`
- `public org.kohsuke.github.GHProject$ProjectState getState()`
- `public org.kohsuke.github.PagedIterable listColumns() throws java.io.IOException`
- `public void setBody(java.lang.String p0) throws java.io.IOException`
- `public void setName(java.lang.String p0) throws java.io.IOException`
- `public void setOrganizationPermission(org.kohsuke.github.GHPermissionType p0) throws java.io.IOException`
- `public void setPublic(boolean p0) throws java.io.IOException`
- `public void setState(org.kohsuke.github.GHProject$ProjectState p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProject wrap(org.kohsuke.github.GHRepository p0)`
- `public org.kohsuke.github.GHProject wrap(org.kohsuke.github.GitHub p0)`

---

## public final static enum `org.kohsuke.github.GHProject$ProjectState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHProject$ProjectState CLOSED`
- `public final static org.kohsuke.github.GHProject$ProjectState OPEN`

---

## public final static enum `org.kohsuke.github.GHProject$ProjectStateFilter`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHProject$ProjectStateFilter ALL`
- `public final static org.kohsuke.github.GHProject$ProjectStateFilter CLOSED`
- `public final static org.kohsuke.github.GHProject$ProjectStateFilter OPEN`

---

## public class `org.kohsuke.github.GHProjectCard`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHProjectCard()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public org.kohsuke.github.GHProjectColumn getColumn() throws java.io.IOException`
- `public java.net.URL getColumnUrl()`
- `public org.kohsuke.github.GHIssue getContent() throws java.io.IOException`
- `public java.net.URL getContentUrl()`
- `public org.kohsuke.github.GHUser getCreator()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getNote()`
- `public org.kohsuke.github.GHProject getProject() throws java.io.IOException`
- `public java.net.URL getProjectUrl()`
- `public boolean isArchived()`
- `public void setArchived(boolean p0) throws java.io.IOException`
- `public void setNote(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProjectCard wrap(org.kohsuke.github.GHProjectColumn p0)`
- `public org.kohsuke.github.GHProjectCard wrap(org.kohsuke.github.GitHub p0)`

---

## public class `org.kohsuke.github.GHProjectColumn`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHProjectColumn()`

**Fields:**
- `protected org.kohsuke.github.GHProject project`

**Methods:**
- `public org.kohsuke.github.GHProjectCard createCard(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProjectCard createCard(org.kohsuke.github.GHIssue p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHProject getProject() throws java.io.IOException`
- `public java.net.URL getProjectUrl()`
- `public org.kohsuke.github.PagedIterable listCards() throws java.io.IOException`
- `public void setName(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProjectColumn wrap(org.kohsuke.github.GHProject p0)`
- `public org.kohsuke.github.GHProjectColumn wrap(org.kohsuke.github.GitHub p0)`

---

## public class `org.kohsuke.github.GHProjectsV2Item`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHProjectsV2Item()`

**Methods:**
- `public java.util.Date getArchivedAt()`
- `public java.lang.String getContentNodeId()`
- `public org.kohsuke.github.GHProjectsV2Item$ContentType getContentType()`
- `public org.kohsuke.github.GHUser getCreator() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getProjectNodeId()`

---

## public final static enum `org.kohsuke.github.GHProjectsV2Item$ContentType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHProjectsV2Item$ContentType DRAFTISSUE`
- `public final static org.kohsuke.github.GHProjectsV2Item$ContentType ISSUE`
- `public final static org.kohsuke.github.GHProjectsV2Item$ContentType PULLREQUEST`
- `public final static org.kohsuke.github.GHProjectsV2Item$ContentType UNKNOWN`

---

## public class `org.kohsuke.github.GHProjectsV2ItemChanges`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHProjectsV2ItemChanges()`

**Methods:**
- `public org.kohsuke.github.GHProjectsV2ItemChanges$FromToDate getArchivedAt()`
- `public org.kohsuke.github.GHProjectsV2ItemChanges$FieldValue getFieldValue()`
- `public org.kohsuke.github.GHProjectsV2ItemChanges$FromTo getPreviousProjectsV2ItemNodeId()`

---

## public final static enum `org.kohsuke.github.GHProjectsV2ItemChanges$FieldType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType DATE`
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType ITERATION`
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType NUMBER`
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType SINGLE_SELECT`
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType TEXT`
- `public final static org.kohsuke.github.GHProjectsV2ItemChanges$FieldType UNKNOWN`

---

## public static class `org.kohsuke.github.GHProjectsV2ItemChanges$FieldValue`

**Constructors:**
- `public FieldValue()`

**Methods:**
- `public java.lang.String getFieldNodeId()`
- `public org.kohsuke.github.GHProjectsV2ItemChanges$FieldType getFieldType()`

---

## public static class `org.kohsuke.github.GHProjectsV2ItemChanges$FromTo`

**Constructors:**
- `public FromTo()`

**Methods:**
- `public java.lang.String getFrom()`
- `public java.lang.String getTo()`

---

## public static class `org.kohsuke.github.GHProjectsV2ItemChanges$FromToDate`

**Constructors:**
- `public FromToDate()`

**Methods:**
- `public java.util.Date getFrom()`
- `public java.util.Date getTo()`

---

## public class `org.kohsuke.github.GHPullRequest`
extends `org.kohsuke.github.GHIssue`  
implements `org.kohsuke.github.Refreshable`  

**Constructors:**
- `public GHPullRequest()`

**Methods:**
- `public boolean canMaintainerModify() throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequestReviewBuilder createReview()`
- `public org.kohsuke.github.GHPullRequestReview createReview(java.lang.String p0, org.kohsuke.github.GHPullRequestReviewState p1, java.util.List p2) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequestReview createReview(java.lang.String p0, org.kohsuke.github.GHPullRequestReviewState p1, org.kohsuke.github.GHPullRequestReviewComment... p2) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequestReviewComment createReviewComment(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) throws java.io.IOException`
- `public int getAdditions() throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public org.kohsuke.github.GHPullRequest$AutoMerge getAutoMerge()`
- `public org.kohsuke.github.GHCommitPointer getBase()`
- `public int getChangedFiles() throws java.io.IOException`
- `public org.kohsuke.github.GHUser getClosedBy()`
- `public int getCommits() throws java.io.IOException`
- `public int getDeletions() throws java.io.IOException`
- `public java.net.URL getDiffUrl()`
- `public org.kohsuke.github.GHCommitPointer getHead()`
- `public java.util.Date getIssueUpdatedAt() throws java.io.IOException`
- `public java.net.URL getIssueUrl()`
- `public java.lang.String getMergeCommitSha() throws java.io.IOException`
- `public java.lang.Boolean getMergeable() throws java.io.IOException`
- `public java.lang.String getMergeableState() throws java.io.IOException`
- `public java.util.Date getMergedAt()`
- `public org.kohsuke.github.GHUser getMergedBy() throws java.io.IOException`
- `public java.net.URL getPatchUrl()`
- `public org.kohsuke.github.GHIssue$PullRequest getPullRequest()`
- `public java.util.List getRequestedReviewers() throws java.io.IOException`
- `public java.util.List getRequestedTeams() throws java.io.IOException`
- `public int getReviewComments() throws java.io.IOException`
- `public boolean isDraft() throws java.io.IOException`
- `public boolean isMerged() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listCommits()`
- `public org.kohsuke.github.PagedIterable listFiles()`
- `public org.kohsuke.github.PagedIterable listReviewComments() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReviews()`
- `public void merge(java.lang.String p0) throws java.io.IOException`
- `public void merge(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public void merge(java.lang.String p0, java.lang.String p1, org.kohsuke.github.GHPullRequest$MergeMethod p2) throws java.io.IOException`
- `public void refresh() throws java.io.IOException`
- `public void requestReviewers(java.util.List p0) throws java.io.IOException`
- `public void requestTeamReviewers(java.util.List p0) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest setBaseBranch(java.lang.String p0) throws java.io.IOException`
- `public void updateBranch() throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHPullRequest$AutoMerge`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public AutoMerge()`

**Methods:**
- `public java.lang.String getCommitMessage()`
- `public java.lang.String getCommitTitle()`
- `public org.kohsuke.github.GHUser getEnabledBy()`
- `public org.kohsuke.github.GHPullRequest$MergeMethod getMergeMethod()`

---

## public final static enum `org.kohsuke.github.GHPullRequest$MergeMethod`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHPullRequest$MergeMethod MERGE`
- `public final static org.kohsuke.github.GHPullRequest$MergeMethod REBASE`
- `public final static org.kohsuke.github.GHPullRequest$MergeMethod SQUASH`

---

## public class `org.kohsuke.github.GHPullRequestChanges`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHPullRequestChanges()`

**Methods:**
- `public org.kohsuke.github.GHPullRequestChanges$GHCommitPointer getBase()`
- `public org.kohsuke.github.GHPullRequestChanges$GHFrom getBody()`
- `public org.kohsuke.github.GHPullRequestChanges$GHFrom getTitle()`

---

## public static class `org.kohsuke.github.GHPullRequestChanges$GHCommitPointer`

**Constructors:**
- `public GHCommitPointer()`

**Methods:**
- `public org.kohsuke.github.GHPullRequestChanges$GHFrom getRef()`
- `public org.kohsuke.github.GHPullRequestChanges$GHFrom getSha()`

---

## public static class `org.kohsuke.github.GHPullRequestChanges$GHFrom`

**Constructors:**
- `public GHFrom()`

**Methods:**
- `public java.lang.String getFrom()`

---

## public class `org.kohsuke.github.GHPullRequestCommitDetail`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHPullRequestCommitDetail()`

**Methods:**
- `public java.net.URL getApiUrl()`
- `public java.net.URL getCommentsUrl()`
- `public org.kohsuke.github.GHPullRequestCommitDetail$Commit getCommit()`
- `public org.kohsuke.github.GHPullRequestCommitDetail$CommitPointer[] getParents()`
- `public java.lang.String getSha()`
- `public java.net.URL getUrl()`

---

## public static class `org.kohsuke.github.GHPullRequestCommitDetail$Authorship`
extends `org.kohsuke.github.GitUser`  

**Constructors:**
- `public Authorship()`

---

## public static class `org.kohsuke.github.GHPullRequestCommitDetail$Commit`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  

**Constructors:**
- `public Commit()`

**Methods:**
- `public org.kohsuke.github.GitUser getAuthor()`
- `public int getComment_count()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getMessage()`
- `public org.kohsuke.github.GHPullRequestCommitDetail$Tree getTree()`
- `public java.net.URL getUrl()`

---

## public static class `org.kohsuke.github.GHPullRequestCommitDetail$CommitPointer`

**Constructors:**
- `public CommitPointer()`

**Methods:**
- `public java.net.URL getHtml_url()`
- `public java.lang.String getSha()`
- `public java.net.URL getUrl()`

---

## public static class `org.kohsuke.github.GHPullRequestCommitDetail$Tree`

**Constructors:**
- `public Tree()`

**Methods:**
- `public java.lang.String getSha()`
- `public java.net.URL getUrl()`

---

## public class `org.kohsuke.github.GHPullRequestFileDetail`

**Constructors:**
- `public GHPullRequestFileDetail()`

**Methods:**
- `public int getAdditions()`
- `public java.net.URL getBlobUrl()`
- `public int getChanges()`
- `public java.net.URL getContentsUrl()`
- `public int getDeletions()`
- `public java.lang.String getFilename()`
- `public java.lang.String getPatch()`
- `public java.lang.String getPreviousFilename()`
- `public java.net.URL getRawUrl()`
- `public java.lang.String getSha()`
- `public java.lang.String getStatus()`

---

## public class `org.kohsuke.github.GHPullRequestQueryBuilder`
extends `org.kohsuke.github.GHQueryBuilder`  

**Methods:**
- `public org.kohsuke.github.GHPullRequestQueryBuilder base(java.lang.String p0)`
- `public org.kohsuke.github.GHPullRequestQueryBuilder direction(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHPullRequestQueryBuilder head(java.lang.String p0)`
- `public org.kohsuke.github.PagedIterable list()`
- `public org.kohsuke.github.GHPullRequestQueryBuilder sort(org.kohsuke.github.GHPullRequestQueryBuilder$Sort p0)`
- `public org.kohsuke.github.GHPullRequestQueryBuilder state(org.kohsuke.github.GHIssueState p0)`

---

## public final static enum `org.kohsuke.github.GHPullRequestQueryBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHPullRequestQueryBuilder$Sort CREATED`
- `public final static org.kohsuke.github.GHPullRequestQueryBuilder$Sort LONG_RUNNING`
- `public final static org.kohsuke.github.GHPullRequestQueryBuilder$Sort POPULARITY`
- `public final static org.kohsuke.github.GHPullRequestQueryBuilder$Sort UPDATED`

---

## public class `org.kohsuke.github.GHPullRequestReview`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHPullRequestReview()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public void dismiss(java.lang.String p0) throws java.io.IOException`
- `protected java.lang.String getApiRoute()`
- `public java.lang.String getBody()`
- `public java.lang.String getCommitId()`
- `public java.util.Date getCreatedAt() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHPullRequest getParent()`
- `public org.kohsuke.github.GHPullRequestReviewState getState()`
- `public java.util.Date getSubmittedAt() throws java.io.IOException`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReviewComments() throws java.io.IOException`
- `public void submit(java.lang.String p0, org.kohsuke.github.GHPullRequestReviewEvent p1) throws java.io.IOException`
- `public void submit(java.lang.String p0, org.kohsuke.github.GHPullRequestReviewState p1) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHPullRequestReviewBuilder`

**Methods:**
- `public org.kohsuke.github.GHPullRequestReviewBuilder body(java.lang.String p0)`
- `public org.kohsuke.github.GHPullRequestReviewBuilder comment(java.lang.String p0, java.lang.String p1, int p2)`
- `public org.kohsuke.github.GHPullRequestReviewBuilder commitId(java.lang.String p0)`
- `public org.kohsuke.github.GHPullRequestReview create() throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequestReviewBuilder event(org.kohsuke.github.GHPullRequestReviewEvent p0)`

---

## public class `org.kohsuke.github.GHPullRequestReviewComment`
extends `org.kohsuke.github.GHObject`  
implements `org.kohsuke.github.Reactable`  

**Constructors:**
- `public GHPullRequestReviewComment()`

**Methods:**
- `public org.kohsuke.github.GHReaction createReaction(org.kohsuke.github.ReactionContent p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public void deleteReaction(org.kohsuke.github.GHReaction p0) throws java.io.IOException`
- `public static org.kohsuke.github.GHPullRequestReviewComment draft(java.lang.String p0, java.lang.String p1, int p2)`
- `protected java.lang.String getApiRoute()`
- `protected java.lang.String getApiRoute(boolean p0)`
- `public org.kohsuke.github.GHCommentAuthorAssociation getAuthorAssociation()`
- `public java.lang.String getBody()`
- `public java.lang.String getCommitId()`
- `public java.lang.String getDiffHunk()`
- `public java.net.URL getHtmlUrl()`
- `public long getInReplyToId()`
- `public java.lang.String getOriginalCommitId()`
- `public int getOriginalPosition()`
- `public org.kohsuke.github.GHPullRequest getParent()`
- `public java.lang.String getPath()`
- `public int getPosition()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReactions()`
- `public org.kohsuke.github.GHPullRequestReviewComment reply(java.lang.String p0) throws java.io.IOException`
- `public void update(java.lang.String p0) throws java.io.IOException`

---

## public final enum `org.kohsuke.github.GHPullRequestReviewEvent`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHPullRequestReviewEvent APPROVE`
- `public final static org.kohsuke.github.GHPullRequestReviewEvent COMMENT`
- `public final static org.kohsuke.github.GHPullRequestReviewEvent PENDING`
- `public final static org.kohsuke.github.GHPullRequestReviewEvent REQUEST_CHANGES`

---

## public final enum `org.kohsuke.github.GHPullRequestReviewState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHPullRequestReviewState APPROVED`
- `public final static org.kohsuke.github.GHPullRequestReviewState CHANGES_REQUESTED`
- `public final static org.kohsuke.github.GHPullRequestReviewState COMMENTED`
- `public final static org.kohsuke.github.GHPullRequestReviewState DISMISSED`
- `public final static org.kohsuke.github.GHPullRequestReviewState PENDING`
- `public final static org.kohsuke.github.GHPullRequestReviewState REQUEST_CHANGES`

**Methods:**
- `public java.lang.String action()`

---

## public abstract class `org.kohsuke.github.GHQueryBuilder`<T extends java.lang.Object>
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Fields:**
- `protected final org.kohsuke.github.Requester req`

**Methods:**
- `public abstract org.kohsuke.github.PagedIterable list()`

---

## public class `org.kohsuke.github.GHRateLimit`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Fields:**
- `public int limit`
- `public int remaining`
- `public java.util.Date reset`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.kohsuke.github.GHRateLimit$Record getCore()`
- `public org.kohsuke.github.GHRateLimit$Record getGraphQL()`
- `public org.kohsuke.github.GHRateLimit$Record getIntegrationManifest()`
- `public int getLimit()`
- `public int getRemaining()`
- `public java.util.Date getResetDate()`
- `public long getResetEpochSeconds()`
- `public org.kohsuke.github.GHRateLimit$Record getSearch()`
- `public int hashCode()`
- `public boolean isExpired()`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHRateLimit$Record`

**Constructors:**
- `public Record(int p0, int p1, long p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int getLimit()`
- `public int getRemaining()`
- `public java.util.Date getResetDate()`
- `public long getResetEpochSeconds()`
- `public int hashCode()`
- `public boolean isExpired()`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHRateLimit$UnknownLimitRecord`
extends `org.kohsuke.github.GHRateLimit$Record`  

---

## public class `org.kohsuke.github.GHReaction`
annotations: @org.kohsuke.github.Preview  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHReaction()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public org.kohsuke.github.ReactionContent getContent()`
- `public java.net.URL getHtmlUrl()`
- `public org.kohsuke.github.GHUser getUser()`

---

## public class `org.kohsuke.github.GHRef`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHRef()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public org.kohsuke.github.GHRef$GHObject getObject()`
- `public java.lang.String getRef()`
- `public java.net.URL getUrl()`
- `public void updateTo(java.lang.String p0) throws java.io.IOException`
- `public void updateTo(java.lang.String p0, java.lang.Boolean p1) throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHRef$GHObject`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHObject()`

**Methods:**
- `public java.lang.String getSha()`
- `public java.lang.String getType()`
- `public java.net.URL getUrl()`

---

## public class `org.kohsuke.github.GHRelease`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHRelease()`

**Methods:**
- `public java.util.List assets()`
- `public void delete() throws java.io.IOException`
- `public java.util.List getAssets() throws java.io.IOException`
- `public java.lang.String getAssetsUrl()`
- `public java.lang.String getBody()`
- `public java.lang.String getDiscussionUrl()`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.util.Date getPublished_at()`
- `public java.lang.String getTagName()`
- `public java.lang.String getTarballUrl()`
- `public java.lang.String getTargetCommitish()`
- `public java.lang.String getUploadUrl()`
- `public java.lang.String getZipballUrl()`
- `public boolean isDraft()`
- `public boolean isPrerelease()`
- `public org.kohsuke.github.PagedIterable listAssets() throws java.io.IOException`
- `public org.kohsuke.github.GHRelease setDraft(boolean p0) throws java.io.IOException`
- `public void setName(java.lang.String p0)`
- `public void setOwner(org.kohsuke.github.GHRepository p0)`
- `public org.kohsuke.github.GHReleaseUpdater update()`
- `public org.kohsuke.github.GHAsset uploadAsset(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHAsset uploadAsset(java.lang.String p0, java.io.InputStream p1, java.lang.String p2) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHReleaseBuilder`

**Constructors:**
- `public GHReleaseBuilder(org.kohsuke.github.GHRepository p0, java.lang.String p1)`

**Methods:**
- `public org.kohsuke.github.GHReleaseBuilder body(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseBuilder categoryName(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseBuilder commitish(java.lang.String p0)`
- `public org.kohsuke.github.GHRelease create() throws java.io.IOException`
- `public org.kohsuke.github.GHReleaseBuilder draft(boolean p0)`
- `public org.kohsuke.github.GHReleaseBuilder name(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseBuilder prerelease(boolean p0)`

---

## public class `org.kohsuke.github.GHReleaseUpdater`

**Methods:**
- `public org.kohsuke.github.GHReleaseUpdater body(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseUpdater categoryName(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseUpdater commitish(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseUpdater draft(boolean p0)`
- `public org.kohsuke.github.GHReleaseUpdater name(java.lang.String p0)`
- `public org.kohsuke.github.GHReleaseUpdater prerelease(boolean p0)`
- `public org.kohsuke.github.GHReleaseUpdater tag(java.lang.String p0)`
- `public org.kohsuke.github.GHRelease update() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHRepository`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded, @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHRepository()`

**Methods:**
- `public void addCollaborators(java.util.Collection p0) throws java.io.IOException`
- `public void addCollaborators(java.util.Collection p0, org.kohsuke.github.GHOrganization$Permission p1) throws java.io.IOException`
- `public void addCollaborators(java.util.Collection p0, org.kohsuke.github.GHOrganization$RepositoryRole p1) throws java.io.IOException`
- `public void addCollaborators(org.kohsuke.github.GHOrganization$Permission p0, org.kohsuke.github.GHUser... p1) throws java.io.IOException`
- `public void addCollaborators(org.kohsuke.github.GHOrganization$RepositoryRole p0, org.kohsuke.github.GHUser... p1) throws java.io.IOException`
- `public void addCollaborators(org.kohsuke.github.GHUser... p0) throws java.io.IOException`
- `public org.kohsuke.github.GHDeployKey addDeployKey(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public void allowMergeCommit(boolean p0) throws java.io.IOException`
- `public void allowRebaseMerge(boolean p0) throws java.io.IOException`
- `public void allowSquashMerge(boolean p0) throws java.io.IOException`
- `public void archive() throws java.io.IOException`
- `public org.kohsuke.github.GHBlobBuilder createBlob()`
- `public org.kohsuke.github.GHCheckRunBuilder createCheckRun(java.lang.String p0, java.lang.String p1)`
- `public org.kohsuke.github.GHCommitBuilder createCommit()`
- `public org.kohsuke.github.GHCommitStatus createCommitStatus(java.lang.String p0, org.kohsuke.github.GHCommitState p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public org.kohsuke.github.GHCommitStatus createCommitStatus(java.lang.String p0, org.kohsuke.github.GHCommitState p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws java.io.IOException`
- `public org.kohsuke.github.GHContentBuilder createContent()`
- `public org.kohsuke.github.GHContentUpdateResponse createContent(byte[] p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse createContent(byte[] p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse createContent(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHContentUpdateResponse createContent(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public org.kohsuke.github.GHDeploymentStatusBuilder createDeployStatus(int p0, org.kohsuke.github.GHDeploymentState p1) throws java.io.IOException`
- `public org.kohsuke.github.GHDeploymentBuilder createDeployment(java.lang.String p0)`
- `public org.kohsuke.github.GHHook createHook(java.lang.String p0, java.util.Map p1, java.util.Collection p2, boolean p3) throws java.io.IOException`
- `public org.kohsuke.github.GHIssueBuilder createIssue(java.lang.String p0)`
- `public org.kohsuke.github.GHLabel createLabel(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHLabel createLabel(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHMilestone createMilestone(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHProject createProject(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest createPullRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest createPullRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest createPullRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5) throws java.io.IOException`
- `public org.kohsuke.github.GHRef createRef(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHReleaseBuilder createRelease(java.lang.String p0)`
- `public void createSecret(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHTagObject createTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public org.kohsuke.github.GHTreeBuilder createTree()`
- `public org.kohsuke.github.GHHook createWebHook(java.net.URL p0) throws java.io.IOException`
- `public org.kohsuke.github.GHHook createWebHook(java.net.URL p0, java.util.Collection p1) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public void deleteBranchOnMerge(boolean p0) throws java.io.IOException`
- `public void deleteHook(int p0) throws java.io.IOException`
- `public <T extends java.lang.Object> void dispatch(java.lang.String p0, T p1) throws java.io.IOException`
- `public void enableDownloads(boolean p0) throws java.io.IOException`
- `public void enableIssueTracker(boolean p0) throws java.io.IOException`
- `public void enableProjects(boolean p0) throws java.io.IOException`
- `public void enableWiki(boolean p0) throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public org.kohsuke.github.GHRepository fork() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository forkTo(org.kohsuke.github.GHOrganization p0) throws java.io.IOException`
- `public org.kohsuke.github.GHArtifact getArtifact(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHBlob getBlob(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHBranch getBranch(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map getBranches() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getCheckRuns(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRepositoryCloneTraffic getCloneTraffic() throws java.io.IOException`
- `public java.util.Set getCollaboratorNames() throws java.io.IOException`
- `public java.util.Set getCollaboratorNames(org.kohsuke.github.GHRepository$CollaboratorAffiliation p0) throws java.io.IOException`
- `public org.kohsuke.github.GHPersonSet getCollaborators() throws java.io.IOException`
- `public org.kohsuke.github.GHCommit getCommit(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHCompare getCompare(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHCompare getCompare(org.kohsuke.github.GHBranch p0, org.kohsuke.github.GHBranch p1) throws java.io.IOException`
- `public org.kohsuke.github.GHCompare getCompare(org.kohsuke.github.GHCommit p0, org.kohsuke.github.GHCommit p1) throws java.io.IOException`
- `public java.lang.String getDefaultBranch()`
- `public java.util.List getDeployKeys() throws java.io.IOException`
- `public org.kohsuke.github.GHDeployment getDeployment(long p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getDeploymentStatuses(int p0) throws java.io.IOException`
- `public java.lang.String getDescription()`
- `public java.util.List getDirectoryContent(java.lang.String p0) throws java.io.IOException`
- `public java.util.List getDirectoryContent(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHContent getFileContent(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHContent getFileContent(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public int getForks()`
- `public int getForksCount()`
- `public java.lang.String getFullName()`
- `public java.lang.String getGitTransportUrl()`
- `public java.lang.String getHomepage()`
- `public org.kohsuke.github.GHHook getHook(int p0) throws java.io.IOException`
- `public java.util.List getHooks() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getHttpTransportUrl()`
- `public org.kohsuke.github.GHIssue getIssue(int p0) throws java.io.IOException`
- `public org.kohsuke.github.GHIssueEvent getIssueEvent(long p0) throws java.io.IOException`
- `public java.util.List getIssues(org.kohsuke.github.GHIssueState p0) throws java.io.IOException`
- `public java.util.List getIssues(org.kohsuke.github.GHIssueState p0, org.kohsuke.github.GHMilestone p1) throws java.io.IOException`
- `public org.kohsuke.github.GHLabel getLabel(java.lang.String p0) throws java.io.IOException`
- `public java.lang.String getLanguage()`
- `public org.kohsuke.github.GHCommitStatus getLastCommitStatus(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRelease getLatestRelease() throws java.io.IOException`
- `public org.kohsuke.github.GHLicense getLicense() throws java.io.IOException`
- `public org.kohsuke.github.GHContent getLicenseContent() throws java.io.IOException`
- `public java.lang.String getMasterBranch()`
- `public org.kohsuke.github.GHMilestone getMilestone(int p0) throws java.io.IOException`
- `public java.util.Map getMilestones() throws java.io.IOException`
- `public java.lang.String getMirrorUrl()`
- `public java.lang.String getName()`
- `public java.lang.String getNodeId()`
- `public int getOpenIssueCount()`
- `public org.kohsuke.github.GHUser getOwner() throws java.io.IOException`
- `public java.lang.String getOwnerName()`
- `public org.kohsuke.github.GHRepository getParent() throws java.io.IOException`
- `public org.kohsuke.github.GHPermissionType getPermission(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHPermissionType getPermission(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public java.util.Set getPostCommitHooks()`
- `public org.kohsuke.github.GHRepositoryPublicKey getPublicKey() throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest getPullRequest(int p0) throws java.io.IOException`
- `public java.util.List getPullRequests(org.kohsuke.github.GHIssueState p0) throws java.io.IOException`
- `public java.util.Date getPushedAt()`
- `public org.kohsuke.github.GHContent getReadme() throws java.io.IOException`
- `public org.kohsuke.github.GHRef getRef(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRef[] getRefs() throws java.io.IOException`
- `public org.kohsuke.github.GHRef[] getRefs(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRelease getRelease(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRelease getReleaseByTagName(java.lang.String p0) throws java.io.IOException`
- `public java.util.List getReleases() throws java.io.IOException`
- `public int getSize()`
- `public org.kohsuke.github.GHRepository getSource() throws java.io.IOException`
- `public java.lang.String getSshUrl()`
- `public int getStargazersCount()`
- `public org.kohsuke.github.GHRepositoryStatistics getStatistics()`
- `public int getSubscribersCount()`
- `public org.kohsuke.github.GHSubscription getSubscription() throws java.io.IOException`
- `public java.lang.String getSvnUrl()`
- `public org.kohsuke.github.GHTagObject getTagObject(java.lang.String p0) throws java.io.IOException`
- `public java.util.Set getTeams() throws java.io.IOException`
- `public org.kohsuke.github.GHTree getTree(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHTree getTreeRecursive(java.lang.String p0, int p1) throws java.io.IOException`
- `public org.kohsuke.github.GHRepositoryViewTraffic getViewTraffic() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository$Visibility getVisibility()`
- `public int getWatchers()`
- `public int getWatchersCount()`
- `public org.kohsuke.github.GHWorkflow getWorkflow(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHWorkflow getWorkflow(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHWorkflowJob getWorkflowJob(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHWorkflowRun getWorkflowRun(long p0) throws java.io.IOException`
- `public java.lang.String gitHttpTransportUrl()`
- `public boolean hasAdminAccess()`
- `public boolean hasAssignee(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public boolean hasDownloads()`
- `public boolean hasIssues()`
- `public boolean hasPages()`
- `public boolean hasPermission(java.lang.String p0, org.kohsuke.github.GHPermissionType p1) throws java.io.IOException`
- `public boolean hasPermission(org.kohsuke.github.GHUser p0, org.kohsuke.github.GHPermissionType p1) throws java.io.IOException`
- `public boolean hasProjects()`
- `public boolean hasPullAccess()`
- `public boolean hasPushAccess()`
- `public boolean hasWiki()`
- `public int hashCode()`
- `public boolean isAllowMergeCommit()`
- `public boolean isAllowRebaseMerge()`
- `public boolean isAllowSquashMerge()`
- `public boolean isArchived()`
- `public boolean isCollaborator(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public boolean isDeleteBranchOnMerge()`
- `public boolean isDisabled()`
- `public boolean isFork()`
- `public boolean isPrivate()`
- `public boolean isTemplate()`
- `public org.kohsuke.github.PagedIterable listArtifacts()`
- `public org.kohsuke.github.PagedIterable listAssignees() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listCollaborators() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listCollaborators(org.kohsuke.github.GHRepository$CollaboratorAffiliation p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listCommitComments()`
- `public org.kohsuke.github.PagedIterable listCommitComments(java.lang.String p0)`
- `public org.kohsuke.github.PagedIterable listCommitStatuses(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listCommits()`
- `public org.kohsuke.github.PagedIterable listContributors() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listDeployments(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public org.kohsuke.github.PagedIterable listEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listForks()`
- `public org.kohsuke.github.PagedIterable listForks(org.kohsuke.github.GHRepository$ForkSort p0)`
- `public org.kohsuke.github.PagedIterable listInvitations()`
- `public org.kohsuke.github.PagedIterable listIssueEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listIssues(org.kohsuke.github.GHIssueState p0)`
- `public org.kohsuke.github.PagedIterable listLabels() throws java.io.IOException`
- `public java.util.Map listLanguages() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMilestones(org.kohsuke.github.GHIssueState p0)`
- `public org.kohsuke.github.GHNotificationStream listNotifications()`
- `public org.kohsuke.github.PagedIterable listProjects() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listProjects(org.kohsuke.github.GHProject$ProjectStateFilter p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listPullRequests(org.kohsuke.github.GHIssueState p0)`
- `public org.kohsuke.github.PagedIterable listRefs() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listRefs(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listReleases() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listStargazers()`
- `public org.kohsuke.github.PagedIterable listStargazers2()`
- `public org.kohsuke.github.PagedIterable listSubscribers()`
- `public org.kohsuke.github.PagedIterable listTags() throws java.io.IOException`
- `public java.util.List listTopics() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listWorkflows()`
- `public org.kohsuke.github.GHCommitQueryBuilder queryCommits()`
- `public org.kohsuke.github.GHIssueQueryBuilder$ForRepository queryIssues()`
- `public org.kohsuke.github.GHPullRequestQueryBuilder queryPullRequests()`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder queryWorkflowRuns()`
- `public java.io.InputStream readBlob(java.lang.String p0) throws java.io.IOException`
- `public <T extends java.lang.Object> T readTar(org.kohsuke.github.function.InputStreamFunction p0, java.lang.String p1) throws java.io.IOException`
- `public <T extends java.lang.Object> T readZip(org.kohsuke.github.function.InputStreamFunction p0, java.lang.String p1) throws java.io.IOException`
- `public void removeCollaborators(java.util.Collection p0) throws java.io.IOException`
- `public void removeCollaborators(org.kohsuke.github.GHUser... p0) throws java.io.IOException`
- `public void renameTo(java.lang.String p0) throws java.io.IOException`
- `public java.io.Reader renderMarkdown(java.lang.String p0, org.kohsuke.github.MarkdownMode p1) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository$Setter set()`
- `public void setCompareUsePaginatedCommits(boolean p0)`
- `public void setDefaultBranch(java.lang.String p0) throws java.io.IOException`
- `public void setDescription(java.lang.String p0) throws java.io.IOException`
- `public void setEmailServiceHook(java.lang.String p0) throws java.io.IOException`
- `public void setHomepage(java.lang.String p0) throws java.io.IOException`
- `public void setPrivate(boolean p0) throws java.io.IOException`
- `public void setTopics(java.util.List p0) throws java.io.IOException`
- `public void setVisibility(org.kohsuke.github.GHRepository$Visibility p0) throws java.io.IOException`
- `public org.kohsuke.github.GHSubscription subscribe(boolean p0, boolean p1) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository$Updater update()`
- `public org.kohsuke.github.GHCheckRunBuilder updateCheckRun(long p0)`

---

## public final static enum `org.kohsuke.github.GHRepository$CollaboratorAffiliation`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepository$CollaboratorAffiliation ALL`
- `public final static org.kohsuke.github.GHRepository$CollaboratorAffiliation DIRECT`
- `public final static org.kohsuke.github.GHRepository$CollaboratorAffiliation OUTSIDE`

---

## public static class `org.kohsuke.github.GHRepository$Contributor`
extends `org.kohsuke.github.GHUser`  

**Constructors:**
- `public Contributor()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int getContributions()`
- `public int hashCode()`

---

## public final static enum `org.kohsuke.github.GHRepository$ForkSort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepository$ForkSort NEWEST`
- `public final static org.kohsuke.github.GHRepository$ForkSort OLDEST`
- `public final static org.kohsuke.github.GHRepository$ForkSort STARGAZERS`

---

## public static class `org.kohsuke.github.GHRepository$Setter`
annotations: @org.kohsuke.github.BetaApi  
extends `org.kohsuke.github.GHRepositoryBuilder`  

**Constructors:**
- `protected Setter(org.kohsuke.github.GHRepository p0)`

---

## public static class `org.kohsuke.github.GHRepository$Updater`
annotations: @org.kohsuke.github.BetaApi  
extends `org.kohsuke.github.GHRepositoryBuilder`  

**Constructors:**
- `protected Updater(org.kohsuke.github.GHRepository p0)`

---

## public final static enum `org.kohsuke.github.GHRepository$Visibility`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepository$Visibility INTERNAL`
- `public final static org.kohsuke.github.GHRepository$Visibility PRIVATE`
- `public final static org.kohsuke.github.GHRepository$Visibility PUBLIC`
- `public final static org.kohsuke.github.GHRepository$Visibility UNKNOWN`

**Methods:**
- `public static org.kohsuke.github.GHRepository$Visibility from(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHRepositoryCloneTraffic`
extends `org.kohsuke.github.GHRepositoryTraffic`  

**Methods:**
- `public java.util.List getClones()`
- `public java.util.List getDailyInfo()`

---

## public static class `org.kohsuke.github.GHRepositoryCloneTraffic$DailyInfo`
extends `org.kohsuke.github.GHRepositoryTraffic$DailyInfo`  

---

## public class `org.kohsuke.github.GHRepositoryDiscussion`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHRepositoryDiscussion()`

**Methods:**
- `public java.lang.String getActiveLockReason()`
- `public java.util.Date getAnswerChosenAt()`
- `public org.kohsuke.github.GHUser getAnswerChosenBy() throws java.io.IOException`
- `public java.net.URL getAnswerHtmlUrl()`
- `public org.kohsuke.github.GHCommentAuthorAssociation getAuthorAssociation()`
- `public java.lang.String getBody()`
- `public org.kohsuke.github.GHRepositoryDiscussion$Category getCategory()`
- `public int getComments()`
- `public java.net.URL getHtmlUrl()`
- `public int getNumber()`
- `public org.kohsuke.github.GHRepositoryDiscussion$State getState()`
- `public java.lang.String getTimelineUrl()`
- `public java.lang.String getTitle()`
- `public org.kohsuke.github.GHUser getUser() throws java.io.IOException`
- `public boolean isLocked()`

---

## public static class `org.kohsuke.github.GHRepositoryDiscussion$Category`

**Constructors:**
- `public Category()`

**Methods:**
- `public java.util.Date getCreatedAt()`
- `public java.lang.String getDescription()`
- `public java.lang.String getEmoji()`
- `public long getId()`
- `public java.lang.String getName()`
- `public java.lang.String getNodeId()`
- `public long getRepositoryId()`
- `public java.lang.String getSlug()`
- `public java.util.Date getUpdatedAt()`
- `public boolean isAnswerable()`

---

## public final static enum `org.kohsuke.github.GHRepositoryDiscussion$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepositoryDiscussion$State LOCKED`
- `public final static org.kohsuke.github.GHRepositoryDiscussion$State OPEN`
- `public final static org.kohsuke.github.GHRepositoryDiscussion$State UNKNOWN`

---

## public class `org.kohsuke.github.GHRepositoryPublicKey`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHRepositoryPublicKey()`

**Methods:**
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getKey()`
- `public java.lang.String getKeyId()`

---

## public class `org.kohsuke.github.GHRepositorySearchBuilder`
extends `org.kohsuke.github.GHSearchBuilder`  

**Methods:**
- `public org.kohsuke.github.GHRepositorySearchBuilder created(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder fork(org.kohsuke.github.GHFork p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder fork(org.kohsuke.github.GHRepositorySearchBuilder$Fork p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder forks(java.lang.String p0)`
- `protected java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHRepositorySearchBuilder in(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder language(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder order(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder org(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder pushed(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder q(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder repo(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder size(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder sort(org.kohsuke.github.GHRepositorySearchBuilder$Sort p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder stars(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder topic(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder user(java.lang.String p0)`
- `public org.kohsuke.github.GHRepositorySearchBuilder visibility(org.kohsuke.github.GHRepository$Visibility p0)`

---

## public final static enum `org.kohsuke.github.GHRepositorySearchBuilder$Fork`
annotations: @java.lang.Deprecated  
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Fork FORKS_ONLY`
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Fork PARENT_AND_FORKS`
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Fork PARENT_ONLY`

**Methods:**
- `public java.lang.String toString()`

---

## public final static enum `org.kohsuke.github.GHRepositorySearchBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Sort FORKS`
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Sort STARS`
- `public final static org.kohsuke.github.GHRepositorySearchBuilder$Sort UPDATED`

---

## public final enum `org.kohsuke.github.GHRepositorySelection`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHRepositorySelection ALL`
- `public final static org.kohsuke.github.GHRepositorySelection SELECTED`

---

## public class `org.kohsuke.github.GHRepositoryStatistics`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHRepositoryStatistics(org.kohsuke.github.GHRepository p0)`

**Methods:**
- `public java.util.List getCodeFrequency() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getCommitActivity() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getContributorStats() throws java.io.IOException, java.lang.InterruptedException`
- `public org.kohsuke.github.PagedIterable getContributorStats(boolean p0) throws java.io.IOException, java.lang.InterruptedException`
- `public org.kohsuke.github.GHRepositoryStatistics$Participation getParticipation() throws java.io.IOException`
- `public java.util.List getPunchCard() throws java.io.IOException`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$CodeFrequency`

**Methods:**
- `public long getAdditions()`
- `public long getDeletions()`
- `public int getWeekTimestamp()`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$CommitActivity`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public CommitActivity()`

**Methods:**
- `public java.util.List getDays()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public int getTotal()`
- `public long getWeek()`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$ContributorStats`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public ContributorStats()`

**Methods:**
- `public org.kohsuke.github.GHUser getAuthor()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public int getTotal()`
- `public org.kohsuke.github.GHRepositoryStatistics$ContributorStats$Week getWeek(long p0) throws java.util.NoSuchElementException`
- `public java.util.List getWeeks()`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$ContributorStats$Week`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public Week()`

**Methods:**
- `public int getNumberOfAdditions()`
- `public int getNumberOfCommits()`
- `public int getNumberOfDeletions()`
- `public long getWeekTimestamp()`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$Participation`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public Participation()`

**Methods:**
- `public java.util.List getAllCommits()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.util.List getOwnerCommits()`

---

## public static class `org.kohsuke.github.GHRepositoryStatistics$PunchCardItem`

**Methods:**
- `public int getDayOfWeek()`
- `public long getHourOfDay()`
- `public long getNumberOfCommits()`
- `public java.lang.String toString()`

---

## public abstract class `org.kohsuke.github.GHRepositoryTraffic`
implements `org.kohsuke.github.TrafficInfo`  

**Methods:**
- `public int getCount()`
- `public abstract java.util.List getDailyInfo()`
- `public int getUniques()`

---

## public abstract static class `org.kohsuke.github.GHRepositoryTraffic$DailyInfo`
implements `org.kohsuke.github.TrafficInfo`  

**Methods:**
- `public int getCount()`
- `public java.util.Date getTimestamp()`
- `public int getUniques()`

---

## public class `org.kohsuke.github.GHRepositoryViewTraffic`
extends `org.kohsuke.github.GHRepositoryTraffic`  

**Methods:**
- `public java.util.List getDailyInfo()`
- `public java.util.List getViews()`

---

## public static class `org.kohsuke.github.GHRepositoryViewTraffic$DailyInfo`
extends `org.kohsuke.github.GHRepositoryTraffic$DailyInfo`  

---

## public class `org.kohsuke.github.GHRequestedAction`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHRequestedAction()`

**Methods:**
- `public java.net.URL getHtmlUrl()`

---

## public abstract class `org.kohsuke.github.GHSearchBuilder`<T extends java.lang.Object>
extends `org.kohsuke.github.GHQueryBuilder`  

**Fields:**
- `protected final java.util.List terms`

**Methods:**
- `protected abstract java.lang.String getApiUrl()`
- `public org.kohsuke.github.PagedSearchIterable list()`
- `public org.kohsuke.github.GHQueryBuilder q(java.lang.String p0)`

---

## public class `org.kohsuke.github.GHStargazer`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHStargazer()`

**Methods:**
- `public org.kohsuke.github.GHRepository getRepository()`
- `public java.util.Date getStarredAt()`
- `public org.kohsuke.github.GHUser getUser()`

---

## public class `org.kohsuke.github.GHSubscription`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHSubscription()`

**Methods:**
- `public void delete() throws java.io.IOException`
- `public java.util.Date getCreatedAt()`
- `public java.lang.String getReason()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public java.lang.String getRepositoryUrl()`
- `public java.lang.String getUrl()`
- `public boolean isIgnored()`
- `public boolean isSubscribed()`

---

## public class `org.kohsuke.github.GHTag`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHTag()`

**Methods:**
- `public org.kohsuke.github.GHCommit getCommit()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getOwner()`

---

## public class `org.kohsuke.github.GHTagObject`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHTagObject()`

**Methods:**
- `public java.lang.String getMessage()`
- `public org.kohsuke.github.GHRef$GHObject getObject()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.lang.String getSha()`
- `public java.lang.String getTag()`
- `public org.kohsuke.github.GitUser getTagger()`
- `public java.lang.String getUrl()`
- `public org.kohsuke.github.GHVerification getVerification()`

---

## public final enum `org.kohsuke.github.GHTargetType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHTargetType ORGANIZATION`
- `public final static org.kohsuke.github.GHTargetType USER`

---

## public class `org.kohsuke.github.GHTeam`
extends `org.kohsuke.github.GHObject`  
implements `org.kohsuke.github.Refreshable`  

**Constructors:**
- `public GHTeam()`

**Methods:**
- `public void add(org.kohsuke.github.GHRepository p0) throws java.io.IOException`
- `public void add(org.kohsuke.github.GHRepository p0, org.kohsuke.github.GHOrganization$Permission p1) throws java.io.IOException`
- `public void add(org.kohsuke.github.GHRepository p0, org.kohsuke.github.GHOrganization$RepositoryRole p1) throws java.io.IOException`
- `public void add(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public void add(org.kohsuke.github.GHUser p0, org.kohsuke.github.GHTeam$Role p1) throws java.io.IOException`
- `public org.kohsuke.github.GHDiscussion$Creator createDiscussion(java.lang.String p0) throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDescription()`
- `public org.kohsuke.github.GHDiscussion getDiscussion(long p0) throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public java.util.Set getMembers() throws java.io.IOException`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHOrganization getOrganization() throws java.io.IOException`
- `public java.lang.String getPermission()`
- `public org.kohsuke.github.GHTeam$Privacy getPrivacy()`
- `public java.util.Map getRepositories() throws java.io.IOException`
- `public java.lang.String getSlug()`
- `public boolean hasMember(org.kohsuke.github.GHUser p0)`
- `public int hashCode()`
- `public org.kohsuke.github.PagedIterable listChildTeams() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listDiscussions() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembers() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembers(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMembers(org.kohsuke.github.GHTeam$Role p0) throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listRepositories()`
- `public void refresh() throws java.io.IOException`
- `public void remove(org.kohsuke.github.GHRepository p0) throws java.io.IOException`
- `public void remove(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public void setDescription(java.lang.String p0) throws java.io.IOException`
- `public void setPrivacy(org.kohsuke.github.GHTeam$Privacy p0) throws java.io.IOException`

---

## public final static enum `org.kohsuke.github.GHTeam$Privacy`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHTeam$Privacy CLOSED`
- `public final static org.kohsuke.github.GHTeam$Privacy SECRET`

---

## public final static enum `org.kohsuke.github.GHTeam$Role`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHTeam$Role MAINTAINER`
- `public final static org.kohsuke.github.GHTeam$Role MEMBER`

---

## public class `org.kohsuke.github.GHTeamBuilder`
extends `org.kohsuke.github.GitHubInteractiveObject`  

**Constructors:**
- `public GHTeamBuilder(org.kohsuke.github.GitHub p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `protected final org.kohsuke.github.Requester builder`

**Methods:**
- `public org.kohsuke.github.GHTeam create() throws java.io.IOException`
- `public org.kohsuke.github.GHTeamBuilder description(java.lang.String p0)`
- `public org.kohsuke.github.GHTeamBuilder maintainers(java.lang.String... p0)`
- `public org.kohsuke.github.GHTeamBuilder parentTeamId(long p0)`
- `public org.kohsuke.github.GHTeamBuilder privacy(org.kohsuke.github.GHTeam$Privacy p0)`
- `public org.kohsuke.github.GHTeamBuilder repositories(java.lang.String... p0)`

---

## public class `org.kohsuke.github.GHThread`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.GHObject`  

**Methods:**
- `public org.kohsuke.github.GHCommit getBoundCommit() throws java.io.IOException`
- `public org.kohsuke.github.GHIssue getBoundIssue() throws java.io.IOException`
- `public org.kohsuke.github.GHPullRequest getBoundPullRequest() throws java.io.IOException`
- `public java.net.URL getHtmlUrl()`
- `public java.lang.String getLastCommentUrl()`
- `public java.util.Date getLastReadAt()`
- `public java.lang.String getReason()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public org.kohsuke.github.GHSubscription getSubscription() throws java.io.IOException`
- `public java.lang.String getTitle()`
- `public java.lang.String getType()`
- `public boolean isRead()`
- `public void markAsRead() throws java.io.IOException`
- `public org.kohsuke.github.GHSubscription subscribe(boolean p0, boolean p1) throws java.io.IOException`

---

## public class `org.kohsuke.github.GHTree`

**Constructors:**
- `public GHTree()`

**Methods:**
- `public org.kohsuke.github.GHTreeEntry getEntry(java.lang.String p0)`
- `public java.lang.String getSha()`
- `public java.util.List getTree()`
- `public java.net.URL getUrl()`
- `public boolean isTruncated()`

---

## public class `org.kohsuke.github.GHTreeBuilder`

**Methods:**
- `public org.kohsuke.github.GHTreeBuilder add(java.lang.String p0, byte[] p1, boolean p2)`
- `public org.kohsuke.github.GHTreeBuilder add(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public org.kohsuke.github.GHTreeBuilder baseTree(java.lang.String p0)`
- `public org.kohsuke.github.GHTree create() throws java.io.IOException`
- `public org.kohsuke.github.GHTreeBuilder entry(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `public org.kohsuke.github.GHTreeBuilder shaEntry(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public org.kohsuke.github.GHTreeBuilder textEntry(java.lang.String p0, java.lang.String p1, boolean p2)`

---

## public class `org.kohsuke.github.GHTreeEntry`

**Constructors:**
- `public GHTreeEntry()`

**Methods:**
- `public org.kohsuke.github.GHBlob asBlob() throws java.io.IOException`
- `public org.kohsuke.github.GHTree asTree() throws java.io.IOException`
- `public java.lang.String getMode()`
- `public java.lang.String getPath()`
- `public java.lang.String getSha()`
- `public long getSize()`
- `public java.lang.String getType()`
- `public java.net.URL getUrl()`
- `public java.io.InputStream readAsBlob() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHUser`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  
extends `org.kohsuke.github.GHPerson`  

**Constructors:**
- `public GHUser()`

**Fields:**
- `protected java.lang.String ldap_dn`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public void follow() throws java.io.IOException`
- `public java.lang.String getBio()`
- `public org.kohsuke.github.GHPersonSet getFollowers() throws java.io.IOException`
- `public org.kohsuke.github.GHPersonSet getFollows() throws java.io.IOException`
- `public java.util.List getKeys() throws java.io.IOException`
- `public java.util.Optional getLdapDn() throws java.io.IOException`
- `public org.kohsuke.github.GHPersonSet getOrganizations() throws java.io.IOException`
- `public int hashCode()`
- `public boolean isHireable()`
- `public boolean isMemberOf(org.kohsuke.github.GHOrganization p0)`
- `public boolean isMemberOf(org.kohsuke.github.GHTeam p0)`
- `public boolean isPublicMemberOf(org.kohsuke.github.GHOrganization p0)`
- `public org.kohsuke.github.PagedIterable listEvents() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listFollowers()`
- `public org.kohsuke.github.PagedIterable listFollows()`
- `public org.kohsuke.github.PagedIterable listGists() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listProjects()`
- `public org.kohsuke.github.PagedIterable listStarredRepositories()`
- `public org.kohsuke.github.PagedIterable listSubscriptions()`
- `public void unfollow() throws java.io.IOException`

---

## public class `org.kohsuke.github.GHUserSearchBuilder`
extends `org.kohsuke.github.GHSearchBuilder`  

**Methods:**
- `public org.kohsuke.github.GHUserSearchBuilder created(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder followers(java.lang.String p0)`
- `protected java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHUserSearchBuilder in(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder language(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder location(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder order(org.kohsuke.github.GHDirection p0)`
- `public org.kohsuke.github.GHUserSearchBuilder q(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder repos(java.lang.String p0)`
- `public org.kohsuke.github.GHUserSearchBuilder sort(org.kohsuke.github.GHUserSearchBuilder$Sort p0)`
- `public org.kohsuke.github.GHUserSearchBuilder type(java.lang.String p0)`

---

## public final static enum `org.kohsuke.github.GHUserSearchBuilder$Sort`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHUserSearchBuilder$Sort FOLLOWERS`
- `public final static org.kohsuke.github.GHUserSearchBuilder$Sort JOINED`
- `public final static org.kohsuke.github.GHUserSearchBuilder$Sort REPOSITORIES`

---

## public class `org.kohsuke.github.GHVerification`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GHVerification()`

**Methods:**
- `public java.lang.String getPayload()`
- `public org.kohsuke.github.GHVerification$Reason getReason()`
- `public java.lang.String getSignature()`
- `public boolean isVerified()`

---

## public final static enum `org.kohsuke.github.GHVerification$Reason`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHVerification$Reason BAD_EMAIL`
- `public final static org.kohsuke.github.GHVerification$Reason EXPIRED_KEY`
- `public final static org.kohsuke.github.GHVerification$Reason GPGVERIFY_ERROR`
- `public final static org.kohsuke.github.GHVerification$Reason GPGVERIFY_UNAVAILABLE`
- `public final static org.kohsuke.github.GHVerification$Reason INVALID`
- `public final static org.kohsuke.github.GHVerification$Reason MALFORMED_SIGNATURE`
- `public final static org.kohsuke.github.GHVerification$Reason NOT_SIGNING_KEY`
- `public final static org.kohsuke.github.GHVerification$Reason NO_USER`
- `public final static org.kohsuke.github.GHVerification$Reason UNKNOWN_KEY`
- `public final static org.kohsuke.github.GHVerification$Reason UNKNOWN_SIGNATURE_TYPE`
- `public final static org.kohsuke.github.GHVerification$Reason UNSIGNED`
- `public final static org.kohsuke.github.GHVerification$Reason UNVERIFIED_EMAIL`
- `public final static org.kohsuke.github.GHVerification$Reason VALID`

---

## public class `org.kohsuke.github.GHVerifiedKey`
extends `org.kohsuke.github.GHKey`  

**Constructors:**
- `public GHVerifiedKey()`

**Methods:**
- `public java.lang.String getTitle()`

---

## public class `org.kohsuke.github.GHWorkflow`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHWorkflow()`

**Methods:**
- `public void disable() throws java.io.IOException`
- `public void dispatch(java.lang.String p0) throws java.io.IOException`
- `public void dispatch(java.lang.String p0, java.util.Map p1) throws java.io.IOException`
- `public void enable() throws java.io.IOException`
- `public java.net.URL getBadgeUrl()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.lang.String getName()`
- `public java.lang.String getPath()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public java.lang.String getState()`
- `public org.kohsuke.github.PagedIterable listRuns()`

---

## public class `org.kohsuke.github.GHWorkflowJob`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHWorkflowJob()`

**Methods:**
- `public <T extends java.lang.Object> T downloadLogs(org.kohsuke.github.function.InputStreamFunction p0) throws java.io.IOException`
- `public java.net.URL getCheckRunUrl()`
- `public java.util.Date getCompletedAt()`
- `public org.kohsuke.github.GHWorkflowRun$Conclusion getConclusion()`
- `public java.lang.String getHeadSha()`
- `public java.net.URL getHtmlUrl()`
- `public java.util.List getLabels()`
- `public java.lang.String getName()`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public int getRunAttempt()`
- `public long getRunId()`
- `public int getRunnerGroupId()`
- `public java.lang.String getRunnerGroupName()`
- `public int getRunnerId()`
- `public java.lang.String getRunnerName()`
- `public java.util.Date getStartedAt()`
- `public org.kohsuke.github.GHWorkflowRun$Status getStatus()`
- `public java.util.List getSteps()`

---

## public static class `org.kohsuke.github.GHWorkflowJob$Step`

**Constructors:**
- `public Step()`

**Methods:**
- `public java.util.Date getCompletedAt()`
- `public org.kohsuke.github.GHWorkflowRun$Conclusion getConclusion()`
- `public java.lang.String getName()`
- `public int getNumber()`
- `public java.util.Date getStartedAt()`
- `public org.kohsuke.github.GHWorkflowRun$Status getStatus()`

---

## public class `org.kohsuke.github.GHWorkflowJobQueryBuilder`
extends `org.kohsuke.github.GHQueryBuilder`  

**Methods:**
- `public org.kohsuke.github.GHWorkflowJobQueryBuilder all()`
- `public org.kohsuke.github.GHWorkflowJobQueryBuilder latest()`
- `public org.kohsuke.github.PagedIterable list()`

---

## public class `org.kohsuke.github.GHWorkflowRun`
extends `org.kohsuke.github.GHObject`  

**Constructors:**
- `public GHWorkflowRun()`

**Methods:**
- `public void approve() throws java.io.IOException`
- `public void cancel() throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public void deleteLogs() throws java.io.IOException`
- `public <T extends java.lang.Object> T downloadLogs(org.kohsuke.github.function.InputStreamFunction p0) throws java.io.IOException`
- `public java.net.URL getArtifactsUrl()`
- `public java.net.URL getCancelUrl()`
- `public java.net.URL getCheckSuiteUrl()`
- `public org.kohsuke.github.GHWorkflowRun$Conclusion getConclusion()`
- `public org.kohsuke.github.GHEvent getEvent()`
- `public java.lang.String getHeadBranch()`
- `public org.kohsuke.github.GHWorkflowRun$HeadCommit getHeadCommit()`
- `public org.kohsuke.github.GHRepository getHeadRepository()`
- `public java.lang.String getHeadSha()`
- `public java.net.URL getHtmlUrl() throws java.io.IOException`
- `public java.net.URL getJobsUrl()`
- `public java.net.URL getLogsUrl()`
- `public java.lang.String getName()`
- `public java.util.List getPullRequests() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepository()`
- `public java.net.URL getRerunUrl()`
- `public long getRunAttempt()`
- `public long getRunNumber()`
- `public java.util.Date getRunStartedAt() throws java.io.IOException`
- `public org.kohsuke.github.GHWorkflowRun$Status getStatus()`
- `public long getWorkflowId()`
- `public java.net.URL getWorkflowUrl()`
- `public org.kohsuke.github.PagedIterable listAllJobs()`
- `public org.kohsuke.github.PagedIterable listArtifacts()`
- `public org.kohsuke.github.PagedIterable listJobs()`
- `public void rerun() throws java.io.IOException`

---

## public final static enum `org.kohsuke.github.GHWorkflowRun$Conclusion`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion ACTION_REQUIRED`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion CANCELLED`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion FAILURE`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion NEUTRAL`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion SKIPPED`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion STALE`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion SUCCESS`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion TIMED_OUT`
- `public final static org.kohsuke.github.GHWorkflowRun$Conclusion UNKNOWN`

**Methods:**
- `public static org.kohsuke.github.GHWorkflowRun$Conclusion from(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public static class `org.kohsuke.github.GHWorkflowRun$HeadCommit`

**Constructors:**
- `public HeadCommit()`

**Methods:**
- `public org.kohsuke.github.GitUser getAuthor()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getId()`
- `public java.lang.String getMessage()`
- `public java.util.Date getTimestamp()`
- `public java.lang.String getTreeId()`

---

## public final static enum `org.kohsuke.github.GHWorkflowRun$Status`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.GHWorkflowRun$Status COMPLETED`
- `public final static org.kohsuke.github.GHWorkflowRun$Status IN_PROGRESS`
- `public final static org.kohsuke.github.GHWorkflowRun$Status QUEUED`
- `public final static org.kohsuke.github.GHWorkflowRun$Status UNKNOWN`

**Methods:**
- `public static org.kohsuke.github.GHWorkflowRun$Status from(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.kohsuke.github.GHWorkflowRunQueryBuilder`
extends `org.kohsuke.github.GHQueryBuilder`  

**Methods:**
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder actor(java.lang.String p0)`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder actor(org.kohsuke.github.GHUser p0)`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder branch(java.lang.String p0)`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder conclusion(org.kohsuke.github.GHWorkflowRun$Conclusion p0)`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder event(java.lang.String p0)`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder event(org.kohsuke.github.GHEvent p0)`
- `public org.kohsuke.github.PagedIterable list()`
- `public org.kohsuke.github.GHWorkflowRunQueryBuilder status(org.kohsuke.github.GHWorkflowRun$Status p0)`

---

## public class `org.kohsuke.github.GitCommit`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded, @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GitCommit()`

**Methods:**
- `public org.kohsuke.github.GitUser getAuthor()`
- `public java.util.Date getAuthoredDate()`
- `public java.util.Date getCommitDate()`
- `public org.kohsuke.github.GitUser getCommitter()`
- `public java.lang.String getHtmlUrl()`
- `public java.lang.String getMessage()`
- `public java.lang.String getNodeId()`
- `public org.kohsuke.github.GHRepository getOwner()`
- `public java.util.List getParentSHA1s()`
- `public java.lang.String getSHA1()`
- `public java.lang.String getSha()`
- `public java.lang.String getTreeSHA1()`
- `public java.lang.String getTreeUrl()`
- `public java.lang.String getUrl()`
- `public org.kohsuke.github.GHVerification getVerification()`

---

## public class `org.kohsuke.github.GitHub`
annotations: @com.infradna.tool.bridge_method_injector.BridgeMethodsAdded  

**Methods:**
- `public void checkApiUrlValidity() throws java.io.IOException`
- `public org.kohsuke.github.GHAuthorization checkAuth(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connect() throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connect(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connect(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectAnonymously() throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectToEnterprise(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectToEnterprise(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectToEnterpriseAnonymously(java.lang.String p0) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectToEnterpriseWithOAuth(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectUsingOAuth(java.lang.String p0) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectUsingOAuth(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static org.kohsuke.github.GitHub connectUsingPassword(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHGistBuilder createGist()`
- `public org.kohsuke.github.GHAuthorization createOrGetAuth(java.lang.String p0, java.lang.String p1, java.util.List p2, java.lang.String p3, java.lang.String p4) throws java.io.IOException`
- `public org.kohsuke.github.GHCreateRepositoryBuilder createRepository(java.lang.String p0)`
- `public org.kohsuke.github.GHRepository createRepository(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException`
- `public org.kohsuke.github.GHAuthorization createToken(java.util.Collection p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public org.kohsuke.github.GHAuthorization createToken(java.util.Collection p0, java.lang.String p1, java.lang.String p2, java.util.function.Supplier p3) throws java.io.IOException`
- `public void deleteAuth(long p0) throws java.io.IOException`
- `public java.lang.String getApiUrl()`
- `public org.kohsuke.github.GHApp getApp() throws java.io.IOException`
- `public org.kohsuke.github.HttpConnector getConnector()`
- `public java.util.List getEvents() throws java.io.IOException`
- `public org.kohsuke.github.GHGist getGist(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHAuthenticatedAppInstallation getInstallation() throws java.io.IOException`
- `public org.kohsuke.github.GHLicense getLicense(java.lang.String p0) throws java.io.IOException`
- `public static com.fasterxml.jackson.databind.ObjectReader getMappingObjectReader()`
- `public static com.fasterxml.jackson.databind.ObjectWriter getMappingObjectWriter()`
- `public org.kohsuke.github.GHMeta getMeta() throws java.io.IOException`
- `public java.util.List getMyInvitations() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable getMyMarketplacePurchases() throws java.io.IOException`
- `public java.util.Map getMyOrganizations() throws java.io.IOException`
- `public java.util.Map getMyTeams() throws java.io.IOException`
- `public org.kohsuke.github.GHMyself getMyself() throws java.io.IOException`
- `public org.kohsuke.github.GHOrganization getOrganization(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProject getProject(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProjectCard getProjectCard(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHProjectColumn getProjectColumn(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRateLimit getRateLimit() throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepository(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepositoryById(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHRepository getRepositoryById(long p0) throws java.io.IOException`
- `public org.kohsuke.github.GHTeam getTeam(int p0) throws java.io.IOException`
- `public org.kohsuke.github.GHUser getUser(java.lang.String p0) throws java.io.IOException`
- `protected org.kohsuke.github.GHUser getUser(org.kohsuke.github.GHUser p0)`
- `public java.util.Map getUserPublicOrganizations(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map getUserPublicOrganizations(org.kohsuke.github.GHUser p0) throws java.io.IOException`
- `public boolean isAnonymous()`
- `public boolean isCredentialValid()`
- `public boolean isOffline()`
- `public org.kohsuke.github.GHRateLimit lastRateLimit()`
- `public org.kohsuke.github.PagedIterable listAllPublicRepositories()`
- `public org.kohsuke.github.PagedIterable listAllPublicRepositories(java.lang.String p0)`
- `public org.kohsuke.github.PagedIterable listLicenses() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMarketplacePlans() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable listMyAuthorizations() throws java.io.IOException`
- `public org.kohsuke.github.GHNotificationStream listNotifications()`
- `public org.kohsuke.github.PagedIterable listOrganizations()`
- `public org.kohsuke.github.PagedIterable listOrganizations(java.lang.String p0)`
- `public org.kohsuke.github.PagedIterable listUsers() throws java.io.IOException`
- `public static org.kohsuke.github.GitHub offline()`
- `public <T extends org.kohsuke.github.GHEventPayload> T parseEventPayload(java.io.Reader p0, java.lang.Class p1) throws java.io.IOException`
- `public org.kohsuke.github.GHRateLimit rateLimit() throws java.io.IOException`
- `public void refreshCache()`
- `public java.io.Reader renderMarkdown(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GHAuthorization resetAuth(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public org.kohsuke.github.GHCommitSearchBuilder searchCommits()`
- `public org.kohsuke.github.GHContentSearchBuilder searchContent()`
- `public org.kohsuke.github.GHIssueSearchBuilder searchIssues()`
- `public org.kohsuke.github.GHRepositorySearchBuilder searchRepositories()`
- `public org.kohsuke.github.GHUserSearchBuilder searchUsers()`
- `public void setConnector(org.kohsuke.github.HttpConnector p0)`

---

## public abstract static class `org.kohsuke.github.GitHub$DependentAuthorizationProvider`
implements `org.kohsuke.github.authorization.AuthorizationProvider`  

**Constructors:**
- `protected DependentAuthorizationProvider(org.kohsuke.github.authorization.AuthorizationProvider p0)`

**Methods:**
- `protected final synchronized org.kohsuke.github.GitHub gitHub()`

---

## public abstract class `org.kohsuke.github.GitHubAbuseLimitHandler`
extends `org.kohsuke.github.GitHubConnectorResponseErrorHandler`  

**Constructors:**
- `public GitHubAbuseLimitHandler()`

**Methods:**
- `public abstract void onError(org.kohsuke.github.connector.GitHubConnectorResponse p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.GitHubBuilder`
implements `java.lang.Cloneable`  

**Constructors:**
- `public GitHubBuilder()`

**Methods:**
- `public org.kohsuke.github.GitHub build() throws java.io.IOException`
- `public org.kohsuke.github.GitHubBuilder clone()`
- `public static org.kohsuke.github.GitHubBuilder fromEnvironment() throws java.io.IOException`
- `public static org.kohsuke.github.GitHubBuilder fromEnvironment(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static org.kohsuke.github.GitHubBuilder fromEnvironment(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public static org.kohsuke.github.GitHubBuilder fromProperties(java.util.Properties p0)`
- `public static org.kohsuke.github.GitHubBuilder fromPropertyFile() throws java.io.IOException`
- `public static org.kohsuke.github.GitHubBuilder fromPropertyFile(java.lang.String p0) throws java.io.IOException`
- `public org.kohsuke.github.GitHubBuilder withAbuseLimitHandler(org.kohsuke.github.AbuseLimitHandler p0)`
- `public org.kohsuke.github.GitHubBuilder withAbuseLimitHandler(org.kohsuke.github.GitHubAbuseLimitHandler p0)`
- `public org.kohsuke.github.GitHubBuilder withAppInstallationToken(java.lang.String p0)`
- `public org.kohsuke.github.GitHubBuilder withAuthorizationProvider(org.kohsuke.github.authorization.AuthorizationProvider p0)`
- `public org.kohsuke.github.GitHubBuilder withConnector(org.kohsuke.github.HttpConnector p0)`
- `public org.kohsuke.github.GitHubBuilder withConnector(org.kohsuke.github.connector.GitHubConnector p0)`
- `public org.kohsuke.github.GitHubBuilder withEndpoint(java.lang.String p0)`
- `public org.kohsuke.github.GitHubBuilder withJwtToken(java.lang.String p0)`
- `public org.kohsuke.github.GitHubBuilder withOAuthToken(java.lang.String p0)`
- `public org.kohsuke.github.GitHubBuilder withOAuthToken(java.lang.String p0, java.lang.String p1)`
- `public org.kohsuke.github.GitHubBuilder withPassword(java.lang.String p0, java.lang.String p1)`
- `public org.kohsuke.github.GitHubBuilder withProxy(java.net.Proxy p0)`
- `public org.kohsuke.github.GitHubBuilder withRateLimitChecker(org.kohsuke.github.RateLimitChecker p0)`
- `public org.kohsuke.github.GitHubBuilder withRateLimitChecker(org.kohsuke.github.RateLimitChecker p0, org.kohsuke.github.RateLimitTarget p1)`
- `public org.kohsuke.github.GitHubBuilder withRateLimitHandler(org.kohsuke.github.GitHubRateLimitHandler p0)`
- `public org.kohsuke.github.GitHubBuilder withRateLimitHandler(org.kohsuke.github.RateLimitHandler p0)`

---

## public abstract class `org.kohsuke.github.GitHubRateLimitHandler`
extends `org.kohsuke.github.GitHubConnectorResponseErrorHandler`  

**Constructors:**
- `public GitHubRateLimitHandler()`

**Methods:**
- `public abstract void onError(org.kohsuke.github.connector.GitHubConnectorResponse p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.GitHubRequest`
implements `org.kohsuke.github.connector.GitHubConnectorRequest`  

**Methods:**
- `public java.util.Map allHeaders()`
- `public java.lang.String apiUrl()`
- `public java.util.List args()`
- `public java.io.InputStream body()`
- `public java.lang.String contentType()`
- `public boolean hasBody()`
- `public java.lang.String header(java.lang.String p0)`
- `public java.util.Map injectedMappingValues()`
- `public java.lang.String method()`
- `public org.kohsuke.github.RateLimitTarget rateLimitTarget()`
- `public java.net.URL url()`
- `public java.lang.String urlPath()`

---

## public class `org.kohsuke.github.GitUser`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  

**Constructors:**
- `public GitUser()`
- `public GitUser(org.kohsuke.github.GitUser p0)`

**Methods:**
- `public java.util.Date getDate()`
- `public java.lang.String getEmail()`
- `public java.lang.String getName()`
- `public java.lang.String getUsername()`

---

## public abstract interface `org.kohsuke.github.HttpConnector`
annotations: @java.lang.Deprecated, @java.lang.FunctionalInterface  

**Fields:**
- `public final static org.kohsuke.github.HttpConnector DEFAULT`
- `public final static org.kohsuke.github.HttpConnector OFFLINE`

**Methods:**
- `public abstract java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.HttpException`
extends `org.kohsuke.github.GHIOException`  

**Constructors:**
- `public HttpException(int p0, java.lang.String p1, java.lang.String p2, java.lang.Throwable p3)`
- `public HttpException(int p0, java.lang.String p1, java.net.URL p2, java.lang.Throwable p3)`
- `public HttpException(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3)`
- `public HttpException(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.Throwable p4)`
- `public HttpException(org.kohsuke.github.connector.GitHubConnectorResponse p0)`

**Methods:**
- `public int getResponseCode()`
- `public java.lang.String getResponseMessage()`
- `public java.lang.String getUrl()`

---

## public final enum `org.kohsuke.github.MarkdownMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.MarkdownMode GFM`
- `public final static org.kohsuke.github.MarkdownMode MARKDOWN`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract class `org.kohsuke.github.PagedIterable`<T extends java.lang.Object>
implements `java.lang.Iterable<T>`  

**Constructors:**
- `public PagedIterable()`

**Methods:**
- `public abstract org.kohsuke.github.PagedIterator _iterator(int p0)`
- `public java.util.List asList()`
- `public java.util.Set asSet()`
- `public final org.kohsuke.github.PagedIterator iterator()`
- `public T[] toArray() throws java.io.IOException`
- `protected T[] toArray(org.kohsuke.github.PagedIterator p0) throws java.io.IOException`
- `public java.util.List toList() throws java.io.IOException`
- `public java.util.Set toSet() throws java.io.IOException`
- `public org.kohsuke.github.PagedIterable withPageSize(int p0)`

---

## public class `org.kohsuke.github.PagedIterator`<T extends java.lang.Object>
implements `java.util.Iterator<T>`  

**Fields:**
- `protected final java.util.Iterator base`

**Methods:**
- `public boolean hasNext()`
- `public T next()`
- `public java.util.List nextPage()`
- `protected void wrapUp(T[] p0)`

---

## public class `org.kohsuke.github.PagedSearchIterable`<T extends java.lang.Object>
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings  
extends `org.kohsuke.github.PagedIterable`  

**Methods:**
- `public org.kohsuke.github.PagedIterator _iterator(int p0)`
- `protected java.util.Iterator adapt(java.util.Iterator p0)`
- `public int getTotalCount()`
- `public boolean isIncomplete()`
- `public org.kohsuke.github.PagedSearchIterable withPageSize(int p0)`

---

## public abstract interface `org.kohsuke.github.Preview`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public abstract class `org.kohsuke.github.RateLimitChecker`

**Constructors:**
- `public RateLimitChecker()`

**Fields:**
- `public final static org.kohsuke.github.RateLimitChecker NONE`

**Methods:**
- `protected boolean checkRateLimit(org.kohsuke.github.GHRateLimit$Record p0, long p1) throws java.lang.InterruptedException`
- `protected final boolean sleepUntilReset(org.kohsuke.github.GHRateLimit$Record p0) throws java.lang.InterruptedException`

---

## public static class `org.kohsuke.github.RateLimitChecker$LiteralValue`
extends `org.kohsuke.github.RateLimitChecker`  

**Constructors:**
- `public LiteralValue(int p0)`

**Methods:**
- `protected boolean checkRateLimit(org.kohsuke.github.GHRateLimit$Record p0, long p1) throws java.lang.InterruptedException`

---

## public abstract class `org.kohsuke.github.RateLimitHandler`
annotations: @java.lang.Deprecated  
extends `org.kohsuke.github.GitHubRateLimitHandler`  

**Constructors:**
- `public RateLimitHandler()`

**Fields:**
- `public final static org.kohsuke.github.RateLimitHandler FAIL`
- `public final static org.kohsuke.github.RateLimitHandler WAIT`

**Methods:**
- `public abstract void onError(java.io.IOException p0, java.net.HttpURLConnection p1) throws java.io.IOException`
- `public void onError(org.kohsuke.github.connector.GitHubConnectorResponse p0) throws java.io.IOException`

---

## public final enum `org.kohsuke.github.RateLimitTarget`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.RateLimitTarget CORE`
- `public final static org.kohsuke.github.RateLimitTarget GRAPHQL`
- `public final static org.kohsuke.github.RateLimitTarget INTEGRATION_MANIFEST`
- `public final static org.kohsuke.github.RateLimitTarget NONE`
- `public final static org.kohsuke.github.RateLimitTarget SEARCH`

---

## public abstract interface `org.kohsuke.github.Reactable`
annotations: @org.kohsuke.github.Preview  

**Methods:**
- `public abstract org.kohsuke.github.GHReaction createReaction(org.kohsuke.github.ReactionContent p0) throws java.io.IOException`
- `public abstract void deleteReaction(org.kohsuke.github.GHReaction p0) throws java.io.IOException`
- `public abstract org.kohsuke.github.PagedIterable listReactions()`

---

## public final enum `org.kohsuke.github.ReactionContent`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.ReactionContent CONFUSED`
- `public final static org.kohsuke.github.ReactionContent EYES`
- `public final static org.kohsuke.github.ReactionContent HEART`
- `public final static org.kohsuke.github.ReactionContent HOORAY`
- `public final static org.kohsuke.github.ReactionContent LAUGH`
- `public final static org.kohsuke.github.ReactionContent MINUS_ONE`
- `public final static org.kohsuke.github.ReactionContent PLUS_ONE`
- `public final static org.kohsuke.github.ReactionContent ROCKET`

**Methods:**
- `public static org.kohsuke.github.ReactionContent forContent(java.lang.String p0)`
- `public java.lang.String getContent()`

---

## public abstract interface `org.kohsuke.github.Refreshable`

**Methods:**
- `public abstract void refresh() throws java.io.IOException`
- `public default void refresh(java.lang.Object p0) throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.TrafficInfo`

**Methods:**
- `public abstract int getCount()`
- `public abstract int getUniques()`

---

## public class `org.kohsuke.github.authorization.AnonymousAuthorizationProvider`
implements `org.kohsuke.github.authorization.AuthorizationProvider`  

**Constructors:**
- `public AnonymousAuthorizationProvider()`

**Methods:**
- `public java.lang.String getEncodedAuthorization() throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.authorization.AuthorizationProvider`

**Fields:**
- `public final static org.kohsuke.github.authorization.AuthorizationProvider ANONYMOUS`

**Methods:**
- `public abstract java.lang.String getEncodedAuthorization() throws java.io.IOException`

---

## public class `org.kohsuke.github.authorization.ImmutableAuthorizationProvider`
implements `org.kohsuke.github.authorization.AuthorizationProvider`  

**Constructors:**
- `public ImmutableAuthorizationProvider(java.lang.String p0)`

**Methods:**
- `public static org.kohsuke.github.authorization.AuthorizationProvider fromAppInstallationToken(java.lang.String p0)`
- `public static org.kohsuke.github.authorization.AuthorizationProvider fromJwtToken(java.lang.String p0)`
- `public static org.kohsuke.github.authorization.AuthorizationProvider fromLoginAndPassword(java.lang.String p0, java.lang.String p1)`
- `public static org.kohsuke.github.authorization.AuthorizationProvider fromOauthToken(java.lang.String p0)`
- `public static org.kohsuke.github.authorization.AuthorizationProvider fromOauthToken(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getEncodedAuthorization()`

---

## public class `org.kohsuke.github.authorization.OrgAppInstallationAuthorizationProvider`
extends `org.kohsuke.github.GitHub$DependentAuthorizationProvider`  

**Constructors:**
- `public OrgAppInstallationAuthorizationProvider(java.lang.String p0, org.kohsuke.github.authorization.AuthorizationProvider p1)`

**Methods:**
- `public java.lang.String getEncodedAuthorization() throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.authorization.UserAuthorizationProvider`
implements `org.kohsuke.github.authorization.AuthorizationProvider`  

**Methods:**
- `public abstract java.lang.String getLogin()`

---

## public abstract interface `org.kohsuke.github.connector.GitHubConnector`
annotations: @java.lang.FunctionalInterface  

**Fields:**
- `public final static org.kohsuke.github.connector.GitHubConnector DEFAULT`
- `public final static org.kohsuke.github.connector.GitHubConnector OFFLINE`

**Methods:**
- `public abstract org.kohsuke.github.connector.GitHubConnectorResponse send(org.kohsuke.github.connector.GitHubConnectorRequest p0) throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.connector.GitHubConnectorRequest`

**Methods:**
- `public abstract java.util.Map allHeaders()`
- `public abstract java.io.InputStream body()`
- `public abstract java.lang.String contentType()`
- `public abstract boolean hasBody()`
- `public abstract java.lang.String header(java.lang.String p0)`
- `public abstract java.lang.String method()`
- `public abstract java.net.URL url()`

---

## public abstract class `org.kohsuke.github.connector.GitHubConnectorResponse`
implements `java.io.Closeable`  

**Constructors:**
- `protected GitHubConnectorResponse(org.kohsuke.github.connector.GitHubConnectorRequest p0, int p1, java.util.Map p2)`

**Methods:**
- `public java.util.Map allHeaders()`
- `public abstract java.io.InputStream bodyStream() throws java.io.IOException`
- `public java.lang.String header(java.lang.String p0)`
- `public final int parseInt(java.lang.String p0) throws java.lang.NumberFormatException`
- `public org.kohsuke.github.connector.GitHubConnectorRequest request()`
- `public int statusCode()`
- `public java.net.HttpURLConnection toHttpURLConnection()`
- `protected java.io.InputStream wrapStream(java.io.InputStream p0) throws java.io.IOException`

---

## public abstract static class `org.kohsuke.github.connector.GitHubConnectorResponse$ByteArrayResponse`
extends `org.kohsuke.github.connector.GitHubConnectorResponse`  

**Constructors:**
- `protected ByteArrayResponse(org.kohsuke.github.connector.GitHubConnectorRequest p0, int p1, java.util.Map p2)`

**Methods:**
- `public java.io.InputStream bodyStream() throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `protected abstract java.io.InputStream rawBodyStream() throws java.io.IOException`

---

## public final class `org.kohsuke.github.example.dataobject.ReadOnlyObjects`

**Constructors:**
- `public ReadOnlyObjects()`

---

## public abstract static interface `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`

**Methods:**
- `public abstract java.util.List getApi()`
- `public abstract java.util.List getGit()`
- `public abstract java.util.List getHooks()`
- `public abstract java.util.List getImporter()`
- `public abstract java.util.List getPages()`
- `public abstract java.util.List getWeb()`
- `public abstract boolean isVerifiablePasswordAuthentication()`

---

## public static class `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaGettersFinal`
implements `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`  

**Methods:**
- `public java.util.List getApi()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`

---

## public static class `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaGettersFinalCreator`
implements `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`  

**Methods:**
- `public java.util.List getApi()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`

---

## public static class `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaGettersUnmodifiable`
implements `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`  

**Constructors:**
- `public GHMetaGettersUnmodifiable()`

**Methods:**
- `public java.util.List getApi()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`

---

## public static class `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaPackage`
implements `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`  

**Constructors:**
- `public GHMetaPackage()`

**Methods:**
- `public java.util.List getApi()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`

---

## public static class `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaPublic`
implements `org.kohsuke.github.example.dataobject.ReadOnlyObjects$GHMetaExample`  

**Constructors:**
- `public GHMetaPublic()`

**Methods:**
- `public java.util.List getApi()`
- `public java.util.List getGit()`
- `public java.util.List getHooks()`
- `public java.util.List getImporter()`
- `public java.util.List getPages()`
- `public java.util.List getWeb()`
- `public boolean isVerifiablePasswordAuthentication()`
- `public void setApi(java.util.List p0)`
- `public void setGit(java.util.List p0)`
- `public void setHooks(java.util.List p0)`
- `public void setImporter(java.util.List p0)`
- `public void setPages(java.util.List p0)`
- `public void setVerifiablePasswordAuthentication(boolean p0)`
- `public void setWeb(java.util.List p0)`

---

## public class `org.kohsuke.github.extras.HttpClientGitHubConnector`
implements `org.kohsuke.github.connector.GitHubConnector`  

**Constructors:**
- `public HttpClientGitHubConnector()`
- `public HttpClientGitHubConnector(java.net.http.HttpClient p0)`

**Methods:**
- `public org.kohsuke.github.connector.GitHubConnectorResponse send(org.kohsuke.github.connector.GitHubConnectorRequest p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.extras.ImpatientHttpConnector`
implements `org.kohsuke.github.HttpConnector`  

**Constructors:**
- `public ImpatientHttpConnector(org.kohsuke.github.HttpConnector p0)`
- `public ImpatientHttpConnector(org.kohsuke.github.HttpConnector p0, int p1)`
- `public ImpatientHttpConnector(org.kohsuke.github.HttpConnector p0, int p1, int p2)`

**Fields:**
- `public static int CONNECT_TIMEOUT`
- `public static int READ_TIMEOUT`

**Methods:**
- `public java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.extras.OkHttp3Connector`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings, @java.lang.Deprecated  
implements `org.kohsuke.github.HttpConnector`  

**Constructors:**
- `public OkHttp3Connector(okhttp3.OkUrlFactory p0)`

**Methods:**
- `public java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.extras.OkHttpConnector`
annotations: @java.lang.Deprecated  
implements `org.kohsuke.github.HttpConnector`  

**Constructors:**
- `public OkHttpConnector(com.squareup.okhttp.OkUrlFactory p0)`

**Methods:**
- `public java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.extras.authorization.JWTTokenProvider`
implements `org.kohsuke.github.authorization.AuthorizationProvider`  

**Constructors:**
- `public JWTTokenProvider(java.lang.String p0, java.io.File p1) throws java.io.IOException, java.security.GeneralSecurityException`
- `public JWTTokenProvider(java.lang.String p0, java.lang.String p1) throws java.security.GeneralSecurityException`
- `public JWTTokenProvider(java.lang.String p0, java.nio.file.Path p1) throws java.io.IOException, java.security.GeneralSecurityException`
- `public JWTTokenProvider(java.lang.String p0, java.security.PrivateKey p1)`

**Methods:**
- `public java.lang.String getEncodedAuthorization() throws java.io.IOException`

---

## public final class `org.kohsuke.github.extras.okhttp3.ObsoleteUrlFactory`
annotations: @edu.umd.cs.findbugs.annotations.SuppressFBWarnings, @java.lang.Deprecated  
implements `java.lang.Cloneable`, `java.net.URLStreamHandlerFactory`  

**Constructors:**
- `public ObsoleteUrlFactory(okhttp3.OkHttpClient p0)`

**Methods:**
- `public okhttp3.OkHttpClient client()`
- `public org.kohsuke.github.extras.okhttp3.ObsoleteUrlFactory clone()`
- `public java.net.URLStreamHandler createURLStreamHandler(java.lang.String p0)`
- `public java.net.HttpURLConnection open(java.net.URL p0)`
- `public org.kohsuke.github.extras.okhttp3.ObsoleteUrlFactory setClient(okhttp3.OkHttpClient p0)`

---

## public class `org.kohsuke.github.extras.okhttp3.OkHttpConnector`
annotations: @java.lang.Deprecated  
implements `org.kohsuke.github.HttpConnector`  

**Constructors:**
- `public OkHttpConnector(okhttp3.OkHttpClient p0)`
- `public OkHttpConnector(okhttp3.OkHttpClient p0, int p1)`

**Methods:**
- `public java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`

---

## public class `org.kohsuke.github.extras.okhttp3.OkHttpGitHubConnector`
implements `org.kohsuke.github.connector.GitHubConnector`  

**Constructors:**
- `public OkHttpGitHubConnector(okhttp3.OkHttpClient p0)`
- `public OkHttpGitHubConnector(okhttp3.OkHttpClient p0, int p1)`

**Methods:**
- `public org.kohsuke.github.connector.GitHubConnectorResponse send(org.kohsuke.github.connector.GitHubConnectorRequest p0) throws java.io.IOException`

---

## public abstract interface `org.kohsuke.github.function.FunctionThrows`<T extends java.lang.Object, R extends java.lang.Object, E extends java.lang.Throwable>
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract R apply(T p0) throws E`

---

## public abstract interface `org.kohsuke.github.function.InputStreamFunction`<R extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  
implements `org.kohsuke.github.function.FunctionThrows<java.io.InputStream,R,java.io.IOException>`  

---

## public final class `org.kohsuke.github.internal.DefaultGitHubConnector`

**Methods:**
- `public static org.kohsuke.github.connector.GitHubConnector create()`

---

## public final class `org.kohsuke.github.internal.EnumUtils`

**Methods:**
- `public static <E extends java.lang.Enum<E>> E getEnumOrDefault(java.lang.Class p0, java.lang.String p1, E p2)`
- `public static <E extends java.lang.Enum<E>> E getNullableEnumOrDefault(java.lang.Class p0, java.lang.String p1, E p2)`

---

## public final class `org.kohsuke.github.internal.GitHubConnectorHttpConnectorAdapter`
implements `org.kohsuke.github.HttpConnector`, `org.kohsuke.github.connector.GitHubConnector`  

**Constructors:**
- `public GitHubConnectorHttpConnectorAdapter(org.kohsuke.github.HttpConnector p0)`

**Methods:**
- `public static org.kohsuke.github.connector.GitHubConnector adapt(org.kohsuke.github.HttpConnector p0)`
- `public java.net.HttpURLConnection connect(java.net.URL p0) throws java.io.IOException`
- `public org.kohsuke.github.connector.GitHubConnectorResponse send(org.kohsuke.github.connector.GitHubConnectorRequest p0) throws java.io.IOException`

---

## public final static class `org.kohsuke.github.internal.GitHubConnectorHttpConnectorAdapter$HttpURLConnectionGitHubConnectorResponse`
extends `org.kohsuke.github.connector.GitHubConnectorResponse$ByteArrayResponse`  

**Methods:**
- `public void close() throws java.io.IOException`
- `public java.net.HttpURLConnection toHttpURLConnection()`

---

## public final enum `org.kohsuke.github.internal.Previews`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.kohsuke.github.internal.Previews ANTIOPE`
- `public final static org.kohsuke.github.internal.Previews ANT_MAN`
- `public final static org.kohsuke.github.internal.Previews BAPTISTE`
- `public final static org.kohsuke.github.internal.Previews CLOAK`
- `public final static org.kohsuke.github.internal.Previews FLASH`
- `public final static org.kohsuke.github.internal.Previews GAMBIT`
- `public final static org.kohsuke.github.internal.Previews GROOT`
- `public final static org.kohsuke.github.internal.Previews INERTIA`
- `public final static org.kohsuke.github.internal.Previews LUKE_CAGE`
- `public final static org.kohsuke.github.internal.Previews LYDIAN`
- `public final static org.kohsuke.github.internal.Previews MACHINE_MAN`
- `public final static org.kohsuke.github.internal.Previews MERCY`
- `public final static org.kohsuke.github.internal.Previews NEBULA`
- `public final static org.kohsuke.github.internal.Previews SHADOW_CAT`
- `public final static org.kohsuke.github.internal.Previews SQUIRREL_GIRL`
- `public final static org.kohsuke.github.internal.Previews ZZZAX`

**Methods:**
- `public java.lang.String mediaType()`

---

