# API Specification: com.github.P2P-Develop:PeyangSuperLibrary 114.191.98.10

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `tokyo.peya.lib.ExceptionUtils`

**Constructors:**
- `public ExceptionUtils()`

**Methods:**
- `public static java.lang.String toString(java.lang.Exception p0)`

---

## public class `tokyo.peya.lib.FieldModifier`

**Constructors:**
- `public FieldModifier()`

**Methods:**
- `public static <T extends java.lang.Object, K extends java.lang.Object> boolean modify(T p0, java.lang.String p1, K p2)`
- `public static <T extends java.lang.Object> void modifyAsGod(java.lang.Class p0, java.lang.String p1, T p2)`

---

## public class `tokyo.peya.lib.FileConfiguration`

**Constructors:**
- `public FileConfiguration(java.io.File p0, java.lang.String p1)`

**Methods:**
- `public <T extends java.lang.Object> T get(java.lang.String p0)`
- `public java.util.Map getConfig()`
- `public java.lang.String getString(java.lang.String p0)`
- `public void loadConfig()`
- `public void reloadConfig()`
- `public void saveDefaultConfig()`

---

## public class `tokyo.peya.lib.Intellij`

**Constructors:**
- `public Intellij()`

**Methods:**
- `public static boolean isDebugging()`

---

## public class `tokyo.peya.lib.LearnMath`

**Constructors:**
- `public LearnMath()`

**Methods:**
- `public static double delta(double p0)`
- `public static double elu(double p0)`
- `public static double elu(double p0, double p1)`
- `public static double eluDef(double p0)`
- `public static double eluDef(double p0, double p1)`
- `public static double identity(double p0)`
- `public static double identityDef()`
- `public static double lrelu(double p0)`
- `public static double lrelu(double p0, double p1)`
- `public static double lreluDef(double p0)`
- `public static double lreluDef(double p0, double p1)`
- `public static double mish(double p0)`
- `public static double mishDef(double p0)`
- `public static double omega(double p0)`
- `public static double relu(double p0)`
- `public static double reluDef(double p0)`
- `public static double selu(double p0, double p1, double p2)`
- `public static double seluDef(double p0, double p1, double p2)`
- `public static double sigmoid(double p0)`
- `public static double sigmoidDef(double p0)`
- `public static double[] softmax(double[] p0)`
- `public static double[][] softmax(double[][] p0)`
- `public static double softplus(double p0)`
- `public static double softplusDef(double p0)`
- `public static double step(double p0)`
- `public static double swish(double p0)`
- `public static double swishDef(double p0)`
- `public static double tanH(double p0)`
- `public static double tanHDef(double p0)`

---

## public class `tokyo.peya.lib.LeetConverter`

**Constructors:**
- `public LeetConverter()`

**Methods:**
- `public static java.lang.String convert(java.lang.String p0)`

---

## public class `tokyo.peya.lib.LoggerChanger`

**Constructors:**
- `public LoggerChanger()`

**Methods:**
- `public static <T extends java.lang.Object, K extends org.slf4j.Logger> boolean changeToDummy(T p0, java.lang.String p1, K p2)`
- `public static <T extends java.lang.Object> boolean shutUpLog(T p0, java.lang.String p1)`

---

## public class `tokyo.peya.lib.OptGraphGenerator`

**Constructors:**
- `public OptGraphGenerator()`

---

## public class `tokyo.peya.lib.PluginYamlParser`
implements `java.io.Serializable`  

**Constructors:**
- `public PluginYamlParser()`

**Fields:**
- `public java.lang.String api_version`
- `public java.lang.String author`
- `public java.lang.String[] authors`
- `public java.util.HashMap commands`
- `public boolean databases`
- `public tokyo.peya.lib.PluginYamlParser$Permission defaultPermission`
- `public java.lang.String[] depend`
- `public java.lang.String description`
- `public tokyo.peya.lib.PluginYamlParser$Load load`
- `public java.lang.String[] loadbefore`
- `public java.lang.String main`
- `public java.lang.String name`
- `public java.util.HashMap permissions`
- `public java.lang.String prefix`
- `public java.lang.String[] softdepend`
- `public java.lang.String version`
- `public java.lang.String website`

**Methods:**
- `public static tokyo.peya.lib.PluginYamlParser fromJar(java.io.File p0) throws java.io.IOException`
- `public static tokyo.peya.lib.PluginYamlParser fromMap(java.util.Map p0)`
- `public static tokyo.peya.lib.PluginYamlParser fromYaml(java.io.File p0) throws java.io.IOException`

---

## public static class `tokyo.peya.lib.PluginYamlParser$Command`
implements `java.io.Serializable`  

**Constructors:**
- `public Command()`

**Fields:**
- `public java.lang.String[] aliases`
- `public java.lang.String description`
- `public java.lang.String permission`
- `public java.lang.String permissionMessage`
- `public java.lang.String usage`

---

## public final static enum `tokyo.peya.lib.PluginYamlParser$DefaultPermission`
extends `java.lang.Enum`  

**Fields:**
- `public final static tokyo.peya.lib.PluginYamlParser$DefaultPermission FALSE`
- `public final static tokyo.peya.lib.PluginYamlParser$DefaultPermission NOTOP`
- `public final static tokyo.peya.lib.PluginYamlParser$DefaultPermission OP`
- `public final static tokyo.peya.lib.PluginYamlParser$DefaultPermission TRUE`

---

## public final static enum `tokyo.peya.lib.PluginYamlParser$Load`
extends `java.lang.Enum`  

