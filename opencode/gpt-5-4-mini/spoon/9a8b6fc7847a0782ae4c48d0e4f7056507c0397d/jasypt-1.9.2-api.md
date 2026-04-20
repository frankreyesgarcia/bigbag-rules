# API Specification: org.jasypt:jasypt 1.9.2

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public final class `org.jasypt.commons.CommonUtils`

**Fields:**
- `public final static java.lang.String STRING_OUTPUT_TYPE_BASE64`
- `public final static java.lang.String STRING_OUTPUT_TYPE_HEXADECIMAL`

**Methods:**
- `public static byte[] appendArrays(byte[] p0, byte[] p1)`
- `public static byte[] fromHexadecimal(java.lang.String p0)`
- `public static java.lang.Boolean getStandardBooleanValue(java.lang.String p0)`
- `public static java.lang.String getStandardStringOutputType(java.lang.String p0)`
- `public static boolean isEmpty(java.lang.String p0)`
- `public static boolean isNotEmpty(java.lang.String p0)`
- `public static int nextRandomInt()`
- `public static java.lang.String[] split(java.lang.String p0)`
- `public static java.lang.String[] split(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String substringAfter(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String substringBefore(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String toHexadecimal(byte[] p0)`
- `public static void validateIsTrue(boolean p0, java.lang.String p1)`
- `public static void validateNotEmpty(java.lang.String p0, java.lang.String p1)`
- `public static void validateNotNull(java.lang.Object p0, java.lang.String p1)`

---

## public abstract interface `org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryDecoder`
implements `org.jasypt.contrib.org.apache.commons.codec_1_3.Decoder`  

**Methods:**
- `public abstract byte[] decode(byte[] p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException`

---

## public abstract interface `org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryEncoder`
implements `org.jasypt.contrib.org.apache.commons.codec_1_3.Encoder`  

**Methods:**
- `public abstract byte[] encode(byte[] p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.EncoderException`

---

## public abstract interface `org.jasypt.contrib.org.apache.commons.codec_1_3.Decoder`

**Methods:**
- `public abstract java.lang.Object decode(java.lang.Object p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException`

---

## public class `org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException`
extends `java.lang.Exception`  

**Constructors:**
- `public DecoderException(java.lang.String p0)`

---

## public abstract interface `org.jasypt.contrib.org.apache.commons.codec_1_3.Encoder`

**Methods:**
- `public abstract java.lang.Object encode(java.lang.Object p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.EncoderException`

---

## public class `org.jasypt.contrib.org.apache.commons.codec_1_3.EncoderException`
extends `java.lang.Exception`  

**Constructors:**
- `public EncoderException(java.lang.String p0)`

---

## public class `org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64`
implements `org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryDecoder`, `org.jasypt.contrib.org.apache.commons.codec_1_3.BinaryEncoder`  

**Constructors:**
- `public Base64()`

**Methods:**
- `public byte[] decode(byte[] p0)`
- `public java.lang.Object decode(java.lang.Object p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException`
- `public static byte[] decodeBase64(byte[] p0)`
- `public byte[] encode(byte[] p0)`
- `public java.lang.Object encode(java.lang.Object p0) throws org.jasypt.contrib.org.apache.commons.codec_1_3.EncoderException`
- `public static byte[] encodeBase64(byte[] p0)`
- `public static byte[] encodeBase64(byte[] p0, boolean p1)`
- `public static byte[] encodeBase64Chunked(byte[] p0)`
- `public static boolean isArrayByteBase64(byte[] p0)`

---

## public abstract interface `org.jasypt.digest.ByteDigester`

**Methods:**
- `public abstract byte[] digest(byte[] p0)`
- `public abstract boolean matches(byte[] p0, byte[] p1)`

---

## public class `org.jasypt.digest.PooledByteDigester`
implements `org.jasypt.digest.ByteDigester`  

**Constructors:**
- `public PooledByteDigester()`

**Methods:**
- `public byte[] digest(byte[] p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public boolean matches(byte[] p0, byte[] p1)`
- `public synchronized void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.digest.config.DigesterConfig p0)`
- `public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean p0)`
- `public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean p0)`
- `public synchronized void setIterations(int p0)`
- `public synchronized void setPoolSize(int p0)`
- `public synchronized void setProvider(java.security.Provider p0)`
- `public synchronized void setProviderName(java.lang.String p0)`
- `public synchronized void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public synchronized void setSaltSizeBytes(int p0)`
- `public synchronized void setUseLenientSaltSizeCheck(boolean p0)`

---

## public class `org.jasypt.digest.PooledStringDigester`
implements `org.jasypt.digest.StringDigester`  

**Constructors:**
- `public PooledStringDigester()`

**Methods:**
- `public java.lang.String digest(java.lang.String p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public boolean matches(java.lang.String p0, java.lang.String p1)`
- `public synchronized void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.digest.config.DigesterConfig p0)`
- `public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean p0)`
- `public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean p0)`
- `public synchronized void setIterations(int p0)`
- `public synchronized void setPoolSize(int p0)`
- `public synchronized void setPrefix(java.lang.String p0)`
- `public synchronized void setProvider(java.security.Provider p0)`
- `public synchronized void setProviderName(java.lang.String p0)`
- `public synchronized void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public synchronized void setSaltSizeBytes(int p0)`
- `public synchronized void setStringOutputType(java.lang.String p0)`
- `public synchronized void setSuffix(java.lang.String p0)`
- `public synchronized void setUnicodeNormalizationIgnored(boolean p0)`
- `public synchronized void setUseLenientSaltSizeCheck(boolean p0)`

