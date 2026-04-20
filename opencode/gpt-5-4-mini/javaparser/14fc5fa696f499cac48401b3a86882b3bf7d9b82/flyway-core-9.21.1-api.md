# API Specification: org.flywaydb:flyway-core 9.21.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `org.flywaydb.core.Flyway`

**Constructors:**
- `public Flyway(org.flywaydb.core.api.configuration.Configuration p0)`

**Methods:**
- `public org.flywaydb.core.api.output.BaselineResult baseline() throws org.flywaydb.core.api.FlywayException`
- `public org.flywaydb.core.api.output.CleanResult clean()`
- `public static org.flywaydb.core.api.configuration.FluentConfiguration configure()`
- `public static org.flywaydb.core.api.configuration.FluentConfiguration configure(java.lang.ClassLoader p0)`
- `public org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public org.flywaydb.core.api.MigrationInfoService info()`
- `public org.flywaydb.core.api.output.MigrateResult migrate() throws org.flywaydb.core.api.FlywayException`
- `public org.flywaydb.core.api.output.RepairResult repair() throws org.flywaydb.core.api.FlywayException`
- `public void setFlywayTelemetryManager(org.flywaydb.core.FlywayTelemetryManager p0)`
- `public org.flywaydb.core.api.output.UndoResult undo() throws org.flywaydb.core.api.FlywayException`
- `public void validate() throws org.flywaydb.core.api.FlywayException`
- `public org.flywaydb.core.api.output.ValidateResult validateWithResult() throws org.flywaydb.core.api.FlywayException`

---

## public class `org.flywaydb.core.FlywayExecutor`

**Constructors:**
- `public FlywayExecutor(org.flywaydb.core.api.configuration.Configuration p0)`

**Methods:**
- `public <T extends java.lang.Object> T execute(org.flywaydb.core.FlywayExecutor$Command p0, boolean p1)`

---

## public abstract static interface `org.flywaydb.core.FlywayExecutor$Command`<T extends java.lang.Object>

**Methods:**
- `public abstract T execute(org.flywaydb.core.internal.resolver.CompositeMigrationResolver p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.internal.database.base.Database p2, org.flywaydb.core.internal.database.base.Schema p3, org.flywaydb.core.internal.database.base.Schema[] p4, org.flywaydb.core.internal.callback.CallbackExecutor p5, org.flywaydb.core.internal.jdbc.StatementInterceptor p6)`

---

## public class `org.flywaydb.core.FlywayTelemetryManager`
implements `java.lang.AutoCloseable`  

**Constructors:**
- `public FlywayTelemetryManager(org.flywaydb.core.internal.plugin.PluginRegister p0)`

**Methods:**
- `public void close() throws java.lang.Exception`
- `public org.flywaydb.core.extensibility.RootTelemetryModel getRootTelemetryModel()`
- `public void logEvent(org.flywaydb.core.extensibility.EventTelemetryModel p0)`
- `public void setRootTelemetryModel(org.flywaydb.core.extensibility.RootTelemetryModel p0)`

---

## public abstract interface `org.flywaydb.core.api.ClassProvider`<I extends java.lang.Object>

**Methods:**
- `public abstract java.util.Collection getClasses()`

---

## public final enum `org.flywaydb.core.api.CoreMigrationType`
extends `java.lang.Enum`  
implements `org.flywaydb.core.extensibility.MigrationType`  

**Fields:**
- `public final static org.flywaydb.core.api.CoreMigrationType BASELINE`
- `public final static org.flywaydb.core.api.CoreMigrationType CUSTOM`
- `public final static org.flywaydb.core.api.CoreMigrationType DELETE`
- `public final static org.flywaydb.core.api.CoreMigrationType JDBC`
- `public final static org.flywaydb.core.api.CoreMigrationType SCHEMA`
- `public final static org.flywaydb.core.api.CoreMigrationType SCRIPT`
- `public final static org.flywaydb.core.api.CoreMigrationType SCRIPT_BASELINE`
- `public final static org.flywaydb.core.api.CoreMigrationType SQL`
- `public final static org.flywaydb.core.api.CoreMigrationType UNDO_SCRIPT`

**Methods:**
- `public static org.flywaydb.core.extensibility.MigrationType fromString(java.lang.String p0)`
- `public boolean isBaseline()`
- `public boolean isSynthetic()`
- `public boolean isUndo()`

---

## public final enum `org.flywaydb.core.api.ErrorCode`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.api.ErrorCode APPLIED_REPEATABLE_MIGRATION_NOT_RESOLVED`
- `public final static org.flywaydb.core.api.ErrorCode APPLIED_VERSIONED_MIGRATION_NOT_RESOLVED`
- `public final static org.flywaydb.core.api.ErrorCode CHECKSUM_MISMATCH`
- `public final static org.flywaydb.core.api.ErrorCode CONFIGURATION`
- `public final static org.flywaydb.core.api.ErrorCode DB_CONNECTION`
- `public final static org.flywaydb.core.api.ErrorCode DESCRIPTION_MISMATCH`
- `public final static org.flywaydb.core.api.ErrorCode DUPLICATE_DELETED_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode DUPLICATE_REPEATABLE_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode DUPLICATE_UNDO_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode DUPLICATE_VERSIONED_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode ERROR`
- `public final static org.flywaydb.core.api.ErrorCode FAILED_REPEATABLE_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode FAILED_VERSIONED_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode FAULT`
- `public final static org.flywaydb.core.api.ErrorCode JDBC_DRIVER`
- `public final static org.flywaydb.core.api.ErrorCode NON_EMPTY_SCHEMA_WITHOUT_SCHEMA_HISTORY_TABLE`
- `public final static org.flywaydb.core.api.ErrorCode OUTDATED_REPEATABLE_MIGRATION`
- `public final static org.flywaydb.core.api.ErrorCode RESOLVED_REPEATABLE_MIGRATION_NOT_APPLIED`
- `public final static org.flywaydb.core.api.ErrorCode RESOLVED_VERSIONED_MIGRATION_NOT_APPLIED`
- `public final static org.flywaydb.core.api.ErrorCode SCHEMA_DOES_NOT_EXIST`
- `public final static org.flywaydb.core.api.ErrorCode TYPE_MISMATCH`
- `public final static org.flywaydb.core.api.ErrorCode VALIDATE_ERROR`

---

## public class `org.flywaydb.core.api.ErrorDetails`

**Constructors:**
- `public ErrorDetails(org.flywaydb.core.api.ErrorCode p0, java.lang.String p1)`

**Fields:**
- `public final org.flywaydb.core.api.ErrorCode errorCode`
- `public final java.lang.String errorMessage`

---

## public class `org.flywaydb.core.api.FlywayException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public FlywayException()`
- `public FlywayException(java.lang.String p0)`
- `public FlywayException(java.lang.String p0, java.lang.Throwable p1)`
- `public FlywayException(java.lang.String p0, java.lang.Throwable p1, org.flywaydb.core.api.ErrorCode p2)`
- `public FlywayException(java.lang.String p0, org.flywaydb.core.api.ErrorCode p1)`
- `public FlywayException(java.lang.Throwable p0)`

**Methods:**
- `public org.flywaydb.core.api.ErrorCode getErrorCode()`

---

## public final class `org.flywaydb.core.api.Location`
implements `java.lang.Comparable<org.flywaydb.core.api.Location>`  

**Constructors:**
- `public Location(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String FILESYSTEM_PREFIX`

**Methods:**
- `public int compareTo(org.flywaydb.core.api.Location p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDescriptor()`
- `public java.lang.String getPath()`
- `public java.util.regex.Pattern getPathRegex()`
- `public java.lang.String getPathRelativeToThis(java.lang.String p0)`
- `public java.lang.String getPrefix()`
- `public java.lang.String getRootPath()`
- `public int hashCode()`
- `public boolean isAwsS3()`
- `public boolean isClassPath()`
- `public boolean isFileSystem()`
- `public boolean isGCS()`
- `public boolean isParentOf(org.flywaydb.core.api.Location p0)`
- `public boolean matchesPath(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.flywaydb.core.api.MigrationInfo`
implements `java.lang.Comparable<org.flywaydb.core.api.MigrationInfo>`  

**Methods:**
- `public abstract int compareVersion(org.flywaydb.core.api.MigrationInfo p0)`
- `public abstract java.lang.Integer getChecksum()`
- `public abstract java.lang.String getDescription()`
- `public abstract java.lang.Integer getExecutionTime()`
- `public abstract java.lang.String getInstalledBy()`
- `public abstract java.util.Date getInstalledOn()`
- `public abstract java.lang.Integer getInstalledRank()`
- `public abstract java.lang.String getPhysicalLocation()`
- `public abstract java.lang.String getScript()`
- `public abstract org.flywaydb.core.api.MigrationState getState()`
- `public abstract org.flywaydb.core.extensibility.MigrationType getType()`
- `public abstract org.flywaydb.core.api.MigrationVersion getVersion()`
- `public default boolean isVersioned()`

---

## public abstract interface `org.flywaydb.core.api.MigrationInfoService`
implements `org.flywaydb.core.api.InfoOutputProvider`  

**Methods:**
- `public abstract org.flywaydb.core.api.MigrationInfo[] all()`
- `public abstract org.flywaydb.core.api.MigrationInfo[] applied()`
- `public abstract org.flywaydb.core.api.MigrationInfo current()`
- `public abstract org.flywaydb.core.api.MigrationInfo[] pending()`

---

## public class `org.flywaydb.core.api.MigrationPattern`

**Constructors:**
- `public MigrationPattern(java.lang.String p0)`

**Methods:**
- `public int hashCode()`
- `public boolean matches(org.flywaydb.core.api.MigrationVersion p0, java.lang.String p1)`
- `public java.lang.String toString()`

---

## public final enum `org.flywaydb.core.api.MigrationState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.api.MigrationState ABOVE_TARGET`
- `public final static org.flywaydb.core.api.MigrationState AVAILABLE`
- `public final static org.flywaydb.core.api.MigrationState BASELINE`
- `public final static org.flywaydb.core.api.MigrationState BASELINE_IGNORED`
- `public final static org.flywaydb.core.api.MigrationState BELOW_BASELINE`
- `public final static org.flywaydb.core.api.MigrationState DELETED`
- `public final static org.flywaydb.core.api.MigrationState FAILED`
- `public final static org.flywaydb.core.api.MigrationState FUTURE_FAILED`
- `public final static org.flywaydb.core.api.MigrationState FUTURE_SUCCESS`
- `public final static org.flywaydb.core.api.MigrationState IGNORED`
- `public final static org.flywaydb.core.api.MigrationState MISSING_FAILED`
- `public final static org.flywaydb.core.api.MigrationState MISSING_SUCCESS`
- `public final static org.flywaydb.core.api.MigrationState OUTDATED`
- `public final static org.flywaydb.core.api.MigrationState OUT_OF_ORDER`
- `public final static org.flywaydb.core.api.MigrationState PENDING`
- `public final static org.flywaydb.core.api.MigrationState SUCCESS`
- `public final static org.flywaydb.core.api.MigrationState SUPERSEDED`
- `public final static org.flywaydb.core.api.MigrationState UNDONE`

**Methods:**
- `public java.lang.String getDisplayName()`
- `public java.lang.String getPattern()`
- `public boolean isApplied()`
- `public boolean isFailed()`
- `public boolean isResolved()`

---

## public final class `org.flywaydb.core.api.MigrationVersion`
implements `java.lang.Comparable<org.flywaydb.core.api.MigrationVersion>`  

**Fields:**
- `public final static org.flywaydb.core.api.MigrationVersion CURRENT`
- `public final static org.flywaydb.core.api.MigrationVersion EMPTY`
- `public final static org.flywaydb.core.api.MigrationVersion LATEST`
- `public final static org.flywaydb.core.api.MigrationVersion NEXT`

**Methods:**
- `public int compareTo(org.flywaydb.core.api.MigrationVersion p0)`
- `public boolean equals(java.lang.Object p0)`
- `public static org.flywaydb.core.api.MigrationVersion fromVersion(java.lang.String p0)`
- `public java.math.BigInteger getMajor()`
- `public java.lang.String getMajorAsString()`
- `public java.lang.String getMinorAsString()`
- `public java.lang.String getName()`
- `public java.lang.String getRawVersion()`
- `public java.lang.String getVersion()`
- `public int hashCode()`
- `public boolean isAtLeast(java.lang.String p0)`
- `public boolean isMajorNewerThan(java.lang.String p0)`
- `public boolean isNewerThan(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.flywaydb.core.api.ResourceProvider`

**Methods:**
- `public abstract org.flywaydb.core.api.resource.LoadableResource getResource(java.lang.String p0)`
- `public abstract java.util.Collection getResources(java.lang.String p0, java.lang.String[] p1)`

---

## public abstract class `org.flywaydb.core.api.callback.BaseCallback`
implements `org.flywaydb.core.api.callback.Callback`  

**Constructors:**
- `public BaseCallback()`

**Methods:**
- `public boolean canHandleInTransaction(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`
- `public java.lang.String getCallbackName()`
- `public boolean supports(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`

---

## public abstract interface `org.flywaydb.core.api.callback.Callback`

**Methods:**
- `public abstract boolean canHandleInTransaction(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`
- `public abstract java.lang.String getCallbackName()`
- `public abstract void handle(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`
- `public abstract boolean supports(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`

---

## public abstract interface `org.flywaydb.core.api.callback.Context`

**Methods:**
- `public abstract org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public abstract java.sql.Connection getConnection()`
- `public abstract org.flywaydb.core.api.MigrationInfo getMigrationInfo()`
- `public abstract org.flywaydb.core.api.output.OperationResult getOperationResult()`
- `public abstract org.flywaydb.core.api.callback.Statement getStatement()`

---

## public abstract interface `org.flywaydb.core.api.callback.Error`

**Methods:**
- `public abstract int getCode()`
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.String getState()`
- `public abstract boolean isHandled()`
- `public abstract void setHandled(boolean p0)`

---

## public final enum `org.flywaydb.core.api.callback.Event`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.api.callback.Event AFTER_BASELINE`
- `public final static org.flywaydb.core.api.callback.Event AFTER_BASELINE_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_BASELINE_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_CLEAN`
- `public final static org.flywaydb.core.api.callback.Event AFTER_CLEAN_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_CLEAN_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_MIGRATE`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_MIGRATE_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_MIGRATE_STATEMENT`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_MIGRATE_STATEMENT_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_UNDO`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_UNDO_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_UNDO_STATEMENT`
- `public final static org.flywaydb.core.api.callback.Event AFTER_EACH_UNDO_STATEMENT_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_INFO`
- `public final static org.flywaydb.core.api.callback.Event AFTER_INFO_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_INFO_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_MIGRATE`
- `public final static org.flywaydb.core.api.callback.Event AFTER_MIGRATE_APPLIED`
- `public final static org.flywaydb.core.api.callback.Event AFTER_MIGRATE_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_MIGRATE_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_REPAIR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_REPAIR_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_REPAIR_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_UNDO`
- `public final static org.flywaydb.core.api.callback.Event AFTER_UNDO_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_UNDO_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_VALIDATE`
- `public final static org.flywaydb.core.api.callback.Event AFTER_VALIDATE_ERROR`
- `public final static org.flywaydb.core.api.callback.Event AFTER_VALIDATE_OPERATION_FINISH`
- `public final static org.flywaydb.core.api.callback.Event AFTER_VERSIONED`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_BASELINE`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_CLEAN`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_CONNECT`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_EACH_MIGRATE`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_EACH_MIGRATE_STATEMENT`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_EACH_UNDO`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_EACH_UNDO_STATEMENT`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_INFO`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_MIGRATE`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_REPAIR`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_REPEATABLES`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_UNDO`
- `public final static org.flywaydb.core.api.callback.Event BEFORE_VALIDATE`
- `public final static org.flywaydb.core.api.callback.Event CREATE_SCHEMA`

**Methods:**
- `public static org.flywaydb.core.api.callback.Event fromId(java.lang.String p0)`
- `public java.lang.String getId()`
- `public java.lang.String toString()`

---

## public abstract interface `org.flywaydb.core.api.callback.Statement`

**Methods:**
- `public abstract java.util.List getErrors()`
- `public abstract java.lang.String getSql()`
- `public abstract java.util.List getWarnings()`

---

## public abstract interface `org.flywaydb.core.api.callback.Warning`

**Methods:**
- `public abstract int getCode()`
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.String getState()`
- `public abstract boolean isHandled()`
- `public abstract void setHandled(boolean p0)`

---

## public class `org.flywaydb.core.api.configuration.ClassicConfiguration`
implements `org.flywaydb.core.api.configuration.Configuration`  

**Constructors:**
- `public ClassicConfiguration()`
- `public ClassicConfiguration(java.lang.ClassLoader p0)`
- `public ClassicConfiguration(org.flywaydb.core.api.configuration.Configuration p0)`
- `public ClassicConfiguration(org.flywaydb.core.internal.configuration.models.ConfigurationModel p0)`

**Fields:**
- `public final static java.lang.String TEMP_ENVIRONMENT_NAME`

**Methods:**
- `public void configure(java.util.Map p0)`
- `public void configure(java.util.Properties p0)`
- `public void configure(org.flywaydb.core.api.configuration.Configuration p0)`
- `public void configureUsingEnvVars()`
- `public java.lang.String getBaselineDescription()`
- `public org.flywaydb.core.api.MigrationVersion getBaselineVersion()`
- `public org.flywaydb.core.api.callback.Callback[] getCallbacks()`
- `public org.flywaydb.core.api.MigrationPattern[] getCherryPick()`
- `public java.lang.ClassLoader getClassLoader()`
- `public int getConnectRetries()`
- `public int getConnectRetriesInterval()`
- `public org.flywaydb.core.internal.configuration.models.ResolvedEnvironment getCurrentResolvedEnvironment()`
- `public javax.sql.DataSource getDataSource()`
- `public org.flywaydb.core.internal.database.DatabaseType getDatabaseType()`
- `public java.lang.String getDefaultSchema()`
- `public java.lang.String getDriver()`
- `public java.io.OutputStream getDryRunOutput()`
- `public java.nio.charset.Charset getEncoding()`
- `public java.lang.String[] getErrorOverrides()`
- `public org.flywaydb.core.api.pattern.ValidatePattern[] getIgnoreMigrationPatterns()`
- `public java.lang.String getInitSql()`
- `public java.lang.String getInstalledBy()`
- `public org.flywaydb.core.api.ClassProvider getJavaMigrationClassProvider()`
- `public org.flywaydb.core.api.migration.JavaMigration[] getJavaMigrations()`
- `public java.util.Map getJdbcProperties()`
- `public java.lang.String getKerberosConfigFile()`
- `public java.lang.String getLicenseKey()`
- `public org.flywaydb.core.api.Location[] getLocations()`
- `public int getLockRetryCount()`
- `public java.lang.String[] getLoggers()`
- `public org.flywaydb.core.internal.configuration.models.ConfigurationModel getModernConfig()`
- `public java.lang.String getPassword()`
- `public java.lang.String getPlaceholderPrefix()`
- `public java.lang.String getPlaceholderSeparator()`
- `public java.lang.String getPlaceholderSuffix()`
- `public java.util.Map getPlaceholders()`
- `public org.flywaydb.core.internal.plugin.PluginRegister getPluginRegister()`
- `public java.lang.String getRepeatableSqlMigrationPrefix()`
- `public java.lang.String getReportFilename()`
- `public org.flywaydb.core.internal.configuration.models.ResolvedEnvironment getResolvedEnvironment(java.lang.String p0)`
- `public org.flywaydb.core.api.resolver.MigrationResolver[] getResolvers()`
- `public org.flywaydb.core.api.ResourceProvider getResourceProvider()`
- `public java.lang.String[] getSchemas()`
- `public java.lang.String getScriptPlaceholderPrefix()`
- `public java.lang.String getScriptPlaceholderSuffix()`
- `public java.lang.String getSqlMigrationPrefix()`
- `public java.lang.String getSqlMigrationSeparator()`
- `public java.lang.String[] getSqlMigrationSuffixes()`
- `public java.lang.String getTable()`
- `public java.lang.String getTablespace()`
- `public org.flywaydb.core.api.MigrationVersion getTarget()`
- `public java.lang.String getUndoSqlMigrationPrefix()`
- `public java.lang.String getUrl()`
- `public java.lang.String getUser()`
- `public java.lang.String getWorkingDirectory()`
- `public boolean isBaselineOnMigrate()`
- `public boolean isBatch()`
- `public boolean isCleanDisabled()`
- `public boolean isCleanOnValidationError()`
- `public boolean isCreateSchemas()`
- `public boolean isDetectEncoding()`
- `public boolean isExecuteInTransaction()`
- `public boolean isFailOnMissingLocations()`
- `public boolean isFailOnMissingTarget()`
- `public boolean isGroup()`
- `public boolean isMixed()`
- `public boolean isOutOfOrder()`
- `public boolean isOutputQueryResults()`
- `public boolean isPlaceholderReplacement()`
- `public boolean isReportEnabled()`
- `public boolean isSkipDefaultCallbacks()`
- `public boolean isSkipDefaultResolvers()`
- `public boolean isSkipExecutingMigrations()`
- `public boolean isStream()`
- `public boolean isValidateMigrationNaming()`
- `public boolean isValidateOnMigrate()`
- `public java.util.List loadCallbackLocation(java.lang.String p0, boolean p1)`
- `public void setBaselineDescription(java.lang.String p0)`
- `public void setBaselineOnMigrate(java.lang.Boolean p0)`
- `public void setBaselineVersion(java.lang.String p0)`
- `public void setBaselineVersion(org.flywaydb.core.api.MigrationVersion p0)`
- `public void setBaselineVersionAsString(java.lang.String p0)`
- `public void setBatch(boolean p0)`
- `public void setCallbacks(org.flywaydb.core.api.callback.Callback... p0)`
- `public void setCallbacksAsClassNames(java.lang.String... p0)`
- `public void setCherryPick(java.lang.String... p0)`
- `public void setCherryPick(org.flywaydb.core.api.MigrationPattern... p0)`
- `public void setClassLoader(java.lang.ClassLoader p0)`
- `public void setCleanDisabled(java.lang.Boolean p0)`
- `public void setCleanOnValidationError(java.lang.Boolean p0)`
- `public void setConnectRetries(int p0)`
- `public void setConnectRetriesInterval(int p0)`
- `public void setDataSource(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public void setDataSource(javax.sql.DataSource p0)`
- `public void setDefaultSchema(java.lang.String p0)`
- `public void setDetectEncoding(boolean p0)`
- `public void setDriver(java.lang.String p0)`
- `public void setDryRunOutput(java.io.OutputStream p0)`
- `public void setDryRunOutputAsFile(java.io.File p0)`
- `public void setDryRunOutputAsFileName(java.lang.String p0)`
- `public void setEncoding(java.nio.charset.Charset p0)`
- `public void setEncodingAsString(java.lang.String p0)`
- `public void setErrorOverrides(java.lang.String... p0)`
- `public void setExecuteInTransaction(boolean p0)`
- `public void setFailOnMissingLocations(java.lang.Boolean p0)`
- `public void setGroup(java.lang.Boolean p0)`
- `public void setIgnoreMigrationPatterns(java.lang.String... p0)`
- `public void setIgnoreMigrationPatterns(org.flywaydb.core.api.pattern.ValidatePattern... p0)`
- `public void setInitSql(java.lang.String p0)`
- `public void setInstalledBy(java.lang.String p0)`
- `public void setJavaMigrationClassProvider(org.flywaydb.core.api.ClassProvider p0)`
- `public void setJavaMigrations(org.flywaydb.core.api.migration.JavaMigration... p0)`
- `public void setJdbcProperties(java.util.Map p0)`
- `public void setKerberosConfigFile(java.lang.String p0)`
- `public void setLicenseKey(java.lang.String p0)`
- `public void setLocations(org.flywaydb.core.api.Location... p0)`
- `public void setLocationsAsStrings(java.lang.String... p0)`
- `public void setLockRetryCount(java.lang.Integer p0)`
- `public void setLoggers(java.lang.String... p0)`
- `public void setMixed(java.lang.Boolean p0)`
- `public void setModernConfig(org.flywaydb.core.internal.configuration.models.ConfigurationModel p0)`
- `public void setOutOfOrder(java.lang.Boolean p0)`
- `public void setOutputQueryResults(boolean p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPlaceholderPrefix(java.lang.String p0)`
- `public void setPlaceholderReplacement(java.lang.Boolean p0)`
- `public void setPlaceholderSeparator(java.lang.String p0)`
- `public void setPlaceholderSuffix(java.lang.String p0)`
- `public void setPlaceholders(java.util.Map p0)`
- `public void setPluginRegister(org.flywaydb.core.internal.plugin.PluginRegister p0)`
- `public void setRepeatableSqlMigrationPrefix(java.lang.String p0)`
- `public void setReportEnabled(java.lang.Boolean p0)`
- `public void setReportFilename(java.lang.String p0)`
- `public void setResolvers(org.flywaydb.core.api.resolver.MigrationResolver... p0)`
- `public void setResolversAsClassNames(java.lang.String... p0)`
- `public void setResourceProvider(org.flywaydb.core.api.ResourceProvider p0)`
- `public void setSchemas(java.lang.String[] p0)`
- `public void setScriptPlaceholderPrefix(java.lang.String p0)`
- `public void setScriptPlaceholderSuffix(java.lang.String p0)`
- `public void setShouldCreateSchemas(boolean p0)`
- `public void setSkipDefaultCallbacks(java.lang.Boolean p0)`
- `public void setSkipDefaultResolvers(java.lang.Boolean p0)`
- `public void setSkipExecutingMigrations(boolean p0)`
- `public void setSqlMigrationPrefix(java.lang.String p0)`
- `public void setSqlMigrationSeparator(java.lang.String p0)`
- `public void setSqlMigrationSuffixes(java.lang.String... p0)`
- `public void setStream(boolean p0)`
- `public void setTable(java.lang.String p0)`
- `public void setTablespace(java.lang.String p0)`
- `public void setTarget(org.flywaydb.core.api.MigrationVersion p0)`
- `public void setTargetAsString(java.lang.String p0)`
- `public void setUndoSqlMigrationPrefix(java.lang.String p0)`
- `public void setUrl(java.lang.String p0)`
- `public void setUser(java.lang.String p0)`
- `public void setValidateMigrationNaming(java.lang.Boolean p0)`
- `public void setValidateOnMigrate(java.lang.Boolean p0)`
- `public void setWorkingDirectory(java.lang.String p0)`

---

## public abstract interface `org.flywaydb.core.api.configuration.Configuration`

