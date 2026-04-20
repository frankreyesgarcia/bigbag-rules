# Breaking Changes: org.jenkins-ci.plugins:p4 1.3.8 → 1.11.5
Total: 214 (binary-breaking: 182, source-breaking: 204)

## org.jenkinsci.plugins.p4.PerforceScm

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.PerforceScm.DESCRIPTOR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.PerforceScm.buildEnvVars(hudson.model.AbstractBuild<? extends java.lang.Object,? extends java.lang.Object>,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.PerforceScm.getChanges()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.PerforceScm.getDescriptor()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.PerforceScm.getDescriptor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.PerforceScm.getDescriptor()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.PerforceScm.getDescriptor()`

## org.jenkinsci.plugins.p4.PerforceScm$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.PerforceScm$DescriptorImpl.doCheckCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.PerforceScm$DescriptorImpl.doFillCredentialItems()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.PerforceScm$DescriptorImpl.isEnabled()`

## org.jenkinsci.plugins.p4.browsers.FishEyeBrowser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser.<init>(java.net.URL,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser.rootModule`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser.url`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser.getDiffLink(com.perforce.p4java.core.file.IFileSpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser.getFileLink(com.perforce.p4java.core.file.IFileSpec)`

## org.jenkinsci.plugins.p4.browsers.FishEyeBrowser$DescriptorImpl

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser$DescriptorImpl.newInstance(org.kohsuke.stapler.StaplerRequest,net.sf.json.JSONObject)`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser$DescriptorImpl.newInstance(org.kohsuke.stapler.StaplerRequest,net.sf.json.JSONObject)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser$DescriptorImpl.newInstance(org.kohsuke.stapler.StaplerRequest,net.sf.json.JSONObject)`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.browsers.FishEyeBrowser$DescriptorImpl.newInstance(org.kohsuke.stapler.StaplerRequest,net.sf.json.JSONObject)`

## org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.<init>(java.net.URL,java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.depotPath`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.projectName`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.url`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.getDiffLink(com.perforce.p4java.core.file.IFileSpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.OpenGrokBrowser.getFileLink(com.perforce.p4java.core.file.IFileSpec)`

## org.jenkinsci.plugins.p4.browsers.P4Browser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.browsers.P4Browser.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.P4Browser.getDiffLink(com.perforce.p4java.core.file.IFileSpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.P4Browser.getFileLink(com.perforce.p4java.core.file.IFileSpec)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.browsers.P4Browser`
+ MUST NOW IMPLEMENT: `org.jenkinsci.plugins.p4.browsers.P4Browser.getFileLink(org.jenkinsci.plugins.p4.changes.P4AffectedFile)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.browsers.P4Browser`
+ MUST NOW IMPLEMENT: `org.jenkinsci.plugins.p4.browsers.P4Browser.getDiffLink(org.jenkinsci.plugins.p4.changes.P4AffectedFile,org.jenkinsci.plugins.p4.changes.P4Ref)`

## org.jenkinsci.plugins.p4.browsers.P4WebBrowser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.browsers.P4WebBrowser.<init>(java.net.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.P4WebBrowser.url`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.P4WebBrowser.getDiffLink(com.perforce.p4java.core.file.IFileSpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.P4WebBrowser.getFileLink(com.perforce.p4java.core.file.IFileSpec)`

## org.jenkinsci.plugins.p4.browsers.SwarmBrowser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.browsers.SwarmBrowser.<init>(java.net.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.browsers.SwarmBrowser.url`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.SwarmBrowser.getDiffLink(com.perforce.p4java.core.file.IFileSpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.browsers.SwarmBrowser.getFileLink(com.perforce.p4java.core.file.IFileSpec)`

## org.jenkinsci.plugins.p4.changes.P4ChangeEntry

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.files`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.jobs`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.getFiles()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.setId(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.getId()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.getId()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.getId()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.changes.P4ChangeEntry.getId()`

## org.jenkinsci.plugins.p4.changes.P4ChangeParser

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.changes.P4ChangeParser.<init>()`

## org.jenkinsci.plugins.p4.changes.P4ChangeParser$ChangeLogHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.changes.P4ChangeParser$ChangeLogHandler.<init>(hudson.model.Run<? extends java.lang.Object,? extends java.lang.Object>,hudson.scm.RepositoryBrowser<? extends java.lang.Object>)`

## org.jenkinsci.plugins.p4.client.ClientHelper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.client.ClientHelper.<init>(java.lang.String,hudson.model.TaskListener,java.lang.String,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.client.ClientHelper.<init>(org.jenkinsci.plugins.p4.credentials.P4BaseCredentials,hudson.model.TaskListener,java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.authorisationConfig`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.connection`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.connectionConfig`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.listener`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.p4credential`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.client.ConnectionHelper.disconnect()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.buildChange()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.listChanges(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.listChanges(org.jenkinsci.plugins.p4.changes.P4Revision,org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.listHaveChanges()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.listHaveChanges(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.setClient(org.jenkinsci.plugins.p4.workspace.Workspace)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.syncFiles(org.jenkinsci.plugins.p4.changes.P4Revision,org.jenkinsci.plugins.p4.populate.Populate)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.unshelveFiles(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ClientHelper.versionFile(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChange(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChangeFiles(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChangeSummary(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.stop()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.client.ClientHelper.getClientHead()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.ClientHelper.getClientHead()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.client.ClientHelper.listChanges()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.ClientHelper.listChanges()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.client.ClientHelper.publishChange(org.jenkinsci.plugins.p4.publish.Publish)`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.ClientHelper.publishChange(org.jenkinsci.plugins.p4.publish.Publish)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.client.ClientHelper.getClientHead()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.ClientHelper.getClientHead()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.client.ClientHelper.publishChange(org.jenkinsci.plugins.p4.publish.Publish)`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.ClientHelper.publishChange(org.jenkinsci.plugins.p4.publish.Publish)`

## org.jenkinsci.plugins.p4.client.ConnectionConfig

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.client.ConnectionConfig.<init>(java.lang.String,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.client.ConnectionHelper

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.authorisationConfig`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.connection`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.connectionConfig`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.listener`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.p4credential`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.client.ConnectionHelper.disconnect()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(java.lang.String,hudson.model.TaskListener)`
+ NOW THROWS: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(java.lang.String,hudson.model.TaskListener)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(org.jenkinsci.plugins.p4.credentials.P4BaseCredentials)`
+ NOW THROWS: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(org.jenkinsci.plugins.p4.credentials.P4BaseCredentials)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(org.jenkinsci.plugins.p4.credentials.P4BaseCredentials,hudson.model.TaskListener)`
+ NOW THROWS: `org.jenkinsci.plugins.p4.client.ConnectionHelper.<init>(org.jenkinsci.plugins.p4.credentials.P4BaseCredentials,hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChange(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChangeFiles(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.getChangeSummary(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.ConnectionHelper.stop()`

## org.jenkinsci.plugins.p4.client.NavigateHelper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.client.NavigateHelper.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.client.NavigateHelper.getPath(java.lang.String)`

## org.jenkinsci.plugins.p4.client.Validate

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.client.Validate.check(java.util.List<com.perforce.p4java.core.file.IFileSpec>,java.lang.String[])`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.Validate.check(java.util.List<com.perforce.p4java.core.file.IFileSpec>,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.client.Validate.check(java.util.List<com.perforce.p4java.core.file.IFileSpec>,java.lang.String[])`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.client.Validate.check(java.util.List<com.perforce.p4java.core.file.IFileSpec>,java.lang.String[])`

## org.jenkinsci.plugins.p4.console.P4Logging

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.console.P4Logging.<init>(hudson.model.TaskListener)`

## org.jenkinsci.plugins.p4.credentials.P4BaseCredentials

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.credentials.P4BaseCredentials.<init>(com.cloudbees.plugins.credentials.CredentialsScope,java.lang.String,java.lang.String,java.lang.String,org.jenkinsci.plugins.p4.credentials.TrustImpl,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.credentials.P4BaseCredentials.isSsl()`

## org.jenkinsci.plugins.p4.credentials.P4PasswordImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.credentials.P4PasswordImpl.<init>(com.cloudbees.plugins.credentials.CredentialsScope,java.lang.String,java.lang.String,java.lang.String,org.jenkinsci.plugins.p4.credentials.TrustImpl,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.credentials.P4BaseCredentials.isSsl()`

## org.jenkinsci.plugins.p4.credentials.P4PasswordImpl$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.credentials.P4PasswordImpl$DescriptorImpl.doTestConnection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

## org.jenkinsci.plugins.p4.credentials.P4TicketImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.credentials.P4TicketImpl.<init>(com.cloudbees.plugins.credentials.CredentialsScope,java.lang.String,java.lang.String,java.lang.String,org.jenkinsci.plugins.p4.credentials.TrustImpl,java.lang.String,java.lang.String,java.lang.String,org.jenkinsci.plugins.p4.credentials.TicketModeImpl)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.credentials.P4BaseCredentials.isSsl()`

## org.jenkinsci.plugins.p4.credentials.P4TicketImpl$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.credentials.P4TicketImpl$DescriptorImpl.doTestConnection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

## org.jenkinsci.plugins.p4.filters.FilterPerChangeImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.filters.FilterPerChangeImpl.getNextChange()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.filters.FilterPerChangeImpl.setNextChange(int)`

## org.jenkinsci.plugins.p4.populate.AutoCleanImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.populate.AutoCleanImpl.<init>(boolean,boolean,boolean,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.populate.CheckOnlyImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.populate.CheckOnlyImpl.<init>(boolean,boolean,boolean,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.populate.ForceCleanImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.populate.ForceCleanImpl.<init>(boolean,boolean,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.populate.Populate

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.populate.Populate.<init>(boolean,boolean,boolean,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.populate.PopulateDescriptor

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.populate.PopulateDescriptor`
+ MUST NOW IMPLEMENT: `org.jenkinsci.plugins.p4.populate.PopulateDescriptor.isGraphCompatible()`

## org.jenkinsci.plugins.p4.populate.SyncOnlyImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.populate.SyncOnlyImpl.<init>(boolean,boolean,boolean,boolean,java.lang.String)`

## org.jenkinsci.plugins.p4.publish.Publish

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.publish.Publish.<init>(java.lang.String,boolean)`

## org.jenkinsci.plugins.p4.publish.PublishNotifier$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.publish.PublishNotifier$DescriptorImpl.doFillCredentialItems()`

## org.jenkinsci.plugins.p4.publish.ShelveImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.publish.ShelveImpl.<init>(java.lang.String,boolean,boolean)`

## org.jenkinsci.plugins.p4.publish.SubmitImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.publish.SubmitImpl.<init>(java.lang.String,boolean,boolean)`

## org.jenkinsci.plugins.p4.review.ReviewAction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.review.ReviewAction.<init>(hudson.model.AbstractProject<? extends java.lang.Object,? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.review.ReviewAction.getProject()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.review.ReviewAction.getProject()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.review.ReviewAction.getProject()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.review.ReviewAction.getProject()`

## org.jenkinsci.plugins.p4.review.ReviewProp

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.jenkinsci.plugins.p4.review.ReviewProp.NAMESPACE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.CHANGE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.FAIL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.LABEL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.PASS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.REVIEW`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.review.ReviewProp.STATUS`

## org.jenkinsci.plugins.p4.tagging.TagAction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tagging.TagAction.<init>(hudson.model.Run<? extends java.lang.Object,? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.jenkinsci.plugins.p4.tagging.TagAction.getLabel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tagging.TagAction.setCredential(java.lang.String)`

## org.jenkinsci.plugins.p4.tagging.TagNotifier

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.tagging.TagNotifier.LOGGER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tagging.TagNotifier.log(java.lang.String)`

## org.jenkinsci.plugins.p4.tagging.TagNotifierStep

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.jenkinsci.plugins.p4.tagging.TagNotifier.LOGGER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tagging.TagNotifier.log(java.lang.String)`

## org.jenkinsci.plugins.p4.tasks.AbstractTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.AbstractTask.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

## org.jenkinsci.plugins.p4.tasks.CheckoutTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.<init>(org.jenkinsci.plugins.p4.populate.Populate)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getChanges(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getChangesFull(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.setBuildChange(org.jenkinsci.plugins.p4.changes.P4Revision)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getBuildChange()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getBuildChange()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getReview()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getReview()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getSyncChange()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getSyncChange()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getBuildChange()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getBuildChange()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getReview()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getReview()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getSyncChange()`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.CheckoutTask.getSyncChange()`

## org.jenkinsci.plugins.p4.tasks.PollTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.PollTask.<init>(java.util.List<org.jenkinsci.plugins.p4.filters.Filter>)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.jenkinsci.plugins.p4.tasks.PollTask.invoke(java.io.File,hudson.remoting.VirtualChannel)`
+ NEW RETURN TYPE: `org.jenkinsci.plugins.p4.tasks.PollTask.invoke(java.io.File,hudson.remoting.VirtualChannel)`

## org.jenkinsci.plugins.p4.tasks.PublishTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.PublishTask.<init>(org.jenkinsci.plugins.p4.publish.Publish)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

## org.jenkinsci.plugins.p4.tasks.RemoveClientTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.RemoveClientTask.<init>(java.lang.String,java.lang.String,org.jenkinsci.plugins.p4.populate.Populate)`

## org.jenkinsci.plugins.p4.tasks.TaggingTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.TaggingTask.<init>(java.lang.String,java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

## org.jenkinsci.plugins.p4.tasks.UnshelveTask

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.tasks.UnshelveTask.<init>(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getCredential()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getClient()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setListener(hudson.model.TaskListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.AbstractTask.setNextChange(org.jenkinsci.plugins.p4.workspace.Workspace,java.util.List<java.lang.Integer>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.tasks.UnshelveTask.setShelf(int)`

## org.jenkinsci.plugins.p4.trigger.P4Trigger

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.trigger.P4Trigger.getLogFile()`

## org.jenkinsci.plugins.p4.workflow.P4PublishStep

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4PublishStep`

## org.jenkinsci.plugins.p4.workflow.P4PublishStep$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4PublishStep$DescriptorImpl.doCheckCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4PublishStep$DescriptorImpl.doFillCredentialItems()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4PublishStep$DescriptorImpl`

## org.jenkinsci.plugins.p4.workflow.P4PublishStep$P4PublishStepExecution

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.workflow.P4PublishStep$P4PublishStepExecution.<init>()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4PublishStep$P4PublishStepExecution`

## org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doAutoCompleteStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doAutoCompleteTemplate(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doCheckCredential(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doCheckPath(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doCheckStream(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doCheckTemplate(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.jenkinsci.plugins.p4.workflow.P4Step$DescriptorImpl.doFillCredentialItems()`

## org.jenkinsci.plugins.p4.workflow.P4TaggingStep

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4TaggingStep`

## org.jenkinsci.plugins.p4.workflow.P4TaggingStep$DescriptorImpl

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4TaggingStep$DescriptorImpl`

## org.jenkinsci.plugins.p4.workflow.P4TaggingStep$P4TaggingStepExecution

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.workflow.P4TaggingStep$P4TaggingStepExecution.<init>()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4TaggingStep$P4TaggingStepExecution`

## org.jenkinsci.plugins.p4.workflow.P4UnshelveStep

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4UnshelveStep`

## org.jenkinsci.plugins.p4.workflow.P4UnshelveStep$DescriptorImpl

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4UnshelveStep$DescriptorImpl`

## org.jenkinsci.plugins.p4.workflow.P4UnshelveStep$P4UnshelveStepExecution

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.workflow.P4UnshelveStep$P4UnshelveStepExecution.<init>()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workflow.P4UnshelveStep$P4UnshelveStepExecution`

## org.jenkinsci.plugins.p4.workspace.ManualWorkspaceImpl

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.ManualWorkspaceImpl.clone()`

## org.jenkinsci.plugins.p4.workspace.SpecWorkspaceImpl

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

## org.jenkinsci.plugins.p4.workspace.StaticWorkspaceImpl

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

## org.jenkinsci.plugins.p4.workspace.StreamDescImpl

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.jenkinsci.plugins.p4.workspace.StreamDescImpl`

## org.jenkinsci.plugins.p4.workspace.StreamWorkspaceImpl

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

## org.jenkinsci.plugins.p4.workspace.TemplateWorkspaceImpl

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

## org.jenkinsci.plugins.p4.workspace.Workspace

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.jenkinsci.plugins.p4.workspace.Workspace.<init>(java.lang.String,boolean)`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`
+ NOW THROWS: `org.jenkinsci.plugins.p4.workspace.Workspace.clone()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.jenkinsci.plugins.p4.workspace.Workspace`
+ MUST NOW IMPLEMENT: `org.jenkinsci.plugins.p4.workspace.Workspace.setName(java.lang.String)`