---

## public final class `org.jasypt.digest.StandardByteDigester`
implements `org.jasypt.digest.ByteDigester`  

**Constructors:**
- `public StandardByteDigester()`

**Fields:**
- `public final static java.lang.String DEFAULT_ALGORITHM`
- `public final static int DEFAULT_ITERATIONS`
- `public final static int DEFAULT_SALT_SIZE_BYTES`

**Methods:**
- `public byte[] digest(byte[] p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public boolean matches(byte[] p0, byte[] p1)`
- `public synchronized void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.digest.config.DigesterConfig p0)`
- `public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean p0)`
- `public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean p0)`
- `public synchronized void setIterations(int p0)`
- `public synchronized void setProvider(java.security.Provider p0)`
- `public synchronized void setProviderName(java.lang.String p0)`
- `public synchronized void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public synchronized void setSaltSizeBytes(int p0)`
- `public synchronized void setUseLenientSaltSizeCheck(boolean p0)`

---

## public final class `org.jasypt.digest.StandardStringDigester`
implements `org.jasypt.digest.StringDigester`  

**Constructors:**
- `public StandardStringDigester()`

**Fields:**
- `public final static java.lang.String DEFAULT_STRING_OUTPUT_TYPE`
- `public final static boolean DEFAULT_UNICODE_NORMALIZATION_IGNORED`
- `public final static java.lang.String DIGEST_CHARSET`
- `public final static java.lang.String MESSAGE_CHARSET`

**Methods:**
- `public java.lang.String digest(java.lang.String p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public boolean matches(java.lang.String p0, java.lang.String p1)`
- `public void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.digest.config.DigesterConfig p0)`
- `public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean p0)`
- `public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean p0)`
- `public void setIterations(int p0)`
- `public synchronized void setPrefix(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public void setSaltSizeBytes(int p0)`
- `public synchronized void setStringOutputType(java.lang.String p0)`
- `public synchronized void setSuffix(java.lang.String p0)`
- `public synchronized void setUnicodeNormalizationIgnored(boolean p0)`
- `public synchronized void setUseLenientSaltSizeCheck(boolean p0)`

---

## public abstract interface `org.jasypt.digest.StringDigester`

**Methods:**
- `public abstract java.lang.String digest(java.lang.String p0)`
- `public abstract boolean matches(java.lang.String p0, java.lang.String p1)`

---

## public abstract interface `org.jasypt.digest.config.DigesterConfig`

**Methods:**
- `public abstract java.lang.String getAlgorithm()`
- `public abstract java.lang.Boolean getInvertPositionOfPlainSaltInEncryptionResults()`
- `public abstract java.lang.Boolean getInvertPositionOfSaltInMessageBeforeDigesting()`
- `public abstract java.lang.Integer getIterations()`
- `public abstract java.lang.Integer getPoolSize()`
- `public abstract java.security.Provider getProvider()`
- `public abstract java.lang.String getProviderName()`
- `public abstract org.jasypt.salt.SaltGenerator getSaltGenerator()`
- `public abstract java.lang.Integer getSaltSizeBytes()`
- `public abstract java.lang.Boolean getUseLenientSaltSizeCheck()`

---

## public class `org.jasypt.digest.config.EnvironmentDigesterConfig`
extends `org.jasypt.digest.config.SimpleDigesterConfig`  

**Constructors:**
- `public EnvironmentDigesterConfig()`

**Methods:**
- `public java.lang.String getAlgorithmEnvName()`
- `public java.lang.String getAlgorithmSysPropertyName()`
- `public java.lang.String getInvertPositionOfPlainSaltInEncryptionResultsEnvName()`
- `public java.lang.String getInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName()`
- `public java.lang.String getInvertPositionOfSaltInMessageBeforeDigestingEnvName()`
- `public java.lang.String getInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName()`
- `public java.lang.String getIterationsEnvName()`
- `public java.lang.String getIterationsSysPropertyName()`
- `public java.lang.String getPoolSizeEnvName()`
- `public java.lang.String getPoolSizeSysPropertyName()`
- `public java.lang.String getProviderClassNameEnvName()`
- `public java.lang.String getProviderClassNameSysPropertyName()`
- `public java.lang.String getProviderNameEnvName()`
- `public java.lang.String getProviderNameSysPropertyName()`
- `public java.lang.String getSaltGeneratorClassNameEnvName()`
- `public java.lang.String getSaltGeneratorClassNameSysPropertyName()`
- `public java.lang.String getSaltSizeBytesEnvName()`
- `public java.lang.String getSaltSizeBytesSysPropertyName()`
- `public java.lang.String getUseLenientSaltSizeCheckEnvName()`
- `public java.lang.String getUseLenientSaltSizeCheckSysPropertyName()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setAlgorithmEnvName(java.lang.String p0)`
- `public void setAlgorithmSysPropertyName(java.lang.String p0)`
- `public void setInvertPositionOfPlainSaltInEncryptionResults(java.lang.Boolean p0)`
- `public void setInvertPositionOfPlainSaltInEncryptionResultsEnvName(java.lang.String p0)`
- `public void setInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName(java.lang.String p0)`
- `public void setInvertPositionOfSaltInMessageBeforeDigesting(java.lang.Boolean p0)`
- `public void setInvertPositionOfSaltInMessageBeforeDigestingEnvName(java.lang.String p0)`
- `public void setInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName(java.lang.String p0)`
- `public void setIterations(java.lang.Integer p0)`
- `public void setIterations(java.lang.String p0)`
- `public void setIterationsEnvName(java.lang.String p0)`
- `public void setIterationsSysPropertyName(java.lang.String p0)`
- `public void setPoolSize(java.lang.Integer p0)`
- `public void setPoolSize(java.lang.String p0)`
- `public void setPoolSizeEnvName(java.lang.String p0)`
- `public void setPoolSizeSysPropertyName(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderClassName(java.lang.String p0)`
- `public void setProviderClassNameEnvName(java.lang.String p0)`
- `public void setProviderClassNameSysPropertyName(java.lang.String p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setProviderNameEnvName(java.lang.String p0)`
- `public void setProviderNameSysPropertyName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public void setSaltGeneratorClassName(java.lang.String p0)`
- `public void setSaltGeneratorClassNameEnvName(java.lang.String p0)`
- `public void setSaltGeneratorClassNameSysPropertyName(java.lang.String p0)`
- `public void setSaltSizeBytes(java.lang.Integer p0)`
- `public void setSaltSizeBytes(java.lang.String p0)`
- `public void setSaltSizeBytesEnvName(java.lang.String p0)`
- `public void setSaltSizeBytesSysPropertyName(java.lang.String p0)`
- `public void setUseLenientSaltSizeCheck(java.lang.Boolean p0)`
- `public void setUseLenientSaltSizeCheckEnvName(java.lang.String p0)`
- `public void setUseLenientSaltSizeCheckSysPropertyName(java.lang.String p0)`