**Methods:**
- `public abstract java.lang.String getBaselineDescription()`
- `public abstract org.flywaydb.core.api.MigrationVersion getBaselineVersion()`
- `public abstract org.flywaydb.core.api.callback.Callback[] getCallbacks()`
- `public abstract org.flywaydb.core.api.MigrationPattern[] getCherryPick()`
- `public abstract java.lang.ClassLoader getClassLoader()`
- `public abstract int getConnectRetries()`
- `public abstract int getConnectRetriesInterval()`
- `public abstract javax.sql.DataSource getDataSource()`
- `public abstract org.flywaydb.core.internal.database.DatabaseType getDatabaseType()`
- `public abstract java.lang.String getDefaultSchema()`
- `public abstract java.lang.String getDriver()`
- `public abstract java.io.OutputStream getDryRunOutput()`
- `public abstract java.nio.charset.Charset getEncoding()`
- `public abstract java.lang.String[] getErrorOverrides()`
- `public abstract org.flywaydb.core.api.pattern.ValidatePattern[] getIgnoreMigrationPatterns()`
- `public abstract java.lang.String getInitSql()`
- `public abstract java.lang.String getInstalledBy()`
- `public abstract org.flywaydb.core.api.ClassProvider getJavaMigrationClassProvider()`
- `public abstract org.flywaydb.core.api.migration.JavaMigration[] getJavaMigrations()`
- `public abstract java.util.Map getJdbcProperties()`
- `public abstract java.lang.String getKerberosConfigFile()`
- `public abstract java.lang.String getLicenseKey()`
- `public abstract org.flywaydb.core.api.Location[] getLocations()`
- `public abstract int getLockRetryCount()`
- `public abstract java.lang.String[] getLoggers()`
- `public abstract org.flywaydb.core.internal.configuration.models.ConfigurationModel getModernConfig()`
- `public abstract java.lang.String getPassword()`
- `public abstract java.lang.String getPlaceholderPrefix()`
- `public abstract java.lang.String getPlaceholderSeparator()`
- `public abstract java.lang.String getPlaceholderSuffix()`
- `public abstract java.util.Map getPlaceholders()`
- `public abstract org.flywaydb.core.internal.plugin.PluginRegister getPluginRegister()`
- `public abstract java.lang.String getRepeatableSqlMigrationPrefix()`
- `public abstract java.lang.String getReportFilename()`
- `public abstract org.flywaydb.core.api.resolver.MigrationResolver[] getResolvers()`
- `public abstract org.flywaydb.core.api.ResourceProvider getResourceProvider()`
- `public abstract java.lang.String[] getSchemas()`
- `public abstract java.lang.String getScriptPlaceholderPrefix()`
- `public abstract java.lang.String getScriptPlaceholderSuffix()`
- `public abstract java.lang.String getSqlMigrationPrefix()`
- `public abstract java.lang.String getSqlMigrationSeparator()`
- `public abstract java.lang.String[] getSqlMigrationSuffixes()`
- `public abstract java.lang.String getTable()`
- `public abstract java.lang.String getTablespace()`
- `public abstract org.flywaydb.core.api.MigrationVersion getTarget()`
- `public abstract java.lang.String getUndoSqlMigrationPrefix()`
- `public abstract java.lang.String getUrl()`
- `public abstract java.lang.String getUser()`
- `public abstract java.lang.String getWorkingDirectory()`
- `public abstract boolean isBaselineOnMigrate()`
- `public abstract boolean isBatch()`
- `public abstract boolean isCleanDisabled()`
- `public abstract boolean isCleanOnValidationError()`
- `public abstract boolean isCreateSchemas()`
- `public abstract boolean isDetectEncoding()`
- `public abstract boolean isExecuteInTransaction()`
- `public abstract boolean isFailOnMissingLocations()`
- `public abstract boolean isFailOnMissingTarget()`
- `public abstract boolean isGroup()`
- `public abstract boolean isMixed()`
- `public abstract boolean isOutOfOrder()`
- `public abstract boolean isOutputQueryResults()`
- `public abstract boolean isPlaceholderReplacement()`
- `public abstract boolean isReportEnabled()`
- `public abstract boolean isSkipDefaultCallbacks()`
- `public abstract boolean isSkipDefaultResolvers()`
- `public abstract boolean isSkipExecutingMigrations()`
- `public abstract boolean isStream()`
- `public abstract boolean isValidateMigrationNaming()`
- `public abstract boolean isValidateOnMigrate()`

---

## public class `org.flywaydb.core.api.configuration.FluentConfiguration`
implements `org.flywaydb.core.api.configuration.Configuration`  

**Constructors:**
- `public FluentConfiguration()`
- `public FluentConfiguration(java.lang.ClassLoader p0)`

**Methods:**
- `public org.flywaydb.core.api.configuration.FluentConfiguration baselineDescription(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration baselineOnMigrate(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration baselineVersion(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration baselineVersion(org.flywaydb.core.api.MigrationVersion p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration batch(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration callbacks(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration callbacks(org.flywaydb.core.api.callback.Callback... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration cherryPick(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration cherryPick(org.flywaydb.core.api.MigrationPattern... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration cleanDisabled(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration cleanOnValidationError(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration configuration(java.util.Map p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration configuration(java.util.Properties p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration configuration(org.flywaydb.core.api.configuration.Configuration p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration connectRetries(int p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration connectRetriesInterval(int p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration createSchemas(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration dataSource(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration dataSource(javax.sql.DataSource p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration defaultSchema(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration detectEncoding(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration driver(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration dryRunOutput(java.io.File p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration dryRunOutput(java.io.OutputStream p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration dryRunOutput(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration encoding(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration encoding(java.nio.charset.Charset p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration envVars()`
- `public org.flywaydb.core.api.configuration.FluentConfiguration errorOverrides(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration executeInTransaction(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration failOnMissingLocations(boolean p0)`
- `public java.lang.String getBaselineDescription()`
- `public org.flywaydb.core.api.MigrationVersion getBaselineVersion()`
- `public org.flywaydb.core.api.callback.Callback[] getCallbacks()`
- `public org.flywaydb.core.api.MigrationPattern[] getCherryPick()`
- `public java.lang.ClassLoader getClassLoader()`
- `public int getConnectRetries()`
- `public int getConnectRetriesInterval()`
- `public javax.sql.DataSource getDataSource()`
- `public org.flywaydb.core.internal.database.DatabaseType getDatabaseType()`
- `public java.lang.String getDefaultSchema()`
- `public java.lang.String getDriver()`
- `public java.io.OutputStream getDryRunOutput()`
- `public java.nio.charset.Charset getEncoding()`
- `public java.lang.String[] getErrorOverrides()`
- `public org.flywaydb.core.api.pattern.ValidatePattern[] getIgnoreMigrationPatterns()`
- `public java.lang.String getInitSql()`
- `public java.lang.String getInstalledBy()`
- `public org.flywaydb.core.api.ClassProvider getJavaMigrationClassProvider()`
- `public org.flywaydb.core.api.migration.JavaMigration[] getJavaMigrations()`
- `public java.util.Map getJdbcProperties()`
- `public java.lang.String getKerberosConfigFile()`
- `public java.lang.String getLicenseKey()`
- `public org.flywaydb.core.api.Location[] getLocations()`
- `public int getLockRetryCount()`
- `public java.lang.String[] getLoggers()`
- `public org.flywaydb.core.internal.configuration.models.ConfigurationModel getModernConfig()`
- `public java.lang.String getPassword()`
- `public java.lang.String getPlaceholderPrefix()`
- `public java.lang.String getPlaceholderSeparator()`
- `public java.lang.String getPlaceholderSuffix()`
- `public java.util.Map getPlaceholders()`
- `public org.flywaydb.core.internal.plugin.PluginRegister getPluginRegister()`
- `public java.lang.String getRepeatableSqlMigrationPrefix()`
- `public java.lang.String getReportFilename()`
- `public org.flywaydb.core.api.resolver.MigrationResolver[] getResolvers()`
- `public org.flywaydb.core.api.ResourceProvider getResourceProvider()`
- `public java.lang.String[] getSchemas()`
- `public java.lang.String getScriptPlaceholderPrefix()`
- `public java.lang.String getScriptPlaceholderSuffix()`
- `public java.lang.String getSqlMigrationPrefix()`
- `public java.lang.String getSqlMigrationSeparator()`
- `public java.lang.String[] getSqlMigrationSuffixes()`
- `public java.lang.String getTable()`
- `public java.lang.String getTablespace()`
- `public org.flywaydb.core.api.MigrationVersion getTarget()`
- `public java.lang.String getUndoSqlMigrationPrefix()`
- `public java.lang.String getUrl()`
- `public java.lang.String getUser()`
- `public java.lang.String getWorkingDirectory()`
- `public org.flywaydb.core.api.configuration.FluentConfiguration group(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration ignoreMigrationPatterns(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration ignoreMigrationPatterns(org.flywaydb.core.api.pattern.ValidatePattern... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration initSql(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration installedBy(java.lang.String p0)`
- `public boolean isBaselineOnMigrate()`
- `public boolean isBatch()`
- `public boolean isCleanDisabled()`
- `public boolean isCleanOnValidationError()`
- `public boolean isCreateSchemas()`
- `public boolean isDetectEncoding()`
- `public boolean isExecuteInTransaction()`
- `public boolean isFailOnMissingLocations()`
- `public boolean isFailOnMissingTarget()`
- `public boolean isGroup()`
- `public boolean isMixed()`
- `public boolean isOutOfOrder()`
- `public boolean isOutputQueryResults()`
- `public boolean isPlaceholderReplacement()`
- `public boolean isReportEnabled()`
- `public boolean isSkipDefaultCallbacks()`
- `public boolean isSkipDefaultResolvers()`
- `public boolean isSkipExecutingMigrations()`
- `public boolean isStream()`
- `public boolean isValidateMigrationNaming()`
- `public boolean isValidateOnMigrate()`
- `public org.flywaydb.core.api.configuration.FluentConfiguration javaMigrationClassProvider(org.flywaydb.core.api.ClassProvider p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration javaMigrations(org.flywaydb.core.api.migration.JavaMigration... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration jdbcProperties(java.util.Map p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration kerberosConfigFile(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration licenseKey(java.lang.String p0)`
- `public org.flywaydb.core.Flyway load()`
- `public org.flywaydb.core.api.configuration.FluentConfiguration loadDefaultConfigurationFiles()`
- `public org.flywaydb.core.api.configuration.FluentConfiguration loadDefaultConfigurationFiles(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration locations(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration locations(org.flywaydb.core.api.Location... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration lockRetryCount(int p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration loggers(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration mixed(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration outOfOrder(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration outputQueryResults(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration placeholderPrefix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration placeholderReplacement(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration placeholderSeparator(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration placeholderSuffix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration placeholders(java.util.Map p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration repeatableSqlMigrationPrefix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration reportFilename(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration resolvers(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration resolvers(org.flywaydb.core.api.resolver.MigrationResolver... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration resourceProvider(org.flywaydb.core.api.ResourceProvider p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration schemas(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration scriptPlaceholderPrefix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration scriptPlaceholderSuffix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration skipDefaultCallbacks(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration skipDefaultResolvers(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration skipExecutingMigrations(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration sqlMigrationPrefix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration sqlMigrationSeparator(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration sqlMigrationSuffixes(java.lang.String... p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration stream(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration table(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration tablespace(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration target(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration target(org.flywaydb.core.api.MigrationVersion p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration undoSqlMigrationPrefix(java.lang.String p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration validateMigrationNaming(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration validateOnMigrate(boolean p0)`
- `public org.flywaydb.core.api.configuration.FluentConfiguration workingDirectory(java.lang.String p0)`

---

## public class `org.flywaydb.core.api.configuration.S3ClientFactory`

**Methods:**
- `public static software.amazon.awssdk.services.s3.S3Client getClient()`
- `public static void setClient(software.amazon.awssdk.services.s3.S3Client p0)`

---

## public class `org.flywaydb.core.api.exception.FlywayValidateException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayValidateException(org.flywaydb.core.api.ErrorDetails p0, java.lang.String p1)`

---

## public abstract interface `org.flywaydb.core.api.executor.Context`

**Methods:**
- `public abstract org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public abstract java.sql.Connection getConnection()`

---

## public abstract interface `org.flywaydb.core.api.executor.MigrationExecutor`

**Methods:**
- `public abstract boolean canExecuteInTransaction()`
- `public abstract void execute(org.flywaydb.core.api.executor.Context p0) throws java.sql.SQLException`
- `public abstract boolean shouldExecute()`

---

## public abstract interface `org.flywaydb.core.api.logging.Log`

**Methods:**
- `public abstract void debug(java.lang.String p0)`
- `public abstract void error(java.lang.String p0)`
- `public abstract void error(java.lang.String p0, java.lang.Exception p1)`
- `public abstract void info(java.lang.String p0)`
- `public abstract boolean isDebugEnabled()`
- `public abstract void notice(java.lang.String p0)`
- `public abstract void warn(java.lang.String p0)`

---

## public abstract interface `org.flywaydb.core.api.logging.LogCreator`