**Fields:**
- `public final static tokyo.peya.lib.PluginYamlParser$Load POSTWORLD`
- `public final static tokyo.peya.lib.PluginYamlParser$Load STARTUP`

---

## public static class `tokyo.peya.lib.PluginYamlParser$Permission`
implements `java.io.Serializable`  

**Constructors:**
- `public Permission()`

**Fields:**
- `public java.util.HashMap children`
- `public tokyo.peya.lib.PluginYamlParser$DefaultPermission defaultPermission`
- `public java.lang.String description`

---

## public class `tokyo.peya.lib.SQLModifier`

**Constructors:**
- `public SQLModifier()`

**Methods:**
- `public static void delete(java.sql.Connection p0, java.lang.String p1, java.util.HashMap p2) throws java.sql.SQLException`
- `public static void exec(java.sql.Connection p0, java.lang.String p1, java.lang.Object... p2) throws java.sql.SQLException`
- `public static void insert(java.sql.Connection p0, java.lang.String p1, java.lang.Object... p2) throws java.sql.SQLException`

---

## public class `tokyo.peya.lib.TimeParser`

**Constructors:**
- `public TimeParser()`

**Methods:**
- `public static java.util.Date convert(java.lang.String... p0)`
- `public static java.lang.String convertFromDate(java.util.Date p0)`

---

## public class `tokyo.peya.lib.WaveCreator`

**Constructors:**
- `public WaveCreator(double p0, double p1, double p2)`

**Methods:**
- `public double get(double p0, boolean p1)`
- `public double getStatic()`

---

## public class `tokyo.peya.lib.bukkit.EntitySelector`

**Constructors:**
- `public EntitySelector()`

**Methods:**
- `public static java.util.List matchEntities(org.bukkit.command.CommandSender p0, java.lang.String p1, boolean p2) throws tokyo.peya.lib.bukkit.exception.SelectorInvalidException, tokyo.peya.lib.bukkit.exception.SelectorMalformedException`
- `public static org.bukkit.entity.Entity matchOneEntity(org.bukkit.command.CommandSender p0, java.lang.String p1) throws tokyo.peya.lib.bukkit.exception.SelectorInvalidException, tokyo.peya.lib.bukkit.exception.SelectorMalformedException`
- `public static void validateSelector(java.lang.String p0, boolean p1) throws tokyo.peya.lib.bukkit.exception.SelectorInvalidException, tokyo.peya.lib.bukkit.exception.SelectorMalformedException`

---

## public class `tokyo.peya.lib.bukkit.ItemUtils`

**Constructors:**
- `public ItemUtils()`

**Methods:**
- `public static org.bukkit.inventory.ItemStack appendDisplayName(org.bukkit.inventory.ItemStack p0, java.lang.String p1)`
- `public static org.bukkit.inventory.ItemStack hideAttribute(org.bukkit.inventory.ItemStack p0)`
- `public static org.bukkit.inventory.ItemStack lore(org.bukkit.inventory.ItemStack p0, java.util.List p1)`
- `public static org.bukkit.inventory.ItemStack quickLore(org.bukkit.inventory.ItemStack p0, java.lang.String p1)`
- `public static org.bukkit.inventory.ItemStack setDisplayName(org.bukkit.inventory.ItemStack p0, java.lang.String p1)`
- `public static org.bukkit.inventory.ItemStack setGlow(org.bukkit.inventory.ItemStack p0)`
- `public static org.bukkit.inventory.ItemStack setUnbreakable(org.bukkit.inventory.ItemStack p0)`

---

## public class `tokyo.peya.lib.bukkit.Say2Functional`
implements `org.bukkit.event.Listener`  

**Constructors:**
- `public Say2Functional(org.bukkit.plugin.Plugin p0)`

**Methods:**
- `public void add(java.util.UUID p0, tokyo.peya.lib.bukkit.Say2Functional$FunctionalEntry p1)`
- `public void onConsole(org.bukkit.event.server.ServerCommandEvent p0)`
- `public void onQuit(org.bukkit.event.player.PlayerQuitEvent p0)`
- `public void onSay(org.bukkit.event.player.AsyncPlayerChatEvent p0)`

---

## public static class `tokyo.peya.lib.bukkit.Say2Functional$FunctionalEntry`

**Constructors:**
- `public FunctionalEntry(java.util.function.BiFunction p0, java.util.function.Consumer p1, java.lang.String... p2)`

**Fields:**
- `public final java.util.function.Consumer func`
- `public final java.lang.String[] keywords`
- `public final java.util.function.BiFunction matchType`

---

## public class `tokyo.peya.lib.bukkit.TitleNotification`

**Constructors:**
- `public TitleNotification(org.bukkit.plugin.Plugin p0)`

**Methods:**
- `public void setMainTitle(org.bukkit.entity.Player p0, java.lang.String p1)`
- `public void setSubTitle(org.bukkit.entity.Player p0, java.lang.String p1)`

---

## public class `tokyo.peya.lib.bukkit.exception.SelectorException`
extends `java.lang.Exception`  

**Constructors:**
- `public SelectorException()`

---

## public class `tokyo.peya.lib.bukkit.exception.SelectorInvalidException`
extends `tokyo.peya.lib.bukkit.exception.SelectorException`  

**Constructors:**
- `public SelectorInvalidException(java.util.Map p0)`

**Methods:**
- `public java.util.Map getInvalidKeys()`

---

## public class `tokyo.peya.lib.bukkit.exception.SelectorMalformedException`
extends `tokyo.peya.lib.bukkit.exception.SelectorException`  

**Constructors:**
- `public SelectorMalformedException()`

---