---

## public class `org.jasypt.digest.config.EnvironmentStringDigesterConfig`
extends `org.jasypt.digest.config.EnvironmentDigesterConfig`  
implements `org.jasypt.digest.config.StringDigesterConfig`  

**Constructors:**
- `public EnvironmentStringDigesterConfig()`

**Methods:**
- `public java.lang.String getPrefix()`
- `public java.lang.String getPrefixEnvName()`
- `public java.lang.String getPrefixSysPropertyName()`
- `public java.lang.String getStringOutputType()`
- `public java.lang.String getStringOutputTypeEnvName()`
- `public java.lang.String getStringOutputTypeSysPropertyName()`
- `public java.lang.String getSuffix()`
- `public java.lang.String getSuffixEnvName()`
- `public java.lang.String getSuffixSysPropertyName()`
- `public java.lang.String getUnicodeNormalizationIgnoredEnvName()`
- `public java.lang.String getUnicodeNormalizationIgnoredSysPropertyName()`
- `public java.lang.Boolean isUnicodeNormalizationIgnored()`
- `public void setPrefix(java.lang.String p0)`
- `public void setPrefixEnvName(java.lang.String p0)`
- `public void setPrefixSysPropertyName(java.lang.String p0)`
- `public void setStringOutputType(java.lang.String p0)`
- `public void setStringOutputTypeEnvName(java.lang.String p0)`
- `public void setStringOutputTypeSysPropertyName(java.lang.String p0)`
- `public void setSuffix(java.lang.String p0)`
- `public void setSuffixEnvName(java.lang.String p0)`
- `public void setSuffixSysPropertyName(java.lang.String p0)`
- `public void setUnicodeNormalizationIgnored(java.lang.Boolean p0)`
- `public void setUnicodeNormalizationIgnored(java.lang.String p0)`
- `public void setUnicodeNormalizationIgnoredEnvName(java.lang.String p0)`
- `public void setUnicodeNormalizationIgnoredSysPropertyName(java.lang.String p0)`

---

## public class `org.jasypt.digest.config.SimpleDigesterConfig`
implements `org.jasypt.digest.config.DigesterConfig`  

**Constructors:**
- `public SimpleDigesterConfig()`

**Methods:**
- `public java.lang.String getAlgorithm()`
- `public java.lang.Boolean getInvertPositionOfPlainSaltInEncryptionResults()`
- `public java.lang.Boolean getInvertPositionOfSaltInMessageBeforeDigesting()`
- `public java.lang.Integer getIterations()`
- `public java.lang.Integer getPoolSize()`
- `public java.security.Provider getProvider()`
- `public java.lang.String getProviderName()`
- `public org.jasypt.salt.SaltGenerator getSaltGenerator()`
- `public java.lang.Integer getSaltSizeBytes()`
- `public java.lang.Boolean getUseLenientSaltSizeCheck()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setInvertPositionOfPlainSaltInEncryptionResults(java.lang.Boolean p0)`
- `public void setInvertPositionOfSaltInMessageBeforeDigesting(java.lang.Boolean p0)`
- `public void setIterations(java.lang.Integer p0)`
- `public void setIterations(java.lang.String p0)`
- `public void setPoolSize(java.lang.Integer p0)`
- `public void setPoolSize(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderClassName(java.lang.String p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public void setSaltGeneratorClassName(java.lang.String p0)`
- `public void setSaltSizeBytes(java.lang.Integer p0)`
- `public void setSaltSizeBytes(java.lang.String p0)`
- `public void setUseLenientSaltSizeCheck(java.lang.Boolean p0)`

---

## public class `org.jasypt.digest.config.SimpleStringDigesterConfig`
extends `org.jasypt.digest.config.SimpleDigesterConfig`  
implements `org.jasypt.digest.config.StringDigesterConfig`  

**Constructors:**
- `public SimpleStringDigesterConfig()`

**Methods:**
- `public java.lang.String getPrefix()`
- `public java.lang.String getStringOutputType()`
- `public java.lang.String getSuffix()`
- `public java.lang.Boolean isUnicodeNormalizationIgnored()`
- `public void setPrefix(java.lang.String p0)`
- `public void setStringOutputType(java.lang.String p0)`
- `public void setSuffix(java.lang.String p0)`
- `public void setUnicodeNormalizationIgnored(java.lang.Boolean p0)`
- `public void setUnicodeNormalizationIgnored(java.lang.String p0)`

