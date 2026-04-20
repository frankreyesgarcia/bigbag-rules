# API Specification: org.jvnet.jaxb2_commons:jaxb2-basics-runtime 1.11.1-PUBLISHED-BY-MISTAKE

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `org.jvnet.jaxb2_commons.i18n.Reportable`

**Methods:**
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.String getMessage(java.util.ResourceBundle p0)`
- `public abstract java.lang.String getMessageCode()`
- `public abstract java.lang.Object[] getMessageParameters()`

---

## public class `org.jvnet.jaxb2_commons.lang.ClassUtils`

**Fields:**
- `public final static char INNER_CLASS_SEPARATOR_CHAR`
- `public final static char PACKAGE_SEPARATOR_CHAR`

**Methods:**
- `public static java.lang.String getShortClassName(java.lang.Class p0)`
- `public static java.lang.String getShortClassName(java.lang.String p0)`

---

## public class `org.jvnet.jaxb2_commons.lang.ContextUtils`

**Constructors:**
- `public ContextUtils()`

**Methods:**
- `public static java.lang.String getContextPath(java.lang.Class... p0)`
- `public static java.lang.String toString(javax.xml.bind.JAXBContext p0, java.lang.Object p1) throws javax.xml.bind.JAXBException`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.CopyStrategy`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract boolean copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1)`
- `public abstract boolean[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean[] p1)`
- `public abstract byte copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte p1)`
- `public abstract byte[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte[] p1)`
- `public abstract char copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char p1)`
- `public abstract char[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char[] p1)`
- `public abstract double copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double p1)`
- `public abstract double[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double[] p1)`
- `public abstract float copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float p1)`
- `public abstract float[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float[] p1)`
- `public abstract int copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1)`
- `public abstract int[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int[] p1)`
- `public abstract java.lang.Object copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1)`
- `public abstract java.lang.Object[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object[] p1)`
- `public abstract long copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long p1)`
- `public abstract long[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long[] p1)`
- `public abstract short copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short p1)`
- `public abstract short[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short[] p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.CopyStrategy2`

**Methods:**
- `public abstract boolean copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1, boolean p2)`
- `public abstract boolean[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean[] p1, boolean p2)`
- `public abstract byte copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte p1, boolean p2)`
- `public abstract byte[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte[] p1, boolean p2)`
- `public abstract char copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char p1, boolean p2)`
- `public abstract char[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char[] p1, boolean p2)`
- `public abstract double copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double p1, boolean p2)`
- `public abstract double[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double[] p1, boolean p2)`
- `public abstract float copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float p1, boolean p2)`
- `public abstract float[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float[] p1, boolean p2)`
- `public abstract int copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2)`
- `public abstract int[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int[] p1, boolean p2)`
- `public abstract java.lang.Object copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, boolean p2)`
- `public abstract java.lang.Object[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object[] p1, boolean p2)`
- `public abstract long copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long p1, boolean p2)`
- `public abstract long[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long[] p1, boolean p2)`
- `public abstract short copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short p1, boolean p2)`
- `public abstract short[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short[] p1, boolean p2)`
- `public abstract java.lang.Boolean shouldBeCopiedAndSet(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.CopyTo`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract java.lang.Object copyTo(java.lang.Object p0)`
- `public abstract java.lang.Object copyTo(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, org.jvnet.jaxb2_commons.lang.CopyStrategy p2)`
- `public abstract java.lang.Object createNewInstance()`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.CopyTo2`

**Methods:**
- `public abstract java.lang.Object copyTo(java.lang.Object p0)`
- `public abstract java.lang.Object copyTo(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, org.jvnet.jaxb2_commons.lang.CopyStrategy2 p2)`
- `public abstract java.lang.Object createNewInstance()`

---

## public class `org.jvnet.jaxb2_commons.lang.DefaultCopyStrategy`
implements `org.jvnet.jaxb2_commons.lang.CopyStrategy2`, `org.jvnet.jaxb2_commons.lang.CopyStrategy`  

**Constructors:**
- `public DefaultCopyStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.DefaultCopyStrategy INSTANCE`

**Methods:**
- `public boolean copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1)`
- `public boolean copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1, boolean p2)`
- `public boolean[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean[] p1)`
- `public boolean[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean[] p1, boolean p2)`
- `public byte copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte p1)`
- `public byte copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte p1, boolean p2)`
- `public byte[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte[] p1)`
- `public byte[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, byte[] p1, boolean p2)`
- `public char copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char p1)`
- `public char copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char p1, boolean p2)`
- `public char[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char[] p1)`
- `public char[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, char[] p1, boolean p2)`
- `public double copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double p1)`
- `public double copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double p1, boolean p2)`
- `public double[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double[] p1)`
- `public double[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, double[] p1, boolean p2)`
- `public float copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float p1)`
- `public float copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float p1, boolean p2)`
- `public float[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float[] p1)`
- `public float[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, float[] p1, boolean p2)`
- `public int copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1)`
- `public int copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2)`
- `public int[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int[] p1)`
- `public int[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int[] p1, boolean p2)`
- `public java.lang.Object copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1)`
- `public java.lang.Object copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, boolean p2)`
- `public java.lang.Object[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object[] p1)`
- `public java.lang.Object[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object[] p1, boolean p2)`
- `public long copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long p1)`
- `public long copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long p1, boolean p2)`
- `public long[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long[] p1)`
- `public long[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, long[] p1, boolean p2)`
- `public short copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short p1)`
- `public short copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short p1, boolean p2)`
- `public short[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short[] p1)`
- `public short[] copy(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, short[] p1, boolean p2)`
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Cloneable p1)`
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1)`
- `public java.lang.Boolean shouldBeCopiedAndSet(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, boolean p1)`

---

## public class `org.jvnet.jaxb2_commons.lang.DefaultEqualsStrategy`
implements `org.jvnet.jaxb2_commons.lang.EqualsStrategy2`, `org.jvnet.jaxb2_commons.lang.EqualsStrategy`  

**Constructors:**
- `public DefaultEqualsStrategy()`

**Fields:**
- `public static org.jvnet.jaxb2_commons.lang.DefaultEqualsStrategy INSTANCE`

**Methods:**
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3, boolean p4, boolean p5)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3)`
- `public boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3, boolean p4, boolean p5)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Enum p2, java.lang.Enum p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Enum[] p2, java.lang.Enum[] p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, org.jvnet.jaxb2_commons.lang.Equals p2, org.jvnet.jaxb2_commons.lang.Equals p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, org.jvnet.jaxb2_commons.lang.Equals2 p2, org.jvnet.jaxb2_commons.lang.Equals2 p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, org.jvnet.jaxb2_commons.lang.Equals2[] p2, org.jvnet.jaxb2_commons.lang.Equals2[] p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, org.jvnet.jaxb2_commons.lang.Equals[] p2, org.jvnet.jaxb2_commons.lang.Equals[] p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.DefaultHashCodeStrategy`
implements `org.jvnet.jaxb2_commons.lang.HashCodeStrategy2`, `org.jvnet.jaxb2_commons.lang.HashCodeStrategy`  

**Constructors:**
- `public DefaultHashCodeStrategy()`
- `public DefaultHashCodeStrategy(int p0)`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.DefaultHashCodeStrategy INSTANCE`

**Methods:**
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long[] p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short p2, boolean p3)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short[] p2)`
- `public int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short[] p2, boolean p3)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Enum p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Enum[] p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, org.jvnet.jaxb2_commons.lang.HashCode p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, org.jvnet.jaxb2_commons.lang.HashCode2 p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, org.jvnet.jaxb2_commons.lang.HashCode2[] p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, org.jvnet.jaxb2_commons.lang.HashCode[] p2)`

---

