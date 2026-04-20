# Breaking Changes: org.kohsuke:github-api 1.93 → 1.313
Total: 225 (binary-breaking: 188, source-breaking: 211)

## org.kohsuke.github.GHAsset

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHAuthorization

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHBranch

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.kohsuke.github.GHBranch`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.kohsuke.github.GHBranch`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.kohsuke.github.GHBranch.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.disableProtection()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.enableProtection()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.enableProtection(org.kohsuke.github.EnforcementLevel,java.util.Collection<java.lang.String>)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getName()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getOwner()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getProtection()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getProtectionUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getRoot()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.getSHA1()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.isProtected()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHBranch.toString()`

## org.kohsuke.github.GHCommitComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHCommitStatus

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHCompare

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHCompare.status`

## org.kohsuke.github.GHContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.kohsuke.github.GHContent.wrap(org.kohsuke.github.GHContent[],org.kohsuke.github.GHRepository)`

## org.kohsuke.github.GHContentUpdateResponse

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHContentUpdateResponse.getCommit()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHContentUpdateResponse.getCommit()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHContentUpdateResponse.getCommit()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHContentUpdateResponse.getCommit()`

## org.kohsuke.github.GHCreateRepositoryBuilder

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.allowMergeCommit(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.allowMergeCommit(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.allowRebaseMerge(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.allowRebaseMerge(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.allowSquashMerge(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.allowSquashMerge(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.autoInit(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHCreateRepositoryBuilder.autoInit(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.description(java.lang.String)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.description(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.downloads(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.downloads(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.gitignoreTemplate(java.lang.String)`
+ NOW THROWS: `org.kohsuke.github.GHCreateRepositoryBuilder.gitignoreTemplate(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.lang.String)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.net.URL)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.net.URL)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.issues(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.issues(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.licenseTemplate(java.lang.String)`
+ NOW THROWS: `org.kohsuke.github.GHCreateRepositoryBuilder.licenseTemplate(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.private_(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.private_(boolean)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.team(org.kohsuke.github.GHTeam)`
+ NOW THROWS: `org.kohsuke.github.GHCreateRepositoryBuilder.team(org.kohsuke.github.GHTeam)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHCreateRepositoryBuilder.wiki(boolean)`
+ NOW THROWS: `org.kohsuke.github.GHRepositoryBuilder.wiki(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.allowMergeCommit(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowMergeCommit(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.allowRebaseMerge(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowRebaseMerge(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.allowSquashMerge(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowSquashMerge(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.description(java.lang.String)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.description(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.downloads(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.downloads(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.lang.String)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.net.URL)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.net.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.issues(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.issues(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.private_(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.private_(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHCreateRepositoryBuilder.wiki(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.wiki(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.allowMergeCommit(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowMergeCommit(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.allowRebaseMerge(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowRebaseMerge(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.allowSquashMerge(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.allowSquashMerge(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.description(java.lang.String)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.description(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.downloads(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.downloads(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.lang.String)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.homepage(java.net.URL)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.homepage(java.net.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.issues(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.issues(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.private_(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.private_(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHCreateRepositoryBuilder.wiki(boolean)`
+ NEW RETURN TYPE: `org.kohsuke.github.GHRepositoryBuilder.wiki(boolean)`

## org.kohsuke.github.GHDeployKey

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.kohsuke.github.GHDeployKey.id`
+ NEW FIELD: `org.kohsuke.github.GHDeployKey.id`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.kohsuke.github.GHDeployKey.id`
+ NEW FIELD: `org.kohsuke.github.GHDeployKey.id`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHDeployKey.getId()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHDeployKey.getId()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHDeployKey.getId()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHDeployKey.getId()`

## org.kohsuke.github.GHDeployment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHDeploymentStatus

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHEventPayload$CommitComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Create

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Delete

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Deployment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$DeploymentStatus

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Fork

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$IssueComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Ping

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Public

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$PullRequest

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$PullRequestReview

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$PullRequestReviewComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Push

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHEventPayload$Repository

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHEventPayload.root`

## org.kohsuke.github.GHGist

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.kohsuke.github.GHGist`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.kohsuke.github.GHGist`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.kohsuke.github.GHGist.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.responseHeaderFields`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.delete()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.fork()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getCommentCount()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getCommentsUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getCommitsUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getDescription()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getFile(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getFiles()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getForksUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getGitPullUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getGitPushUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getHtmlUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.getOwner()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.isPublic()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.isStarred()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.listForks()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.star()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHGist.unstar()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.getCreatedAt()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.getId()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.getResponseHeaderFields()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.getUpdatedAt()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.getUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHObject.toString()`

## org.kohsuke.github.GHHook

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHIssue

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.kohsuke.github.GHIssue.labels`
+ NEW FIELD: `org.kohsuke.github.GHIssue.labels`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.kohsuke.github.GHIssue.getLabels()`

## org.kohsuke.github.GHIssue$Label

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.kohsuke.github.GHIssue$Label`

## org.kohsuke.github.GHIssueComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHLabel

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.kohsuke.github.GHLabel`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.kohsuke.github.GHLabel`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.kohsuke.github.GHLabel.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHLabel.delete()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHLabel.getColor()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHLabel.getName()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHLabel.getUrl()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHLabel.setColor(java.lang.String)`

## org.kohsuke.github.GHLicense

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHMilestone

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHMyself

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHPerson.gravatar_id`

## org.kohsuke.github.GHOrganization

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHPerson.gravatar_id`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.kohsuke.github.GHOrganization.createRepository(java.lang.String)`

## org.kohsuke.github.GHPerson

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHPerson.gravatar_id`

## org.kohsuke.github.GHPullRequest

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.kohsuke.github.GHIssue.labels`
+ NEW FIELD: `org.kohsuke.github.GHIssue.labels`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.kohsuke.github.GHPullRequest.getLabels()`

## org.kohsuke.github.GHPullRequestReview

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHPullRequestReviewComment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHRateLimit

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.kohsuke.github.GHRateLimit`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.kohsuke.github.GHRateLimit`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.kohsuke.github.GHRateLimit.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHRateLimit.getResetDate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.kohsuke.github.GHRateLimit.toString()`

## org.kohsuke.github.GHReaction

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHRelease

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

## org.kohsuke.github.GHRepository

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.kohsuke.github.GHRepository.getNetworkCount()`

## org.kohsuke.github.GHRepository$Contributor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHPerson.gravatar_id`

## org.kohsuke.github.GHTeam

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHTeam.org`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.kohsuke.github.GHTeam.getOrganization()`
+ NOW THROWS: `org.kohsuke.github.GHTeam.getOrganization()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.kohsuke.github.GHTeam.getId()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHObject.getId()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.kohsuke.github.GHTeam.getId()`
+ NEW RETURN TYPE: `org.kohsuke.github.GHObject.getId()`

## org.kohsuke.github.GHUser

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.created_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.updated_at`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHObject.url`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.kohsuke.github.GHPerson.gravatar_id`

## org.kohsuke.github.GitHub

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.kohsuke.github.GitHub.isCredentialValid()`

## org.kohsuke.github.GitHubBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.kohsuke.github.GitHubBuilder.fromCredentials()`

## org.kohsuke.github.Preview

### ANNOTATION_NEW_METHOD_WITHOUT_DEFAULT [binary ✓ | source ✗]
- ANNOTATION (new method without default): `org.kohsuke.github.Preview`

## org.kohsuke.github.Reactable

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.kohsuke.github.Reactable`
+ MUST NOW IMPLEMENT: `org.kohsuke.github.Reactable.deleteReaction(org.kohsuke.github.GHReaction)`