---

## public abstract interface `org.jasypt.digest.config.StringDigesterConfig`
implements `org.jasypt.digest.config.DigesterConfig`  

**Methods:**
- `public abstract java.lang.String getPrefix()`
- `public abstract java.lang.String getStringOutputType()`
- `public abstract java.lang.String getSuffix()`
- `public abstract java.lang.Boolean isUnicodeNormalizationIgnored()`

---

## public abstract interface `org.jasypt.encryption.BigDecimalEncryptor`

**Methods:**
- `public abstract java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public abstract java.math.BigDecimal encrypt(java.math.BigDecimal p0)`

---

## public abstract interface `org.jasypt.encryption.BigIntegerEncryptor`

**Methods:**
- `public abstract java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public abstract java.math.BigInteger encrypt(java.math.BigInteger p0)`

---

## public abstract interface `org.jasypt.encryption.ByteEncryptor`

**Methods:**
- `public abstract byte[] decrypt(byte[] p0)`
- `public abstract byte[] encrypt(byte[] p0)`

---

## public abstract interface `org.jasypt.encryption.StringEncryptor`

**Methods:**
- `public abstract java.lang.String decrypt(java.lang.String p0)`
- `public abstract java.lang.String encrypt(java.lang.String p0)`

---

## public abstract interface `org.jasypt.encryption.pbe.CleanablePasswordBased`
implements `org.jasypt.encryption.pbe.PasswordBased`  

**Methods:**
- `public abstract void setPasswordCharArray(char[] p0)`

---

## public abstract interface `org.jasypt.encryption.pbe.PBEBigDecimalCleanablePasswordEncryptor`
implements `org.jasypt.encryption.pbe.CleanablePasswordBased`, `org.jasypt.encryption.pbe.PBEBigDecimalEncryptor`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEBigDecimalEncryptor`
implements `org.jasypt.encryption.BigDecimalEncryptor`, `org.jasypt.encryption.pbe.PasswordBased`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEBigIntegerCleanablePasswordEncryptor`
implements `org.jasypt.encryption.pbe.CleanablePasswordBased`, `org.jasypt.encryption.pbe.PBEBigIntegerEncryptor`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEBigIntegerEncryptor`
implements `org.jasypt.encryption.BigIntegerEncryptor`, `org.jasypt.encryption.pbe.PasswordBased`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEByteCleanablePasswordEncryptor`
implements `org.jasypt.encryption.pbe.CleanablePasswordBased`, `org.jasypt.encryption.pbe.PBEByteEncryptor`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEByteEncryptor`
implements `org.jasypt.encryption.ByteEncryptor`, `org.jasypt.encryption.pbe.PasswordBased`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEStringCleanablePasswordEncryptor`
implements `org.jasypt.encryption.pbe.CleanablePasswordBased`, `org.jasypt.encryption.pbe.PBEStringEncryptor`  

---

## public abstract interface `org.jasypt.encryption.pbe.PBEStringEncryptor`
implements `org.jasypt.encryption.StringEncryptor`, `org.jasypt.encryption.pbe.PasswordBased`  

---

## public abstract interface `org.jasypt.encryption.pbe.PasswordBased`

**Methods:**
- `public abstract void setPassword(java.lang.String p0)`

---

## public final class `org.jasypt.encryption.pbe.PooledPBEBigDecimalEncryptor`
implements `org.jasypt.encryption.pbe.PBEBigDecimalCleanablePasswordEncryptor`  

**Constructors:**
- `public PooledPBEBigDecimalEncryptor()`

**Methods:**
- `public java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public java.math.BigDecimal encrypt(java.math.BigDecimal p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public synchronized void setPasswordCharArray(char[] p0)`
- `public synchronized void setPoolSize(int p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.PooledPBEBigIntegerEncryptor`
implements `org.jasypt.encryption.pbe.PBEBigIntegerCleanablePasswordEncryptor`  

**Constructors:**
- `public PooledPBEBigIntegerEncryptor()`

**Methods:**
- `public java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public java.math.BigInteger encrypt(java.math.BigInteger p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public synchronized void setPasswordCharArray(char[] p0)`
- `public synchronized void setPoolSize(int p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.PooledPBEByteEncryptor`
implements `org.jasypt.encryption.pbe.PBEByteCleanablePasswordEncryptor`  

**Constructors:**
- `public PooledPBEByteEncryptor()`

**Methods:**
- `public byte[] decrypt(byte[] p0) throws org.jasypt.exceptions.EncryptionOperationNotPossibleException`
- `public byte[] encrypt(byte[] p0) throws org.jasypt.exceptions.EncryptionOperationNotPossibleException`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public synchronized void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public synchronized void setKeyObtentionIterations(int p0)`
- `public synchronized void setPassword(java.lang.String p0)`
- `public synchronized void setPasswordCharArray(char[] p0)`
- `public synchronized void setPoolSize(int p0)`
- `public synchronized void setProvider(java.security.Provider p0)`
- `public synchronized void setProviderName(java.lang.String p0)`
- `public synchronized void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.PooledPBEStringEncryptor`
implements `org.jasypt.encryption.pbe.PBEStringCleanablePasswordEncryptor`  

**Constructors:**
- `public PooledPBEStringEncryptor()`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0)`
- `public java.lang.String encrypt(java.lang.String p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public synchronized void setPasswordCharArray(char[] p0)`
- `public synchronized void setPoolSize(int p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public synchronized void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.encryption.pbe.StandardPBEBigDecimalEncryptor`
implements `org.jasypt.encryption.pbe.PBEBigDecimalCleanablePasswordEncryptor`  