## public class `org.jvnet.jaxb2_commons.lang.DefaultMergeStrategy`
implements `org.jvnet.jaxb2_commons.lang.MergeStrategy2`, `org.jvnet.jaxb2_commons.lang.MergeStrategy`  

**Constructors:**
- `public DefaultMergeStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.DefaultMergeStrategy INSTANCE`

**Methods:**
- `public boolean merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`
- `public boolean merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3, boolean p4, boolean p5)`
- `public boolean[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3)`
- `public boolean[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3, boolean p4, boolean p5)`
- `public byte merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3)`
- `public byte merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3, boolean p4, boolean p5)`
- `public byte[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3)`
- `public byte[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3, boolean p4, boolean p5)`
- `public char merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3)`
- `public char merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3, boolean p4, boolean p5)`
- `public char[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3)`
- `public char[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3, boolean p4, boolean p5)`
- `public double merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3)`
- `public double merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3, boolean p4, boolean p5)`
- `public double[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3)`
- `public double[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3, boolean p4, boolean p5)`
- `public float merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3)`
- `public float merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3, boolean p4, boolean p5)`
- `public float[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3)`
- `public float[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3, boolean p4, boolean p5)`
- `public int merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3)`
- `public int merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3, boolean p4, boolean p5)`
- `public int[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3)`
- `public int[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3, boolean p4, boolean p5)`
- `public java.lang.Object merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `public java.lang.Object merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, boolean p4, boolean p5)`
- `public java.lang.Object[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3)`
- `public java.lang.Object[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3, boolean p4, boolean p5)`
- `public long merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3)`
- `public long merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3, boolean p4, boolean p5)`
- `public long[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3)`
- `public long[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3, boolean p4, boolean p5)`
- `public short merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3)`
- `public short merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3, boolean p4, boolean p5)`
- `public short[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3)`
- `public short[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3, boolean p4, boolean p5)`
- `protected java.lang.Object mergeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `public java.lang.Boolean shouldBeMergedAndSet(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.DefaultToStringStrategy`
implements `org.jvnet.jaxb2_commons.lang.ToStringStrategy2`, `org.jvnet.jaxb2_commons.lang.ToStringStrategy`  

**Constructors:**
- `public DefaultToStringStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.DefaultToStringStrategy INSTANCE`

**Methods:**
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.util.Collection p4)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.util.Collection p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long[] p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short p2)`
- `public java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short[] p2)`
- `protected void appendArrayEnd(java.lang.StringBuilder p0)`
- `protected void appendArraySeparator(java.lang.StringBuilder p0)`
- `protected void appendArrayStart(java.lang.StringBuilder p0)`
- `protected void appendClassName(java.lang.StringBuilder p0, java.lang.Object p1)`
- `protected void appendContentEnd(java.lang.StringBuilder p0)`
- `protected void appendContentStart(java.lang.StringBuilder p0)`
- `protected void appendDefaultFieldValueMarker(java.lang.StringBuilder p0)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.util.Collection p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long[] p2)`
- `protected java.lang.StringBuilder appendDetail(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short[] p2)`
- `public java.lang.StringBuilder appendEnd(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long[] p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short p4, boolean p5)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short[] p4)`
- `public java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short[] p4, boolean p5)`
- `protected void appendFieldEnd(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3)`
- `protected void appendFieldEnd(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4)`
- `protected void appendFieldSeparator(java.lang.StringBuilder p0)`
- `protected void appendFieldStart(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3)`
- `protected void appendFieldStart(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4)`
- `protected void appendIdentityHashCode(java.lang.StringBuilder p0, java.lang.Object p1)`
- `protected java.lang.StringBuilder appendInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object p2)`
- `protected void appendNullText(java.lang.StringBuilder p0)`
- `public java.lang.StringBuilder appendStart(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.util.Collection p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long[] p2)`
- `protected java.lang.StringBuilder appendSummary(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short[] p2)`
- `protected void appendSummarySize(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int p2)`
- `protected java.lang.String getShortClassName(java.lang.Class p0)`
- `public boolean isFullDetail()`
- `public boolean isUseDefaultFieldValueMarkers()`
- `public boolean isUseIdentityHashCode()`
- `protected void removeLastFieldSeparator(java.lang.StringBuilder p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.EnumValue`<T extends java.lang.Object>

**Methods:**
- `public abstract T enumValue()`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.Equals`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, org.jvnet.jaxb2_commons.lang.EqualsStrategy p3)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.Equals2`

**Methods:**
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, org.jvnet.jaxb2_commons.lang.EqualsStrategy2 p3)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.EqualsStrategy`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.EqualsStrategy2`

**Methods:**
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3, boolean p4, boolean p5)`
- `public abstract boolean equals(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3, boolean p4, boolean p5)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.HashCode`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.lang.HashCodeStrategy p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.HashCode2`

**Methods:**
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.lang.HashCodeStrategy2 p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.HashCodeStrategy`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long[] p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short p2)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short[] p2)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.HashCodeStrategy2`

**Methods:**
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long[] p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short p2, boolean p3)`
- `public abstract int hashCode(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short[] p2, boolean p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy`
extends `org.jvnet.jaxb2_commons.lang.DefaultCopyStrategy`  

**Constructors:**
- `public JAXBCopyStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy INSTANCE`

**Methods:**
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1)`
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.util.List p1)`
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, javax.xml.bind.JAXBElement p1)`
- `protected java.lang.Object copyInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.w3c.dom.Node p1)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy`
extends `org.jvnet.jaxb2_commons.lang.DefaultEqualsStrategy`  

**Constructors:**
- `public JAXBEqualsStrategy()`

**Fields:**
- `public static org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy INSTANCE`

**Methods:**
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.util.List p2, java.util.List p3)`
- `protected boolean equalsInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, javax.xml.bind.JAXBElement p2, javax.xml.bind.JAXBElement p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy`
extends `org.jvnet.jaxb2_commons.lang.DefaultHashCodeStrategy`  

**Constructors:**
- `public JAXBHashCodeStrategy()`
- `public JAXBHashCodeStrategy(int p0)`

**Fields:**
- `public static org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy INSTANCE`

**Methods:**
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.util.List p2)`
- `protected int hashCodeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, javax.xml.bind.JAXBElement p2)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBMergeCollectionsStrategy`
extends `org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy`  

**Constructors:**
- `public JAXBMergeCollectionsStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.MergeStrategy2 INSTANCE`

**Methods:**
- `protected java.lang.Object mergeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.util.Collection p2, java.util.Collection p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy`
extends `org.jvnet.jaxb2_commons.lang.DefaultMergeStrategy`  

**Constructors:**
- `public JAXBMergeStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy INSTANCE`

**Methods:**
- `protected java.lang.Object mergeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `protected java.lang.Object mergeInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.util.Collection p2, java.util.Collection p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy`
extends `org.jvnet.jaxb2_commons.lang.DefaultToStringStrategy`  

**Constructors:**
- `public JAXBToStringStrategy()`

**Fields:**
- `public final static org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy INSTANCE`

**Methods:**
- `protected java.lang.StringBuilder appendInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object p2)`
- `protected java.lang.StringBuilder appendInternal(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, javax.xml.bind.JAXBElement p2)`
- `protected void appendJAXBElementEnd(java.lang.StringBuilder p0)`
- `protected void appendJAXBElementStart(java.lang.StringBuilder p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.MergeFrom`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract java.lang.Object createNewInstance()`
- `public abstract void mergeFrom(java.lang.Object p0, java.lang.Object p1)`
- `public abstract void mergeFrom(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, org.jvnet.jaxb2_commons.lang.MergeStrategy p4)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.MergeFrom2`

**Methods:**
- `public abstract java.lang.Object createNewInstance()`
- `public abstract void mergeFrom(java.lang.Object p0, java.lang.Object p1)`
- `public abstract void mergeFrom(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, org.jvnet.jaxb2_commons.lang.MergeStrategy2 p4)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.MergeStrategy`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract boolean merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`
- `public abstract boolean[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3)`
- `public abstract byte merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3)`
- `public abstract byte[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3)`
- `public abstract char merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3)`
- `public abstract char[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3)`
- `public abstract double merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3)`
- `public abstract double[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3)`
- `public abstract float merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3)`
- `public abstract float[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3)`
- `public abstract int merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3)`
- `public abstract int[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3)`
- `public abstract java.lang.Object merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3)`
- `public abstract java.lang.Object[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3)`
- `public abstract long merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3)`
- `public abstract long[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3)`
- `public abstract short merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3)`
- `public abstract short[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.MergeStrategy2`

