# Breaking Changes: org.flywaydb:flyway-core 3.2.1 → 9.21.1
Total: 301 (binary-breaking: 268, source-breaking: 282)

## org.flywaydb.core.Flyway

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.Flyway.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.configure(java.util.Properties)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getBaselineDescription()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getBaselineVersion()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getCallbacks()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getClassLoader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getDataSource()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getEncoding()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getInitDescription()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getInitVersion()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getLocations()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getPlaceholderPrefix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getPlaceholderSuffix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getPlaceholders()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getResolvers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getSchemas()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getSqlMigrationPrefix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getSqlMigrationSeparator()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getSqlMigrationSuffix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getTable()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.getTarget()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.init()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isBaselineOnMigrate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isCleanOnValidationError()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isIgnoreFailedFutureMigration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isInitOnMigrate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isOutOfOrder()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isPlaceholderReplacement()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.isValidateOnMigrate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setBaselineDescription(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setBaselineOnMigrate(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setBaselineVersion(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setBaselineVersion(org.flywaydb.core.api.MigrationVersion)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setBaselineVersionAsString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setCallbacks(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setCallbacks(org.flywaydb.core.api.callback.FlywayCallback[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setCallbacksAsClassNames(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setClassLoader(java.lang.ClassLoader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setCleanOnValidationError(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setDataSource(java.lang.String,java.lang.String,java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setDataSource(javax.sql.DataSource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setIgnoreFailedFutureMigration(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setInitDescription(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setInitOnMigrate(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setInitVersion(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setInitVersion(org.flywaydb.core.api.MigrationVersion)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setLocations(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setOutOfOrder(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setPlaceholderPrefix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setPlaceholderReplacement(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setPlaceholderSuffix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setPlaceholders(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setResolvers(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setResolvers(org.flywaydb.core.api.resolver.MigrationResolver[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setResolversAsClassNames(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setSchemas(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setSqlMigrationPrefix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setSqlMigrationSeparator(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setSqlMigrationSuffix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setTable(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setTarget(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setTarget(org.flywaydb.core.api.MigrationVersion)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setTargetAsString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.Flyway.setValidateOnMigrate(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.Flyway.baseline()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.baseline()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.Flyway.clean()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.clean()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.Flyway.migrate()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.migrate()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.Flyway.repair()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.repair()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.Flyway.baseline()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.baseline()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.Flyway.clean()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.clean()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.Flyway.migrate()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.migrate()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.Flyway.repair()`
+ NEW RETURN TYPE: `org.flywaydb.core.Flyway.repair()`

## org.flywaydb.core.api.MigrationInfo

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.api.MigrationInfo.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.MigrationInfo.getType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.api.MigrationInfo.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.MigrationInfo.getType()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.MigrationInfo`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.MigrationInfo.getInstalledBy()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.MigrationInfo`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.MigrationInfo.compareVersion(org.flywaydb.core.api.MigrationInfo)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.MigrationInfo`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.MigrationInfo.getPhysicalLocation()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.MigrationInfo`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.MigrationInfo.getInstalledRank()`

## org.flywaydb.core.api.MigrationInfoService

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.MigrationInfoService`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.InfoOutputProvider.getInfoResult()`

## org.flywaydb.core.api.MigrationState

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.flywaydb.core.api.MigrationState.PREINIT`

## org.flywaydb.core.api.MigrationType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.MigrationType`

## org.flywaydb.core.api.android.ContextHolder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.android.ContextHolder`

## org.flywaydb.core.api.callback.FlywayCallback

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.callback.FlywayCallback`

## org.flywaydb.core.api.migration.MigrationChecksumProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.migration.MigrationChecksumProvider`

## org.flywaydb.core.api.migration.MigrationInfoProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.migration.MigrationInfoProvider`

## org.flywaydb.core.api.migration.jdbc.JdbcMigration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.migration.jdbc.JdbcMigration`

## org.flywaydb.core.api.migration.spring.SpringJdbcMigration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.migration.spring.SpringJdbcMigration`

## org.flywaydb.core.api.resolver.MigrationExecutor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.api.resolver.MigrationExecutor`

## org.flywaydb.core.api.resolver.MigrationResolver

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.api.resolver.MigrationResolver.resolveMigrations()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.resolver.MigrationResolver`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.resolver.MigrationResolver.resolveMigrations(org.flywaydb.core.api.resolver.MigrationResolver$Context)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.resolver.MigrationResolver`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.flywaydb.core.api.resolver.ResolvedMigration

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.api.resolver.ResolvedMigration.getExecutor()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration.getExecutor()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.api.resolver.ResolvedMigration.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration.getType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.api.resolver.ResolvedMigration.getExecutor()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration.getExecutor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.api.resolver.ResolvedMigration.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration.getType()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.resolver.ChecksumMatcher.checksumMatchesWithoutBeingIdentical(java.lang.Integer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.api.resolver.ResolvedMigration`
+ MUST NOW IMPLEMENT: `org.flywaydb.core.api.resolver.ChecksumMatcher.checksumMatches(java.lang.Integer)`

## org.flywaydb.core.internal.callback.SqlScriptFlywayCallback

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.callback.SqlScriptFlywayCallback`

## org.flywaydb.core.internal.command.DbBaseline

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.command.DbBaseline.<init>(java.sql.Connection,org.flywaydb.core.internal.metadatatable.MetaDataTable,org.flywaydb.core.api.MigrationVersion,java.lang.String,org.flywaydb.core.api.callback.FlywayCallback[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.command.DbBaseline.baseline()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbBaseline.baseline()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.command.DbBaseline.baseline()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbBaseline.baseline()`

## org.flywaydb.core.internal.command.DbClean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.command.DbClean`

## org.flywaydb.core.internal.command.DbMigrate

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.command.DbMigrate.<init>(java.sql.Connection,java.sql.Connection,org.flywaydb.core.internal.dbsupport.DbSupport,org.flywaydb.core.internal.metadatatable.MetaDataTable,org.flywaydb.core.internal.dbsupport.Schema,org.flywaydb.core.api.resolver.MigrationResolver,org.flywaydb.core.api.MigrationVersion,boolean,boolean,org.flywaydb.core.api.callback.FlywayCallback[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.command.DbMigrate.migrate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbMigrate.migrate()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.command.DbMigrate.migrate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbMigrate.migrate()`

## org.flywaydb.core.internal.command.DbRepair

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.command.DbRepair.<init>(org.flywaydb.core.internal.dbsupport.DbSupport,java.sql.Connection,org.flywaydb.core.api.resolver.MigrationResolver,org.flywaydb.core.internal.metadatatable.MetaDataTable,org.flywaydb.core.api.callback.FlywayCallback[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.command.DbRepair.repair()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbRepair.repair()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.command.DbRepair.repair()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbRepair.repair()`

## org.flywaydb.core.internal.command.DbSchemas

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.command.DbSchemas.<init>(java.sql.Connection,org.flywaydb.core.internal.dbsupport.Schema[],org.flywaydb.core.internal.metadatatable.MetaDataTable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.command.DbSchemas.create()`

## org.flywaydb.core.internal.command.DbValidate

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.command.DbValidate.<init>(java.sql.Connection,java.sql.Connection,org.flywaydb.core.internal.metadatatable.MetaDataTable,org.flywaydb.core.api.resolver.MigrationResolver,org.flywaydb.core.api.MigrationVersion,boolean,boolean,org.flywaydb.core.api.callback.FlywayCallback[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.command.DbValidate.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbValidate.validate()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.command.DbValidate.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.command.DbValidate.validate()`

## org.flywaydb.core.internal.dbsupport.DbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.DbSupport`

## org.flywaydb.core.internal.dbsupport.DbSupportFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.DbSupportFactory`

## org.flywaydb.core.internal.dbsupport.Delimiter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.Delimiter`

## org.flywaydb.core.internal.dbsupport.FlywaySqlScriptException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.FlywaySqlScriptException`

## org.flywaydb.core.internal.dbsupport.Function

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.Function`

## org.flywaydb.core.internal.dbsupport.JdbcTemplate

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.JdbcTemplate`

## org.flywaydb.core.internal.dbsupport.Schema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.Schema`

## org.flywaydb.core.internal.dbsupport.SchemaObject

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.SchemaObject`

## org.flywaydb.core.internal.dbsupport.SqlScript

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.SqlScript`

## org.flywaydb.core.internal.dbsupport.SqlStatement

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.SqlStatement`

## org.flywaydb.core.internal.dbsupport.SqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.SqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.Table

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.Table`

## org.flywaydb.core.internal.dbsupport.Type

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.Type`

## org.flywaydb.core.internal.dbsupport.db2.DB2DbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2DbSupport`

## org.flywaydb.core.internal.dbsupport.db2.DB2Function

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2Function`

## org.flywaydb.core.internal.dbsupport.db2.DB2Schema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2Schema`

## org.flywaydb.core.internal.dbsupport.db2.DB2SqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2SqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.db2.DB2Table

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2Table`

## org.flywaydb.core.internal.dbsupport.db2.DB2Type

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2.DB2Type`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosDbSupport`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosFunction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosFunction`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosSchema`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosTable`

## org.flywaydb.core.internal.dbsupport.db2zos.DB2zosType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.db2zos.DB2zosType`

## org.flywaydb.core.internal.dbsupport.derby.DerbyDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.derby.DerbyDbSupport`

## org.flywaydb.core.internal.dbsupport.derby.DerbySchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.derby.DerbySchema`

## org.flywaydb.core.internal.dbsupport.derby.DerbySqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.derby.DerbySqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.derby.DerbyTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.derby.DerbyTable`

## org.flywaydb.core.internal.dbsupport.h2.H2DbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.h2.H2DbSupport`

## org.flywaydb.core.internal.dbsupport.h2.H2Schema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.h2.H2Schema`

## org.flywaydb.core.internal.dbsupport.h2.H2SqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.h2.H2SqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.h2.H2Table

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.h2.H2Table`

## org.flywaydb.core.internal.dbsupport.hsql.HsqlDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.hsql.HsqlDbSupport`

## org.flywaydb.core.internal.dbsupport.hsql.HsqlSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.hsql.HsqlSchema`

## org.flywaydb.core.internal.dbsupport.hsql.HsqlSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.hsql.HsqlSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.hsql.HsqlTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.hsql.HsqlTable`

## org.flywaydb.core.internal.dbsupport.mysql.MySQLDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.mysql.MySQLDbSupport`

## org.flywaydb.core.internal.dbsupport.mysql.MySQLSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.mysql.MySQLSchema`

## org.flywaydb.core.internal.dbsupport.mysql.MySQLSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.mysql.MySQLSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.mysql.MySQLTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.mysql.MySQLTable`

## org.flywaydb.core.internal.dbsupport.oracle.OracleDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.oracle.OracleDbSupport`

## org.flywaydb.core.internal.dbsupport.oracle.OracleSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.oracle.OracleSchema`

## org.flywaydb.core.internal.dbsupport.oracle.OracleSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.oracle.OracleSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.oracle.OracleTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.oracle.OracleTable`

## org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLDbSupport`

## org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSchema`

## org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLTable`

## org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.postgresql.PostgreSQLType`

## org.flywaydb.core.internal.dbsupport.redshift.RedshiftDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.redshift.RedshiftDbSupport`

## org.flywaydb.core.internal.dbsupport.redshift.RedshiftSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.redshift.RedshiftSchema`

## org.flywaydb.core.internal.dbsupport.redshift.RedshiftTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.redshift.RedshiftTable`

## org.flywaydb.core.internal.dbsupport.solid.SolidDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.solid.SolidDbSupport`

## org.flywaydb.core.internal.dbsupport.solid.SolidSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.solid.SolidSchema`

## org.flywaydb.core.internal.dbsupport.solid.SolidSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.solid.SolidSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.solid.SolidTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.solid.SolidTable`

## org.flywaydb.core.internal.dbsupport.sqlite.SQLiteDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlite.SQLiteDbSupport`

## org.flywaydb.core.internal.dbsupport.sqlite.SQLiteSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlite.SQLiteSchema`

## org.flywaydb.core.internal.dbsupport.sqlite.SQLiteSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlite.SQLiteSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.sqlite.SQLiteTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlite.SQLiteTable`

## org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerDbSupport`

## org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSchema`

## org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSqlStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerSqlStatementBuilder`

## org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.sqlserver.SQLServerTable`

## org.flywaydb.core.internal.dbsupport.vertica.VerticaDbSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.vertica.VerticaDbSupport`

## org.flywaydb.core.internal.dbsupport.vertica.VerticaSchema

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.vertica.VerticaSchema`

## org.flywaydb.core.internal.dbsupport.vertica.VerticaStatementBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.dbsupport.vertica.VerticaStatementBuilder`

## org.flywaydb.core.internal.info.MigrationInfoContext

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.flywaydb.core.internal.info.MigrationInfoContext.baseline`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.flywaydb.core.internal.info.MigrationInfoContext.init`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.flywaydb.core.internal.info.MigrationInfoContext.pendingOrFuture`

## org.flywaydb.core.internal.info.MigrationInfoImpl

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.flywaydb.core.internal.info.MigrationInfoImpl`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.flywaydb.core.internal.info.MigrationInfoImpl`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.info.MigrationInfoImpl.<init>(org.flywaydb.core.api.resolver.ResolvedMigration,org.flywaydb.core.internal.metadatatable.AppliedMigration,org.flywaydb.core.internal.info.MigrationInfoContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.lang.Comparable.compareTo(T)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.compareTo(org.flywaydb.core.api.MigrationInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getAppliedMigration()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getChecksum()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getDescription()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getExecutionTime()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getInstalledOn()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getResolvedMigration()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getScript()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getState()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getType()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.getVersion()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.info.MigrationInfoImpl.validate()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoImpl.getAppliedMigration()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.getAppliedMigration()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoImpl.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.getType()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoImpl.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.validate()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoImpl.getAppliedMigration()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.getAppliedMigration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoImpl.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.getType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoImpl.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoImpl.validate()`

## org.flywaydb.core.internal.info.MigrationInfoServiceImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.<init>(org.flywaydb.core.api.resolver.MigrationResolver,org.flywaydb.core.internal.metadatatable.MetaDataTable,org.flywaydb.core.api.MigrationVersion,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.applied()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.applied()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.failed()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.failed()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.validate()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.applied()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.applied()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.failed()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.failed()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.validate()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.info.MigrationInfoServiceImpl.validate()`

## org.flywaydb.core.internal.metadatatable.AppliedMigration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.metadatatable.AppliedMigration`

## org.flywaydb.core.internal.metadatatable.MetaDataTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.metadatatable.MetaDataTable`

## org.flywaydb.core.internal.metadatatable.MetaDataTableImpl

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.metadatatable.MetaDataTableImpl`

## org.flywaydb.core.internal.resolver.CompositeMigrationResolver

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.resolver.CompositeMigrationResolver.<init>(org.flywaydb.core.internal.dbsupport.DbSupport,java.lang.ClassLoader,org.flywaydb.core.internal.util.Locations,java.lang.String,java.lang.String,java.lang.String,java.lang.String,org.flywaydb.core.internal.util.PlaceholderReplacer,org.flywaydb.core.api.resolver.MigrationResolver[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.CompositeMigrationResolver.resolveMigrations()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.internal.resolver.CompositeMigrationResolver`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.flywaydb.core.internal.resolver.MigrationInfoHelper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.MigrationInfoHelper.extractVersionAndDescription(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

## org.flywaydb.core.internal.resolver.ResolvedMigrationImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setChecksum(java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setDescription(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setExecutor(org.flywaydb.core.api.resolver.MigrationExecutor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setPhysicalLocation(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setScript(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setType(org.flywaydb.core.api.MigrationType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.setVersion(org.flywaydb.core.api.MigrationVersion)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getExecutor()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getExecutor()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getExecutor()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getExecutor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getType()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.resolver.ResolvedMigrationImpl.getType()`

## org.flywaydb.core.internal.resolver.jdbc.JdbcMigrationExecutor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.resolver.jdbc.JdbcMigrationExecutor`

## org.flywaydb.core.internal.resolver.jdbc.JdbcMigrationResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.resolver.jdbc.JdbcMigrationResolver`

## org.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationExecutor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationExecutor`

## org.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.resolver.spring.SpringJdbcMigrationResolver`

## org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor.<init>(org.flywaydb.core.internal.dbsupport.DbSupport,org.flywaydb.core.internal.util.scanner.Resource,org.flywaydb.core.internal.util.PlaceholderReplacer,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor.execute(java.sql.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor.executeInTransaction()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.flywaydb.core.internal.resolver.sql.SqlMigrationExecutor`

## org.flywaydb.core.internal.resolver.sql.SqlMigrationResolver

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.resolver.sql.SqlMigrationResolver.<init>(org.flywaydb.core.internal.dbsupport.DbSupport,java.lang.ClassLoader,org.flywaydb.core.internal.util.Location,org.flywaydb.core.internal.util.PlaceholderReplacer,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.resolver.sql.SqlMigrationResolver.resolveMigrations()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.internal.resolver.sql.SqlMigrationResolver`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.flywaydb.core.internal.util.ClassUtils

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.flywaydb.core.internal.util.ClassUtils.instantiate(java.lang.String,java.lang.ClassLoader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.ClassUtils.getShortName(java.lang.Class<? extends java.lang.Object>)`

## org.flywaydb.core.internal.util.FeatureDetector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.FeatureDetector.isAndroidAvailable()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.FeatureDetector.isSpringJdbcAvailable()`

## org.flywaydb.core.internal.util.FileCopyUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.FileCopyUtils`

## org.flywaydb.core.internal.util.Location

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.Location`

## org.flywaydb.core.internal.util.Locations

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.flywaydb.core.internal.util.Locations.getLocations()`
+ NEW RETURN TYPE: `org.flywaydb.core.internal.util.Locations.getLocations()`

## org.flywaydb.core.internal.util.ObjectUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.ObjectUtils`

## org.flywaydb.core.internal.util.Pair

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.flywaydb.core.internal.util.Pair`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.flywaydb.core.internal.util.Pair`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.flywaydb.core.internal.util.Pair.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.util.Pair.getLeft()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.util.Pair.getRight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.flywaydb.core.internal.util.Pair.of(L,R)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.flywaydb.core.internal.util.Pair`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.flywaydb.core.internal.util.PlaceholderReplacer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.PlaceholderReplacer`

## org.flywaydb.core.internal.util.PropertiesUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.PropertiesUtils`

## org.flywaydb.core.internal.util.StringUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.StringUtils.countOccurrencesOf(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.StringUtils.isNumeric(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.StringUtils.replace(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.StringUtils.trimLeadingWhitespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.flywaydb.core.internal.util.StringUtils.trimTrailingWhitespace(java.lang.String)`

## org.flywaydb.core.internal.util.VersionPrinter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.VersionPrinter`

## org.flywaydb.core.internal.util.jdbc.DriverDataSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.jdbc.DriverDataSource`

## org.flywaydb.core.internal.util.jdbc.JdbcUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.jdbc.JdbcUtils`

## org.flywaydb.core.internal.util.jdbc.RowMapper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.jdbc.RowMapper`

## org.flywaydb.core.internal.util.jdbc.TransactionCallback

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.jdbc.TransactionCallback`

## org.flywaydb.core.internal.util.jdbc.TransactionTemplate

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.jdbc.TransactionTemplate`

## org.flywaydb.core.internal.util.logging.Log

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.Log`

## org.flywaydb.core.internal.util.logging.LogCreator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.LogCreator`

## org.flywaydb.core.internal.util.logging.LogFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.LogFactory`

## org.flywaydb.core.internal.util.logging.android.AndroidLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.android.AndroidLog`

## org.flywaydb.core.internal.util.logging.android.AndroidLogCreator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.android.AndroidLogCreator`

## org.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLog`

## org.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLogCreator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.apachecommons.ApacheCommonsLogCreator`

## org.flywaydb.core.internal.util.logging.javautil.JavaUtilLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.javautil.JavaUtilLog`

## org.flywaydb.core.internal.util.logging.javautil.JavaUtilLogCreator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.javautil.JavaUtilLogCreator`

## org.flywaydb.core.internal.util.logging.slf4j.Slf4jLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.slf4j.Slf4jLog`

## org.flywaydb.core.internal.util.logging.slf4j.Slf4jLogCreator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.logging.slf4j.Slf4jLogCreator`

## org.flywaydb.core.internal.util.scanner.Resource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.Resource`

## org.flywaydb.core.internal.util.scanner.Scanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.Scanner`

## org.flywaydb.core.internal.util.scanner.android.AndroidResource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.android.AndroidResource`

## org.flywaydb.core.internal.util.scanner.android.AndroidScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.android.AndroidScanner`

## org.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.ClassPathLocationScanner`

## org.flywaydb.core.internal.util.scanner.classpath.ClassPathResource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.ClassPathResource`

## org.flywaydb.core.internal.util.scanner.classpath.ClassPathScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.ClassPathScanner`

## org.flywaydb.core.internal.util.scanner.classpath.DefaultUrlResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.DefaultUrlResolver`

## org.flywaydb.core.internal.util.scanner.classpath.FileSystemClassPathLocationScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.FileSystemClassPathLocationScanner`

## org.flywaydb.core.internal.util.scanner.classpath.JarFileClassPathLocationScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.JarFileClassPathLocationScanner`

## org.flywaydb.core.internal.util.scanner.classpath.OsgiClassPathLocationScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.OsgiClassPathLocationScanner`

## org.flywaydb.core.internal.util.scanner.classpath.UrlResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.UrlResolver`

## org.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv2UrlResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv2UrlResolver`

## org.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv3ClassPathLocationScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.classpath.jboss.JBossVFSv3ClassPathLocationScanner`

## org.flywaydb.core.internal.util.scanner.filesystem.FileSystemResource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.filesystem.FileSystemResource`

## org.flywaydb.core.internal.util.scanner.filesystem.FileSystemScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.flywaydb.core.internal.util.scanner.filesystem.FileSystemScanner`