**Constructors:**
- `public StandardPBEBigDecimalEncryptor()`

**Methods:**
- `public java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public java.math.BigDecimal encrypt(java.math.BigDecimal p0)`
- `public void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.StandardPBEBigIntegerEncryptor`
implements `org.jasypt.encryption.pbe.PBEBigIntegerCleanablePasswordEncryptor`  

**Constructors:**
- `public StandardPBEBigIntegerEncryptor()`

**Methods:**
- `public java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public java.math.BigInteger encrypt(java.math.BigInteger p0)`
- `public void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.StandardPBEByteEncryptor`
implements `org.jasypt.encryption.pbe.PBEByteCleanablePasswordEncryptor`  

**Constructors:**
- `public StandardPBEByteEncryptor()`

**Fields:**
- `public final static java.lang.String DEFAULT_ALGORITHM`
- `public final static int DEFAULT_KEY_OBTENTION_ITERATIONS`
- `public final static int DEFAULT_SALT_SIZE_BYTES`

**Methods:**
- `public byte[] decrypt(byte[] p0) throws org.jasypt.exceptions.EncryptionOperationNotPossibleException`
- `public byte[] encrypt(byte[] p0) throws org.jasypt.exceptions.EncryptionOperationNotPossibleException`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public synchronized void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public synchronized void setKeyObtentionIterations(int p0)`
- `public synchronized void setPassword(java.lang.String p0)`
- `public synchronized void setPasswordCharArray(char[] p0)`
- `public synchronized void setProvider(java.security.Provider p0)`
- `public synchronized void setProviderName(java.lang.String p0)`
- `public synchronized void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`

---

## public final class `org.jasypt.encryption.pbe.StandardPBEStringEncryptor`
implements `org.jasypt.encryption.pbe.PBEStringCleanablePasswordEncryptor`  

**Constructors:**
- `public StandardPBEStringEncryptor()`

**Fields:**
- `public final static java.lang.String DEFAULT_STRING_OUTPUT_TYPE`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0)`
- `public java.lang.String encrypt(java.lang.String p0)`
- `public synchronized void initialize()`
- `public boolean isInitialized()`
- `public void setAlgorithm(java.lang.String p0)`
- `public synchronized void setConfig(org.jasypt.encryption.pbe.config.PBEConfig p0)`
- `public void setKeyObtentionIterations(int p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public synchronized void setStringOutputType(java.lang.String p0)`

---

## public class `org.jasypt.encryption.pbe.config.EnvironmentPBEConfig`
extends `org.jasypt.encryption.pbe.config.SimplePBEConfig`  

**Constructors:**
- `public EnvironmentPBEConfig()`

**Methods:**
- `public java.lang.String getAlgorithmEnvName()`
- `public java.lang.String getAlgorithmSysPropertyName()`
- `public java.lang.String getKeyObtentionIterationsEnvName()`
- `public java.lang.String getKeyObtentionIterationsSysPropertyName()`
- `public java.lang.String getPasswordEnvName()`
- `public java.lang.String getPasswordSysPropertyName()`
- `public java.lang.String getPoolSizeEnvName()`
- `public java.lang.String getPoolSizeSysPropertyName()`
- `public java.lang.String getProviderClassNameEnvName()`
- `public java.lang.String getProviderClassNameSysPropertyName()`
- `public java.lang.String getProviderNameEnvName()`
- `public java.lang.String getProviderNameSysPropertyName()`
- `public java.lang.String getSaltGeneratorClassNameEnvName()`
- `public java.lang.String getSaltGeneratorClassNameSysPropertyName()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setAlgorithmEnvName(java.lang.String p0)`
- `public void setAlgorithmSysPropertyName(java.lang.String p0)`
- `public void setKeyObtentionIterations(java.lang.Integer p0)`
- `public void setKeyObtentionIterations(java.lang.String p0)`
- `public void setKeyObtentionIterationsEnvName(java.lang.String p0)`
- `public void setKeyObtentionIterationsSysPropertyName(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`
- `public void setPasswordEnvName(java.lang.String p0)`
- `public void setPasswordSysPropertyName(java.lang.String p0)`
- `public void setPoolSize(java.lang.Integer p0)`
- `public void setPoolSize(java.lang.String p0)`
- `public void setPoolSizeEnvName(java.lang.String p0)`
- `public void setPoolSizeSysPropertyName(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderClassName(java.lang.String p0)`
- `public void setProviderClassNameEnvName(java.lang.String p0)`
- `public void setProviderClassNameSysPropertyName(java.lang.String p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setProviderNameEnvName(java.lang.String p0)`
- `public void setProviderNameSysPropertyName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public void setSaltGeneratorClassName(java.lang.String p0)`
- `public void setSaltGeneratorClassNameEnvName(java.lang.String p0)`
- `public void setSaltGeneratorClassNameSysPropertyName(java.lang.String p0)`

---

## public class `org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig`
extends `org.jasypt.encryption.pbe.config.EnvironmentPBEConfig`  
implements `org.jasypt.encryption.pbe.config.StringPBEConfig`  

**Constructors:**
- `public EnvironmentStringPBEConfig()`

**Methods:**
- `public java.lang.String getStringOutputType()`
- `public java.lang.String getStringOutputTypeEnvName()`
- `public java.lang.String getStringOutputTypeSysPropertyName()`
- `public void setStringOutputType(java.lang.String p0)`
- `public void setStringOutputTypeEnvName(java.lang.String p0)`
- `public void setStringOutputTypeSysPropertyName(java.lang.String p0)`