**Methods:**
- `public abstract boolean merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3, boolean p4, boolean p5)`
- `public abstract boolean[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean[] p2, boolean[] p3, boolean p4, boolean p5)`
- `public abstract byte merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte p2, byte p3, boolean p4, boolean p5)`
- `public abstract byte[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, byte[] p2, byte[] p3, boolean p4, boolean p5)`
- `public abstract char merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char p2, char p3, boolean p4, boolean p5)`
- `public abstract char[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, char[] p2, char[] p3, boolean p4, boolean p5)`
- `public abstract double merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double p2, double p3, boolean p4, boolean p5)`
- `public abstract double[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, double[] p2, double[] p3, boolean p4, boolean p5)`
- `public abstract float merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float p2, float p3, boolean p4, boolean p5)`
- `public abstract float[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, float[] p2, float[] p3, boolean p4, boolean p5)`
- `public abstract int merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int p2, int p3, boolean p4, boolean p5)`
- `public abstract int[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, int[] p2, int[] p3, boolean p4, boolean p5)`
- `public abstract java.lang.Object merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object p2, java.lang.Object p3, boolean p4, boolean p5)`
- `public abstract java.lang.Object[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, java.lang.Object[] p2, java.lang.Object[] p3, boolean p4, boolean p5)`
- `public abstract long merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long p2, long p3, boolean p4, boolean p5)`
- `public abstract long[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, long[] p2, long[] p3, boolean p4, boolean p5)`
- `public abstract short merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short p2, short p3, boolean p4, boolean p5)`
- `public abstract short[] merge(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, short[] p2, short[] p3, boolean p4, boolean p5)`
- `public abstract java.lang.Boolean shouldBeMergedAndSet(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, org.jvnet.jaxb2_commons.locator.ObjectLocator p1, boolean p2, boolean p3)`

---

## public class `org.jvnet.jaxb2_commons.lang.StringUtils`

**Constructors:**
- `public StringUtils()`

**Fields:**
- `public final static java.lang.String EMPTY`
- `public final static java.lang.String[] EMPTY_STRING_ARRAY`
- `public final static java.lang.String LINE_SEPARATOR`

