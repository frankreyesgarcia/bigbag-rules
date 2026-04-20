# Breaking Changes: org.liquibase:liquibase-core 3.4.2 → 4.8.0
Total: 1992 (binary-breaking: 1607, source-breaking: 1969)

## liquibase.Liquibase

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.Liquibase.generateChangeLog(liquibase.CatalogAndSchema,liquibase.diff.output.changelog.DiffToChangeLog,java.io.PrintStream,java.lang.Class<? extends liquibase.structure.DatabaseObject>[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.Liquibase.generateChangeLog(liquibase.CatalogAndSchema,liquibase.diff.output.changelog.DiffToChangeLog,java.io.PrintStream,liquibase.serializer.ChangeLogSerializer,java.lang.Class<? extends liquibase.structure.DatabaseObject>[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.Liquibase.<init>(java.lang.String,liquibase.resource.ResourceAccessor,liquibase.database.Database)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.Liquibase.dropAll()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.executeRollbackScript(java.lang.String,liquibase.Contexts,liquibase.LabelExpression)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.getFileOpener()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.isIgnoreClasspathPrefix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.removeRunStatus(liquibase.changelog.ChangeLogIterator,liquibase.Contexts,liquibase.LabelExpression)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.Liquibase.setIgnoreClasspathPrefix(boolean)`

## liquibase.RuntimeEnvironment

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.RuntimeEnvironment.<init>(liquibase.database.Database,liquibase.Contexts)`

## liquibase.change.AddColumnConfig

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`
+ NOW THROWS: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`

## liquibase.change.Change

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.change.Change.getDescription()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.describe()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.get(java.lang.String,java.lang.Class<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.has(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getObjectMetaData()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getAttributes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getValuePath(java.lang.String,java.lang.Class)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.set(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.change.Change`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.get(java.lang.String,T)`

## liquibase.change.ChangeFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.ChangeFactory.clear()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.ChangeFactory.getAllChangeNamespaces()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.ChangeFactory.getRegistry()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.ChangeFactory.register(java.lang.Class<? extends liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.ChangeFactory.reset()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.change.ChangeFactory.getDefinedChanges()`
+ NEW RETURN TYPE: `liquibase.change.ChangeFactory.getDefinedChanges()`

## liquibase.change.ColumnConfig

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`
+ NOW THROWS: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`

## liquibase.change.core.AlterSequenceChange

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.core.AlterSequenceChange.getWillCycle()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.core.AlterSequenceChange.setWillCycle(java.lang.Boolean)`

## liquibase.change.core.LoadDataChange

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.change.core.LoadDataChange.getCSVReader()`
+ NOW THROWS: `liquibase.change.core.LoadDataChange.getCSVReader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`
+ NEW RETURN TYPE: `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`
+ NEW RETURN TYPE: `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`

## liquibase.change.core.LoadDataColumnConfig

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`
+ NOW THROWS: `liquibase.change.ColumnConfig.setValueDate(java.lang.String)`

## liquibase.change.core.LoadUpdateDataChange

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.change.core.LoadDataChange.getCSVReader()`
+ NOW THROWS: `liquibase.change.core.LoadDataChange.getCSVReader()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.change.core.LoadUpdateDataChange.setPrimaryKey(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`
+ NEW RETURN TYPE: `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`
+ NEW RETURN TYPE: `liquibase.change.core.LoadDataChange.getColumnConfig(int,java.lang.String)`

## liquibase.change.core.supplier.AddAutoIncrementChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddAutoIncrementChangeSupplier`

## liquibase.change.core.supplier.AddColumnChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddColumnChangeSupplier`

## liquibase.change.core.supplier.AddColumnConfigSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddColumnConfigSupplier`

## liquibase.change.core.supplier.AddDefaultValueChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddDefaultValueChangeSupplier`

## liquibase.change.core.supplier.AddForeignKeyConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddForeignKeyConstraintChangeSupplier`

## liquibase.change.core.supplier.AddLookupTableChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddLookupTableChangeSupplier`

## liquibase.change.core.supplier.AddNotNullConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddNotNullConstraintChangeSupplier`

## liquibase.change.core.supplier.AddPrimaryKeyChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddPrimaryKeyChangeSupplier`

## liquibase.change.core.supplier.AddUniqueConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AddUniqueConstraintChangeSupplier`

## liquibase.change.core.supplier.AlterSequenceChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.AlterSequenceChangeSupplier`

## liquibase.change.core.supplier.CreateIndexChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.CreateIndexChangeSupplier`

## liquibase.change.core.supplier.CreateProcedureChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.CreateProcedureChangeSupplier`

## liquibase.change.core.supplier.CreateSequenceChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.CreateSequenceChangeSupplier`

## liquibase.change.core.supplier.CreateTableChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.CreateTableChangeSupplier`

## liquibase.change.core.supplier.CreateViewChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.CreateViewChangeSupplier`

## liquibase.change.core.supplier.DeleteDataChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DeleteDataChangeSupplier`

## liquibase.change.core.supplier.DropAllForeignKeyConstraintsChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropAllForeignKeyConstraintsChangeSupplier`

## liquibase.change.core.supplier.DropColumnChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropColumnChangeSupplier`

## liquibase.change.core.supplier.DropDefaultValueChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropDefaultValueChangeSupplier`

## liquibase.change.core.supplier.DropForeignKeyConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropForeignKeyConstraintChangeSupplier`

## liquibase.change.core.supplier.DropIndexChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropIndexChangeSupplier`

## liquibase.change.core.supplier.DropNotNullConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropNotNullConstraintChangeSupplier`

## liquibase.change.core.supplier.DropPrimaryKeyChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropPrimaryKeyChangeSupplier`

## liquibase.change.core.supplier.DropProcedureChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropProcedureChangeSupplier`

## liquibase.change.core.supplier.DropSequenceChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropSequenceChangeSupplier`

## liquibase.change.core.supplier.DropTableChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropTableChangeSupplier`

## liquibase.change.core.supplier.DropUniqueConstraintChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropUniqueConstraintChangeSupplier`

## liquibase.change.core.supplier.DropViewChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.DropViewChangeSupplier`

## liquibase.change.core.supplier.EmptyChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.EmptyChangeSupplier`

## liquibase.change.core.supplier.ExecuteShellCommandChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.ExecuteShellCommandChangeSupplier`

## liquibase.change.core.supplier.InsertDataChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.InsertDataChangeSupplier`

## liquibase.change.core.supplier.LoadDataChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.LoadDataChangeSupplier`

## liquibase.change.core.supplier.LoadUpdateDataChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.LoadUpdateDataChangeSupplier`

## liquibase.change.core.supplier.MergeColumnChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.MergeColumnChangeSupplier`

## liquibase.change.core.supplier.ModifyDataTypeChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.ModifyDataTypeChangeSupplier`

## liquibase.change.core.supplier.RawSQLChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.RawSQLChangeSupplier`

## liquibase.change.core.supplier.RenameColumnChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.RenameColumnChangeSupplier`

## liquibase.change.core.supplier.RenameSequenceChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.RenameSequenceChangeSupplier`

## liquibase.change.core.supplier.RenameTableChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.RenameTableChangeSupplier`

## liquibase.change.core.supplier.RenameViewChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.RenameViewChangeSupplier`

## liquibase.change.core.supplier.SQLFileChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.SQLFileChangeSupplier`

## liquibase.change.core.supplier.StopChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.StopChangeSupplier`

## liquibase.change.core.supplier.TagDatabaseChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.TagDatabaseChangeSupplier`

## liquibase.change.core.supplier.UpdateDataChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.core.supplier.UpdateDataChangeSupplier`

## liquibase.change.custom.CustomChangeWrapper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.custom.CustomChangeWrapper.getClassLoader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.change.custom.CustomChangeWrapper.setClassLoader(java.lang.ClassLoader)`

## liquibase.change.custom.supplier.CustomChangeWrapperSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.change.custom.supplier.CustomChangeWrapperSupplier`

## liquibase.changelog.ChangeLogHistoryService

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.changelog.ChangeLogHistoryService`
+ MUST NOW IMPLEMENT: `liquibase.changelog.ChangeLogHistoryService.resetDeploymentId()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.changelog.ChangeLogHistoryService`
+ MUST NOW IMPLEMENT: `liquibase.changelog.ChangeLogHistoryService.getDeploymentId()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.changelog.ChangeLogHistoryService`
+ MUST NOW IMPLEMENT: `liquibase.changelog.ChangeLogHistoryService.generateDeploymentId()`

## liquibase.changelog.DatabaseChangeLog

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `liquibase.changelog.DatabaseChangeLog.normalizePath(java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.changelog.DatabaseChangeLog.createChangeSet(liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `liquibase.changelog.DatabaseChangeLog.normalizePath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.DatabaseChangeLog.ignoreClasspathPrefix()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.DatabaseChangeLog.include(java.lang.String,boolean,liquibase.resource.ResourceAccessor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.DatabaseChangeLog.includeAll(java.lang.String,boolean,liquibase.changelog.IncludeAllFilter,boolean,java.util.Comparator<java.lang.String>,liquibase.resource.ResourceAccessor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.DatabaseChangeLog.setIgnoreClasspathPrefix(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.DatabaseChangeLog.validate(liquibase.database.Database,liquibase.Contexts)`

## liquibase.changelog.RanChangeSet

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.changelog.RanChangeSet.<init>(java.lang.String,java.lang.String,java.lang.String,liquibase.change.CheckSum,java.util.Date,java.lang.String,liquibase.changelog.ChangeSet$ExecType,java.lang.String,java.lang.String,liquibase.ContextExpression,liquibase.Labels)`

## liquibase.changelog.StandardChangeLogHistoryService

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.changelog.StandardChangeLogHistoryService.canCreateChangeLogTable()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.changelog.StandardChangeLogHistoryService.hasDatabaseChangeLogTable()`

## liquibase.changelog.filter.ActuallyExecutedChangeSetFilter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.changelog.filter.ActuallyExecutedChangeSetFilter.<init>(java.util.List<liquibase.changelog.RanChangeSet>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.filter.RanChangeSetFilter.normalizePath(java.lang.String)`

## liquibase.changelog.filter.AlreadyRanChangeSetFilter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.changelog.filter.AlreadyRanChangeSetFilter.<init>(java.util.List<liquibase.changelog.RanChangeSet>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.filter.RanChangeSetFilter.normalizePath(java.lang.String)`

## liquibase.changelog.filter.RanChangeSetFilter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.changelog.filter.RanChangeSetFilter.<init>(java.util.List<liquibase.changelog.RanChangeSet>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.filter.RanChangeSetFilter.normalizePath(java.lang.String)`

## liquibase.changelog.filter.ShouldRunChangeSetFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.changelog.filter.ShouldRunChangeSetFilter.normalizePath(java.lang.String)`

## liquibase.changelog.visitor.ChangeExecListener

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.changelog.visitor.ChangeExecListener`
+ MUST NOW IMPLEMENT: `liquibase.changelog.visitor.ChangeExecListener.willRollback(liquibase.changelog.ChangeSet,liquibase.changelog.DatabaseChangeLog,liquibase.database.Database)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.changelog.visitor.ChangeExecListener`
+ MUST NOW IMPLEMENT: `liquibase.changelog.visitor.ChangeExecListener.rollbackFailed(liquibase.changelog.ChangeSet,liquibase.changelog.DatabaseChangeLog,liquibase.database.Database,java.lang.Exception)`

## liquibase.changelog.visitor.ValidatingVisitor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.changelog.visitor.ValidatingVisitor.getInvalidMD5Sums()`
+ NEW RETURN TYPE: `liquibase.changelog.visitor.ValidatingVisitor.getInvalidMD5Sums()`

## liquibase.command.AbstractCommand

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.command.AbstractCommand.execute()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.command.AbstractCommand.run()`
+ NEW RETURN TYPE: `liquibase.command.LiquibaseCommand.run()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.command.AbstractCommand.run()`
+ NEW RETURN TYPE: `liquibase.command.LiquibaseCommand.run()`

## liquibase.command.DiffCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.command.DiffCommand`

## liquibase.command.DiffToChangeLogCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.command.DiffToChangeLogCommand`

## liquibase.command.ExecuteSqlCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.command.ExecuteSqlCommand`

## liquibase.command.GenerateChangeLogCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.command.GenerateChangeLogCommand`

## liquibase.command.LiquibaseCommand

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.command.LiquibaseCommand.execute()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.command.LiquibaseCommand`
+ MUST NOW IMPLEMENT: `liquibase.command.LiquibaseCommand.getArguments()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.command.LiquibaseCommand`
+ MUST NOW IMPLEMENT: `liquibase.command.LiquibaseCommand.getPriority(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.command.LiquibaseCommand`
+ MUST NOW IMPLEMENT: `liquibase.command.LiquibaseCommand.run()`

## liquibase.command.SnapshotCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.command.SnapshotCommand`

## liquibase.configuration.AbstractConfigurationContainer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.init(liquibase.configuration.ConfigurationValueProvider[])`

## liquibase.configuration.AbstractConfigurationContainer$ConfigurationContainer

### CLASS_NO_LONGER_STATIC [binary ✗ | source ✗]
- CLASS (no longer static): `liquibase.configuration.AbstractConfigurationContainer$ConfigurationContainer`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.configuration.AbstractConfigurationContainer$ConfigurationContainer.<init>(java.lang.String)`

## liquibase.configuration.ConfigurationContainer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.ConfigurationContainer.init(liquibase.configuration.ConfigurationValueProvider[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.configuration.ConfigurationContainer`
+ MUST NOW IMPLEMENT: `liquibase.configuration.ConfigurationContainer.getNamespace()`

## liquibase.configuration.ConfigurationProperty

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.configuration.ConfigurationProperty.<init>(java.lang.String,java.lang.String,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.ConfigurationProperty.init(liquibase.configuration.ConfigurationValueProvider[])`

## liquibase.configuration.ConfigurationValueProvider

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.ConfigurationValueProvider.describeValueLookupLogic(liquibase.configuration.ConfigurationProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.ConfigurationValueProvider.getValue(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.configuration.ConfigurationValueProvider`
+ MUST NOW IMPLEMENT: `liquibase.configuration.ConfigurationValueProvider.validate(liquibase.command.CommandScope)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.configuration.ConfigurationValueProvider`
+ MUST NOW IMPLEMENT: `liquibase.configuration.ConfigurationValueProvider.getProvidedValue(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.configuration.ConfigurationValueProvider`
+ MUST NOW IMPLEMENT: `liquibase.configuration.ConfigurationValueProvider.getPrecedence()`

## liquibase.configuration.GlobalConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.init(liquibase.configuration.ConfigurationValueProvider[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.configuration.GlobalConfiguration`

## liquibase.configuration.LiquibaseConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.createConfiguration(java.lang.Class<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.describeValueLookupLogic(java.lang.Class<? extends liquibase.configuration.ConfigurationContainer>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.describeValueLookupLogic(liquibase.configuration.ConfigurationProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.getProperty(java.lang.Class<? extends liquibase.configuration.ConfigurationContainer>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.init(liquibase.configuration.ConfigurationValueProvider[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.reset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.LiquibaseConfiguration.setInstance(liquibase.configuration.LiquibaseConfiguration)`

## liquibase.configuration.SystemPropertyProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.configuration.SystemPropertyProvider`

## liquibase.database.AbstractJdbcDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.Database

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.Database.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.supportsBatchUpdates()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getSchemaAndCatalogCase()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getDefaultScaleForNativeDataType(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getDefaultFractionalDigitsForTimestamp()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.requiresExplicitNullForColumns()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger,java.lang.String,java.lang.Boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.supportsNotNullConstraintNames()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getMaxFractionalDigitsForTimestamp()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.validate()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.Database`
+ MUST NOW IMPLEMENT: `liquibase.database.Database.getFetchSize()`

## liquibase.database.DatabaseConnection

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.DatabaseConnection`
+ MUST NOW IMPLEMENT: `liquibase.database.DatabaseConnection.open(java.lang.String,java.sql.Driver,java.util.Properties)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.database.DatabaseConnection`
+ MUST NOW IMPLEMENT: `liquibase.servicelocator.PrioritizedService.getPriority()`

## liquibase.database.OfflineConnection

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.OfflineConnection.getSnapshot()`

## liquibase.database.core.DB2Database

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.core.DB2Database.isZOS()`

## liquibase.database.core.DerbyDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.FirebirdDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.H2Database

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.HsqlDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.InformixDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.core.InformixDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.MSSQLDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.MariaDBDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.core.MariaDBDatabase.PRODUCT_NAME`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.MySQLDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.core.MySQLDatabase.PRODUCT_NAME`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.OracleDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.PostgresDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.SQLiteDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.SybaseASADatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.SybaseDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.UnsupportedDatabase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndCharacter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingEndReplacement`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.database.AbstractJdbcDatabase.quotingStartCharacter`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.database.AbstractJdbcDatabase.addReservedWords(java.util.Collection<java.lang.String>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.database.AbstractJdbcDatabase.saveStatements(liquibase.change.Change,java.util.List<liquibase.sql.visitor.SqlVisitor>,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.database.AbstractJdbcDatabase.getAutoIncrementClause(java.math.BigInteger,java.math.BigInteger)`

## liquibase.database.core.supplier.DB2ConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.DB2ConnSupplier`

## liquibase.database.core.supplier.DerbyConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.DerbyConnSupplier`

## liquibase.database.core.supplier.FirebirdConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.FirebirdConnSupplier`

## liquibase.database.core.supplier.H2ConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.H2ConnSupplier`

## liquibase.database.core.supplier.HsqlConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.HsqlConnSupplier`

## liquibase.database.core.supplier.InformixConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.InformixConnSupplier`

## liquibase.database.core.supplier.MSSQLConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.MSSQLConnSupplier`

## liquibase.database.core.supplier.MySQLConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.MySQLConnSupplier`

## liquibase.database.core.supplier.OracleConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.OracleConnSupplier`

## liquibase.database.core.supplier.PostgresqlConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.PostgresqlConnSupplier`

## liquibase.database.core.supplier.SQLiteConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.SQLiteConnSupplier`

## liquibase.database.core.supplier.SybaseASAConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.SybaseASAConnSupplier`

## liquibase.database.core.supplier.SybaseConnSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.database.core.supplier.SybaseConnSupplier`

## liquibase.datatype.DataTypeFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.datatype.DataTypeFactory.register(java.lang.Class<? extends liquibase.datatype.LiquibaseDataType>)`

## liquibase.datatype.LiquibaseDataType

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.datatype.LiquibaseDataType`
+ MUST NOW IMPLEMENT: `liquibase.datatype.LiquibaseDataType.getLoadTypeName()`

## liquibase.datatype.core.DateTimeType

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.datatype.core.DateTimeType.isMinimumVersion(java.lang.String,int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.datatype.core.DateTimeType.supportsFractionalDigits(liquibase.database.Database)`

## liquibase.datatype.core.TimestampType

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.datatype.core.DateTimeType.isMinimumVersion(java.lang.String,int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.datatype.core.DateTimeType.supportsFractionalDigits(liquibase.database.Database)`

## liquibase.dbdoc.AuthorWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.AuthorWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

## liquibase.dbdoc.ColumnWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.ColumnWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

## liquibase.dbdoc.HTMLWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.dbdoc.HTMLWriter`
+ MUST NOW IMPLEMENT: `liquibase.dbdoc.HTMLWriter.writeCustomHTML(java.io.Writer,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

## liquibase.dbdoc.PendingChangesWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.PendingChangesWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.PendingChangesWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

## liquibase.dbdoc.PendingSQLWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.PendingSQLWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.PendingSQLWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

## liquibase.dbdoc.RecentChangesWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.RecentChangesWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.RecentChangesWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

## liquibase.dbdoc.TableWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeBody(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeChanges(java.lang.String,java.io.FileWriter,java.util.List<liquibase.change.Change>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.HTMLWriter.writeTable(java.lang.String,java.util.List<java.util.List<java.lang.String>>,java.io.FileWriter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.dbdoc.TableWriter.writeCustomHTML(java.io.FileWriter,java.lang.Object,java.util.List<liquibase.change.Change>,liquibase.database.Database)`

## liquibase.diff.DiffResult

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.DiffResult.getChangedObject(liquibase.structure.DatabaseObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.DiffResult.getMissingObject(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.DiffResult.getUnexpectedObject(T)`

## liquibase.diff.ObjectDifferences$StandardCompareFunction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.diff.ObjectDifferences$StandardCompareFunction.<init>(liquibase.database.Database)`

## liquibase.diff.compare.DatabaseObjectComparatorChain

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.diff.compare.DatabaseObjectComparatorChain.<init>(java.util.List<liquibase.diff.compare.DatabaseObjectComparator>)`

## liquibase.diff.compare.DatabaseObjectComparatorFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.compare.DatabaseObjectComparatorFactory.hash(liquibase.structure.DatabaseObject,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.compare.DatabaseObjectComparatorFactory.isSameObject(liquibase.structure.DatabaseObject,liquibase.structure.DatabaseObject,liquibase.database.Database)`

## liquibase.diff.output.DiffOutputControl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.diff.output.DiffOutputControl.<init>(boolean,boolean,boolean)`

## liquibase.diff.output.ObjectChangeFilter

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.ObjectChangeFilter`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.ObjectChangeFilter.include(liquibase.structure.DatabaseObject)`

## liquibase.diff.output.StandardObjectChangeFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.output.StandardObjectChangeFilter.include(liquibase.structure.DatabaseObject,liquibase.database.Database,liquibase.database.Database)`

## liquibase.diff.output.StandardObjectChangeFilter$Filter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.diff.output.StandardObjectChangeFilter$Filter.<init>(java.lang.Class<liquibase.structure.DatabaseObject>,java.util.regex.Pattern,liquibase.diff.output.StandardObjectChangeFilter$FilterType)`

## liquibase.diff.output.changelog.ChangeGenerator

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.ChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.ChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixOutputAsSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

## liquibase.diff.output.changelog.ChangedObjectChangeGenerator

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.ChangedObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.ChangedObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixOutputAsSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

## liquibase.diff.output.changelog.DiffToChangeLog

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.diff.output.changelog.DiffToChangeLog.generateId()`

## liquibase.diff.output.changelog.MissingObjectChangeGenerator

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.MissingObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.MissingObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixOutputAsSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

## liquibase.diff.output.changelog.UnexpectedObjectChangeGenerator

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.UnexpectedObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixOutputAsSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.diff.output.changelog.UnexpectedObjectChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.diff.output.changelog.ChangeGenerator.fixSchema(liquibase.change.Change[],liquibase.diff.compare.CompareControl$SchemaComparison[])`

## liquibase.exception.ValidationErrors

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.exception.ValidationErrors.checkDisallowedField(java.lang.String,java.lang.Object,liquibase.database.Database,java.lang.Class<? extends liquibase.database.Database>[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.exception.ValidationErrors.checkRequiredField(java.lang.String,java.lang.Object)`
+ NEW RETURN TYPE: `liquibase.exception.ValidationErrors.checkRequiredField(java.lang.String,java.lang.Object)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.exception.ValidationErrors.checkRequiredField(java.lang.String,java.lang.Object)`
+ NEW RETURN TYPE: `liquibase.exception.ValidationErrors.checkRequiredField(java.lang.String,java.lang.Object)`

## liquibase.exception.ValidationFailedException

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.exception.ValidationFailedException.getInvalidMD5Sums()`
+ NEW RETURN TYPE: `liquibase.exception.ValidationFailedException.getInvalidMD5Sums()`

## liquibase.executor.AbstractExecutor

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.AbstractExecutor`
+ MUST NOW IMPLEMENT: `liquibase.executor.AbstractExecutor.getPriority()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.AbstractExecutor`
+ MUST NOW IMPLEMENT: `liquibase.executor.AbstractExecutor.getName()`

## liquibase.executor.Executor

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.Executor`
+ MUST NOW IMPLEMENT: `liquibase.executor.Executor.modifyChangeSet(liquibase.changelog.ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.Executor`
+ MUST NOW IMPLEMENT: `liquibase.executor.Executor.getPriority()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.Executor`
+ MUST NOW IMPLEMENT: `liquibase.executor.Executor.validate(liquibase.changelog.ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.Executor`
+ MUST NOW IMPLEMENT: `liquibase.executor.Executor.getName()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.executor.Executor`
+ MUST NOW IMPLEMENT: `liquibase.executor.Executor.setResourceAccessor(liquibase.resource.ResourceAccessor)`

## liquibase.executor.ExecutorService

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.executor.ExecutorService.getInstance()`

## liquibase.integration.ant.AbstractChangeLogBasedTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.AbstractDatabaseDiffTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getDataDir()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferencePassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setDataDir(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferencePassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUsername(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.AntResourceAccessor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.integration.ant.AntResourceAccessor.<init>(org.apache.tools.ant.Project,org.apache.tools.ant.types.Path)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.CompositeResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.CompositeResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.integration.ant.AntResourceAccessor`

## liquibase.integration.ant.BaseLiquibaseTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty`

## liquibase.integration.ant.BaseLiquibaseTask$LogRedirector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.ant.BaseLiquibaseTask$LogRedirector`

## liquibase.integration.ant.ChangeLogSyncTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DBDocTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DatabaseRollbackFutureTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DatabaseRollbackTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DatabaseUpdateTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DatabaseUpdateTestingRollbackTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DiffDatabaseTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getDataDir()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferencePassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setDataDir(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferencePassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUsername(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.DiffDatabaseToChangeLogTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getDataDir()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferencePassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.getReferenceUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setDataDir(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferencePassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.AbstractDatabaseDiffTask.setReferenceUsername(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.DiffDatabaseToChangeLogTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

## liquibase.integration.ant.DropAllTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.GenerateChangeLogTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.GenerateChangeLogTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

## liquibase.integration.ant.MarkNextChangeSetRanTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.TagDatabaseTask

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.addConfiguredChangeLogProperty(liquibase.integration.ant.BaseLiquibaseTask$ChangeLogProperty)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.closeDatabase(liquibase.Liquibase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseFromType(liquibase.integration.ant.type.DatabaseType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createDatabaseObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createLiquibase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createOutputWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.createPrintStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getContexts()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getCurrentDateTimeFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogLockTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogObjectsTablespace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseChangeLogTableName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDatabaseClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultCatalogName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDefaultSchemaName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getDriver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getOutputFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUrl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.getUsername()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultCatalog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.isOutputDefaultSchema()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setChangeLogFile(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setContexts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setCurrentDateTimeFunction(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogLockTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogObjectsTablespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseChangeLogTableName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDatabaseClass(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultCatalogName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDefaultSchemaName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setDriver(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultCatalog(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputDefaultSchema(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputEncoding(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setOutputFile(org.apache.tools.ant.types.resources.FileResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUrl(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.BaseLiquibaseTask.setUsername(java.lang.String)`

## liquibase.integration.ant.logging.AntTaskLogFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.ant.logging.AntTaskLogFactory`

## liquibase.integration.ant.logging.AntTaskLogger

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.ant.logging.AntTaskLogger`

## liquibase.integration.ant.type.DatabaseType

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.type.DatabaseType.createDatabase()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.ant.type.DatabaseType.createDatabase(java.lang.ClassLoader)`

## liquibase.integration.commandline.CommandLineResourceAccessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.commandline.CommandLineResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.addRootPath(java.net.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getContents(java.io.File,boolean,boolean,boolean,java.lang.String,java.util.Set<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getRootPaths()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.isCaseSensitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ClassLoaderResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.integration.commandline.CommandLineResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.integration.commandline.CommandLineResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.integration.commandline.CommandLineResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.integration.commandline.CommandLineResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

## liquibase.integration.commandline.CommandLineUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.commandline.CommandLineUtils.doDiffToChangeLog(java.lang.String,liquibase.database.Database,liquibase.database.Database,liquibase.diff.output.DiffOutputControl,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.commandline.CommandLineUtils.doDiffToChangeLog(java.lang.String,liquibase.database.Database,liquibase.database.Database,liquibase.diff.output.DiffOutputControl,java.lang.String,liquibase.diff.compare.CompareControl$SchemaComparison[])`

## liquibase.integration.commandline.Main

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.integration.commandline.Main.strict`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.integration.commandline.Main.run(java.lang.String[])`
+ NOW THROWS: `liquibase.integration.commandline.Main.run(java.lang.String[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.integration.commandline.Main.main(java.lang.String[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.integration.commandline.Main.main(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.integration.commandline.Main.printWarning(java.util.List<java.lang.String>,java.io.PrintStream)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.integration.commandline.Main.configureClassLoader()`
+ NEW RETURN TYPE: `liquibase.integration.commandline.Main.configureClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.integration.commandline.Main.run(java.lang.String[])`
+ NEW RETURN TYPE: `liquibase.integration.commandline.Main.run(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.integration.commandline.Main.configureClassLoader()`
+ NEW RETURN TYPE: `liquibase.integration.commandline.Main.configureClassLoader()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.integration.commandline.Main.run(java.lang.String[])`
+ NEW RETURN TYPE: `liquibase.integration.commandline.Main.run(java.lang.String[])`

## liquibase.integration.servlet.LiquibaseServletListener$ServletValueContainer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.servlet.LiquibaseServletListener$ServletValueContainer`

## liquibase.integration.spring.SpringLiquibase

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.integration.spring.SpringLiquibase.createResourceOpener()`
+ NEW RETURN TYPE: `liquibase.integration.spring.SpringLiquibase.createResourceOpener()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.integration.spring.SpringLiquibase.createResourceOpener()`
+ NEW RETURN TYPE: `liquibase.integration.spring.SpringLiquibase.createResourceOpener()`

## liquibase.integration.spring.SpringLiquibase$SpringResourceOpener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.integration.spring.SpringLiquibase$SpringResourceOpener`

## liquibase.lockservice.LockServiceImpl

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.lockservice.StandardLockService.isDatabaseChangeLogLockTableInitialized(boolean)`

## liquibase.lockservice.StandardLockService

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.lockservice.StandardLockService.isDatabaseChangeLogLockTableInitialized(boolean)`

## liquibase.logging.LogFactory

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `liquibase.logging.LogFactory`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `liquibase.logging.LogFactory`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.logging.LogFactory.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.logging.LogFactory.getInstance()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.logging.LogFactory.getLogger()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.logging.LogFactory.getLogger(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.getLog()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.getLog(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.reset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.setDefaultLoggingLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.setDefaultLoggingLevel(liquibase.logging.LogLevel)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.setInstance(liquibase.logging.LogFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.LogFactory.setLoggingLevel(java.lang.String)`

## liquibase.logging.LogLevel

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.logging.LogLevel`

## liquibase.logging.Logger

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.COMPARATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.PRIORITY_DATABASE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.PRIORITY_DEFAULT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setChangeLog(liquibase.changelog.DatabaseChangeLog)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setChangeSet(liquibase.changelog.ChangeSet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setLogLevel(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setLogLevel(liquibase.logging.LogLevel)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.servicelocator.PrioritizedService.getPriority()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.set(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.fine(java.lang.String,java.lang.Throwable)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getValuePath(java.lang.String,java.lang.Class)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.get(java.lang.String,T)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.log(java.util.logging.Level,java.lang.String,java.lang.Throwable)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.describe()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.get(java.lang.String,java.lang.Class<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.config(java.lang.String,java.lang.Throwable)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getObjectMetaData()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.config(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.fine(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.getAttributes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.Logger`
+ MUST NOW IMPLEMENT: `liquibase.ExtensibleObject.has(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.logging.Logger`

## liquibase.logging.core.AbstractLogger

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.logging.core.AbstractLogger.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.COMPARATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.PRIORITY_DATABASE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.servicelocator.PrioritizedService.PRIORITY_DEFAULT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setLogLevel(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.Logger.setName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.buildMessage(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.setChangeLog(liquibase.changelog.DatabaseChangeLog)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.setChangeSet(liquibase.changelog.ChangeSet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.setLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.setLogLevel(liquibase.logging.LogLevel)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.AbstractLogger.toLogLevel(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.servicelocator.PrioritizedService.getPriority()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.logging.core.AbstractLogger`
+ MUST NOW IMPLEMENT: `liquibase.logging.Logger.log(java.util.logging.Level,java.lang.String,java.lang.Throwable)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.logging.core.AbstractLogger`

## liquibase.logging.core.DefaultLogger

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.logging.core.DefaultLogger`

## liquibase.logging.core.DefaultLoggerConfiguration

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `liquibase.logging.core.DefaultLoggerConfiguration.LOG_LEVEL`
+ NEW FIELD: `liquibase.logging.core.DefaultLoggerConfiguration.LOG_LEVEL`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getProperties()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getProperty(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getValue(java.lang.String,java.lang.Class<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.init(liquibase.configuration.ConfigurationValueProvider[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.setValue(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.DefaultLoggerConfiguration.getLogLevel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.logging.core.DefaultLoggerConfiguration.setLogLevel(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.logging.core.DefaultLoggerConfiguration`

## liquibase.parser.ChangeLogParserCofiguration

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `liquibase.parser.ChangeLogParserCofiguration.SUPPORT_PROPERTY_ESCAPING`
+ NEW FIELD: `liquibase.parser.ChangeLogParserConfiguration.SUPPORT_PROPERTY_ESCAPING`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getProperties()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getProperty(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.getValue(java.lang.String,java.lang.Class<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.init(liquibase.configuration.ConfigurationValueProvider[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.configuration.AbstractConfigurationContainer.setValue(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.parser.ChangeLogParserCofiguration.getSupportPropertyEscaping()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.parser.ChangeLogParserCofiguration.setSupportPropertyEscaping(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.parser.ChangeLogParserCofiguration`

## liquibase.parser.core.xml.LiquibaseEntityResolver

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.parser.core.xml.LiquibaseEntityResolver.<init>(liquibase.parser.LiquibaseParser)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.parser.core.xml.LiquibaseEntityResolver.<init>(liquibase.serializer.LiquibaseSerializer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.parser.core.xml.LiquibaseEntityResolver.useResoureAccessor(liquibase.resource.ResourceAccessor,java.lang.String)`

## liquibase.precondition.AbstractPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.precondition.AbstractPrecondition`
+ MUST NOW IMPLEMENT: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet,liquibase.changelog.visitor.ChangeExecListener)`

## liquibase.precondition.CustomPreconditionWrapper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.CustomPreconditionWrapper.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.CustomPreconditionWrapper.getClassLoader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.CustomPreconditionWrapper.setClassLoader(java.lang.ClassLoader)`

## liquibase.precondition.Precondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.precondition.Precondition`
+ MUST NOW IMPLEMENT: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet,liquibase.changelog.visitor.ChangeExecListener)`

## liquibase.precondition.PreconditionFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.PreconditionFactory.register(java.lang.Class<? extends liquibase.precondition.Precondition>)`

## liquibase.precondition.PreconditionLogic

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.precondition.PreconditionLogic`
+ MUST NOW IMPLEMENT: `liquibase.precondition.Precondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet,liquibase.changelog.visitor.ChangeExecListener)`

## liquibase.precondition.core.AndPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.AndPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ChangeLogPropertyDefinedPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ChangeLogPropertyDefinedPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ChangeSetExecutedPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ChangeSetExecutedPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ColumnExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ColumnExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.DBMSPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.DBMSPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ForeignKeyExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ForeignKeyExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.IndexExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.IndexExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.NotPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.NotPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ObjectQuotingStrategyPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ObjectQuotingStrategyPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.OrPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.OrPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.PreconditionContainer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.PreconditionContainer.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.PrimaryKeyExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.PrimaryKeyExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.RowCountPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.RowCountPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.RunningAsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.RunningAsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.SequenceExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.SequenceExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.SqlPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.SqlPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.TableExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.TableExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.TableIsEmptyPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.RowCountPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.precondition.core.ViewExistsPrecondition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.precondition.core.ViewExistsPrecondition.check(liquibase.database.Database,liquibase.changelog.DatabaseChangeLog,liquibase.changelog.ChangeSet)`

## liquibase.resource.AbstractResourceAccessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.addRootPath(java.net.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getContents(java.io.File,boolean,boolean,boolean,java.lang.String,java.util.Set<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getRootPaths()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.init()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.isCaseSensitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.resource.AbstractResourceAccessor`
+ MUST NOW IMPLEMENT: `liquibase.resource.ResourceAccessor.openStreams(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.resource.AbstractResourceAccessor`
+ MUST NOW IMPLEMENT: `liquibase.resource.ResourceAccessor.describeLocations()`

## liquibase.resource.ClassLoaderResourceAccessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.addRootPath(java.net.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getContents(java.io.File,boolean,boolean,boolean,java.lang.String,java.util.Set<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getRootPaths()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.isCaseSensitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ClassLoaderResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ClassLoaderResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.ClassLoaderResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ClassLoaderResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.ClassLoaderResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ClassLoaderResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

## liquibase.resource.CompositeResourceAccessor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.resource.CompositeResourceAccessor.<init>(java.util.List<liquibase.resource.ResourceAccessor>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.CompositeResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.CompositeResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.CompositeResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

## liquibase.resource.FileSystemResourceAccessor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.resource.FileSystemResourceAccessor.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.addRootPath(java.net.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.convertToPath(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.getContents(java.io.File,boolean,boolean,boolean,java.lang.String,java.util.Set<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.init()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.AbstractResourceAccessor.isCaseSensitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.FileSystemResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.FileSystemResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.AbstractResourceAccessor.getRootPaths()`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.getRootPaths()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.AbstractResourceAccessor.getRootPaths()`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.getRootPaths()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.FileSystemResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

## liquibase.resource.ResourceAccessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.resource.ResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.resource.ResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.resource.ResourceAccessor`
+ MUST NOW IMPLEMENT: `liquibase.resource.ResourceAccessor.openStreams(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.resource.ResourceAccessor`
+ MUST NOW IMPLEMENT: `liquibase.resource.ResourceAccessor.describeLocations()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.resource.ResourceAccessor`
+ MUST NOW IMPLEMENT: `liquibase.resource.ResourceAccessor.openStream(java.lang.String,java.lang.String)`

## liquibase.resource.UtfBomAwareReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.resource.UtfBomAwareReader`

## liquibase.resource.UtfBomStripperInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.resource.UtfBomStripperInputStream`

## liquibase.sdk.Context

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.Context`

## liquibase.sdk.Main

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.debug(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.divider()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.fatal(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.fatal(java.lang.String,java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.fatal(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.getCommand()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.getPath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.getPath(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.getSdkRoot()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.header(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.init(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.main(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.out(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.Main.printHelp()`

## liquibase.sdk.TemplateService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.TemplateService`

## liquibase.sdk.convert.ConvertCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.convert.ConvertCommand`

## liquibase.sdk.database.MockDatabase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.database.MockDatabase`

## liquibase.sdk.resource.MockResourceAccessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.resource.MockResourceAccessor.getResourcesAsStream(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sdk.resource.MockResourceAccessor.toClassLoader()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.sdk.resource.MockResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.sdk.resource.MockResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.sdk.resource.MockResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`
+ NEW RETURN TYPE: `liquibase.sdk.resource.MockResourceAccessor.list(java.lang.String,java.lang.String,boolean,boolean,boolean)`

## liquibase.sdk.supplier.change.AbstractChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.change.AbstractChangeSupplier`

## liquibase.sdk.supplier.change.ChangeSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.change.ChangeSupplier`

## liquibase.sdk.supplier.change.ChangeSupplierFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.change.ChangeSupplierFactory`

## liquibase.sdk.supplier.database.AllDatabaseTypes

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.AllDatabaseTypes`

## liquibase.sdk.supplier.database.AllDatabases

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.AllDatabases`

## liquibase.sdk.supplier.database.ConnectionConfigurationFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.ConnectionConfigurationFactory`

## liquibase.sdk.supplier.database.ConnectionConfigurationFactory$UnknownDatabaseException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.ConnectionConfigurationFactory$UnknownDatabaseException`

## liquibase.sdk.supplier.database.ConnectionSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.ConnectionSupplier`

## liquibase.sdk.supplier.database.ConnectionSupplier$ConfigTemplate

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.ConnectionSupplier$ConfigTemplate`

## liquibase.sdk.supplier.database.CoreDatabases

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.CoreDatabases`

## liquibase.sdk.supplier.database.DatabaseSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.DatabaseSupplier`

## liquibase.sdk.supplier.database.JDBCDriverClassLoader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.supplier.database.JDBCDriverClassLoader`

## liquibase.sdk.vagrant.VagrantCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.vagrant.VagrantCommand`

## liquibase.sdk.verifytest.OutputFormat

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.OutputFormat`

## liquibase.sdk.verifytest.OutputFormat$ArrayFormat

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.OutputFormat$ArrayFormat`

## liquibase.sdk.verifytest.OutputFormat$CollectionFormat

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.OutputFormat$CollectionFormat`

## liquibase.sdk.verifytest.TestPermutation

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation`

## liquibase.sdk.verifytest.TestPermutation$CannotVerify

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$CannotVerify`

## liquibase.sdk.verifytest.TestPermutation$CannotVerifyException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$CannotVerifyException`

## liquibase.sdk.verifytest.TestPermutation$Cleanup

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$Cleanup`

## liquibase.sdk.verifytest.TestPermutation$Invalid

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$Invalid`

## liquibase.sdk.verifytest.TestPermutation$OkResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$OkResult`

## liquibase.sdk.verifytest.TestPermutation$Setup

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$Setup`

## liquibase.sdk.verifytest.TestPermutation$SetupResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$SetupResult`

## liquibase.sdk.verifytest.TestPermutation$Value

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$Value`

## liquibase.sdk.verifytest.TestPermutation$Verification

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.TestPermutation$Verification`

## liquibase.sdk.verifytest.VerifiedTest

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.VerifiedTest`

## liquibase.sdk.verifytest.VerifiedTestFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.VerifiedTestFactory`

## liquibase.sdk.verifytest.VerifiedTestReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.VerifiedTestReader`

## liquibase.sdk.verifytest.VerifiedTestWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.verifytest.VerifiedTestWriter`

## liquibase.sdk.watch.WatchCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sdk.watch.WatchCommand`

## liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.getProperties(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.getTag(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Tag)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.represent(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.representJavaBean(java.util.Set<org.yaml.snakeyaml.introspector.Property>,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.representJavaBeanProperty(java.lang.Object,org.yaml.snakeyaml.introspector.Property,java.lang.Object,org.yaml.snakeyaml.nodes.Tag)`

## liquibase.serializer.core.yaml.YamlSnapshotSerializer$SnapshotLiquibaseRepresenter

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.getProperties(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.getTag(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Tag)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.represent(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.representJavaBean(java.util.Set<org.yaml.snakeyaml.introspector.Property>,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.serializer.core.yaml.YamlSerializer$LiquibaseRepresenter.representJavaBeanProperty(java.lang.Object,org.yaml.snakeyaml.introspector.Property,java.lang.Object,org.yaml.snakeyaml.nodes.Tag)`

## liquibase.servicelocator.AssignableToPackageScanFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.AssignableToPackageScanFilter`

## liquibase.servicelocator.CompositePackageScanFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.CompositePackageScanFilter`

## liquibase.servicelocator.CustomResolverServiceLocator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.CustomResolverServiceLocator`

## liquibase.servicelocator.DefaultPackageScanClassResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.DefaultPackageScanClassResolver`

## liquibase.servicelocator.PackageScanClassResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.PackageScanClassResolver`

## liquibase.servicelocator.PackageScanFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.PackageScanFilter`

## liquibase.servicelocator.ServiceLocator

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `liquibase.servicelocator.ServiceLocator`

## liquibase.servicelocator.WebSpherePackageScanClassResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.servicelocator.WebSpherePackageScanClassResolver`

## liquibase.snapshot.DatabaseSnapshot

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`
+ NOW THROWS: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`

## liquibase.snapshot.EmptyDatabaseSnapshot

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`
+ NOW THROWS: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`

## liquibase.snapshot.JdbcDatabaseSnapshot

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`
+ NOW THROWS: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.snapshot.JdbcDatabaseSnapshot.getMetaData()`

## liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getIndexInfo(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`
+ NOW THROWS: `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getIndexInfo(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getPrimaryKeys(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getTables(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getUniqueConstraints(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.JdbcDatabaseSnapshot$CachingDatabaseMetaData.getViews(java.lang.String,java.lang.String,java.lang.String)`

## liquibase.snapshot.RestoredDatabaseSnapshot

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`
+ NOW THROWS: `liquibase.snapshot.DatabaseSnapshot.loadObjects(java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,java.util.Map<java.lang.String,liquibase.structure.DatabaseObject>,liquibase.parser.core.ParsedNode,liquibase.resource.ResourceAccessor)`

## liquibase.snapshot.jvm.ColumnSnapshotGenerator

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.snapshot.jvm.ColumnSnapshotGenerator.readDataType(liquibase.snapshot.CachedRow,liquibase.structure.core.Column,liquibase.database.Database)`
+ NOW THROWS: `liquibase.snapshot.jvm.ColumnSnapshotGenerator.readDataType(liquibase.snapshot.CachedRow,liquibase.structure.core.Column,liquibase.database.Database)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.ColumnSnapshotGenerator.addTo(liquibase.structure.DatabaseObject,liquibase.snapshot.DatabaseSnapshot)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.ColumnSnapshotGenerator.readDataType(liquibase.snapshot.CachedRow,liquibase.structure.core.Column,liquibase.database.Database)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.ColumnSnapshotGenerator.readDefaultValue(liquibase.snapshot.CachedRow,liquibase.structure.core.Column,liquibase.database.Database)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.ColumnSnapshotGenerator.readDefaultValue(liquibase.snapshot.CachedRow,liquibase.structure.core.Column,liquibase.database.Database)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.ColumnSnapshotGenerator.snapshotObject(liquibase.structure.DatabaseObject,liquibase.snapshot.DatabaseSnapshot)`

## liquibase.snapshot.jvm.H2ColumnSnapshotGenerator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.snapshot.jvm.H2ColumnSnapshotGenerator`

## liquibase.snapshot.jvm.PrimaryKeySnapshotGenerator

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.PrimaryKeySnapshotGenerator.addTo(liquibase.structure.DatabaseObject,liquibase.snapshot.DatabaseSnapshot)`

## liquibase.snapshot.jvm.UniqueConstraintSnapshotGenerator

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.UniqueConstraintSnapshotGenerator.addTo(liquibase.structure.DatabaseObject,liquibase.snapshot.DatabaseSnapshot)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.snapshot.jvm.UniqueConstraintSnapshotGenerator.snapshotObject(liquibase.structure.DatabaseObject,liquibase.snapshot.DatabaseSnapshot)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.snapshot.jvm.UniqueConstraintSnapshotGenerator.listColumns(liquibase.structure.core.UniqueConstraint,liquibase.database.Database)`

## liquibase.sqlgenerator.SqlGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.SqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.warn(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.SqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.SqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.SqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.supports(T,liquibase.database.Database)`

## liquibase.sqlgenerator.SqlGeneratorChain

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `liquibase.sqlgenerator.SqlGeneratorChain.<init>(java.util.SortedSet<liquibase.sqlgenerator.SqlGenerator>)`

## liquibase.sqlgenerator.core.AbstractSqlGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AbstractSqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AbstractSqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGeneratorDB2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGeneratorHsqlH2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorHsqlH2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorHsqlH2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGeneratorMySQL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddAutoIncrementGeneratorSQLite

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddAutoIncrementGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddColumnGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AddColumnGenerator.addUniqueConstrantStatements(liquibase.statement.core.AddColumnStatement,liquibase.database.Database,java.util.List<liquibase.sql.Sql>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddColumnGeneratorDefaultClauseBeforeNotNull

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AddColumnGenerator.addUniqueConstrantStatements(liquibase.statement.core.AddColumnStatement,liquibase.database.Database,java.util.List<liquibase.sql.Sql>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGeneratorDefaultClauseBeforeNotNull`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGeneratorDefaultClauseBeforeNotNull`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddColumnGeneratorSQLite

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AddColumnGenerator.addUniqueConstrantStatements(liquibase.statement.core.AddColumnStatement,liquibase.database.Database,java.util.List<liquibase.sql.Sql>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddColumnGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorDerby

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorDerby`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorDerby`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorMSSQL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorMySQL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorOracle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorPostgres

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybaseASA

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybaseASA`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybaseASA`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddDefaultValueSQLite

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.AddDefaultValueSQLite`

## liquibase.sqlgenerator.core.AddForeignKeyConstraintGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddForeignKeyConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddForeignKeyConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddPrimaryKeyGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddPrimaryKeyGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddPrimaryKeyGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddPrimaryKeyGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddPrimaryKeyGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddPrimaryKeyGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddUniqueConstraintGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorTDS

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorTDS`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorTDS`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.AlterSequenceGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AlterSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.AlterSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.ClearDatabaseChangeLogTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ClearDatabaseChangeLogTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ClearDatabaseChangeLogTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CommentGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CommentGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CommentGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CopyRowsGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CopyRowsGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CopyRowsGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateDatabaseChangeLogLockTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogLockTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogLockTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGeneratorSybase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateIndexGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateIndexGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateIndexGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateIndexGeneratorPostgres

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateIndexGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateIndexGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateProcedureGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateSequenceGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateTableGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateTableGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateTableGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateViewGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.CreateViewGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateViewGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.CreateViewGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DeleteGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DeleteGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DeleteGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropColumnGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropDefaultValueGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropDefaultValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropDefaultValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropForeignKeyConstraintGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropForeignKeyConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropForeignKeyConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropIndexGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropIndexGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropIndexGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropPrimaryKeyGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropPrimaryKeyGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropPrimaryKeyGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropProcedureGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropSequenceGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropUniqueConstraintGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropUniqueConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropUniqueConstraintGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.DropViewGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.DropViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorDB2

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorDB2`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorFirebird

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorFirebird`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorHsql

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorHsql`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMSSQL

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMSSQL`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMySQL

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMySQL`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorOracle

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorOracle`

## liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorPostgres

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorPostgres`

## liquibase.sqlgenerator.core.GetNextChangeSetSequenceValueGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetNextChangeSetSequenceValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetNextChangeSetSequenceValueGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDB2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDerby

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDerby`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDerby`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorFirebird

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorFirebird`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorFirebird`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorHsql

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorHsql`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorHsql`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorInformix

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorInformix`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorMSSQL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorOracle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorPostgres

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybase`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybaseASA

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybaseASA`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybaseASA`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InitializeDatabaseChangeLogLockTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InitializeDatabaseChangeLogLockTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InitializeDatabaseChangeLogLockTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertDataChangeGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertDataChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertDataChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.InsertGenerator.generateHeader(java.lang.StringBuffer,liquibase.statement.core.InsertStatement,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.InsertGenerator.generateValues(java.lang.StringBuffer,liquibase.statement.core.InsertStatement,liquibase.database.Database)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorDB2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2.getUpdateStatement(liquibase.statement.core.InsertOrUpdateStatement,liquibase.database.Database,java.lang.String,liquibase.sqlgenerator.SqlGeneratorChain)`
+ NOW THROWS: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2.getUpdateStatement(liquibase.statement.core.InsertOrUpdateStatement,liquibase.database.Database,java.lang.String,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorHsql

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorHsql`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorHsql`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMSSQL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMSSQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL.getUpdateStatement(liquibase.statement.core.InsertOrUpdateStatement,liquibase.database.Database,java.lang.String,liquibase.sqlgenerator.SqlGeneratorChain)`
+ NOW THROWS: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL.getUpdateStatement(liquibase.statement.core.InsertOrUpdateStatement,liquibase.database.Database,java.lang.String,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorOracle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorOracle`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertOrUpdateGeneratorPostgres

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertOrUpdateGeneratorPostgres`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.InsertSetGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.InsertSetGenerator.generateHeader(java.lang.StringBuffer,liquibase.statement.core.InsertSetStatement,liquibase.database.Database)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertSetGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.InsertSetGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.LockDatabaseChangeLogGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.LockDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.LockDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.MarkChangeSetRanGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.MarkChangeSetRanGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.MarkChangeSetRanGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.ModifyDataTypeGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ModifyDataTypeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ModifyDataTypeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RawSqlGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RawSqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RawSqlGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.ReindexGeneratorSQLite

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ReindexGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ReindexGeneratorSQLite`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RemoveChangeSetRanStatusGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RemoveChangeSetRanStatusGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RemoveChangeSetRanStatusGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RenameColumnGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameColumnGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RenameSequenceGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameSequenceGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RenameTableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameTableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RenameViewGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RenameViewGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.ReorganizeTableGeneratorDB2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ReorganizeTableGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.ReorganizeTableGeneratorDB2`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.RuntimeGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RuntimeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.RuntimeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogLockGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogLockGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogLockGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.SetColumnRemarksGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetColumnRemarksGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetColumnRemarksGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.SetNullableGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetNullableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetNullableGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.SetTableRemarksGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetTableRemarksGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.SetTableRemarksGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.StoredProcedureGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.StoredProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.StoredProcedureGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.TableRowCountGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.TableRowCountGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.TableRowCountGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.TagDatabaseGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.TagDatabaseGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.TagDatabaseGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.UnlockDatabaseChangeLogGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UnlockDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UnlockDatabaseChangeLogGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.UpdateChangeSetChecksumGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateChangeSetChecksumGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateChangeSetChecksumGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.UpdateDataChangeGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateDataChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateDataChangeGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.sqlgenerator.core.UpdateGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.generateSql(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.SqlGenerator.validate(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.supports(StatementType,liquibase.database.Database)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.sqlgenerator.core.AbstractSqlGenerator.warn(StatementType,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.validate(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.sqlgenerator.core.UpdateGenerator`
+ MUST NOW IMPLEMENT: `liquibase.sqlgenerator.SqlGenerator.generateSql(T,liquibase.database.Database,liquibase.sqlgenerator.SqlGeneratorChain<T>)`

## liquibase.statement.CallableSqlStatement

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.statement.CallableSqlStatement`
+ MUST NOW IMPLEMENT: `liquibase.statement.SqlStatement.continueOnError()`

## liquibase.statement.ExecutablePreparedStatement

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.statement.ExecutablePreparedStatement`
+ MUST NOW IMPLEMENT: `liquibase.statement.SqlStatement.continueOnError()`

## liquibase.statement.ExecutablePreparedStatementBase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.statement.ExecutablePreparedStatementBase.getAbsolutePath(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`
+ NEW RETURN TYPE: `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.statement.ExecutablePreparedStatementBase`
+ MUST NOW IMPLEMENT: `liquibase.statement.SqlStatement.continueOnError()`

## liquibase.statement.InsertExecutablePreparedStatement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.statement.ExecutablePreparedStatementBase.getAbsolutePath(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`
+ NEW RETURN TYPE: `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`

## liquibase.statement.PrimaryKeyConstraint

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.statement.PrimaryKeyConstraint.setTablespace(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.statement.PrimaryKeyConstraint.setTablespace(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.statement.PrimaryKeyConstraint.setTablespace(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.statement.PrimaryKeyConstraint.setTablespace(java.lang.String)`

## liquibase.statement.SqlStatement

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `liquibase.statement.SqlStatement`
+ MUST NOW IMPLEMENT: `liquibase.statement.SqlStatement.continueOnError()`

## liquibase.statement.UpdateExecutablePreparedStatement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.statement.ExecutablePreparedStatementBase.getAbsolutePath(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`
+ NEW RETURN TYPE: `liquibase.statement.ExecutablePreparedStatementBase.getColumns()`

## liquibase.statement.core.AddAutoIncrementStatement

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.statement.core.AddAutoIncrementStatement.<init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.math.BigInteger,java.math.BigInteger)`

## liquibase.statement.core.AlterSequenceStatement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.statement.core.AlterSequenceStatement.getWillCycle()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.statement.core.AlterSequenceStatement.setWillCycle(java.lang.Boolean)`

## liquibase.statement.core.CreateTableStatement

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.statement.core.CreateTableStatement.getNotNullColumns()`
+ NEW RETURN TYPE: `liquibase.statement.core.CreateTableStatement.getNotNullColumns()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.statement.core.CreateTableStatement.getNotNullColumns()`
+ NEW RETURN TYPE: `liquibase.statement.core.CreateTableStatement.getNotNullColumns()`

## liquibase.structure.AbstractDatabaseObject

### FORMAL_TYPE_PARAMETER_REMOVED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER REMOVED: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.structure.DatabaseObject.setName(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.structure.DatabaseObject.setName(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

## liquibase.structure.DatabaseObject

### FORMAL_TYPE_PARAMETER_REMOVED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER REMOVED: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.structure.DatabaseObject.setName(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.structure.DatabaseObject.setName(java.lang.String)`
+ NEW RETURN TYPE: `liquibase.structure.DatabaseObject.setName(java.lang.String)`

## liquibase.structure.DatabaseObjectCollection

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.structure.DatabaseObjectCollection.contains(liquibase.structure.DatabaseObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.structure.DatabaseObjectCollection.get(DatabaseObjectType)`

## liquibase.structure.core.ForeignKey

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `liquibase.structure.core.ForeignKey.addForeignKeyColumn(liquibase.structure.core.Column)`
+ NEW RETURN TYPE: `liquibase.structure.core.ForeignKey.addForeignKeyColumn(liquibase.structure.core.Column)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `liquibase.structure.core.ForeignKey.addForeignKeyColumn(liquibase.structure.core.Column)`
+ NEW RETURN TYPE: `liquibase.structure.core.ForeignKey.addForeignKeyColumn(liquibase.structure.core.Column)`

## liquibase.util.FileUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `liquibase.util.FileUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `liquibase.util.FileUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.FileUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.util.FileUtil.getContents(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `liquibase.util.FileUtil.write(java.lang.String,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.FileUtil.deleteOnExit(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.FileUtil.unzip(java.io.File)`

## liquibase.util.NumberUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.NumberUtils.parseNumber(java.lang.String,java.lang.Class,java.text.NumberFormat)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.NumberUtils.readInteger(java.lang.String)`

## liquibase.util.ObjectUtil

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.util.ObjectUtil.getProperty(java.lang.Object,java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `liquibase.util.ObjectUtil.getProperty(java.lang.Object,java.lang.String)`

## liquibase.util.RegexMatcher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.RegexMatcher`

## liquibase.util.SqlUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `liquibase.util.SqlUtil`

## liquibase.util.StreamUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `liquibase.util.StreamUtil`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.closeQuietly(java.io.Closeable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.closeQuietly(java.io.InputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.closeQuietly(java.io.Reader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.getContentLength(java.io.InputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.getContentLength(java.io.Reader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.getReaderContents(java.io.Reader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.getStreamContents(java.io.InputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.getStreamContents(java.io.InputStream,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.StreamUtil.singleInputStream(java.lang.String,liquibase.resource.ResourceAccessor)`

## liquibase.util.StringUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.StringUtils`

## liquibase.util.StringUtils$StringUtilsFormatter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.StringUtils$StringUtilsFormatter`

## liquibase.util.StringUtils$ToStringFormatter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.StringUtils$ToStringFormatter`

## liquibase.util.SystemUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.SystemUtils`

## liquibase.util.XMLUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `liquibase.util.XMLUtil`

## liquibase.util.beans.BeanIntrospector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.beans.BeanIntrospector`

## liquibase.util.beans.DefaultBeanIntrospector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.beans.DefaultBeanIntrospector`

## liquibase.util.beans.FluentPropertyBeanIntrospector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.beans.FluentPropertyBeanIntrospector`

## liquibase.util.beans.IntrospectionContext

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.beans.IntrospectionContext`

## liquibase.util.beans.PropertyUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.beans.PropertyUtils`

## liquibase.util.csv.CSVReader

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVReader.<init>(java.io.Reader,char)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVReader.<init>(java.io.Reader,char,char,int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVReader.DEFAULT_SKIP_LINES`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.util.csv.opencsv.CSVReader.close()`
+ NOW THROWS: `liquibase.util.csv.CSVReader.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.csv.opencsv.CSVReader.readAll()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.util.csv.CSVReader`

## liquibase.util.csv.CSVWriter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVWriter.<init>(java.io.Writer,char)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVWriter.<init>(java.io.Writer,char,char)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVWriter.<init>(java.io.Writer,char,char,char)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVWriter.<init>(java.io.Writer,char,char,char,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `liquibase.util.csv.CSVWriter.<init>(java.io.Writer,char,char,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.DEFAULT_ESCAPE_CHARACTER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.DEFAULT_LINE_END`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.DEFAULT_QUOTE_CHARACTER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.DEFAULT_SEPARATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.NO_ESCAPE_CHARACTER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.csv.opencsv.CSVWriter.NO_QUOTE_CHARACTER`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `liquibase.util.csv.opencsv.CSVWriter.close()`
+ NOW THROWS: `liquibase.util.csv.CSVWriter.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.csv.CSVWriter.writeAll(java.sql.ResultSet,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.csv.opencsv.CSVWriter.writeAll(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.csv.opencsv.CSVWriter.writeColumnNames(java.sql.ResultSetMetaData)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `liquibase.util.csv.CSVWriter`

## liquibase.util.csv.opencsv.CSVReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.CSVReader`

## liquibase.util.csv.opencsv.CSVWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.CSVWriter`

## liquibase.util.csv.opencsv.bean.ColumnPositionMappingStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.bean.ColumnPositionMappingStrategy`

## liquibase.util.csv.opencsv.bean.CsvToBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.bean.CsvToBean`

## liquibase.util.csv.opencsv.bean.HeaderColumnNameMappingStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.bean.HeaderColumnNameMappingStrategy`

## liquibase.util.csv.opencsv.bean.HeaderColumnNameTranslateMappingStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.bean.HeaderColumnNameTranslateMappingStrategy`

## liquibase.util.csv.opencsv.bean.MappingStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.csv.opencsv.bean.MappingStrategy`

## liquibase.util.file.FilenameUtils

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.file.FilenameUtils.EXTENSION_SEPARATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `liquibase.util.file.FilenameUtils.EXTENSION_SEPARATOR_STR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.equals(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.equals(java.lang.String,java.lang.String,boolean,liquibase.util.file.IOCase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.equalsNormalized(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.equalsNormalizedOnSystem(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.equalsOnSystem(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getBaseName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getExtension(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getFullPathNoEndSeparator(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getPathNoEndSeparator(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getPrefix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.getPrefixLength(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.indexOfExtension(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.indexOfLastSeparator(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.isExtension(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.isExtension(java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.isExtension(java.lang.String,java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.normalizeNoEndSeparator(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.removeExtension(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.separatorsToSystem(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.separatorsToUnix(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.separatorsToWindows(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String,liquibase.util.file.IOCase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `liquibase.util.file.FilenameUtils.wildcardMatchOnSystem(java.lang.String,java.lang.String)`

## liquibase.util.ui.SwingUIFacade

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.ui.SwingUIFacade`

## liquibase.util.ui.UIFacade

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.ui.UIFacade`

## liquibase.util.ui.UIFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `liquibase.util.ui.UIFactory`