---

## public abstract interface `org.jasypt.encryption.pbe.config.PBECleanablePasswordConfig`

**Methods:**
- `public abstract void cleanPassword()`
- `public abstract char[] getPasswordCharArray()`

---

## public abstract interface `org.jasypt.encryption.pbe.config.PBEConfig`

**Methods:**
- `public abstract java.lang.String getAlgorithm()`
- `public abstract java.lang.Integer getKeyObtentionIterations()`
- `public abstract java.lang.String getPassword()`
- `public abstract java.lang.Integer getPoolSize()`
- `public abstract java.security.Provider getProvider()`
- `public abstract java.lang.String getProviderName()`
- `public abstract org.jasypt.salt.SaltGenerator getSaltGenerator()`

---

## public class `org.jasypt.encryption.pbe.config.SimplePBEConfig`
implements `org.jasypt.encryption.pbe.config.PBECleanablePasswordConfig`, `org.jasypt.encryption.pbe.config.PBEConfig`  

**Constructors:**
- `public SimplePBEConfig()`

**Methods:**
- `public void cleanPassword()`
- `public java.lang.String getAlgorithm()`
- `public java.lang.Integer getKeyObtentionIterations()`
- `public java.lang.String getPassword()`
- `public char[] getPasswordCharArray()`
- `public java.lang.Integer getPoolSize()`
- `public java.security.Provider getProvider()`
- `public java.lang.String getProviderName()`
- `public org.jasypt.salt.SaltGenerator getSaltGenerator()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setKeyObtentionIterations(java.lang.Integer p0)`
- `public void setKeyObtentionIterations(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`
- `public void setPoolSize(java.lang.Integer p0)`
- `public void setPoolSize(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderClassName(java.lang.String p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setSaltGenerator(org.jasypt.salt.SaltGenerator p0)`
- `public void setSaltGeneratorClassName(java.lang.String p0)`

---

## public class `org.jasypt.encryption.pbe.config.SimpleStringPBEConfig`
extends `org.jasypt.encryption.pbe.config.SimplePBEConfig`  
implements `org.jasypt.encryption.pbe.config.StringPBEConfig`  

**Constructors:**
- `public SimpleStringPBEConfig()`

**Methods:**
- `public java.lang.String getStringOutputType()`
- `public void setStringOutputType(java.lang.String p0)`

---

## public abstract interface `org.jasypt.encryption.pbe.config.StringPBEConfig`
implements `org.jasypt.encryption.pbe.config.PBEConfig`  

**Methods:**
- `public abstract java.lang.String getStringOutputType()`

---

## public class `org.jasypt.encryption.pbe.config.WebPBEConfig`
extends `org.jasypt.encryption.pbe.config.SimplePBEConfig`  

**Constructors:**
- `public WebPBEConfig()`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getValidationWord()`
- `public boolean isComplete()`
- `public void setName(java.lang.String p0)`
- `public void setValidationWord(java.lang.String p0)`

---

## public class `org.jasypt.encryption.pbe.config.WebStringPBEConfig`
extends `org.jasypt.encryption.pbe.config.WebPBEConfig`  
implements `org.jasypt.encryption.pbe.config.StringPBEConfig`  

**Constructors:**
- `public WebStringPBEConfig()`

**Methods:**
- `public java.lang.String getStringOutputType()`
- `public void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.exceptions.AlreadyInitializedException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public AlreadyInitializedException()`

---

## public final class `org.jasypt.exceptions.EncryptionInitializationException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public EncryptionInitializationException()`
- `public EncryptionInitializationException(java.lang.String p0)`
- `public EncryptionInitializationException(java.lang.String p0, java.lang.Throwable p1)`
- `public EncryptionInitializationException(java.lang.Throwable p0)`

---

## public final class `org.jasypt.exceptions.EncryptionOperationNotPossibleException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public EncryptionOperationNotPossibleException()`
- `public EncryptionOperationNotPossibleException(java.lang.String p0)`
- `public EncryptionOperationNotPossibleException(java.lang.Throwable p0)`

---

## public final class `org.jasypt.exceptions.PasswordAlreadyCleanedException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public PasswordAlreadyCleanedException()`

---

## public final class `org.jasypt.intf.cli.AlgorithmRegistryCLI`

**Methods:**
- `public static void main(java.lang.String[] p0)`

---

## public final class `org.jasypt.intf.cli.JasyptPBEStringDecryptionCLI`

**Methods:**
- `public static void main(java.lang.String[] p0)`

---

## public final class `org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI`

**Methods:**
- `public static void main(java.lang.String[] p0)`

---

## public final class `org.jasypt.intf.cli.JasyptStringDigestCLI`

**Methods:**
- `public static void main(java.lang.String[] p0)`

---

## public final class `org.jasypt.intf.service.JasyptStatelessService`

**Constructors:**
- `public JasyptStatelessService()`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, java.lang.String p14, java.lang.String p15, java.lang.String p16, java.lang.String p17, java.lang.String p18, java.lang.String p19, java.lang.String p20, java.lang.String p21)`
- `public java.lang.String digest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, java.lang.String p14, java.lang.String p15, java.lang.String p16, java.lang.String p17, java.lang.String p18, java.lang.String p19, java.lang.String p20, java.lang.String p21, java.lang.String p22, java.lang.String p23, java.lang.String p24, java.lang.String p25, java.lang.String p26, java.lang.String p27, java.lang.String p28, java.lang.String p29, java.lang.String p30, java.lang.String p31, java.lang.String p32, java.lang.String p33, java.lang.String p34, java.lang.String p35, java.lang.String p36, java.lang.String p37, java.lang.String p38, java.lang.String p39)`
- `public java.lang.String encrypt(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, java.lang.String p14, java.lang.String p15, java.lang.String p16, java.lang.String p17, java.lang.String p18, java.lang.String p19, java.lang.String p20, java.lang.String p21)`