**Methods:**
- `public static boolean isEmpty(java.lang.String p0)`
- `public static java.lang.String join(java.util.Iterator p0, java.lang.String p1)`
- `public static java.lang.String[] split(java.lang.String p0, char p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.ToString`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, org.jvnet.jaxb2_commons.lang.ToStringStrategy p2)`
- `public abstract java.lang.StringBuilder appendFields(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, org.jvnet.jaxb2_commons.lang.ToStringStrategy p2)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.ToString2`

**Methods:**
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, org.jvnet.jaxb2_commons.lang.ToStringStrategy2 p2)`
- `public abstract java.lang.StringBuilder appendFields(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, org.jvnet.jaxb2_commons.lang.ToStringStrategy2 p2)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.ToStringStrategy`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, boolean[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, byte[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, char[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, double[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, float[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, int[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, java.lang.Object[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, long[] p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short p2)`
- `public abstract java.lang.StringBuilder append(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.StringBuilder p1, short[] p2)`
- `public abstract java.lang.StringBuilder appendEnd(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long[] p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short p4)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short[] p4)`
- `public abstract java.lang.StringBuilder appendStart(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`

---

## public abstract interface `org.jvnet.jaxb2_commons.lang.ToStringStrategy2`

**Methods:**
- `public abstract java.lang.StringBuilder appendEnd(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, boolean[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, byte[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, char[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, double[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, float[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, int[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, java.lang.Object[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, long[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendField(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.String p2, java.lang.StringBuilder p3, short[] p4, boolean p5)`
- `public abstract java.lang.StringBuilder appendStart(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1, java.lang.StringBuilder p2)`

---

## public class `org.jvnet.jaxb2_commons.lang.Validate`

**Constructors:**
- `public Validate()`

**Methods:**
- `public static void isTrue(boolean p0)`
- `public static void noNullElements(java.util.Collection p0)`
- `public static void notEmpty(java.util.Collection p0)`
- `public static void notNull(java.lang.Object p0)`

---

## public abstract class `org.jvnet.jaxb2_commons.locator.AbstractObjectLocator`
implements `org.jvnet.jaxb2_commons.locator.ObjectLocator`  

**Constructors:**
- `protected AbstractObjectLocator(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.Object p1)`

**Fields:**
- `protected final java.lang.Object object`
- `protected final org.jvnet.jaxb2_commons.locator.ObjectLocator parentLocator`

**Methods:**
- `public int getColumnNumber()`
- `protected abstract java.lang.String getDefaultMessage()`
- `public int getLineNumber()`
- `public java.lang.String getMessage()`
- `public java.lang.String getMessage(java.util.ResourceBundle p0)`
- `public java.lang.String getMessageCode()`
- `public org.w3c.dom.Node getNode()`
- `public java.lang.Object getObject()`
- `public int getOffset()`
- `public org.jvnet.jaxb2_commons.locator.ObjectLocator getParentLocator()`
- `public org.jvnet.jaxb2_commons.locator.ObjectLocator[] getPath()`
- `public java.lang.String getPathAsString()`
- `protected abstract java.lang.String getStepAsString()`
- `public java.net.URL getURL()`
- `public org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(int p0, java.lang.Object p1)`
- `public org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(java.lang.String p0, java.lang.Object p1)`
- `public java.lang.String toString()`

---

## public final class `org.jvnet.jaxb2_commons.locator.DefaultItemObjectLocator`
extends `org.jvnet.jaxb2_commons.locator.AbstractObjectLocator`  
implements `org.jvnet.jaxb2_commons.locator.ItemObjectLocator`  

**Methods:**
- `public int getIndex()`
- `public java.lang.Object[] getMessageParameters()`

---

## public final class `org.jvnet.jaxb2_commons.locator.DefaultPropertyObjectLocator`
extends `org.jvnet.jaxb2_commons.locator.AbstractObjectLocator`  
implements `org.jvnet.jaxb2_commons.locator.PropertyObjectLocator`  

**Methods:**
- `public java.lang.Object[] getMessageParameters()`
- `public java.lang.String getPropertyName()`

---

## public final class `org.jvnet.jaxb2_commons.locator.DefaultRootObjectLocator`
extends `org.jvnet.jaxb2_commons.locator.AbstractObjectLocator`  
implements `org.jvnet.jaxb2_commons.locator.RootObjectLocator`  

**Constructors:**
- `public DefaultRootObjectLocator(java.lang.Object p0)`

**Methods:**
- `public java.lang.Object[] getMessageParameters()`

---

## public abstract interface `org.jvnet.jaxb2_commons.locator.ItemObjectLocator`
implements `org.jvnet.jaxb2_commons.locator.ObjectLocator`  

**Methods:**
- `public abstract int getIndex()`
- `public abstract java.lang.Object getObject()`

---

## public abstract interface `org.jvnet.jaxb2_commons.locator.ObjectLocator`
implements `javax.xml.bind.ValidationEventLocator`, `org.jvnet.jaxb2_commons.i18n.Reportable`  

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.locator.ObjectLocator getParentLocator()`
- `public abstract org.jvnet.jaxb2_commons.locator.ObjectLocator[] getPath()`
- `public abstract java.lang.String getPathAsString()`
- `public abstract org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(int p0, java.lang.Object p1)`
- `public abstract org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(java.lang.String p0, java.lang.Object p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.locator.PropertyObjectLocator`
implements `org.jvnet.jaxb2_commons.locator.ObjectLocator`  

**Methods:**
- `public abstract java.lang.Object getObject()`
- `public abstract java.lang.String getPropertyName()`

---

## public abstract interface `org.jvnet.jaxb2_commons.locator.RootObjectLocator`
implements `org.jvnet.jaxb2_commons.locator.ObjectLocator`  

---

## public class `org.jvnet.jaxb2_commons.locator.util.LocatorUtils`

**Methods:**
- `public static java.lang.String getLocation(org.xml.sax.Locator p0)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, boolean p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, byte p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, char p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, double p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, float p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, int p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, java.lang.Object p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, long p2)`
- `public static org.jvnet.jaxb2_commons.locator.ItemObjectLocator item(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, int p1, short p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, boolean p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, byte p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, char p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, double p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, float p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, int p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, java.lang.Object p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, long p2)`
- `public static org.jvnet.jaxb2_commons.locator.PropertyObjectLocator property(org.jvnet.jaxb2_commons.locator.ObjectLocator p0, java.lang.String p1, short p2)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.AfterMarshallCallback`

**Methods:**
- `public abstract void afterMarshal(javax.xml.bind.Marshaller p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.AfterUnmarshallCallback`

**Methods:**
- `public abstract void afterUnmarshal(javax.xml.bind.Unmarshaller p0, java.lang.Object p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.BeforeMarshallCallback`

**Methods:**
- `public abstract void beforeMarshal(javax.xml.bind.Marshaller p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.BeforeUnmarshallCallback`

**Methods:**
- `public abstract void beforeUnmarshal(javax.xml.bind.Unmarshaller p0, java.lang.Object p1)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.ContextPathAware`

**Methods:**
- `public abstract java.lang.String getContextPath()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.annotation.adapters.CommaDelimitedStringAdapter`
extends `javax.xml.bind.annotation.adapters.XmlAdapter`  

**Constructors:**
- `public CommaDelimitedStringAdapter()`

**Methods:**
- `public java.lang.String marshal(java.util.List p0) throws java.lang.Exception`
- `public java.util.List unmarshal(java.lang.String p0) throws java.lang.Exception`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MAnyAttributePropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MAnyElementPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MMixable`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MWildcard`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MAttributePropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSingleTypePropertyInfo<T,C>`  

**Methods:**
- `public abstract javax.xml.namespace.QName getAttributeName()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin>`  

**Methods:**
- `public abstract void addProperty(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo p0)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo createElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, javax.xml.namespace.QName p1)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo getBaseTypeInfo()`
- `public abstract javax.xml.namespace.QName getElementName()`
- `public abstract java.util.List getProperties()`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo getProperty(java.lang.String p0)`
- `public abstract void removeProperty(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MClassRef`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassRefOrigin>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo`<T extends java.lang.Object, C extends T, O extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MContainer`, `org.jvnet.jaxb2_commons.xml.bind.model.MPackagedTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<O>`  

**Methods:**
- `public abstract <V extends java.lang.Object> V acceptClassTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfoVisitor p0)`
- `public abstract C getTargetType()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>

**Methods:**
- `public abstract V visitClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public abstract V visitClassRef(org.jvnet.jaxb2_commons.xml.bind.model.MClassRef p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MContained`

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer()`
- `public abstract java.lang.String getContainerLocalName(java.lang.String p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MContainer`
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPackaged`  

**Methods:**
- `public abstract java.lang.String getContainerLocalName(java.lang.String p0)`
- `public abstract java.lang.String getLocalName()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizable`

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MCustomization`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations`

**Methods:**
- `public abstract void addCustomization(org.jvnet.jaxb2_commons.xml.bind.model.MCustomization p0)`
- `public abstract java.util.List getCustomizations()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MDefaultValue`

**Methods:**
- `public abstract java.lang.String getDefaultValue()`
- `public abstract javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElement`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MContained`, `org.jvnet.jaxb2_commons.xml.bind.model.MContainer`, `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin>`, `org.jvnet.jaxb2_commons.xml.bind.model.MPackaged`  

**Methods:**
- `public abstract javax.xml.namespace.QName getElementName()`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getScope()`
- `public abstract javax.xml.namespace.QName getSubstitutionHead()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin>`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MWrappable`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementRefPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin>`, `org.jvnet.jaxb2_commons.xml.bind.model.MMixable`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MWildcard`, `org.jvnet.jaxb2_commons.xml.bind.model.MWrappable`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementRefsPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfos<T,C,org.jvnet.jaxb2_commons.xml.bind.model.MElement<T,C>,org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin>`, `org.jvnet.jaxb2_commons.xml.bind.model.MMixable`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MWildcard`, `org.jvnet.jaxb2_commons.xml.bind.model.MWrappable`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo`<T extends java.lang.Object, C extends T, O extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MDefaultValue`, `org.jvnet.jaxb2_commons.xml.bind.model.MNillable`, `org.jvnet.jaxb2_commons.xml.bind.model.MTyped<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<O>`  

**Methods:**
- `public abstract javax.xml.namespace.QName getElementName()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfos`<T extends java.lang.Object, C extends T, M extends org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T, C, O>, O extends java.lang.Object>

**Methods:**
- `public abstract java.util.List getElementTypeInfos()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeRef`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MElementsPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfos<T,C,org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeRef<T,C>,org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin>`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MWrappable`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo`<T extends java.lang.Object, C extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin>`  

**Methods:**
- `public abstract java.lang.String getLexicalValue()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPackagedTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin>`  

**Methods:**
- `public abstract void addEnumConstantInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo p0)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo createElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, javax.xml.namespace.QName p1)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getBaseTypeInfo()`
- `public abstract java.util.List getConstants()`
- `public abstract javax.xml.namespace.QName getElementName()`
- `public abstract C getTargetClass()`
- `public abstract void removeEnumConstantInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MID`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`  

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getValueTypeInfo()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MIDREF`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`  

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getValueTypeInfo()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MIDREFS`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MList<T,C>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MList`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`  

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getItemTypeInfo()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MMixable`

**Methods:**
- `public abstract boolean isMixed()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MModelInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizable`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin>`  

**Methods:**
- `public abstract void addBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo p0)`
- `public abstract void addClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public abstract void addElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo p0)`
- `public abstract void addEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`
- `public abstract java.util.Collection getBuiltinLeafInfos()`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getClassInfo(java.lang.String p0)`
- `public abstract java.util.Collection getClassInfos()`
- `public abstract java.util.Collection getElementInfos()`
- `public abstract java.util.Collection getEnumLeafInfos()`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo getGlobalElementInfo(javax.xml.namespace.QName p0)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(javax.xml.namespace.QName p0)`
- `public abstract java.util.Collection getTypeInfos()`
- `public abstract void removeClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public abstract void removeElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo p0)`
- `public abstract void removeEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MNillable`

**Methods:**
- `public abstract boolean isNillable()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo`
implements `org.jvnet.jaxb2_commons.xml.bind.model.MContainer`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MPackageInfoOrigin>`  

**Methods:**
- `public abstract java.lang.String getPackageName()`
- `public abstract java.lang.String getPackagedName(java.lang.String p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MPackaged`

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MPackagedTypeInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MContained`, `org.jvnet.jaxb2_commons.xml.bind.model.MPackaged`, `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`  

**Methods:**
- `public abstract java.lang.String getLocalName()`
- `public abstract java.lang.String getName()`

---

## public abstract class `org.jvnet.jaxb2_commons.xml.bind.model.MPackagedTypeInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor<T,C,V>`  

**Constructors:**
- `public MPackagedTypeInfoVisitor()`

**Methods:**
- `public V visitBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo p0)`
- `public V visitClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public V visitEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`
- `public V visitID(org.jvnet.jaxb2_commons.xml.bind.model.MID p0)`
- `public V visitIDREF(org.jvnet.jaxb2_commons.xml.bind.model.MIDREF p0)`
- `public V visitIDREFS(org.jvnet.jaxb2_commons.xml.bind.model.MIDREFS p0)`
- `public V visitList(org.jvnet.jaxb2_commons.xml.bind.model.MList p0)`
- `public abstract V visitPackagedTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.MPackagedTypeInfo p0)`
- `public V visitWildcardTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.MWildcardTypeInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin>`  

**Methods:**
- `public abstract <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getClassInfo()`
- `public abstract java.lang.String getPrivateName()`
- `public abstract java.lang.String getPublicName()`
- `public abstract boolean isCollection()`
- `public abstract boolean isRequired()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>

**Methods:**
- `public abstract V visitAnyAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyAttributePropertyInfo p0)`
- `public abstract V visitAnyElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyElementPropertyInfo p0)`
- `public abstract V visitAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAttributePropertyInfo p0)`
- `public abstract V visitElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo p0)`
- `public abstract V visitElementRefPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefPropertyInfo p0)`
- `public abstract V visitElementRefsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefsPropertyInfo p0)`
- `public abstract V visitElementsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementsPropertyInfo p0)`
- `public abstract V visitValuePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MValuePropertyInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MSingleTypePropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MDefaultValue`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.MTyped<T,C>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MSourced`<S extends java.lang.Object>

**Methods:**
- `public abstract S getSource()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MTargeted`<T extends java.lang.Object>

**Methods:**
- `public abstract T getTarget()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MTransientPropertyInfo`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizable`  

**Methods:**
- `public abstract <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public abstract T getTargetType()`
- `public abstract javax.xml.namespace.QName getTypeName()`
- `public abstract boolean isSimpleType()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfoVisitor<T,C,V>`  

**Methods:**
- `public abstract V visitBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo p0)`
- `public abstract V visitEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`
- `public abstract V visitID(org.jvnet.jaxb2_commons.xml.bind.model.MID p0)`
- `public abstract V visitIDREF(org.jvnet.jaxb2_commons.xml.bind.model.MIDREF p0)`
- `public abstract V visitIDREFS(org.jvnet.jaxb2_commons.xml.bind.model.MIDREFS p0)`
- `public abstract V visitList(org.jvnet.jaxb2_commons.xml.bind.model.MList p0)`
- `public abstract V visitWildcardTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.MWildcardTypeInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MTyped`<T extends java.lang.Object, C extends T>

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MValuePropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSingleTypePropertyInfo<T,C>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MWildcard`

**Methods:**
- `public abstract boolean isDomAllowed()`
- `public abstract boolean isTypedObjectAllowed()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MWildcardTypeInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo<T,C>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated<org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.MWrappable`

**Methods:**
- `public abstract javax.xml.namespace.QName getWrapperElementName()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMAnyAttributePropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MAnyAttributePropertyInfo<T,C>`  

**Constructors:**
- `public CMAnyAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMAnyElementPropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MAnyElementPropertyInfo<T,C>`  

**Constructors:**
- `public CMAnyElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public boolean isDomAllowed()`
- `public boolean isMixed()`
- `public boolean isTypedObjectAllowed()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMAttributePropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMSingleTypePropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MAttributePropertyInfo<T,C>`  

**Constructors:**
- `public CMAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p3, javax.xml.namespace.QName p4, boolean p5, java.lang.String p6, javax.xml.namespace.NamespaceContext p7)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public javax.xml.namespace.QName getAttributeName()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMBuiltinLeafInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo<T,C>`  

**Constructors:**
- `public CMBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin p0, T p1, javax.xml.namespace.QName p2)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin getOrigin()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMClassInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo<T,C>`  

**Constructors:**
- `public CMClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin p0, C p1, org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p2, org.jvnet.jaxb2_commons.xml.bind.model.MContainer p3, java.lang.String p4, org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo p5, javax.xml.namespace.QName p6, javax.xml.namespace.QName p7)`

**Methods:**
- `public <V extends java.lang.Object> V acceptClassTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfoVisitor p0)`
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public void addProperty(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo createElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, javax.xml.namespace.QName p1)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo getBaseTypeInfo()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer()`
- `public java.lang.String getContainerLocalName(java.lang.String p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public javax.xml.namespace.QName getElementName()`
- `public java.lang.String getLocalName()`
- `public java.lang.String getName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`
- `public java.util.List getProperties()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo getProperty(java.lang.String p0)`
- `public C getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`
- `public void removeProperty(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo p0)`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMClassRef`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MClassRef<T,C>`  

**Constructors:**
- `public CMClassRef(org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassRefOrigin p0, C p1, java.lang.Class p2, org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p3, org.jvnet.jaxb2_commons.xml.bind.model.MContainer p4, java.lang.String p5)`

**Methods:**
- `public <V extends java.lang.Object> V acceptClassTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfoVisitor p0)`
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer()`
- `public java.lang.String getContainerLocalName(java.lang.String p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public java.lang.String getLocalName()`
- `public java.lang.String getName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassRefOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`
- `public C getTargetClass()`
- `public C getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMCustomization`
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomization`  

**Constructors:**
- `public CMCustomization(org.w3c.dom.Element p0)`

**Methods:**
- `public org.w3c.dom.Element getElement()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMCustomizations`
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations`  

**Constructors:**
- `public CMCustomizations()`

**Methods:**
- `public void addCustomization(org.jvnet.jaxb2_commons.xml.bind.model.MCustomization p0)`
- `public java.util.List getCustomizations()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElement`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementTypeInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElement<T,C>`  

**Constructors:**
- `public CMElement(org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin p0, javax.xml.namespace.QName p1, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p2, boolean p3, java.lang.String p4, javax.xml.namespace.NamespaceContext p5)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo<T,C>`  

**Constructors:**
- `public CMElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p1, org.jvnet.jaxb2_commons.xml.bind.model.MContainer p2, java.lang.String p3, javax.xml.namespace.QName p4, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p5, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p6, javax.xml.namespace.QName p7, java.lang.String p8, javax.xml.namespace.NamespaceContext p9)`

**Methods:**
- `public org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer()`
- `public java.lang.String getContainerLocalName(java.lang.String p0)`
- `public java.lang.String getDefaultValue()`
- `public javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`
- `public javax.xml.namespace.QName getElementName()`
- `public java.lang.String getLocalName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getScope()`
- `public javax.xml.namespace.QName getSubstitutionHead()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`
- `public boolean isNillable()`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementPropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo<T,C>`  

**Constructors:**
- `public CMElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p5, javax.xml.namespace.QName p6, javax.xml.namespace.QName p7, boolean p8, java.lang.String p9, javax.xml.namespace.NamespaceContext p10)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public java.lang.String getDefaultValue()`
- `public javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`
- `public javax.xml.namespace.QName getElementName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`
- `public javax.xml.namespace.QName getWrapperElementName()`
- `public boolean isNillable()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementRefPropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementRefPropertyInfo<T,C>`  

**Constructors:**
- `public CMElementRefPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p5, javax.xml.namespace.QName p6, javax.xml.namespace.QName p7, boolean p8, boolean p9, boolean p10, java.lang.String p11, javax.xml.namespace.NamespaceContext p12)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public java.lang.String getDefaultValue()`
- `public javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`
- `public javax.xml.namespace.QName getElementName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`
- `public javax.xml.namespace.QName getWrapperElementName()`
- `public boolean isDomAllowed()`
- `public boolean isMixed()`
- `public boolean isNillable()`
- `public boolean isTypedObjectAllowed()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementRefsPropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementRefsPropertyInfo<T,C>`  

**Constructors:**
- `public CMElementRefsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4, java.util.Collection p5, javax.xml.namespace.QName p6, boolean p7, boolean p8, boolean p9)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public java.util.List getElementTypeInfos()`
- `public javax.xml.namespace.QName getWrapperElementName()`
- `public boolean isDomAllowed()`
- `public boolean isMixed()`
- `public boolean isTypedObjectAllowed()`

---

## public abstract class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementTypeInfo`<T extends java.lang.Object, C extends T, O extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeInfo<T,C,O>`  

**Constructors:**
- `public CMElementTypeInfo(O p0, javax.xml.namespace.QName p1, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p2, boolean p3, java.lang.String p4, javax.xml.namespace.NamespaceContext p5)`

**Methods:**
- `public java.lang.String getDefaultValue()`
- `public javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`
- `public javax.xml.namespace.QName getElementName()`
- `public O getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`
- `public boolean isNillable()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementTypeRef`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementTypeInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementTypeRef<T,C>`  

**Constructors:**
- `public CMElementTypeRef(org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin p0, javax.xml.namespace.QName p1, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p2, boolean p3, java.lang.String p4, javax.xml.namespace.NamespaceContext p5)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMElementsPropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MElementsPropertyInfo<T,C>`  

**Constructors:**
- `public CMElementsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4, java.util.Collection p5, javax.xml.namespace.QName p6)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`
- `public java.util.List getElementTypeInfos()`
- `public javax.xml.namespace.QName getWrapperElementName()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMEnumConstantInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo<T,C>`  

**Constructors:**
- `public CMEnumConstantInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p1, java.lang.String p2)`

**Methods:**
- `public org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo getEnumLeafInfo()`
- `public java.lang.String getLexicalValue()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin getOrigin()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMEnumLeafInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizable`, `org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo<T,C>`  

**Constructors:**
- `public CMEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin p0, C p1, org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p2, org.jvnet.jaxb2_commons.xml.bind.model.MContainer p3, java.lang.String p4, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p5, javax.xml.namespace.QName p6, javax.xml.namespace.QName p7)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public void addEnumConstantInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo createElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, javax.xml.namespace.QName p1)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getBaseTypeInfo()`
- `public java.util.List getConstants()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer()`
- `public java.lang.String getContainerLocalName(java.lang.String p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public javax.xml.namespace.QName getElementName()`
- `public java.lang.String getLocalName()`
- `public java.lang.String getName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`
- `public C getTargetClass()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`
- `public void removeEnumConstantInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumConstantInfo p0)`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMID`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MID<T,C>`  

**Constructors:**
- `public CMID(T p0, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p1)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getValueTypeInfo()`
- `public boolean isSimpleType()`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMIDREF`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MIDREF<T,C>`  

**Constructors:**
- `public CMIDREF(T p0, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p1)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getValueTypeInfo()`
- `public boolean isSimpleType()`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMIDREFS`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMList`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MIDREFS<T,C>`  

**Constructors:**
- `public CMIDREFS(T p0, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p1)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public java.lang.String toString()`

---

## public abstract class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMInfoFactory`<T extends java.lang.Object, C extends T, TIS extends com.sun.xml.bind.v2.model.core.TypeInfoSet<T, C, ? extends java.lang.Object, ? extends java.lang.Object>, TI extends com.sun.xml.bind.v2.model.core.TypeInfo<T, C>, BLI extends com.sun.xml.bind.v2.model.core.BuiltinLeafInfo<T, C>, E extends com.sun.xml.bind.v2.model.core.Element<T, C>, EI extends com.sun.xml.bind.v2.model.core.ElementInfo<T, C>, ELI extends com.sun.xml.bind.v2.model.core.EnumLeafInfo<T, C>, EC extends com.sun.xml.bind.v2.model.core.EnumConstant<T, C>, CI extends com.sun.xml.bind.v2.model.core.ClassInfo<T, C>, PI extends com.sun.xml.bind.v2.model.core.PropertyInfo<T, C>, API extends com.sun.xml.bind.v2.model.core.AttributePropertyInfo<T, C>, VPI extends com.sun.xml.bind.v2.model.core.ValuePropertyInfo<T, C>, EPI extends com.sun.xml.bind.v2.model.core.ElementPropertyInfo<T, C>, RPI extends com.sun.xml.bind.v2.model.core.ReferencePropertyInfo<T, C>, WTI extends com.sun.xml.bind.v2.model.core.WildcardTypeInfo<T, C>, TR extends com.sun.xml.bind.v2.model.core.TypeRef<T, C>>

**Constructors:**
- `public CMInfoFactory(TIS p0)`

**Methods:**
- `protected org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMAnyAttributePropertyInfo createAnyAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin createAnyAttributePropertyInfoOrigin()`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createAnyElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, RPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, API p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MClassTypeInfo createBaseTypeInfo(CI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo createBuiltinLeafInfo(BLI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin createBuiltinLeafInfoOrigin(BLI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo createClassInfo(CI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin createClassInfoOrigin(CI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo createElementInfo(EI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin createElementInfoOrigin(EI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin createElementOrigin(E p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, EPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createElementRefPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, RPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createElementRefsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, RPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin createElementTypeRefOrigin(EPI p0, TR p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createElementsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, EPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin createEnumConstantInfoOrigin(EC p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMEnumConstantInfo createEnumContantInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0, EC p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo createEnumLeafInfo(ELI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin createEnumLeafInfoOrigin(ELI p0)`
- `protected abstract T createListType(T p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MModelInfo createModel()`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin createModelInfoOrigin(TIS p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin createPropertyInfoOrigin(PI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo createValuePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0, VPI p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo createWildcardTypeInfo(WTI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin createWildcardTypeInfoOrigin(WTI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer(CI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer(EI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MContainer getContainer(ELI p0)`
- `protected abstract java.lang.String getDefaultValue(API p0)`
- `protected abstract java.lang.String getDefaultValue(com.sun.xml.bind.v2.model.core.TypeRef p0)`
- `protected abstract javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext(API p0)`
- `protected abstract javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext(com.sun.xml.bind.v2.model.core.TypeRef p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo getElementInfo(EI p0)`
- `protected abstract java.lang.String getLocalName(CI p0)`
- `protected abstract java.lang.String getLocalName(EI p0)`
- `protected abstract java.lang.String getLocalName(ELI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackage(CI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackage(EI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackage(ELI p0)`
- `protected abstract org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getScope(CI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getTypeInfo(CI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(TI p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(com.sun.xml.bind.v2.model.core.AttributePropertyInfo p0)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(com.sun.xml.bind.v2.model.core.ElementPropertyInfo p0, TR p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(com.sun.xml.bind.v2.model.core.PropertyInfo p0, TI p1, boolean p2, com.sun.xml.bind.v2.model.core.Adapter p3, com.sun.xml.bind.v2.model.core.ID p4, javax.activation.MimeType p5)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(com.sun.xml.bind.v2.model.core.ReferencePropertyInfo p0, com.sun.xml.bind.v2.model.core.Element p1)`
- `protected org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(com.sun.xml.bind.v2.model.core.ValuePropertyInfo p0)`
- `public TIS getTypeInfoSet()`
- `protected abstract java.lang.Class loadClass(T p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMList`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MList<T,C>`  

**Constructors:**
- `public CMList(T p0, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p1, javax.xml.namespace.QName p2)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getItemTypeInfo()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`
- `public java.lang.String toString()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMModel`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MModelInfo<T,C>`  

**Constructors:**
- `public CMModel(org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin p0)`

**Methods:**
- `public void addBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo p0)`
- `public void addClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public void addElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo p0)`
- `public void addEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo getBuiltinLeafInfo(javax.xml.namespace.QName p0)`
- `public java.util.Collection getBuiltinLeafInfos()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getClassInfo(java.lang.String p0)`
- `public java.util.Collection getClassInfos()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public java.util.Collection getElementInfos()`
- `public java.util.Map getElementInfosMap()`
- `public java.util.Collection getEnumLeafInfos()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo getGlobalElementInfo(javax.xml.namespace.QName p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo(javax.xml.namespace.QName p0)`
- `public java.util.Collection getTypeInfos()`
- `public void removeClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public void removeElementInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementInfo p0)`
- `public void removeEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPackageInfo`
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo`  

**Constructors:**
- `public CMPackageInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPackageInfoOrigin p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getContainerLocalName(java.lang.String p0)`
- `public java.lang.String getLocalName()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MPackageInfoOrigin getOrigin()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo getPackageInfo()`
- `public java.lang.String getPackageName()`
- `public java.lang.String getPackagedName(java.lang.String p0)`

---

## public abstract class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MCustomizable`, `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo<T,C>`  

**Constructors:**
- `public CMPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, boolean p4)`

**Methods:**
- `public org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo getClassInfo()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin getOrigin()`
- `public java.lang.String getPrivateName()`
- `public java.lang.String getPublicName()`
- `public boolean isCollection()`
- `public boolean isRequired()`

---

## public abstract class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMSingleTypePropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMPropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSingleTypePropertyInfo<T,C>`  

**Constructors:**
- `public CMSingleTypePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, boolean p3, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p4, boolean p5, java.lang.String p6, javax.xml.namespace.NamespaceContext p7)`

**Methods:**
- `public java.lang.String getDefaultValue()`
- `public javax.xml.namespace.NamespaceContext getDefaultValueNamespaceContext()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo getTypeInfo()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMValuePropertyInfo`<T extends java.lang.Object, C extends T>
extends `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMSingleTypePropertyInfo`  
implements `org.jvnet.jaxb2_commons.xml.bind.model.MValuePropertyInfo<T,C>`  

**Constructors:**
- `public CMValuePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin p0, org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p1, java.lang.String p2, org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p3, java.lang.String p4, javax.xml.namespace.NamespaceContext p5)`

**Methods:**
- `public <V extends java.lang.Object> V acceptPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.CMWildcardTypeInfo`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MWildcardTypeInfo<T,C>`  

**Constructors:**
- `public CMWildcardTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin p0, T p1)`

**Methods:**
- `public <V extends java.lang.Object> V acceptTypeInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor p0)`
- `public org.jvnet.jaxb2_commons.xml.bind.model.MCustomizations getCustomizations()`
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin getOrigin()`
- `public T getTargetType()`
- `public javax.xml.namespace.QName getTypeName()`
- `public boolean isSimpleType()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.BuiltinLeafInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, BLI extends com.sun.xml.bind.v2.model.core.BuiltinLeafInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<BLI>`  

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMAnyAttributePropertyInfoOrigin`
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin`  

**Constructors:**
- `public CMAnyAttributePropertyInfoOrigin()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMBuiltinLeafInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, BLI extends com.sun.xml.bind.v2.model.core.BuiltinLeafInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.BuiltinLeafInfoOrigin<T,C,BLI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin`  

**Constructors:**
- `public CMBuiltinLeafInfoOrigin(BLI p0)`

**Methods:**
- `public BLI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMClassElementInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, CI extends com.sun.xml.bind.v2.model.core.ClassInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ClassInfoOrigin<T,C,CI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`  

**Constructors:**
- `public CMClassElementInfoOrigin(CI p0)`

**Methods:**
- `public CI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMClassInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, CI extends com.sun.xml.bind.v2.model.core.ClassInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ClassInfoOrigin<T,C,CI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin`  

**Constructors:**
- `public CMClassInfoOrigin(CI p0)`

**Methods:**
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin createElementInfoOrigin()`
- `public CI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMElementInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, EI extends com.sun.xml.bind.v2.model.core.ElementInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ElementInfoOrigin<T,C,EI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`  

**Constructors:**
- `public CMElementInfoOrigin(EI p0)`

**Methods:**
- `public EI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMElementOrigin`<T extends java.lang.Object, C extends java.lang.Object, E extends com.sun.xml.bind.v2.model.core.Element<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ElementOrigin<T,C,E>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin`  

**Constructors:**
- `public CMElementOrigin(E p0)`

**Methods:**
- `public E getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMElementTypeRefOrigin`<T extends java.lang.Object, C extends java.lang.Object, EPI extends com.sun.xml.bind.v2.model.core.ElementPropertyInfo<T, C>, TR extends com.sun.xml.bind.v2.model.core.TypeRef<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin`  

**Constructors:**
- `public CMElementTypeRefOrigin(EPI p0, TR p1)`

**Methods:**
- `public EPI getSource()`
- `public TR getTypeRef()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMEnumConstantInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, ECI extends com.sun.xml.bind.v2.model.core.EnumConstant<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.EnumConstantOrigin<T,C,ECI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin`  

**Constructors:**
- `public CMEnumConstantInfoOrigin(ECI p0)`

**Methods:**
- `public ECI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMEnumElementInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, ELI extends com.sun.xml.bind.v2.model.core.EnumLeafInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.EnumLeafInfoOrigin<T,C,ELI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`  

**Constructors:**
- `public CMEnumElementInfoOrigin(ELI p0)`

**Methods:**
- `public ELI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMEnumLeafInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, ELI extends com.sun.xml.bind.v2.model.core.EnumLeafInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.EnumLeafInfoOrigin<T,C,ELI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin`  

**Constructors:**
- `public CMEnumLeafInfoOrigin(ELI p0)`

**Methods:**
- `public org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin createElementInfoOrigin()`
- `public ELI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMModelInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, TIS extends com.sun.xml.bind.v2.model.core.TypeInfoSet<T, C, ? extends java.lang.Object, ? extends java.lang.Object>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.TypeInfoSetOrigin<T,C,TIS>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin`  

**Constructors:**
- `public CMModelInfoOrigin(TIS p0)`

**Methods:**
- `public TIS getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMPackageInfoOrigin`
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MPackageInfoOrigin`  

**Constructors:**
- `public CMPackageInfoOrigin()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMPropertyInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, PI extends com.sun.xml.bind.v2.model.core.PropertyInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.PropertyInfoOrigin<T,C,PI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin`  

**Constructors:**
- `public CMPropertyInfoOrigin(PI p0)`

**Methods:**
- `public PI getSource()`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.CMWildcardTypeInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, WTI extends com.sun.xml.bind.v2.model.core.WildcardTypeInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.WildcardTypeInfoOrigin<T,C,WTI>`, `org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin`  

**Constructors:**
- `public CMWildcardTypeInfoOrigin(WTI p0)`

**Methods:**
- `public WTI getSource()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ClassInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, CI extends com.sun.xml.bind.v2.model.core.ClassInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<CI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ElementInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, EI extends com.sun.xml.bind.v2.model.core.ElementInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<EI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.ElementOrigin`<T extends java.lang.Object, C extends java.lang.Object, E extends com.sun.xml.bind.v2.model.core.Element<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<E>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.EnumConstantOrigin`<T extends java.lang.Object, C extends java.lang.Object, ECI extends com.sun.xml.bind.v2.model.core.EnumConstant<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<ECI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.EnumLeafInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, ELI extends com.sun.xml.bind.v2.model.core.EnumLeafInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<ELI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.PropertyInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, PI extends com.sun.xml.bind.v2.model.core.PropertyInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<PI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.TypeInfoSetOrigin`<T extends java.lang.Object, C extends java.lang.Object, TIS extends com.sun.xml.bind.v2.model.core.TypeInfoSet<T, C, ? extends java.lang.Object, ? extends java.lang.Object>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<TIS>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.concrete.origin.WildcardTypeInfoOrigin`<T extends java.lang.Object, C extends java.lang.Object, WTI extends com.sun.xml.bind.v2.model.core.WildcardTypeInfo<T, C>>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MSourced<WTI>`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MBuiltinLeafInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassInfoOrigin`

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin createElementInfoOrigin()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MClassRefOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementOrigin`
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementTypeRefOrigin`
implements `org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin`  

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumConstantInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MEnumLeafInfoOrigin`

**Methods:**
- `public abstract org.jvnet.jaxb2_commons.xml.bind.model.origin.MElementInfoOrigin createElementInfoOrigin()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MModelInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MOriginated`<O extends java.lang.Object>

**Methods:**
- `public abstract O getOrigin()`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MPackageInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.origin.MWildcardTypeInfoOrigin`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.util.DefaultPropertyInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor<T,C,V>`  

**Constructors:**
- `public DefaultPropertyInfoVisitor()`

**Methods:**
- `public V visitAnyAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyAttributePropertyInfo p0)`
- `public V visitAnyElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyElementPropertyInfo p0)`
- `public V visitAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAttributePropertyInfo p0)`
- `public V visitElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo p0)`
- `public V visitElementRefPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefPropertyInfo p0)`
- `public V visitElementRefsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefsPropertyInfo p0)`
- `public V visitElementsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementsPropertyInfo p0)`
- `public V visitPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfo p0)`
- `public V visitValuePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MValuePropertyInfo p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.util.DefaultTypeInfoVisitor`<T extends java.lang.Object, C extends T, V extends java.lang.Object>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfoVisitor<T,C,V>`  

**Constructors:**
- `public DefaultTypeInfoVisitor()`

**Methods:**
- `public V visitBuiltinLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MBuiltinLeafInfo p0)`
- `public V visitClassInfo(org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo p0)`
- `public V visitClassRef(org.jvnet.jaxb2_commons.xml.bind.model.MClassRef p0)`
- `public V visitEnumLeafInfo(org.jvnet.jaxb2_commons.xml.bind.model.MEnumLeafInfo p0)`
- `public V visitID(org.jvnet.jaxb2_commons.xml.bind.model.MID p0)`
- `public V visitIDREF(org.jvnet.jaxb2_commons.xml.bind.model.MIDREF p0)`
- `public V visitIDREFS(org.jvnet.jaxb2_commons.xml.bind.model.MIDREFS p0)`
- `public V visitList(org.jvnet.jaxb2_commons.xml.bind.model.MList p0)`
- `public V visitTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo p0)`
- `public V visitWildcardTypeInfo(org.jvnet.jaxb2_commons.xml.bind.model.MWildcardTypeInfo p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.util.PackageInfoQNameAnalyzer`<T extends java.lang.Object, C extends T>

**Constructors:**
- `public PackageInfoQNameAnalyzer(org.jvnet.jaxb2_commons.xml.bind.model.MModelInfo p0)`

**Methods:**
- `public java.lang.String getMostUsedAttributeNamespaceURI(org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p0)`
- `public java.lang.String getMostUsedElementNamespaceURI(org.jvnet.jaxb2_commons.xml.bind.model.MPackageInfo p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.util.QNameCollectingPropertyInfoVisitor`<T extends java.lang.Object, C extends T>
implements `org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor<T,C,java.lang.Void>`  

**Constructors:**
- `public QNameCollectingPropertyInfoVisitor(org.jvnet.jaxb2_commons.xml.bind.model.util.QNameCollector p0)`

**Methods:**
- `public java.lang.Void visitAnyAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyAttributePropertyInfo p0)`
- `public java.lang.Void visitAnyElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAnyElementPropertyInfo p0)`
- `public java.lang.Void visitAttributePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MAttributePropertyInfo p0)`
- `public java.lang.Void visitElementPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo p0)`
- `public java.lang.Void visitElementRefPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefPropertyInfo p0)`
- `public java.lang.Void visitElementRefsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementRefsPropertyInfo p0)`
- `public java.lang.Void visitElementsPropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MElementsPropertyInfo p0)`
- `public java.lang.Void visitValuePropertyInfo(org.jvnet.jaxb2_commons.xml.bind.model.MValuePropertyInfo p0)`

---

## public abstract interface `org.jvnet.jaxb2_commons.xml.bind.model.util.QNameCollector`

**Methods:**
- `public abstract void attribute(javax.xml.namespace.QName p0)`
- `public abstract void element(javax.xml.namespace.QName p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.bind.model.util.XmlTypeUtils`

**Methods:**
- `public static javax.xml.namespace.QName getTypeName(java.lang.Class p0)`

---

## public class `org.jvnet.jaxb2_commons.xml.namespace.util.QNameUtils`

**Methods:**
- `public static java.lang.String getKey(javax.xml.namespace.QName p0)`

---

## public class `org.jvnet.jaxb2_commons.xmlschema.XmlSchemaConstants`

**Constructors:**
- `public XmlSchemaConstants()`

**Fields:**
- `public final static javax.xml.namespace.QName ANYSIMPLETYPE`
- `public final static javax.xml.namespace.QName ANYTYPE`
- `public final static javax.xml.namespace.QName ANYURI`
- `public final static javax.xml.namespace.QName BASE64BINARY`
- `public final static javax.xml.namespace.QName BOOLEAN`
- `public final static javax.xml.namespace.QName BYTE`
- `public final static javax.xml.namespace.QName CALENDAR`
- `public final static javax.xml.namespace.QName DATE`
- `public final static javax.xml.namespace.QName DATETIME`
- `public final static javax.xml.namespace.QName DECIMAL`
- `public final static javax.xml.namespace.QName DOUBLE`
- `public final static javax.xml.namespace.QName DURATION`
- `public final static javax.xml.namespace.QName ENTITIES`
- `public final static javax.xml.namespace.QName ENTITY`
- `public final static javax.xml.namespace.QName FLOAT`
- `public final static javax.xml.namespace.QName GDAY`
- `public final static javax.xml.namespace.QName GMONTH`
- `public final static javax.xml.namespace.QName GMONTHDAY`
- `public final static javax.xml.namespace.QName GYEAR`
- `public final static javax.xml.namespace.QName GYEARMONTH`
- `public final static javax.xml.namespace.QName HEXBINARY`
- `public final static javax.xml.namespace.QName ID`
- `public final static javax.xml.namespace.QName IDREF`
- `public final static javax.xml.namespace.QName IDREFS`
- `public final static javax.xml.namespace.QName INT`
- `public final static javax.xml.namespace.QName INTEGER`
- `public final static javax.xml.namespace.QName LANGUAGE`
- `public final static javax.xml.namespace.QName LONG`
- `public final static javax.xml.namespace.QName NAME`
- `public final static java.lang.String NAMESPACE_URI`
- `public final static javax.xml.namespace.QName NCNAME`
- `public final static javax.xml.namespace.QName NEGATIVEINTEGER`
- `public final static javax.xml.namespace.QName NMTOKEN`
- `public final static javax.xml.namespace.QName NMTOKENS`
- `public final static javax.xml.namespace.QName NONNEGATIVEINTEGER`
- `public final static javax.xml.namespace.QName NONPOSITIVEINTEGER`
- `public final static javax.xml.namespace.QName NORMALIZEDSTRING`
- `public final static javax.xml.namespace.QName NOTATION`
- `public final static javax.xml.namespace.QName POSITIVEINTEGER`
- `public final static javax.xml.namespace.QName QNAME`
- `public final static javax.xml.namespace.QName SHORT`
- `public final static javax.xml.namespace.QName STRING`
- `public final static javax.xml.namespace.QName TIME`
- `public final static javax.xml.namespace.QName TOKEN`
- `public final static javax.xml.namespace.QName[] TYPE_NAMES`
- `public final static javax.xml.namespace.QName UNSIGNEDBYTE`
- `public final static javax.xml.namespace.QName UNSIGNEDINT`
- `public final static javax.xml.namespace.QName UNSIGNEDLONG`
- `public final static javax.xml.namespace.QName UNSIGNEDSHORT`

**Methods:**
- `public static javax.xml.namespace.QName xsd(java.lang.String p0)`

---