**Methods:**
- `public abstract org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public class `org.flywaydb.core.api.logging.LogFactory`

**Methods:**
- `public static org.flywaydb.core.api.logging.Log getLog(java.lang.Class p0)`
- `public static void setConfiguration(org.flywaydb.core.api.configuration.Configuration p0)`
- `public static void setFallbackLogCreator(org.flywaydb.core.api.logging.LogCreator p0)`
- `public static void setLogCreator(org.flywaydb.core.api.logging.LogCreator p0)`

---

## public abstract class `org.flywaydb.core.api.migration.BaseJavaMigration`
implements `org.flywaydb.core.api.migration.JavaMigration`  

**Constructors:**
- `public BaseJavaMigration()`

**Methods:**
- `public boolean canExecuteInTransaction()`
- `protected void extractVersionAndDescription(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public java.lang.Integer getChecksum()`
- `public java.lang.String getDescription()`
- `public org.flywaydb.core.api.MigrationVersion getVersion()`
- `protected void init()`

---

## public abstract interface `org.flywaydb.core.api.migration.Context`

**Methods:**
- `public abstract org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public abstract java.sql.Connection getConnection()`

---

## public abstract interface `org.flywaydb.core.api.migration.JavaMigration`

**Methods:**
- `public abstract boolean canExecuteInTransaction()`
- `public abstract java.lang.Integer getChecksum()`
- `public abstract java.lang.String getDescription()`
- `public default org.flywaydb.core.api.resolver.ResolvedMigration getResolvedMigration(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.StatementInterceptor p1)`
- `public default org.flywaydb.core.extensibility.MigrationType getType()`
- `public abstract org.flywaydb.core.api.MigrationVersion getVersion()`
- `public abstract void migrate(org.flywaydb.core.api.migration.Context p0) throws java.lang.Exception`

---

## public class `org.flywaydb.core.api.migration.baseline.BaselineAppliedMigration`
extends `org.flywaydb.core.internal.schemahistory.BaseAppliedMigration`  

**Constructors:**
- `public BaselineAppliedMigration()`
- `public BaselineAppliedMigration(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`

**Methods:**
- `public org.flywaydb.core.extensibility.AppliedMigration create(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`
- `public org.flywaydb.core.api.MigrationState getState(org.flywaydb.core.internal.info.MigrationInfoContext p0, boolean p1, org.flywaydb.core.api.resolver.ResolvedMigration p2)`
- `public boolean handlesType(java.lang.String p0)`

---

## public abstract class `org.flywaydb.core.api.migration.baseline.BaselineJavaMigration`
extends `org.flywaydb.core.api.migration.BaseJavaMigration`  

**Constructors:**
- `public BaselineJavaMigration()`

**Methods:**
- `public org.flywaydb.core.api.resolver.ResolvedMigration getResolvedMigration(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.StatementInterceptor p1)`
- `public org.flywaydb.core.extensibility.MigrationType getType()`
- `protected void init()`

---

## public class `org.flywaydb.core.api.migration.baseline.BaselineMigrationConfigurationExtension`
implements `org.flywaydb.core.extensibility.ConfigurationExtension`  

**Constructors:**
- `public BaselineMigrationConfigurationExtension()`

**Methods:**
- `public java.lang.String getBaselineMigrationPrefix()`
- `public java.lang.String getConfigurationParameterFromEnvironmentVariable(java.lang.String p0)`
- `public java.lang.String getNamespace()`
- `public void setBaselineMigrationPrefix(java.lang.String p0)`

---

## public class `org.flywaydb.core.api.migration.baseline.BaselineMigrationResolver`
implements `org.flywaydb.core.api.resolver.MigrationResolver`  

**Constructors:**
- `public BaselineMigrationResolver()`

**Methods:**
- `public org.flywaydb.core.extensibility.MigrationType getDefaultMigrationType()`
- `public java.lang.String getPrefix(org.flywaydb.core.api.configuration.Configuration p0)`
- `protected static boolean isSqlCallback(org.flywaydb.core.internal.resource.ResourceName p0)`
- `public java.util.Collection resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public final enum `org.flywaydb.core.api.migration.baseline.BaselineMigrationType`
extends `java.lang.Enum`  
implements `org.flywaydb.core.extensibility.MigrationType`  

**Fields:**
- `public final static org.flywaydb.core.api.migration.baseline.BaselineMigrationType JDBC_BASELINE`
- `public final static org.flywaydb.core.api.migration.baseline.BaselineMigrationType SQL_BASELINE`

**Methods:**
- `public static org.flywaydb.core.extensibility.MigrationType fromString(java.lang.String p0)`
- `public boolean isBaseline()`
- `public boolean isSynthetic()`
- `public boolean isUndo()`

---

## public class `org.flywaydb.core.api.migration.baseline.BaselineResolvedMigration`
extends `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl`  

**Constructors:**
- `public BaselineResolvedMigration(org.flywaydb.core.api.MigrationVersion p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, java.lang.Integer p4, java.lang.String p5, org.flywaydb.core.api.executor.MigrationExecutor p6, org.flywaydb.core.api.configuration.Configuration p7)`
- `public BaselineResolvedMigration(org.flywaydb.core.api.MigrationVersion p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, java.lang.Integer p4, org.flywaydb.core.extensibility.MigrationType p5, java.lang.String p6, org.flywaydb.core.api.executor.MigrationExecutor p7, org.flywaydb.core.api.configuration.Configuration p8)`

**Methods:**
- `public boolean canCompareWith(org.flywaydb.core.api.resolver.ResolvedMigration p0)`
- `public org.flywaydb.core.api.MigrationState getState(org.flywaydb.core.internal.info.MigrationInfoContext p0)`

---

## public class `org.flywaydb.core.api.migration.baseline.BaselineResourceTypeProvider`
implements `org.flywaydb.core.extensibility.ResourceTypeProvider`  

**Constructors:**
- `public BaselineResourceTypeProvider()`

**Methods:**
- `public java.util.List getPrefixTypePairs(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public class `org.flywaydb.core.api.output.BaselineResult`
extends `org.flywaydb.core.api.output.OperationResultBase`  

**Constructors:**
- `public BaselineResult(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `public java.lang.String baselineVersion`
- `public boolean successfullyBaselined`

---

## public class `org.flywaydb.core.api.output.CleanResult`
extends `org.flywaydb.core.api.output.OperationResultBase`  

**Constructors:**
- `public CleanResult(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `public java.util.ArrayList schemasCleaned`
- `public java.util.ArrayList schemasDropped`

---

## public class `org.flywaydb.core.api.output.CommandResultFactory`

**Constructors:**
- `public CommandResultFactory()`

**Methods:**
- `public static org.flywaydb.core.api.output.BaselineResult createBaselineResult(java.lang.String p0)`
- `public static org.flywaydb.core.api.output.CleanResult createCleanResult(java.lang.String p0)`
- `public static org.flywaydb.core.api.output.InfoOutput createInfoOutput(java.util.Set p0, org.flywaydb.core.api.MigrationInfo p1)`
- `public static org.flywaydb.core.api.output.InfoResult createInfoResult(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Database p1, org.flywaydb.core.api.MigrationInfo[] p2, org.flywaydb.core.api.MigrationInfo p3, boolean p4)`
- `public static org.flywaydb.core.api.output.MigrateOutput createMigrateOutput(org.flywaydb.core.api.MigrationInfo p0, int p1)`
- `public static org.flywaydb.core.api.output.MigrateResult createMigrateResult(java.lang.String p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public static org.flywaydb.core.api.output.RepairOutput createRepairOutput(org.flywaydb.core.api.MigrationInfo p0)`
- `public static org.flywaydb.core.api.output.RepairOutput createRepairOutput(org.flywaydb.core.extensibility.AppliedMigration p0)`
- `public static org.flywaydb.core.api.output.RepairResult createRepairResult(java.lang.String p0)`
- `public static org.flywaydb.core.api.output.UndoOutput createUndoOutput(org.flywaydb.core.api.resolver.ResolvedMigration p0, int p1)`
- `public static org.flywaydb.core.api.output.UndoResult createUndoResult(java.lang.String p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public static org.flywaydb.core.api.output.ValidateOutput createValidateOutput(org.flywaydb.core.api.MigrationInfo p0, org.flywaydb.core.api.ErrorDetails p1)`
- `public static org.flywaydb.core.api.output.ValidateResult createValidateResult(java.lang.String p0, org.flywaydb.core.api.ErrorDetails p1, int p2, java.util.List p3, java.util.List p4)`

---

## public class `org.flywaydb.core.api.output.CompositeResult`<T extends org.flywaydb.core.api.output.OperationResult>
implements `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public CompositeResult()`
- `public CompositeResult(org.flywaydb.core.api.output.CompositeResult p0)`

**Fields:**
- `public java.util.List individualResults`

---

## public class `org.flywaydb.core.api.output.DashboardRenderer`
implements `org.flywaydb.core.extensibility.HtmlRenderer<org.flywaydb.core.api.output.DashboardResult>`  

**Constructors:**
- `public DashboardRenderer()`

**Methods:**
- `public java.lang.Class getType()`
- `public java.lang.String render(org.flywaydb.core.api.output.DashboardResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public java.lang.String tabTitle(org.flywaydb.core.api.output.DashboardResult p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.api.output.DashboardResult`
extends `org.flywaydb.core.api.output.HtmlResult`  

**Constructors:**
- `public DashboardResult()`

**Methods:**
- `public java.util.List getResults()`
- `public void setResults(java.util.List p0)`

---

## public class `org.flywaydb.core.api.output.ErrorOutput`
implements `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public ErrorOutput(org.flywaydb.core.api.ErrorCode p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, java.lang.String p4)`

**Fields:**
- `public org.flywaydb.core.api.output.ErrorOutput$ErrorOutputItem error`

**Methods:**
- `public static org.flywaydb.core.api.output.ErrorOutput fromException(java.lang.Exception p0)`
- `public static org.flywaydb.core.api.output.MigrateErrorResult fromMigrateException(org.flywaydb.core.internal.command.DbMigrate$FlywayMigrateException p0)`
- `public static org.flywaydb.core.api.output.OperationResult toOperationResult(java.lang.Exception p0)`

---

## public static class `org.flywaydb.core.api.output.ErrorOutput$ErrorOutputItem`

**Fields:**
- `public org.flywaydb.core.api.ErrorCode errorCode`
- `public java.lang.Integer lineNumber`
- `public java.lang.String message`
- `public java.lang.String path`
- `public java.lang.String stackTrace`

---

## public class `org.flywaydb.core.api.output.HoldingRenderer`
implements `org.flywaydb.core.extensibility.HtmlRenderer<org.flywaydb.core.api.output.HoldingResult>`  

**Constructors:**
- `public HoldingRenderer()`

**Methods:**
- `public java.lang.Class getType()`
- `public java.lang.String render(org.flywaydb.core.api.output.HoldingResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public java.lang.String tabTitle(org.flywaydb.core.api.output.HoldingResult p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.api.output.HoldingResult`
extends `org.flywaydb.core.api.output.HtmlResult`  

**Constructors:**
- `public HoldingResult()`

**Methods:**
- `public java.lang.String getBodyText()`
- `public java.lang.String getTabTitle()`
- `public void setBodyText(java.lang.String p0)`
- `public void setTabTitle(java.lang.String p0)`

---

## public class `org.flywaydb.core.api.output.HtmlResult`
implements `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public HtmlResult()`
- `protected HtmlResult(java.time.LocalDateTime p0, java.lang.String p1)`

**Fields:**
- `public transient java.lang.Exception exceptionObject`

**Methods:**
- `public java.lang.String getException()`
- `public java.lang.String getOperation()`
- `public java.time.LocalDateTime getTimestamp()`
- `public boolean isLicenseFailed()`
- `public void setException(java.lang.Exception p0)`
- `public void setLicenseFailed(boolean p0)`
- `public void setOperation(java.lang.String p0)`
- `public void setTimestamp(java.time.LocalDateTime p0)`

---

## public class `org.flywaydb.core.api.output.HtmlTableRenderer`

**Constructors:**
- `public HtmlTableRenderer()`

**Methods:**
- `public void addHeadings(java.lang.String... p0)`
- `public void addRow(java.lang.String... p0)`
- `public java.lang.String render()`

---

## public class `org.flywaydb.core.api.output.InfoHtmlRenderer`
implements `org.flywaydb.core.extensibility.HtmlRenderer<org.flywaydb.core.api.output.InfoResult>`  

**Constructors:**
- `public InfoHtmlRenderer()`

**Methods:**
- `public java.util.List getHtmlSummary(org.flywaydb.core.api.output.InfoResult p0)`
- `public java.lang.Class getType()`
- `public java.lang.String render(org.flywaydb.core.api.output.InfoResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public java.lang.String tabTitle(org.flywaydb.core.api.output.InfoResult p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.api.output.InfoOutput`

**Constructors:**
- `public InfoOutput()`
- `public InfoOutput(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, int p11)`

**Fields:**
- `public java.lang.String category`
- `public java.lang.String description`
- `public int executionTime`
- `public java.lang.String filepath`
- `public java.lang.String installedBy`
- `public java.lang.String installedOnUTC`
- `public java.lang.String rawVersion`
- `public java.lang.String state`
- `public java.lang.String type`
- `public java.lang.String undoFilepath`
- `public java.lang.String undoable`
- `public java.lang.String version`

**Methods:**
- `public java.lang.String getCategory()`
- `public java.lang.String getDescription()`
- `public int getExecutionTime()`
- `public java.lang.String getFilepath()`
- `public java.lang.String getInstalledBy()`
- `public java.lang.String getInstalledOnUTC()`
- `public java.lang.String getRawVersion()`
- `public java.lang.String getState()`
- `public java.lang.String getType()`
- `public java.lang.String getUndoFilepath()`
- `public java.lang.String getUndoable()`
- `public java.lang.String getVersion()`
- `public void setCategory(java.lang.String p0)`
- `public void setDescription(java.lang.String p0)`
- `public void setExecutionTime(int p0)`
- `public void setFilepath(java.lang.String p0)`
- `public void setInstalledBy(java.lang.String p0)`
- `public void setInstalledOnUTC(java.lang.String p0)`
- `public void setRawVersion(java.lang.String p0)`
- `public void setState(java.lang.String p0)`
- `public void setType(java.lang.String p0)`
- `public void setUndoFilepath(java.lang.String p0)`
- `public void setUndoable(java.lang.String p0)`
- `public void setVersion(java.lang.String p0)`

---

## public class `org.flywaydb.core.api.output.InfoResult`
extends `org.flywaydb.core.api.output.HtmlResult`  

**Constructors:**
- `public InfoResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.List p4, boolean p5)`

**Fields:**
- `public boolean allSchemasEmpty`
- `public java.lang.String database`
- `public java.lang.String flywayVersion`
- `public java.util.List migrations`
- `public java.lang.String schemaName`
- `public java.lang.String schemaVersion`

---

## public class `org.flywaydb.core.api.output.MigrateErrorResult`
extends `org.flywaydb.core.api.output.MigrateResult`  

**Constructors:**
- `public MigrateErrorResult(org.flywaydb.core.api.output.MigrateResult p0, java.lang.Exception p1)`

**Fields:**
- `public org.flywaydb.core.api.output.ErrorOutput$ErrorOutputItem error`

---

## public class `org.flywaydb.core.api.output.MigrateHtmlRenderer`
implements `org.flywaydb.core.extensibility.HtmlRenderer<org.flywaydb.core.api.output.MigrateResult>`  

**Constructors:**
- `public MigrateHtmlRenderer()`

**Methods:**
- `public java.util.List getHtmlSummary(org.flywaydb.core.api.output.MigrateResult p0)`
- `public java.lang.Class getType()`
- `public java.lang.String render(org.flywaydb.core.api.output.MigrateResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public java.lang.String tabTitle(org.flywaydb.core.api.output.MigrateResult p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.api.output.MigrateOutput`

**Constructors:**
- `public MigrateOutput(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5)`

**Fields:**
- `public java.lang.String category`
- `public java.lang.String description`
- `public int executionTime`
- `public java.lang.String filepath`
- `public java.lang.String type`
- `public java.lang.String version`

---

## public class `org.flywaydb.core.api.output.MigrateResult`
extends `org.flywaydb.core.api.output.HtmlResult`  

**Constructors:**
- `public MigrateResult(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `public final static java.lang.String COMMAND`
- `public java.lang.String database`
- `public java.lang.String flywayVersion`
- `public java.lang.String initialSchemaVersion`
- `public java.util.List migrations`
- `public int migrationsExecuted`
- `public java.lang.String schemaName`
- `public boolean success`
- `public java.lang.String targetSchemaVersion`
- `public java.util.List warnings`

**Methods:**
- `public void addWarning(java.lang.String p0)`
- `public long getTotalMigrationTime()`

---

## public abstract interface `org.flywaydb.core.api.output.OperationResult`

---

## public abstract class `org.flywaydb.core.api.output.OperationResultBase`
implements `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public OperationResultBase()`

**Fields:**
- `public java.lang.String database`
- `public java.lang.String flywayVersion`
- `public java.lang.String operation`
- `public java.util.List warnings`

**Methods:**
- `public void addWarning(java.lang.String p0)`

---

## public class `org.flywaydb.core.api.output.OperationResultJsonBase`
implements `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public OperationResultJsonBase(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `public java.lang.String htmlReport`
- `public java.lang.String jsonReport`

---

## public class `org.flywaydb.core.api.output.RepairOutput`

**Constructors:**
- `public RepairOutput(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `public java.lang.String description`
- `public java.lang.String filepath`
- `public java.lang.String version`

---

## public class `org.flywaydb.core.api.output.RepairResult`
extends `org.flywaydb.core.api.output.OperationResultBase`  

**Constructors:**
- `public RepairResult(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `public java.util.List migrationsAligned`
- `public java.util.List migrationsDeleted`
- `public java.util.List migrationsRemoved`
- `public java.util.List repairActions`

**Methods:**
- `public void setRepairActions(org.flywaydb.core.internal.command.DbRepair$CompletedRepairActions p0)`

---

## public class `org.flywaydb.core.api.output.UndoOutput`

**Constructors:**
- `public UndoOutput(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`

**Fields:**
- `public java.lang.String description`
- `public int executionTime`
- `public java.lang.String filepath`
- `public java.lang.String version`

---

## public class `org.flywaydb.core.api.output.UndoResult`
extends `org.flywaydb.core.api.output.OperationResultBase`  

**Constructors:**
- `public UndoResult(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `public java.lang.String initialSchemaVersion`
- `public int migrationsUndone`
- `public java.lang.String schemaName`
- `public java.lang.String targetSchemaVersion`
- `public java.util.List undoneMigrations`

---

## public class `org.flywaydb.core.api.output.ValidateOutput`

**Constructors:**
- `public ValidateOutput(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.flywaydb.core.api.ErrorDetails p3)`

**Fields:**
- `public final java.lang.String description`
- `public final org.flywaydb.core.api.ErrorDetails errorDetails`
- `public final java.lang.String filepath`
- `public final java.lang.String version`

---

## public class `org.flywaydb.core.api.output.ValidateResult`
extends `org.flywaydb.core.api.output.OperationResultBase`  

**Constructors:**
- `public ValidateResult(java.lang.String p0, java.lang.String p1, org.flywaydb.core.api.ErrorDetails p2, boolean p3, int p4, java.util.List p5, java.util.List p6)`

**Fields:**
- `public final org.flywaydb.core.api.ErrorDetails errorDetails`
- `public final java.util.List invalidMigrations`
- `public final int validateCount`
- `public final boolean validationSuccessful`

**Methods:**
- `public java.lang.String getAllErrorMessages()`

---

## public class `org.flywaydb.core.api.pattern.ValidatePattern`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static org.flywaydb.core.api.pattern.ValidatePattern fromPattern(java.lang.String p0)`
- `public int hashCode()`
- `public boolean matchesMigration(boolean p0, org.flywaydb.core.api.MigrationState p1)`
- `public java.lang.String toString()`

---

## public abstract interface `org.flywaydb.core.api.resolver.MigrationResolver`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public default org.flywaydb.core.extensibility.MigrationType getDefaultMigrationType()`
- `public default java.lang.String getPrefix(org.flywaydb.core.api.configuration.Configuration p0)`
- `public abstract java.util.Collection resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public static class `org.flywaydb.core.api.resolver.MigrationResolver$Context`

**Constructors:**
- `public Context(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.sqlscript.SqlScriptFactory p2, org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p3, org.flywaydb.core.internal.jdbc.StatementInterceptor p4)`

**Fields:**
- `public final org.flywaydb.core.api.configuration.Configuration configuration`
- `public final org.flywaydb.core.api.ResourceProvider resourceProvider`
- `public final org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory sqlScriptExecutorFactory`
- `public final org.flywaydb.core.internal.sqlscript.SqlScriptFactory sqlScriptFactory`
- `public final org.flywaydb.core.internal.jdbc.StatementInterceptor statementInterceptor`

---

## public abstract interface `org.flywaydb.core.api.resolver.ResolvedMigration`
implements `org.flywaydb.core.api.resolver.ChecksumMatcher`  

**Methods:**
- `public default boolean canCompareWith(org.flywaydb.core.api.resolver.ResolvedMigration p0)`
- `public abstract java.lang.Integer getChecksum()`
- `public abstract java.lang.String getDescription()`
- `public abstract org.flywaydb.core.api.executor.MigrationExecutor getExecutor()`
- `public abstract java.lang.String getPhysicalLocation()`
- `public abstract java.lang.String getScript()`
- `public default org.flywaydb.core.api.MigrationState getState(org.flywaydb.core.internal.info.MigrationInfoContext p0)`
- `public abstract org.flywaydb.core.extensibility.MigrationType getType()`
- `public abstract org.flywaydb.core.api.MigrationVersion getVersion()`
- `public default boolean isVersioned()`

---

## public abstract class `org.flywaydb.core.api.resource.LoadableResource`
implements `java.lang.Comparable<org.flywaydb.core.api.resource.LoadableResource>`, `org.flywaydb.core.api.resource.Resource`  

**Constructors:**
- `public LoadableResource()`

**Methods:**
- `public int compareTo(org.flywaydb.core.api.resource.LoadableResource p0)`
- `public abstract java.io.Reader read()`

---

## public abstract interface `org.flywaydb.core.api.resource.Resource`

**Methods:**
- `public abstract java.lang.String getAbsolutePath()`
- `public abstract java.lang.String getAbsolutePathOnDisk()`
- `public abstract java.lang.String getFilename()`
- `public abstract java.lang.String getRelativePath()`

---

## public abstract interface `org.flywaydb.core.extensibility.AppliedMigration`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public default int compareTo(org.flywaydb.core.extensibility.AppliedMigration p0)`
- `public abstract org.flywaydb.core.extensibility.AppliedMigration create(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`
- `public abstract java.lang.Integer getChecksum()`
- `public abstract java.lang.String getDescription()`
- `public abstract int getExecutionTime()`
- `public abstract java.lang.String getInstalledBy()`
- `public abstract java.util.Date getInstalledOn()`
- `public abstract int getInstalledRank()`
- `public abstract java.lang.String getScript()`
- `public abstract org.flywaydb.core.api.MigrationState getState(org.flywaydb.core.internal.info.MigrationInfoContext p0, boolean p1, org.flywaydb.core.api.resolver.ResolvedMigration p2)`
- `public abstract org.flywaydb.core.extensibility.MigrationType getType()`
- `public abstract org.flywaydb.core.api.MigrationVersion getVersion()`
- `public abstract boolean handlesType(java.lang.String p0)`
- `public abstract boolean isSuccess()`
- `public default boolean isVersioned()`
- `public default void updateAttributes(java.util.List p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.CleanModePlugin`<T extends org.flywaydb.core.internal.database.base.Database>
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract void cleanDatabasePostSchema(T p0, org.flywaydb.core.internal.jdbc.JdbcTemplate p1) throws java.sql.SQLException`
- `public abstract boolean handlesDatabase(org.flywaydb.core.internal.database.base.Database p0)`
- `public abstract boolean handlesMode(org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension$Mode p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.CommandExtension`
implements `org.flywaydb.core.extensibility.PluginMetadata`  

**Methods:**
- `public default java.lang.String getCommandForFlag(java.lang.String p0)`
- `public abstract org.flywaydb.core.api.output.OperationResult handle(java.lang.String p0, org.flywaydb.core.api.configuration.Configuration p1, java.util.List p2, org.flywaydb.core.FlywayTelemetryManager p3) throws org.flywaydb.core.api.FlywayException`
- `public abstract boolean handlesCommand(java.lang.String p0)`
- `public abstract boolean handlesParameter(java.lang.String p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.ConfigurationExtension`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public default void extractParametersFromConfiguration(java.util.Map p0)`
- `public abstract java.lang.String getConfigurationParameterFromEnvironmentVariable(java.lang.String p0)`
- `public abstract java.lang.String getNamespace()`

---

## public class `org.flywaydb.core.extensibility.ConfigurationParameter`

**Constructors:**
- `public ConfigurationParameter(java.lang.String p0, java.lang.String p1, boolean p2)`

**Fields:**
- `public final java.lang.String description`
- `public final java.lang.String name`
- `public final boolean required`

**Methods:**
- `public java.lang.String getDescription()`
- `public java.lang.String getName()`
- `public boolean isRequired()`

---

## public abstract interface `org.flywaydb.core.extensibility.ConfigurationProvider`<T extends org.flywaydb.core.extensibility.ConfigurationExtension>
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract java.util.Map getConfiguration(T p0, org.flywaydb.core.api.configuration.ClassicConfiguration p1) throws java.lang.Exception`
- `public abstract java.lang.Class getConfigurationExtensionClass()`

---

## public class `org.flywaydb.core.extensibility.EventTelemetryModel`
implements `java.lang.AutoCloseable`  

**Constructors:**
- `public EventTelemetryModel(java.lang.String p0, org.flywaydb.core.FlywayTelemetryManager p1)`

**Methods:**
- `public void close() throws java.lang.Exception`
- `public long getDuration()`
- `public java.lang.Exception getException()`
- `public org.flywaydb.core.FlywayTelemetryManager getFlywayTelemetryManager()`
- `public java.lang.String getName()`
- `public java.time.Instant getStartTime()`
- `public void setDuration(long p0)`
- `public void setException(java.lang.Exception p0)`
- `public void setName(java.lang.String p0)`
- `public void setStartTime(java.time.Instant p0)`

---

## public class `org.flywaydb.core.extensibility.FlywayExpiredLicenseKeyException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayExpiredLicenseKeyException(org.flywaydb.core.internal.license.Edition p0, java.lang.String p1)`

---

## public class `org.flywaydb.core.extensibility.FlywayInvalidLicenseKeyException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayInvalidLicenseKeyException()`
- `public FlywayInvalidLicenseKeyException(java.lang.String p0, java.lang.Exception p1)`

---

## public class `org.flywaydb.core.extensibility.FlywayMissingLicenseKeyException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayMissingLicenseKeyException()`
- `public FlywayMissingLicenseKeyException(java.lang.String p0, java.lang.Exception p1)`

---

## public class `org.flywaydb.core.extensibility.FlywayRedgateLicenseKeyException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayRedgateLicenseKeyException()`

---

## public class `org.flywaydb.core.extensibility.FlywayTrialExpiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayTrialExpiredException(org.flywaydb.core.internal.license.Edition p0, java.lang.String p1)`

---

## public abstract interface `org.flywaydb.core.extensibility.HtmlRenderer`<T extends org.flywaydb.core.api.output.HtmlResult>
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public default java.util.List getHtmlSummary(T p0)`
- `public abstract java.lang.Class getType()`
- `public abstract java.lang.String render(T p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public abstract java.lang.String tabTitle(T p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.extensibility.HtmlReportSummary`

**Constructors:**
- `public HtmlReportSummary()`
- `public HtmlReportSummary(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getCssClass()`
- `public java.lang.String getIcon()`
- `public java.lang.String getSummaryText()`
- `public void setCssClass(java.lang.String p0)`
- `public void setIcon(java.lang.String p0)`
- `public void setSummaryText(java.lang.String p0)`

---

## public class `org.flywaydb.core.extensibility.InfoTelemetryModel`
extends `org.flywaydb.core.extensibility.EventTelemetryModel`  

**Constructors:**
- `public InfoTelemetryModel(org.flywaydb.core.FlywayTelemetryManager p0)`

**Methods:**
- `public int getNumberOfMigrations()`
- `public int getNumberOfPendingMigrations()`
- `public java.lang.String getOldestMigrationInstalledOnUTC()`
- `public void setNumberOfMigrations(int p0)`
- `public void setNumberOfPendingMigrations(int p0)`
- `public void setOldestMigrationInstalledOnUTC(java.lang.String p0)`

---

## public class `org.flywaydb.core.extensibility.LicenseGuard`

**Constructors:**
- `public LicenseGuard()`

**Methods:**
- `public static void guard(org.flywaydb.core.api.configuration.Configuration p0, java.util.List p1, java.lang.String p2)`

---

## public class `org.flywaydb.core.extensibility.LicenseInfo`

**Methods:**
- `public static org.flywaydb.core.extensibility.LicenseInfo create(java.lang.String p0)`
- `public static org.flywaydb.core.extensibility.LicenseInfo extractLicenseInfo(java.lang.String p0)`
- `public static byte[] fromHex(java.lang.String p0)`
- `public org.flywaydb.core.extensibility.LicenseType getLicenseType()`
- `public java.lang.String getLicensedTo()`
- `public long getRemainingDays()`
- `public java.lang.String getRemainingDaysString()`
- `public java.util.Date getValidUntil()`
- `public boolean isExpired()`
- `public boolean isTrial()`
- `public void print()`

---

## public class `org.flywaydb.core.extensibility.LicenseRgDomainChecker`
implements `org.flywaydb.core.extensibility.RgDomainChecker`  

**Constructors:**
- `public LicenseRgDomainChecker()`

**Methods:**
- `public boolean isInDomain(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public final enum `org.flywaydb.core.extensibility.LicenseType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE10`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE100`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE100_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE10_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE20`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE20_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE30`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE30_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE40`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE40_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE50`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE50_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE60`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE60_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE70`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE70_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE80`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE80_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE90`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISE90_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISESITE`
- `public final static org.flywaydb.core.extensibility.LicenseType ENTERPRISESITE_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO10`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO100`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO100_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO10_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO20`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO20_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO30`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO30_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO40`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO40_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO50`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO50_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO60`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO60_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO70`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO70_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO80`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO80_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO90`
- `public final static org.flywaydb.core.extensibility.LicenseType PRO90_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType PROSITE`
- `public final static org.flywaydb.core.extensibility.LicenseType PROSITE_REDISTRIBUTABLE`
- `public final static org.flywaydb.core.extensibility.LicenseType TEAMS_TRIAL`
- `public final static org.flywaydb.core.extensibility.LicenseType TIER3_TRIAL`
- `public final static org.flywaydb.core.extensibility.LicenseType TIER3_UNLIMITED`
- `public final static org.flywaydb.core.extensibility.LicenseType TRIAL`

**Methods:**
- `public static org.flywaydb.core.extensibility.LicenseType fromCode(byte p0)`
- `public byte getCode()`
- `public java.lang.String getDetails()`
- `public org.flywaydb.core.internal.license.Edition getEdition()`
- `public java.lang.String toString()`

---

## public abstract interface `org.flywaydb.core.extensibility.MigrationType`

**Methods:**
- `public abstract boolean isBaseline()`
- `public abstract boolean isSynthetic()`
- `public abstract boolean isUndo()`
- `public abstract java.lang.String name()`

---

## public abstract interface `org.flywaydb.core.extensibility.Plugin`
implements `java.lang.Comparable<org.flywaydb.core.extensibility.Plugin>`  

**Methods:**
- `public default int compareTo(org.flywaydb.core.extensibility.Plugin p0)`
- `public default java.lang.String getPluginVersion()`
- `public default int getPriority()`
- `public default boolean isEnabled()`
- `public default boolean isLicensed(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.PluginMetadata`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public default java.util.List getConfigurationParameters()`
- `public default java.lang.String getDescription()`
- `public default java.lang.String getDocumentationLink()`
- `public default java.lang.String getExample()`
- `public default java.util.List getFlags()`
- `public default java.lang.String getHelpText()`
- `public default java.util.List getUsage()`

---

## public abstract interface `org.flywaydb.core.extensibility.ResourceType`

**Methods:**
- `public abstract boolean isVersioned()`

---

## public abstract interface `org.flywaydb.core.extensibility.ResourceTypeProvider`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract java.util.List getPrefixTypePairs(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.RgDomainChecker`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract boolean isInDomain(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public class `org.flywaydb.core.extensibility.RootTelemetryModel`

**Constructors:**
- `public RootTelemetryModel()`

**Methods:**
- `public java.lang.String getDatabaseEngine()`
- `public java.lang.String getDatabaseVersion()`
- `public java.lang.String getEnvironment()`
- `public java.lang.String getOperationId()`
- `public java.lang.String getProjectId()`
- `public java.lang.String getProjectName()`
- `public java.lang.String getSessionId()`
- `public java.time.Instant getStartTime()`
- `public java.lang.String getUserId()`
- `public boolean isRedgateEmployee()`
- `public void setDatabaseEngine(java.lang.String p0)`
- `public void setDatabaseVersion(java.lang.String p0)`
- `public void setEnvironment(java.lang.String p0)`
- `public void setOperationId(java.lang.String p0)`
- `public void setProjectId(java.lang.String p0)`
- `public void setProjectName(java.lang.String p0)`
- `public void setRedgateEmployee(boolean p0)`
- `public void setSessionId(java.lang.String p0)`
- `public void setStartTime(java.time.Instant p0)`
- `public void setUserId(java.lang.String p0)`

---

## public abstract interface `org.flywaydb.core.extensibility.TelemetryPlugin`
implements `java.lang.AutoCloseable`, `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract void logEventDetails(org.flywaydb.core.extensibility.EventTelemetryModel p0)`
- `public abstract void logRootDetails(org.flywaydb.core.extensibility.RootTelemetryModel p0)`

---

## public abstract interface `org.flywaydb.core.internal.authentication.ExternalAuthFileReader`

**Methods:**
- `public abstract java.util.List getAllContents()`

---

## public abstract interface `org.flywaydb.core.internal.authentication.ExternalAuthPropertiesProvider`

**Methods:**
- `public abstract java.util.Properties get()`

---

## public class `org.flywaydb.core.internal.authentication.postgres.PgpassFileReader`
implements `org.flywaydb.core.internal.authentication.ExternalAuthFileReader`  

**Constructors:**
- `public PgpassFileReader()`

**Methods:**
- `public java.util.List getAllContents()`
- `public java.lang.String getPgpassFilePath()`

---

## public abstract interface `org.flywaydb.core.internal.callback.CallbackExecutor`

**Methods:**
- `public abstract void onEachMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public abstract void onEvent(org.flywaydb.core.api.callback.Event p0)`
- `public abstract void onMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public abstract void onOperationFinishEvent(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.output.OperationResult p1)`
- `public abstract void setMigrationInfo(org.flywaydb.core.api.MigrationInfo p0)`

---

## public class `org.flywaydb.core.internal.callback.DefaultCallbackExecutor`
implements `org.flywaydb.core.internal.callback.CallbackExecutor`  

**Constructors:**
- `public DefaultCallbackExecutor(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Database p1, org.flywaydb.core.internal.database.base.Schema p2, java.util.Collection p3)`

**Methods:**
- `public void onEachMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onOperationFinishEvent(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.output.OperationResult p1)`
- `public void setMigrationInfo(org.flywaydb.core.api.MigrationInfo p0)`

---

## public final enum `org.flywaydb.core.internal.callback.NoopCallback`
extends `java.lang.Enum`  
implements `org.flywaydb.core.api.callback.Callback`  

**Fields:**
- `public final static org.flywaydb.core.internal.callback.NoopCallback INSTANCE`

**Methods:**
- `public boolean canHandleInTransaction(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`
- `public java.lang.String getCallbackName()`
- `public void handle(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`
- `public boolean supports(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.callback.Context p1)`

---

## public final enum `org.flywaydb.core.internal.callback.NoopCallbackExecutor`
extends `java.lang.Enum`  
implements `org.flywaydb.core.internal.callback.CallbackExecutor`  

**Fields:**
- `public final static org.flywaydb.core.internal.callback.NoopCallbackExecutor INSTANCE`

**Methods:**
- `public void onEachMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onMigrateOrUndoEvent(org.flywaydb.core.api.callback.Event p0)`
- `public void onOperationFinishEvent(org.flywaydb.core.api.callback.Event p0, org.flywaydb.core.api.output.OperationResult p1)`
- `public void setMigrationInfo(org.flywaydb.core.api.MigrationInfo p0)`

---

## public class `org.flywaydb.core.internal.callback.SimpleContext`
implements `org.flywaydb.core.api.callback.Context`  

**Constructors:**
- `public SimpleContext(org.flywaydb.core.api.configuration.Configuration p0)`
- `public SimpleContext(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Connection p1, org.flywaydb.core.api.MigrationInfo p2, java.lang.String p3, java.util.List p4, java.util.List p5)`
- `public SimpleContext(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Connection p1, org.flywaydb.core.api.MigrationInfo p2, org.flywaydb.core.api.output.OperationResult p3)`

**Methods:**
- `public org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public java.sql.Connection getConnection()`
- `public org.flywaydb.core.api.MigrationInfo getMigrationInfo()`
- `public org.flywaydb.core.api.output.OperationResult getOperationResult()`
- `public org.flywaydb.core.api.callback.Statement getStatement()`

---

## public class `org.flywaydb.core.internal.callback.SqlScriptCallbackFactory`

**Constructors:**
- `public SqlScriptCallbackFactory(org.flywaydb.core.api.ResourceProvider p0, org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p1, org.flywaydb.core.internal.sqlscript.SqlScriptFactory p2, org.flywaydb.core.api.configuration.Configuration p3)`

**Methods:**
- `public java.util.List getCallbacks()`

---

## public final enum `org.flywaydb.core.internal.clazz.NoopClassProvider`
extends `java.lang.Enum`  
implements `org.flywaydb.core.api.ClassProvider`  

**Fields:**
- `public final static org.flywaydb.core.internal.clazz.NoopClassProvider INSTANCE`

**Methods:**
- `public java.util.Collection getClasses()`

---

## public class `org.flywaydb.core.internal.command.DbBaseline`

**Constructors:**
- `public DbBaseline(org.flywaydb.core.internal.schemahistory.SchemaHistory p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, org.flywaydb.core.internal.callback.CallbackExecutor p3, org.flywaydb.core.internal.database.base.Database p4)`

**Methods:**
- `public org.flywaydb.core.api.output.BaselineResult baseline()`

---

## public class `org.flywaydb.core.internal.command.DbInfo`

**Constructors:**
- `public DbInfo(org.flywaydb.core.internal.resolver.CompositeMigrationResolver p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.api.configuration.Configuration p2, org.flywaydb.core.internal.database.base.Database p3, org.flywaydb.core.internal.callback.CallbackExecutor p4, org.flywaydb.core.internal.database.base.Schema[] p5)`

**Methods:**
- `public org.flywaydb.core.api.MigrationInfoService info()`

---

## public class `org.flywaydb.core.internal.command.DbMigrate`

**Constructors:**
- `public DbMigrate(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.internal.database.base.Schema p2, org.flywaydb.core.internal.resolver.CompositeMigrationResolver p3, org.flywaydb.core.api.configuration.Configuration p4, org.flywaydb.core.internal.callback.CallbackExecutor p5)`

**Methods:**
- `public org.flywaydb.core.api.output.MigrateResult migrate() throws org.flywaydb.core.api.FlywayException`

---

## public static class `org.flywaydb.core.internal.command.DbMigrate$FlywayMigrateException`
extends `org.flywaydb.core.api.FlywayException`  

**Methods:**
- `public org.flywaydb.core.api.output.MigrateErrorResult getErrorResult()`
- `public org.flywaydb.core.api.MigrationInfo getMigration()`
- `public org.flywaydb.core.api.ErrorCode getMigrationErrorCode()`
- `public boolean isExecutableInTransaction()`
- `public boolean isOutOfOrder()`

---

## public class `org.flywaydb.core.internal.command.DbRepair`

**Constructors:**
- `public DbRepair(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.internal.resolver.CompositeMigrationResolver p1, org.flywaydb.core.internal.schemahistory.SchemaHistory p2, org.flywaydb.core.internal.callback.CallbackExecutor p3, org.flywaydb.core.api.configuration.Configuration p4)`

**Methods:**
- `public org.flywaydb.core.api.output.RepairResult repair()`

---

## public static class `org.flywaydb.core.internal.command.DbRepair$CompletedRepairActions`

**Constructors:**
- `public CompletedRepairActions()`

**Fields:**
- `public boolean alignedAppliedMigrationChecksums`
- `public boolean deletedMissingMigrations`
- `public boolean removedFailedMigrations`

**Methods:**
- `public java.lang.String alignedMessage()`
- `public java.lang.String deletedMessage()`
- `public java.lang.String removedMessage()`

---

## public class `org.flywaydb.core.internal.command.DbSchemas`

**Constructors:**
- `public DbSchemas(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.internal.database.base.Schema[] p1, org.flywaydb.core.internal.schemahistory.SchemaHistory p2, org.flywaydb.core.internal.callback.CallbackExecutor p3)`

**Methods:**
- `public void create(boolean p0)`

---

## public class `org.flywaydb.core.internal.command.DbValidate`

**Constructors:**
- `public DbValidate(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.internal.database.base.Schema p2, org.flywaydb.core.internal.resolver.CompositeMigrationResolver p3, org.flywaydb.core.api.configuration.Configuration p4, org.flywaydb.core.internal.callback.CallbackExecutor p5, org.flywaydb.core.api.pattern.ValidatePattern[] p6)`

**Methods:**
- `public org.flywaydb.core.api.output.ValidateResult validate()`

---

## public class `org.flywaydb.core.internal.command.clean.CleanExecutor`

**Constructors:**
- `public CleanExecutor(org.flywaydb.core.internal.database.base.Connection p0, org.flywaydb.core.internal.database.base.Database p1, org.flywaydb.core.internal.schemahistory.SchemaHistory p2, org.flywaydb.core.internal.callback.CallbackExecutor p3)`

**Fields:**
- `protected final org.flywaydb.core.internal.callback.CallbackExecutor callbackExecutor`
- `protected final org.flywaydb.core.internal.database.base.Connection connection`
- `protected final org.flywaydb.core.internal.database.base.Database database`
- `protected final org.flywaydb.core.internal.schemahistory.SchemaHistory schemaHistory`

**Methods:**
- `public void clean(org.flywaydb.core.internal.database.base.Schema p0, org.flywaydb.core.internal.database.base.Schema[] p1, org.flywaydb.core.api.output.CleanResult p2)`
- `protected void clean(org.flywaydb.core.internal.database.base.Schema[] p0, org.flywaydb.core.api.output.CleanResult p1, java.util.List p2)`
- `protected void doCleanSchema(org.flywaydb.core.internal.database.base.Schema p0)`

---

## public class `org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension`
implements `org.flywaydb.core.extensibility.ConfigurationExtension`  

**Constructors:**
- `public CleanModeConfigurationExtension()`

**Methods:**
- `public org.flywaydb.core.internal.command.clean.CleanModel getClean()`
- `public java.lang.String getConfigurationParameterFromEnvironmentVariable(java.lang.String p0)`
- `public java.lang.String getNamespace()`
- `public void setClean(org.flywaydb.core.internal.command.clean.CleanModel p0)`
- `public void setCleanSchemasExclude(java.lang.String... p0)`

---

## public final static enum `org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension$Mode`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension$Mode ALL`
- `public final static org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension$Mode DEFAULT`
- `public final static org.flywaydb.core.internal.command.clean.CleanModeConfigurationExtension$Mode SCHEMA`

---

## public class `org.flywaydb.core.internal.command.clean.CleanModel`

**Constructors:**
- `public CleanModel()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getMode()`
- `public org.flywaydb.core.internal.command.clean.SchemaModel getSchemas()`
- `public int hashCode()`
- `public void setMode(java.lang.String p0)`
- `public void setSchemas(org.flywaydb.core.internal.command.clean.SchemaModel p0)`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.command.clean.DbClean`

**Constructors:**
- `public DbClean(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.internal.database.base.Schema p2, org.flywaydb.core.internal.database.base.Schema[] p3, org.flywaydb.core.internal.callback.CallbackExecutor p4, org.flywaydb.core.api.configuration.Configuration p5)`

**Fields:**
- `protected final org.flywaydb.core.internal.callback.CallbackExecutor callbackExecutor`
- `protected final org.flywaydb.core.api.configuration.Configuration configuration`
- `protected final org.flywaydb.core.internal.database.base.Connection connection`
- `protected final org.flywaydb.core.internal.database.base.Database database`
- `protected final org.flywaydb.core.internal.database.base.Schema defaultSchema`
- `protected final org.flywaydb.core.internal.database.base.Schema[] schemas`

**Methods:**
- `public org.flywaydb.core.api.output.CleanResult clean() throws org.flywaydb.core.api.FlywayException`

---

## public class `org.flywaydb.core.internal.command.clean.SchemaModel`

**Constructors:**
- `public SchemaModel()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getExclude()`
- `public int hashCode()`
- `public void setExclude(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.configuration.ConfigUtils`

**Fields:**
- `public final static java.lang.String BASELINE_DESCRIPTION`
- `public final static java.lang.String BASELINE_ON_MIGRATE`
- `public final static java.lang.String BASELINE_VERSION`
- `public final static java.lang.String BATCH`
- `public final static java.lang.String CALLBACKS`
- `public final static java.lang.String CHERRY_PICK`
- `public final static java.lang.String CLEAN_DISABLED`
- `public final static java.lang.String CLEAN_ON_VALIDATION_ERROR`
- `public final static java.lang.String CONFIGURATIONS`
- `public final static java.lang.String CONFIG_FILES`
- `public final static java.lang.String CONFIG_FILE_ENCODING`
- `public final static java.lang.String CONFIG_FILE_NAME`
- `public final static java.lang.String CONNECT_RETRIES`
- `public final static java.lang.String CONNECT_RETRIES_INTERVAL`
- `public final static java.lang.String CREATE_SCHEMAS`
- `public final static java.lang.String DEFAULT_SCHEMA`
- `public final static java.lang.String DETECT_ENCODING`
- `public final static java.lang.String DRIVER`
- `public final static java.lang.String DRYRUN_OUTPUT`
- `public final static java.lang.String ENCODING`
- `public final static java.lang.String ERROR_OVERRIDES`
- `public final static java.lang.String EXECUTE_IN_TRANSACTION`
- `public final static java.lang.String FAIL_ON_MISSING_LOCATIONS`
- `public final static java.lang.String FLYWAY_PLUGINS_PREFIX`
- `public final static java.lang.String GROUP`
- `public final static java.lang.String IGNORE_MIGRATION_PATTERNS`
- `public final static java.lang.String INIT_SQL`
- `public final static java.lang.String INSTALLED_BY`
- `public final static java.lang.String JAR_DIRS`
- `public final static java.lang.String JDBC_PROPERTIES_PREFIX`
- `public final static java.lang.String KERBEROS_CONFIG_FILE`
- `public final static java.lang.String LICENSE_KEY`
- `public final static java.lang.String LOCATIONS`
- `public final static java.lang.String LOCK_RETRY_COUNT`
- `public final static java.lang.String LOGGERS`
- `public final static java.lang.String MIXED`
- `public final static java.lang.String OUTPUT_QUERY_RESULTS`
- `public final static java.lang.String OUT_OF_ORDER`
- `public final static java.lang.String PASSWORD`
- `public final static java.lang.String PLACEHOLDERS_PROPERTY_PREFIX`
- `public final static java.lang.String PLACEHOLDER_PREFIX`
- `public final static java.lang.String PLACEHOLDER_REPLACEMENT`
- `public final static java.lang.String PLACEHOLDER_SEPARATOR`
- `public final static java.lang.String PLACEHOLDER_SUFFIX`
- `public final static java.lang.String REPEATABLE_SQL_MIGRATION_PREFIX`
- `public final static java.lang.String REPORT_ENABLED`
- `public final static java.lang.String REPORT_FILENAME`
- `public final static java.lang.String RESOLVERS`
- `public final static java.lang.String SCHEMAS`
- `public final static java.lang.String SCRIPT_PLACEHOLDER_PREFIX`
- `public final static java.lang.String SCRIPT_PLACEHOLDER_SUFFIX`
- `public final static java.lang.String SKIP_DEFAULT_CALLBACKS`
- `public final static java.lang.String SKIP_DEFAULT_RESOLVERS`
- `public final static java.lang.String SKIP_EXECUTING_MIGRATIONS`
- `public final static java.lang.String SQL_MIGRATION_PREFIX`
- `public final static java.lang.String SQL_MIGRATION_SEPARATOR`
- `public final static java.lang.String SQL_MIGRATION_SUFFIXES`
- `public final static java.lang.String STREAM`
- `public final static java.lang.String TABLE`
- `public final static java.lang.String TABLESPACE`
- `public final static java.lang.String TARGET`
- `public final static java.lang.String UNDO_SQL_MIGRATION_PREFIX`
- `public final static java.lang.String URL`
- `public final static java.lang.String USER`
- `public final static java.lang.String VALIDATE_MIGRATION_NAMING`
- `public final static java.lang.String VALIDATE_ON_MIGRATE`

**Methods:**
- `public static void checkConfigurationForUnrecognisedProperties(java.util.Map p0, java.lang.String p1)`
- `public static java.lang.String convertKey(java.lang.String p0)`
- `public static void dumpConfiguration(java.util.Map p0)`
- `public static java.util.Map environmentVariablesToPropertyMap()`
- `public static java.util.List getDefaultTomlConfigFileLocations(java.io.File p0)`
- `public static java.util.Map loadConfigurationFile(java.io.File p0, java.lang.String p1, boolean p2) throws org.flywaydb.core.api.FlywayException`
- `public static java.util.Map loadConfigurationFromInputStream(java.io.InputStream p0)`
- `public static java.util.Map loadConfigurationFromReader(java.io.Reader p0) throws org.flywaydb.core.api.FlywayException`
- `public static java.util.Map loadConfigurationFromString(java.lang.String p0) throws java.io.IOException`
- `public static java.util.Map loadDefaultConfigurationFiles(java.io.File p0, java.lang.String p1)`
- `public static java.util.Map propertiesToMap(java.util.Properties p0)`
- `public static void putArrayIfSet(java.util.Map p0, java.lang.String p1, java.lang.String[]... p2)`
- `public static void putIfSet(java.util.Map p0, java.lang.String p1, java.lang.Object... p2)`
- `public static java.lang.Boolean removeBoolean(java.util.Map p0, java.lang.String p1)`
- `public static java.lang.Integer removeInteger(java.util.Map p0, java.lang.String p1)`

---

## public class `org.flywaydb.core.internal.configuration.ConfigurationValidator`

**Constructors:**
- `public ConfigurationValidator()`

**Methods:**
- `public void validate(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public class `org.flywaydb.core.internal.configuration.ListDeserializer`
extends `com.fasterxml.jackson.databind.JsonDeserializer`  

**Constructors:**
- `public ListDeserializer()`

**Methods:**
- `public java.util.List deserialize(com.fasterxml.jackson.core.JsonParser p0, com.fasterxml.jackson.databind.DeserializationContext p1) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.configuration.TomlUtils`

**Constructors:**
- `public TomlUtils()`

**Fields:**
- `public final static java.lang.String MSG`

**Methods:**
- `public static org.flywaydb.core.internal.configuration.models.ConfigurationModel loadConfigurationFiles(java.util.List p0, java.lang.String p1)`
- `public static org.flywaydb.core.internal.configuration.models.ConfigurationModel loadConfigurationFromCommandlineArgs(java.util.Map p0)`
- `public static org.flywaydb.core.internal.configuration.models.ConfigurationModel loadConfigurationFromEnvironment()`

---

## public class `org.flywaydb.core.internal.configuration.models.ConfigurationModel`

**Constructors:**
- `public ConfigurationModel()`

**Methods:**
- `public static org.flywaydb.core.internal.configuration.models.ConfigurationModel clone(org.flywaydb.core.internal.configuration.models.ConfigurationModel p0)`
- `public static org.flywaydb.core.internal.configuration.models.ConfigurationModel defaults()`
- `public java.util.Map getEnvironments()`
- `public org.flywaydb.core.internal.configuration.models.FlywayModel getFlyway()`
- `public java.lang.String getId()`
- `public org.flywaydb.core.internal.configuration.models.ConfigurationModel merge(org.flywaydb.core.internal.configuration.models.ConfigurationModel p0)`
- `public void setEnvironments(java.util.Map p0)`
- `public void setFlyway(org.flywaydb.core.internal.configuration.models.FlywayModel p0)`
- `public void setId(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.configuration.models.EnvironmentModel`

**Constructors:**
- `public EnvironmentModel()`

**Methods:**
- `public java.lang.Integer getConnectRetries()`
- `public java.lang.Integer getConnectRetriesInterval()`
- `public java.lang.String getDriver()`
- `public java.lang.String getInitSql()`
- `public java.util.Map getJdbcProperties()`
- `public java.lang.String getPassword()`
- `public java.util.Map getResolvers()`
- `public java.util.List getSchemas()`
- `public java.lang.String getToken()`
- `public java.lang.String getUrl()`
- `public java.lang.String getUser()`
- `public org.flywaydb.core.internal.configuration.models.EnvironmentModel merge(org.flywaydb.core.internal.configuration.models.EnvironmentModel p0)`
- `public void setConnectRetries(java.lang.Integer p0)`
- `public void setConnectRetriesInterval(java.lang.Integer p0)`
- `public void setDriver(java.lang.String p0)`
- `public void setInitSql(java.lang.String p0)`
- `public void setJdbcProperties(java.util.Map p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setResolvers(java.util.Map p0)`
- `public void setSchemas(java.util.List p0)`
- `public void setToken(java.lang.String p0)`
- `public void setUrl(java.lang.String p0)`
- `public void setUser(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.configuration.models.FlywayModel`

**Constructors:**
- `public FlywayModel()`

**Fields:**
- `public final static java.lang.String DEFAULT_REPORT_FILENAME`

**Methods:**
- `public static org.flywaydb.core.internal.configuration.models.FlywayModel defaults()`
- `public java.lang.String getBaselineDescription()`
- `public java.lang.Boolean getBaselineOnMigrate()`
- `public java.lang.String getBaselineVersion()`
- `public java.lang.Boolean getBatch()`
- `public java.util.List getCallbacks()`
- `public java.util.List getCherryPick()`
- `public java.lang.Boolean getCleanDisabled()`
- `public java.lang.Boolean getCleanOnValidationError()`
- `public java.lang.Boolean getCreateSchemas()`
- `public java.lang.String getDefaultSchema()`
- `public java.lang.Boolean getDetectEncoding()`
- `public java.lang.String getDryRunOutput()`
- `public java.lang.String getEncoding()`
- `public java.lang.String getEnvironment()`
- `public java.util.List getErrorOverrides()`
- `public java.lang.Boolean getExecuteInTransaction()`
- `public java.lang.Boolean getFailOnMissingLocations()`
- `public java.lang.Boolean getFailOnMissingTarget()`
- `public java.lang.Boolean getGroup()`
- `public java.util.List getIgnoreMigrationPatterns()`
- `public java.lang.String getInstalledBy()`
- `public java.lang.String getKerberosConfigFile()`
- `public java.lang.String getLicenseKey()`
- `public java.util.List getLocations()`
- `public java.lang.Integer getLockRetryCount()`
- `public java.util.List getLoggers()`
- `public java.util.List getMigrationResolvers()`
- `public java.lang.Boolean getMixed()`
- `public java.lang.Boolean getOutOfOrder()`
- `public java.lang.Boolean getOutputQueryResults()`
- `public java.lang.String getPlaceholderPrefix()`
- `public java.lang.Boolean getPlaceholderReplacement()`
- `public java.lang.String getPlaceholderSeparator()`
- `public java.lang.String getPlaceholderSuffix()`
- `public java.util.Map getPlaceholders()`
- `public java.util.Map getPluginConfigurations()`
- `public java.util.Map getPropertyResolvers()`
- `public java.lang.String getRepeatableSqlMigrationPrefix()`
- `public java.lang.Boolean getReportEnabled()`
- `public java.lang.String getReportFilename()`
- `public java.lang.String getScriptPlaceholderPrefix()`
- `public java.lang.String getScriptPlaceholderSuffix()`
- `public java.lang.Boolean getSkipDefaultCallbacks()`
- `public java.lang.Boolean getSkipDefaultResolvers()`
- `public java.lang.Boolean getSkipExecutingMigrations()`
- `public java.lang.String getSqlMigrationPrefix()`
- `public java.lang.String getSqlMigrationSeparator()`
- `public java.util.List getSqlMigrationSuffixes()`
- `public java.lang.Boolean getStream()`
- `public java.lang.String getTable()`
- `public java.lang.String getTablespace()`
- `public java.lang.String getTarget()`
- `public java.lang.String getUndoSqlMigrationPrefix()`
- `public java.lang.Boolean getValidateMigrationNaming()`
- `public java.lang.Boolean getValidateOnMigrate()`
- `public org.flywaydb.core.internal.configuration.models.FlywayModel merge(org.flywaydb.core.internal.configuration.models.FlywayModel p0)`
- `public void setBaselineDescription(java.lang.String p0)`
- `public void setBaselineOnMigrate(java.lang.Boolean p0)`
- `public void setBaselineVersion(java.lang.String p0)`
- `public void setBatch(java.lang.Boolean p0)`
- `public void setCallbacks(java.util.List p0)`
- `public void setCherryPick(java.util.List p0)`
- `public void setCleanDisabled(java.lang.Boolean p0)`
- `public void setCleanOnValidationError(java.lang.Boolean p0)`
- `public void setCreateSchemas(java.lang.Boolean p0)`
- `public void setDefaultSchema(java.lang.String p0)`
- `public void setDetectEncoding(java.lang.Boolean p0)`
- `public void setDryRunOutput(java.lang.String p0)`
- `public void setEncoding(java.lang.String p0)`
- `public void setEnvironment(java.lang.String p0)`
- `public void setErrorOverrides(java.util.List p0)`
- `public void setExecuteInTransaction(java.lang.Boolean p0)`
- `public void setFailOnMissingLocations(java.lang.Boolean p0)`
- `public void setFailOnMissingTarget(java.lang.Boolean p0)`
- `public void setGroup(java.lang.Boolean p0)`
- `public void setIgnoreMigrationPatterns(java.util.List p0)`
- `public void setInstalledBy(java.lang.String p0)`
- `public void setKerberosConfigFile(java.lang.String p0)`
- `public void setLicenseKey(java.lang.String p0)`
- `public void setLocations(java.util.List p0)`
- `public void setLockRetryCount(java.lang.Integer p0)`
- `public void setLoggers(java.util.List p0)`
- `public void setMigrationResolvers(java.util.List p0)`
- `public void setMixed(java.lang.Boolean p0)`
- `public void setOutOfOrder(java.lang.Boolean p0)`
- `public void setOutputQueryResults(java.lang.Boolean p0)`
- `public void setPlaceholderPrefix(java.lang.String p0)`
- `public void setPlaceholderReplacement(java.lang.Boolean p0)`
- `public void setPlaceholderSeparator(java.lang.String p0)`
- `public void setPlaceholderSuffix(java.lang.String p0)`
- `public void setPlaceholders(java.util.Map p0)`
- `public void setPluginConfigurations(java.util.Map p0)`
- `public void setPropertyResolvers(java.util.Map p0)`
- `public void setRepeatableSqlMigrationPrefix(java.lang.String p0)`
- `public void setReportEnabled(java.lang.Boolean p0)`
- `public void setReportFilename(java.lang.String p0)`
- `public void setScriptPlaceholderPrefix(java.lang.String p0)`
- `public void setScriptPlaceholderSuffix(java.lang.String p0)`
- `public void setSkipDefaultCallbacks(java.lang.Boolean p0)`
- `public void setSkipDefaultResolvers(java.lang.Boolean p0)`
- `public void setSkipExecutingMigrations(java.lang.Boolean p0)`
- `public void setSqlMigrationPrefix(java.lang.String p0)`
- `public void setSqlMigrationSeparator(java.lang.String p0)`
- `public void setSqlMigrationSuffixes(java.util.List p0)`
- `public void setStream(java.lang.Boolean p0)`
- `public void setTable(java.lang.String p0)`
- `public void setTablespace(java.lang.String p0)`
- `public void setTarget(java.lang.String p0)`
- `public void setUndoSqlMigrationPrefix(java.lang.String p0)`
- `public void setValidateMigrationNaming(java.lang.Boolean p0)`
- `public void setValidateOnMigrate(java.lang.Boolean p0)`

---

## public class `org.flywaydb.core.internal.configuration.models.PropertyResolver`

**Constructors:**
- `public PropertyResolver()`

---

## public class `org.flywaydb.core.internal.configuration.models.ResolvedEnvironment`

**Constructors:**
- `public ResolvedEnvironment()`

**Methods:**
- `public java.lang.Integer getConnectRetries()`
- `public java.lang.Integer getConnectRetriesInterval()`
- `public java.lang.String getDriver()`
- `public java.lang.String getInitSql()`
- `public java.util.Map getJdbcProperties()`
- `public java.lang.String getPassword()`
- `public java.util.List getSchemas()`
- `public java.lang.String getToken()`
- `public java.lang.String getUrl()`
- `public java.lang.String getUser()`
- `public void setConnectRetries(java.lang.Integer p0)`
- `public void setConnectRetriesInterval(java.lang.Integer p0)`
- `public void setDriver(java.lang.String p0)`
- `public void setInitSql(java.lang.String p0)`
- `public void setJdbcProperties(java.util.Map p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setSchemas(java.util.List p0)`
- `public void setToken(java.lang.String p0)`
- `public void setUrl(java.lang.String p0)`
- `public void setUser(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.configuration.resolvers.EnvironmentResolver`

**Constructors:**
- `public EnvironmentResolver(java.util.Map p0)`

**Methods:**
- `public org.flywaydb.core.internal.configuration.models.ResolvedEnvironment resolve(org.flywaydb.core.internal.configuration.models.EnvironmentModel p0)`

---

## public class `org.flywaydb.core.internal.configuration.resolvers.EnvironmentVariableResolver`
implements `org.flywaydb.core.internal.configuration.resolvers.PropertyResolver`  

**Constructors:**
- `public EnvironmentVariableResolver()`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String resolve(java.lang.String p0, org.flywaydb.core.internal.configuration.resolvers.PropertyResolverContext p1)`

---

## public abstract interface `org.flywaydb.core.internal.configuration.resolvers.PropertyResolver`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String resolve(java.lang.String p0, org.flywaydb.core.internal.configuration.resolvers.PropertyResolverContext p1)`

---

## public abstract interface `org.flywaydb.core.internal.configuration.resolvers.PropertyResolverContext`

**Methods:**
- `public abstract java.lang.String resolveProperty(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String resolveValue(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.configuration.resolvers.PropertyResolverContextImpl`
implements `org.flywaydb.core.internal.configuration.resolvers.PropertyResolverContext`  

**Constructors:**
- `public PropertyResolverContextImpl(java.util.Map p0, java.util.Map p1)`

**Methods:**
- `public java.lang.String resolveProperty(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String resolveValue(java.lang.String p0)`

---

## public abstract interface `org.flywaydb.core.internal.database.DatabaseExecutionStrategy`

**Methods:**
- `public abstract <T extends java.lang.Object> T execute(org.flywaydb.core.internal.util.SqlCallable p0) throws java.sql.SQLException`

---

## public abstract interface `org.flywaydb.core.internal.database.DatabaseType`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract java.sql.Connection alterConnectionAsNeeded(java.sql.Connection p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public abstract org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, boolean p1, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p2, org.flywaydb.core.internal.jdbc.StatementInterceptor p3)`
- `public abstract org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public abstract org.flywaydb.core.internal.database.DatabaseExecutionStrategy createExecutionStrategy(java.sql.Connection p0)`
- `public abstract org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public abstract org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory createSqlScriptExecutorFactory(org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p0, org.flywaydb.core.internal.callback.CallbackExecutor p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public abstract org.flywaydb.core.internal.sqlscript.SqlScriptFactory createSqlScriptFactory(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`
- `public abstract org.flywaydb.core.internal.jdbc.ExecutionTemplate createTransactionalExecutionTemplate(java.sql.Connection p0, boolean p1)`
- `public abstract boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public abstract boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public abstract boolean externalAuthPropertiesRequired(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.lang.String getBackupDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public abstract java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public abstract java.util.Properties getExternalAuthProperties(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.regex.Pattern getJDBCCredentialsPattern()`
- `public abstract java.lang.String getName()`
- `public abstract int getNullType()`
- `public default java.util.List getSpecialResourceFilenames(org.flywaydb.core.api.configuration.Configuration p0)`
- `public abstract boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public abstract boolean handlesJDBCUrl(java.lang.String p0)`
- `public abstract java.lang.String instantiateClassExtendedErrorMessage()`
- `public abstract void printMessages()`
- `public abstract void setConfigConnectionProps(org.flywaydb.core.api.configuration.Configuration p0, java.util.Properties p1, java.lang.ClassLoader p2)`
- `public abstract void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`
- `public abstract void setOverridingConnectionProps(java.util.Map p0)`
- `public abstract void shutdownDatabase(java.lang.String p0, java.sql.Driver p1)`
- `public abstract boolean supportsReadOnlyTransactions()`

---

## public class `org.flywaydb.core.internal.database.DatabaseTypeRegister`

**Constructors:**
- `public DatabaseTypeRegister()`

**Methods:**
- `public static org.flywaydb.core.internal.database.DatabaseType getDatabaseTypeForConnection(java.sql.Connection p0)`
- `public static org.flywaydb.core.internal.database.DatabaseType getDatabaseTypeForUrl(java.lang.String p0)`
- `public static java.lang.String redactJdbcUrl(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.DefaultExecutionStrategy`
implements `org.flywaydb.core.internal.database.DatabaseExecutionStrategy`  

**Constructors:**
- `public DefaultExecutionStrategy()`

**Methods:**
- `public <T extends java.lang.Object> T execute(org.flywaydb.core.internal.util.SqlCallable p0) throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.InsertRowLock`

**Constructors:**
- `public InsertRowLock(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, int p1)`

**Methods:**
- `public void doLock(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.sql.SQLException`
- `public void doUnlock(java.lang.String p0) throws java.sql.SQLException`

---

## public abstract class `org.flywaydb.core.internal.database.base.BaseDatabaseType`
implements `org.flywaydb.core.internal.database.DatabaseType`  

**Constructors:**
- `public BaseDatabaseType()`

**Fields:**
- `protected final static java.lang.String APPLICATION_NAME`

**Methods:**
- `public java.sql.Connection alterConnectionAsNeeded(java.sql.Connection p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, boolean p1, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p2, org.flywaydb.core.internal.jdbc.StatementInterceptor p3)`
- `public abstract org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.database.DatabaseExecutionStrategy createExecutionStrategy(java.sql.Connection p0)`
- `public abstract org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory createSqlScriptExecutorFactory(org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p0, org.flywaydb.core.internal.callback.CallbackExecutor p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.sqlscript.SqlScriptFactory createSqlScriptFactory(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`
- `public org.flywaydb.core.internal.jdbc.ExecutionTemplate createTransactionalExecutionTemplate(java.sql.Connection p0, boolean p1)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public boolean externalAuthPropertiesRequired(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getBackupDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public static java.util.regex.Pattern getDefaultJDBCCredentialsPattern()`
- `public abstract java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.util.Properties getExternalAuthProperties(java.lang.String p0, java.lang.String p1)`
- `public java.util.regex.Pattern getJDBCCredentialsPattern()`
- `public abstract java.lang.String getName()`
- `public abstract int getNullType()`
- `public static java.lang.String getSelectVersionOutput(java.sql.Connection p0)`
- `public abstract boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public abstract boolean handlesJDBCUrl(java.lang.String p0)`
- `public java.lang.String instantiateClassExtendedErrorMessage()`
- `public void printMessages()`
- `public void setConfigConnectionProps(org.flywaydb.core.api.configuration.Configuration p0, java.util.Properties p1, java.lang.ClassLoader p2)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`
- `public void setOverridingConnectionProps(java.util.Map p0)`
- `public void shutdownDatabase(java.lang.String p0, java.sql.Driver p1)`
- `public boolean supportsReadOnlyTransactions()`
- `public java.lang.String toString()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Connection`<D extends org.flywaydb.core.internal.database.base.Database>
implements `java.io.Closeable`  

**Constructors:**
- `protected Connection(D p0, java.sql.Connection p1)`

**Fields:**
- `protected final D database`
- `protected org.flywaydb.core.internal.jdbc.JdbcTemplate jdbcTemplate`
- `protected final java.lang.String originalSchemaNameOrSearchPath`

**Methods:**
- `public void changeCurrentSchemaTo(org.flywaydb.core.internal.database.base.Schema p0)`
- `public final void close()`
- `protected void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected org.flywaydb.core.internal.database.base.Schema doGetCurrentSchema() throws java.sql.SQLException`
- `protected void doRestoreOriginalState() throws java.sql.SQLException`
- `public final org.flywaydb.core.internal.database.base.Schema getCurrentSchema()`
- `protected abstract java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public final java.sql.Connection getJdbcConnection()`
- `public final org.flywaydb.core.internal.jdbc.JdbcTemplate getJdbcTemplate()`
- `public abstract org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`
- `public <T extends java.lang.Object> T lock(org.flywaydb.core.internal.database.base.Table p0, java.util.concurrent.Callable p1)`
- `public final void restoreOriginalState()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Database`<C extends org.flywaydb.core.internal.database.base.Connection>
implements `java.io.Closeable`  

**Constructors:**
- `public Database(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Fields:**
- `protected final org.flywaydb.core.api.configuration.Configuration configuration`
- `protected final org.flywaydb.core.internal.database.DatabaseType databaseType`
- `protected final org.flywaydb.core.internal.jdbc.JdbcConnectionFactory jdbcConnectionFactory`
- `protected final java.sql.DatabaseMetaData jdbcMetaData`
- `protected org.flywaydb.core.internal.jdbc.JdbcTemplate jdbcTemplate`
- `protected final java.sql.Connection rawMainJdbcConnection`
- `protected final org.flywaydb.core.internal.jdbc.StatementInterceptor statementInterceptor`

**Methods:**
- `public abstract boolean catalogIsSchema()`
- `public void cleanPostSchemas(org.flywaydb.core.internal.database.base.Schema[] p0)`
- `public void cleanPreSchemas()`
- `public void close()`
- `protected java.lang.String computeVersionDisplayName(org.flywaydb.core.api.MigrationVersion p0)`
- `protected org.flywaydb.core.api.MigrationVersion determineVersion()`
- `public void disposeEventConnection()`
- `protected void doCleanPostSchemas(org.flywaydb.core.internal.database.base.Schema[] p0) throws java.sql.SQLException`
- `protected void doCleanPreSchemas() throws java.sql.SQLException`
- `protected java.lang.String doGetCatalog() throws java.sql.SQLException`
- `protected abstract C doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public java.lang.String doQuote(java.lang.String p0)`
- `protected final void ensureDatabaseIsRecentEnough(java.lang.String p0)`
- `protected final void ensureDatabaseNotOlderThanOtherwiseRecommendUpgradeToFlywayEdition(java.lang.String p0, org.flywaydb.core.internal.license.Edition p1)`
- `public abstract void ensureSupported()`
- `public org.flywaydb.core.internal.database.base.Schema[] getAllSchemas()`
- `public final java.lang.String getBaselineStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public abstract java.lang.String getBooleanFalse()`
- `public abstract java.lang.String getBooleanTrue()`
- `public final java.lang.String getCatalog()`
- `protected java.lang.String getCloseQuote()`
- `public org.flywaydb.core.api.configuration.Configuration getConfiguration()`
- `public final org.flywaydb.core.internal.sqlscript.SqlScript getCreateScript(org.flywaydb.core.internal.sqlscript.SqlScriptFactory p0, org.flywaydb.core.internal.database.base.Table p1, boolean p2)`
- `public final java.lang.String getCurrentUser()`
- `public org.flywaydb.core.internal.database.DatabaseType getDatabaseType()`
- `public org.flywaydb.core.internal.sqlscript.Delimiter getDefaultDelimiter()`
- `protected java.lang.String getEscapedQuote()`
- `public final C getEventConnection()`
- `public java.lang.String getInsertStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public final java.lang.String getInstalledBy()`
- `public java.sql.DatabaseMetaData getJdbcMetaData()`
- `public final C getMainConnection()`
- `public final C getMigrationConnection()`
- `protected java.lang.String getOpenQuote()`
- `public abstract java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public java.lang.String getSelectStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public final org.flywaydb.core.api.MigrationVersion getVersion()`
- `public final boolean hasEventConnection()`
- `protected final void notifyDatabaseIsNotFormallySupported()`
- `public final java.lang.String quote(java.lang.String... p0)`
- `protected final void recommendFlywayUpgradeIfNecessary(java.lang.String p0)`
- `protected final void recommendFlywayUpgradeIfNecessaryForMajorVersion(java.lang.String p0)`
- `public abstract boolean supportsDdlTransactions()`
- `public boolean supportsEmptyMigrationDescription()`
- `public boolean supportsMultiStatementTransactions()`
- `public java.lang.String unQuote(java.lang.String p0)`
- `public boolean useSingleConnection()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Function`<D extends org.flywaydb.core.internal.database.base.Database, S extends org.flywaydb.core.internal.database.base.Schema>
extends `org.flywaydb.core.internal.database.base.SchemaObject`  

**Constructors:**
- `public Function(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, D p1, S p2, java.lang.String p3, java.lang.String... p4)`

**Fields:**
- `protected java.lang.String[] args`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Schema`<D extends org.flywaydb.core.internal.database.base.Database, T extends org.flywaydb.core.internal.database.base.Table>

**Constructors:**
- `public Schema(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, D p1, java.lang.String p2)`

**Fields:**
- `protected final D database`
- `protected final org.flywaydb.core.internal.jdbc.JdbcTemplate jdbcTemplate`
- `protected final java.lang.String name`

**Methods:**
- `protected final org.flywaydb.core.internal.database.base.Function[] allFunctions()`
- `public T[] allTables()`
- `protected final org.flywaydb.core.internal.database.base.Type[] allTypes()`
- `public void clean()`
- `public void create()`
- `protected org.flywaydb.core.internal.database.base.Function[] doAllFunctions() throws java.sql.SQLException`
- `protected abstract T[] doAllTables() throws java.sql.SQLException`
- `protected abstract void doClean() throws java.sql.SQLException`
- `protected abstract void doCreate() throws java.sql.SQLException`
- `protected abstract void doDrop() throws java.sql.SQLException`
- `protected abstract boolean doEmpty() throws java.sql.SQLException`
- `protected abstract boolean doExists() throws java.sql.SQLException`
- `public void drop()`
- `public boolean empty()`
- `public boolean equals(java.lang.Object p0)`
- `public boolean exists()`
- `public org.flywaydb.core.internal.database.base.Function getFunction(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String getName()`
- `public abstract org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`
- `protected org.flywaydb.core.internal.database.base.Type getType(java.lang.String p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract class `org.flywaydb.core.internal.database.base.SchemaObject`<D extends org.flywaydb.core.internal.database.base.Database, S extends org.flywaydb.core.internal.database.base.Schema>

**Fields:**
- `protected final D database`
- `protected final org.flywaydb.core.internal.jdbc.JdbcTemplate jdbcTemplate`
- `protected final java.lang.String name`
- `protected final S schema`

**Methods:**
- `protected abstract void doDrop() throws java.sql.SQLException`
- `public final void drop()`
- `public final D getDatabase()`
- `public final java.lang.String getName()`
- `public final S getSchema()`
- `public java.lang.String toString()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Table`<D extends org.flywaydb.core.internal.database.base.Database, S extends org.flywaydb.core.internal.database.base.Schema>
extends `org.flywaydb.core.internal.database.base.SchemaObject`  

**Constructors:**
- `public Table(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, D p1, S p2, java.lang.String p3)`

**Fields:**
- `protected int lockDepth`

**Methods:**
- `protected abstract boolean doExists() throws java.sql.SQLException`
- `protected abstract void doLock() throws java.sql.SQLException`
- `protected void doUnlock() throws java.sql.SQLException`
- `public boolean exists()`
- `protected boolean exists(org.flywaydb.core.internal.database.base.Schema p0, org.flywaydb.core.internal.database.base.Schema p1, java.lang.String p2, java.lang.String... p3) throws java.sql.SQLException`
- `public void lock()`
- `public void unlock()`

---

## public class `org.flywaydb.core.internal.database.base.TestContainersDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public TestContainersDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public boolean supportsReadOnlyTransactions()`

---

## public abstract class `org.flywaydb.core.internal.database.base.Type`<D extends org.flywaydb.core.internal.database.base.Database, S extends org.flywaydb.core.internal.database.base.Schema>
extends `org.flywaydb.core.internal.database.base.SchemaObject`  

**Constructors:**
- `public Type(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, D p1, S p2, java.lang.String p3)`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Constructors:**
- `public CockroachDBConnection(org.flywaydb.core.internal.database.cockroachdb.CockroachDBDatabase p0, java.sql.Connection p1)`

**Methods:**
- `public void changeCurrentSchemaTo(org.flywaydb.core.internal.database.base.Schema p0)`
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema doGetCurrentSchema() throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public CockroachDBDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.api.MigrationVersion determineVersion()`
- `protected org.flywaydb.core.internal.database.cockroachdb.CockroachDBConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public java.lang.String doQuote(java.lang.String p0)`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getEscapedQuote()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public CockroachDBDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.database.DatabaseExecutionStrategy createExecutionStrategy(java.sql.Connection p0)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public org.flywaydb.core.internal.jdbc.ExecutionTemplate createTransactionalExecutionTemplate(java.sql.Connection p0, boolean p1)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public boolean externalAuthPropertiesRequired(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.util.Properties getExternalAuthProperties(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public int getPriority()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`
- `public boolean supportsReadOnlyTransactions()`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public CockroachDBParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected java.lang.Boolean detectCanExecuteInTransaction(java.lang.String p0, java.util.List p1)`
- `protected char getAlternativeStringLiteralQuote()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBRetryingStrategy`
implements `org.flywaydb.core.internal.database.DatabaseExecutionStrategy`  

**Constructors:**
- `public CockroachDBRetryingStrategy()`

**Methods:**
- `public <T extends java.lang.Object> T execute(org.flywaydb.core.internal.util.SqlCallable p0) throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Constructors:**
- `public CockroachDBSchema(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.cockroachdb.CockroachDBDatabase p1, java.lang.String p2)`

**Methods:**
- `protected org.flywaydb.core.internal.database.cockroachdb.CockroachDBTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCleanOnce() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doCreateOnce() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected void doDropOnce() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachDBTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected void doDropOnce() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected boolean doExistsOnce() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`
- `protected void doUnlock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.cockroachdb.CockroachRetryingTransactionalExecutionTemplate`
extends `org.flywaydb.core.internal.jdbc.TransactionalExecutionTemplate`  

**Methods:**
- `public <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Connection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Database`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public DB2Database(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.db2.DB2Connection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public java.lang.String getSelectStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.db2.DB2DatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public DB2DatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Function`
extends `org.flywaydb.core.internal.database.base.Function`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Parser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public DB2Parser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleCommentDirective(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected boolean isCommentDirective(java.lang.String p0)`
- `protected void resetDelimiter(org.flywaydb.core.internal.parser.ParserContext p0)`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Schema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.base.Function[] doAllFunctions() throws java.sql.SQLException`
- `protected org.flywaydb.core.internal.database.db2.DB2Table[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Function getFunction(java.lang.String p0, java.lang.String... p1)`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`
- `protected org.flywaydb.core.internal.database.base.Type getType(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Table`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.db2.DB2Type`
extends `org.flywaydb.core.internal.database.base.Type`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.derby.DerbyConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.derby.DerbyDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public DerbyDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.derby.DerbyConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.derby.DerbyDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public DerbyDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void shutdownDatabase(java.lang.String p0, java.sql.Driver p1)`

---

## public class `org.flywaydb.core.internal.database.derby.DerbyParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public DerbyParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected char getAlternativeStringLiteralQuote()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.derby.DerbySchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Constructors:**
- `public DerbySchema(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.derby.DerbyDatabase p1, java.lang.String p2)`

**Methods:**
- `protected org.flywaydb.core.internal.database.derby.DerbyTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty()`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.derby.DerbyTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Constructors:**
- `public DerbyTable(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.derby.DerbyDatabase p1, org.flywaydb.core.internal.database.derby.DerbySchema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.h2.H2Connection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.h2.H2Database`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public H2Database(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.api.MigrationVersion determineVersion()`
- `protected org.flywaydb.core.internal.database.h2.H2Connection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public java.lang.String getSelectStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public boolean supportsDdlTransactions()`

---

## public class `org.flywaydb.core.internal.database.h2.H2DatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public H2DatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.h2.H2Parser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public H2Parser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected char getAlternativeIdentifierQuote()`
- `protected char getAlternativeStringLiteralQuote()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.h2.H2Schema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.h2.H2Table[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty()`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.h2.H2Table`
extends `org.flywaydb.core.internal.database.base.Table`  

**Constructors:**
- `public H2Table(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.h2.H2Database p1, org.flywaydb.core.internal.database.h2.H2Schema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public HSQLDBDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.hsqldb.HSQLDBConnection doGetConnection(java.sql.Connection p0)`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public HSQLDBDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public HSQLDBParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected int getLastKeywordIndex(java.util.List p0, int p1)`
- `protected java.util.Set getValidKeywords()`
- `protected boolean shouldAdjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2)`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.hsqldb.HSQLDBTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty()`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.hsqldb.HSQLDBTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.informix.InformixConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void changeCurrentSchemaTo(org.flywaydb.core.internal.database.base.Schema p0)`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.informix.InformixDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public InformixDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.informix.InformixConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getCloseQuote()`
- `public java.lang.String getOpenQuote()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.informix.InformixDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public InformixDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.informix.InformixParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public InformixParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.informix.InformixSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.informix.InformixTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate()`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.informix.InformixTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLAdvisoryLockTemplate`

**Methods:**
- `public <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLConfigurationExtension`
implements `org.flywaydb.core.extensibility.ConfigurationExtension`  

**Constructors:**
- `public PostgreSQLConfigurationExtension()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getConfigurationParameterFromEnvironmentVariable(java.lang.String p0)`
- `public java.lang.String getNamespace()`
- `public org.flywaydb.core.internal.database.postgresql.TransactionalModel getTransactional()`
- `public int hashCode()`
- `public boolean isTransactionalLock()`
- `public void setTransactional(org.flywaydb.core.internal.database.postgresql.TransactionalModel p0)`
- `public void setTransactionalLock(boolean p0)`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Constructors:**
- `protected PostgreSQLConnection(org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabase p0, java.sql.Connection p1)`

**Methods:**
- `public void changeCurrentSchemaTo(org.flywaydb.core.internal.database.base.Schema p0)`
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema doGetCurrentSchema() throws java.sql.SQLException`
- `protected void doRestoreOriginalState() throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`
- `public <T extends java.lang.Object> T lock(org.flywaydb.core.internal.database.base.Table p0, java.util.concurrent.Callable p1)`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLCopyParsedStatement`
extends `org.flywaydb.core.internal.sqlscript.ParsedSqlStatement`  

**Constructors:**
- `public PostgreSQLCopyParsedStatement(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public org.flywaydb.core.internal.jdbc.Results execute(org.flywaydb.core.internal.jdbc.JdbcTemplate p0)`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public PostgreSQLDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.postgresql.PostgreSQLConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public java.lang.String doQuote(java.lang.String p0)`
- `public void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getEscapedQuote()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public java.lang.String getSelectStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public PostgreSQLDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public boolean externalAuthPropertiesRequired(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.util.Properties getExternalAuthProperties(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public PostgreSQLParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3)`
- `protected org.flywaydb.core.internal.sqlscript.ParsedSqlStatement createStatement(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.Recorder p1, int p2, int p3, int p4, int p5, int p6, int p7, org.flywaydb.core.internal.parser.StatementType p8, boolean p9, org.flywaydb.core.internal.sqlscript.Delimiter p10, java.lang.String p11) throws java.io.IOException`
- `protected java.lang.Boolean detectCanExecuteInTransaction(java.lang.String p0, java.util.List p1)`
- `protected org.flywaydb.core.internal.parser.StatementType detectStatementType(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, org.flywaydb.core.internal.parser.PeekingReader p2)`
- `protected char getAlternativeStringLiteralQuote()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Constructors:**
- `protected PostgreSQLSchema(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabase p1, java.lang.String p2)`

**Methods:**
- `protected org.flywaydb.core.internal.database.postgresql.PostgreSQLTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`
- `protected org.flywaydb.core.internal.database.base.Type getType(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Constructors:**
- `protected PostgreSQLTable(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabase p1, org.flywaydb.core.internal.database.postgresql.PostgreSQLSchema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.postgresql.PostgreSQLType`
extends `org.flywaydb.core.internal.database.base.Type`  

**Constructors:**
- `public PostgreSQLType(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.postgresql.PostgreSQLDatabase p1, org.flywaydb.core.internal.database.postgresql.PostgreSQLSchema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.postgresql.TransactionalModel`

**Constructors:**
- `public TransactionalModel()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Boolean getLock()`
- `public int hashCode()`
- `public void setLock(java.lang.Boolean p0)`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void changeCurrentSchemaTo(org.flywaydb.core.internal.database.base.Schema p0)`
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema doGetCurrentSchema() throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public RedshiftDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.redshift.RedshiftConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public java.lang.String doQuote(java.lang.String p0)`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getEscapedQuote()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public RedshiftDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getBackupDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public int getPriority()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setOverridingConnectionProps(java.util.Map p0)`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public RedshiftParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected java.lang.Boolean detectCanExecuteInTransaction(java.lang.String p0, java.util.List p1)`
- `protected char getAlternativeStringLiteralQuote()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.redshift.RedshiftTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`
- `protected org.flywaydb.core.internal.database.base.Type getType(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.redshift.RedshiftType`
extends `org.flywaydb.core.internal.database.base.Type`  

**Constructors:**
- `public RedshiftType(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.redshift.RedshiftDatabase p1, org.flywaydb.core.internal.database.redshift.RedshiftSchema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANAConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`
- `public boolean isCloudConnection()`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANADatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public SAPHANADatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.saphana.SAPHANAConnection doGetConnection(java.sql.Connection p0)`
- `public void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANADatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public SAPHANADatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANAParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public SAPHANAParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.StatementType detectStatementType(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, org.flywaydb.core.internal.parser.PeekingReader p2)`
- `protected boolean shouldAdjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2)`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANASchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.saphana.SAPHANATable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.saphana.SAPHANATable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `public void doChangeCurrentSchemaOrSearchPathTo(java.lang.String p0) throws java.sql.SQLException`
- `protected void doRestoreOriginalState() throws java.sql.SQLException`
- `protected java.lang.String getCurrentSchemaNameOrSearchPath() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public SnowflakeDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.snowflake.SnowflakeConnection doGetConnection(java.sql.Connection p0)`
- `public void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getInsertStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public java.lang.String getSelectStatement(org.flywaydb.core.internal.database.base.Table p0)`
- `public boolean supportsDdlTransactions()`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public SnowflakeDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public boolean detectPasswordRequiredByUrl(java.lang.String p0)`
- `public boolean detectUserRequiredByUrl(java.lang.String p0)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public boolean supportsReadOnlyTransactions()`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public SnowflakeParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected boolean isAlternativeStringLiteral(java.lang.String p0)`
- `protected boolean isSingleLineComment(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2)`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.snowflake.SnowflakeTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate() throws java.sql.SQLException`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.snowflake.SnowflakeTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `protected java.lang.String getCurrentSchemaNameOrSearchPath()`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public SQLiteDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.sqlite.SQLiteConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser()`
- `public final void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean useSingleConnection()`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public SQLiteDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public boolean supportsReadOnlyTransactions()`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public SQLiteParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected java.lang.Boolean detectCanExecuteInTransaction(java.lang.String p0, java.util.List p1)`
- `protected char getAlternativeIdentifierQuote()`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteSchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.sqlite.SQLiteTable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate()`
- `protected void doDrop()`
- `protected boolean doEmpty()`
- `protected boolean doExists() throws java.sql.SQLException`
- `public boolean getForeignKeysEnabled()`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.sqlite.SQLiteTable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Constructors:**
- `public SQLiteTable(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.database.sqlite.SQLiteDatabase p1, org.flywaydb.core.internal.database.sqlite.SQLiteSchema p2, java.lang.String p3)`

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock()`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASEConnection`
extends `org.flywaydb.core.internal.database.base.Connection`  

**Methods:**
- `protected java.lang.String getCurrentSchemaNameOrSearchPath()`
- `public org.flywaydb.core.internal.database.base.Schema getSchema(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASEDatabase`
extends `org.flywaydb.core.internal.database.base.Database`  

**Constructors:**
- `public SybaseASEDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public boolean catalogIsSchema()`
- `protected org.flywaydb.core.internal.database.sybasease.SybaseASEConnection doGetConnection(java.sql.Connection p0)`
- `protected java.lang.String doGetCurrentUser() throws java.sql.SQLException`
- `public void ensureSupported()`
- `public java.lang.String getBooleanFalse()`
- `public java.lang.String getBooleanTrue()`
- `public java.lang.String getCloseQuote()`
- `public org.flywaydb.core.internal.sqlscript.Delimiter getDefaultDelimiter()`
- `public java.lang.String getOpenQuote()`
- `public java.lang.String getRawCreateScript(org.flywaydb.core.internal.database.base.Table p0, boolean p1)`
- `public boolean supportsDdlTransactions()`
- `public boolean supportsEmptyMigrationDescription()`
- `public boolean supportsMultiStatementTransactions()`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASEJConnectDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public SybaseASEJConnectDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASEJTDSDatabaseType`
extends `org.flywaydb.core.internal.database.base.BaseDatabaseType`  

**Constructors:**
- `public SybaseASEJTDSDatabaseType()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database createDatabase(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`
- `public org.flywaydb.core.internal.parser.Parser createParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.api.ResourceProvider p1, org.flywaydb.core.internal.parser.ParsingContext p2)`
- `public java.lang.String getDriverClass(java.lang.String p0, java.lang.ClassLoader p1)`
- `public java.lang.String getName()`
- `public int getNullType()`
- `public boolean handlesDatabaseProductNameAndVersion(java.lang.String p0, java.lang.String p1, java.sql.Connection p2)`
- `public boolean handlesJDBCUrl(java.lang.String p0)`
- `public void setDefaultConnectionProps(java.lang.String p0, java.util.Properties p1, java.lang.ClassLoader p2)`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASEParser`
extends `org.flywaydb.core.internal.parser.Parser`  

**Constructors:**
- `public SybaseASEParser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1)`

**Methods:**
- `protected org.flywaydb.core.internal.sqlscript.Delimiter getDefaultDelimiter()`
- `protected boolean isDelimiter(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3)`
- `protected java.lang.String readKeyword(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.sqlscript.Delimiter p1, org.flywaydb.core.internal.parser.ParserContext p2) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASESchema`
extends `org.flywaydb.core.internal.database.base.Schema`  

**Methods:**
- `protected org.flywaydb.core.internal.database.sybasease.SybaseASETable[] doAllTables() throws java.sql.SQLException`
- `protected void doClean() throws java.sql.SQLException`
- `protected void doCreate()`
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doEmpty() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `public org.flywaydb.core.internal.database.base.Table getTable(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.database.sybasease.SybaseASETable`
extends `org.flywaydb.core.internal.database.base.Table`  

**Methods:**
- `protected void doDrop() throws java.sql.SQLException`
- `protected boolean doExists() throws java.sql.SQLException`
- `protected void doLock() throws java.sql.SQLException`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.exception.FlywayDbUpgradeRequiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayDbUpgradeRequiredException(org.flywaydb.core.internal.database.DatabaseType p0, java.lang.String p1, java.lang.String p2)`

---

## public class `org.flywaydb.core.internal.exception.FlywaySqlException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywaySqlException(java.lang.String p0, java.sql.SQLException p1)`

**Methods:**
- `public java.lang.String getMessage()`

---

## public class `org.flywaydb.core.internal.info.AppliedMigrationAttributes`

**Constructors:**
- `public AppliedMigrationAttributes()`

**Fields:**
- `public boolean deleted`
- `public boolean outOfOrder`
- `public boolean undone`

---

## public class `org.flywaydb.core.internal.info.MigrationInfoContext`

**Constructors:**
- `public MigrationInfoContext()`

**Fields:**
- `public org.flywaydb.core.api.MigrationVersion appliedBaseline`
- `public org.flywaydb.core.api.MigrationPattern[] cherryPick`
- `public org.flywaydb.core.api.pattern.ValidatePattern[] ignorePatterns`
- `public org.flywaydb.core.api.MigrationVersion lastApplied`
- `public org.flywaydb.core.api.MigrationVersion lastResolved`
- `public java.util.Map latestRepeatableRuns`
- `public boolean outOfOrder`
- `public org.flywaydb.core.api.MigrationVersion pendingBaseline`
- `public org.flywaydb.core.api.MigrationVersion schema`
- `public org.flywaydb.core.api.MigrationVersion target`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isFutureIgnored()`
- `public boolean isIgnoredIgnored()`
- `public boolean isMissingIgnored()`
- `public boolean isPendingIgnored()`

---

## public class `org.flywaydb.core.internal.info.MigrationInfoDumper`

**Methods:**
- `public static java.lang.String dumpToAsciiTable(org.flywaydb.core.api.MigrationInfo[] p0)`
- `public static java.lang.String dumpToMigrationIds(org.flywaydb.core.api.MigrationInfo[] p0)`

---

## public class `org.flywaydb.core.internal.info.MigrationInfoImpl`
implements `org.flywaydb.core.api.MigrationInfo`  

**Methods:**
- `public boolean canExecuteInTransaction()`
- `public int compareTo(org.flywaydb.core.api.MigrationInfo p0)`
- `public int compareVersion(org.flywaydb.core.api.MigrationInfo p0)`
- `public boolean equals(java.lang.Object p0)`
- `public org.flywaydb.core.extensibility.AppliedMigration getAppliedMigration()`
- `public java.lang.Integer getChecksum()`
- `public java.lang.String getDescription()`
- `public java.lang.Integer getExecutionTime()`
- `public java.lang.String getInstalledBy()`
- `public java.util.Date getInstalledOn()`
- `public java.lang.Integer getInstalledRank()`
- `public java.lang.String getPhysicalLocation()`
- `public org.flywaydb.core.api.resolver.ResolvedMigration getResolvedMigration()`
- `public java.lang.String getScript()`
- `public org.flywaydb.core.api.MigrationState getState()`
- `public org.flywaydb.core.extensibility.MigrationType getType()`
- `public org.flywaydb.core.api.MigrationVersion getVersion()`
- `public int hashCode()`
- `public boolean isVersioned()`
- `public org.flywaydb.core.api.ErrorDetails validate()`

---

## public class `org.flywaydb.core.internal.info.MigrationInfoServiceImpl`
implements `org.flywaydb.core.api.MigrationInfoService`, `org.flywaydb.core.api.output.OperationResult`  

**Constructors:**
- `public MigrationInfoServiceImpl(org.flywaydb.core.internal.resolver.CompositeMigrationResolver p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1, org.flywaydb.core.internal.database.base.Database p2, org.flywaydb.core.api.configuration.Configuration p3, org.flywaydb.core.api.MigrationVersion p4, boolean p5, org.flywaydb.core.api.pattern.ValidatePattern[] p6, org.flywaydb.core.api.MigrationPattern[] p7)`

**Methods:**
- `public org.flywaydb.core.api.MigrationInfo[] all()`
- `public org.flywaydb.core.internal.info.MigrationInfoImpl[] applied()`
- `public org.flywaydb.core.api.MigrationInfo current()`
- `public org.flywaydb.core.internal.info.MigrationInfoImpl[] failed()`
- `public org.flywaydb.core.api.MigrationInfo[] future()`
- `public org.flywaydb.core.api.output.InfoResult getInfoResult()`
- `public org.flywaydb.core.api.output.InfoResult getInfoResult(org.flywaydb.core.api.MigrationInfo[] p0)`
- `public org.flywaydb.core.api.MigrationInfo[] outOfOrder()`
- `public org.flywaydb.core.internal.info.MigrationInfoImpl[] pending()`
- `public void refresh()`
- `public org.flywaydb.core.api.MigrationInfo[] resolved()`
- `public void setAllSchemasEmpty(org.flywaydb.core.internal.database.base.Schema[] p0)`
- `public org.flywaydb.core.internal.info.MigrationInfoImpl[] undo()`
- `public java.util.List validate()`

---

## public class `org.flywaydb.core.internal.jdbc.DriverDataSource`
implements `javax.sql.DataSource`  

**Constructors:**
- `public DriverDataSource(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws org.flywaydb.core.api.FlywayException`
- `public DriverDataSource(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.Map p5) throws org.flywaydb.core.api.FlywayException`
- `public DriverDataSource(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, org.flywaydb.core.api.configuration.Configuration p5) throws org.flywaydb.core.api.FlywayException`
- `public DriverDataSource(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, org.flywaydb.core.api.configuration.Configuration p5, java.util.Map p6) throws org.flywaydb.core.api.FlywayException`
- `public DriverDataSource(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, org.flywaydb.core.api.configuration.Configuration p5, java.util.Properties p6, java.util.Map p7) throws org.flywaydb.core.api.FlywayException`

**Methods:**
- `public java.util.Map getAdditionalProperties()`
- `public java.sql.Connection getConnection() throws java.sql.SQLException`
- `public java.sql.Connection getConnection(java.lang.String p0, java.lang.String p1) throws java.sql.SQLException`
- `protected java.sql.Connection getConnectionFromDriver(java.lang.String p0, java.lang.String p1) throws java.sql.SQLException`
- `public java.sql.Driver getDriver()`
- `public java.io.PrintWriter getLogWriter()`
- `public int getLoginTimeout()`
- `public java.util.logging.Logger getParentLogger()`
- `public java.lang.String getPassword()`
- `public java.lang.String getUrl()`
- `public java.lang.String getUser()`
- `public boolean isAutoCommit()`
- `public boolean isWrapperFor(java.lang.Class p0)`
- `public void setAutoCommit(boolean p0)`
- `public void setLogWriter(java.io.PrintWriter p0)`
- `public void setLoginTimeout(int p0)`
- `public void shutdownDatabase()`
- `public <T extends java.lang.Object> T unwrap(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.jdbc.ErrorImpl`
implements `org.flywaydb.core.api.callback.Error`  

**Constructors:**
- `public ErrorImpl(int p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public int getCode()`
- `public java.lang.String getMessage()`
- `public java.lang.String getState()`
- `public boolean isHandled()`
- `public void setHandled(boolean p0)`

---

## public abstract interface `org.flywaydb.core.internal.jdbc.ExecutionTemplate`

**Methods:**
- `public abstract <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.jdbc.ExecutionTemplateFactory`

**Constructors:**
- `public ExecutionTemplateFactory()`

**Methods:**
- `public static org.flywaydb.core.internal.jdbc.ExecutionTemplate createExecutionTemplate(java.sql.Connection p0)`
- `public static org.flywaydb.core.internal.jdbc.ExecutionTemplate createExecutionTemplate(java.sql.Connection p0, org.flywaydb.core.internal.database.base.Database p1)`
- `public static org.flywaydb.core.internal.jdbc.ExecutionTemplate createTableExclusiveExecutionTemplate(java.sql.Connection p0, org.flywaydb.core.internal.database.base.Table p1, org.flywaydb.core.internal.database.base.Database p2)`

---

## public class `org.flywaydb.core.internal.jdbc.JdbcConnectionFactory`
implements `java.io.Closeable`  

**Constructors:**
- `public JdbcConnectionFactory(javax.sql.DataSource p0, org.flywaydb.core.api.configuration.Configuration p1, org.flywaydb.core.internal.jdbc.StatementInterceptor p2)`

**Methods:**
- `public void close()`
- `public org.flywaydb.core.internal.database.DatabaseType getDatabaseType()`
- `public java.lang.String getDriverInfo()`
- `public java.lang.String getJdbcUrl()`
- `public java.lang.String getProductName()`
- `public java.sql.Connection openConnection() throws org.flywaydb.core.api.FlywayException`
- `public void setConnectionInitializer(org.flywaydb.core.internal.jdbc.JdbcConnectionFactory$ConnectionInitializer p0)`

---

## public abstract static interface `org.flywaydb.core.internal.jdbc.JdbcConnectionFactory$ConnectionInitializer`

**Methods:**
- `public abstract void initialize(org.flywaydb.core.internal.jdbc.JdbcConnectionFactory p0, java.sql.Connection p1)`

---

## public final enum `org.flywaydb.core.internal.jdbc.JdbcNullTypes`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.jdbc.JdbcNullTypes BooleanNull`
- `public final static org.flywaydb.core.internal.jdbc.JdbcNullTypes IntegerNull`
- `public final static org.flywaydb.core.internal.jdbc.JdbcNullTypes StringNull`

---

## public class `org.flywaydb.core.internal.jdbc.JdbcTemplate`

**Constructors:**
- `public JdbcTemplate(java.sql.Connection p0)`
- `public JdbcTemplate(java.sql.Connection p0, org.flywaydb.core.internal.database.DatabaseType p1)`

**Fields:**
- `protected final java.sql.Connection connection`
- `protected final int nullType`

**Methods:**
- `public void execute(java.lang.String p0, java.lang.Object... p1) throws java.sql.SQLException`
- `public org.flywaydb.core.internal.jdbc.Results executeStatement(java.lang.String p0)`
- `public void extractErrors(org.flywaydb.core.internal.jdbc.Results p0, java.sql.SQLException p1)`
- `public java.sql.Connection getConnection()`
- `protected java.sql.PreparedStatement prepareStatement(java.lang.String p0, java.lang.Object[] p1) throws java.sql.SQLException`
- `public <T extends java.lang.Object> java.util.List query(java.lang.String p0, org.flywaydb.core.internal.jdbc.RowMapper p1, java.lang.Object... p2) throws java.sql.SQLException`
- `public boolean queryForBoolean(java.lang.String p0, java.lang.String... p1) throws java.sql.SQLException`
- `public int queryForInt(java.lang.String p0, java.lang.String... p1) throws java.sql.SQLException`
- `public java.util.List queryForList(java.lang.String p0, java.lang.Object... p1) throws java.sql.SQLException`
- `public long queryForLong(java.lang.String p0, java.lang.String... p1) throws java.sql.SQLException`
- `public java.lang.String queryForString(java.lang.String p0, java.lang.String... p1) throws java.sql.SQLException`
- `public java.util.List queryForStringList(java.lang.String p0, java.lang.String... p1) throws java.sql.SQLException`
- `public void update(java.lang.String p0, java.lang.Object... p1) throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.jdbc.JdbcUtils`

**Methods:**
- `public static void closeConnection(java.sql.Connection p0)`
- `public static void closeResultSet(java.sql.ResultSet p0)`
- `public static void closeStatement(java.sql.Statement p0)`
- `public static java.sql.DatabaseMetaData getDatabaseMetaData(java.sql.Connection p0)`
- `public static java.lang.String getDatabaseProductName(java.sql.DatabaseMetaData p0)`
- `public static java.lang.String getDatabaseProductVersion(java.sql.DatabaseMetaData p0)`
- `public static java.sql.Connection openConnection(javax.sql.DataSource p0, int p1, int p2) throws org.flywaydb.core.api.FlywayException`

---

## public class `org.flywaydb.core.internal.jdbc.PlainExecutionTemplate`
implements `org.flywaydb.core.internal.jdbc.ExecutionTemplate`  

**Constructors:**
- `public PlainExecutionTemplate()`
- `public PlainExecutionTemplate(boolean p0)`

**Methods:**
- `public <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.jdbc.Result`

**Constructors:**
- `public Result(long p0, java.util.List p1, java.util.List p2, java.lang.String p3)`

**Methods:**
- `public java.util.List getColumns()`
- `public java.util.List getData()`
- `public java.lang.String getSql()`
- `public long getUpdateCount()`

---

## public class `org.flywaydb.core.internal.jdbc.Results`

**Constructors:**
- `public Results()`

**Fields:**
- `public final static org.flywaydb.core.internal.jdbc.Results EMPTY_RESULTS`

**Methods:**
- `public void addError(org.flywaydb.core.api.callback.Error p0)`
- `public void addResult(org.flywaydb.core.internal.jdbc.Result p0)`
- `public void addWarning(org.flywaydb.core.api.callback.Warning p0)`
- `public java.util.List getErrors()`
- `public java.sql.SQLException getException()`
- `public java.util.List getResults()`
- `public java.util.List getWarnings()`
- `public void setException(java.sql.SQLException p0)`

---

## public abstract interface `org.flywaydb.core.internal.jdbc.RowMapper`<T extends java.lang.Object>

**Methods:**
- `public abstract T mapRow(java.sql.ResultSet p0) throws java.sql.SQLException`

---

## public abstract interface `org.flywaydb.core.internal.jdbc.StatementInterceptor`
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract void close()`
- `public abstract java.sql.Connection createConnectionProxy(java.sql.Connection p0)`
- `public abstract java.util.List getCallbacks()`
- `public abstract org.flywaydb.core.internal.schemahistory.SchemaHistory getSchemaHistory(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.schemahistory.SchemaHistory p1)`
- `public abstract void init(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Database p1, org.flywaydb.core.internal.database.base.Table p2)`
- `public abstract void interceptCallableStatement(java.lang.String p0)`
- `public abstract void interceptCommand(java.lang.String p0)`
- `public abstract void interceptPreparedStatement(java.lang.String p0, java.util.Map p1)`
- `public abstract void interceptStatement(java.lang.String p0)`
- `public abstract boolean isConfigured(org.flywaydb.core.api.configuration.Configuration p0)`
- `public abstract void javaMigration(org.flywaydb.core.api.migration.JavaMigration p0)`
- `public abstract void schemaHistoryTableCreate(boolean p0)`
- `public abstract void schemaHistoryTableDeleteFailed(org.flywaydb.core.internal.database.base.Table p0, org.flywaydb.core.extensibility.AppliedMigration p1)`
- `public abstract void schemaHistoryTableInsert(org.flywaydb.core.extensibility.AppliedMigration p0)`
- `public abstract void scriptMigration(org.flywaydb.core.api.resource.LoadableResource p0)`
- `public abstract void sqlScript(org.flywaydb.core.api.resource.LoadableResource p0)`
- `public abstract void sqlStatement(org.flywaydb.core.internal.sqlscript.SqlStatement p0)`

---

## public class `org.flywaydb.core.internal.jdbc.TableLockingExecutionTemplate`
implements `org.flywaydb.core.internal.jdbc.ExecutionTemplate`  

**Methods:**
- `public <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.jdbc.TransactionalExecutionTemplate`
implements `org.flywaydb.core.internal.jdbc.ExecutionTemplate`  

**Constructors:**
- `public TransactionalExecutionTemplate(java.sql.Connection p0, boolean p1)`

**Methods:**
- `public <T extends java.lang.Object> T execute(java.util.concurrent.Callable p0)`

---

## public class `org.flywaydb.core.internal.jdbc.WarningImpl`
implements `org.flywaydb.core.api.callback.Warning`  

**Constructors:**
- `public WarningImpl(int p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public int getCode()`
- `public java.lang.String getMessage()`
- `public java.lang.String getState()`
- `public boolean isHandled()`
- `public void setHandled(boolean p0)`

---

## public final enum `org.flywaydb.core.internal.license.Edition`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.license.Edition COMMUNITY`
- `public final static org.flywaydb.core.internal.license.Edition ENTERPRISE`
- `public final static org.flywaydb.core.internal.license.Edition PRO`
- `public final static org.flywaydb.core.internal.license.Edition TIER3`

**Methods:**
- `public java.lang.String getDescription()`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.license.FlywayEditionUpgradeRequiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayEditionUpgradeRequiredException(org.flywaydb.core.internal.license.Edition p0, org.flywaydb.core.internal.database.DatabaseType p1, java.lang.String p2)`
- `public FlywayEditionUpgradeRequiredException(org.flywaydb.core.internal.license.Edition p0, org.flywaydb.core.internal.license.Edition p1, java.lang.String p2)`

---

## public class `org.flywaydb.core.internal.license.FlywayTeamsUpgradeMessage`

**Constructors:**
- `public FlywayTeamsUpgradeMessage()`

**Methods:**
- `public static java.lang.String generate(java.lang.String p0, java.lang.String p1)`

---

## public class `org.flywaydb.core.internal.license.FlywayTeamsUpgradeRequiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayTeamsUpgradeRequiredException(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.license.FlywayTrialExpiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayTrialExpiredException(org.flywaydb.core.internal.license.Edition p0)`

---

## public class `org.flywaydb.core.internal.license.VersionPrinter`

**Fields:**
- `public static org.flywaydb.core.internal.license.Edition EDITION`
- `public final static java.lang.String VERSION`

**Methods:**
- `public static java.lang.String getVersion()`
- `public static void printVersion()`
- `public static void printVersionOnly()`

---

## public class `org.flywaydb.core.internal.logging.EvolvingLog`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public EvolvingLog(org.flywaydb.core.api.logging.Log p0, java.lang.Class p1)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public org.flywaydb.core.api.logging.Log getLog()`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.apachecommons.ApacheCommonsLog`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public ApacheCommonsLog(org.apache.commons.logging.Log p0)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.apachecommons.ApacheCommonsLogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public ApacheCommonsLogCreator()`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.logging.buffered.BufferedLog`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public BufferedLog()`

**Fields:**
- `public final java.util.List bufferedLogMessages`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void flush(org.flywaydb.core.api.logging.Log p0)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public static class `org.flywaydb.core.internal.logging.buffered.BufferedLog$BufferedLogMessage`

**Constructors:**
- `public BufferedLogMessage(java.lang.String p0, org.flywaydb.core.internal.logging.buffered.BufferedLog$Level p1)`
- `public BufferedLogMessage(java.lang.String p0, org.flywaydb.core.internal.logging.buffered.BufferedLog$Level p1, java.lang.Exception p2)`

**Fields:**
- `public final java.lang.Exception e`
- `public final org.flywaydb.core.internal.logging.buffered.BufferedLog$Level level`
- `public final java.lang.String message`

---

## public final static enum `org.flywaydb.core.internal.logging.buffered.BufferedLog$Level`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.logging.buffered.BufferedLog$Level DEBUG`
- `public final static org.flywaydb.core.internal.logging.buffered.BufferedLog$Level ERROR`
- `public final static org.flywaydb.core.internal.logging.buffered.BufferedLog$Level INFO`
- `public final static org.flywaydb.core.internal.logging.buffered.BufferedLog$Level NOTICE`
- `public final static org.flywaydb.core.internal.logging.buffered.BufferedLog$Level WARN`

---

## public class `org.flywaydb.core.internal.logging.buffered.BufferedLogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public BufferedLogCreator()`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.logging.javautil.JavaUtilLog`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public JavaUtilLog(java.util.logging.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.javautil.JavaUtilLogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public JavaUtilLogCreator()`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.logging.log4j2.Log4j2Log`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public Log4j2Log(org.apache.logging.log4j.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.log4j2.Log4j2LogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public Log4j2LogCreator()`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.logging.multi.MultiLogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public MultiLogCreator(java.util.List p0)`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`
- `public static org.flywaydb.core.internal.logging.multi.MultiLogCreator empty()`

---

## public class `org.flywaydb.core.internal.logging.multi.MultiLogger`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public MultiLogger(java.util.List p0)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.slf4j.Slf4jLog`
implements `org.flywaydb.core.api.logging.Log`  

**Constructors:**
- `public Slf4jLog(org.slf4j.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Exception p1)`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public void notice(java.lang.String p0)`
- `public void warn(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.logging.slf4j.Slf4jLogCreator`
implements `org.flywaydb.core.api.logging.LogCreator`  

**Constructors:**
- `public Slf4jLogCreator()`

**Methods:**
- `public org.flywaydb.core.api.logging.Log createLogger(java.lang.Class p0)`

---

## public abstract class `org.flywaydb.core.internal.parser.Parser`

**Constructors:**
- `protected Parser(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1, int p2)`

**Fields:**
- `public final org.flywaydb.core.api.configuration.Configuration configuration`
- `public final org.flywaydb.core.internal.parser.ParsingContext parsingContext`

**Methods:**
- `protected void adjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2, org.flywaydb.core.internal.parser.PeekingReader p3) throws java.io.IOException`
- `protected void adjustDelimiter(org.flywaydb.core.internal.parser.ParserContext p0, org.flywaydb.core.internal.parser.StatementType p1)`
- `protected org.flywaydb.core.internal.sqlscript.ParsedSqlStatement createStatement(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.Recorder p1, int p2, int p3, int p4, int p5, int p6, int p7, org.flywaydb.core.internal.parser.StatementType p8, boolean p9, org.flywaydb.core.internal.sqlscript.Delimiter p10, java.lang.String p11) throws java.io.IOException`
- `protected java.lang.Boolean detectCanExecuteInTransaction(java.lang.String p0, java.util.List p1)`
- `protected org.flywaydb.core.internal.parser.StatementType detectStatementType(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, org.flywaydb.core.internal.parser.PeekingReader p2)`
- `protected boolean doTokensMatchPattern(java.util.List p0, org.flywaydb.core.internal.parser.Token p1, java.util.regex.Pattern p2)`
- `protected char getAlternativeIdentifierQuote()`
- `protected char getAlternativeStringLiteralQuote()`
- `protected char getClosingIdentifierSymbol()`
- `protected org.flywaydb.core.internal.sqlscript.Delimiter getDefaultDelimiter()`
- `protected char getIdentifierQuote()`
- `protected int getLastKeywordIndex(java.util.List p0)`
- `protected int getLastKeywordIndex(java.util.List p0, int p1)`
- `protected org.flywaydb.core.internal.sqlscript.SqlStatement getNextStatement(org.flywaydb.core.api.resource.Resource p0, org.flywaydb.core.internal.parser.PeekingReader p1, org.flywaydb.core.internal.parser.Recorder p2, org.flywaydb.core.internal.parser.PositionTracker p3, org.flywaydb.core.internal.parser.ParserContext p4)`
- `protected char getOpeningIdentifierSymbol()`
- `protected static org.flywaydb.core.internal.parser.Token getPreviousToken(java.util.List p0, int p1)`
- `protected int getTransactionalDetectionCutoff()`
- `protected java.util.Set getValidKeywords()`
- `protected org.flywaydb.core.internal.parser.Token handleAlternativeStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleCommentDirective(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleDelimiter(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleKeyword(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4, java.lang.String p5) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleMultilineComment(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected org.flywaydb.core.internal.parser.Token handleStringLiteral(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3, int p4) throws java.io.IOException`
- `protected boolean isAlternativeStringLiteral(java.lang.String p0)`
- `protected boolean isCommentDirective(java.lang.String p0)`
- `protected boolean isDelimiter(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2, int p3)`
- `protected boolean isKeyword(java.lang.String p0)`
- `protected boolean isLetter(char p0, org.flywaydb.core.internal.parser.ParserContext p1)`
- `protected boolean isSingleLineComment(java.lang.String p0, org.flywaydb.core.internal.parser.ParserContext p1, int p2)`
- `protected static boolean lastTokenIs(java.util.List p0, int p1, java.lang.String p2)`
- `protected static boolean lastTokenIsOnLine(java.util.List p0, int p1, int p2)`
- `public final org.flywaydb.core.internal.sqlscript.SqlStatementIterator parse(org.flywaydb.core.api.resource.LoadableResource p0)`
- `public final org.flywaydb.core.internal.sqlscript.SqlStatementIterator parse(org.flywaydb.core.api.resource.LoadableResource p0, org.flywaydb.core.internal.sqlscript.SqlScriptMetadata p1)`
- `protected java.lang.String readIdentifier(org.flywaydb.core.internal.parser.PeekingReader p0) throws java.io.IOException`
- `protected java.lang.String readKeyword(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.internal.sqlscript.Delimiter p1, org.flywaydb.core.internal.parser.ParserContext p2) throws java.io.IOException`
- `protected java.io.Reader replacePlaceholders(java.io.Reader p0, org.flywaydb.core.internal.sqlscript.SqlScriptMetadata p1)`
- `protected void resetDelimiter(org.flywaydb.core.internal.parser.ParserContext p0)`
- `protected boolean shouldAdjustBlockDepth(org.flywaydb.core.internal.parser.ParserContext p0, java.util.List p1, org.flywaydb.core.internal.parser.Token p2)`
- `protected boolean shouldDiscard(org.flywaydb.core.internal.parser.Token p0, boolean p1)`
- `protected boolean supportsPeekingMultipleLines()`
- `public boolean supportsReferencedSqlScripts()`
- `protected static boolean tokenAtIndexIs(java.util.List p0, int p1, java.lang.String p2)`

---

## public class `org.flywaydb.core.internal.parser.Parser$ParserSqlStatementIterator`
implements `org.flywaydb.core.internal.sqlscript.SqlStatementIterator`  

**Constructors:**
- `public ParserSqlStatementIterator(org.flywaydb.core.internal.parser.PeekingReader p0, org.flywaydb.core.api.resource.LoadableResource p1, org.flywaydb.core.internal.parser.Recorder p2, org.flywaydb.core.internal.parser.PositionTracker p3, org.flywaydb.core.internal.parser.ParserContext p4)`

**Methods:**
- `public void close()`
- `public boolean hasNext()`
- `public org.flywaydb.core.internal.sqlscript.SqlStatement next()`

---

## public class `org.flywaydb.core.internal.parser.ParserContext`

**Constructors:**
- `public ParserContext(org.flywaydb.core.internal.sqlscript.Delimiter p0)`

**Methods:**
- `public void decreaseBlockDepth()`
- `public void decreaseParensDepth()`
- `public int getBlockDepth()`
- `public java.lang.String getBlockInitiator()`
- `public org.flywaydb.core.internal.sqlscript.Delimiter getDelimiter()`
- `public java.lang.String getLastClosedBlockInitiator()`
- `public int getParensDepth()`
- `public org.flywaydb.core.internal.parser.StatementType getStatementType()`
- `public void increaseBlockDepth(java.lang.String p0)`
- `public void increaseParensDepth()`
- `public boolean isLetter(char p0)`
- `public void setDelimiter(org.flywaydb.core.internal.sqlscript.Delimiter p0)`
- `public void setStatementType(org.flywaydb.core.internal.parser.StatementType p0)`

---

## public class `org.flywaydb.core.internal.parser.ParsingContext`

**Constructors:**
- `public ParsingContext()`

**Methods:**
- `public org.flywaydb.core.internal.database.base.Database getDatabase()`
- `public java.util.Map getPlaceholders()`
- `public void populate(org.flywaydb.core.internal.database.base.Database p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public void setDatabase(org.flywaydb.core.internal.database.base.Database p0)`
- `public void updateFilenamePlaceholder(org.flywaydb.core.internal.resource.ResourceName p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.internal.parser.PeekingReader`
extends `java.io.FilterReader`  

**Methods:**
- `public boolean peek(char p0) throws java.io.IOException`
- `public boolean peek(char p0, char p1) throws java.io.IOException`
- `public java.lang.String peek(int p0) throws java.io.IOException`
- `public java.lang.String peek(int p0, boolean p1) throws java.io.IOException`
- `public boolean peek(java.lang.String p0) throws java.io.IOException`
- `public boolean peekIgnoreCase(java.lang.String p0) throws java.io.IOException`
- `public boolean peekKeywordPart(org.flywaydb.core.internal.parser.ParserContext p0) throws java.io.IOException`
- `public boolean peekNumeric() throws java.io.IOException`
- `public boolean peekWhitespace() throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public java.lang.String readKeywordPart(org.flywaydb.core.internal.sqlscript.Delimiter p0, org.flywaydb.core.internal.parser.ParserContext p1) throws java.io.IOException`
- `public java.lang.String readNumeric() throws java.io.IOException`
- `public java.lang.String readUntilExcluding(char p0, char p1) throws java.io.IOException`
- `public java.lang.String readUntilExcluding(java.lang.String... p0) throws java.io.IOException`
- `public java.lang.String readUntilExcludingWithEscape(char p0, boolean p1) throws java.io.IOException`
- `public java.lang.String readUntilExcludingWithEscape(char p0, boolean p1, char p2) throws java.io.IOException`
- `public java.lang.String readUntilIncluding(char p0) throws java.io.IOException`
- `public java.lang.String readWhitespace() throws java.io.IOException`
- `public void swallow() throws java.io.IOException`
- `public void swallow(int p0) throws java.io.IOException`
- `public void swallowUntilExcluding(char p0, char p1) throws java.io.IOException`
- `public void swallowUntilExcluding(java.lang.String p0) throws java.io.IOException`
- `public void swallowUntilIncludingWithEscape(char p0, boolean p1) throws java.io.IOException`
- `public void swallowUntilIncludingWithEscape(char p0, boolean p1, char p2) throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.parser.PlaceholderReplacingReader`
extends `java.io.FilterReader`  

**Constructors:**
- `public PlaceholderReplacingReader(java.lang.String p0, java.lang.String p1, java.util.Map p2, java.io.Reader p3)`

**Methods:**
- `public static org.flywaydb.core.internal.parser.PlaceholderReplacingReader create(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1, java.io.Reader p2)`
- `public static org.flywaydb.core.internal.parser.PlaceholderReplacingReader createForScriptMigration(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.parser.ParsingContext p1, java.io.Reader p2)`
- `public void mark(int p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`
- `public void reset() throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.parser.PositionTracker`

**Constructors:**
- `public PositionTracker()`

**Methods:**
- `public void carriageReturn()`
- `public int getCol()`
- `public int getColIgnoringWhitespace()`
- `public int getLine()`
- `public int getPos()`
- `public void linefeed()`
- `public void mark()`
- `public void nextCol()`
- `public void nextColIgnoringWhitespace()`
- `public void nextPos()`
- `public void reset()`

---

## public class `org.flywaydb.core.internal.parser.PositionTrackingReader`
extends `java.io.FilterReader`  

**Methods:**
- `public void mark(int p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public void reset() throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.parser.Recorder`

**Constructors:**
- `public Recorder()`

**Methods:**
- `public void confirm()`
- `public int length()`
- `public void pause()`
- `public void record(char p0)`
- `public void record(java.lang.String p0)`
- `public void start()`
- `public java.lang.String stop()`
- `public void truncate(int p0)`

---

## public class `org.flywaydb.core.internal.parser.RecordingReader`
extends `java.io.FilterReader`  

**Methods:**
- `public void mark(int p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public void reset() throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.parser.StatementType`

**Constructors:**
- `public StatementType()`

**Fields:**
- `public final static org.flywaydb.core.internal.parser.StatementType GENERIC`
- `public final static org.flywaydb.core.internal.parser.StatementType UNKNOWN`

**Methods:**
- `public boolean treatAsIfLetter(char p0)`

---

## public class `org.flywaydb.core.internal.parser.Token`

**Constructors:**
- `public Token(org.flywaydb.core.internal.parser.TokenType p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6)`

**Methods:**
- `public int getCol()`
- `public int getLine()`
- `public int getParensDepth()`
- `public int getPos()`
- `public java.lang.String getRawText()`
- `public java.lang.String getText()`
- `public org.flywaydb.core.internal.parser.TokenType getType()`

---

## public final enum `org.flywaydb.core.internal.parser.TokenType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.parser.TokenType BLANK_LINES`
- `public final static org.flywaydb.core.internal.parser.TokenType COMMENT`
- `public final static org.flywaydb.core.internal.parser.TokenType COPY_DATA`
- `public final static org.flywaydb.core.internal.parser.TokenType DELIMITER`
- `public final static org.flywaydb.core.internal.parser.TokenType EOF`
- `public final static org.flywaydb.core.internal.parser.TokenType IDENTIFIER`
- `public final static org.flywaydb.core.internal.parser.TokenType KEYWORD`
- `public final static org.flywaydb.core.internal.parser.TokenType MULTI_LINE_COMMENT_DIRECTIVE`
- `public final static org.flywaydb.core.internal.parser.TokenType NEW_DELIMITER`
- `public final static org.flywaydb.core.internal.parser.TokenType NUMERIC`
- `public final static org.flywaydb.core.internal.parser.TokenType PARENS_CLOSE`
- `public final static org.flywaydb.core.internal.parser.TokenType PARENS_OPEN`
- `public final static org.flywaydb.core.internal.parser.TokenType STRING`
- `public final static org.flywaydb.core.internal.parser.TokenType SYMBOL`

---

## public class `org.flywaydb.core.internal.parser.UnboundedReadAheadReader`
extends `java.io.FilterReader`  

**Constructors:**
- `protected UnboundedReadAheadReader(java.io.Reader p0)`

**Fields:**
- `protected java.util.ArrayList buffers`

**Methods:**
- `public void mark(int p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public void reset() throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.plugin.PluginRegister`

**Constructors:**
- `public PluginRegister()`

**Fields:**
- `public final java.util.List REGISTERED_PLUGINS`

**Methods:**
- `public <T extends org.flywaydb.core.extensibility.Plugin> java.util.List getLicensedPlugins(java.lang.Class p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public <T extends org.flywaydb.core.extensibility.Plugin> T getPlugin(java.lang.Class p0)`
- `public <T extends org.flywaydb.core.extensibility.Plugin> java.util.List getPlugins(java.lang.Class p0)`

---

## public class `org.flywaydb.core.internal.proprietaryStubs.CommandExtensionStub`
implements `org.flywaydb.core.extensibility.CommandExtension`  

**Constructors:**
- `public CommandExtensionStub()`

**Fields:**
- `public final static java.util.List COMMANDS`

**Methods:**
- `public java.lang.String getDescription()`
- `public int getPriority()`
- `public org.flywaydb.core.api.output.OperationResult handle(java.lang.String p0, org.flywaydb.core.api.configuration.Configuration p1, java.util.List p2, org.flywaydb.core.FlywayTelemetryManager p3) throws org.flywaydb.core.api.FlywayException`
- `public boolean handlesCommand(java.lang.String p0)`
- `public boolean handlesParameter(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.proprietaryStubs.FlywayProprietaryRequiredException`
extends `org.flywaydb.core.api.FlywayException`  

**Constructors:**
- `public FlywayProprietaryRequiredException(java.lang.String p0, java.lang.String p1)`

---

## public class `org.flywaydb.core.internal.reports.ReportDetails`

**Constructors:**
- `public ReportDetails()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getHtmlReportFilename()`
- `public java.lang.String getJsonReportFilename()`
- `public int hashCode()`
- `public void setHtmlReportFilename(java.lang.String p0)`
- `public void setJsonReportFilename(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.reports.html.HoldingTabMetadata`

**Constructors:**
- `public HoldingTabMetadata(java.lang.String p0, java.lang.String... p1)`

**Methods:**
- `public java.lang.String getName()`
- `public java.util.List getSupportedEditions()`

---

## public class `org.flywaydb.core.internal.reports.html.HtmlReportGenerator`

**Constructors:**
- `public HtmlReportGenerator()`

**Fields:**
- `public final static java.lang.String INSTALL_DIR`

**Methods:**
- `public static java.lang.String generateHtml(org.flywaydb.core.api.output.CompositeResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public static java.lang.String getInformationalText(java.lang.String p0)`
- `public static org.flywaydb.core.extensibility.HtmlRenderer getRenderer(org.flywaydb.core.api.output.HtmlResult p0, org.flywaydb.core.api.configuration.Configuration p1)`
- `public static java.lang.String getSummaryStyle()`
- `public static java.lang.String getSummaryValueStyled(int p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String getSummaryValueStyled(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `public static java.lang.String getTabEnding(org.flywaydb.core.api.output.HtmlResult p0)`
- `public static java.lang.String getTabId(org.flywaydb.core.api.output.HtmlResult p0, org.flywaydb.core.api.configuration.Configuration p1, int p2)`
- `public static java.lang.String getTabOpening(org.flywaydb.core.api.output.HtmlResult p0, org.flywaydb.core.api.configuration.Configuration p1, int p2)`
- `public static java.lang.String renderTab(org.flywaydb.core.api.output.HtmlResult p0, org.flywaydb.core.api.configuration.Configuration p1, int p2)`
- `public static java.lang.String renderTabSummary(org.flywaydb.core.api.output.HtmlResult p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.internal.reports.json.CompositeResultDeserializer`
implements `com.google.gson.JsonDeserializer<org.flywaydb.core.api.output.CompositeResult<org.flywaydb.core.api.output.HtmlResult>>`  

**Constructors:**
- `public CompositeResultDeserializer(org.flywaydb.core.internal.plugin.PluginRegister p0)`

**Methods:**
- `public org.flywaydb.core.api.output.CompositeResult deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException`

---

## public abstract interface `org.flywaydb.core.internal.reports.json.HtmlResultDeserializer`<T extends org.flywaydb.core.api.output.HtmlResult>
implements `org.flywaydb.core.extensibility.Plugin`  

**Methods:**
- `public abstract boolean canDeserialize(com.google.gson.JsonObject p0)`
- `public abstract T deserialize(com.google.gson.JsonObject p0)`

---

## public class `org.flywaydb.core.internal.reports.json.InfoResultDeserializer`
implements `org.flywaydb.core.internal.reports.json.HtmlResultDeserializer<org.flywaydb.core.api.output.InfoResult>`  

**Constructors:**
- `public InfoResultDeserializer()`

**Methods:**
- `public boolean canDeserialize(com.google.gson.JsonObject p0)`
- `public org.flywaydb.core.api.output.InfoResult deserialize(com.google.gson.JsonObject p0)`

---

## public class `org.flywaydb.core.internal.reports.json.MigrateResultDeserializer`
implements `org.flywaydb.core.internal.reports.json.HtmlResultDeserializer<org.flywaydb.core.api.output.MigrateResult>`  

**Constructors:**
- `public MigrateResultDeserializer()`

**Methods:**
- `public boolean canDeserialize(com.google.gson.JsonObject p0)`
- `public org.flywaydb.core.api.output.MigrateResult deserialize(com.google.gson.JsonObject p0)`

---

## public class `org.flywaydb.core.internal.resolver.ChecksumCalculator`

**Methods:**
- `public static int calculate(org.flywaydb.core.api.resource.LoadableResource... p0)`

---

## public class `org.flywaydb.core.internal.resolver.CompositeMigrationResolver`
implements `org.flywaydb.core.api.resolver.MigrationResolver`  

**Constructors:**
- `public CompositeMigrationResolver(org.flywaydb.core.api.ResourceProvider p0, org.flywaydb.core.api.ClassProvider p1, org.flywaydb.core.api.configuration.Configuration p2, org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p3, org.flywaydb.core.internal.sqlscript.SqlScriptFactory p4, org.flywaydb.core.internal.parser.ParsingContext p5, org.flywaydb.core.internal.jdbc.StatementInterceptor p6, org.flywaydb.core.api.resolver.MigrationResolver... p7)`

**Methods:**
- `public java.util.Collection resolveMigrations(org.flywaydb.core.api.configuration.Configuration p0)`
- `public java.util.Collection resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public class `org.flywaydb.core.internal.resolver.MigrationInfoHelper`

**Methods:**
- `public static org.flywaydb.core.internal.util.Pair extractVersionAndDescription(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, boolean p4)`

---

## public class `org.flywaydb.core.internal.resolver.ResolvedMigrationComparator`
implements `java.util.Comparator<org.flywaydb.core.api.resolver.ResolvedMigration>`  

**Constructors:**
- `public ResolvedMigrationComparator()`

**Methods:**
- `public int compare(org.flywaydb.core.api.resolver.ResolvedMigration p0, org.flywaydb.core.api.resolver.ResolvedMigration p1)`

---

## public class `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl`
implements `org.flywaydb.core.api.resolver.ResolvedMigration`  

**Constructors:**
- `public ResolvedMigrationImpl(org.flywaydb.core.api.MigrationVersion p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, java.lang.Integer p4, org.flywaydb.core.extensibility.MigrationType p5, java.lang.String p6, org.flywaydb.core.api.executor.MigrationExecutor p7)`

**Methods:**
- `public boolean checksumMatches(java.lang.Integer p0)`
- `public boolean checksumMatchesWithoutBeingIdentical(java.lang.Integer p0)`
- `public int compareTo(org.flywaydb.core.internal.resolver.ResolvedMigrationImpl p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Integer getChecksum()`
- `public java.lang.String getDescription()`
- `public org.flywaydb.core.api.executor.MigrationExecutor getExecutor()`
- `public java.lang.String getPhysicalLocation()`
- `public java.lang.String getScript()`
- `public org.flywaydb.core.extensibility.MigrationType getType()`
- `public org.flywaydb.core.api.MigrationVersion getVersion()`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public void validate()`

---

## public class `org.flywaydb.core.internal.resolver.java.FixedJavaMigrationResolver`
implements `org.flywaydb.core.api.resolver.MigrationResolver`  

**Constructors:**
- `public FixedJavaMigrationResolver(org.flywaydb.core.api.migration.JavaMigration... p0)`

**Methods:**
- `public java.util.List resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public class `org.flywaydb.core.internal.resolver.java.JavaMigrationExecutor`
implements `org.flywaydb.core.api.executor.MigrationExecutor`  

**Constructors:**
- `public JavaMigrationExecutor(org.flywaydb.core.api.migration.JavaMigration p0, org.flywaydb.core.internal.jdbc.StatementInterceptor p1)`

**Methods:**
- `public boolean canExecuteInTransaction()`
- `public void execute(org.flywaydb.core.api.executor.Context p0) throws java.sql.SQLException`
- `public boolean shouldExecute()`

---

## public class `org.flywaydb.core.internal.resolver.java.ScanningJavaMigrationResolver`
implements `org.flywaydb.core.api.resolver.MigrationResolver`  

**Constructors:**
- `public ScanningJavaMigrationResolver(org.flywaydb.core.api.ClassProvider p0, org.flywaydb.core.api.configuration.Configuration p1)`

**Methods:**
- `public java.util.List resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public class `org.flywaydb.core.internal.resolver.sql.DefaultSqlMigrationExecutorFactory`
implements `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutorFactory`  

**Constructors:**
- `public DefaultSqlMigrationExecutorFactory()`

**Methods:**
- `public org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor createSqlMigrationExecutor()`

---

## public class `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor`
implements `org.flywaydb.core.api.executor.MigrationExecutor`  

**Constructors:**
- `public SqlMigrationExecutor(org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p0, org.flywaydb.core.internal.sqlscript.SqlScript p1, boolean p2, boolean p3)`

**Methods:**
- `public boolean canExecuteInTransaction()`
- `public void execute(org.flywaydb.core.api.executor.Context p0) throws java.sql.SQLException`
- `public boolean shouldExecute()`

---

## public abstract interface `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutorFactory`

**Methods:**
- `public abstract org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor createSqlMigrationExecutor()`

---

## public class `org.flywaydb.core.internal.resolver.sql.SqlMigrationResolver`
implements `org.flywaydb.core.api.resolver.MigrationResolver`  

**Constructors:**
- `public SqlMigrationResolver(org.flywaydb.core.api.ResourceProvider p0, org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p1, org.flywaydb.core.internal.sqlscript.SqlScriptFactory p2, org.flywaydb.core.api.configuration.Configuration p3, org.flywaydb.core.internal.parser.ParsingContext p4)`

**Methods:**
- `protected static boolean isSqlCallback(org.flywaydb.core.internal.resource.ResourceName p0)`
- `public java.util.List resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context p0)`

---

## public class `org.flywaydb.core.internal.resource.CoreResourceTypeProvider`
implements `org.flywaydb.core.extensibility.ResourceTypeProvider`  

**Constructors:**
- `public CoreResourceTypeProvider()`

**Methods:**
- `public java.util.List getPrefixTypePairs(org.flywaydb.core.api.configuration.Configuration p0)`

---

## public final enum `org.flywaydb.core.internal.resource.NoopResourceProvider`
extends `java.lang.Enum`  
implements `org.flywaydb.core.api.ResourceProvider`  

**Fields:**
- `public final static org.flywaydb.core.internal.resource.NoopResourceProvider INSTANCE`

**Methods:**
- `public org.flywaydb.core.api.resource.LoadableResource getResource(java.lang.String p0)`
- `public java.util.Collection getResources(java.lang.String p0, java.lang.String[] p1)`

---

## public class `org.flywaydb.core.internal.resource.ResourceName`

**Constructors:**
- `public ResourceName(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, boolean p6, java.lang.String p7)`

**Methods:**
- `public java.lang.String getDescription()`
- `public java.lang.String getFilename()`
- `public java.lang.String getFilenameWithoutSuffix()`
- `public java.lang.String getPrefix()`
- `public java.lang.String getSuffix()`
- `public java.lang.String getValidityMessage()`
- `public org.flywaydb.core.api.MigrationVersion getVersion()`
- `public static org.flywaydb.core.internal.resource.ResourceName invalid(java.lang.String p0)`
- `public boolean isValid()`

---

## public class `org.flywaydb.core.internal.resource.ResourceNameParser`

**Constructors:**
- `public ResourceNameParser(org.flywaydb.core.api.configuration.Configuration p0)`

**Methods:**
- `public org.flywaydb.core.internal.resource.ResourceName parse(java.lang.String p0)`
- `public org.flywaydb.core.internal.resource.ResourceName parse(java.lang.String p0, java.lang.String[] p1)`

---

## public class `org.flywaydb.core.internal.resource.ResourceNameValidator`

**Constructors:**
- `public ResourceNameValidator()`

**Methods:**
- `public void validateSQLMigrationNaming(org.flywaydb.core.api.ResourceProvider p0, org.flywaydb.core.api.configuration.Configuration p1)`

---

## public class `org.flywaydb.core.internal.resource.StringResource`
extends `org.flywaydb.core.api.resource.LoadableResource`  

**Constructors:**
- `public StringResource(java.lang.String p0)`

**Methods:**
- `public java.lang.String getAbsolutePath()`
- `public java.lang.String getAbsolutePathOnDisk()`
- `public java.lang.String getFilename()`
- `public java.lang.String getRelativePath()`
- `public java.io.Reader read()`

---

## public class `org.flywaydb.core.internal.resource.classpath.ClassPathResource`
extends `org.flywaydb.core.api.resource.LoadableResource`  

**Constructors:**
- `public ClassPathResource(org.flywaydb.core.api.Location p0, java.lang.String p1, java.lang.ClassLoader p2, java.nio.charset.Charset p3)`
- `public ClassPathResource(org.flywaydb.core.api.Location p0, java.lang.String p1, java.lang.ClassLoader p2, java.nio.charset.Charset p3, java.lang.Boolean p4, java.lang.String p5)`
- `public ClassPathResource(org.flywaydb.core.api.Location p0, java.lang.String p1, java.lang.ClassLoader p2, java.nio.charset.Charset p3, java.lang.String p4)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public boolean exists()`
- `public java.lang.String getAbsolutePath()`
- `public java.lang.String getAbsolutePathOnDisk()`
- `public java.lang.String getFilename()`
- `public java.lang.String getRelativePath()`
- `public int hashCode()`
- `public java.io.Reader read()`

---

## public class `org.flywaydb.core.internal.resource.filesystem.FileSystemResource`
extends `org.flywaydb.core.api.resource.LoadableResource`  

**Constructors:**
- `public FileSystemResource(org.flywaydb.core.api.Location p0, java.lang.String p1, java.nio.charset.Charset p2, boolean p3)`
- `public FileSystemResource(org.flywaydb.core.api.Location p0, java.lang.String p1, java.nio.charset.Charset p2, boolean p3, boolean p4)`

**Methods:**
- `public java.lang.String getAbsolutePath()`
- `public java.lang.String getAbsolutePathOnDisk()`
- `public java.lang.String getFilename()`
- `public java.lang.String getRelativePath()`
- `public java.io.Reader read()`

---

## public class `org.flywaydb.core.internal.resource.s3.AwsS3Resource`
extends `org.flywaydb.core.api.resource.LoadableResource`  

**Constructors:**
- `public AwsS3Resource(java.lang.String p0, software.amazon.awssdk.services.s3.model.S3Object p1, java.nio.charset.Charset p2)`

**Methods:**
- `public java.lang.String getAbsolutePath()`
- `public java.lang.String getAbsolutePathOnDisk()`
- `public java.lang.String getFilename()`
- `public java.lang.String getRelativePath()`
- `public java.io.Reader read()`

---

## public class `org.flywaydb.core.internal.scanner.ClasspathClassScanner`

**Constructors:**
- `public ClasspathClassScanner(java.lang.ClassLoader p0)`

**Methods:**
- `public java.util.List scanForType(java.lang.String p0, java.lang.Class p1, boolean p2)`

---

## public class `org.flywaydb.core.internal.scanner.LocationScannerCache`

**Constructors:**
- `public LocationScannerCache()`

**Methods:**
- `public boolean containsKey(java.lang.String p0)`
- `public org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner get(java.lang.String p0)`
- `public void put(java.lang.String p0, org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner p1)`

---

## public class `org.flywaydb.core.internal.scanner.ResourceNameCache`

**Constructors:**
- `public ResourceNameCache()`

**Methods:**
- `public java.util.Set get(org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner p0, java.net.URL p1)`
- `public void put(org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner p0, java.net.URL p1, java.util.Set p2)`
- `public void put(org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner p0, java.util.Map p1)`

---

## public class `org.flywaydb.core.internal.scanner.Scanner`<I extends java.lang.Object>
implements `org.flywaydb.core.api.ClassProvider<I>`, `org.flywaydb.core.api.ResourceProvider`  

**Constructors:**
- `public Scanner(java.lang.Class p0, java.util.Collection p1, java.lang.ClassLoader p2, java.nio.charset.Charset p3, boolean p4, boolean p5, org.flywaydb.core.internal.scanner.ResourceNameCache p6, org.flywaydb.core.internal.scanner.LocationScannerCache p7, boolean p8)`

**Methods:**
- `public java.util.Collection getClasses()`
- `public org.flywaydb.core.api.resource.LoadableResource getResource(java.lang.String p0)`
- `public java.util.Collection getResources(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner`

**Methods:**
- `public abstract java.util.Set findResourceNames(java.lang.String p0, java.net.URL p1)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.ClassPathScanner`<I extends java.lang.Object>
implements `org.flywaydb.core.internal.scanner.classpath.ResourceAndClassScanner<I>`  

**Constructors:**
- `public ClassPathScanner(java.lang.Class p0, java.lang.ClassLoader p1, java.nio.charset.Charset p2, org.flywaydb.core.api.Location p3, org.flywaydb.core.internal.scanner.ResourceNameCache p4, org.flywaydb.core.internal.scanner.LocationScannerCache p5, boolean p6)`

**Methods:**
- `public java.util.Collection scanForClasses()`
- `public java.util.Collection scanForResources()`

---

## public class `org.flywaydb.core.internal.scanner.classpath.DefaultUrlResolver`
implements `org.flywaydb.core.internal.scanner.classpath.UrlResolver`  

**Constructors:**
- `public DefaultUrlResolver()`

**Methods:**
- `public java.net.URL toStandardJavaUrl(java.net.URL p0)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.FileSystemClassPathLocationScanner`
implements `org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner`  

**Constructors:**
- `public FileSystemClassPathLocationScanner()`

**Methods:**
- `public java.util.Set findResourceNames(java.lang.String p0, java.net.URL p1)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.JarFileClassPathLocationScanner`
implements `org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner`  

**Methods:**
- `public java.util.Set findResourceNames(java.lang.String p0, java.net.URL p1)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.OsgiClassPathLocationScanner`
implements `org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner`  

**Constructors:**
- `public OsgiClassPathLocationScanner()`

**Methods:**
- `public java.util.Set findResourceNames(java.lang.String p0, java.net.URL p1)`

---

## public abstract interface `org.flywaydb.core.internal.scanner.classpath.ResourceAndClassScanner`<I extends java.lang.Object>

**Methods:**
- `public abstract java.util.Collection scanForClasses()`
- `public abstract java.util.Collection scanForResources()`

---

## public abstract interface `org.flywaydb.core.internal.scanner.classpath.UrlResolver`

**Methods:**
- `public abstract java.net.URL toStandardJavaUrl(java.net.URL p0)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.jboss.JBossVFSv2UrlResolver`
implements `org.flywaydb.core.internal.scanner.classpath.UrlResolver`  

**Constructors:**
- `public JBossVFSv2UrlResolver()`

**Methods:**
- `public java.net.URL toStandardJavaUrl(java.net.URL p0)`

---

## public class `org.flywaydb.core.internal.scanner.classpath.jboss.JBossVFSv3ClassPathLocationScanner`
implements `org.flywaydb.core.internal.scanner.classpath.ClassPathLocationScanner`  

**Constructors:**
- `public JBossVFSv3ClassPathLocationScanner()`

**Methods:**
- `public java.util.Set findResourceNames(java.lang.String p0, java.net.URL p1)`

---

## public abstract class `org.flywaydb.core.internal.scanner.cloud.CloudScanner`

**Constructors:**
- `public CloudScanner(java.nio.charset.Charset p0)`

**Fields:**
- `protected java.nio.charset.Charset encoding`

**Methods:**
- `protected java.lang.String getBucketName(org.flywaydb.core.api.Location p0)`
- `protected java.lang.String getPrefix(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Collection scanForResources(org.flywaydb.core.api.Location p0)`

---

## public class `org.flywaydb.core.internal.scanner.cloud.s3.AwsS3Scanner`
extends `org.flywaydb.core.internal.scanner.cloud.CloudScanner`  

**Constructors:**
- `public AwsS3Scanner(java.nio.charset.Charset p0, boolean p1)`

**Methods:**
- `public java.util.Collection scanForResources(org.flywaydb.core.api.Location p0)`

---

## public class `org.flywaydb.core.internal.scanner.filesystem.FileSystemScanner`

**Constructors:**
- `public FileSystemScanner(java.nio.charset.Charset p0, boolean p1, boolean p2, boolean p3)`

**Methods:**
- `public java.util.Collection scanForResources(org.flywaydb.core.api.Location p0)`

---

## public class `org.flywaydb.core.internal.schemahistory.BaseAppliedMigration`
implements `org.flywaydb.core.extensibility.AppliedMigration`  

**Constructors:**
- `public BaseAppliedMigration()`
- `public BaseAppliedMigration(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`
- `public BaseAppliedMigration(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, org.flywaydb.core.extensibility.MigrationType p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`

**Fields:**
- `protected java.lang.Integer checksum`
- `protected java.lang.String description`
- `protected int executionTime`
- `protected java.lang.String installedBy`
- `protected java.util.Date installedOn`
- `protected int installedRank`
- `protected java.lang.String script`
- `protected boolean success`
- `protected org.flywaydb.core.extensibility.MigrationType type`
- `protected org.flywaydb.core.api.MigrationVersion version`

**Methods:**
- `public org.flywaydb.core.extensibility.AppliedMigration create(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, java.util.Date p6, java.lang.String p7, int p8, boolean p9)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Integer getChecksum()`
- `public java.lang.String getDescription()`
- `public int getExecutionTime()`
- `public java.lang.String getInstalledBy()`
- `public java.util.Date getInstalledOn()`
- `public int getInstalledRank()`
- `protected org.flywaydb.core.api.MigrationState getMissingState(org.flywaydb.core.internal.info.MigrationInfoContext p0, org.flywaydb.core.api.resolver.ResolvedMigration p1)`
- `public java.lang.String getScript()`
- `public org.flywaydb.core.api.MigrationState getState(org.flywaydb.core.internal.info.MigrationInfoContext p0, boolean p1, org.flywaydb.core.api.resolver.ResolvedMigration p2)`
- `public org.flywaydb.core.extensibility.MigrationType getType()`
- `public org.flywaydb.core.api.MigrationVersion getVersion()`
- `public boolean handlesType(java.lang.String p0)`
- `public int hashCode()`
- `public boolean isSuccess()`

---

## public abstract class `org.flywaydb.core.internal.schemahistory.SchemaHistory`

**Constructors:**
- `public SchemaHistory()`

**Fields:**
- `public final static java.lang.String NO_DESCRIPTION_MARKER`
- `protected org.flywaydb.core.internal.database.base.Table table`

**Methods:**
- `public final void addAppliedMigration(org.flywaydb.core.api.MigrationVersion p0, java.lang.String p1, org.flywaydb.core.extensibility.MigrationType p2, java.lang.String p3, java.lang.Integer p4, int p5, boolean p6)`
- `public final void addSchemasMarker(org.flywaydb.core.internal.database.base.Schema[] p0)`
- `public abstract java.util.List allAppliedMigrations()`
- `protected int calculateInstalledRank(org.flywaydb.core.extensibility.MigrationType p0)`
- `public void clearCache()`
- `public abstract void create(boolean p0)`
- `public abstract void delete(org.flywaydb.core.extensibility.AppliedMigration p0)`
- `protected abstract void doAddAppliedMigration(int p0, org.flywaydb.core.api.MigrationVersion p1, java.lang.String p2, org.flywaydb.core.extensibility.MigrationType p3, java.lang.String p4, java.lang.Integer p5, int p6, boolean p7)`
- `public abstract boolean exists()`
- `public final org.flywaydb.core.extensibility.AppliedMigration getBaselineMarker()`
- `public java.util.List getSchemasCreatedByFlyway()`
- `public final boolean hasNonSyntheticAppliedMigrations()`
- `public final boolean hasSchemasMarker()`
- `public abstract <T extends java.lang.Object> T lock(java.util.concurrent.Callable p0)`
- `public abstract boolean removeFailedMigrations(org.flywaydb.core.api.output.RepairResult p0, org.flywaydb.core.api.MigrationPattern[] p1)`
- `public java.lang.String toString()`
- `public abstract void update(org.flywaydb.core.extensibility.AppliedMigration p0, org.flywaydb.core.api.resolver.ResolvedMigration p1)`

---

## public class `org.flywaydb.core.internal.schemahistory.SchemaHistoryFactory`

**Methods:**
- `public static org.flywaydb.core.internal.schemahistory.SchemaHistory getSchemaHistory(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory p1, org.flywaydb.core.internal.sqlscript.SqlScriptFactory p2, org.flywaydb.core.internal.database.base.Database p3, org.flywaydb.core.internal.database.base.Schema p4, org.flywaydb.core.internal.jdbc.StatementInterceptor p5)`
- `public static org.flywaydb.core.internal.util.Pair prepareSchemas(org.flywaydb.core.api.configuration.Configuration p0, org.flywaydb.core.internal.database.base.Database p1)`

---

## public class `org.flywaydb.core.internal.sqlscript.DefaultSqlScriptExecutor`
implements `org.flywaydb.core.internal.sqlscript.SqlScriptExecutor`  

**Constructors:**
- `public DefaultSqlScriptExecutor(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.callback.CallbackExecutor p1, boolean p2, boolean p3, boolean p4, org.flywaydb.core.internal.jdbc.StatementInterceptor p5)`

**Fields:**
- `protected final org.flywaydb.core.internal.jdbc.JdbcTemplate jdbcTemplate`

**Methods:**
- `public void execute(org.flywaydb.core.internal.sqlscript.SqlScript p0)`
- `protected void executeStatement(org.flywaydb.core.internal.jdbc.JdbcTemplate p0, org.flywaydb.core.internal.sqlscript.SqlScript p1, org.flywaydb.core.internal.sqlscript.SqlStatement p2)`
- `protected void handleException(org.flywaydb.core.internal.jdbc.Results p0, org.flywaydb.core.internal.sqlscript.SqlScript p1, org.flywaydb.core.internal.sqlscript.SqlStatement p2)`
- `protected void handleResults(org.flywaydb.core.internal.jdbc.Results p0)`
- `protected void logStatementExecution(org.flywaydb.core.internal.sqlscript.SqlStatement p0)`
- `protected void outputQueryResult(org.flywaydb.core.internal.jdbc.Result p0)`

---

## public class `org.flywaydb.core.internal.sqlscript.Delimiter`

**Constructors:**
- `public Delimiter(java.lang.String p0, boolean p1)`

**Fields:**
- `public final static org.flywaydb.core.internal.sqlscript.Delimiter GO`
- `public final static org.flywaydb.core.internal.sqlscript.Delimiter SEMICOLON`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDelimiter()`
- `public java.lang.String getEscape()`
- `public int hashCode()`
- `public boolean shouldBeAloneOnLine()`
- `public java.lang.String toString()`

---

## public class `org.flywaydb.core.internal.sqlscript.FlywaySqlScriptException`
extends `org.flywaydb.core.internal.exception.FlywaySqlException`  

**Constructors:**
- `public FlywaySqlScriptException(org.flywaydb.core.api.resource.Resource p0, org.flywaydb.core.internal.sqlscript.SqlStatement p1, java.sql.SQLException p2)`

**Methods:**
- `public int getLineNumber()`
- `public java.lang.String getMessage()`
- `public org.flywaydb.core.api.resource.Resource getResource()`
- `public java.lang.String getStatement()`

---

## public class `org.flywaydb.core.internal.sqlscript.ParsedSqlStatement`
implements `org.flywaydb.core.internal.sqlscript.SqlStatement`  

**Constructors:**
- `public ParsedSqlStatement(int p0, int p1, int p2, java.lang.String p3, org.flywaydb.core.internal.sqlscript.Delimiter p4, boolean p5)`

**Methods:**
- `public boolean canExecuteInTransaction()`
- `public org.flywaydb.core.internal.jdbc.Results execute(org.flywaydb.core.internal.jdbc.JdbcTemplate p0)`
- `public int getCol()`
- `public java.lang.String getDelimiter()`
- `public int getLine()`
- `public final int getLineNumber()`
- `public int getPos()`
- `public java.lang.String getSql()`

---

## public class `org.flywaydb.core.internal.sqlscript.ParserSqlScript`
implements `org.flywaydb.core.internal.sqlscript.SqlScript`  

**Constructors:**
- `public ParserSqlScript(org.flywaydb.core.internal.parser.Parser p0, org.flywaydb.core.api.resource.LoadableResource p1, org.flywaydb.core.api.resource.LoadableResource p2, boolean p3)`

**Fields:**
- `protected final org.flywaydb.core.internal.parser.Parser parser`
- `protected final org.flywaydb.core.api.resource.LoadableResource resource`
- `protected final java.util.List sqlStatements`

**Methods:**
- `public int compareTo(org.flywaydb.core.internal.sqlscript.SqlScript p0)`
- `public boolean executeInTransaction()`
- `public java.util.Collection getReferencedSqlScripts()`
- `public final org.flywaydb.core.api.resource.LoadableResource getResource()`
- `public int getSqlStatementCount()`
- `public org.flywaydb.core.internal.sqlscript.SqlStatementIterator getSqlStatements()`
- `protected void parse()`
- `public boolean shouldExecute()`
- `public void validate()`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlScript`
implements `java.lang.Comparable<org.flywaydb.core.internal.sqlscript.SqlScript>`  

**Methods:**
- `public abstract boolean executeInTransaction()`
- `public abstract java.util.Collection getReferencedSqlScripts()`
- `public abstract org.flywaydb.core.api.resource.LoadableResource getResource()`
- `public abstract int getSqlStatementCount()`
- `public abstract org.flywaydb.core.internal.sqlscript.SqlStatementIterator getSqlStatements()`
- `public abstract boolean shouldExecute()`
- `public abstract void validate()`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlScriptExecutor`

**Methods:**
- `public abstract void execute(org.flywaydb.core.internal.sqlscript.SqlScript p0)`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlScriptExecutorFactory`

**Methods:**
- `public abstract org.flywaydb.core.internal.sqlscript.SqlScriptExecutor createSqlScriptExecutor(java.sql.Connection p0, boolean p1, boolean p2, boolean p3)`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlScriptFactory`

**Methods:**
- `public abstract org.flywaydb.core.internal.sqlscript.SqlScript createSqlScript(org.flywaydb.core.api.resource.LoadableResource p0, boolean p1, org.flywaydb.core.api.ResourceProvider p2)`

---

## public class `org.flywaydb.core.internal.sqlscript.SqlScriptMetadata`

**Methods:**
- `public java.lang.String encoding()`
- `public java.lang.Boolean executeInTransaction()`
- `public static org.flywaydb.core.internal.sqlscript.SqlScriptMetadata fromResource(org.flywaydb.core.api.resource.LoadableResource p0, org.flywaydb.core.internal.parser.Parser p1)`
- `public static org.flywaydb.core.api.resource.LoadableResource getMetadataResource(org.flywaydb.core.api.ResourceProvider p0, org.flywaydb.core.api.resource.LoadableResource p1)`
- `public static boolean isMultilineBooleanExpression(java.lang.String p0)`
- `public boolean placeholderReplacement()`
- `public boolean shouldExecute()`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlStatement`

**Methods:**
- `public abstract boolean canExecuteInTransaction()`
- `public abstract org.flywaydb.core.internal.jdbc.Results execute(org.flywaydb.core.internal.jdbc.JdbcTemplate p0)`
- `public abstract java.lang.String getDelimiter()`
- `public abstract int getLineNumber()`
- `public abstract java.lang.String getSql()`

---

## public abstract interface `org.flywaydb.core.internal.sqlscript.SqlStatementIterator`
implements `org.flywaydb.core.internal.util.CloseableIterator<org.flywaydb.core.internal.sqlscript.SqlStatement>`  

**Methods:**
- `public abstract void close()`

---

## public class `org.flywaydb.core.internal.strategy.BackoffStrategy`

**Constructors:**
- `public BackoffStrategy(int p0, int p1, int p2)`

**Methods:**
- `public int next()`
- `public int peek()`

---

## public class `org.flywaydb.core.internal.strategy.RetryStrategy`

**Constructors:**
- `public RetryStrategy()`

**Methods:**
- `public void doWithRetries(org.flywaydb.core.internal.util.SqlCallable p0, java.lang.String p1, java.lang.String p2) throws java.sql.SQLException`
- `public static void setNumberOfRetries(int p0)`

---

## public class `org.flywaydb.core.internal.util.AbbreviationUtils`

**Methods:**
- `public static java.lang.String abbreviateDescription(java.lang.String p0)`
- `public static java.lang.String abbreviateScript(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.util.AsciiTable`

**Constructors:**
- `public AsciiTable(java.util.List p0, java.util.List p1, boolean p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public java.lang.String render()`

---

## public class `org.flywaydb.core.internal.util.BomFilter`

**Constructors:**
- `public BomFilter()`

**Methods:**
- `public static java.lang.String FilterBomFromString(java.lang.String p0)`
- `public static boolean isBom(char p0)`

---

## public class `org.flywaydb.core.internal.util.BomStrippingReader`
extends `java.io.FilterReader`  

**Constructors:**
- `public BomStrippingReader(java.io.Reader p0)`

**Methods:**
- `public int read() throws java.io.IOException`

---

## public class `org.flywaydb.core.internal.util.BooleanEvaluator`

**Constructors:**
- `public BooleanEvaluator()`

**Methods:**
- `public static boolean evaluateExpression(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.util.ClassUtils`

**Methods:**
- `public static java.lang.ClassLoader addJarsOrDirectoriesToClasspath(java.lang.ClassLoader p0, java.util.List p1)`
- `public static java.lang.String formatThrowable(java.lang.Throwable p0)`
- `public static java.lang.String getInstallDir(java.lang.Class p0)`
- `public static java.lang.String getLibDir(java.lang.Class p0)`
- `public static java.lang.String getLocationOnDisk(java.lang.Class p0)`
- `public static java.lang.String getStaticFieldValue(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2)`
- `public static <T extends java.lang.Object> T instantiate(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T instantiate(java.lang.String p0, java.lang.ClassLoader p1)`
- `public static <T extends java.lang.Object> T instantiate(java.lang.String p0, java.lang.ClassLoader p1, java.lang.Object... p2)`
- `public static <T extends java.lang.Object> java.util.List instantiateAll(java.lang.String[] p0, java.lang.ClassLoader p1)`
- `public static boolean isImplementationPresent(java.lang.String p0, java.lang.ClassLoader p1)`
- `public static boolean isPresent(java.lang.String p0, java.lang.ClassLoader p1)`
- `public static <I extends java.lang.Object> java.lang.Class loadClass(java.lang.Class p0, java.lang.String p1, java.lang.ClassLoader p2) throws java.lang.Exception`

---

## public abstract interface `org.flywaydb.core.internal.util.CloseableIterator`<T extends java.lang.Object>
implements `java.lang.AutoCloseable`, `java.util.Iterator<T>`  

---

## public class `org.flywaydb.core.internal.util.CollectionsUtils`

**Methods:**
- `public static boolean hasItems(java.util.Collection p0)`

---

## public class `org.flywaydb.core.internal.util.CommandExtensionUtils`

**Constructors:**
- `public CommandExtensionUtils()`

**Methods:**
- `public static org.flywaydb.core.api.output.OperationResult runCommandExtension(org.flywaydb.core.api.configuration.Configuration p0, java.lang.String p1, java.util.List p2, org.flywaydb.core.FlywayTelemetryManager p3)`

---

## public final enum `org.flywaydb.core.internal.util.DataUnits`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.flywaydb.core.internal.util.DataUnits BYTE`
- `public final static org.flywaydb.core.internal.util.DataUnits GIGABYTE`
- `public final static org.flywaydb.core.internal.util.DataUnits KILOBYTE`
- `public final static org.flywaydb.core.internal.util.DataUnits MEGABYTE`

**Methods:**
- `public long fromBytes(long p0)`
- `public long toBytes(long p0)`
- `public java.lang.String toHumanReadableString(long p0)`

---

## public class `org.flywaydb.core.internal.util.DateUtils`

**Methods:**
- `public static java.util.Date addDaysToDate(java.util.Date p0, int p1)`
- `public static java.lang.String formatDateAsIsoString(java.util.Date p0)`
- `public static java.lang.String formatStringAsIsoDateString(java.lang.String p0)`
- `public static java.lang.String formatTimeAsIsoString(java.util.Date p0)`
- `public static java.util.Date toDate(int p0, int p1, int p2)`
- `public static java.lang.String toDateString(java.util.Date p0)`

---

## public class `org.flywaydb.core.internal.util.ExceptionUtils`

**Methods:**
- `public static java.lang.Throwable getRootCause(java.lang.Throwable p0)`
- `public static java.lang.String getThrowLocation(java.lang.Throwable p0)`
- `public static java.lang.String toMessage(java.sql.SQLException p0)`

---

## public final class `org.flywaydb.core.internal.util.FeatureDetector`

**Constructors:**
- `public FeatureDetector(java.lang.ClassLoader p0)`

**Methods:**
- `public boolean isApacheCommonsLoggingAvailable()`
- `public boolean isAwsAvailable()`
- `public boolean isGCSAvailable()`
- `public boolean isJBossVFSv2Available()`
- `public boolean isJBossVFSv3Available()`
- `public boolean isLog4J2Available()`
- `public boolean isOsgiFrameworkAvailable()`
- `public boolean isSlf4jAvailable()`

---

## public class `org.flywaydb.core.internal.util.FileUtils`

**Methods:**
- `public static int copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void copy(java.io.Reader p0, java.io.Writer p1) throws java.io.IOException`
- `public static java.lang.String copyToString(java.io.InputStream p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public static java.lang.String copyToString(java.io.Reader p0) throws java.io.IOException`
- `public static void createDirIfNotExists(java.io.File p0)`
- `public static java.lang.String getFilename(java.lang.String p0)`
- `public static java.lang.String readAsString(java.nio.file.Path p0)`
- `public static java.lang.String readAsStringFallbackToResource(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String readResourceAsString(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.util.FingerprintUtils`

**Methods:**
- `public static java.lang.String getFingerprint(org.flywaydb.core.api.configuration.Configuration p0) throws java.lang.Exception`

---

## public class `org.flywaydb.core.internal.util.FlywayDbWebsiteLinks`

**Fields:**
- `public final static java.lang.String AZURE_ACTIVE_DIRECTORY`
- `public final static java.lang.String CHANGES_REPORT_LEARN_MORE`
- `public final static java.lang.String CLOUD_SPANNER_BETA`
- `public final static java.lang.String CODE_ANALYSIS_LEARN_MORE`
- `public final static java.lang.String CUSTOM_VALIDATE_RULES`
- `public final static java.lang.String DRIFT_REPORT_LEARN_MORE`
- `public final static java.lang.String DRY_RUN_REPORT_LEARN_MORE`
- `public final static java.lang.String FILE_ENCODING_HELP`
- `public final static java.lang.String FILTER_INFO_OUTPUT`
- `public final static java.lang.String GIVE_FEEDBACK`
- `public final static java.lang.String IGNORE_MIGRATION_PATTERNS`
- `public final static java.lang.String INFO_REPORT_LEARN_MORE`
- `public final static java.lang.String KNOWN_PARSER_LIMITATIONS`
- `public final static java.lang.String LOCK_RETRY_COUNT`
- `public final static java.lang.String MIGRATION_REPORT_LEARN_MORE`
- `public final static java.lang.String ORACLE_SQL_PLUS`
- `public final static java.lang.String RESET_THE_BASELINE_MIGRATION`
- `public final static java.lang.String SQLFLUFF_CONFIGURATION`
- `public final static java.lang.String STAYING_UP_TO_DATE`
- `public final static java.lang.String TEAMS_ENTERPRISE_DOWNLOAD`
- `public final static java.lang.String TEAMS_FEATURES_FOR_BIG_QUERY`
- `public final static java.lang.String TEAMS_FEATURES_FOR_CLOUD_SPANNER`
- `public final static java.lang.String TRIAL_UPGRADE`
- `public final static java.lang.String TRY_TEAMS_EDITION`
- `public final static java.lang.String UPGRADE_TO_REDGATE_FLYWAY`
- `public final static java.lang.String USAGE_COMMANDLINE`
- `public final static java.lang.String WINDOWS_AUTH`

---

## public class `org.flywaydb.core.internal.util.HtmlUtils`

**Constructors:**
- `public HtmlUtils()`

**Methods:**
- `public static java.lang.String getFormattedTimestamp(org.flywaydb.core.api.output.HtmlResult p0)`
- `public static java.lang.String htmlEncode(java.lang.String p0)`
- `public static java.lang.String toHtmlFile(java.lang.String p0, org.flywaydb.core.api.output.CompositeResult p1, org.flywaydb.core.api.configuration.Configuration p2)`

---

## public class `org.flywaydb.core.internal.util.IOUtils`

**Methods:**
- `public static void close(java.lang.AutoCloseable p0)`

---

## public class `org.flywaydb.core.internal.util.JsonUtils`

**Methods:**
- `public static <T extends org.flywaydb.core.api.output.OperationResult> org.flywaydb.core.api.output.CompositeResult appendIfExists(java.lang.String p0, org.flywaydb.core.api.output.CompositeResult p1, com.google.gson.JsonDeserializer p2)`
- `public static java.lang.String getFromJson(java.lang.String p0, java.lang.String p1)`
- `public static com.google.gson.Gson getGson()`
- `public static java.lang.String jsonToFile(java.lang.String p0, java.lang.Object p1)`
- `public static java.lang.Object parseJsonArray(java.lang.String p0)`
- `public static java.lang.String prettyPrint(java.lang.String p0)`
- `public static <T extends java.lang.Object> java.util.List toList(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.util.LocalDateTimeSerializer`
implements `com.google.gson.JsonDeserializer<java.time.LocalDateTime>`, `com.google.gson.JsonSerializer<java.time.LocalDateTime>`  

**Constructors:**
- `public LocalDateTimeSerializer()`

**Methods:**
- `public java.time.LocalDateTime deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException`
- `public com.google.gson.JsonElement serialize(java.time.LocalDateTime p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2)`

---

## public class `org.flywaydb.core.internal.util.Locations`

**Constructors:**
- `public Locations(java.lang.String... p0)`
- `public Locations(java.util.List p0)`

**Methods:**
- `public java.util.List getLocations()`

---

## public class `org.flywaydb.core.internal.util.MergeUtils`

**Constructors:**
- `public MergeUtils()`

**Methods:**
- `public static <T extends java.lang.Object> T merge(T p0, T p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map merge(java.util.Map p0, java.util.Map p1, java.util.function.BiFunction p2)`
- `public static <T extends java.lang.Object> void mergeModel(T p0, T p1)`

---

## public class `org.flywaydb.core.internal.util.ObjectMapperFactory`

**Constructors:**
- `public ObjectMapperFactory()`

**Methods:**
- `public static com.fasterxml.jackson.databind.ObjectMapper getObjectMapper(java.lang.String p0)`

---

## public class `org.flywaydb.core.internal.util.Pair`<L extends java.lang.Object, R extends java.lang.Object>
implements `java.lang.Comparable<org.flywaydb.core.internal.util.Pair<L,R>>`  

**Methods:**
- `public int compareTo(org.flywaydb.core.internal.util.Pair p0)`
- `public boolean equals(java.lang.Object p0)`
- `public L getLeft()`
- `public R getRight()`
- `public int hashCode()`
- `public static <L extends java.lang.Object, R extends java.lang.Object> org.flywaydb.core.internal.util.Pair of(L p0, R p1)`

---

## public abstract interface `org.flywaydb.core.internal.util.SqlCallable`<V extends java.lang.Object>

**Methods:**
- `public abstract V call() throws java.sql.SQLException`

---

## public class `org.flywaydb.core.internal.util.StopWatch`

**Constructors:**
- `public StopWatch()`

**Methods:**
- `public long getTotalTimeMillis()`
- `public void start()`
- `public void stop()`

---

## public class `org.flywaydb.core.internal.util.StringUtils`

**Methods:**
- `public static java.lang.String arrayToCommaDelimitedString(java.lang.Object[] p0)`
- `public static java.lang.String arrayToDelimitedString(java.lang.String p0, java.lang.Object[] p1)`
- `public static java.lang.String collapseWhitespace(java.lang.String p0)`
- `public static java.lang.String collectionToCommaDelimitedString(java.util.Collection p0)`
- `public static java.lang.String collectionToDelimitedString(java.util.Collection p0, java.lang.String p1)`
- `public static int countOccurrencesOf(java.lang.String p0, char p1)`
- `public static org.flywaydb.core.internal.util.Pair getFileNameAndExtension(java.lang.String p0)`
- `public static boolean hasLength(java.lang.String p0)`
- `public static boolean hasText(java.lang.String p0)`
- `public static boolean isCharAnyOf(char p0, java.lang.String p1)`
- `public static java.lang.String left(java.lang.String p0, int p1)`
- `public static java.lang.String leftPad(java.lang.String p0, int p1, char p2)`
- `public static java.lang.String replaceAll(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String rightPad(java.lang.String p0, int p1, char p2)`
- `public static org.flywaydb.core.internal.util.Pair splitAtFirstSeparator(java.lang.String p0, java.lang.String p1)`
- `public static boolean startsAndEndsWith(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public static java.lang.String[] tokenizeToStringArray(java.lang.String p0, java.lang.String p1)`
- `public static java.util.List tokenizeToStringCollection(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String trimLeadingCharacter(java.lang.String p0, char p1)`
- `public static java.lang.String trimOrLeftPad(java.lang.String p0, int p1, char p2)`
- `public static java.lang.String trimOrPad(java.lang.String p0, int p1)`
- `public static java.lang.String trimOrPad(java.lang.String p0, int p1, char p2)`
- `public static java.lang.String wordWrap(java.lang.String p0, int p1)`
- `public static java.lang.String wrap(java.lang.String p0, int p1)`

---

## public class `org.flywaydb.core.internal.util.TimeFormat`

**Methods:**
- `public static java.lang.String format(long p0)`

---

## public class `org.flywaydb.core.internal.util.UrlUtils`

**Methods:**
- `public static java.lang.String decodeURL(java.lang.String p0)`
- `public static java.lang.String decodeURLSafe(java.lang.String p0)`
- `public static java.lang.String toFilePath(java.net.URL p0)`

---

## public class `org.flywaydb.core.internal.util.ValidatePatternUtils`

**Constructors:**
- `public ValidatePatternUtils()`

**Methods:**
- `public static org.flywaydb.core.api.pattern.ValidatePattern[] getIgnoreAllPattern()`
- `public static boolean isFutureIgnored(org.flywaydb.core.api.pattern.ValidatePattern[] p0)`
- `public static boolean isIgnoredIgnored(org.flywaydb.core.api.pattern.ValidatePattern[] p0)`
- `public static boolean isMissingIgnored(org.flywaydb.core.api.pattern.ValidatePattern[] p0)`
- `public static boolean isPendingIgnored(org.flywaydb.core.api.pattern.ValidatePattern[] p0)`

---