---

## public final class `org.jasypt.normalization.Normalizer`

**Methods:**
- `public static char[] normalizeToNfc(char[] p0)`
- `public static java.lang.String normalizeToNfc(java.lang.String p0)`

---

## public final class `org.jasypt.properties.EncryptableProperties`
extends `java.util.Properties`  

**Constructors:**
- `public EncryptableProperties(java.util.Properties p0, org.jasypt.encryption.StringEncryptor p1)`
- `public EncryptableProperties(java.util.Properties p0, org.jasypt.util.text.TextEncryptor p1)`
- `public EncryptableProperties(org.jasypt.encryption.StringEncryptor p0)`
- `public EncryptableProperties(org.jasypt.util.text.TextEncryptor p0)`

**Methods:**
- `public synchronized java.lang.Object get(java.lang.Object p0)`
- `public java.lang.String getProperty(java.lang.String p0)`
- `public java.lang.String getProperty(java.lang.String p0, java.lang.String p1)`

---

## public final class `org.jasypt.properties.PropertyValueEncryptionUtils`

**Methods:**
- `public static java.lang.String decrypt(java.lang.String p0, org.jasypt.encryption.StringEncryptor p1)`
- `public static java.lang.String decrypt(java.lang.String p0, org.jasypt.util.text.TextEncryptor p1)`
- `public static java.lang.String encrypt(java.lang.String p0, org.jasypt.encryption.StringEncryptor p1)`
- `public static java.lang.String encrypt(java.lang.String p0, org.jasypt.util.text.TextEncryptor p1)`
- `public static boolean isEncryptedValue(java.lang.String p0)`

---

## public final class `org.jasypt.registry.AlgorithmRegistry`

**Methods:**
- `public static java.util.Set getAllDigestAlgorithms()`
- `public static java.util.Set getAllPBEAlgorithms()`

---

## public class `org.jasypt.salt.ByteArrayFixedSaltGenerator`
implements `org.jasypt.salt.FixedSaltGenerator`  

**Constructors:**
- `public ByteArrayFixedSaltGenerator(byte[] p0)`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`

---

## public class `org.jasypt.salt.FixedByteArraySaltGenerator`
implements `org.jasypt.salt.SaltGenerator`  

**Constructors:**
- `public FixedByteArraySaltGenerator()`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`
- `public synchronized void setSalt(byte[] p0)`

---

## public abstract interface `org.jasypt.salt.FixedSaltGenerator`
implements `org.jasypt.salt.SaltGenerator`  

---

## public class `org.jasypt.salt.FixedStringSaltGenerator`
implements `org.jasypt.salt.SaltGenerator`  

**Constructors:**
- `public FixedStringSaltGenerator()`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`
- `public synchronized void setCharset(java.lang.String p0)`
- `public synchronized void setSalt(java.lang.String p0)`

---

## public class `org.jasypt.salt.RandomSaltGenerator`
implements `org.jasypt.salt.SaltGenerator`  

**Constructors:**
- `public RandomSaltGenerator()`
- `public RandomSaltGenerator(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String DEFAULT_SECURE_RANDOM_ALGORITHM`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`

---

## public abstract interface `org.jasypt.salt.SaltGenerator`

**Methods:**
- `public abstract byte[] generateSalt(int p0)`
- `public abstract boolean includePlainSaltInEncryptionResults()`

---

## public class `org.jasypt.salt.StringFixedSaltGenerator`
implements `org.jasypt.salt.FixedSaltGenerator`  

**Constructors:**
- `public StringFixedSaltGenerator(java.lang.String p0)`
- `public StringFixedSaltGenerator(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`

---

## public class `org.jasypt.salt.ZeroSaltGenerator`
implements `org.jasypt.salt.SaltGenerator`  

**Constructors:**
- `public ZeroSaltGenerator()`

**Methods:**
- `public byte[] generateSalt(int p0)`
- `public boolean includePlainSaltInEncryptionResults()`

---

## public final class `org.jasypt.util.binary.BasicBinaryEncryptor`
implements `org.jasypt.util.binary.BinaryEncryptor`  

**Constructors:**
- `public BasicBinaryEncryptor()`

**Methods:**
- `public byte[] decrypt(byte[] p0)`
- `public byte[] encrypt(byte[] p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public abstract interface `org.jasypt.util.binary.BinaryEncryptor`

**Methods:**
- `public abstract byte[] decrypt(byte[] p0)`
- `public abstract byte[] encrypt(byte[] p0)`

---

## public final class `org.jasypt.util.binary.StrongBinaryEncryptor`
implements `org.jasypt.util.binary.BinaryEncryptor`  

**Constructors:**
- `public StrongBinaryEncryptor()`

**Methods:**
- `public byte[] decrypt(byte[] p0)`
- `public byte[] encrypt(byte[] p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public final class `org.jasypt.util.digest.Digester`

**Constructors:**
- `public Digester()`
- `public Digester(java.lang.String p0)`
- `public Digester(java.lang.String p0, java.lang.String p1)`
- `public Digester(java.lang.String p0, java.security.Provider p1)`

**Fields:**
- `public final static java.lang.String DEFAULT_ALGORITHM`

**Methods:**
- `public byte[] digest(byte[] p0)`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`

---

## public final class `org.jasypt.util.numeric.BasicDecimalNumberEncryptor`
implements `org.jasypt.util.numeric.DecimalNumberEncryptor`  

**Constructors:**
- `public BasicDecimalNumberEncryptor()`

**Methods:**
- `public java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public java.math.BigDecimal encrypt(java.math.BigDecimal p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public final class `org.jasypt.util.numeric.BasicIntegerNumberEncryptor`
implements `org.jasypt.util.numeric.IntegerNumberEncryptor`  

**Constructors:**
- `public BasicIntegerNumberEncryptor()`

**Methods:**
- `public java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public java.math.BigInteger encrypt(java.math.BigInteger p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public abstract interface `org.jasypt.util.numeric.DecimalNumberEncryptor`

**Methods:**
- `public abstract java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public abstract java.math.BigDecimal encrypt(java.math.BigDecimal p0)`

---

## public abstract interface `org.jasypt.util.numeric.IntegerNumberEncryptor`

**Methods:**
- `public abstract java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public abstract java.math.BigInteger encrypt(java.math.BigInteger p0)`

---

## public final class `org.jasypt.util.numeric.StrongDecimalNumberEncryptor`
implements `org.jasypt.util.numeric.DecimalNumberEncryptor`  

**Constructors:**
- `public StrongDecimalNumberEncryptor()`

**Methods:**
- `public java.math.BigDecimal decrypt(java.math.BigDecimal p0)`
- `public java.math.BigDecimal encrypt(java.math.BigDecimal p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public final class `org.jasypt.util.numeric.StrongIntegerNumberEncryptor`
implements `org.jasypt.util.numeric.IntegerNumberEncryptor`  

**Constructors:**
- `public StrongIntegerNumberEncryptor()`

**Methods:**
- `public java.math.BigInteger decrypt(java.math.BigInteger p0)`
- `public java.math.BigInteger encrypt(java.math.BigInteger p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public final class `org.jasypt.util.password.BasicPasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public BasicPasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.ConfigurablePasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public ConfigurablePasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setConfig(org.jasypt.digest.config.DigesterConfig p0)`
- `public void setPlainDigest(boolean p0)`
- `public void setProvider(java.security.Provider p0)`
- `public void setProviderName(java.lang.String p0)`
- `public void setStringOutputType(java.lang.String p0)`

---

## public abstract interface `org.jasypt.util.password.PasswordEncryptor`

**Methods:**
- `public abstract boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String encryptPassword(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.StrongPasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public StrongPasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.rfc2307.RFC2307MD5PasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public RFC2307MD5PasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`
- `public void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.rfc2307.RFC2307SHAPasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public RFC2307SHAPasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`
- `public void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.rfc2307.RFC2307SMD5PasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public RFC2307SMD5PasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`
- `public void setSaltSizeBytes(int p0)`
- `public void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor`
implements `org.jasypt.util.password.PasswordEncryptor`  

**Constructors:**
- `public RFC2307SSHAPasswordEncryptor()`

**Methods:**
- `public boolean checkPassword(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String encryptPassword(java.lang.String p0)`
- `public void setSaltSizeBytes(int p0)`
- `public void setStringOutputType(java.lang.String p0)`

---

## public final class `org.jasypt.util.text.BasicTextEncryptor`
implements `org.jasypt.util.text.TextEncryptor`  

**Constructors:**
- `public BasicTextEncryptor()`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0)`
- `public java.lang.String encrypt(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public final class `org.jasypt.util.text.StrongTextEncryptor`
implements `org.jasypt.util.text.TextEncryptor`  

**Constructors:**
- `public StrongTextEncryptor()`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0)`
- `public java.lang.String encrypt(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setPasswordCharArray(char[] p0)`

---

## public abstract interface `org.jasypt.util.text.TextEncryptor`

**Methods:**
- `public abstract java.lang.String decrypt(java.lang.String p0)`
- `public abstract java.lang.String encrypt(java.lang.String p0)`

---

## public final class `org.jasypt.web.pbeconfig.WebPBEConfigFilter`
implements `javax.servlet.Filter`  

**Constructors:**
- `public WebPBEConfigFilter()`

**Methods:**
- `public void destroy()`
- `public void doFilter(javax.servlet.ServletRequest p0, javax.servlet.ServletResponse p1, javax.servlet.FilterChain p2) throws java.io.IOException, javax.servlet.ServletException`
- `public void init(javax.servlet.FilterConfig p0) throws javax.servlet.ServletException`

---

## public final class `org.jasypt.web.pbeconfig.WebPBEConfigRegistry`

**Methods:**
- `public synchronized java.util.List getConfigs()`
- `public static org.jasypt.web.pbeconfig.WebPBEConfigRegistry getInstance()`
- `public boolean isWebConfigurationDone()`
- `public synchronized void registerConfig(org.jasypt.encryption.pbe.config.WebPBEConfig p0)`
- `public void setWebConfigurationDone(boolean p0)`

---

## public final class `org.jasypt.web.pbeconfig.WebPBEConfigServlet`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public WebPBEConfigServlet()`

---

## public final class `org.jasypt.web.pbeconfig.WebPBEInitializationContextListener`
implements `javax.servlet.ServletContextListener`  

**Constructors:**
- `public WebPBEInitializationContextListener()`

**Fields:**
- `public final static java.lang.String INIT_PARAM_INITIALIZER_CLASS_NAME`

**Methods:**
- `public void contextDestroyed(javax.servlet.ServletContextEvent p0)`
- `public void contextInitialized(javax.servlet.ServletContextEvent p0)`

---

## public abstract interface `org.jasypt.web.pbeconfig.WebPBEInitializer`

**Methods:**
- `public abstract void initializeWebPBEConfigs()`

---

