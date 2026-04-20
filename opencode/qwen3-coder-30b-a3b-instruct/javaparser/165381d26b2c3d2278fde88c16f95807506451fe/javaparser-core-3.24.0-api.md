# API Specification: com.github.javaparser:javaparser-core 3.24.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `com.github.javaparser.AbstractCharStream`
implements `com.github.javaparser.CharStream`  

**Constructors:**
- `public AbstractCharStream(int p0, int p1, int p2)`

**Fields:**
- `public final static int DEFAULT_BUF_SIZE`
- `protected int available`
- `protected char[] buffer`
- `protected int bufpos`
- `protected int bufsize`
- `protected int inBuf`
- `protected int maxNextCharInd`
- `protected int tokenBegin`

**Methods:**
- `public final void adjustBeginLineColumn(int p0, int p1)`
- `public void backup(int p0)`
- `public char beginToken() throws java.io.IOException`
- `public void done()`
- `protected void expandBuff(boolean p0)`
- `protected void fillBuff() throws java.io.IOException`
- `public int getBeginColumn()`
- `public int getBeginLine()`
- `protected int getBufSizeAfterExpansion()`
- `protected final int getColumn()`
- `public int getEndColumn()`
- `public int getEndLine()`
- `public java.lang.String getImage()`
- `protected final int getLine()`
- `public char[] getSuffix(int p0)`
- `public final int getTabSize()`
- `protected final void internalAdjustBuffSize()`
- `protected final void internalSetBufLineColumn(int p0, int p1)`
- `protected final void internalUpdateLineColumn(char p0)`
- `public final boolean isTrackLineColumn()`
- `public final void reInit(int p0, int p1, int p2)`
- `public char readChar() throws java.io.IOException`
- `public final void setTabSize(int p0)`
- `public final void setTrackLineColumn(boolean p0)`
- `protected abstract void streamClose() throws java.io.IOException`
- `protected abstract int streamRead(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract interface `com.github.javaparser.CharStream`

**Methods:**
- `public abstract void backup(int p0)`
- `public abstract char beginToken() throws java.io.IOException`
- `public abstract void done()`
- `public abstract int getBeginColumn()`
- `public abstract int getBeginLine()`
- `public abstract int getEndColumn()`
- `public abstract int getEndLine()`
- `public abstract java.lang.String getImage()`
- `public abstract char[] getSuffix(int p0)`
- `public abstract int getTabSize()`
- `public abstract boolean isTrackLineColumn()`
- `public abstract char readChar() throws java.io.IOException`
- `public abstract void setTabSize(int p0)`
- `public abstract void setTrackLineColumn(boolean p0)`

---

## public abstract interface `com.github.javaparser.GeneratedJavaParserConstants`

**Fields:**
- `public final static int ABSTRACT`
- `public final static int ANDASSIGN`
- `public final static int ARROW`
- `public final static int ASSERT`
- `public final static int ASSIGN`
- `public final static int AT`
- `public final static int BANG`
- `public final static int BINARY_LITERAL`
- `public final static int BIT_AND`
- `public final static int BIT_OR`
- `public final static int BOOLEAN`
- `public final static int BREAK`
- `public final static int BYTE`
- `public final static int CASE`
- `public final static int CATCH`
- `public final static int CHAR`
- `public final static int CHARACTER_LITERAL`
- `public final static int CLASS`
- `public final static int COLON`
- `public final static int COMMA`
- `public final static int COMMENT_CONTENT`
- `public final static int CONST`
- `public final static int CONTINUE`
- `public final static int CTRL_Z`
- `public final static int DECIMAL_EXPONENT`
- `public final static int DECIMAL_FLOATING_POINT_LITERAL`
- `public final static int DECIMAL_LITERAL`
- `public final static int DECR`
- `public final static int DEFAULT`
- `public final static int DO`
- `public final static int DOT`
- `public final static int DOUBLE`
- `public final static int DOUBLECOLON`
- `public final static int ELLIPSIS`
- `public final static int ELSE`
- `public final static int ENTER_JAVADOC_COMMENT`
- `public final static int ENTER_MULTILINE_COMMENT`
- `public final static int ENTER_TEXT_BLOCK`
- `public final static int ENUM`
- `public final static int EOF`
- `public final static int EQ`
- `public final static int EXPORTS`
- `public final static int EXTENDS`
- `public final static int FALSE`
- `public final static int FINAL`
- `public final static int FINALLY`
- `public final static int FLOAT`
- `public final static int FLOATING_POINT_LITERAL`
- `public final static int FOR`
- `public final static int GE`
- `public final static int GOTO`
- `public final static int GT`
- `public final static int HEXADECIMAL_EXPONENT`
- `public final static int HEXADECIMAL_FLOATING_POINT_LITERAL`
- `public final static int HEX_DIGITS`
- `public final static int HEX_LITERAL`
- `public final static int HOOK`
- `public final static int IDENTIFIER`
- `public final static int IF`
- `public final static int IMPLEMENTS`
- `public final static int IMPORT`
- `public final static int INCR`
- `public final static int INSTANCEOF`
- `public final static int INT`
- `public final static int INTEGER_LITERAL`
- `public final static int INTERFACE`
- `public final static int IN_JAVADOC_COMMENT`
- `public final static int IN_MULTI_LINE_COMMENT`
- `public final static int IN_TEXT_BLOCK`
- `public final static int JAVADOC_COMMENT`
- `public final static int LBRACE`
- `public final static int LBRACKET`
- `public final static int LE`
- `public final static int LETTER`
- `public final static int LONG`
- `public final static int LONG_LITERAL`
- `public final static int LPAREN`
- `public final static int LSHIFT`
- `public final static int LSHIFTASSIGN`
- `public final static int LT`
- `public final static int MINUS`
- `public final static int MINUSASSIGN`
- `public final static int MODULE`
- `public final static int MULTI_LINE_COMMENT`
- `public final static int NATIVE`
- `public final static int NE`
- `public final static int NEW`
- `public final static int NULL`
- `public final static int OCTAL_LITERAL`
- `public final static int OLD_MAC_EOL`
- `public final static int OPEN`
- `public final static int OPENS`
- `public final static int ORASSIGN`
- `public final static int PACKAGE`
- `public final static int PART_LETTER`
- `public final static int PLUS`
- `public final static int PLUSASSIGN`
- `public final static int PRIVATE`
- `public final static int PROTECTED`
- `public final static int PROVIDES`
- `public final static int PUBLIC`
- `public final static int RBRACE`
- `public final static int RBRACKET`
- `public final static int RECORD`
- `public final static int REM`
- `public final static int REMASSIGN`
- `public final static int REQUIRES`
- `public final static int RETURN`
- `public final static int RPAREN`
- `public final static int RSIGNEDSHIFT`
- `public final static int RSIGNEDSHIFTASSIGN`
- `public final static int RUNSIGNEDSHIFT`
- `public final static int RUNSIGNEDSHIFTASSIGN`
- `public final static int SC_AND`
- `public final static int SC_OR`
- `public final static int SEMICOLON`
- `public final static int SHORT`
- `public final static int SINGLE_LINE_COMMENT`
- `public final static int SLASH`
- `public final static int SLASHASSIGN`
- `public final static int SPACE`
- `public final static int STAR`
- `public final static int STARASSIGN`
- `public final static int STATIC`
- `public final static int STRICTFP`
- `public final static int STRING_LITERAL`
- `public final static int SUPER`
- `public final static int SWITCH`
- `public final static int SYNCHRONIZED`
- `public final static int TEXT_BLOCK_CONTENT`
- `public final static int TEXT_BLOCK_LITERAL`
- `public final static int THIS`
- `public final static int THROW`
- `public final static int THROWS`
- `public final static int TILDE`
- `public final static int TO`
- `public final static int TRANSIENT`
- `public final static int TRANSITIVE`
- `public final static int TRUE`
- `public final static int TRY`
- `public final static int UNICODE_ESCAPE`
- `public final static int UNIX_EOL`
- `public final static int USES`
- `public final static int VOID`
- `public final static int VOLATILE`
- `public final static int WHILE`
- `public final static int WINDOWS_EOL`
- `public final static int WITH`
- `public final static int XOR`
- `public final static int XORASSIGN`
- `public final static int YIELD`
- `public final static int _DEFAULT`
- `public final static java.lang.String[] tokenImage`

---

## public class `com.github.javaparser.GeneratedJavaParserTokenManager`
implements `com.github.javaparser.GeneratedJavaParserConstants`  

**Constructors:**
- `public GeneratedJavaParserTokenManager(com.github.javaparser.SimpleCharStream p0)`
- `public GeneratedJavaParserTokenManager(com.github.javaparser.SimpleCharStream p0, int p1)`

**Fields:**
- `protected int curChar`
- `protected com.github.javaparser.SimpleCharStream input_stream`
- `public final static int[] jjnewLexState`
- `public final static java.lang.String[] jjstrLiteralImages`
- `public final static java.lang.String[] lexStateNames`

**Methods:**
- `public void ReInit(com.github.javaparser.SimpleCharStream p0)`
- `public void ReInit(com.github.javaparser.SimpleCharStream p0, int p1)`
- `public void SwitchTo(int p0)`
- `public com.github.javaparser.Token getNextToken()`
- `protected com.github.javaparser.Token jjFillToken()`
- `public void setStoreTokens(boolean p0)`
- `public void setYieldSupported()`

---

## public abstract interface `com.github.javaparser.HasParentNode`<T extends java.lang.Object>
implements `com.github.javaparser.ast.observer.Observable`  

**Methods:**
- `public default <N extends java.lang.Object> java.util.Optional findAncestor(java.lang.Class p0)`
- `public default <N extends java.lang.Object> java.util.Optional findAncestor(java.lang.Class p0, java.util.function.Predicate p1)`
- `public abstract java.util.Optional getParentNode()`
- `public abstract com.github.javaparser.ast.Node getParentNodeForChildren()`
- `public default boolean hasParentNode()`
- `public default boolean isDescendantOf(com.github.javaparser.ast.Node p0)`
- `public abstract T setParentNode(com.github.javaparser.ast.Node p0)`

---

## public final class `com.github.javaparser.JavaParser`

**Constructors:**
- `public JavaParser()`
- `public JavaParser(com.github.javaparser.ParserConfiguration p0)`

**Methods:**
- `public com.github.javaparser.ParserConfiguration getParserConfiguration()`
- `public <N extends com.github.javaparser.ast.Node> com.github.javaparser.ParseResult parse(com.github.javaparser.ParseStart p0, com.github.javaparser.Provider p1)`
- `public com.github.javaparser.ParseResult parse(java.io.File p0) throws java.io.FileNotFoundException`
- `public com.github.javaparser.ParseResult parse(java.io.File p0, java.nio.charset.Charset p1) throws java.io.FileNotFoundException`
- `public com.github.javaparser.ParseResult parse(java.io.InputStream p0)`
- `public com.github.javaparser.ParseResult parse(java.io.InputStream p0, java.nio.charset.Charset p1)`
- `public com.github.javaparser.ParseResult parse(java.io.Reader p0)`
- `public com.github.javaparser.ParseResult parse(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parse(java.nio.file.Path p0) throws java.io.IOException`
- `public com.github.javaparser.ParseResult parse(java.nio.file.Path p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public com.github.javaparser.ParseResult parseAnnotation(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseAnnotationBodyDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseBlock(java.lang.String p0)`
- `public <T extends com.github.javaparser.ast.body.BodyDeclaration<? extends java.lang.Object>> com.github.javaparser.ParseResult parseBodyDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseClassOrInterfaceType(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseExplicitConstructorInvocationStmt(java.lang.String p0)`
- `public <T extends com.github.javaparser.ast.expr.Expression> com.github.javaparser.ParseResult parseExpression(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseImport(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseMethodDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseModuleDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseModuleDirective(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseName(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parsePackageDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseParameter(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseResource(java.lang.ClassLoader p0, java.lang.String p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public com.github.javaparser.ParseResult parseResource(java.lang.String p0) throws java.io.IOException`
- `public com.github.javaparser.ParseResult parseResource(java.lang.String p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public com.github.javaparser.ParseResult parseSimpleName(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseStatement(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseType(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseTypeDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseTypeParameter(java.lang.String p0)`
- `public com.github.javaparser.ParseResult parseVariableDeclarationExpr(java.lang.String p0)`

---

## public class `com.github.javaparser.JavaParserBuild`

**Constructors:**
- `public JavaParserBuild()`

**Fields:**
- `public final static java.lang.String JAVA_VENDOR`
- `public final static java.lang.String JAVA_VENDOR_URL`
- `public final static java.lang.String JAVA_VERSION`
- `public final static java.lang.String MAVEN_BUILD_TIMESTAMP`
- `public final static java.lang.String MAVEN_BUILD_VERSION`
- `public final static java.lang.String MAVEN_VERSION`
- `public final static java.lang.String OS_ARCH`
- `public final static java.lang.String OS_NAME`
- `public final static java.lang.String OS_VERSION`
- `public final static java.lang.String PROJECT_BUILD_FINAL_NAME`
- `public final static java.lang.String PROJECT_NAME`
- `public final static java.lang.String PROJECT_VERSION`

---

## public class `com.github.javaparser.JavaToken`

**Constructors:**
- `public JavaToken(com.github.javaparser.Range p0, int p1, java.lang.String p2, com.github.javaparser.JavaToken p3, com.github.javaparser.JavaToken p4)`
- `public JavaToken(int p0)`
- `public JavaToken(int p0, java.lang.String p1)`

**Fields:**
- `public final static com.github.javaparser.JavaToken INVALID`

**Methods:**
- `public java.lang.String asString()`
- `public void deleteToken()`
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.JavaToken findFirstToken()`
- `public com.github.javaparser.JavaToken findLastToken()`
- `public com.github.javaparser.JavaToken$Category getCategory()`
- `public int getKind()`
- `public java.util.Optional getNextToken()`
- `public java.util.Optional getPreviousToken()`
- `public java.util.Optional getRange()`
- `public java.lang.String getText()`
- `public boolean hasRange()`
- `public int hashCode()`
- `public void insert(com.github.javaparser.JavaToken p0)`
- `public void insertAfter(com.github.javaparser.JavaToken p0)`
- `public boolean invalid()`
- `public void replaceToken(com.github.javaparser.JavaToken p0)`
- `public void setRange(com.github.javaparser.Range p0)`
- `public void setText(java.lang.String p0)`
- `public java.lang.String toString()`
- `public com.github.javaparser.TokenRange toTokenRange()`
- `public boolean valid()`

---

## public final static enum `com.github.javaparser.JavaToken$Category`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.JavaToken$Category COMMENT`
- `public final static com.github.javaparser.JavaToken$Category EOL`
- `public final static com.github.javaparser.JavaToken$Category IDENTIFIER`
- `public final static com.github.javaparser.JavaToken$Category KEYWORD`
- `public final static com.github.javaparser.JavaToken$Category LITERAL`
- `public final static com.github.javaparser.JavaToken$Category OPERATOR`
- `public final static com.github.javaparser.JavaToken$Category SEPARATOR`
- `public final static com.github.javaparser.JavaToken$Category WHITESPACE_NO_EOL`

**Methods:**
- `public boolean isComment()`
- `public boolean isEndOfLine()`
- `public boolean isIdentifier()`
- `public boolean isKeyword()`
- `public boolean isLiteral()`
- `public boolean isOperator()`
- `public boolean isSeparator()`
- `public boolean isWhitespace()`
- `public boolean isWhitespaceButNotEndOfLine()`
- `public boolean isWhitespaceOrComment()`

---

## public final static enum `com.github.javaparser.JavaToken$Kind`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.JavaToken$Kind ABSTRACT`
- `public final static com.github.javaparser.JavaToken$Kind ANDASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind ARROW`
- `public final static com.github.javaparser.JavaToken$Kind ASSERT`
- `public final static com.github.javaparser.JavaToken$Kind ASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind AT`
- `public final static com.github.javaparser.JavaToken$Kind BANG`
- `public final static com.github.javaparser.JavaToken$Kind BINARY_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind BIT_AND`
- `public final static com.github.javaparser.JavaToken$Kind BIT_OR`
- `public final static com.github.javaparser.JavaToken$Kind BOOLEAN`
- `public final static com.github.javaparser.JavaToken$Kind BREAK`
- `public final static com.github.javaparser.JavaToken$Kind BYTE`
- `public final static com.github.javaparser.JavaToken$Kind CASE`
- `public final static com.github.javaparser.JavaToken$Kind CATCH`
- `public final static com.github.javaparser.JavaToken$Kind CHAR`
- `public final static com.github.javaparser.JavaToken$Kind CHARACTER_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind CLASS`
- `public final static com.github.javaparser.JavaToken$Kind COLON`
- `public final static com.github.javaparser.JavaToken$Kind COMMA`
- `public final static com.github.javaparser.JavaToken$Kind COMMENT_CONTENT`
- `public final static com.github.javaparser.JavaToken$Kind CONST`
- `public final static com.github.javaparser.JavaToken$Kind CONTINUE`
- `public final static com.github.javaparser.JavaToken$Kind CTRL_Z`
- `public final static com.github.javaparser.JavaToken$Kind DECIMAL_EXPONENT`
- `public final static com.github.javaparser.JavaToken$Kind DECIMAL_FLOATING_POINT_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind DECIMAL_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind DECR`
- `public final static com.github.javaparser.JavaToken$Kind DO`
- `public final static com.github.javaparser.JavaToken$Kind DOT`
- `public final static com.github.javaparser.JavaToken$Kind DOUBLE`
- `public final static com.github.javaparser.JavaToken$Kind DOUBLECOLON`
- `public final static com.github.javaparser.JavaToken$Kind ELLIPSIS`
- `public final static com.github.javaparser.JavaToken$Kind ELSE`
- `public final static com.github.javaparser.JavaToken$Kind ENTER_JAVADOC_COMMENT`
- `public final static com.github.javaparser.JavaToken$Kind ENTER_MULTILINE_COMMENT`
- `public final static com.github.javaparser.JavaToken$Kind ENTER_TEXT_BLOCK`
- `public final static com.github.javaparser.JavaToken$Kind ENUM`
- `public final static com.github.javaparser.JavaToken$Kind EOF`
- `public final static com.github.javaparser.JavaToken$Kind EQ`
- `public final static com.github.javaparser.JavaToken$Kind EXPORTS`
- `public final static com.github.javaparser.JavaToken$Kind EXTENDS`
- `public final static com.github.javaparser.JavaToken$Kind FALSE`
- `public final static com.github.javaparser.JavaToken$Kind FINAL`
- `public final static com.github.javaparser.JavaToken$Kind FINALLY`
- `public final static com.github.javaparser.JavaToken$Kind FLOAT`
- `public final static com.github.javaparser.JavaToken$Kind FLOATING_POINT_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind FOR`
- `public final static com.github.javaparser.JavaToken$Kind GE`
- `public final static com.github.javaparser.JavaToken$Kind GOTO`
- `public final static com.github.javaparser.JavaToken$Kind GT`
- `public final static com.github.javaparser.JavaToken$Kind HEXADECIMAL_EXPONENT`
- `public final static com.github.javaparser.JavaToken$Kind HEXADECIMAL_FLOATING_POINT_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind HEX_DIGITS`
- `public final static com.github.javaparser.JavaToken$Kind HEX_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind HOOK`
- `public final static com.github.javaparser.JavaToken$Kind IDENTIFIER`
- `public final static com.github.javaparser.JavaToken$Kind IF`
- `public final static com.github.javaparser.JavaToken$Kind IMPLEMENTS`
- `public final static com.github.javaparser.JavaToken$Kind IMPORT`
- `public final static com.github.javaparser.JavaToken$Kind INCR`
- `public final static com.github.javaparser.JavaToken$Kind INSTANCEOF`
- `public final static com.github.javaparser.JavaToken$Kind INT`
- `public final static com.github.javaparser.JavaToken$Kind INTEGER_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind INTERFACE`
- `public final static com.github.javaparser.JavaToken$Kind JAVADOC_COMMENT`
- `public final static com.github.javaparser.JavaToken$Kind LBRACE`
- `public final static com.github.javaparser.JavaToken$Kind LBRACKET`
- `public final static com.github.javaparser.JavaToken$Kind LE`
- `public final static com.github.javaparser.JavaToken$Kind LETTER`
- `public final static com.github.javaparser.JavaToken$Kind LONG`
- `public final static com.github.javaparser.JavaToken$Kind LONG_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind LPAREN`
- `public final static com.github.javaparser.JavaToken$Kind LSHIFT`
- `public final static com.github.javaparser.JavaToken$Kind LSHIFTASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind LT`
- `public final static com.github.javaparser.JavaToken$Kind MINUS`
- `public final static com.github.javaparser.JavaToken$Kind MINUSASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind MODULE`
- `public final static com.github.javaparser.JavaToken$Kind MULTI_LINE_COMMENT`
- `public final static com.github.javaparser.JavaToken$Kind NATIVE`
- `public final static com.github.javaparser.JavaToken$Kind NE`
- `public final static com.github.javaparser.JavaToken$Kind NEW`
- `public final static com.github.javaparser.JavaToken$Kind NULL`
- `public final static com.github.javaparser.JavaToken$Kind OCTAL_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind OLD_MAC_EOL`
- `public final static com.github.javaparser.JavaToken$Kind OPEN`
- `public final static com.github.javaparser.JavaToken$Kind OPENS`
- `public final static com.github.javaparser.JavaToken$Kind ORASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind PACKAGE`
- `public final static com.github.javaparser.JavaToken$Kind PART_LETTER`
- `public final static com.github.javaparser.JavaToken$Kind PLUS`
- `public final static com.github.javaparser.JavaToken$Kind PLUSASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind PRIVATE`
- `public final static com.github.javaparser.JavaToken$Kind PROTECTED`
- `public final static com.github.javaparser.JavaToken$Kind PROVIDES`
- `public final static com.github.javaparser.JavaToken$Kind PUBLIC`
- `public final static com.github.javaparser.JavaToken$Kind RBRACE`
- `public final static com.github.javaparser.JavaToken$Kind RBRACKET`
- `public final static com.github.javaparser.JavaToken$Kind RECORD`
- `public final static com.github.javaparser.JavaToken$Kind REM`
- `public final static com.github.javaparser.JavaToken$Kind REMASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind REQUIRES`
- `public final static com.github.javaparser.JavaToken$Kind RETURN`
- `public final static com.github.javaparser.JavaToken$Kind RPAREN`
- `public final static com.github.javaparser.JavaToken$Kind RSIGNEDSHIFT`
- `public final static com.github.javaparser.JavaToken$Kind RSIGNEDSHIFTASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind RUNSIGNEDSHIFT`
- `public final static com.github.javaparser.JavaToken$Kind RUNSIGNEDSHIFTASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind SC_AND`
- `public final static com.github.javaparser.JavaToken$Kind SC_OR`
- `public final static com.github.javaparser.JavaToken$Kind SEMICOLON`
- `public final static com.github.javaparser.JavaToken$Kind SHORT`
- `public final static com.github.javaparser.JavaToken$Kind SINGLE_LINE_COMMENT`
- `public final static com.github.javaparser.JavaToken$Kind SLASH`
- `public final static com.github.javaparser.JavaToken$Kind SLASHASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind SPACE`
- `public final static com.github.javaparser.JavaToken$Kind STAR`
- `public final static com.github.javaparser.JavaToken$Kind STARASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind STATIC`
- `public final static com.github.javaparser.JavaToken$Kind STRICTFP`
- `public final static com.github.javaparser.JavaToken$Kind STRING_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind SUPER`
- `public final static com.github.javaparser.JavaToken$Kind SWITCH`
- `public final static com.github.javaparser.JavaToken$Kind SYNCHRONIZED`
- `public final static com.github.javaparser.JavaToken$Kind TEXT_BLOCK_CONTENT`
- `public final static com.github.javaparser.JavaToken$Kind TEXT_BLOCK_LITERAL`
- `public final static com.github.javaparser.JavaToken$Kind THIS`
- `public final static com.github.javaparser.JavaToken$Kind THROW`
- `public final static com.github.javaparser.JavaToken$Kind THROWS`
- `public final static com.github.javaparser.JavaToken$Kind TILDE`
- `public final static com.github.javaparser.JavaToken$Kind TO`
- `public final static com.github.javaparser.JavaToken$Kind TRANSIENT`
- `public final static com.github.javaparser.JavaToken$Kind TRANSITIVE`
- `public final static com.github.javaparser.JavaToken$Kind TRUE`
- `public final static com.github.javaparser.JavaToken$Kind TRY`
- `public final static com.github.javaparser.JavaToken$Kind UNICODE_ESCAPE`
- `public final static com.github.javaparser.JavaToken$Kind UNIX_EOL`
- `public final static com.github.javaparser.JavaToken$Kind USES`
- `public final static com.github.javaparser.JavaToken$Kind VOID`
- `public final static com.github.javaparser.JavaToken$Kind VOLATILE`
- `public final static com.github.javaparser.JavaToken$Kind WHILE`
- `public final static com.github.javaparser.JavaToken$Kind WINDOWS_EOL`
- `public final static com.github.javaparser.JavaToken$Kind WITH`
- `public final static com.github.javaparser.JavaToken$Kind XOR`
- `public final static com.github.javaparser.JavaToken$Kind XORASSIGN`
- `public final static com.github.javaparser.JavaToken$Kind YIELD`
- `public final static com.github.javaparser.JavaToken$Kind _DEFAULT`

**Methods:**
- `public int getKind()`
- `public boolean isPrimitive()`
- `public static com.github.javaparser.JavaToken$Kind valueOf(int p0)`

---

## public class `com.github.javaparser.LineEndingProcessingProvider`
implements `com.github.javaparser.Provider`  

**Constructors:**
- `public LineEndingProcessingProvider(com.github.javaparser.Provider p0)`
- `public LineEndingProcessingProvider(int p0, com.github.javaparser.Provider p1)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public com.github.javaparser.utils.LineSeparator getDetectedLineEnding()`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `com.github.javaparser.ParseException`
extends `java.lang.Exception`  

**Constructors:**
- `public ParseException()`
- `public ParseException(com.github.javaparser.Token p0, int[][] p1, java.lang.String[] p2)`
- `public ParseException(com.github.javaparser.Token p0, int[][] p1, java.lang.String[] p2, java.lang.String p3)`
- `public ParseException(java.lang.String p0)`

**Fields:**
- `protected final static java.lang.String EOL`
- `public com.github.javaparser.Token currentToken`
- `public int[][] expectedTokenSequences`
- `public java.lang.String[] tokenImage`

---

## public class `com.github.javaparser.ParseProblemException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public ParseProblemException(java.lang.Throwable p0)`
- `public ParseProblemException(java.util.List p0)`

**Methods:**
- `public java.util.List getProblems()`

---

## public class `com.github.javaparser.ParseResult`<T extends java.lang.Object>

**Constructors:**
- `public ParseResult(T p0, java.util.List p1, com.github.javaparser.ast.comments.CommentsCollection p2)`

**Methods:**
- `public java.util.Optional getCommentsCollection()`
- `public com.github.javaparser.Problem getProblem(int p0)`
- `public java.util.List getProblems()`
- `public java.util.Optional getResult()`
- `public void ifSuccessful(java.util.function.Consumer p0)`
- `public boolean isSuccessful()`
- `public java.lang.String toString()`

---

## public abstract static interface `com.github.javaparser.ParseResult$PostProcessor`

**Methods:**
- `public abstract void process(com.github.javaparser.ParseResult p0, com.github.javaparser.ParserConfiguration p1)`

---

## public abstract interface `com.github.javaparser.ParseStart`<R extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  

**Fields:**
- `public final static com.github.javaparser.ParseStart ANNOTATION`
- `public final static com.github.javaparser.ParseStart ANNOTATION_BODY`
- `public final static com.github.javaparser.ParseStart BLOCK`
- `public final static com.github.javaparser.ParseStart CLASS_BODY`
- `public final static com.github.javaparser.ParseStart CLASS_OR_INTERFACE_TYPE`
- `public final static com.github.javaparser.ParseStart COMPILATION_UNIT`
- `public final static com.github.javaparser.ParseStart EXPLICIT_CONSTRUCTOR_INVOCATION_STMT`
- `public final static com.github.javaparser.ParseStart EXPRESSION`
- `public final static com.github.javaparser.ParseStart IMPORT_DECLARATION`
- `public final static com.github.javaparser.ParseStart METHOD_DECLARATION`
- `public final static com.github.javaparser.ParseStart MODULE_DECLARATION`
- `public final static com.github.javaparser.ParseStart MODULE_DIRECTIVE`
- `public final static com.github.javaparser.ParseStart NAME`
- `public final static com.github.javaparser.ParseStart PACKAGE_DECLARATION`
- `public final static com.github.javaparser.ParseStart PARAMETER`
- `public final static com.github.javaparser.ParseStart SIMPLE_NAME`
- `public final static com.github.javaparser.ParseStart STATEMENT`
- `public final static com.github.javaparser.ParseStart TYPE`
- `public final static com.github.javaparser.ParseStart TYPE_DECLARATION`
- `public final static com.github.javaparser.ParseStart TYPE_PARAMETER`
- `public final static com.github.javaparser.ParseStart VARIABLE_DECLARATION_EXPR`

**Methods:**
- `public abstract R parse(com.github.javaparser.GeneratedJavaParser p0) throws com.github.javaparser.ParseException`

---

## public class `com.github.javaparser.ParserConfiguration`

**Constructors:**
- `public ParserConfiguration()`

**Methods:**
- `public java.nio.charset.Charset getCharacterEncoding()`
- `public com.github.javaparser.ParserConfiguration$LanguageLevel getLanguageLevel()`
- `public java.util.List getPostProcessors()`
- `public java.util.List getPreProcessors()`
- `public java.util.Optional getSymbolResolver()`
- `public int getTabSize()`
- `public boolean isAttributeComments()`
- `public boolean isDetectOriginalLineSeparator()`
- `public boolean isDoNotAssignCommentsPrecedingEmptyLines()`
- `public boolean isIgnoreAnnotationsWhenAttributingComments()`
- `public boolean isLexicalPreservationEnabled()`
- `public boolean isPreprocessUnicodeEscapes()`
- `public boolean isStoreTokens()`
- `public com.github.javaparser.ParserConfiguration setAttributeComments(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setCharacterEncoding(java.nio.charset.Charset p0)`
- `public com.github.javaparser.ParserConfiguration setDetectOriginalLineSeparator(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setDoNotAssignCommentsPrecedingEmptyLines(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setIgnoreAnnotationsWhenAttributingComments(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setLanguageLevel(com.github.javaparser.ParserConfiguration$LanguageLevel p0)`
- `public com.github.javaparser.ParserConfiguration setLexicalPreservationEnabled(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setPreprocessUnicodeEscapes(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setStoreTokens(boolean p0)`
- `public com.github.javaparser.ParserConfiguration setSymbolResolver(com.github.javaparser.resolution.SymbolResolver p0)`
- `public com.github.javaparser.ParserConfiguration setTabSize(int p0)`

---

## public final static enum `com.github.javaparser.ParserConfiguration$LanguageLevel`
extends `java.lang.Enum`  

**Fields:**
- `public static com.github.javaparser.ParserConfiguration$LanguageLevel BLEEDING_EDGE`
- `public static com.github.javaparser.ParserConfiguration$LanguageLevel CURRENT`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_10`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_10_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_11`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_11_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_12`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_12_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_13`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_13_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_14`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_14_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_15`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_15_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_16`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_16_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_17`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_17_PREVIEW`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_1_0`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_1_1`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_1_2`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_1_3`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_1_4`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_5`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_6`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_7`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_8`
- `public final static com.github.javaparser.ParserConfiguration$LanguageLevel JAVA_9`
- `public static com.github.javaparser.ParserConfiguration$LanguageLevel POPULAR`
- `public static com.github.javaparser.ParserConfiguration$LanguageLevel RAW`

**Methods:**
- `public boolean isYieldSupported()`

---

## public class `com.github.javaparser.Position`
implements `java.lang.Comparable<com.github.javaparser.Position>`  

**Constructors:**
- `public Position(int p0, int p1)`

**Fields:**
- `public final static int ABSOLUTE_BEGIN_LINE`
- `public final static int ABSOLUTE_END_LINE`
- `public final static int FIRST_COLUMN`
- `public final static int FIRST_LINE`
- `public final static com.github.javaparser.Position HOME`
- `public final int column`
- `public final int line`

**Methods:**
- `public int compareTo(com.github.javaparser.Position p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean invalid()`
- `public boolean isAfter(com.github.javaparser.Position p0)`
- `public boolean isAfterOrEqual(com.github.javaparser.Position p0)`
- `public boolean isBefore(com.github.javaparser.Position p0)`
- `public boolean isBeforeOrEqual(com.github.javaparser.Position p0)`
- `public com.github.javaparser.Position nextLine()`
- `public com.github.javaparser.Position orIfInvalid(com.github.javaparser.Position p0)`
- `public static com.github.javaparser.Position pos(int p0, int p1)`
- `public com.github.javaparser.Position right(int p0)`
- `public java.lang.String toString()`
- `public boolean valid()`
- `public com.github.javaparser.Position withColumn(int p0)`
- `public com.github.javaparser.Position withLine(int p0)`

---

## public class `com.github.javaparser.Problem`

**Constructors:**
- `public Problem(java.lang.String p0, com.github.javaparser.TokenRange p1, java.lang.Throwable p2)`

**Fields:**
- `public static java.util.Comparator PROBLEM_BY_BEGIN_POSITION`

**Methods:**
- `public java.util.Optional getCause()`
- `public java.util.Optional getLocation()`
- `public java.lang.String getMessage()`
- `public java.lang.String getVerboseMessage()`
- `public java.lang.String toString()`

---

## public abstract interface `com.github.javaparser.Provider`
implements `java.io.Closeable`  

**Methods:**
- `public abstract int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public final class `com.github.javaparser.Providers`

**Fields:**
- `public final static java.nio.charset.Charset UTF8`

**Methods:**
- `public static com.github.javaparser.Provider provider(java.io.File p0) throws java.io.FileNotFoundException`
- `public static com.github.javaparser.Provider provider(java.io.File p0, java.nio.charset.Charset p1) throws java.io.FileNotFoundException`
- `public static com.github.javaparser.Provider provider(java.io.InputStream p0)`
- `public static com.github.javaparser.Provider provider(java.io.InputStream p0, java.nio.charset.Charset p1)`
- `public static com.github.javaparser.Provider provider(java.io.Reader p0)`
- `public static com.github.javaparser.Provider provider(java.lang.String p0)`
- `public static com.github.javaparser.Provider provider(java.nio.file.Path p0) throws java.io.IOException`
- `public static com.github.javaparser.Provider provider(java.nio.file.Path p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public static com.github.javaparser.Provider resourceProvider(java.lang.ClassLoader p0, java.lang.String p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public static com.github.javaparser.Provider resourceProvider(java.lang.String p0) throws java.io.IOException`
- `public static com.github.javaparser.Provider resourceProvider(java.lang.String p0, java.nio.charset.Charset p1) throws java.io.IOException`

---

## public abstract static interface `com.github.javaparser.Providers$PreProcessor`

**Methods:**
- `public abstract com.github.javaparser.Provider process(com.github.javaparser.Provider p0)`

---

## public class `com.github.javaparser.Range`

**Constructors:**
- `public Range(com.github.javaparser.Position p0, com.github.javaparser.Position p1)`

**Fields:**
- `public final com.github.javaparser.Position begin`
- `public final com.github.javaparser.Position end`

**Methods:**
- `public boolean contains(com.github.javaparser.Position p0)`
- `public boolean contains(com.github.javaparser.Range p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int getLineCount()`
- `public int hashCode()`
- `public boolean isAfter(com.github.javaparser.Position p0)`
- `public boolean isBefore(com.github.javaparser.Position p0)`
- `public boolean overlapsWith(com.github.javaparser.Range p0)`
- `public static com.github.javaparser.Range range(com.github.javaparser.Position p0, com.github.javaparser.Position p1)`
- `public static com.github.javaparser.Range range(int p0, int p1, int p2, int p3)`
- `public boolean strictlyContains(com.github.javaparser.Position p0)`
- `public boolean strictlyContains(com.github.javaparser.Range p0)`
- `public java.lang.String toString()`
- `public com.github.javaparser.Range withBegin(com.github.javaparser.Position p0)`
- `public com.github.javaparser.Range withBeginColumn(int p0)`
- `public com.github.javaparser.Range withBeginLine(int p0)`
- `public com.github.javaparser.Range withEnd(com.github.javaparser.Position p0)`
- `public com.github.javaparser.Range withEndColumn(int p0)`
- `public com.github.javaparser.Range withEndLine(int p0)`

---

## public class `com.github.javaparser.SimpleCharStream`
extends `com.github.javaparser.AbstractCharStream`  

**Constructors:**
- `public SimpleCharStream(com.github.javaparser.Provider p0)`
- `public SimpleCharStream(com.github.javaparser.Provider p0, int p1, int p2)`
- `public SimpleCharStream(com.github.javaparser.Provider p0, int p1, int p2, int p3)`

**Methods:**
- `public void reInit(com.github.javaparser.Provider p0)`
- `public void reInit(com.github.javaparser.Provider p0, int p1, int p2)`
- `public void reInit(com.github.javaparser.Provider p0, int p1, int p2, int p3)`
- `protected void streamClose() throws java.io.IOException`
- `protected int streamRead(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public final class `com.github.javaparser.StaticJavaParser`

**Methods:**
- `public static com.github.javaparser.ParserConfiguration getConfiguration()`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.io.File p0) throws java.io.FileNotFoundException`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.io.File p0, java.nio.charset.Charset p1) throws java.io.FileNotFoundException`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.io.InputStream p0)`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.io.InputStream p0, java.nio.charset.Charset p1)`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.io.Reader p0)`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.lang.String p0)`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.nio.file.Path p0) throws java.io.IOException`
- `public static com.github.javaparser.ast.CompilationUnit parse(java.nio.file.Path p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public static com.github.javaparser.ast.expr.AnnotationExpr parseAnnotation(java.lang.String p0)`
- `public static com.github.javaparser.ast.body.BodyDeclaration parseAnnotationBodyDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.stmt.BlockStmt parseBlock(java.lang.String p0)`
- `public static com.github.javaparser.ast.body.BodyDeclaration parseBodyDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.type.ClassOrInterfaceType parseClassOrInterfaceType(java.lang.String p0)`
- `public static com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt parseExplicitConstructorInvocationStmt(java.lang.String p0)`
- `public static <T extends com.github.javaparser.ast.expr.Expression> T parseExpression(java.lang.String p0)`
- `public static com.github.javaparser.ast.ImportDeclaration parseImport(java.lang.String p0)`
- `public static com.github.javaparser.javadoc.Javadoc parseJavadoc(java.lang.String p0)`
- `public static com.github.javaparser.ast.body.MethodDeclaration parseMethodDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.modules.ModuleDeclaration parseModuleDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.modules.ModuleDirective parseModuleDirective(java.lang.String p0)`
- `public static com.github.javaparser.ast.expr.Name parseName(java.lang.String p0)`
- `public static com.github.javaparser.ast.PackageDeclaration parsePackageDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.body.Parameter parseParameter(java.lang.String p0)`
- `public static com.github.javaparser.ast.CompilationUnit parseResource(java.lang.ClassLoader p0, java.lang.String p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public static com.github.javaparser.ast.CompilationUnit parseResource(java.lang.String p0) throws java.io.IOException`
- `public static com.github.javaparser.ast.CompilationUnit parseResource(java.lang.String p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public static com.github.javaparser.ast.expr.SimpleName parseSimpleName(java.lang.String p0)`
- `public static com.github.javaparser.ast.stmt.Statement parseStatement(java.lang.String p0)`
- `public static com.github.javaparser.ast.type.Type parseType(java.lang.String p0)`
- `public static com.github.javaparser.ast.body.TypeDeclaration parseTypeDeclaration(java.lang.String p0)`
- `public static com.github.javaparser.ast.type.TypeParameter parseTypeParameter(java.lang.String p0)`
- `public static com.github.javaparser.ast.expr.VariableDeclarationExpr parseVariableDeclarationExpr(java.lang.String p0)`
- `public static void setConfiguration(com.github.javaparser.ParserConfiguration p0)`

---

## public class `com.github.javaparser.StreamProvider`
implements `com.github.javaparser.Provider`  

**Constructors:**
- `public StreamProvider(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException`
- `public StreamProvider(java.io.InputStream p0, java.nio.charset.Charset p1)`
- `public StreamProvider(java.io.Reader p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `com.github.javaparser.StringProvider`
implements `com.github.javaparser.Provider`  

**Constructors:**
- `public StringProvider(java.lang.String p0)`

**Methods:**
- `public void close()`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `com.github.javaparser.Token`
extends `com.github.javaparser.TokenBase`  
implements `java.io.Serializable`  

**Constructors:**
- `public Token()`
- `public Token(int p0)`
- `public Token(int p0, java.lang.String p1)`

**Fields:**
- `public int beginColumn`
- `public int beginLine`
- `public int endColumn`
- `public int endLine`
- `public java.lang.String image`
- `public int kind`
- `public com.github.javaparser.Token next`
- `public com.github.javaparser.Token specialToken`

**Methods:**
- `public java.lang.Object getValue()`
- `public static com.github.javaparser.Token newToken(int p0)`
- `public static com.github.javaparser.Token newToken(int p0, java.lang.String p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.TokenMgrException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public TokenMgrException()`
- `public TokenMgrException(boolean p0, int p1, int p2, int p3, java.lang.String p4, int p5, int p6)`
- `public TokenMgrException(java.lang.String p0, int p1)`

**Fields:**
- `public final static int INVALID_LEXICAL_STATE`
- `public final static int LEXICAL_ERROR`
- `public final static int LOOP_DETECTED`
- `public final static int STATIC_LEXER_ERROR`

**Methods:**
- `protected static java.lang.String LexicalErr(boolean p0, int p1, int p2, int p3, java.lang.String p4, int p5)`
- `protected final static java.lang.String addEscapes(java.lang.String p0)`
- `public java.lang.String getMessage()`

---

## public class `com.github.javaparser.TokenRange`
implements `java.lang.Iterable<com.github.javaparser.JavaToken>`  

**Constructors:**
- `public TokenRange(com.github.javaparser.JavaToken p0, com.github.javaparser.JavaToken p1)`

**Fields:**
- `public final static com.github.javaparser.TokenRange INVALID`

**Methods:**
- `public com.github.javaparser.JavaToken getBegin()`
- `public com.github.javaparser.JavaToken getEnd()`
- `public java.util.Iterator iterator()`
- `public java.util.Optional toRange()`
- `public java.lang.String toString()`
- `public com.github.javaparser.TokenRange withBegin(com.github.javaparser.JavaToken p0)`
- `public com.github.javaparser.TokenRange withEnd(com.github.javaparser.JavaToken p0)`

---

## public class `com.github.javaparser.TokenTypes`

**Constructors:**
- `public TokenTypes()`

**Methods:**
- `public static int eolTokenKind()`
- `public static int eolTokenKind(com.github.javaparser.utils.LineSeparator p0)`
- `public static com.github.javaparser.JavaToken$Category getCategory(int p0)`
- `public static boolean isComment(int p0)`
- `public static boolean isEndOfLineToken(int p0)`
- `public static boolean isSpaceOrTab(int p0)`
- `public static boolean isWhitespace(int p0)`
- `public static boolean isWhitespaceButNotEndOfLine(int p0)`
- `public static boolean isWhitespaceOrComment(int p0)`
- `public static int spaceTokenKind()`

---

## public class `com.github.javaparser.UnicodeEscapeProcessingProvider`
implements `com.github.javaparser.Provider`  

**Constructors:**
- `public UnicodeEscapeProcessingProvider(com.github.javaparser.Provider p0)`
- `public UnicodeEscapeProcessingProvider(int p0, com.github.javaparser.Provider p1)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public com.github.javaparser.UnicodeEscapeProcessingProvider$LineCounter getInputCounter()`
- `public com.github.javaparser.UnicodeEscapeProcessingProvider$LineCounter getOutputCounter()`
- `public com.github.javaparser.UnicodeEscapeProcessingProvider$PositionMapping getPositionMapping()`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public final static class `com.github.javaparser.UnicodeEscapeProcessingProvider$LineCounter`

**Constructors:**
- `public LineCounter()`

**Methods:**
- `public int getColumn()`
- `public int getLine()`
- `public com.github.javaparser.Position getPosition()`
- `public int process(int p0)`

---

## public final static class `com.github.javaparser.UnicodeEscapeProcessingProvider$PositionMapping`

**Constructors:**
- `public PositionMapping()`

**Methods:**
- `public boolean isEmpty()`
- `public com.github.javaparser.UnicodeEscapeProcessingProvider$PositionMapping$PositionUpdate lookup(com.github.javaparser.Position p0)`
- `public com.github.javaparser.Position transform(com.github.javaparser.Position p0)`
- `public com.github.javaparser.Range transform(com.github.javaparser.Range p0)`

---

## public abstract static interface `com.github.javaparser.UnicodeEscapeProcessingProvider$PositionMapping$PositionUpdate`

**Fields:**
- `public final static com.github.javaparser.UnicodeEscapeProcessingProvider$PositionMapping$PositionUpdate NONE`

**Methods:**
- `public default com.github.javaparser.Position transform(com.github.javaparser.Position p0)`
- `public abstract int transformColumn(int p0)`
- `public abstract int transformLine(int p0)`

---

## public final enum `com.github.javaparser.ast.AccessSpecifier`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.AccessSpecifier PACKAGE_PRIVATE`
- `public final static com.github.javaparser.ast.AccessSpecifier PRIVATE`
- `public final static com.github.javaparser.ast.AccessSpecifier PROTECTED`
- `public final static com.github.javaparser.ast.AccessSpecifier PUBLIC`

**Methods:**
- `public java.lang.String asString()`

---

## public abstract interface `com.github.javaparser.ast.AllFieldsConstructor`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.ast.ArrayCreationLevel`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.ArrayCreationLevel>`  

**Constructors:**
- `public ArrayCreationLevel()`
- `public ArrayCreationLevel(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2)`
- `public ArrayCreationLevel(com.github.javaparser.ast.expr.Expression p0)`
- `public ArrayCreationLevel(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1)`
- `public ArrayCreationLevel(int p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.ArrayCreationLevel clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public java.util.Optional getDimension()`
- `public com.github.javaparser.metamodel.ArrayCreationLevelMetaModel getMetaModel()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.ArrayCreationLevel removeDimension()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.ArrayCreationLevel setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.ArrayCreationLevel setDimension(com.github.javaparser.ast.expr.Expression p0)`

---

## public class `com.github.javaparser.ast.CompilationUnit`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public CompilationUnit()`
- `public CompilationUnit(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.PackageDeclaration p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.modules.ModuleDeclaration p4)`
- `public CompilationUnit(com.github.javaparser.ast.PackageDeclaration p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.modules.ModuleDeclaration p3)`
- `public CompilationUnit(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.AnnotationDeclaration addAnnotationDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ast.body.AnnotationDeclaration addAnnotationDeclaration(java.lang.String p0, com.github.javaparser.ast.Modifier$Keyword... p1)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration addClass(java.lang.String p0)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration addClass(java.lang.String p0, com.github.javaparser.ast.Modifier$Keyword... p1)`
- `public com.github.javaparser.ast.body.EnumDeclaration addEnum(java.lang.String p0)`
- `public com.github.javaparser.ast.body.EnumDeclaration addEnum(java.lang.String p0, com.github.javaparser.ast.Modifier$Keyword... p1)`
- `public com.github.javaparser.ast.CompilationUnit addImport(com.github.javaparser.ast.ImportDeclaration p0)`
- `public com.github.javaparser.ast.CompilationUnit addImport(java.lang.Class p0)`
- `public com.github.javaparser.ast.CompilationUnit addImport(java.lang.String p0)`
- `public com.github.javaparser.ast.CompilationUnit addImport(java.lang.String p0, boolean p1, boolean p2)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration addInterface(java.lang.String p0)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration addInterface(java.lang.String p0, com.github.javaparser.ast.Modifier$Keyword... p1)`
- `public com.github.javaparser.ast.CompilationUnit addType(com.github.javaparser.ast.body.TypeDeclaration p0)`
- `public com.github.javaparser.ast.CompilationUnit clone()`
- `public java.util.List getAllComments()`
- `public java.util.Optional getAnnotationDeclarationByName(java.lang.String p0)`
- `public java.util.Optional getClassByName(java.lang.String p0)`
- `public java.util.List getComments()`
- `public java.util.Optional getEnumByName(java.lang.String p0)`
- `public com.github.javaparser.ast.ImportDeclaration getImport(int p0)`
- `public com.github.javaparser.ast.NodeList getImports()`
- `public java.util.Optional getInterfaceByName(java.lang.String p0)`
- `public java.util.List getLocalDeclarationFromClassname(java.lang.String p0)`
- `public com.github.javaparser.metamodel.CompilationUnitMetaModel getMetaModel()`
- `public java.util.Optional getModule()`
- `public java.util.Optional getPackageDeclaration()`
- `public java.util.Optional getPrimaryType()`
- `public java.util.Optional getPrimaryTypeName()`
- `protected com.github.javaparser.printer.Printer getPrinter()`
- `protected com.github.javaparser.printer.Printer getPrinter(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `public java.util.Optional getStorage()`
- `public com.github.javaparser.ast.body.TypeDeclaration getType(int p0)`
- `public com.github.javaparser.ast.NodeList getTypes()`
- `public com.github.javaparser.ast.CompilationUnit printer(com.github.javaparser.printer.Printer p0)`
- `public void recalculatePositions()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.CompilationUnit removeModule()`
- `public com.github.javaparser.ast.CompilationUnit removePackageDeclaration()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.CompilationUnit setImport(int p0, com.github.javaparser.ast.ImportDeclaration p1)`
- `public com.github.javaparser.ast.CompilationUnit setImports(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.CompilationUnit setModule(com.github.javaparser.ast.modules.ModuleDeclaration p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration setModule(java.lang.String p0)`
- `public com.github.javaparser.ast.CompilationUnit setPackageDeclaration(com.github.javaparser.ast.PackageDeclaration p0)`
- `public com.github.javaparser.ast.CompilationUnit setPackageDeclaration(java.lang.String p0)`
- `public com.github.javaparser.ast.CompilationUnit setStorage(java.nio.file.Path p0)`
- `public com.github.javaparser.ast.CompilationUnit setStorage(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public com.github.javaparser.ast.CompilationUnit setType(int p0, com.github.javaparser.ast.body.TypeDeclaration p1)`
- `public com.github.javaparser.ast.CompilationUnit setTypes(com.github.javaparser.ast.NodeList p0)`

---

## public static class `com.github.javaparser.ast.CompilationUnit$Storage`

**Methods:**
- `public com.github.javaparser.ast.CompilationUnit getCompilationUnit()`
- `public java.nio.file.Path getDirectory()`
- `public java.nio.charset.Charset getEncoding()`
- `public java.lang.String getFileName()`
- `public java.nio.file.Path getPath()`
- `public java.nio.file.Path getSourceRoot()`
- `public com.github.javaparser.ParseResult reparse(com.github.javaparser.JavaParser p0)`
- `public void save()`
- `public void save(java.util.function.Function p0)`
- `public void save(java.util.function.Function p0, java.nio.charset.Charset p1)`

---

## public abstract class `com.github.javaparser.ast.DataKey`<T extends java.lang.Object>

**Constructors:**
- `public DataKey()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`

---

## public abstract interface `com.github.javaparser.ast.Generated`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.ast.ImportDeclaration`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.ImportDeclaration>`  

**Constructors:**
- `public ImportDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, boolean p2, boolean p3)`
- `public ImportDeclaration(com.github.javaparser.ast.expr.Name p0, boolean p1, boolean p2)`
- `public ImportDeclaration(java.lang.String p0, boolean p1, boolean p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.ImportDeclaration clone()`
- `public com.github.javaparser.metamodel.ImportDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public boolean isAsterisk()`
- `public boolean isStatic()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.ImportDeclaration setAsterisk(boolean p0)`
- `public com.github.javaparser.ast.ImportDeclaration setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.ImportDeclaration setStatic(boolean p0)`

---

## public class `com.github.javaparser.ast.Modifier`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public Modifier()`
- `public Modifier(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.Modifier$Keyword p1)`
- `public Modifier(com.github.javaparser.ast.Modifier$Keyword p0)`

**Methods:**
- `public static com.github.javaparser.ast.Modifier abstractModifier()`
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.Modifier clone()`
- `public static com.github.javaparser.ast.NodeList createModifierList(com.github.javaparser.ast.Modifier$Keyword... p0)`
- `public static com.github.javaparser.ast.Modifier finalModifier()`
- `public com.github.javaparser.ast.Modifier$Keyword getKeyword()`
- `public com.github.javaparser.metamodel.ModifierMetaModel getMetaModel()`
- `public static com.github.javaparser.ast.Modifier nativeModifier()`
- `public static com.github.javaparser.ast.Modifier privateModifier()`
- `public static com.github.javaparser.ast.Modifier protectedModifier()`
- `public static com.github.javaparser.ast.Modifier publicModifier()`
- `public com.github.javaparser.ast.Modifier setKeyword(com.github.javaparser.ast.Modifier$Keyword p0)`
- `public static com.github.javaparser.ast.Modifier staticModifier()`
- `public static com.github.javaparser.ast.Modifier strictfpModifier()`
- `public static com.github.javaparser.ast.Modifier synchronizedModifier()`
- `public static com.github.javaparser.ast.Modifier transientModifier()`
- `public static com.github.javaparser.ast.Modifier transitiveModifier()`
- `public static com.github.javaparser.ast.Modifier volatileModifier()`

---

## public final static enum `com.github.javaparser.ast.Modifier$Keyword`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.Modifier$Keyword ABSTRACT`
- `public final static com.github.javaparser.ast.Modifier$Keyword DEFAULT`
- `public final static com.github.javaparser.ast.Modifier$Keyword FINAL`
- `public final static com.github.javaparser.ast.Modifier$Keyword NATIVE`
- `public final static com.github.javaparser.ast.Modifier$Keyword PRIVATE`
- `public final static com.github.javaparser.ast.Modifier$Keyword PROTECTED`
- `public final static com.github.javaparser.ast.Modifier$Keyword PUBLIC`
- `public final static com.github.javaparser.ast.Modifier$Keyword STATIC`
- `public final static com.github.javaparser.ast.Modifier$Keyword STRICTFP`
- `public final static com.github.javaparser.ast.Modifier$Keyword SYNCHRONIZED`
- `public final static com.github.javaparser.ast.Modifier$Keyword TRANSIENT`
- `public final static com.github.javaparser.ast.Modifier$Keyword TRANSITIVE`
- `public final static com.github.javaparser.ast.Modifier$Keyword VOLATILE`

**Methods:**
- `public java.lang.String asString()`

---

## public abstract class `com.github.javaparser.ast.Node`
implements `com.github.javaparser.HasParentNode<com.github.javaparser.ast.Node>`, `com.github.javaparser.ast.nodeTypes.NodeWithRange<com.github.javaparser.ast.Node>`, `com.github.javaparser.ast.nodeTypes.NodeWithTokenRange<com.github.javaparser.ast.Node>`, `com.github.javaparser.ast.visitor.Visitable`, `java.lang.Cloneable`  

**Constructors:**
- `protected Node(com.github.javaparser.TokenRange p0)`

**Fields:**
- `public final static int ABSOLUTE_BEGIN_LINE`
- `public final static int ABSOLUTE_END_LINE`
- `public final static com.github.javaparser.ast.DataKey LINE_SEPARATOR_KEY`
- `public static java.util.Comparator NODE_BY_BEGIN_POSITION`
- `protected final static com.github.javaparser.ast.DataKey PHANTOM_KEY`
- `protected final static com.github.javaparser.ast.DataKey PRINTER_KEY`
- `public final static com.github.javaparser.ast.DataKey SYMBOL_RESOLVER_KEY`
- `protected final static com.github.javaparser.printer.configuration.PrinterConfiguration prettyPrinterNoCommentsConfiguration`

**Methods:**
- `public void addOrphanComment(com.github.javaparser.ast.comments.Comment p0)`
- `public com.github.javaparser.ast.Node clone()`
- `public boolean containsData(com.github.javaparser.ast.DataKey p0)`
- `protected com.github.javaparser.printer.Printer createDefaultPrinter()`
- `protected com.github.javaparser.printer.Printer createDefaultPrinter(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `protected void customInitialization()`
- `public boolean equals(java.lang.Object p0)`
- `public <T extends com.github.javaparser.ast.Node> java.util.List findAll(java.lang.Class p0)`
- `public <T extends com.github.javaparser.ast.Node> java.util.List findAll(java.lang.Class p0, com.github.javaparser.ast.Node$TreeTraversal p1)`
- `public <T extends com.github.javaparser.ast.Node> java.util.List findAll(java.lang.Class p0, java.util.function.Predicate p1)`
- `public java.util.Optional findCompilationUnit()`
- `public <T extends java.lang.Object> java.util.Optional findFirst(com.github.javaparser.ast.Node$TreeTraversal p0, java.util.function.Function p1)`
- `public <N extends com.github.javaparser.ast.Node> java.util.Optional findFirst(java.lang.Class p0)`
- `public <N extends com.github.javaparser.ast.Node> java.util.Optional findFirst(java.lang.Class p0, java.util.function.Predicate p1)`
- `public com.github.javaparser.ast.Node findRootNode()`
- `public java.util.List getAllContainedComments()`
- `public java.util.List getChildNodes()`
- `public <N extends com.github.javaparser.ast.Node> java.util.List getChildNodesByType(java.lang.Class p0)`
- `public java.util.Optional getComment()`
- `public <M extends java.lang.Object> M getData(com.github.javaparser.ast.DataKey p0)`
- `public java.util.Set getDataKeys()`
- `protected com.github.javaparser.printer.configuration.PrinterConfiguration getDefaultPrinterConfiguration()`
- `public com.github.javaparser.utils.LineSeparator getLineEndingStyle()`
- `public com.github.javaparser.utils.LineSeparator getLineEndingStyleOrDefault(com.github.javaparser.utils.LineSeparator p0)`
- `public com.github.javaparser.metamodel.NodeMetaModel getMetaModel()`
- `public <N extends com.github.javaparser.ast.Node> java.util.List getNodesByType(java.lang.Class p0)`
- `public java.util.List getOrphanComments()`
- `public java.util.Optional getParentNode()`
- `public com.github.javaparser.ast.Node getParentNodeForChildren()`
- `public com.github.javaparser.ast.Node$Parsedness getParsed()`
- `protected com.github.javaparser.printer.Printer getPrinter()`
- `protected com.github.javaparser.printer.Printer getPrinter(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `public java.util.Optional getRange()`
- `protected com.github.javaparser.resolution.SymbolResolver getSymbolResolver()`
- `public java.util.Optional getTokenRange()`
- `public boolean hasScope()`
- `public final int hashCode()`
- `public boolean isAncestorOf(com.github.javaparser.ast.Node p0)`
- `public boolean isPhantom()`
- `public boolean isRegistered(com.github.javaparser.ast.observer.AstObserver p0)`
- `public <P extends java.lang.Object> void notifyPropertyChange(com.github.javaparser.ast.observer.ObservableProperty p0, P p1, P p2)`
- `public void register(com.github.javaparser.ast.observer.AstObserver p0)`
- `public void register(com.github.javaparser.ast.observer.AstObserver p0, com.github.javaparser.ast.Node$ObserverRegistrationMode p1)`
- `public void registerForSubtree(com.github.javaparser.ast.observer.AstObserver p0)`
- `public boolean remove()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.Node removeComment()`
- `public void removeData(com.github.javaparser.ast.DataKey p0)`
- `public void removeForced()`
- `public boolean removeOrphanComment(com.github.javaparser.ast.comments.Comment p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `protected void setAsParentNodeOf(com.github.javaparser.ast.Node p0)`
- `protected void setAsParentNodeOf(com.github.javaparser.ast.NodeList p0)`
- `public final com.github.javaparser.ast.Node setBlockComment(java.lang.String p0)`
- `public com.github.javaparser.ast.Node setComment(com.github.javaparser.ast.comments.Comment p0)`
- `public <M extends java.lang.Object> void setData(com.github.javaparser.ast.DataKey p0, M p1)`
- `public final com.github.javaparser.ast.Node setLineComment(java.lang.String p0)`
- `public com.github.javaparser.ast.Node setParentNode(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.Node setParsed(com.github.javaparser.ast.Node$Parsedness p0)`
- `public com.github.javaparser.ast.Node setRange(com.github.javaparser.Range p0)`
- `public com.github.javaparser.ast.Node setTokenRange(com.github.javaparser.TokenRange p0)`
- `public java.util.stream.Stream stream()`
- `public java.util.stream.Stream stream(com.github.javaparser.ast.Node$TreeTraversal p0)`
- `public final java.lang.String toString()`
- `public final java.lang.String toString(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `public void tryAddImportToParentCompilationUnit(java.lang.Class p0)`
- `public void unregister(com.github.javaparser.ast.observer.AstObserver p0)`
- `public void walk(com.github.javaparser.ast.Node$TreeTraversal p0, java.util.function.Consumer p1)`
- `public <T extends com.github.javaparser.ast.Node> void walk(java.lang.Class p0, java.util.function.Consumer p1)`
- `public void walk(java.util.function.Consumer p0)`

---

## public static class `com.github.javaparser.ast.Node$BreadthFirstIterator`
implements `java.util.Iterator<com.github.javaparser.ast.Node>`  

**Constructors:**
- `public BreadthFirstIterator(com.github.javaparser.ast.Node p0)`

**Methods:**
- `public boolean hasNext()`
- `public com.github.javaparser.ast.Node next()`

---

## public static class `com.github.javaparser.ast.Node$DirectChildrenIterator`
implements `java.util.Iterator<com.github.javaparser.ast.Node>`  

**Constructors:**
- `public DirectChildrenIterator(com.github.javaparser.ast.Node p0)`

**Methods:**
- `public boolean hasNext()`
- `public com.github.javaparser.ast.Node next()`

---

## public final static enum `com.github.javaparser.ast.Node$ObserverRegistrationMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.Node$ObserverRegistrationMode JUST_THIS_NODE`
- `public final static com.github.javaparser.ast.Node$ObserverRegistrationMode SELF_PROPAGATING`
- `public final static com.github.javaparser.ast.Node$ObserverRegistrationMode THIS_NODE_AND_EXISTING_DESCENDANTS`

---

## public static class `com.github.javaparser.ast.Node$ParentsVisitor`
implements `java.util.Iterator<com.github.javaparser.ast.Node>`  

**Constructors:**
- `public ParentsVisitor(com.github.javaparser.ast.Node p0)`

**Methods:**
- `public boolean hasNext()`
- `public com.github.javaparser.ast.Node next()`

---

## public final static enum `com.github.javaparser.ast.Node$Parsedness`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.Node$Parsedness PARSED`
- `public final static com.github.javaparser.ast.Node$Parsedness UNPARSABLE`

---

## public static class `com.github.javaparser.ast.Node$PostOrderIterator`
implements `java.util.Iterator<com.github.javaparser.ast.Node>`  

**Constructors:**
- `public PostOrderIterator(com.github.javaparser.ast.Node p0)`

**Methods:**
- `public boolean hasNext()`
- `public com.github.javaparser.ast.Node next()`

---

## public static class `com.github.javaparser.ast.Node$PreOrderIterator`
implements `java.util.Iterator<com.github.javaparser.ast.Node>`  

**Constructors:**
- `public PreOrderIterator(com.github.javaparser.ast.Node p0)`

**Methods:**
- `public boolean hasNext()`
- `public com.github.javaparser.ast.Node next()`

---

## public final static enum `com.github.javaparser.ast.Node$TreeTraversal`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.Node$TreeTraversal BREADTHFIRST`
- `public final static com.github.javaparser.ast.Node$TreeTraversal DIRECT_CHILDREN`
- `public final static com.github.javaparser.ast.Node$TreeTraversal PARENTS`
- `public final static com.github.javaparser.ast.Node$TreeTraversal POSTORDER`
- `public final static com.github.javaparser.ast.Node$TreeTraversal PREORDER`

---

## public class `com.github.javaparser.ast.NodeList`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.HasParentNode<com.github.javaparser.ast.NodeList<N>>`, `com.github.javaparser.ast.observer.Observable`, `com.github.javaparser.ast.visitor.Visitable`, `java.lang.Iterable<N>`, `java.util.List<N>`  

**Constructors:**
- `public NodeList()`
- `public NodeList(N... p0)`
- `public NodeList(java.util.Collection p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public boolean add(N p0)`
- `public void add(int p0, N p1)`
- `public com.github.javaparser.ast.NodeList addAfter(N p0, N p1)`
- `public void addAll(com.github.javaparser.ast.NodeList p0)`
- `public boolean addAll(int p0, java.util.Collection p1)`
- `public boolean addAll(java.util.Collection p0)`
- `public com.github.javaparser.ast.NodeList addBefore(N p0, N p1)`
- `public com.github.javaparser.ast.NodeList addFirst(N p0)`
- `public com.github.javaparser.ast.NodeList addLast(N p0)`
- `public void clear()`
- `public boolean contains(N p0)`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public boolean equals(java.lang.Object p0)`
- `public void forEach(java.util.function.Consumer p0)`
- `public N get(int p0)`
- `public java.util.Optional getFirst()`
- `public java.util.Optional getLast()`
- `public java.util.Optional getParentNode()`
- `public com.github.javaparser.ast.Node getParentNodeForChildren()`
- `public int hashCode()`
- `public void ifNonEmpty(java.util.function.Consumer p0)`
- `public int indexOf(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public boolean isNonEmpty()`
- `public boolean isRegistered(com.github.javaparser.ast.observer.AstObserver p0)`
- `public java.util.Iterator iterator()`
- `public int lastIndexOf(java.lang.Object p0)`
- `public java.util.ListIterator listIterator()`
- `public java.util.ListIterator listIterator(int p0)`
- `public static <X extends com.github.javaparser.ast.Node> com.github.javaparser.ast.NodeList nodeList(X... p0)`
- `public static <X extends com.github.javaparser.ast.Node> com.github.javaparser.ast.NodeList nodeList(com.github.javaparser.ast.NodeList p0)`
- `public static <X extends com.github.javaparser.ast.Node> com.github.javaparser.ast.NodeList nodeList(java.util.Collection p0)`
- `public java.util.stream.Stream parallelStream()`
- `public void register(com.github.javaparser.ast.observer.AstObserver p0)`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public N remove(int p0)`
- `public boolean remove(java.lang.Object p0)`
- `public boolean removeAll(java.util.Collection p0)`
- `public N removeFirst()`
- `public boolean removeIf(java.util.function.Predicate p0)`
- `public N removeLast()`
- `public boolean replace(N p0, N p1)`
- `public void replaceAll(java.util.function.UnaryOperator p0)`
- `public boolean retainAll(java.util.Collection p0)`
- `public N set(int p0, N p1)`
- `public com.github.javaparser.ast.NodeList setParentNode(com.github.javaparser.ast.Node p0)`
- `public int size()`
- `public void sort(java.util.Comparator p0)`
- `public java.util.Spliterator spliterator()`
- `public java.util.List subList(int p0, int p1)`
- `public java.lang.Object[] toArray()`
- `public <T extends java.lang.Object> T[] toArray(T[] p0)`
- `public static <T extends com.github.javaparser.ast.Node> java.util.stream.Collector toNodeList()`
- `public java.lang.String toString()`
- `public void unregister(com.github.javaparser.ast.observer.AstObserver p0)`

---

## protected class `com.github.javaparser.ast.NodeList$NodeListIterator`
implements `java.util.ListIterator<N>`  

**Constructors:**
- `public NodeListIterator(java.util.List p0)`
- `public NodeListIterator(java.util.List p0, int p1)`

**Methods:**
- `public void add(N p0)`
- `public void forEachRemaining(java.util.function.Consumer p0)`
- `public boolean hasNext()`
- `public boolean hasPrevious()`
- `public N next()`
- `public int nextIndex()`
- `public N previous()`
- `public int previousIndex()`
- `public void remove()`
- `public void set(N p0)`

---

## public class `com.github.javaparser.ast.PackageDeclaration`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.PackageDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.PackageDeclaration>`  

**Constructors:**
- `public PackageDeclaration()`
- `public PackageDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.Name p2)`
- `public PackageDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.Name p1)`
- `public PackageDeclaration(com.github.javaparser.ast.expr.Name p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.PackageDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.metamodel.PackageDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.PackageDeclaration setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.PackageDeclaration setName(com.github.javaparser.ast.expr.Name p0)`

---

## public class `com.github.javaparser.ast.body.AnnotationDeclaration`
extends `com.github.javaparser.ast.body.TypeDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier<com.github.javaparser.ast.body.AnnotationDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration>`  

**Constructors:**
- `public AnnotationDeclaration()`
- `public AnnotationDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4)`
- `public AnnotationDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3)`
- `public AnnotationDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.FieldDeclaration addField(com.github.javaparser.ast.type.Type p0, java.lang.String p1, com.github.javaparser.ast.Modifier$Keyword... p2)`
- `public com.github.javaparser.ast.body.AnnotationDeclaration asAnnotationDeclaration()`
- `public com.github.javaparser.ast.body.AnnotationDeclaration clone()`
- `public com.github.javaparser.metamodel.AnnotationDeclarationMetaModel getMetaModel()`
- `public void ifAnnotationDeclaration(java.util.function.Consumer p0)`
- `public boolean isAnnotationDeclaration()`
- `public com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration resolve()`
- `public java.util.Optional toAnnotationDeclaration()`

---

## public class `com.github.javaparser.ast.body.AnnotationMemberDeclaration`
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.AnnotationMemberDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.AnnotationMemberDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.body.AnnotationMemberDeclaration,com.github.javaparser.ast.type.Type>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier<com.github.javaparser.ast.body.AnnotationMemberDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier<com.github.javaparser.ast.body.AnnotationMemberDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedAnnotationMemberDeclaration>`  

**Constructors:**
- `public AnnotationMemberDeclaration()`
- `public AnnotationMemberDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.type.Type p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.expr.Expression p5)`
- `public AnnotationMemberDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.type.Type p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.expr.Expression p4)`
- `public AnnotationMemberDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.type.Type p1, java.lang.String p2, com.github.javaparser.ast.expr.Expression p3)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration asAnnotationMemberDeclaration()`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration clone()`
- `public java.util.Optional getDefaultValue()`
- `public com.github.javaparser.metamodel.AnnotationMemberDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public void ifAnnotationMemberDeclaration(java.util.function.Consumer p0)`
- `public boolean isAnnotationMemberDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration removeDefaultValue()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedAnnotationMemberDeclaration resolve()`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration setDefaultValue(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration setType(com.github.javaparser.ast.type.Type p0)`
- `public java.util.Optional toAnnotationMemberDeclaration()`

---

## public abstract class `com.github.javaparser.ast.body.BodyDeclaration`<T extends com.github.javaparser.ast.body.BodyDeclaration<? extends java.lang.Object>>
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<T>`  

**Constructors:**
- `public BodyDeclaration()`
- `protected BodyDeclaration(com.github.javaparser.TokenRange p0)`
- `public BodyDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public BodyDeclaration(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public com.github.javaparser.ast.body.AnnotationDeclaration asAnnotationDeclaration()`
- `public com.github.javaparser.ast.body.AnnotationMemberDeclaration asAnnotationMemberDeclaration()`
- `public com.github.javaparser.ast.body.CallableDeclaration asCallableDeclaration()`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration asClassOrInterfaceDeclaration()`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration asCompactConstructorDeclaration()`
- `public com.github.javaparser.ast.body.ConstructorDeclaration asConstructorDeclaration()`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration asEnumConstantDeclaration()`
- `public com.github.javaparser.ast.body.EnumDeclaration asEnumDeclaration()`
- `public com.github.javaparser.ast.body.FieldDeclaration asFieldDeclaration()`
- `public com.github.javaparser.ast.body.InitializerDeclaration asInitializerDeclaration()`
- `public com.github.javaparser.ast.body.MethodDeclaration asMethodDeclaration()`
- `public com.github.javaparser.ast.body.RecordDeclaration asRecordDeclaration()`
- `public com.github.javaparser.ast.body.TypeDeclaration asTypeDeclaration()`
- `public com.github.javaparser.ast.body.BodyDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.metamodel.BodyDeclarationMetaModel getMetaModel()`
- `public void ifAnnotationDeclaration(java.util.function.Consumer p0)`
- `public void ifAnnotationMemberDeclaration(java.util.function.Consumer p0)`
- `public void ifCallableDeclaration(java.util.function.Consumer p0)`
- `public void ifClassOrInterfaceDeclaration(java.util.function.Consumer p0)`
- `public void ifCompactConstructorDeclaration(java.util.function.Consumer p0)`
- `public void ifConstructorDeclaration(java.util.function.Consumer p0)`
- `public void ifEnumConstantDeclaration(java.util.function.Consumer p0)`
- `public void ifEnumDeclaration(java.util.function.Consumer p0)`
- `public void ifFieldDeclaration(java.util.function.Consumer p0)`
- `public void ifInitializerDeclaration(java.util.function.Consumer p0)`
- `public void ifMethodDeclaration(java.util.function.Consumer p0)`
- `public void ifRecordDeclaration(java.util.function.Consumer p0)`
- `public void ifTypeDeclaration(java.util.function.Consumer p0)`
- `public boolean isAnnotationDeclaration()`
- `public boolean isAnnotationMemberDeclaration()`
- `public boolean isCallableDeclaration()`
- `public boolean isClassOrInterfaceDeclaration()`
- `public boolean isCompactConstructorDeclaration()`
- `public boolean isConstructorDeclaration()`
- `public boolean isEnumConstantDeclaration()`
- `public boolean isEnumDeclaration()`
- `public boolean isFieldDeclaration()`
- `public boolean isInitializerDeclaration()`
- `public boolean isMethodDeclaration()`
- `public boolean isRecordDeclaration()`
- `public boolean isTypeDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public T setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toAnnotationDeclaration()`
- `public java.util.Optional toAnnotationMemberDeclaration()`
- `public java.util.Optional toCallableDeclaration()`
- `public java.util.Optional toClassOrInterfaceDeclaration()`
- `public java.util.Optional toCompactConstructorDeclaration()`
- `public java.util.Optional toConstructorDeclaration()`
- `public java.util.Optional toEnumConstantDeclaration()`
- `public java.util.Optional toEnumDeclaration()`
- `public java.util.Optional toFieldDeclaration()`
- `public java.util.Optional toInitializerDeclaration()`
- `public java.util.Optional toMethodDeclaration()`
- `public java.util.Optional toRecordDeclaration()`
- `public java.util.Optional toTypeDeclaration()`

---

## public abstract class `com.github.javaparser.ast.body.CallableDeclaration`<T extends com.github.javaparser.ast.body.CallableDeclaration<? extends java.lang.Object>>
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithDeclaration`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithParameters<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier<T>`  

**Constructors:**
- `public CallableDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.body.ReceiverParameter p7)`

**Methods:**
- `protected java.lang.String appendThrowsIfRequested(boolean p0)`
- `public com.github.javaparser.ast.body.CallableDeclaration asCallableDeclaration()`
- `public com.github.javaparser.ast.body.CallableDeclaration clone()`
- `public com.github.javaparser.metamodel.CallableDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.NodeList getParameters()`
- `public java.util.Optional getReceiverParameter()`
- `public com.github.javaparser.ast.body.CallableDeclaration$Signature getSignature()`
- `public com.github.javaparser.ast.NodeList getThrownExceptions()`
- `public com.github.javaparser.ast.NodeList getTypeParameters()`
- `public void ifCallableDeclaration(java.util.function.Consumer p0)`
- `public boolean isCallableDeclaration()`
- `public boolean isFixedArityMethod()`
- `public boolean isVariableArityMethod()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.body.CallableDeclaration removeReceiverParameter()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public T setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public T setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public T setParameters(com.github.javaparser.ast.NodeList p0)`
- `public T setReceiverParameter(com.github.javaparser.ast.body.ReceiverParameter p0)`
- `public T setThrownExceptions(com.github.javaparser.ast.NodeList p0)`
- `public T setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toCallableDeclaration()`

---

## public static class `com.github.javaparser.ast.body.CallableDeclaration$Signature`

**Methods:**
- `public java.lang.String asString()`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public java.util.List getParameterTypes()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.ast.body.ClassOrInterfaceDeclaration`
extends `com.github.javaparser.ast.body.TypeDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExtends<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithImplements<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration>`  

**Constructors:**
- `public ClassOrInterfaceDeclaration()`
- `public ClassOrInterfaceDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, boolean p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.NodeList p7, com.github.javaparser.ast.NodeList p8)`
- `public ClassOrInterfaceDeclaration(com.github.javaparser.ast.NodeList p0, boolean p1, java.lang.String p2)`
- `public ClassOrInterfaceDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, boolean p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.NodeList p7)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration asClassOrInterfaceDeclaration()`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getExtendedTypes()`
- `public java.util.Optional getFullyQualifiedName()`
- `public com.github.javaparser.ast.NodeList getImplementedTypes()`
- `public com.github.javaparser.metamodel.ClassOrInterfaceDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getTypeParameters()`
- `public void ifClassOrInterfaceDeclaration(java.util.function.Consumer p0)`
- `public boolean isClassOrInterfaceDeclaration()`
- `public boolean isInnerClass()`
- `public boolean isInterface()`
- `public boolean isLocalClassDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration resolve()`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration setExtendedTypes(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration setImplementedTypes(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration setInterface(boolean p0)`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toClassOrInterfaceDeclaration()`

---

## public class `com.github.javaparser.ast.body.CompactConstructorDeclaration`
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<com.github.javaparser.ast.body.CompactConstructorDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration>`  

**Constructors:**
- `public CompactConstructorDeclaration()`
- `public CompactConstructorDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.stmt.BlockStmt p6)`
- `public CompactConstructorDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.stmt.BlockStmt p2)`
- `public CompactConstructorDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.stmt.BlockStmt p5)`
- `public CompactConstructorDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`
- `public CompactConstructorDeclaration(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `protected java.lang.String appendThrowsIfRequested(boolean p0)`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration asCompactConstructorDeclaration()`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration clone()`
- `public com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public java.lang.String getDeclarationAsString(boolean p0, boolean p1, boolean p2)`
- `public com.github.javaparser.metamodel.CompactConstructorDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.NodeList getThrownExceptions()`
- `public com.github.javaparser.ast.NodeList getTypeParameters()`
- `public void ifCompactConstructorDeclaration(java.util.function.Consumer p0)`
- `public boolean isCompactConstructorDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration resolve()`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration setThrownExceptions(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.CompactConstructorDeclaration setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toCompactConstructorDeclaration()`

---

## public class `com.github.javaparser.ast.body.ConstructorDeclaration`
extends `com.github.javaparser.ast.body.CallableDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithParameters<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration>`  

**Constructors:**
- `public ConstructorDeclaration()`
- `public ConstructorDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.stmt.BlockStmt p7, com.github.javaparser.ast.body.ReceiverParameter p8)`
- `public ConstructorDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.stmt.BlockStmt p6)`
- `public ConstructorDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.stmt.BlockStmt p6, com.github.javaparser.ast.body.ReceiverParameter p7)`
- `public ConstructorDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`
- `public ConstructorDeclaration(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration asConstructorDeclaration()`
- `public com.github.javaparser.ast.body.ConstructorDeclaration clone()`
- `public com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public java.lang.String getDeclarationAsString(boolean p0, boolean p1, boolean p2)`
- `public com.github.javaparser.metamodel.ConstructorDeclarationMetaModel getMetaModel()`
- `public void ifConstructorDeclaration(java.util.function.Consumer p0)`
- `public boolean isConstructorDeclaration()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration resolve()`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setParameters(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setThrownExceptions(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ConstructorDeclaration setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toConstructorDeclaration()`

---

## public class `com.github.javaparser.ast.body.EnumConstantDeclaration`
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithArguments<com.github.javaparser.ast.body.EnumConstantDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.EnumConstantDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.EnumConstantDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration>`  

**Constructors:**
- `public EnumConstantDeclaration()`
- `public EnumConstantDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4)`
- `public EnumConstantDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3)`
- `public EnumConstantDeclaration(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration asEnumConstantDeclaration()`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getArguments()`
- `public com.github.javaparser.ast.NodeList getClassBody()`
- `public com.github.javaparser.metamodel.EnumConstantDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public void ifEnumConstantDeclaration(java.util.function.Consumer p0)`
- `public boolean isEnumConstantDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration resolve()`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration setArguments(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration setClassBody(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public java.util.Optional toEnumConstantDeclaration()`

---

## public class `com.github.javaparser.ast.body.EnumDeclaration`
extends `com.github.javaparser.ast.body.TypeDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithImplements<com.github.javaparser.ast.body.EnumDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedEnumDeclaration>`  

**Constructors:**
- `public EnumDeclaration()`
- `public EnumDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6)`
- `public EnumDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5)`
- `public EnumDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.EnumDeclaration addEntry(com.github.javaparser.ast.body.EnumConstantDeclaration p0)`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration addEnumConstant(java.lang.String p0)`
- `public com.github.javaparser.ast.body.EnumDeclaration asEnumDeclaration()`
- `public com.github.javaparser.ast.body.EnumDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getEntries()`
- `public com.github.javaparser.ast.body.EnumConstantDeclaration getEntry(int p0)`
- `public com.github.javaparser.ast.NodeList getImplementedTypes()`
- `public com.github.javaparser.metamodel.EnumDeclarationMetaModel getMetaModel()`
- `public void ifEnumDeclaration(java.util.function.Consumer p0)`
- `public boolean isEnumDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedEnumDeclaration resolve()`
- `public com.github.javaparser.ast.body.EnumDeclaration setEntries(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.EnumDeclaration setEntry(int p0, com.github.javaparser.ast.body.EnumConstantDeclaration p1)`
- `public com.github.javaparser.ast.body.EnumDeclaration setImplementedTypes(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toEnumDeclaration()`

---

## public class `com.github.javaparser.ast.body.FieldDeclaration`
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithVariables<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration>`  

**Constructors:**
- `public FieldDeclaration()`
- `public FieldDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3)`
- `public FieldDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1)`
- `public FieldDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2)`
- `public FieldDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.body.VariableDeclarator p1)`
- `public FieldDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.type.Type p1, java.lang.String p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.FieldDeclaration asFieldDeclaration()`
- `public com.github.javaparser.ast.body.FieldDeclaration clone()`
- `public com.github.javaparser.ast.body.MethodDeclaration createGetter()`
- `public com.github.javaparser.ast.body.MethodDeclaration createSetter()`
- `public com.github.javaparser.metamodel.FieldDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.NodeList getVariables()`
- `public void ifFieldDeclaration(java.util.function.Consumer p0)`
- `public boolean isFieldDeclaration()`
- `public boolean isTransient()`
- `public boolean isVolatile()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration resolve()`
- `public com.github.javaparser.ast.body.FieldDeclaration setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.FieldDeclaration setTransient(boolean p0)`
- `public com.github.javaparser.ast.body.FieldDeclaration setVariables(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.FieldDeclaration setVolatile(boolean p0)`
- `public java.util.Optional toFieldDeclaration()`

---

## public class `com.github.javaparser.ast.body.InitializerDeclaration`
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt<com.github.javaparser.ast.body.InitializerDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.InitializerDeclaration>`  

**Constructors:**
- `public InitializerDeclaration()`
- `public InitializerDeclaration(boolean p0, com.github.javaparser.ast.stmt.BlockStmt p1)`
- `public InitializerDeclaration(com.github.javaparser.TokenRange p0, boolean p1, com.github.javaparser.ast.stmt.BlockStmt p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.InitializerDeclaration asInitializerDeclaration()`
- `public com.github.javaparser.ast.body.InitializerDeclaration clone()`
- `public com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public com.github.javaparser.metamodel.InitializerDeclarationMetaModel getMetaModel()`
- `public void ifInitializerDeclaration(java.util.function.Consumer p0)`
- `public boolean isInitializerDeclaration()`
- `public boolean isStatic()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.body.InitializerDeclaration setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.body.InitializerDeclaration setStatic(boolean p0)`
- `public java.util.Optional toInitializerDeclaration()`

---

## public class `com.github.javaparser.ast.body.MethodDeclaration`
extends `com.github.javaparser.ast.body.CallableDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithDeclaration`, `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithOptionalBlockStmt<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithParameters<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.body.MethodDeclaration,com.github.javaparser.ast.type.Type>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration>`  

**Constructors:**
- `public MethodDeclaration()`
- `public MethodDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.type.Type p4, com.github.javaparser.ast.expr.SimpleName p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.NodeList p7, com.github.javaparser.ast.stmt.BlockStmt p8, com.github.javaparser.ast.body.ReceiverParameter p9)`
- `public MethodDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.type.Type p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.stmt.BlockStmt p7)`
- `public MethodDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.type.Type p3, com.github.javaparser.ast.expr.SimpleName p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.stmt.BlockStmt p7, com.github.javaparser.ast.body.ReceiverParameter p8)`
- `public MethodDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.type.Type p1, java.lang.String p2)`
- `public MethodDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1, com.github.javaparser.ast.type.Type p2, com.github.javaparser.ast.NodeList p3)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.MethodDeclaration asMethodDeclaration()`
- `public com.github.javaparser.ast.body.MethodDeclaration clone()`
- `public java.util.Optional getBody()`
- `public java.lang.String getDeclarationAsString(boolean p0, boolean p1, boolean p2)`
- `public com.github.javaparser.metamodel.MethodDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public void ifMethodDeclaration(java.util.function.Consumer p0)`
- `public boolean isDefault()`
- `public boolean isMethodDeclaration()`
- `public boolean isNative()`
- `public boolean isSynchronized()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration removeBody()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration resolve()`
- `public com.github.javaparser.ast.body.MethodDeclaration setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setDefault(boolean p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setNative(boolean p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setParameters(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setSynchronized(boolean p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setThrownExceptions(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setType(com.github.javaparser.ast.type.Type p0)`
- `public com.github.javaparser.ast.body.MethodDeclaration setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.lang.String toDescriptor()`
- `public java.util.Optional toMethodDeclaration()`

---

## public class `com.github.javaparser.ast.body.Parameter`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.body.Parameter>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.Parameter>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.body.Parameter,com.github.javaparser.ast.type.Type>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.body.Parameter>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration>`  

**Constructors:**
- `public Parameter()`
- `public Parameter(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.type.Type p3, boolean p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.expr.SimpleName p6)`
- `public Parameter(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.type.Type p2, boolean p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.expr.SimpleName p5)`
- `public Parameter(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.expr.SimpleName p2)`
- `public Parameter(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public Parameter(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.Parameter clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.metamodel.ParameterMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public com.github.javaparser.ast.NodeList getVarArgsAnnotations()`
- `public boolean isFinal()`
- `public boolean isVarArgs()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration resolve()`
- `public com.github.javaparser.ast.body.Parameter setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.Parameter setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.Parameter setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.Parameter setType(com.github.javaparser.ast.type.Type p0)`
- `public com.github.javaparser.ast.body.Parameter setVarArgs(boolean p0)`
- `public com.github.javaparser.ast.body.Parameter setVarArgsAnnotations(com.github.javaparser.ast.NodeList p0)`

---

## public class `com.github.javaparser.ast.body.ReceiverParameter`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.body.ReceiverParameter>`, `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.body.ReceiverParameter>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.body.ReceiverParameter,com.github.javaparser.ast.type.Type>`  

**Constructors:**
- `public ReceiverParameter()`
- `public ReceiverParameter(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.type.Type p2, com.github.javaparser.ast.expr.Name p3)`
- `public ReceiverParameter(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.expr.Name p2)`
- `public ReceiverParameter(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.Name p1)`
- `public ReceiverParameter(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.ReceiverParameter clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.metamodel.ReceiverParameterMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.body.ReceiverParameter setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.ReceiverParameter setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.body.ReceiverParameter setType(com.github.javaparser.ast.type.Type p0)`

---

## public class `com.github.javaparser.ast.body.RecordDeclaration`
extends `com.github.javaparser.ast.body.TypeDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithImplements<com.github.javaparser.ast.body.RecordDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithParameters<com.github.javaparser.ast.body.RecordDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters<com.github.javaparser.ast.body.RecordDeclaration>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.body.RecordDeclaration>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration>`  

**Constructors:**
- `public RecordDeclaration()`
- `public RecordDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.NodeList p7, com.github.javaparser.ast.body.ReceiverParameter p8)`
- `public RecordDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5, com.github.javaparser.ast.NodeList p6, com.github.javaparser.ast.body.ReceiverParameter p7)`
- `public RecordDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.RecordDeclaration asRecordDeclaration()`
- `public com.github.javaparser.ast.body.RecordDeclaration clone()`
- `public java.util.List getCompactConstructors()`
- `public java.util.Optional getFullyQualifiedName()`
- `public com.github.javaparser.ast.NodeList getImplementedTypes()`
- `public com.github.javaparser.metamodel.RecordDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getParameters()`
- `public java.util.Optional getReceiverParameter()`
- `public com.github.javaparser.ast.NodeList getTypeParameters()`
- `public void ifRecordDeclaration(java.util.function.Consumer p0)`
- `public boolean isFinal()`
- `public boolean isLocalRecordDeclaration()`
- `public boolean isRecordDeclaration()`
- `public boolean isStatic()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.body.RecordDeclaration removeReceiverParameter()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration resolve()`
- `public com.github.javaparser.ast.body.RecordDeclaration setImplementedTypes(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.RecordDeclaration setParameters(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.body.RecordDeclaration setReceiverParameter(com.github.javaparser.ast.body.ReceiverParameter p0)`
- `public com.github.javaparser.ast.body.RecordDeclaration setTypeParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toRecordDeclaration()`

---

## public abstract class `com.github.javaparser.ast.body.TypeDeclaration`<T extends com.github.javaparser.ast.body.TypeDeclaration<? extends java.lang.Object>>
extends `com.github.javaparser.ast.body.BodyDeclaration`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithMembers<T>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier<T>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier<T>`  

**Constructors:**
- `public TypeDeclaration()`
- `public TypeDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4)`
- `public TypeDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3)`
- `public TypeDeclaration(com.github.javaparser.ast.NodeList p0, java.lang.String p1)`

**Methods:**
- `public T addMember(com.github.javaparser.ast.body.BodyDeclaration p0)`
- `public com.github.javaparser.ast.body.TypeDeclaration asTypeDeclaration()`
- `public com.github.javaparser.ast.body.TypeDeclaration clone()`
- `public java.util.List getCallablesWithSignature(com.github.javaparser.ast.body.CallableDeclaration$Signature p0)`
- `public java.util.Optional getFullyQualifiedName()`
- `public com.github.javaparser.ast.NodeList getMembers()`
- `public com.github.javaparser.metamodel.TypeDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public void ifTypeDeclaration(java.util.function.Consumer p0)`
- `public boolean isNestedType()`
- `public boolean isTopLevelType()`
- `public boolean isTypeDeclaration()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public abstract com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration resolve()`
- `public T setMembers(com.github.javaparser.ast.NodeList p0)`
- `public T setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public T setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public java.util.Optional toTypeDeclaration()`

---

## public class `com.github.javaparser.ast.body.VariableDeclarator`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.body.VariableDeclarator>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.body.VariableDeclarator,com.github.javaparser.ast.type.Type>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedValueDeclaration>`  

**Constructors:**
- `public VariableDeclarator()`
- `public VariableDeclarator(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.expr.Expression p3)`
- `public VariableDeclarator(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public VariableDeclarator(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.expr.Expression p2)`
- `public VariableDeclarator(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public VariableDeclarator(com.github.javaparser.ast.type.Type p0, java.lang.String p1, com.github.javaparser.ast.expr.Expression p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.body.VariableDeclarator clone()`
- `protected void customInitialization()`
- `public java.util.Optional getInitializer()`
- `public com.github.javaparser.metamodel.VariableDeclaratorMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.body.VariableDeclarator removeInitializer()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedValueDeclaration resolve()`
- `public com.github.javaparser.ast.body.VariableDeclarator setInitializer(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.body.VariableDeclarator setInitializer(java.lang.String p0)`
- `public com.github.javaparser.ast.body.VariableDeclarator setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.body.VariableDeclarator setType(com.github.javaparser.ast.type.Type p0)`

---

## public class `com.github.javaparser.ast.comments.BlockComment`
extends `com.github.javaparser.ast.comments.Comment`  

**Constructors:**
- `public BlockComment()`
- `public BlockComment(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public BlockComment(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.comments.BlockComment asBlockComment()`
- `public com.github.javaparser.ast.comments.BlockComment clone()`
- `public com.github.javaparser.metamodel.BlockCommentMetaModel getMetaModel()`
- `public void ifBlockComment(java.util.function.Consumer p0)`
- `public boolean isBlockComment()`
- `public java.util.Optional toBlockComment()`

---

## public abstract class `com.github.javaparser.ast.comments.Comment`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public Comment(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public Comment(java.lang.String p0)`

**Methods:**
- `public com.github.javaparser.ast.comments.BlockComment asBlockComment()`
- `public com.github.javaparser.ast.comments.JavadocComment asJavadocComment()`
- `public com.github.javaparser.ast.comments.LineComment asLineComment()`
- `public com.github.javaparser.ast.comments.Comment clone()`
- `public com.github.javaparser.ast.Node findRootNode()`
- `public java.util.Optional getCommentedNode()`
- `public java.lang.String getContent()`
- `public com.github.javaparser.metamodel.CommentMetaModel getMetaModel()`
- `public void ifBlockComment(java.util.function.Consumer p0)`
- `public void ifJavadocComment(java.util.function.Consumer p0)`
- `public void ifLineComment(java.util.function.Consumer p0)`
- `public boolean isBlockComment()`
- `public boolean isJavadocComment()`
- `public boolean isLineComment()`
- `public boolean isOrphan()`
- `public boolean remove()`
- `public com.github.javaparser.ast.Node setComment(com.github.javaparser.ast.comments.Comment p0)`
- `public com.github.javaparser.ast.comments.Comment setCommentedNode(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.comments.Comment setContent(java.lang.String p0)`
- `public java.util.Optional toBlockComment()`
- `public java.util.Optional toJavadocComment()`
- `public java.util.Optional toLineComment()`

---

## public class `com.github.javaparser.ast.comments.CommentsCollection`

**Constructors:**
- `public CommentsCollection()`
- `public CommentsCollection(java.util.Collection p0)`

**Methods:**
- `public void addComment(com.github.javaparser.ast.comments.Comment p0)`
- `public boolean contains(com.github.javaparser.ast.comments.Comment p0)`
- `public com.github.javaparser.ast.comments.CommentsCollection copy()`
- `public java.util.Set getBlockComments()`
- `public java.util.TreeSet getComments()`
- `public java.util.Set getJavadocComments()`
- `public java.util.Set getLineComments()`
- `public com.github.javaparser.ast.comments.CommentsCollection minus(com.github.javaparser.ast.comments.CommentsCollection p0)`
- `public int size()`

---

## public class `com.github.javaparser.ast.comments.JavadocComment`
extends `com.github.javaparser.ast.comments.Comment`  

**Constructors:**
- `public JavadocComment()`
- `public JavadocComment(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public JavadocComment(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.comments.JavadocComment asJavadocComment()`
- `public com.github.javaparser.ast.comments.JavadocComment clone()`
- `public com.github.javaparser.metamodel.JavadocCommentMetaModel getMetaModel()`
- `public void ifJavadocComment(java.util.function.Consumer p0)`
- `public boolean isJavadocComment()`
- `public com.github.javaparser.javadoc.Javadoc parse()`
- `public java.util.Optional toJavadocComment()`

---

## public class `com.github.javaparser.ast.comments.LineComment`
extends `com.github.javaparser.ast.comments.Comment`  

**Constructors:**
- `public LineComment()`
- `public LineComment(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public LineComment(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.comments.LineComment asLineComment()`
- `public com.github.javaparser.ast.comments.LineComment clone()`
- `public com.github.javaparser.metamodel.LineCommentMetaModel getMetaModel()`
- `public void ifLineComment(java.util.function.Consumer p0)`
- `public boolean isLineComment()`
- `public java.util.Optional toLineComment()`

---

## public abstract class `com.github.javaparser.ast.expr.AnnotationExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.expr.AnnotationExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration>`  

**Constructors:**
- `public AnnotationExpr()`
- `public AnnotationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1)`
- `public AnnotationExpr(com.github.javaparser.ast.expr.Name p0)`

**Fields:**
- `protected com.github.javaparser.ast.expr.Name name`

**Methods:**
- `public com.github.javaparser.ast.expr.AnnotationExpr asAnnotationExpr()`
- `public com.github.javaparser.ast.expr.AnnotationExpr clone()`
- `public com.github.javaparser.metamodel.AnnotationExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public void ifAnnotationExpr(java.util.function.Consumer p0)`
- `public boolean isAnnotationExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration resolve()`
- `public com.github.javaparser.ast.expr.AnnotationExpr setName(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toAnnotationExpr()`

---

## public class `com.github.javaparser.ast.expr.ArrayAccessExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public ArrayAccessExpr()`
- `public ArrayAccessExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2)`
- `public ArrayAccessExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ArrayAccessExpr asArrayAccessExpr()`
- `public com.github.javaparser.ast.expr.ArrayAccessExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getIndex()`
- `public com.github.javaparser.metamodel.ArrayAccessExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Expression getName()`
- `public void ifArrayAccessExpr(java.util.function.Consumer p0)`
- `public boolean isArrayAccessExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.ArrayAccessExpr setIndex(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.ArrayAccessExpr setName(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toArrayAccessExpr()`

---

## public class `com.github.javaparser.ast.expr.ArrayCreationExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public ArrayCreationExpr()`
- `public ArrayCreationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.ArrayInitializerExpr p3)`
- `public ArrayCreationExpr(com.github.javaparser.ast.type.Type p0)`
- `public ArrayCreationExpr(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.ArrayInitializerExpr p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr asArrayCreationExpr()`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr clone()`
- `public com.github.javaparser.ast.type.Type createdType()`
- `public com.github.javaparser.ast.type.Type getElementType()`
- `public java.util.Optional getInitializer()`
- `public com.github.javaparser.ast.NodeList getLevels()`
- `public com.github.javaparser.metamodel.ArrayCreationExprMetaModel getMetaModel()`
- `public void ifArrayCreationExpr(java.util.function.Consumer p0)`
- `public boolean isArrayCreationExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr removeInitializer()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr setElementType(com.github.javaparser.ast.type.Type p0)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr setElementType(java.lang.Class p0)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr setElementType(java.lang.String p0)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr setInitializer(com.github.javaparser.ast.expr.ArrayInitializerExpr p0)`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr setLevels(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toArrayCreationExpr()`

---

## public class `com.github.javaparser.ast.expr.ArrayInitializerExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public ArrayInitializerExpr()`
- `public ArrayInitializerExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public ArrayInitializerExpr(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ArrayInitializerExpr asArrayInitializerExpr()`
- `public com.github.javaparser.ast.expr.ArrayInitializerExpr clone()`
- `public com.github.javaparser.metamodel.ArrayInitializerExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getValues()`
- `public void ifArrayInitializerExpr(java.util.function.Consumer p0)`
- `public boolean isArrayInitializerExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.ArrayInitializerExpr setValues(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toArrayInitializerExpr()`

---

## public class `com.github.javaparser.ast.expr.AssignExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public AssignExpr()`
- `public AssignExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.expr.AssignExpr$Operator p3)`
- `public AssignExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.AssignExpr$Operator p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.AssignExpr asAssignExpr()`
- `public com.github.javaparser.ast.expr.AssignExpr clone()`
- `public com.github.javaparser.metamodel.AssignExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.AssignExpr$Operator getOperator()`
- `public com.github.javaparser.ast.expr.Expression getTarget()`
- `public com.github.javaparser.ast.expr.Expression getValue()`
- `public void ifAssignExpr(java.util.function.Consumer p0)`
- `public boolean isAssignExpr()`
- `protected boolean isAssignmentContext()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.AssignExpr setOperator(com.github.javaparser.ast.expr.AssignExpr$Operator p0)`
- `public com.github.javaparser.ast.expr.AssignExpr setTarget(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.AssignExpr setValue(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toAssignExpr()`

---

## public final static enum `com.github.javaparser.ast.expr.AssignExpr$Operator`
extends `java.lang.Enum`  
implements `com.github.javaparser.printer.Stringable`  

**Fields:**
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator ASSIGN`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator BINARY_AND`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator BINARY_OR`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator DIVIDE`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator LEFT_SHIFT`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator MINUS`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator MULTIPLY`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator PLUS`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator REMAINDER`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator SIGNED_RIGHT_SHIFT`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator UNSIGNED_RIGHT_SHIFT`
- `public final static com.github.javaparser.ast.expr.AssignExpr$Operator XOR`

**Methods:**
- `public java.lang.String asString()`
- `public java.util.Optional toBinaryOperator()`

---

## public class `com.github.javaparser.ast.expr.BinaryExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public BinaryExpr()`
- `public BinaryExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.expr.BinaryExpr$Operator p3)`
- `public BinaryExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.BinaryExpr$Operator p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.BinaryExpr asBinaryExpr()`
- `public com.github.javaparser.ast.expr.BinaryExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getLeft()`
- `public com.github.javaparser.metamodel.BinaryExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.BinaryExpr$Operator getOperator()`
- `public com.github.javaparser.ast.expr.Expression getRight()`
- `public void ifBinaryExpr(java.util.function.Consumer p0)`
- `public boolean isBinaryExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.BinaryExpr setLeft(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.BinaryExpr setOperator(com.github.javaparser.ast.expr.BinaryExpr$Operator p0)`
- `public com.github.javaparser.ast.expr.BinaryExpr setRight(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toBinaryExpr()`

---

## public final static enum `com.github.javaparser.ast.expr.BinaryExpr$Operator`
extends `java.lang.Enum`  
implements `com.github.javaparser.printer.Stringable`  

**Fields:**
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator AND`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator BINARY_AND`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator BINARY_OR`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator DIVIDE`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator EQUALS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator GREATER`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator GREATER_EQUALS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator LEFT_SHIFT`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator LESS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator LESS_EQUALS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator MINUS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator MULTIPLY`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator NOT_EQUALS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator OR`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator PLUS`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator REMAINDER`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator SIGNED_RIGHT_SHIFT`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator UNSIGNED_RIGHT_SHIFT`
- `public final static com.github.javaparser.ast.expr.BinaryExpr$Operator XOR`

**Methods:**
- `public java.lang.String asString()`
- `public java.util.Optional toAssignOperator()`

---

## public class `com.github.javaparser.ast.expr.BooleanLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralExpr`  

**Constructors:**
- `public BooleanLiteralExpr()`
- `public BooleanLiteralExpr(boolean p0)`
- `public BooleanLiteralExpr(com.github.javaparser.TokenRange p0, boolean p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.BooleanLiteralExpr asBooleanLiteralExpr()`
- `public com.github.javaparser.ast.expr.BooleanLiteralExpr clone()`
- `public com.github.javaparser.metamodel.BooleanLiteralExprMetaModel getMetaModel()`
- `public boolean getValue()`
- `public void ifBooleanLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isBooleanLiteralExpr()`
- `public boolean isValue()`
- `public com.github.javaparser.ast.expr.BooleanLiteralExpr setValue(boolean p0)`
- `public java.util.Optional toBooleanLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.CastExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.expr.CastExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.CastExpr,com.github.javaparser.ast.type.Type>`  

**Constructors:**
- `public CastExpr()`
- `public CastExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.expr.Expression p2)`
- `public CastExpr(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.CastExpr asCastExpr()`
- `public com.github.javaparser.ast.expr.CastExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.CastExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public void ifCastExpr(java.util.function.Consumer p0)`
- `public boolean isCastExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.CastExpr setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.CastExpr setType(com.github.javaparser.ast.type.Type p0)`
- `public java.util.Optional toCastExpr()`

---

## public class `com.github.javaparser.ast.expr.CharLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public CharLiteralExpr()`
- `public CharLiteralExpr(char p0)`
- `public CharLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public CharLiteralExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public char asChar()`
- `public com.github.javaparser.ast.expr.CharLiteralExpr asCharLiteralExpr()`
- `public com.github.javaparser.ast.expr.CharLiteralExpr clone()`
- `public static com.github.javaparser.ast.expr.CharLiteralExpr escape(java.lang.String p0)`
- `public com.github.javaparser.metamodel.CharLiteralExprMetaModel getMetaModel()`
- `public void ifCharLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isCharLiteralExpr()`
- `public com.github.javaparser.ast.expr.CharLiteralExpr setChar(char p0)`
- `public java.util.Optional toCharLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.ClassExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.ClassExpr,com.github.javaparser.ast.type.Type>`  

**Constructors:**
- `public ClassExpr()`
- `public ClassExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1)`
- `public ClassExpr(com.github.javaparser.ast.type.Type p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ClassExpr asClassExpr()`
- `public com.github.javaparser.ast.expr.ClassExpr clone()`
- `public com.github.javaparser.metamodel.ClassExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public void ifClassExpr(java.util.function.Consumer p0)`
- `public boolean isClassExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.ClassExpr setType(com.github.javaparser.ast.type.Type p0)`
- `public java.util.Optional toClassExpr()`

---

## public class `com.github.javaparser.ast.expr.ConditionalExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithCondition<com.github.javaparser.ast.expr.ConditionalExpr>`  

**Constructors:**
- `public ConditionalExpr()`
- `public ConditionalExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.expr.Expression p3)`
- `public ConditionalExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ConditionalExpr asConditionalExpr()`
- `public com.github.javaparser.ast.expr.ConditionalExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getCondition()`
- `public com.github.javaparser.ast.expr.Expression getElseExpr()`
- `public com.github.javaparser.metamodel.ConditionalExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Expression getThenExpr()`
- `public void ifConditionalExpr(java.util.function.Consumer p0)`
- `public boolean isConditionalExpr()`
- `public boolean isPolyExpression()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.ConditionalExpr setCondition(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.ConditionalExpr setElseExpr(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.ConditionalExpr setThenExpr(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toConditionalExpr()`

---

## public class `com.github.javaparser.ast.expr.DoubleLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public DoubleLiteralExpr()`
- `public DoubleLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public DoubleLiteralExpr(double p0)`
- `public DoubleLiteralExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public double asDouble()`
- `public com.github.javaparser.ast.expr.DoubleLiteralExpr asDoubleLiteralExpr()`
- `public com.github.javaparser.ast.expr.DoubleLiteralExpr clone()`
- `public com.github.javaparser.metamodel.DoubleLiteralExprMetaModel getMetaModel()`
- `public void ifDoubleLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isDoubleLiteralExpr()`
- `public com.github.javaparser.ast.expr.DoubleLiteralExpr setDouble(double p0)`
- `public java.util.Optional toDoubleLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.EnclosedExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public EnclosedExpr()`
- `public EnclosedExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1)`
- `public EnclosedExpr(com.github.javaparser.ast.expr.Expression p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.EnclosedExpr asEnclosedExpr()`
- `public com.github.javaparser.ast.expr.EnclosedExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getInner()`
- `public com.github.javaparser.metamodel.EnclosedExprMetaModel getMetaModel()`
- `public void ifEnclosedExpr(java.util.function.Consumer p0)`
- `public boolean isEnclosedExpr()`
- `public boolean isPolyExpression()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.EnclosedExpr setInner(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toEnclosedExpr()`

---

## public abstract class `com.github.javaparser.ast.expr.Expression`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public Expression()`
- `public Expression(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public final boolean appearsInAssignmentContext()`
- `public final boolean appearsInInvocationContext()`
- `public com.github.javaparser.ast.expr.AnnotationExpr asAnnotationExpr()`
- `public com.github.javaparser.ast.expr.ArrayAccessExpr asArrayAccessExpr()`
- `public com.github.javaparser.ast.expr.ArrayCreationExpr asArrayCreationExpr()`
- `public com.github.javaparser.ast.expr.ArrayInitializerExpr asArrayInitializerExpr()`
- `public com.github.javaparser.ast.expr.AssignExpr asAssignExpr()`
- `public com.github.javaparser.ast.expr.BinaryExpr asBinaryExpr()`
- `public com.github.javaparser.ast.expr.BooleanLiteralExpr asBooleanLiteralExpr()`
- `public com.github.javaparser.ast.expr.CastExpr asCastExpr()`
- `public com.github.javaparser.ast.expr.CharLiteralExpr asCharLiteralExpr()`
- `public com.github.javaparser.ast.expr.ClassExpr asClassExpr()`
- `public com.github.javaparser.ast.expr.ConditionalExpr asConditionalExpr()`
- `public com.github.javaparser.ast.expr.DoubleLiteralExpr asDoubleLiteralExpr()`
- `public com.github.javaparser.ast.expr.EnclosedExpr asEnclosedExpr()`
- `public com.github.javaparser.ast.expr.FieldAccessExpr asFieldAccessExpr()`
- `public com.github.javaparser.ast.expr.InstanceOfExpr asInstanceOfExpr()`
- `public com.github.javaparser.ast.expr.IntegerLiteralExpr asIntegerLiteralExpr()`
- `public com.github.javaparser.ast.expr.LambdaExpr asLambdaExpr()`
- `public com.github.javaparser.ast.expr.LiteralExpr asLiteralExpr()`
- `public com.github.javaparser.ast.expr.LiteralStringValueExpr asLiteralStringValueExpr()`
- `public com.github.javaparser.ast.expr.LongLiteralExpr asLongLiteralExpr()`
- `public com.github.javaparser.ast.expr.MarkerAnnotationExpr asMarkerAnnotationExpr()`
- `public com.github.javaparser.ast.expr.MethodCallExpr asMethodCallExpr()`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr asMethodReferenceExpr()`
- `public com.github.javaparser.ast.expr.NameExpr asNameExpr()`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr asNormalAnnotationExpr()`
- `public com.github.javaparser.ast.expr.NullLiteralExpr asNullLiteralExpr()`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr asObjectCreationExpr()`
- `public com.github.javaparser.ast.expr.PatternExpr asPatternExpr()`
- `public com.github.javaparser.ast.expr.SingleMemberAnnotationExpr asSingleMemberAnnotationExpr()`
- `public com.github.javaparser.ast.expr.StringLiteralExpr asStringLiteralExpr()`
- `public com.github.javaparser.ast.expr.SuperExpr asSuperExpr()`
- `public com.github.javaparser.ast.expr.SwitchExpr asSwitchExpr()`
- `public com.github.javaparser.ast.expr.TextBlockLiteralExpr asTextBlockLiteralExpr()`
- `public com.github.javaparser.ast.expr.ThisExpr asThisExpr()`
- `public com.github.javaparser.ast.expr.TypeExpr asTypeExpr()`
- `public com.github.javaparser.ast.expr.UnaryExpr asUnaryExpr()`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr asVariableDeclarationExpr()`
- `public com.github.javaparser.resolution.types.ResolvedType calculateResolvedType()`
- `public com.github.javaparser.ast.expr.Expression clone()`
- `public final boolean elidesTypeArguments()`
- `public com.github.javaparser.metamodel.ExpressionMetaModel getMetaModel()`
- `public void ifAnnotationExpr(java.util.function.Consumer p0)`
- `public void ifArrayAccessExpr(java.util.function.Consumer p0)`
- `public void ifArrayCreationExpr(java.util.function.Consumer p0)`
- `public void ifArrayInitializerExpr(java.util.function.Consumer p0)`
- `public void ifAssignExpr(java.util.function.Consumer p0)`
- `public void ifBinaryExpr(java.util.function.Consumer p0)`
- `public void ifBooleanLiteralExpr(java.util.function.Consumer p0)`
- `public void ifCastExpr(java.util.function.Consumer p0)`
- `public void ifCharLiteralExpr(java.util.function.Consumer p0)`
- `public void ifClassExpr(java.util.function.Consumer p0)`
- `public void ifConditionalExpr(java.util.function.Consumer p0)`
- `public void ifDoubleLiteralExpr(java.util.function.Consumer p0)`
- `public void ifEnclosedExpr(java.util.function.Consumer p0)`
- `public void ifFieldAccessExpr(java.util.function.Consumer p0)`
- `public void ifInstanceOfExpr(java.util.function.Consumer p0)`
- `public void ifIntegerLiteralExpr(java.util.function.Consumer p0)`
- `public void ifLambdaExpr(java.util.function.Consumer p0)`
- `public void ifLiteralExpr(java.util.function.Consumer p0)`
- `public void ifLiteralStringValueExpr(java.util.function.Consumer p0)`
- `public void ifLongLiteralExpr(java.util.function.Consumer p0)`
- `public void ifMarkerAnnotationExpr(java.util.function.Consumer p0)`
- `public void ifMethodCallExpr(java.util.function.Consumer p0)`
- `public void ifMethodReferenceExpr(java.util.function.Consumer p0)`
- `public void ifNameExpr(java.util.function.Consumer p0)`
- `public void ifNormalAnnotationExpr(java.util.function.Consumer p0)`
- `public void ifNullLiteralExpr(java.util.function.Consumer p0)`
- `public void ifObjectCreationExpr(java.util.function.Consumer p0)`
- `public void ifPatternExpr(java.util.function.Consumer p0)`
- `public void ifSingleMemberAnnotationExpr(java.util.function.Consumer p0)`
- `public void ifStringLiteralExpr(java.util.function.Consumer p0)`
- `public void ifSuperExpr(java.util.function.Consumer p0)`
- `public void ifSwitchExpr(java.util.function.Consumer p0)`
- `public void ifTextBlockLiteralExpr(java.util.function.Consumer p0)`
- `public void ifThisExpr(java.util.function.Consumer p0)`
- `public void ifTypeExpr(java.util.function.Consumer p0)`
- `public void ifUnaryExpr(java.util.function.Consumer p0)`
- `public void ifVariableDeclarationExpr(java.util.function.Consumer p0)`
- `public boolean isAnnotationExpr()`
- `public boolean isArrayAccessExpr()`
- `public boolean isArrayCreationExpr()`
- `public boolean isArrayInitializerExpr()`
- `public boolean isAssignExpr()`
- `protected boolean isAssignmentContext()`
- `public boolean isBinaryExpr()`
- `public boolean isBooleanLiteralExpr()`
- `public boolean isCastExpr()`
- `public boolean isCharLiteralExpr()`
- `public boolean isClassExpr()`
- `public boolean isConditionalExpr()`
- `public boolean isDoubleLiteralExpr()`
- `public boolean isEnclosedExpr()`
- `public boolean isFieldAccessExpr()`
- `public boolean isInstanceOfExpr()`
- `public boolean isIntegerLiteralExpr()`
- `protected boolean isInvocationContext()`
- `public boolean isLambdaExpr()`
- `public boolean isLiteralExpr()`
- `public boolean isLiteralStringValueExpr()`
- `public boolean isLongLiteralExpr()`
- `public boolean isMarkerAnnotationExpr()`
- `public boolean isMethodCallExpr()`
- `public boolean isMethodReferenceExpr()`
- `public boolean isNameExpr()`
- `public boolean isNormalAnnotationExpr()`
- `public boolean isNullLiteralExpr()`
- `public boolean isObjectCreationExpr()`
- `public boolean isPatternExpr()`
- `public boolean isPolyExpression()`
- `public boolean isQualified()`
- `public boolean isSingleMemberAnnotationExpr()`
- `public boolean isStandaloneExpression()`
- `public boolean isStringLiteralExpr()`
- `public boolean isSuperExpr()`
- `public boolean isSwitchExpr()`
- `public boolean isTextBlockLiteralExpr()`
- `public boolean isThisExpr()`
- `public boolean isTypeExpr()`
- `public boolean isUnaryExpr()`
- `public boolean isVariableDeclarationExpr()`
- `public java.util.Optional toAnnotationExpr()`
- `public java.util.Optional toArrayAccessExpr()`
- `public java.util.Optional toArrayCreationExpr()`
- `public java.util.Optional toArrayInitializerExpr()`
- `public java.util.Optional toAssignExpr()`
- `public java.util.Optional toBinaryExpr()`
- `public java.util.Optional toBooleanLiteralExpr()`
- `public java.util.Optional toCastExpr()`
- `public java.util.Optional toCharLiteralExpr()`
- `public java.util.Optional toClassExpr()`
- `public java.util.Optional toConditionalExpr()`
- `public java.util.Optional toDoubleLiteralExpr()`
- `public java.util.Optional toEnclosedExpr()`
- `public java.util.Optional toFieldAccessExpr()`
- `public java.util.Optional toInstanceOfExpr()`
- `public java.util.Optional toIntegerLiteralExpr()`
- `public java.util.Optional toLambdaExpr()`
- `public java.util.Optional toLiteralExpr()`
- `public java.util.Optional toLiteralStringValueExpr()`
- `public java.util.Optional toLongLiteralExpr()`
- `public java.util.Optional toMarkerAnnotationExpr()`
- `public java.util.Optional toMethodCallExpr()`
- `public java.util.Optional toMethodReferenceExpr()`
- `public java.util.Optional toNameExpr()`
- `public java.util.Optional toNormalAnnotationExpr()`
- `public java.util.Optional toNullLiteralExpr()`
- `public java.util.Optional toObjectCreationExpr()`
- `public java.util.Optional toPatternExpr()`
- `public java.util.Optional toSingleMemberAnnotationExpr()`
- `public java.util.Optional toStringLiteralExpr()`
- `public java.util.Optional toSuperExpr()`
- `public java.util.Optional toSwitchExpr()`
- `public java.util.Optional toTextBlockLiteralExpr()`
- `public java.util.Optional toThisExpr()`
- `public java.util.Optional toTypeExpr()`
- `public java.util.Optional toUnaryExpr()`
- `public java.util.Optional toVariableDeclarationExpr()`

---

## public class `com.github.javaparser.ast.expr.FieldAccessExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithScope<com.github.javaparser.ast.expr.FieldAccessExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.expr.FieldAccessExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.expr.FieldAccessExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedValueDeclaration>`  

**Constructors:**
- `public FieldAccessExpr()`
- `public FieldAccessExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3)`
- `public FieldAccessExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2)`
- `public FieldAccessExpr(com.github.javaparser.ast.expr.Expression p0, java.lang.String p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.FieldAccessExpr asFieldAccessExpr()`
- `public com.github.javaparser.ast.expr.FieldAccessExpr clone()`
- `public com.github.javaparser.metamodel.FieldAccessExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.expr.Expression getScope()`
- `public java.util.Optional getTypeArguments()`
- `public void ifFieldAccessExpr(java.util.function.Consumer p0)`
- `public boolean isFieldAccessExpr()`
- `public boolean isInternal()`
- `public boolean isTopLevel()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedValueDeclaration resolve()`
- `public com.github.javaparser.ast.expr.FieldAccessExpr setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.expr.FieldAccessExpr setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.FieldAccessExpr setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toFieldAccessExpr()`

---

## public class `com.github.javaparser.ast.expr.InstanceOfExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.expr.InstanceOfExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.InstanceOfExpr,com.github.javaparser.ast.type.ReferenceType>`  

**Constructors:**
- `public InstanceOfExpr()`
- `public InstanceOfExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.type.ReferenceType p2, com.github.javaparser.ast.expr.PatternExpr p3)`
- `public InstanceOfExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.type.ReferenceType p1)`
- `public InstanceOfExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.type.ReferenceType p1, com.github.javaparser.ast.expr.PatternExpr p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.InstanceOfExpr asInstanceOfExpr()`
- `public com.github.javaparser.ast.expr.InstanceOfExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.InstanceOfExprMetaModel getMetaModel()`
- `public java.util.Optional getName()`
- `public java.util.Optional getPattern()`
- `public com.github.javaparser.ast.type.ReferenceType getType()`
- `public void ifInstanceOfExpr(java.util.function.Consumer p0)`
- `public boolean isInstanceOfExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.InstanceOfExpr removePattern()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.InstanceOfExpr setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.InstanceOfExpr setPattern(com.github.javaparser.ast.expr.PatternExpr p0)`
- `public com.github.javaparser.ast.expr.InstanceOfExpr setType(com.github.javaparser.ast.type.ReferenceType p0)`
- `public java.util.Optional toInstanceOfExpr()`

---

## public class `com.github.javaparser.ast.expr.IntegerLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public IntegerLiteralExpr()`
- `public IntegerLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public IntegerLiteralExpr(int p0)`
- `public IntegerLiteralExpr(java.lang.String p0)`

**Fields:**
- `public final static long MAX_31_BIT_UNSIGNED_VALUE_AS_LONG`
- `public final static java.lang.String MAX_31_BIT_UNSIGNED_VALUE_AS_STRING`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public int asInt()`
- `public com.github.javaparser.ast.expr.IntegerLiteralExpr asIntegerLiteralExpr()`
- `public java.lang.Number asNumber()`
- `public com.github.javaparser.ast.expr.IntegerLiteralExpr clone()`
- `public com.github.javaparser.metamodel.IntegerLiteralExprMetaModel getMetaModel()`
- `public void ifIntegerLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isIntegerLiteralExpr()`
- `public com.github.javaparser.ast.expr.IntegerLiteralExpr setInt(int p0)`
- `public java.util.Optional toIntegerLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.LambdaExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithParameters<com.github.javaparser.ast.expr.LambdaExpr>`  

**Constructors:**
- `public LambdaExpr()`
- `public LambdaExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.stmt.Statement p2, boolean p3)`
- `public LambdaExpr(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.Expression p1)`
- `public LambdaExpr(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.stmt.BlockStmt p1)`
- `public LambdaExpr(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.stmt.Statement p1, boolean p2)`
- `public LambdaExpr(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.expr.Expression p1)`
- `public LambdaExpr(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.stmt.BlockStmt p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.LambdaExpr asLambdaExpr()`
- `public com.github.javaparser.ast.expr.LambdaExpr clone()`
- `public com.github.javaparser.ast.stmt.Statement getBody()`
- `public java.util.Optional getExpressionBody()`
- `public com.github.javaparser.metamodel.LambdaExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getParameters()`
- `public void ifLambdaExpr(java.util.function.Consumer p0)`
- `public boolean isEnclosingParameters()`
- `public boolean isLambdaExpr()`
- `public boolean isPolyExpression()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.LambdaExpr setBody(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.expr.LambdaExpr setEnclosingParameters(boolean p0)`
- `public com.github.javaparser.ast.expr.LambdaExpr setParameters(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toLambdaExpr()`

---

## public abstract class `com.github.javaparser.ast.expr.LiteralExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public LiteralExpr()`
- `public LiteralExpr(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public com.github.javaparser.ast.expr.LiteralExpr asLiteralExpr()`
- `public com.github.javaparser.ast.expr.LiteralExpr clone()`
- `public com.github.javaparser.metamodel.LiteralExprMetaModel getMetaModel()`
- `public void ifLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isLiteralExpr()`
- `public java.util.Optional toLiteralExpr()`

---

## public abstract class `com.github.javaparser.ast.expr.LiteralStringValueExpr`
extends `com.github.javaparser.ast.expr.LiteralExpr`  

**Constructors:**
- `public LiteralStringValueExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public LiteralStringValueExpr(java.lang.String p0)`

**Fields:**
- `protected java.lang.String value`

**Methods:**
- `public com.github.javaparser.ast.expr.LiteralStringValueExpr asLiteralStringValueExpr()`
- `public com.github.javaparser.ast.expr.LiteralStringValueExpr clone()`
- `public com.github.javaparser.metamodel.LiteralStringValueExprMetaModel getMetaModel()`
- `public java.lang.String getValue()`
- `public void ifLiteralStringValueExpr(java.util.function.Consumer p0)`
- `public boolean isLiteralStringValueExpr()`
- `public com.github.javaparser.ast.expr.LiteralStringValueExpr setValue(java.lang.String p0)`
- `public java.util.Optional toLiteralStringValueExpr()`

---

## public class `com.github.javaparser.ast.expr.LongLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public LongLiteralExpr()`
- `public LongLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public LongLiteralExpr(java.lang.String p0)`
- `public LongLiteralExpr(long p0)`

**Fields:**
- `public final static java.math.BigInteger MAX_63_BIT_UNSIGNED_VALUE_AS_BIG_INTEGER`
- `public final static java.lang.String MAX_63_BIT_UNSIGNED_VALUE_AS_STRING`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public long asLong()`
- `public com.github.javaparser.ast.expr.LongLiteralExpr asLongLiteralExpr()`
- `public java.lang.Number asNumber()`
- `public com.github.javaparser.ast.expr.LongLiteralExpr clone()`
- `public com.github.javaparser.metamodel.LongLiteralExprMetaModel getMetaModel()`
- `public void ifLongLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isLongLiteralExpr()`
- `public com.github.javaparser.ast.expr.LongLiteralExpr setLong(long p0)`
- `public java.util.Optional toLongLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.MarkerAnnotationExpr`
extends `com.github.javaparser.ast.expr.AnnotationExpr`  

**Constructors:**
- `public MarkerAnnotationExpr()`
- `public MarkerAnnotationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1)`
- `public MarkerAnnotationExpr(com.github.javaparser.ast.expr.Name p0)`
- `public MarkerAnnotationExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.MarkerAnnotationExpr asMarkerAnnotationExpr()`
- `public com.github.javaparser.ast.expr.MarkerAnnotationExpr clone()`
- `public com.github.javaparser.metamodel.MarkerAnnotationExprMetaModel getMetaModel()`
- `public void ifMarkerAnnotationExpr(java.util.function.Consumer p0)`
- `public boolean isMarkerAnnotationExpr()`
- `public java.util.Optional toMarkerAnnotationExpr()`

---

## public class `com.github.javaparser.ast.expr.MemberValuePair`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.expr.MemberValuePair>`  

**Constructors:**
- `public MemberValuePair()`
- `public MemberValuePair(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.expr.Expression p2)`
- `public MemberValuePair(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.expr.Expression p1)`
- `public MemberValuePair(java.lang.String p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.MemberValuePair clone()`
- `public com.github.javaparser.metamodel.MemberValuePairMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.expr.Expression getValue()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.MemberValuePair setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.expr.MemberValuePair setValue(com.github.javaparser.ast.expr.Expression p0)`

---

## public class `com.github.javaparser.ast.expr.MethodCallExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithArguments<com.github.javaparser.ast.expr.MethodCallExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithOptionalScope<com.github.javaparser.ast.expr.MethodCallExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.expr.MethodCallExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.expr.MethodCallExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration>`  

**Constructors:**
- `public MethodCallExpr()`
- `public MethodCallExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.NodeList p4)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1, java.lang.String p2, com.github.javaparser.ast.NodeList p3)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.NodeList p2)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, java.lang.String p1)`
- `public MethodCallExpr(com.github.javaparser.ast.expr.Expression p0, java.lang.String p1, com.github.javaparser.ast.NodeList p2)`
- `public MethodCallExpr(java.lang.String p0, com.github.javaparser.ast.expr.Expression... p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.MethodCallExpr asMethodCallExpr()`
- `public com.github.javaparser.ast.expr.MethodCallExpr clone()`
- `public com.github.javaparser.ast.NodeList getArguments()`
- `public com.github.javaparser.metamodel.MethodCallExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public java.util.Optional getScope()`
- `public java.util.Optional getTypeArguments()`
- `public void ifMethodCallExpr(java.util.function.Consumer p0)`
- `protected boolean isInvocationContext()`
- `public boolean isMethodCallExpr()`
- `public boolean isPolyExpression()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.MethodCallExpr removeScope()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration resolve()`
- `public com.github.javaparser.ast.expr.MethodCallExpr setArguments(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.MethodCallExpr setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.expr.MethodCallExpr setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.MethodCallExpr setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toMethodCallExpr()`

---

## public class `com.github.javaparser.ast.expr.MethodReferenceExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithIdentifier<com.github.javaparser.ast.expr.MethodReferenceExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.expr.MethodReferenceExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration>`  

**Constructors:**
- `public MethodReferenceExpr()`
- `public MethodReferenceExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2, java.lang.String p3)`
- `public MethodReferenceExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1, java.lang.String p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr asMethodReferenceExpr()`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr clone()`
- `public java.lang.String getIdentifier()`
- `public com.github.javaparser.metamodel.MethodReferenceExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Expression getScope()`
- `public java.util.Optional getTypeArguments()`
- `public void ifMethodReferenceExpr(java.util.function.Consumer p0)`
- `public boolean isMethodReferenceExpr()`
- `public boolean isPolyExpression()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration resolve()`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr setIdentifier(java.lang.String p0)`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.MethodReferenceExpr setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toMethodReferenceExpr()`

---

## public class `com.github.javaparser.ast.expr.Name`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithIdentifier<com.github.javaparser.ast.expr.Name>`  

**Constructors:**
- `public Name()`
- `public Name(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, java.lang.String p2)`
- `public Name(com.github.javaparser.ast.expr.Name p0, java.lang.String p1)`
- `public Name(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.expr.Name clone()`
- `public java.lang.String getIdentifier()`
- `public com.github.javaparser.metamodel.NameMetaModel getMetaModel()`
- `public java.util.Optional getQualifier()`
- `public boolean isInternal()`
- `public boolean isTopLevel()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.Name removeQualifier()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.Name setIdentifier(java.lang.String p0)`
- `public com.github.javaparser.ast.expr.Name setQualifier(com.github.javaparser.ast.expr.Name p0)`

---

## public class `com.github.javaparser.ast.expr.NameExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.expr.NameExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedValueDeclaration>`  

**Constructors:**
- `public NameExpr()`
- `public NameExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public NameExpr(com.github.javaparser.ast.expr.SimpleName p0)`
- `public NameExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.NameExpr asNameExpr()`
- `public com.github.javaparser.ast.expr.NameExpr clone()`
- `public com.github.javaparser.metamodel.NameExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public void ifNameExpr(java.util.function.Consumer p0)`
- `public boolean isNameExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedValueDeclaration resolve()`
- `public com.github.javaparser.ast.expr.NameExpr setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public java.util.Optional toNameExpr()`

---

## public class `com.github.javaparser.ast.expr.NormalAnnotationExpr`
extends `com.github.javaparser.ast.expr.AnnotationExpr`  

**Constructors:**
- `public NormalAnnotationExpr()`
- `public NormalAnnotationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, com.github.javaparser.ast.NodeList p2)`
- `public NormalAnnotationExpr(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr addPair(java.lang.String p0, com.github.javaparser.ast.expr.Expression p1)`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr addPair(java.lang.String p0, java.lang.String p1)`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr asNormalAnnotationExpr()`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr clone()`
- `public com.github.javaparser.metamodel.NormalAnnotationExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getPairs()`
- `public void ifNormalAnnotationExpr(java.util.function.Consumer p0)`
- `public boolean isNormalAnnotationExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.NormalAnnotationExpr setPairs(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toNormalAnnotationExpr()`

---

## public class `com.github.javaparser.ast.expr.NullLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralExpr`  

**Constructors:**
- `public NullLiteralExpr()`
- `public NullLiteralExpr(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.NullLiteralExpr asNullLiteralExpr()`
- `public com.github.javaparser.ast.expr.NullLiteralExpr clone()`
- `public com.github.javaparser.metamodel.NullLiteralExprMetaModel getMetaModel()`
- `public void ifNullLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isNullLiteralExpr()`
- `public java.util.Optional toNullLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.ObjectCreationExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithArguments<com.github.javaparser.ast.expr.ObjectCreationExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithOptionalScope<com.github.javaparser.ast.expr.ObjectCreationExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.ObjectCreationExpr,com.github.javaparser.ast.type.ClassOrInterfaceType>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.expr.ObjectCreationExpr>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration>`  

**Constructors:**
- `public ObjectCreationExpr()`
- `public ObjectCreationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.type.ClassOrInterfaceType p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4, com.github.javaparser.ast.NodeList p5)`
- `public ObjectCreationExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.type.ClassOrInterfaceType p1, com.github.javaparser.ast.NodeList p2)`
- `public ObjectCreationExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.type.ClassOrInterfaceType p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public void addAnonymousClassBody(com.github.javaparser.ast.body.BodyDeclaration p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr asObjectCreationExpr()`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr clone()`
- `public java.util.Optional getAnonymousClassBody()`
- `public com.github.javaparser.ast.NodeList getArguments()`
- `public com.github.javaparser.metamodel.ObjectCreationExprMetaModel getMetaModel()`
- `public java.util.Optional getScope()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType getType()`
- `public java.util.Optional getTypeArguments()`
- `public void ifObjectCreationExpr(java.util.function.Consumer p0)`
- `public boolean isObjectCreationExpr()`
- `public boolean isPolyExpression()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr removeScope()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration resolve()`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr setAnonymousClassBody(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr setArguments(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr setType(com.github.javaparser.ast.type.ClassOrInterfaceType p0)`
- `public com.github.javaparser.ast.expr.ObjectCreationExpr setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toObjectCreationExpr()`

---

## public class `com.github.javaparser.ast.expr.PatternExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.expr.PatternExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.PatternExpr,com.github.javaparser.ast.type.ReferenceType>`  

**Constructors:**
- `public PatternExpr()`
- `public PatternExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.ReferenceType p1, com.github.javaparser.ast.expr.SimpleName p2)`
- `public PatternExpr(com.github.javaparser.ast.type.ReferenceType p0, com.github.javaparser.ast.expr.SimpleName p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.PatternExpr asPatternExpr()`
- `public com.github.javaparser.ast.expr.PatternExpr clone()`
- `public com.github.javaparser.metamodel.PatternExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.type.ReferenceType getType()`
- `public void ifPatternExpr(java.util.function.Consumer p0)`
- `public boolean isPatternExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.PatternExpr setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.expr.PatternExpr setType(com.github.javaparser.ast.type.ReferenceType p0)`
- `public java.util.Optional toPatternExpr()`

---

## public class `com.github.javaparser.ast.expr.SimpleName`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithIdentifier<com.github.javaparser.ast.expr.SimpleName>`  

**Constructors:**
- `public SimpleName()`
- `public SimpleName(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public SimpleName(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.expr.SimpleName clone()`
- `public java.lang.String getIdentifier()`
- `public com.github.javaparser.metamodel.SimpleNameMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName setIdentifier(java.lang.String p0)`

---

## public class `com.github.javaparser.ast.expr.SingleMemberAnnotationExpr`
extends `com.github.javaparser.ast.expr.AnnotationExpr`  

**Constructors:**
- `public SingleMemberAnnotationExpr()`
- `public SingleMemberAnnotationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, com.github.javaparser.ast.expr.Expression p2)`
- `public SingleMemberAnnotationExpr(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.SingleMemberAnnotationExpr asSingleMemberAnnotationExpr()`
- `public com.github.javaparser.ast.expr.SingleMemberAnnotationExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getMemberValue()`
- `public com.github.javaparser.metamodel.SingleMemberAnnotationExprMetaModel getMetaModel()`
- `public void ifSingleMemberAnnotationExpr(java.util.function.Consumer p0)`
- `public boolean isSingleMemberAnnotationExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.SingleMemberAnnotationExpr setMemberValue(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toSingleMemberAnnotationExpr()`

---

## public class `com.github.javaparser.ast.expr.StringLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public StringLiteralExpr()`
- `public StringLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public StringLiteralExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.expr.StringLiteralExpr asStringLiteralExpr()`
- `public com.github.javaparser.ast.expr.StringLiteralExpr clone()`
- `public com.github.javaparser.metamodel.StringLiteralExprMetaModel getMetaModel()`
- `public void ifStringLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isStringLiteralExpr()`
- `public com.github.javaparser.ast.expr.StringLiteralExpr setEscapedValue(java.lang.String p0)`
- `public com.github.javaparser.ast.expr.StringLiteralExpr setString(java.lang.String p0)`
- `public java.util.Optional toStringLiteralExpr()`

---

## public class `com.github.javaparser.ast.expr.SuperExpr`
extends `com.github.javaparser.ast.expr.Expression`  

**Constructors:**
- `public SuperExpr()`
- `public SuperExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1)`
- `public SuperExpr(com.github.javaparser.ast.expr.Name p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.SuperExpr asSuperExpr()`
- `public com.github.javaparser.ast.expr.SuperExpr clone()`
- `public com.github.javaparser.metamodel.SuperExprMetaModel getMetaModel()`
- `public java.util.Optional getTypeName()`
- `public void ifSuperExpr(java.util.function.Consumer p0)`
- `public boolean isSuperExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.SuperExpr removeClassName()`
- `public com.github.javaparser.ast.expr.SuperExpr removeTypeName()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.SuperExpr setTypeName(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toSuperExpr()`

---

## public class `com.github.javaparser.ast.expr.SwitchExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.SwitchNode`  

**Constructors:**
- `public SwitchExpr()`
- `public SwitchExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2)`
- `public SwitchExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.SwitchExpr asSwitchExpr()`
- `public com.github.javaparser.ast.expr.SwitchExpr clone()`
- `public com.github.javaparser.ast.NodeList getEntries()`
- `public com.github.javaparser.ast.stmt.SwitchEntry getEntry(int p0)`
- `public com.github.javaparser.metamodel.SwitchExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Expression getSelector()`
- `public void ifSwitchExpr(java.util.function.Consumer p0)`
- `public boolean isSwitchExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.SwitchExpr setEntries(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.SwitchExpr setSelector(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toSwitchExpr()`

---

## public class `com.github.javaparser.ast.expr.TextBlockLiteralExpr`
extends `com.github.javaparser.ast.expr.LiteralStringValueExpr`  

**Constructors:**
- `public TextBlockLiteralExpr()`
- `public TextBlockLiteralExpr(com.github.javaparser.TokenRange p0, java.lang.String p1)`
- `public TextBlockLiteralExpr(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.expr.TextBlockLiteralExpr asTextBlockLiteralExpr()`
- `public com.github.javaparser.ast.expr.TextBlockLiteralExpr clone()`
- `public com.github.javaparser.metamodel.TextBlockLiteralExprMetaModel getMetaModel()`
- `public void ifTextBlockLiteralExpr(java.util.function.Consumer p0)`
- `public boolean isTextBlockLiteralExpr()`
- `public java.lang.String stripIndent()`
- `public java.util.stream.Stream stripIndentOfLines()`
- `public java.util.Optional toTextBlockLiteralExpr()`
- `public java.lang.String translateEscapes()`

---

## public class `com.github.javaparser.ast.expr.ThisExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration>`  

**Constructors:**
- `public ThisExpr()`
- `public ThisExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1)`
- `public ThisExpr(com.github.javaparser.ast.expr.Name p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.ThisExpr asThisExpr()`
- `public com.github.javaparser.ast.expr.ThisExpr clone()`
- `public com.github.javaparser.metamodel.ThisExprMetaModel getMetaModel()`
- `public java.util.Optional getTypeName()`
- `public void ifThisExpr(java.util.function.Consumer p0)`
- `public boolean isThisExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.expr.ThisExpr removeClassName()`
- `public com.github.javaparser.ast.expr.ThisExpr removeTypeName()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration resolve()`
- `public com.github.javaparser.ast.expr.ThisExpr setTypeName(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toThisExpr()`

---

## public class `com.github.javaparser.ast.expr.TypeExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithType<com.github.javaparser.ast.expr.TypeExpr,com.github.javaparser.ast.type.Type>`  

**Constructors:**
- `public TypeExpr()`
- `public TypeExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1)`
- `public TypeExpr(com.github.javaparser.ast.type.Type p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.TypeExpr asTypeExpr()`
- `public com.github.javaparser.ast.expr.TypeExpr clone()`
- `public com.github.javaparser.metamodel.TypeExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.Type getType()`
- `public void ifTypeExpr(java.util.function.Consumer p0)`
- `public boolean isTypeExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.TypeExpr setType(com.github.javaparser.ast.type.Type p0)`
- `public java.util.Optional toTypeExpr()`

---

## public class `com.github.javaparser.ast.expr.UnaryExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.expr.UnaryExpr>`  

**Constructors:**
- `public UnaryExpr()`
- `public UnaryExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.UnaryExpr$Operator p2)`
- `public UnaryExpr(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.UnaryExpr$Operator p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.UnaryExpr asUnaryExpr()`
- `public com.github.javaparser.ast.expr.UnaryExpr clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.UnaryExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.UnaryExpr$Operator getOperator()`
- `public void ifUnaryExpr(java.util.function.Consumer p0)`
- `public boolean isPostfix()`
- `public boolean isPrefix()`
- `public boolean isUnaryExpr()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.UnaryExpr setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.expr.UnaryExpr setOperator(com.github.javaparser.ast.expr.UnaryExpr$Operator p0)`
- `public java.util.Optional toUnaryExpr()`

---

## public final static enum `com.github.javaparser.ast.expr.UnaryExpr$Operator`
extends `java.lang.Enum`  
implements `com.github.javaparser.printer.Stringable`  

**Fields:**
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator BITWISE_COMPLEMENT`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator LOGICAL_COMPLEMENT`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator MINUS`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator PLUS`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator POSTFIX_DECREMENT`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator POSTFIX_INCREMENT`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator PREFIX_DECREMENT`
- `public final static com.github.javaparser.ast.expr.UnaryExpr$Operator PREFIX_INCREMENT`

**Methods:**
- `public java.lang.String asString()`
- `public boolean isPostfix()`
- `public boolean isPrefix()`

---

## public class `com.github.javaparser.ast.expr.VariableDeclarationExpr`
extends `com.github.javaparser.ast.expr.Expression`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.expr.VariableDeclarationExpr>`, `com.github.javaparser.ast.nodeTypes.NodeWithVariables<com.github.javaparser.ast.expr.VariableDeclarationExpr>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier<com.github.javaparser.ast.expr.VariableDeclarationExpr>`  

**Constructors:**
- `public VariableDeclarationExpr()`
- `public VariableDeclarationExpr(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.NodeList p0)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.body.VariableDeclarator p0)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.body.VariableDeclarator p0, com.github.javaparser.ast.Modifier... p1)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public VariableDeclarationExpr(com.github.javaparser.ast.type.Type p0, java.lang.String p1, com.github.javaparser.ast.Modifier... p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr asVariableDeclarationExpr()`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.metamodel.VariableDeclarationExprMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.NodeList getVariables()`
- `public void ifVariableDeclarationExpr(java.util.function.Consumer p0)`
- `public boolean isVariableDeclarationExpr()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr setVariables(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toVariableDeclarationExpr()`

---

## public class `com.github.javaparser.ast.modules.ModuleDeclaration`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.modules.ModuleDeclaration>`, `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleDeclaration>`  

**Constructors:**
- `public ModuleDeclaration()`
- `public ModuleDeclaration(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.Name p2, boolean p3, com.github.javaparser.ast.NodeList p4)`
- `public ModuleDeclaration(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.Name p1, boolean p2, com.github.javaparser.ast.NodeList p3)`
- `public ModuleDeclaration(com.github.javaparser.ast.expr.Name p0, boolean p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration addDirective(com.github.javaparser.ast.modules.ModuleDirective p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration addDirective(java.lang.String p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration clone()`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.ast.NodeList getDirectives()`
- `public com.github.javaparser.metamodel.ModuleDeclarationMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public boolean isOpen()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration setDirectives(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.modules.ModuleDeclaration setOpen(boolean p0)`

---

## public abstract class `com.github.javaparser.ast.modules.ModuleDirective`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public ModuleDirective()`
- `public ModuleDirective(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public com.github.javaparser.ast.modules.ModuleExportsDirective asModuleExportsDirective()`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective asModuleExportsStmt()`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective asModuleOpensDirective()`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective asModuleOpensStmt()`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective asModuleProvidesDirective()`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective asModuleProvidesStmt()`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective asModuleRequiresDirective()`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective asModuleRequiresStmt()`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective asModuleUsesDirective()`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective asModuleUsesStmt()`
- `public com.github.javaparser.ast.modules.ModuleDirective clone()`
- `public com.github.javaparser.metamodel.ModuleDirectiveMetaModel getMetaModel()`
- `public void ifModuleExportsDirective(java.util.function.Consumer p0)`
- `public void ifModuleExportsStmt(java.util.function.Consumer p0)`
- `public void ifModuleOpensDirective(java.util.function.Consumer p0)`
- `public void ifModuleOpensStmt(java.util.function.Consumer p0)`
- `public void ifModuleProvidesDirective(java.util.function.Consumer p0)`
- `public void ifModuleProvidesStmt(java.util.function.Consumer p0)`
- `public void ifModuleRequiresDirective(java.util.function.Consumer p0)`
- `public void ifModuleRequiresStmt(java.util.function.Consumer p0)`
- `public void ifModuleUsesDirective(java.util.function.Consumer p0)`
- `public void ifModuleUsesStmt(java.util.function.Consumer p0)`
- `public boolean isModuleExportsDirective()`
- `public boolean isModuleExportsStmt()`
- `public boolean isModuleOpensDirective()`
- `public boolean isModuleOpensStmt()`
- `public boolean isModuleProvidesDirective()`
- `public boolean isModuleProvidesStmt()`
- `public boolean isModuleRequiresDirective()`
- `public boolean isModuleRequiresStmt()`
- `public boolean isModuleUsesDirective()`
- `public boolean isModuleUsesStmt()`
- `public java.util.Optional toModuleExportsDirective()`
- `public java.util.Optional toModuleExportsStmt()`
- `public java.util.Optional toModuleOpensDirective()`
- `public java.util.Optional toModuleOpensStmt()`
- `public java.util.Optional toModuleProvidesDirective()`
- `public java.util.Optional toModuleProvidesStmt()`
- `public java.util.Optional toModuleRequiresDirective()`
- `public java.util.Optional toModuleRequiresStmt()`
- `public java.util.Optional toModuleUsesDirective()`
- `public java.util.Optional toModuleUsesStmt()`

---

## public class `com.github.javaparser.ast.modules.ModuleExportsDirective`
extends `com.github.javaparser.ast.modules.ModuleDirective`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleExportsDirective>`  

**Constructors:**
- `public ModuleExportsDirective()`
- `public ModuleExportsDirective(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, com.github.javaparser.ast.NodeList p2)`
- `public ModuleExportsDirective(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective addModuleName(java.lang.String p0)`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective asModuleExportsDirective()`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective asModuleExportsStmt()`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective clone()`
- `public com.github.javaparser.metamodel.ModuleExportsDirectiveMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModuleNames()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public void ifModuleExportsDirective(java.util.function.Consumer p0)`
- `public void ifModuleExportsStmt(java.util.function.Consumer p0)`
- `public boolean isModuleExportsDirective()`
- `public boolean isModuleExportsStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective setModuleNames(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.modules.ModuleExportsDirective setName(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toModuleExportsDirective()`
- `public java.util.Optional toModuleExportsStmt()`

---

## public class `com.github.javaparser.ast.modules.ModuleOpensDirective`
extends `com.github.javaparser.ast.modules.ModuleDirective`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleOpensDirective>`  

**Constructors:**
- `public ModuleOpensDirective()`
- `public ModuleOpensDirective(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, com.github.javaparser.ast.NodeList p2)`
- `public ModuleOpensDirective(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective asModuleOpensDirective()`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective asModuleOpensStmt()`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective clone()`
- `public com.github.javaparser.metamodel.ModuleOpensDirectiveMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModuleNames()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public void ifModuleOpensDirective(java.util.function.Consumer p0)`
- `public void ifModuleOpensStmt(java.util.function.Consumer p0)`
- `public boolean isModuleOpensDirective()`
- `public boolean isModuleOpensStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective setModuleNames(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.modules.ModuleOpensDirective setName(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toModuleOpensDirective()`
- `public java.util.Optional toModuleOpensStmt()`

---

## public class `com.github.javaparser.ast.modules.ModuleProvidesDirective`
extends `com.github.javaparser.ast.modules.ModuleDirective`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleProvidesDirective>`  

**Constructors:**
- `public ModuleProvidesDirective()`
- `public ModuleProvidesDirective(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1, com.github.javaparser.ast.NodeList p2)`
- `public ModuleProvidesDirective(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective asModuleProvidesDirective()`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective asModuleProvidesStmt()`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective clone()`
- `public com.github.javaparser.metamodel.ModuleProvidesDirectiveMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public com.github.javaparser.ast.NodeList getWith()`
- `public void ifModuleProvidesDirective(java.util.function.Consumer p0)`
- `public void ifModuleProvidesStmt(java.util.function.Consumer p0)`
- `public boolean isModuleProvidesDirective()`
- `public boolean isModuleProvidesStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.modules.ModuleProvidesDirective setWith(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toModuleProvidesDirective()`
- `public java.util.Optional toModuleProvidesStmt()`

---

## public class `com.github.javaparser.ast.modules.ModuleRequiresDirective`
extends `com.github.javaparser.ast.modules.ModuleDirective`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleRequiresDirective>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier<com.github.javaparser.ast.modules.ModuleRequiresDirective>`  

**Constructors:**
- `public ModuleRequiresDirective()`
- `public ModuleRequiresDirective(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.Name p2)`
- `public ModuleRequiresDirective(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.Name p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective asModuleRequiresDirective()`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective asModuleRequiresStmt()`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective clone()`
- `public com.github.javaparser.metamodel.ModuleRequiresDirectiveMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getModifiers()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public void ifModuleRequiresDirective(java.util.function.Consumer p0)`
- `public void ifModuleRequiresStmt(java.util.function.Consumer p0)`
- `public boolean isModuleRequiresDirective()`
- `public boolean isModuleRequiresStmt()`
- `public boolean isTransitive()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective setModifiers(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.modules.ModuleRequiresDirective setTransitive(boolean p0)`
- `public java.util.Optional toModuleRequiresDirective()`
- `public java.util.Optional toModuleRequiresStmt()`

---

## public class `com.github.javaparser.ast.modules.ModuleUsesDirective`
extends `com.github.javaparser.ast.modules.ModuleDirective`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithName<com.github.javaparser.ast.modules.ModuleUsesDirective>`  

**Constructors:**
- `public ModuleUsesDirective()`
- `public ModuleUsesDirective(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Name p1)`
- `public ModuleUsesDirective(com.github.javaparser.ast.expr.Name p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective asModuleUsesDirective()`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective asModuleUsesStmt()`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective clone()`
- `public com.github.javaparser.metamodel.ModuleUsesDirectiveMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Name getName()`
- `public void ifModuleUsesDirective(java.util.function.Consumer p0)`
- `public void ifModuleUsesStmt(java.util.function.Consumer p0)`
- `public boolean isModuleUsesDirective()`
- `public boolean isModuleUsesStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective setName(com.github.javaparser.ast.expr.Name p0)`
- `public com.github.javaparser.ast.modules.ModuleUsesDirective setType(com.github.javaparser.ast.expr.Name p0)`
- `public java.util.Optional toModuleUsesDirective()`
- `public java.util.Optional toModuleUsesStmt()`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default com.github.javaparser.ast.expr.NormalAnnotationExpr addAndGetAnnotation(java.lang.Class p0)`
- `public default com.github.javaparser.ast.expr.NormalAnnotationExpr addAndGetAnnotation(java.lang.String p0)`
- `public default N addAnnotation(com.github.javaparser.ast.expr.AnnotationExpr p0)`
- `public default N addAnnotation(java.lang.Class p0)`
- `public default N addAnnotation(java.lang.String p0)`
- `public default N addMarkerAnnotation(java.lang.Class p0)`
- `public default N addMarkerAnnotation(java.lang.String p0)`
- `public default N addSingleMemberAnnotation(java.lang.Class p0, com.github.javaparser.ast.expr.Expression p1)`
- `public default N addSingleMemberAnnotation(java.lang.Class p0, java.lang.String p1)`
- `public default N addSingleMemberAnnotation(java.lang.String p0, com.github.javaparser.ast.expr.Expression p1)`
- `public default N addSingleMemberAnnotation(java.lang.String p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.expr.AnnotationExpr getAnnotation(int p0)`
- `public default java.util.Optional getAnnotationByClass(java.lang.Class p0)`
- `public default java.util.Optional getAnnotationByName(java.lang.String p0)`
- `public abstract com.github.javaparser.ast.NodeList getAnnotations()`
- `public default boolean isAnnotationPresent(java.lang.Class p0)`
- `public default boolean isAnnotationPresent(java.lang.String p0)`
- `public default N setAnnotation(int p0, com.github.javaparser.ast.expr.AnnotationExpr p1)`
- `public abstract N setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithArguments`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addArgument(com.github.javaparser.ast.expr.Expression p0)`
- `public default N addArgument(java.lang.String p0)`
- `public default com.github.javaparser.ast.expr.Expression getArgument(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getArguments()`
- `public default N setArgument(int p0, com.github.javaparser.ast.expr.Expression p1)`
- `public abstract N setArguments(com.github.javaparser.ast.NodeList p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default com.github.javaparser.ast.stmt.BlockStmt createBody()`
- `public abstract com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public abstract N setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithBody`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default com.github.javaparser.ast.stmt.BlockStmt createBlockStatementAsBody()`
- `public abstract com.github.javaparser.ast.stmt.Statement getBody()`
- `public default boolean hasEmptyBody()`
- `public abstract N setBody(com.github.javaparser.ast.stmt.Statement p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithCondition`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract com.github.javaparser.ast.expr.Expression getCondition()`
- `public abstract N setCondition(com.github.javaparser.ast.expr.Expression p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithDeclaration`

**Methods:**
- `public default java.lang.String getDeclarationAsString()`
- `public default java.lang.String getDeclarationAsString(boolean p0, boolean p1)`
- `public abstract java.lang.String getDeclarationAsString(boolean p0, boolean p1, boolean p2)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithExpression`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract com.github.javaparser.ast.expr.Expression getExpression()`
- `public abstract N setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public default N setExpression(java.lang.String p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithExtends`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addExtendedType(com.github.javaparser.ast.type.ClassOrInterfaceType p0)`
- `public default N addExtendedType(java.lang.Class p0)`
- `public default N addExtendedType(java.lang.String p0)`
- `public default N addExtends(java.lang.Class p0)`
- `public default N addExtends(java.lang.String p0)`
- `public abstract com.github.javaparser.ast.NodeList getExtendedTypes()`
- `public default com.github.javaparser.ast.type.ClassOrInterfaceType getExtendedTypes(int p0)`
- `public default N setExtendedType(int p0, com.github.javaparser.ast.type.ClassOrInterfaceType p1)`
- `public abstract N setExtendedTypes(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithIdentifier`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default java.lang.String getId()`
- `public abstract java.lang.String getIdentifier()`
- `public default N setId(java.lang.String p0)`
- `public abstract N setIdentifier(java.lang.String p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithImplements`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addImplementedType(com.github.javaparser.ast.type.ClassOrInterfaceType p0)`
- `public default N addImplementedType(java.lang.Class p0)`
- `public default N addImplementedType(java.lang.String p0)`
- `public default N addImplements(java.lang.Class p0)`
- `public default N addImplements(java.lang.String p0)`
- `public abstract com.github.javaparser.ast.NodeList getImplementedTypes()`
- `public default com.github.javaparser.ast.type.ClassOrInterfaceType getImplementedTypes(int p0)`
- `public default N setImplementedType(int p0, com.github.javaparser.ast.type.ClassOrInterfaceType p1)`
- `public abstract N setImplementedTypes(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithJavadoc`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract java.util.Optional getComment()`
- `public default java.util.Optional getJavadoc()`
- `public default java.util.Optional getJavadocComment()`
- `public default boolean hasJavaDocComment()`
- `public default boolean removeJavaDocComment()`
- `public abstract com.github.javaparser.ast.Node setComment(com.github.javaparser.ast.comments.Comment p0)`
- `public default N setJavadocComment(com.github.javaparser.ast.comments.JavadocComment p0)`
- `public default N setJavadocComment(com.github.javaparser.javadoc.Javadoc p0)`
- `public default N setJavadocComment(java.lang.String p0)`
- `public default N setJavadocComment(java.lang.String p0, com.github.javaparser.javadoc.Javadoc p1)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithMembers`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<N>`  

**Methods:**
- `public default com.github.javaparser.ast.body.ConstructorDeclaration addConstructor(com.github.javaparser.ast.Modifier$Keyword... p0)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addField(com.github.javaparser.ast.type.Type p0, java.lang.String p1, com.github.javaparser.ast.Modifier$Keyword... p2)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addField(java.lang.Class p0, java.lang.String p1, com.github.javaparser.ast.Modifier$Keyword... p2)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addField(java.lang.String p0, java.lang.String p1, com.github.javaparser.ast.Modifier$Keyword... p2)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addFieldWithInitializer(com.github.javaparser.ast.type.Type p0, java.lang.String p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.Modifier$Keyword... p3)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addFieldWithInitializer(java.lang.Class p0, java.lang.String p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.Modifier$Keyword... p3)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addFieldWithInitializer(java.lang.String p0, java.lang.String p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.Modifier$Keyword... p3)`
- `public default com.github.javaparser.ast.stmt.BlockStmt addInitializer()`
- `public default N addMember(com.github.javaparser.ast.body.BodyDeclaration p0)`
- `public default com.github.javaparser.ast.body.MethodDeclaration addMethod(java.lang.String p0, com.github.javaparser.ast.Modifier$Keyword... p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPrivateField(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPrivateField(java.lang.Class p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPrivateField(java.lang.String p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addProtectedField(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addProtectedField(java.lang.Class p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addProtectedField(java.lang.String p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPublicField(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPublicField(java.lang.Class p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.FieldDeclaration addPublicField(java.lang.String p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.stmt.BlockStmt addStaticInitializer()`
- `public default java.util.Optional getConstructorByParameterTypes(java.lang.Class... p0)`
- `public default java.util.Optional getConstructorByParameterTypes(java.lang.String... p0)`
- `public default java.util.List getConstructors()`
- `public default java.util.Optional getDefaultConstructor()`
- `public default java.util.Optional getFieldByName(java.lang.String p0)`
- `public default java.util.List getFields()`
- `public default com.github.javaparser.ast.body.BodyDeclaration getMember(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getMembers()`
- `public default java.util.List getMethods()`
- `public default java.util.List getMethodsByName(java.lang.String p0)`
- `public default java.util.List getMethodsByParameterTypes(java.lang.Class... p0)`
- `public default java.util.List getMethodsByParameterTypes(java.lang.String... p0)`
- `public default java.util.List getMethodsBySignature(java.lang.String p0, java.lang.String... p1)`
- `public default boolean isEmpty()`
- `public default N setMember(int p0, com.github.javaparser.ast.body.BodyDeclaration p1)`
- `public abstract N setMembers(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithModifiers`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addModifier(com.github.javaparser.ast.Modifier$Keyword... p0)`
- `public default com.github.javaparser.ast.AccessSpecifier getAccessSpecifier()`
- `public abstract com.github.javaparser.ast.NodeList getModifiers()`
- `public default boolean hasModifier(com.github.javaparser.ast.Modifier$Keyword p0)`
- `public default N removeModifier(com.github.javaparser.ast.Modifier$Keyword... p0)`
- `public default N setModifier(com.github.javaparser.ast.Modifier$Keyword p0, boolean p1)`
- `public default N setModifiers(com.github.javaparser.ast.Modifier$Keyword... p0)`
- `public abstract N setModifiers(com.github.javaparser.ast.NodeList p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithName`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract com.github.javaparser.ast.expr.Name getName()`
- `public default java.lang.String getNameAsString()`
- `public abstract N setName(com.github.javaparser.ast.expr.Name p0)`
- `public default N setName(java.lang.String p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithOptionalBlockStmt`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default com.github.javaparser.ast.stmt.BlockStmt createBody()`
- `public abstract java.util.Optional getBody()`
- `public abstract N removeBody()`
- `public abstract N setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithOptionalLabel`<T extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract java.util.Optional getLabel()`
- `public default java.util.Optional getLabelAsString()`
- `public abstract T removeLabel()`
- `public abstract T setLabel(com.github.javaparser.ast.expr.SimpleName p0)`
- `public default T setLabel(java.lang.String p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithOptionalScope`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithTraversableScope`  

**Methods:**
- `public abstract java.util.Optional getScope()`
- `public abstract N removeScope()`
- `public abstract N setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public default java.util.Optional traverseScope()`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithParameters`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default com.github.javaparser.ast.body.Parameter addAndGetParameter(com.github.javaparser.ast.body.Parameter p0)`
- `public default com.github.javaparser.ast.body.Parameter addAndGetParameter(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.Parameter addAndGetParameter(java.lang.Class p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.Parameter addAndGetParameter(java.lang.String p0, java.lang.String p1)`
- `public default N addParameter(com.github.javaparser.ast.body.Parameter p0)`
- `public default N addParameter(com.github.javaparser.ast.type.Type p0, java.lang.String p1)`
- `public default N addParameter(java.lang.Class p0, java.lang.String p1)`
- `public default N addParameter(java.lang.String p0, java.lang.String p1)`
- `public default com.github.javaparser.ast.body.Parameter getParameter(int p0)`
- `public default java.util.Optional getParameterByName(java.lang.String p0)`
- `public default java.util.Optional getParameterByType(java.lang.Class p0)`
- `public default java.util.Optional getParameterByType(java.lang.String p0)`
- `public abstract com.github.javaparser.ast.NodeList getParameters()`
- `public default boolean hasParametersOfType(java.lang.Class... p0)`
- `public default boolean hasParametersOfType(java.lang.String... p0)`
- `public default N setParameter(int p0, com.github.javaparser.ast.body.Parameter p1)`
- `public abstract N setParameters(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithRange`<N extends java.lang.Object>

**Methods:**
- `public default boolean containsWithin(com.github.javaparser.ast.Node p0)`
- `public default boolean containsWithinRange(com.github.javaparser.ast.Node p0)`
- `public default java.util.Optional getBegin()`
- `public default java.util.Optional getEnd()`
- `public abstract java.util.Optional getRange()`
- `public default boolean hasRange()`
- `public abstract N setRange(com.github.javaparser.Range p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithScope`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithTraversableScope`  

**Methods:**
- `public abstract com.github.javaparser.ast.expr.Expression getScope()`
- `public abstract N setScope(com.github.javaparser.ast.expr.Expression p0)`
- `public default java.util.Optional traverseScope()`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract com.github.javaparser.ast.expr.SimpleName getName()`
- `public default com.github.javaparser.ast.expr.NameExpr getNameAsExpression()`
- `public default java.lang.String getNameAsString()`
- `public abstract N setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public default N setName(java.lang.String p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithStatements`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default <A extends com.github.javaparser.ast.stmt.Statement> A addAndGetStatement(A p0)`
- `public default com.github.javaparser.ast.stmt.ExpressionStmt addAndGetStatement(com.github.javaparser.ast.expr.Expression p0)`
- `public default com.github.javaparser.ast.stmt.Statement addAndGetStatement(int p0, com.github.javaparser.ast.stmt.Statement p1)`
- `public default com.github.javaparser.ast.stmt.ExpressionStmt addAndGetStatement(java.lang.String p0)`
- `public default N addStatement(com.github.javaparser.ast.expr.Expression p0)`
- `public default N addStatement(com.github.javaparser.ast.stmt.Statement p0)`
- `public default N addStatement(int p0, com.github.javaparser.ast.expr.Expression p1)`
- `public default N addStatement(int p0, com.github.javaparser.ast.stmt.Statement p1)`
- `public default N addStatement(java.lang.String p0)`
- `public default N copyStatements(com.github.javaparser.ast.NodeList p0)`
- `public default N copyStatements(com.github.javaparser.ast.nodeTypes.NodeWithStatements p0)`
- `public default com.github.javaparser.ast.stmt.Statement getStatement(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getStatements()`
- `public default boolean isEmpty()`
- `public default N setStatement(int p0, com.github.javaparser.ast.stmt.Statement p1)`
- `public abstract N setStatements(com.github.javaparser.ast.NodeList p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addThrownException(com.github.javaparser.ast.type.ReferenceType p0)`
- `public default N addThrownException(java.lang.Class p0)`
- `public default com.github.javaparser.ast.type.ReferenceType getThrownException(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getThrownExceptions()`
- `public default boolean isThrown(java.lang.Class p0)`
- `public default boolean isThrown(java.lang.String p0)`
- `public abstract N setThrownExceptions(com.github.javaparser.ast.NodeList p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithTokenRange`<N extends java.lang.Object>

**Methods:**
- `public abstract java.util.Optional getTokenRange()`
- `public abstract N setTokenRange(com.github.javaparser.TokenRange p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithTraversableScope`

**Methods:**
- `public abstract java.util.Optional traverseScope()`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithType`<N extends com.github.javaparser.ast.Node, T extends com.github.javaparser.ast.type.Type>

**Methods:**
- `public abstract T getType()`
- `public default java.lang.String getTypeAsString()`
- `public abstract N setType(T p0)`
- `public default N setType(java.lang.Class p0)`
- `public default N setType(java.lang.String p0)`
- `public abstract void tryAddImportToParentCompilationUnit(java.lang.Class p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public abstract java.util.Optional getTypeArguments()`
- `public default boolean isUsingDiamondOperator()`
- `public default N removeTypeArguments()`
- `public default N setDiamondOperator()`
- `public abstract N setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public default N setTypeArguments(com.github.javaparser.ast.type.Type... p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addTypeParameter(com.github.javaparser.ast.type.TypeParameter p0)`
- `public default N addTypeParameter(java.lang.String p0)`
- `public default com.github.javaparser.ast.type.TypeParameter getTypeParameter(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getTypeParameters()`
- `public default boolean isGeneric()`
- `public default N setTypeParameter(int p0, com.github.javaparser.ast.type.TypeParameter p1)`
- `public abstract N setTypeParameters(com.github.javaparser.ast.NodeList p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.NodeWithVariables`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default N addVariable(com.github.javaparser.ast.body.VariableDeclarator p0)`
- `public static java.util.Optional calculateMaximumCommonType(java.util.List p0)`
- `public default com.github.javaparser.ast.type.Type getCommonType()`
- `public default com.github.javaparser.ast.type.Type getElementType()`
- `public default java.util.Optional getMaximumCommonType()`
- `public default com.github.javaparser.ast.body.VariableDeclarator getVariable(int p0)`
- `public abstract com.github.javaparser.ast.NodeList getVariables()`
- `public default N setAllTypes(com.github.javaparser.ast.type.Type p0)`
- `public default N setVariable(int p0, com.github.javaparser.ast.body.VariableDeclarator p1)`
- `public abstract N setVariables(com.github.javaparser.ast.NodeList p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.SwitchNode`

**Methods:**
- `public abstract com.github.javaparser.ast.nodeTypes.SwitchNode clone()`
- `public abstract java.util.Optional getComment()`
- `public abstract com.github.javaparser.ast.NodeList getEntries()`
- `public abstract com.github.javaparser.ast.stmt.SwitchEntry getEntry(int p0)`
- `public abstract com.github.javaparser.ast.expr.Expression getSelector()`
- `public default boolean isEmpty()`
- `public abstract boolean remove(com.github.javaparser.ast.Node p0)`
- `public abstract boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public abstract com.github.javaparser.ast.nodeTypes.SwitchNode setEntries(com.github.javaparser.ast.NodeList p0)`
- `public abstract com.github.javaparser.ast.nodeTypes.SwitchNode setSelector(com.github.javaparser.ast.expr.Expression p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isAbstract()`
- `public default N setAbstract(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPrivateModifier<N>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithProtectedModifier<N>`, `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier<N>`  

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isFinal()`
- `public default N setFinal(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPrivateModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isPrivate()`
- `public default N setPrivate(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithProtectedModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isProtected()`
- `public default N setProtected(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isPublic()`
- `public default N setPublic(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isStatic()`
- `public default N setStatic(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.nodeTypes.NodeWithModifiers<N>`  

**Methods:**
- `public default boolean isStrictfp()`
- `public default N setStrictfp(boolean p0)`

---

## public abstract interface `com.github.javaparser.ast.observer.AstObserver`

**Methods:**
- `public abstract void listChange(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.observer.AstObserver$ListChangeType p1, int p2, com.github.javaparser.ast.Node p3)`
- `public abstract void listReplacement(com.github.javaparser.ast.NodeList p0, int p1, com.github.javaparser.ast.Node p2, com.github.javaparser.ast.Node p3)`
- `public abstract void parentChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1, com.github.javaparser.ast.Node p2)`
- `public abstract void propertyChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.observer.ObservableProperty p1, java.lang.Object p2, java.lang.Object p3)`

---

## public final static enum `com.github.javaparser.ast.observer.AstObserver$ListChangeType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.observer.AstObserver$ListChangeType ADDITION`
- `public final static com.github.javaparser.ast.observer.AstObserver$ListChangeType REMOVAL`

---

## public abstract class `com.github.javaparser.ast.observer.AstObserverAdapter`
implements `com.github.javaparser.ast.observer.AstObserver`  

**Constructors:**
- `public AstObserverAdapter()`

**Methods:**
- `public void listChange(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.observer.AstObserver$ListChangeType p1, int p2, com.github.javaparser.ast.Node p3)`
- `public void listReplacement(com.github.javaparser.ast.NodeList p0, int p1, com.github.javaparser.ast.Node p2, com.github.javaparser.ast.Node p3)`
- `public void parentChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1, com.github.javaparser.ast.Node p2)`
- `public void propertyChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.observer.ObservableProperty p1, java.lang.Object p2, java.lang.Object p3)`

---

## public abstract interface `com.github.javaparser.ast.observer.Observable`

**Methods:**
- `public abstract boolean isRegistered(com.github.javaparser.ast.observer.AstObserver p0)`
- `public abstract void register(com.github.javaparser.ast.observer.AstObserver p0)`
- `public abstract void unregister(com.github.javaparser.ast.observer.AstObserver p0)`

---

## public final enum `com.github.javaparser.ast.observer.ObservableProperty`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.observer.ObservableProperty ANNOTATIONS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ANONYMOUS_CLASS_BODY`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ARGUMENTS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ASTERISK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty BODY`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CASCADING_IF_STMT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CATCH_CLAUSES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CHECK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CLASS_BODY`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CLASS_DECLARATION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty COMMENT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty COMMENTED_NODE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty COMPARE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty COMPONENT_TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CONDITION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty CONTENT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty DEFAULT_VALUE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty DIMENSION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty DIRECTIVES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELEMENTS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELEMENT_TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELSE_BLOCK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELSE_BRANCH`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELSE_EXPR`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ELSE_STMT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ENCLOSING_PARAMETERS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ENTRIES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty EXPRESSION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty EXPRESSION_BODY`
- `public final static com.github.javaparser.ast.observer.ObservableProperty EXTENDED_TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty EXTENDED_TYPES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty FINALLY_BLOCK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty IDENTIFIER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty IMPLEMENTED_TYPES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty IMPORTS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty INDEX`
- `public final static com.github.javaparser.ast.observer.ObservableProperty INITIALIZATION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty INITIALIZER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty INNER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty INTERFACE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ITERABLE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty KEYWORD`
- `public final static com.github.javaparser.ast.observer.ObservableProperty LABEL`
- `public final static com.github.javaparser.ast.observer.ObservableProperty LABELS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty LEFT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty LEVELS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MAXIMUM_COMMON_TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MEMBERS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MEMBER_VALUE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MESSAGE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MODIFIERS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MODULE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty MODULE_NAMES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty NAME`
- `public final static com.github.javaparser.ast.observer.ObservableProperty OPEN`
- `public final static com.github.javaparser.ast.observer.ObservableProperty OPERATOR`
- `public final static com.github.javaparser.ast.observer.ObservableProperty ORIGIN`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PACKAGE_DECLARATION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PAIRS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PARAMETER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PARAMETERS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PATTERN`
- `public final static com.github.javaparser.ast.observer.ObservableProperty POSTFIX`
- `public final static com.github.javaparser.ast.observer.ObservableProperty PREFIX`
- `public final static com.github.javaparser.ast.observer.ObservableProperty QUALIFIER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty RANGE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty RECEIVER_PARAMETER`
- `public final static com.github.javaparser.ast.observer.ObservableProperty RECORD_DECLARATION`
- `public final static com.github.javaparser.ast.observer.ObservableProperty RESOURCES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty RIGHT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty SCOPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty SELECTOR`
- `public final static com.github.javaparser.ast.observer.ObservableProperty STATEMENT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty STATEMENTS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty STATIC`
- `public final static com.github.javaparser.ast.observer.ObservableProperty SUPER_TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TARGET`
- `public final static com.github.javaparser.ast.observer.ObservableProperty THEN_BLOCK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty THEN_EXPR`
- `public final static com.github.javaparser.ast.observer.ObservableProperty THEN_STMT`
- `public final static com.github.javaparser.ast.observer.ObservableProperty THIS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty THROWN_EXCEPTIONS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TRY_BLOCK`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPE_ARGUMENTS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPE_BOUND`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPE_NAME`
- `public final static com.github.javaparser.ast.observer.ObservableProperty TYPE_PARAMETERS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty UPDATE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty USING_DIAMOND_OPERATOR`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VALUE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VALUES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VARIABLE`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VARIABLES`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VAR_ARGS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty VAR_ARGS_ANNOTATIONS`
- `public final static com.github.javaparser.ast.observer.ObservableProperty WITH`

**Methods:**
- `public java.lang.String camelCaseName()`
- `public static com.github.javaparser.ast.observer.ObservableProperty fromCamelCaseName(java.lang.String p0)`
- `public java.lang.Object getRawValue(com.github.javaparser.ast.Node p0)`
- `public java.lang.Boolean getValueAsBooleanAttribute(com.github.javaparser.ast.Node p0)`
- `public java.util.Collection getValueAsCollection(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.NodeList getValueAsMultipleReference(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.Node getValueAsSingleReference(com.github.javaparser.ast.Node p0)`
- `public java.lang.String getValueAsStringAttribute(com.github.javaparser.ast.Node p0)`
- `public boolean isAboutNodes()`
- `public boolean isAboutValues()`
- `public boolean isDerived()`
- `public boolean isMultiple()`
- `public boolean isNull(com.github.javaparser.ast.Node p0)`
- `public boolean isNullOrEmpty(com.github.javaparser.ast.Node p0)`
- `public boolean isNullOrNotPresent(com.github.javaparser.ast.Node p0)`
- `public boolean isSingle()`

---

## public abstract class `com.github.javaparser.ast.observer.PropagatingAstObserver`
implements `com.github.javaparser.ast.observer.AstObserver`  

**Constructors:**
- `public PropagatingAstObserver()`

**Methods:**
- `public void concreteListChange(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.observer.AstObserver$ListChangeType p1, int p2, com.github.javaparser.ast.Node p3)`
- `public void concreteListReplacement(com.github.javaparser.ast.NodeList p0, int p1, com.github.javaparser.ast.Node p2, com.github.javaparser.ast.Node p3)`
- `public void concretePropertyChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.observer.ObservableProperty p1, java.lang.Object p2, java.lang.Object p3)`
- `public final void listChange(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.observer.AstObserver$ListChangeType p1, int p2, com.github.javaparser.ast.Node p3)`
- `public void listReplacement(com.github.javaparser.ast.NodeList p0, int p1, com.github.javaparser.ast.Node p2, com.github.javaparser.ast.Node p3)`
- `public void parentChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1, com.github.javaparser.ast.Node p2)`
- `public final void propertyChange(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.observer.ObservableProperty p1, java.lang.Object p2, java.lang.Object p3)`
- `public static com.github.javaparser.ast.observer.PropagatingAstObserver transformInPropagatingObserver(com.github.javaparser.ast.observer.AstObserver p0)`

---

## public class `com.github.javaparser.ast.stmt.AssertStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public AssertStmt()`
- `public AssertStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.expr.Expression p2)`
- `public AssertStmt(com.github.javaparser.ast.expr.Expression p0)`
- `public AssertStmt(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.AssertStmt asAssertStmt()`
- `public com.github.javaparser.ast.stmt.AssertStmt clone()`
- `public com.github.javaparser.ast.expr.Expression getCheck()`
- `public java.util.Optional getMessage()`
- `public com.github.javaparser.metamodel.AssertStmtMetaModel getMetaModel()`
- `public void ifAssertStmt(java.util.function.Consumer p0)`
- `public boolean isAssertStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.AssertStmt removeMessage()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.AssertStmt setCheck(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.stmt.AssertStmt setMessage(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toAssertStmt()`

---

## public class `com.github.javaparser.ast.stmt.BlockStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithStatements<com.github.javaparser.ast.stmt.BlockStmt>`  

**Constructors:**
- `public BlockStmt()`
- `public BlockStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public BlockStmt(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.BlockStmt asBlockStmt()`
- `public com.github.javaparser.ast.stmt.BlockStmt clone()`
- `public com.github.javaparser.metamodel.BlockStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getStatements()`
- `public void ifBlockStmt(java.util.function.Consumer p0)`
- `public boolean isBlockStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.BlockStmt setStatements(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toBlockStmt()`

---

## public class `com.github.javaparser.ast.stmt.BreakStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public BreakStmt()`
- `public BreakStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public BreakStmt(com.github.javaparser.ast.expr.SimpleName p0)`
- `public BreakStmt(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.BreakStmt asBreakStmt()`
- `public com.github.javaparser.ast.stmt.BreakStmt clone()`
- `public java.util.Optional getLabel()`
- `public com.github.javaparser.metamodel.BreakStmtMetaModel getMetaModel()`
- `public void ifBreakStmt(java.util.function.Consumer p0)`
- `public boolean isBreakStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.BreakStmt removeLabel()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.BreakStmt setLabel(com.github.javaparser.ast.expr.SimpleName p0)`
- `public java.util.Optional toBreakStmt()`

---

## public class `com.github.javaparser.ast.stmt.CatchClause`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt<com.github.javaparser.ast.stmt.CatchClause>`  

**Constructors:**
- `public CatchClause()`
- `public CatchClause(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.body.Parameter p1, com.github.javaparser.ast.stmt.BlockStmt p2)`
- `public CatchClause(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.type.ClassOrInterfaceType p2, com.github.javaparser.ast.expr.SimpleName p3, com.github.javaparser.ast.stmt.BlockStmt p4)`
- `public CatchClause(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.stmt.BlockStmt p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.CatchClause clone()`
- `public com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public com.github.javaparser.metamodel.CatchClauseMetaModel getMetaModel()`
- `public com.github.javaparser.ast.body.Parameter getParameter()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.CatchClause setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.stmt.CatchClause setParameter(com.github.javaparser.ast.body.Parameter p0)`

---

## public class `com.github.javaparser.ast.stmt.ContinueStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithOptionalLabel<com.github.javaparser.ast.stmt.ContinueStmt>`  

**Constructors:**
- `public ContinueStmt()`
- `public ContinueStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1)`
- `public ContinueStmt(com.github.javaparser.ast.expr.SimpleName p0)`
- `public ContinueStmt(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ContinueStmt asContinueStmt()`
- `public com.github.javaparser.ast.stmt.ContinueStmt clone()`
- `public java.util.Optional getLabel()`
- `public com.github.javaparser.metamodel.ContinueStmtMetaModel getMetaModel()`
- `public void ifContinueStmt(java.util.function.Consumer p0)`
- `public boolean isContinueStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.ContinueStmt removeLabel()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ContinueStmt setLabel(com.github.javaparser.ast.expr.SimpleName p0)`
- `public java.util.Optional toContinueStmt()`

---

## public class `com.github.javaparser.ast.stmt.DoStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBody<com.github.javaparser.ast.stmt.DoStmt>`, `com.github.javaparser.ast.nodeTypes.NodeWithCondition<com.github.javaparser.ast.stmt.DoStmt>`  

**Constructors:**
- `public DoStmt()`
- `public DoStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.stmt.Statement p1, com.github.javaparser.ast.expr.Expression p2)`
- `public DoStmt(com.github.javaparser.ast.stmt.Statement p0, com.github.javaparser.ast.expr.Expression p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.DoStmt asDoStmt()`
- `public com.github.javaparser.ast.stmt.DoStmt clone()`
- `public com.github.javaparser.ast.stmt.Statement getBody()`
- `public com.github.javaparser.ast.expr.Expression getCondition()`
- `public com.github.javaparser.metamodel.DoStmtMetaModel getMetaModel()`
- `public void ifDoStmt(java.util.function.Consumer p0)`
- `public boolean isDoStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.DoStmt setBody(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.stmt.DoStmt setCondition(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toDoStmt()`

---

## public class `com.github.javaparser.ast.stmt.EmptyStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public EmptyStmt()`
- `public EmptyStmt(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.EmptyStmt asEmptyStmt()`
- `public com.github.javaparser.ast.stmt.EmptyStmt clone()`
- `public com.github.javaparser.metamodel.EmptyStmtMetaModel getMetaModel()`
- `public void ifEmptyStmt(java.util.function.Consumer p0)`
- `public boolean isEmptyStmt()`
- `public java.util.Optional toEmptyStmt()`

---

## public class `com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithArguments<com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt>`, `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration>`  

**Constructors:**
- `public ExplicitConstructorInvocationStmt()`
- `public ExplicitConstructorInvocationStmt(boolean p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2)`
- `public ExplicitConstructorInvocationStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, boolean p2, com.github.javaparser.ast.expr.Expression p3, com.github.javaparser.ast.NodeList p4)`
- `public ExplicitConstructorInvocationStmt(com.github.javaparser.ast.NodeList p0, boolean p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.NodeList p3)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt asExplicitConstructorInvocationStmt()`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt clone()`
- `public com.github.javaparser.ast.NodeList getArguments()`
- `public java.util.Optional getExpression()`
- `public com.github.javaparser.metamodel.ExplicitConstructorInvocationStmtMetaModel getMetaModel()`
- `public java.util.Optional getTypeArguments()`
- `public void ifExplicitConstructorInvocationStmt(java.util.function.Consumer p0)`
- `public boolean isExplicitConstructorInvocationStmt()`
- `public boolean isThis()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt removeExpression()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration resolve()`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt setArguments(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt setThis(boolean p0)`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toExplicitConstructorInvocationStmt()`

---

## public class `com.github.javaparser.ast.stmt.ExpressionStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.stmt.ExpressionStmt>`  

**Constructors:**
- `public ExpressionStmt()`
- `public ExpressionStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1)`
- `public ExpressionStmt(com.github.javaparser.ast.expr.Expression p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ExpressionStmt asExpressionStmt()`
- `public com.github.javaparser.ast.stmt.ExpressionStmt clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.ExpressionStmtMetaModel getMetaModel()`
- `public void ifExpressionStmt(java.util.function.Consumer p0)`
- `public boolean isExpressionStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ExpressionStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toExpressionStmt()`

---

## public class `com.github.javaparser.ast.stmt.ForEachStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBody<com.github.javaparser.ast.stmt.ForEachStmt>`  

**Constructors:**
- `public ForEachStmt()`
- `public ForEachStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.VariableDeclarationExpr p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.stmt.Statement p3)`
- `public ForEachStmt(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.stmt.Statement p2)`
- `public ForEachStmt(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.String p1, com.github.javaparser.ast.stmt.BlockStmt p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ForEachStmt asForEachStmt()`
- `public com.github.javaparser.ast.stmt.ForEachStmt clone()`
- `public com.github.javaparser.ast.stmt.Statement getBody()`
- `public com.github.javaparser.ast.expr.Expression getIterable()`
- `public com.github.javaparser.metamodel.ForEachStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.VariableDeclarationExpr getVariable()`
- `public com.github.javaparser.ast.body.VariableDeclarator getVariableDeclarator()`
- `public boolean hasFinalVariable()`
- `public void ifForEachStmt(java.util.function.Consumer p0)`
- `public boolean isForEachStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ForEachStmt setBody(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.stmt.ForEachStmt setIterable(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.stmt.ForEachStmt setVariable(com.github.javaparser.ast.expr.VariableDeclarationExpr p0)`
- `public java.util.Optional toForEachStmt()`

---

## public class `com.github.javaparser.ast.stmt.ForStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBody<com.github.javaparser.ast.stmt.ForStmt>`  

**Constructors:**
- `public ForStmt()`
- `public ForStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.expr.Expression p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.stmt.Statement p4)`
- `public ForStmt(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.stmt.Statement p3)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ForStmt asForStmt()`
- `public com.github.javaparser.ast.stmt.ForStmt clone()`
- `public com.github.javaparser.ast.stmt.Statement getBody()`
- `public java.util.Optional getCompare()`
- `public com.github.javaparser.ast.NodeList getInitialization()`
- `public com.github.javaparser.metamodel.ForStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getUpdate()`
- `public void ifForStmt(java.util.function.Consumer p0)`
- `public boolean isForStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.ForStmt removeCompare()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ForStmt setBody(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.stmt.ForStmt setCompare(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.stmt.ForStmt setInitialization(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.ForStmt setUpdate(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toForStmt()`

---

## public class `com.github.javaparser.ast.stmt.IfStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithCondition<com.github.javaparser.ast.stmt.IfStmt>`  

**Constructors:**
- `public IfStmt()`
- `public IfStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.stmt.Statement p2, com.github.javaparser.ast.stmt.Statement p3)`
- `public IfStmt(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.stmt.Statement p1, com.github.javaparser.ast.stmt.Statement p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.IfStmt asIfStmt()`
- `public com.github.javaparser.ast.stmt.IfStmt clone()`
- `public com.github.javaparser.ast.expr.Expression getCondition()`
- `public java.util.Optional getElseStmt()`
- `public com.github.javaparser.metamodel.IfStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.stmt.Statement getThenStmt()`
- `public boolean hasCascadingIfStmt()`
- `public boolean hasElseBlock()`
- `public boolean hasElseBranch()`
- `public boolean hasThenBlock()`
- `public void ifIfStmt(java.util.function.Consumer p0)`
- `public boolean isIfStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.IfStmt removeElseStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.IfStmt setCondition(com.github.javaparser.ast.expr.Expression p0)`
- `public com.github.javaparser.ast.stmt.IfStmt setElseStmt(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.stmt.IfStmt setThenStmt(com.github.javaparser.ast.stmt.Statement p0)`
- `public java.util.Optional toIfStmt()`

---

## public class `com.github.javaparser.ast.stmt.LabeledStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public LabeledStmt()`
- `public LabeledStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.stmt.Statement p2)`
- `public LabeledStmt(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.stmt.Statement p1)`
- `public LabeledStmt(java.lang.String p0, com.github.javaparser.ast.stmt.Statement p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.LabeledStmt asLabeledStmt()`
- `public com.github.javaparser.ast.stmt.LabeledStmt clone()`
- `public com.github.javaparser.ast.expr.SimpleName getLabel()`
- `public com.github.javaparser.metamodel.LabeledStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.stmt.Statement getStatement()`
- `public void ifLabeledStmt(java.util.function.Consumer p0)`
- `public boolean isLabeledStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.LabeledStmt setLabel(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.stmt.LabeledStmt setStatement(com.github.javaparser.ast.stmt.Statement p0)`
- `public java.util.Optional toLabeledStmt()`

---

## public class `com.github.javaparser.ast.stmt.LocalClassDeclarationStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public LocalClassDeclarationStmt()`
- `public LocalClassDeclarationStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p1)`
- `public LocalClassDeclarationStmt(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.LocalClassDeclarationStmt asLocalClassDeclarationStmt()`
- `public com.github.javaparser.ast.stmt.LocalClassDeclarationStmt clone()`
- `public com.github.javaparser.ast.body.ClassOrInterfaceDeclaration getClassDeclaration()`
- `public com.github.javaparser.metamodel.LocalClassDeclarationStmtMetaModel getMetaModel()`
- `public void ifLocalClassDeclarationStmt(java.util.function.Consumer p0)`
- `public boolean isLocalClassDeclarationStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.LocalClassDeclarationStmt setClassDeclaration(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0)`
- `public java.util.Optional toLocalClassDeclarationStmt()`

---

## public class `com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public LocalRecordDeclarationStmt()`
- `public LocalRecordDeclarationStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.body.RecordDeclaration p1)`
- `public LocalRecordDeclarationStmt(com.github.javaparser.ast.body.RecordDeclaration p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt asLocalRecordDeclarationStmt()`
- `public com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt clone()`
- `public com.github.javaparser.metamodel.LocalRecordDeclarationStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.body.RecordDeclaration getRecordDeclaration()`
- `public void ifLocalRecordDeclarationStmt(java.util.function.Consumer p0)`
- `public boolean isLocalRecordDeclarationStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt setRecordDeclaration(com.github.javaparser.ast.body.RecordDeclaration p0)`
- `public java.util.Optional toLocalRecordDeclarationStmt()`

---

## public class `com.github.javaparser.ast.stmt.ReturnStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public ReturnStmt()`
- `public ReturnStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1)`
- `public ReturnStmt(com.github.javaparser.ast.expr.Expression p0)`
- `public ReturnStmt(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ReturnStmt asReturnStmt()`
- `public com.github.javaparser.ast.stmt.ReturnStmt clone()`
- `public java.util.Optional getExpression()`
- `public com.github.javaparser.metamodel.ReturnStmtMetaModel getMetaModel()`
- `public void ifReturnStmt(java.util.function.Consumer p0)`
- `public boolean isReturnStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.ReturnStmt removeExpression()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ReturnStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toReturnStmt()`

---

## public abstract class `com.github.javaparser.ast.stmt.Statement`
extends `com.github.javaparser.ast.Node`  

**Constructors:**
- `public Statement()`
- `public Statement(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public com.github.javaparser.ast.stmt.AssertStmt asAssertStmt()`
- `public com.github.javaparser.ast.stmt.BlockStmt asBlockStmt()`
- `public com.github.javaparser.ast.stmt.BreakStmt asBreakStmt()`
- `public com.github.javaparser.ast.stmt.ContinueStmt asContinueStmt()`
- `public com.github.javaparser.ast.stmt.DoStmt asDoStmt()`
- `public com.github.javaparser.ast.stmt.EmptyStmt asEmptyStmt()`
- `public com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt asExplicitConstructorInvocationStmt()`
- `public com.github.javaparser.ast.stmt.ExpressionStmt asExpressionStmt()`
- `public com.github.javaparser.ast.stmt.ForEachStmt asForEachStmt()`
- `public com.github.javaparser.ast.stmt.ForStmt asForStmt()`
- `public com.github.javaparser.ast.stmt.IfStmt asIfStmt()`
- `public com.github.javaparser.ast.stmt.LabeledStmt asLabeledStmt()`
- `public com.github.javaparser.ast.stmt.LocalClassDeclarationStmt asLocalClassDeclarationStmt()`
- `public com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt asLocalRecordDeclarationStmt()`
- `public com.github.javaparser.ast.stmt.ReturnStmt asReturnStmt()`
- `public com.github.javaparser.ast.stmt.SwitchStmt asSwitchStmt()`
- `public com.github.javaparser.ast.stmt.SynchronizedStmt asSynchronizedStmt()`
- `public com.github.javaparser.ast.stmt.ThrowStmt asThrowStmt()`
- `public com.github.javaparser.ast.stmt.TryStmt asTryStmt()`
- `public com.github.javaparser.ast.stmt.UnparsableStmt asUnparsableStmt()`
- `public com.github.javaparser.ast.stmt.WhileStmt asWhileStmt()`
- `public com.github.javaparser.ast.stmt.YieldStmt asYieldStmt()`
- `public com.github.javaparser.ast.stmt.Statement clone()`
- `public com.github.javaparser.metamodel.StatementMetaModel getMetaModel()`
- `public void ifAssertStmt(java.util.function.Consumer p0)`
- `public void ifBlockStmt(java.util.function.Consumer p0)`
- `public void ifBreakStmt(java.util.function.Consumer p0)`
- `public void ifContinueStmt(java.util.function.Consumer p0)`
- `public void ifDoStmt(java.util.function.Consumer p0)`
- `public void ifEmptyStmt(java.util.function.Consumer p0)`
- `public void ifExplicitConstructorInvocationStmt(java.util.function.Consumer p0)`
- `public void ifExpressionStmt(java.util.function.Consumer p0)`
- `public void ifForEachStmt(java.util.function.Consumer p0)`
- `public void ifForStmt(java.util.function.Consumer p0)`
- `public void ifIfStmt(java.util.function.Consumer p0)`
- `public void ifLabeledStmt(java.util.function.Consumer p0)`
- `public void ifLocalClassDeclarationStmt(java.util.function.Consumer p0)`
- `public void ifLocalRecordDeclarationStmt(java.util.function.Consumer p0)`
- `public void ifReturnStmt(java.util.function.Consumer p0)`
- `public void ifSwitchStmt(java.util.function.Consumer p0)`
- `public void ifSynchronizedStmt(java.util.function.Consumer p0)`
- `public void ifThrowStmt(java.util.function.Consumer p0)`
- `public void ifTryStmt(java.util.function.Consumer p0)`
- `public void ifUnparsableStmt(java.util.function.Consumer p0)`
- `public void ifWhileStmt(java.util.function.Consumer p0)`
- `public void ifYieldStmt(java.util.function.Consumer p0)`
- `public boolean isAssertStmt()`
- `public boolean isBlockStmt()`
- `public boolean isBreakStmt()`
- `public boolean isContinueStmt()`
- `public boolean isDoStmt()`
- `public boolean isEmptyStmt()`
- `public boolean isExplicitConstructorInvocationStmt()`
- `public boolean isExpressionStmt()`
- `public boolean isForEachStmt()`
- `public boolean isForStmt()`
- `public boolean isIfStmt()`
- `public boolean isLabeledStmt()`
- `public boolean isLocalClassDeclarationStmt()`
- `public boolean isLocalRecordDeclarationStmt()`
- `public boolean isReturnStmt()`
- `public boolean isSwitchStmt()`
- `public boolean isSynchronizedStmt()`
- `public boolean isThrowStmt()`
- `public boolean isTryStmt()`
- `public boolean isUnparsableStmt()`
- `public boolean isWhileStmt()`
- `public boolean isYieldStmt()`
- `public java.util.Optional toAssertStmt()`
- `public java.util.Optional toBlockStmt()`
- `public java.util.Optional toBreakStmt()`
- `public java.util.Optional toContinueStmt()`
- `public java.util.Optional toDoStmt()`
- `public java.util.Optional toEmptyStmt()`
- `public java.util.Optional toExplicitConstructorInvocationStmt()`
- `public java.util.Optional toExpressionStmt()`
- `public java.util.Optional toForEachStmt()`
- `public java.util.Optional toForStmt()`
- `public java.util.Optional toIfStmt()`
- `public java.util.Optional toLabeledStmt()`
- `public java.util.Optional toLocalClassDeclarationStmt()`
- `public java.util.Optional toLocalRecordDeclarationStmt()`
- `public java.util.Optional toReturnStmt()`
- `public java.util.Optional toSwitchStmt()`
- `public java.util.Optional toSynchronizedStmt()`
- `public java.util.Optional toThrowStmt()`
- `public java.util.Optional toTryStmt()`
- `public java.util.Optional toUnparsableStmt()`
- `public java.util.Optional toWhileStmt()`
- `public java.util.Optional toYieldStmt()`

---

## public class `com.github.javaparser.ast.stmt.SwitchEntry`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithStatements<com.github.javaparser.ast.stmt.SwitchEntry>`  

**Constructors:**
- `public SwitchEntry()`
- `public SwitchEntry(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.stmt.SwitchEntry$Type p2, com.github.javaparser.ast.NodeList p3)`
- `public SwitchEntry(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.stmt.SwitchEntry$Type p1, com.github.javaparser.ast.NodeList p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.SwitchEntry clone()`
- `public com.github.javaparser.ast.NodeList getLabels()`
- `public com.github.javaparser.metamodel.SwitchEntryMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getStatements()`
- `public com.github.javaparser.ast.stmt.SwitchEntry$Type getType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.SwitchEntry setLabels(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.SwitchEntry setStatements(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.SwitchEntry setType(com.github.javaparser.ast.stmt.SwitchEntry$Type p0)`

---

## public final static enum `com.github.javaparser.ast.stmt.SwitchEntry$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.stmt.SwitchEntry$Type BLOCK`
- `public final static com.github.javaparser.ast.stmt.SwitchEntry$Type EXPRESSION`
- `public final static com.github.javaparser.ast.stmt.SwitchEntry$Type STATEMENT_GROUP`
- `public final static com.github.javaparser.ast.stmt.SwitchEntry$Type THROWS_STATEMENT`

---

## public class `com.github.javaparser.ast.stmt.SwitchStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.SwitchNode`  

**Constructors:**
- `public SwitchStmt()`
- `public SwitchStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.NodeList p2)`
- `public SwitchStmt(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.SwitchStmt asSwitchStmt()`
- `public com.github.javaparser.ast.stmt.SwitchStmt clone()`
- `public com.github.javaparser.ast.NodeList getEntries()`
- `public com.github.javaparser.ast.stmt.SwitchEntry getEntry(int p0)`
- `public com.github.javaparser.metamodel.SwitchStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.Expression getSelector()`
- `public void ifSwitchStmt(java.util.function.Consumer p0)`
- `public boolean isSwitchStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.SwitchStmt setEntries(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.SwitchStmt setSelector(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toSwitchStmt()`

---

## public class `com.github.javaparser.ast.stmt.SynchronizedStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt<com.github.javaparser.ast.stmt.SynchronizedStmt>`, `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.stmt.SynchronizedStmt>`  

**Constructors:**
- `public SynchronizedStmt()`
- `public SynchronizedStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.stmt.BlockStmt p2)`
- `public SynchronizedStmt(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.stmt.BlockStmt p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.SynchronizedStmt asSynchronizedStmt()`
- `public com.github.javaparser.ast.stmt.SynchronizedStmt clone()`
- `public com.github.javaparser.ast.stmt.BlockStmt getBody()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.SynchronizedStmtMetaModel getMetaModel()`
- `public void ifSynchronizedStmt(java.util.function.Consumer p0)`
- `public boolean isSynchronizedStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.SynchronizedStmt setBody(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.stmt.SynchronizedStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toSynchronizedStmt()`

---

## public class `com.github.javaparser.ast.stmt.ThrowStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression<com.github.javaparser.ast.stmt.ThrowStmt>`  

**Constructors:**
- `public ThrowStmt()`
- `public ThrowStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1)`
- `public ThrowStmt(com.github.javaparser.ast.expr.Expression p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.ThrowStmt asThrowStmt()`
- `public com.github.javaparser.ast.stmt.ThrowStmt clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.ThrowStmtMetaModel getMetaModel()`
- `public void ifThrowStmt(java.util.function.Consumer p0)`
- `public boolean isThrowStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.ThrowStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toThrowStmt()`

---

## public class `com.github.javaparser.ast.stmt.TryStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public TryStmt()`
- `public TryStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.stmt.BlockStmt p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.stmt.BlockStmt p4)`
- `public TryStmt(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.stmt.BlockStmt p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.stmt.BlockStmt p3)`
- `public TryStmt(com.github.javaparser.ast.stmt.BlockStmt p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.stmt.BlockStmt p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.TryStmt asTryStmt()`
- `public com.github.javaparser.ast.stmt.TryStmt clone()`
- `public com.github.javaparser.ast.NodeList getCatchClauses()`
- `public java.util.Optional getFinallyBlock()`
- `public com.github.javaparser.metamodel.TryStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.NodeList getResources()`
- `public com.github.javaparser.ast.stmt.BlockStmt getTryBlock()`
- `public void ifTryStmt(java.util.function.Consumer p0)`
- `public boolean isTryStmt()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.stmt.TryStmt removeFinallyBlock()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.TryStmt setCatchClauses(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.TryStmt setFinallyBlock(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public com.github.javaparser.ast.stmt.TryStmt setResources(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.stmt.TryStmt setTryBlock(com.github.javaparser.ast.stmt.BlockStmt p0)`
- `public java.util.Optional toTryStmt()`

---

## public class `com.github.javaparser.ast.stmt.UnparsableStmt`
extends `com.github.javaparser.ast.stmt.Statement`  

**Constructors:**
- `public UnparsableStmt()`
- `public UnparsableStmt(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.UnparsableStmt asUnparsableStmt()`
- `public com.github.javaparser.ast.stmt.UnparsableStmt clone()`
- `public com.github.javaparser.metamodel.UnparsableStmtMetaModel getMetaModel()`
- `public com.github.javaparser.ast.Node$Parsedness getParsed()`
- `public void ifUnparsableStmt(java.util.function.Consumer p0)`
- `public boolean isUnparsableStmt()`
- `public java.util.Optional toUnparsableStmt()`

---

## public class `com.github.javaparser.ast.stmt.WhileStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithBody<com.github.javaparser.ast.stmt.WhileStmt>`, `com.github.javaparser.ast.nodeTypes.NodeWithCondition<com.github.javaparser.ast.stmt.WhileStmt>`  

**Constructors:**
- `public WhileStmt()`
- `public WhileStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1, com.github.javaparser.ast.stmt.Statement p2)`
- `public WhileStmt(com.github.javaparser.ast.expr.Expression p0, com.github.javaparser.ast.stmt.Statement p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.WhileStmt asWhileStmt()`
- `public com.github.javaparser.ast.stmt.WhileStmt clone()`
- `public com.github.javaparser.ast.stmt.Statement getBody()`
- `public com.github.javaparser.ast.expr.Expression getCondition()`
- `public com.github.javaparser.metamodel.WhileStmtMetaModel getMetaModel()`
- `public void ifWhileStmt(java.util.function.Consumer p0)`
- `public boolean isWhileStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.WhileStmt setBody(com.github.javaparser.ast.stmt.Statement p0)`
- `public com.github.javaparser.ast.stmt.WhileStmt setCondition(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toWhileStmt()`

---

## public class `com.github.javaparser.ast.stmt.YieldStmt`
extends `com.github.javaparser.ast.stmt.Statement`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithExpression`  

**Constructors:**
- `public YieldStmt()`
- `public YieldStmt(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.Expression p1)`
- `public YieldStmt(com.github.javaparser.ast.expr.Expression p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.stmt.YieldStmt asYieldStmt()`
- `public com.github.javaparser.ast.stmt.YieldStmt clone()`
- `public com.github.javaparser.ast.expr.Expression getExpression()`
- `public com.github.javaparser.metamodel.YieldStmtMetaModel getMetaModel()`
- `public void ifYieldStmt(java.util.function.Consumer p0)`
- `public boolean isYieldStmt()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.ast.stmt.YieldStmt setExpression(com.github.javaparser.ast.expr.Expression p0)`
- `public java.util.Optional toYieldStmt()`

---

## public class `com.github.javaparser.ast.type.ArrayType`
extends `com.github.javaparser.ast.type.ReferenceType`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.ArrayType>`  

**Constructors:**
- `public ArrayType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.Type p1, com.github.javaparser.ast.type.ArrayType$Origin p2, com.github.javaparser.ast.NodeList p3)`
- `public ArrayType(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.expr.AnnotationExpr... p1)`
- `public ArrayType(com.github.javaparser.ast.type.Type p0, com.github.javaparser.ast.type.ArrayType$Origin p1, com.github.javaparser.ast.NodeList p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.type.ArrayType asArrayType()`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.ArrayType clone()`
- `public int getArrayLevel()`
- `public com.github.javaparser.ast.type.Type getComponentType()`
- `public com.github.javaparser.ast.type.Type getElementType()`
- `public com.github.javaparser.metamodel.ArrayTypeMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.ArrayType$Origin getOrigin()`
- `public void ifArrayType(java.util.function.Consumer p0)`
- `public boolean isArrayType()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedArrayType resolve()`
- `public com.github.javaparser.ast.type.ArrayType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.ArrayType setComponentType(com.github.javaparser.ast.type.Type p0)`
- `public com.github.javaparser.ast.type.ArrayType setOrigin(com.github.javaparser.ast.type.ArrayType$Origin p0)`
- `public java.util.Optional toArrayType()`
- `public java.lang.String toDescriptor()`
- `public static com.github.javaparser.utils.Pair unwrapArrayTypes(com.github.javaparser.ast.type.Type p0)`
- `public static com.github.javaparser.ast.type.Type wrapInArrayTypes(com.github.javaparser.ast.type.Type p0, java.util.List... p1)`

---

## public static class `com.github.javaparser.ast.type.ArrayType$ArrayBracketPair`

**Constructors:**
- `public ArrayBracketPair(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.ArrayType$Origin p1, com.github.javaparser.ast.NodeList p2)`

**Methods:**
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public com.github.javaparser.ast.type.ArrayType$Origin getOrigin()`
- `public java.util.Optional getTokenRange()`
- `public com.github.javaparser.ast.type.ArrayType$ArrayBracketPair setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.ArrayType$ArrayBracketPair setOrigin(com.github.javaparser.ast.type.ArrayType$Origin p0)`
- `public com.github.javaparser.ast.type.ArrayType$ArrayBracketPair setTokenRange(com.github.javaparser.TokenRange p0)`

---

## public final static enum `com.github.javaparser.ast.type.ArrayType$Origin`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.type.ArrayType$Origin NAME`
- `public final static com.github.javaparser.ast.type.ArrayType$Origin TYPE`

---

## public class `com.github.javaparser.ast.type.ClassOrInterfaceType`
extends `com.github.javaparser.ast.type.ReferenceType`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.ClassOrInterfaceType>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.type.ClassOrInterfaceType>`, `com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments<com.github.javaparser.ast.type.ClassOrInterfaceType>`  

**Constructors:**
- `public ClassOrInterfaceType()`
- `public ClassOrInterfaceType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.ClassOrInterfaceType p1, com.github.javaparser.ast.expr.SimpleName p2, com.github.javaparser.ast.NodeList p3, com.github.javaparser.ast.NodeList p4)`
- `public ClassOrInterfaceType(com.github.javaparser.ast.type.ClassOrInterfaceType p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.NodeList p2)`
- `public ClassOrInterfaceType(com.github.javaparser.ast.type.ClassOrInterfaceType p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3)`
- `public ClassOrInterfaceType(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.String p1)`
- `public ClassOrInterfaceType(java.lang.String p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType asClassOrInterfaceType()`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType clone()`
- `public com.github.javaparser.metamodel.ClassOrInterfaceTypeMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public java.lang.String getNameWithScope()`
- `public java.util.Optional getScope()`
- `public java.util.Optional getTypeArguments()`
- `public void ifClassOrInterfaceType(java.util.function.Consumer p0)`
- `public boolean isBoxedType()`
- `public boolean isClassOrInterfaceType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType removeScope()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedType resolve()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType setScope(com.github.javaparser.ast.type.ClassOrInterfaceType p0)`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType setTypeArguments(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toClassOrInterfaceType()`
- `public java.lang.String toDescriptor()`
- `public com.github.javaparser.ast.type.PrimitiveType toUnboxedType() throws java.lang.UnsupportedOperationException`

---

## public class `com.github.javaparser.ast.type.IntersectionType`
extends `com.github.javaparser.ast.type.Type`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.IntersectionType>`  

**Constructors:**
- `public IntersectionType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public IntersectionType(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.type.IntersectionType asIntersectionType()`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.IntersectionType clone()`
- `public com.github.javaparser.ast.NodeList getElements()`
- `public com.github.javaparser.metamodel.IntersectionTypeMetaModel getMetaModel()`
- `public void ifIntersectionType(java.util.function.Consumer p0)`
- `public boolean isIntersectionType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedIntersectionType resolve()`
- `public com.github.javaparser.ast.type.IntersectionType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.IntersectionType setElements(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toIntersectionType()`

---

## public class `com.github.javaparser.ast.type.PrimitiveType`
extends `com.github.javaparser.ast.type.Type`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.PrimitiveType>`  

**Constructors:**
- `public PrimitiveType()`
- `public PrimitiveType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.PrimitiveType$Primitive p1, com.github.javaparser.ast.NodeList p2)`
- `public PrimitiveType(com.github.javaparser.ast.type.PrimitiveType$Primitive p0)`
- `public PrimitiveType(com.github.javaparser.ast.type.PrimitiveType$Primitive p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public com.github.javaparser.ast.type.PrimitiveType asPrimitiveType()`
- `public java.lang.String asString()`
- `public static com.github.javaparser.ast.type.PrimitiveType booleanType()`
- `public static com.github.javaparser.ast.type.PrimitiveType byteType()`
- `public static com.github.javaparser.ast.type.PrimitiveType charType()`
- `public com.github.javaparser.ast.type.PrimitiveType clone()`
- `public static com.github.javaparser.ast.type.PrimitiveType doubleType()`
- `public static com.github.javaparser.ast.type.PrimitiveType floatType()`
- `public com.github.javaparser.metamodel.PrimitiveTypeMetaModel getMetaModel()`
- `public com.github.javaparser.ast.type.PrimitiveType$Primitive getType()`
- `public void ifPrimitiveType(java.util.function.Consumer p0)`
- `public static com.github.javaparser.ast.type.PrimitiveType intType()`
- `public boolean isPrimitiveType()`
- `public static com.github.javaparser.ast.type.PrimitiveType longType()`
- `public com.github.javaparser.resolution.types.ResolvedPrimitiveType resolve()`
- `public com.github.javaparser.ast.type.PrimitiveType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.PrimitiveType setType(com.github.javaparser.ast.type.PrimitiveType$Primitive p0)`
- `public static com.github.javaparser.ast.type.PrimitiveType shortType()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType toBoxedType()`
- `public java.lang.String toDescriptor()`
- `public java.util.Optional toPrimitiveType()`

---

## public final static enum `com.github.javaparser.ast.type.PrimitiveType$Primitive`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive BOOLEAN`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive BYTE`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive CHAR`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive DOUBLE`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive FLOAT`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive INT`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive LONG`
- `public final static com.github.javaparser.ast.type.PrimitiveType$Primitive SHORT`

**Methods:**
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType toBoxedType()`

---

## public abstract class `com.github.javaparser.ast.type.ReferenceType`
extends `com.github.javaparser.ast.type.Type`  

**Constructors:**
- `public ReferenceType()`
- `public ReferenceType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public ReferenceType(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public com.github.javaparser.ast.type.ReferenceType asReferenceType()`
- `public com.github.javaparser.ast.type.ReferenceType clone()`
- `public com.github.javaparser.metamodel.ReferenceTypeMetaModel getMetaModel()`
- `public void ifReferenceType(java.util.function.Consumer p0)`
- `public boolean isReferenceType()`
- `public abstract java.lang.String toDescriptor()`
- `public java.util.Optional toReferenceType()`

---

## public abstract class `com.github.javaparser.ast.type.Type`
extends `com.github.javaparser.ast.Node`  
implements `com.github.javaparser.resolution.Resolvable<com.github.javaparser.resolution.types.ResolvedType>`  

**Constructors:**
- `protected Type(com.github.javaparser.TokenRange p0)`
- `public Type(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public Type(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public com.github.javaparser.ast.type.ArrayType asArrayType()`
- `public com.github.javaparser.ast.type.ClassOrInterfaceType asClassOrInterfaceType()`
- `public com.github.javaparser.ast.type.IntersectionType asIntersectionType()`
- `public com.github.javaparser.ast.type.PrimitiveType asPrimitiveType()`
- `public com.github.javaparser.ast.type.ReferenceType asReferenceType()`
- `public abstract java.lang.String asString()`
- `public com.github.javaparser.ast.type.TypeParameter asTypeParameter()`
- `public com.github.javaparser.ast.type.UnionType asUnionType()`
- `public com.github.javaparser.ast.type.UnknownType asUnknownType()`
- `public com.github.javaparser.ast.type.VarType asVarType()`
- `public com.github.javaparser.ast.type.VoidType asVoidType()`
- `public com.github.javaparser.ast.type.WildcardType asWildcardType()`
- `public com.github.javaparser.ast.type.Type clone()`
- `public com.github.javaparser.ast.expr.AnnotationExpr getAnnotation(int p0)`
- `public com.github.javaparser.ast.NodeList getAnnotations()`
- `public int getArrayLevel()`
- `public com.github.javaparser.ast.type.Type getElementType()`
- `public com.github.javaparser.metamodel.TypeMetaModel getMetaModel()`
- `public void ifArrayType(java.util.function.Consumer p0)`
- `public void ifClassOrInterfaceType(java.util.function.Consumer p0)`
- `public void ifIntersectionType(java.util.function.Consumer p0)`
- `public void ifPrimitiveType(java.util.function.Consumer p0)`
- `public void ifReferenceType(java.util.function.Consumer p0)`
- `public void ifTypeParameter(java.util.function.Consumer p0)`
- `public void ifUnionType(java.util.function.Consumer p0)`
- `public void ifUnknownType(java.util.function.Consumer p0)`
- `public void ifVarType(java.util.function.Consumer p0)`
- `public void ifVoidType(java.util.function.Consumer p0)`
- `public void ifWildcardType(java.util.function.Consumer p0)`
- `public boolean isArrayType()`
- `public boolean isClassOrInterfaceType()`
- `public boolean isIntersectionType()`
- `public boolean isPrimitiveType()`
- `public boolean isReferenceType()`
- `public boolean isTypeParameter()`
- `public boolean isUnionType()`
- `public boolean isUnknownType()`
- `public boolean isVarType()`
- `public boolean isVoidType()`
- `public boolean isWildcardType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public abstract com.github.javaparser.resolution.types.ResolvedType resolve()`
- `public com.github.javaparser.ast.type.Type setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toArrayType()`
- `public java.util.Optional toClassOrInterfaceType()`
- `public java.lang.String toDescriptor()`
- `public java.util.Optional toIntersectionType()`
- `public java.util.Optional toPrimitiveType()`
- `public java.util.Optional toReferenceType()`
- `public java.util.Optional toTypeParameter()`
- `public java.util.Optional toUnionType()`
- `public java.util.Optional toUnknownType()`
- `public java.util.Optional toVarType()`
- `public java.util.Optional toVoidType()`
- `public java.util.Optional toWildcardType()`

---

## public class `com.github.javaparser.ast.type.TypeParameter`
extends `com.github.javaparser.ast.type.ReferenceType`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.TypeParameter>`, `com.github.javaparser.ast.nodeTypes.NodeWithSimpleName<com.github.javaparser.ast.type.TypeParameter>`  

**Constructors:**
- `public TypeParameter()`
- `public TypeParameter(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.expr.SimpleName p1, com.github.javaparser.ast.NodeList p2, com.github.javaparser.ast.NodeList p3)`
- `public TypeParameter(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.NodeList p1, com.github.javaparser.ast.NodeList p2)`
- `public TypeParameter(java.lang.String p0)`
- `public TypeParameter(java.lang.String p0, com.github.javaparser.ast.NodeList p1)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.TypeParameter asTypeParameter()`
- `public com.github.javaparser.ast.type.TypeParameter clone()`
- `public com.github.javaparser.metamodel.TypeParameterMetaModel getMetaModel()`
- `public com.github.javaparser.ast.expr.SimpleName getName()`
- `public com.github.javaparser.ast.NodeList getTypeBound()`
- `public void ifTypeParameter(java.util.function.Consumer p0)`
- `public boolean isTypeParameter()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedTypeVariable resolve()`
- `public com.github.javaparser.ast.type.TypeParameter setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.TypeParameter setName(com.github.javaparser.ast.expr.SimpleName p0)`
- `public com.github.javaparser.ast.type.TypeParameter setTypeBound(com.github.javaparser.ast.NodeList p0)`
- `public java.lang.String toDescriptor()`
- `public java.util.Optional toTypeParameter()`

---

## public class `com.github.javaparser.ast.type.UnionType`
extends `com.github.javaparser.ast.type.Type`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.UnionType>`  

**Constructors:**
- `public UnionType()`
- `public UnionType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.NodeList p1)`
- `public UnionType(com.github.javaparser.ast.NodeList p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.UnionType asUnionType()`
- `public com.github.javaparser.ast.type.UnionType clone()`
- `public com.github.javaparser.ast.NodeList getElements()`
- `public com.github.javaparser.metamodel.UnionTypeMetaModel getMetaModel()`
- `public void ifUnionType(java.util.function.Consumer p0)`
- `public boolean isUnionType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedUnionType resolve()`
- `public com.github.javaparser.ast.type.UnionType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.UnionType setElements(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toUnionType()`

---

## public class `com.github.javaparser.ast.type.UnknownType`
extends `com.github.javaparser.ast.type.Type`  

**Constructors:**
- `public UnknownType()`
- `public UnknownType(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.UnknownType asUnknownType()`
- `public com.github.javaparser.ast.type.UnknownType clone()`
- `public com.github.javaparser.metamodel.UnknownTypeMetaModel getMetaModel()`
- `public void ifUnknownType(java.util.function.Consumer p0)`
- `public boolean isPhantom()`
- `public boolean isUnknownType()`
- `public com.github.javaparser.resolution.types.ResolvedType resolve()`
- `public com.github.javaparser.ast.type.UnknownType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toUnknownType()`

---

## public class `com.github.javaparser.ast.type.VarType`
extends `com.github.javaparser.ast.type.Type`  

**Constructors:**
- `public VarType()`
- `public VarType(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.VarType asVarType()`
- `public com.github.javaparser.ast.type.VarType clone()`
- `public com.github.javaparser.metamodel.VarTypeMetaModel getMetaModel()`
- `public void ifVarType(java.util.function.Consumer p0)`
- `public boolean isVarType()`
- `public com.github.javaparser.resolution.types.ResolvedType resolve()`
- `public com.github.javaparser.ast.type.VarType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public java.util.Optional toVarType()`

---

## public class `com.github.javaparser.ast.type.VoidType`
extends `com.github.javaparser.ast.type.Type`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.VoidType>`  

**Constructors:**
- `public VoidType()`
- `public VoidType(com.github.javaparser.TokenRange p0)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.VoidType asVoidType()`
- `public com.github.javaparser.ast.type.VoidType clone()`
- `public com.github.javaparser.metamodel.VoidTypeMetaModel getMetaModel()`
- `public void ifVoidType(java.util.function.Consumer p0)`
- `public boolean isVoidType()`
- `public com.github.javaparser.resolution.types.ResolvedVoidType resolve()`
- `public com.github.javaparser.ast.type.VoidType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public java.lang.String toDescriptor()`
- `public java.util.Optional toVoidType()`

---

## public class `com.github.javaparser.ast.type.WildcardType`
extends `com.github.javaparser.ast.type.Type`  
implements `com.github.javaparser.ast.nodeTypes.NodeWithAnnotations<com.github.javaparser.ast.type.WildcardType>`  

**Constructors:**
- `public WildcardType()`
- `public WildcardType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.ReferenceType p1, com.github.javaparser.ast.type.ReferenceType p2)`
- `public WildcardType(com.github.javaparser.TokenRange p0, com.github.javaparser.ast.type.ReferenceType p1, com.github.javaparser.ast.type.ReferenceType p2, com.github.javaparser.ast.NodeList p3)`
- `public WildcardType(com.github.javaparser.ast.type.ReferenceType p0)`
- `public WildcardType(com.github.javaparser.ast.type.ReferenceType p0, com.github.javaparser.ast.type.ReferenceType p1, com.github.javaparser.ast.NodeList p2)`

**Methods:**
- `public <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`
- `public java.lang.String asString()`
- `public com.github.javaparser.ast.type.WildcardType asWildcardType()`
- `public com.github.javaparser.ast.type.WildcardType clone()`
- `public java.util.Optional getExtendedType()`
- `public com.github.javaparser.metamodel.WildcardTypeMetaModel getMetaModel()`
- `public java.util.Optional getSuperType()`
- `public void ifWildcardType(java.util.function.Consumer p0)`
- `public boolean isWildcardType()`
- `public boolean remove(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.ast.type.WildcardType removeExtendedType()`
- `public com.github.javaparser.ast.type.WildcardType removeSuperType()`
- `public boolean replace(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public com.github.javaparser.resolution.types.ResolvedWildcard resolve()`
- `public com.github.javaparser.ast.type.WildcardType setAnnotations(com.github.javaparser.ast.NodeList p0)`
- `public com.github.javaparser.ast.type.WildcardType setExtendedType(com.github.javaparser.ast.type.ReferenceType p0)`
- `public com.github.javaparser.ast.type.WildcardType setSuperType(com.github.javaparser.ast.type.ReferenceType p0)`
- `public java.util.Optional toWildcardType()`

---

## public class `com.github.javaparser.ast.validator.ProblemReporter`

**Constructors:**
- `public ProblemReporter(java.util.function.Consumer p0)`

**Methods:**
- `public void report(com.github.javaparser.TokenRange p0, java.lang.String p1, java.lang.Object... p2)`
- `public void report(com.github.javaparser.ast.nodeTypes.NodeWithTokenRange p0, java.lang.String p1, java.lang.Object... p2)`

---

## public class `com.github.javaparser.ast.validator.RecordAsTypeIdentifierNotAllowed`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public RecordAsTypeIdentifierNotAllowed()`

**Methods:**
- `public void visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.ReservedKeywordValidator`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public ReservedKeywordValidator(java.lang.String p0)`

**Methods:**
- `public void visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.SimpleValidator`<N extends com.github.javaparser.ast.Node>
extends `com.github.javaparser.ast.validator.SingleNodeTypeValidator`  

**Constructors:**
- `public SimpleValidator(java.lang.Class p0, java.util.function.Predicate p1, java.util.function.BiConsumer p2)`

---

## public class `com.github.javaparser.ast.validator.SingleNodeTypeValidator`<N extends com.github.javaparser.ast.Node>
implements `com.github.javaparser.ast.validator.Validator`  

**Constructors:**
- `public SingleNodeTypeValidator(java.lang.Class p0, com.github.javaparser.ast.validator.TypedValidator p1)`

**Methods:**
- `public void accept(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.TreeVisitorValidator`
implements `com.github.javaparser.ast.validator.Validator`  

**Constructors:**
- `public TreeVisitorValidator(com.github.javaparser.ast.validator.Validator p0)`

**Methods:**
- `public final void accept(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public abstract interface `com.github.javaparser.ast.validator.TypedValidator`<N extends com.github.javaparser.ast.Node>
implements `java.util.function.BiConsumer<N,com.github.javaparser.ast.validator.ProblemReporter>`  

**Methods:**
- `public abstract void accept(N p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public default com.github.javaparser.ParseResult$PostProcessor postProcessor()`

---

## public abstract interface `com.github.javaparser.ast.validator.Validator`
implements `com.github.javaparser.ast.validator.TypedValidator<com.github.javaparser.ast.Node>`  

**Methods:**
- `public abstract void accept(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.Validators`
implements `com.github.javaparser.ast.validator.Validator`  

**Constructors:**
- `public Validators(com.github.javaparser.ast.validator.Validator... p0)`

**Methods:**
- `public void accept(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public com.github.javaparser.ast.validator.Validators add(com.github.javaparser.ast.validator.Validator p0)`
- `public java.util.List getValidators()`
- `public com.github.javaparser.ast.validator.Validators remove(com.github.javaparser.ast.validator.Validator p0)`
- `public com.github.javaparser.ast.validator.Validators replace(com.github.javaparser.ast.validator.Validator p0, com.github.javaparser.ast.validator.Validator p1)`

---

## public abstract class `com.github.javaparser.ast.validator.VisitorValidator`
extends `com.github.javaparser.ast.visitor.VoidVisitorAdapter`  
implements `com.github.javaparser.ast.validator.Validator`  

**Constructors:**
- `public VisitorValidator()`

**Methods:**
- `public void accept(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java10PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java10Validator`  

**Constructors:**
- `public Java10PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java10Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java9Validator`  

**Constructors:**
- `public Java10Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java11PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java11Validator`  

**Constructors:**
- `public Java11PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java11Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java10Validator`  

**Constructors:**
- `public Java11Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java12PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java12Validator`  

**Constructors:**
- `public Java12PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java12Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java11Validator`  

**Constructors:**
- `public Java12Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java13PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java13Validator`  

**Constructors:**
- `public Java13PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java13Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java12Validator`  

**Constructors:**
- `public Java13Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java14PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java14Validator`  

**Constructors:**
- `public Java14PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java14Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java13Validator`  

**Constructors:**
- `public Java14Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java15PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java15Validator`  

**Constructors:**
- `public Java15PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java15Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java14Validator`  

**Constructors:**
- `public Java15Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java16PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java16Validator`  

**Constructors:**
- `public Java16PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java16Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java15Validator`  

**Constructors:**
- `public Java16Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java17PreviewValidator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java17Validator`  

**Constructors:**
- `public Java17PreviewValidator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java17Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java16Validator`  

**Constructors:**
- `public Java17Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java1_0Validator`
extends `com.github.javaparser.ast.validator.Validators`  

**Constructors:**
- `public Java1_0Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java1_1Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java1_0Validator`  

**Constructors:**
- `public Java1_1Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java1_2Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java1_1Validator`  

**Constructors:**
- `public Java1_2Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java1_3Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java1_2Validator`  

**Constructors:**
- `public Java1_3Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java1_4Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java1_3Validator`  

**Constructors:**
- `public Java1_4Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java5Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java1_4Validator`  

**Constructors:**
- `public Java5Validator()`

**Fields:**
- `protected final com.github.javaparser.ast.validator.Validator noPrimitiveGenericArguments`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java6Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java5Validator`  

**Constructors:**
- `public Java6Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java7Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java6Validator`  

**Constructors:**
- `public Java7Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java8Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java7Validator`  

**Constructors:**
- `public Java8Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.Java9Validator`
extends `com.github.javaparser.ast.validator.language_level_validations.Java8Validator`  

**Constructors:**
- `public Java9Validator()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.CommonValidators`
extends `com.github.javaparser.ast.validator.Validators`  

**Constructors:**
- `public CommonValidators()`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.ModifierValidator`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public ModifierValidator(boolean p0, boolean p1, boolean p2)`

**Methods:**
- `public void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.EnumDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.FieldDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.body.MethodDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.LambdaExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.stmt.CatchClause p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.NoBinaryIntegerLiteralsValidator`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public NoBinaryIntegerLiteralsValidator()`

**Methods:**
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.NoUnderscoresInIntegerLiteralsValidator`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public NoUnderscoresInIntegerLiteralsValidator()`

**Methods:**
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.RecordDeclarationValidator`
implements `com.github.javaparser.ast.validator.TypedValidator<com.github.javaparser.ast.body.RecordDeclaration>`  

**Constructors:**
- `public RecordDeclarationValidator()`

**Methods:**
- `public void accept(com.github.javaparser.ast.body.RecordDeclaration p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.UnderscoreKeywordValidator`
extends `com.github.javaparser.ast.validator.VisitorValidator`  

**Constructors:**
- `public UnderscoreKeywordValidator()`

**Methods:**
- `public void visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.validator.ProblemReporter p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.language_level_validations.chunks.VarValidator`
implements `com.github.javaparser.ast.validator.TypedValidator<com.github.javaparser.ast.type.VarType>`  

**Constructors:**
- `public VarValidator(boolean p0)`

**Methods:**
- `public void accept(com.github.javaparser.ast.type.VarType p0, com.github.javaparser.ast.validator.ProblemReporter p1)`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java10PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.PostProcessors`  

**Constructors:**
- `public Java10PostProcessor()`

**Fields:**
- `protected final com.github.javaparser.ParseResult$PostProcessor varNodeCreator`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java11PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java10PostProcessor`  

**Constructors:**
- `public Java11PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java12PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java11PostProcessor`  

**Constructors:**
- `public Java12PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java13PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java12PostProcessor`  

**Constructors:**
- `public Java13PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java14PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java13PostProcessor`  

**Constructors:**
- `public Java14PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java15PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java14PostProcessor`  

**Constructors:**
- `public Java15PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java16PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java15PostProcessor`  

**Constructors:**
- `public Java16PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.Java17PostProcessor`
extends `com.github.javaparser.ast.validator.postprocessors.Java16PostProcessor`  

**Constructors:**
- `public Java17PostProcessor()`

---

## public class `com.github.javaparser.ast.validator.postprocessors.PostProcessors`
implements `com.github.javaparser.ParseResult$PostProcessor`  

**Constructors:**
- `public PostProcessors(com.github.javaparser.ParseResult$PostProcessor... p0)`

**Methods:**
- `public com.github.javaparser.ast.validator.postprocessors.PostProcessors add(com.github.javaparser.ParseResult$PostProcessor p0)`
- `public java.util.List getPostProcessors()`
- `public void process(com.github.javaparser.ParseResult p0, com.github.javaparser.ParserConfiguration p1)`
- `public com.github.javaparser.ast.validator.postprocessors.PostProcessors remove(com.github.javaparser.ParseResult$PostProcessor p0)`
- `public com.github.javaparser.ast.validator.postprocessors.PostProcessors replace(com.github.javaparser.ParseResult$PostProcessor p0, com.github.javaparser.ParseResult$PostProcessor p1)`

---

## public class `com.github.javaparser.ast.visitor.CloneVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<com.github.javaparser.ast.visitor.Visitable,java.lang.Object>`  

**Constructors:**
- `public CloneVisitor()`

**Methods:**
- `protected <T extends com.github.javaparser.ast.Node> T cloneNode(T p0, java.lang.Object p1)`
- `protected <T extends com.github.javaparser.ast.Node> T cloneNode(java.util.Optional p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.Node visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.Modifier p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.NodeList p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.Name p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.VarType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Object p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Object p1)`

---

## public class `com.github.javaparser.ast.visitor.EqualsVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Boolean,com.github.javaparser.ast.visitor.Visitable>`  

**Methods:**
- `public static boolean equals(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ArrayCreationLevel p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.CompilationUnit p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ImportDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.Modifier p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.PackageDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.FieldDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.InitializerDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.MethodDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ReceiverParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.RecordDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.VariableDeclarator p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.BlockComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.JavadocComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.LineComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.AssignExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BinaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CastExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ClassExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ConditionalExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.EnclosedExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LambdaExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MemberValuePair p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodCallExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NameExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.PatternExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SuperExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SwitchExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ThisExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TypeExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.UnaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.AssertStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BlockStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BreakStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.CatchClause p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ContinueStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.DoStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.EmptyStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForEachStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.IfStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LabeledStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ReturnStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchEntry p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ThrowStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.TryStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.WhileStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.YieldStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ArrayType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.IntersectionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.PrimitiveType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.TypeParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnknownType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VarType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VoidType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.WildcardType p0, com.github.javaparser.ast.visitor.Visitable p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.GenericListVisitorAdapter`<R extends java.lang.Object, A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.util.List<R>,A>`  

**Constructors:**
- `public GenericListVisitorAdapter()`

**Methods:**
- `public java.util.List visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public java.util.List visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public abstract interface `com.github.javaparser.ast.visitor.GenericVisitor`<R extends java.lang.Object, A extends java.lang.Object>

**Methods:**
- `public abstract R visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public abstract R visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.GenericVisitorAdapter`<R extends java.lang.Object, A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.GenericVisitor<R,A>`  

**Constructors:**
- `public GenericVisitorAdapter()`

**Methods:**
- `public R visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public R visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public R visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public R visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public R visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.GenericVisitorWithDefaults`<R extends java.lang.Object, A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.GenericVisitor<R,A>`  

**Constructors:**
- `public GenericVisitorWithDefaults()`

**Methods:**
- `public R defaultAction(com.github.javaparser.ast.Node p0, A p1)`
- `public R defaultAction(com.github.javaparser.ast.NodeList p0, A p1)`
- `public R visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public R visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public R visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public R visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public R visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public R visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public class `com.github.javaparser.ast.visitor.HashCodeVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Integer,java.lang.Void>`  

**Methods:**
- `public static int hashCode(com.github.javaparser.ast.Node p0)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.Modifier p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.Name p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VarType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Void p1)`

---

## public class `com.github.javaparser.ast.visitor.ModifierVisitor`<A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.GenericVisitor<com.github.javaparser.ast.visitor.Visitable,A>`  

**Constructors:**
- `public ModifierVisitor()`

**Methods:**
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public com.github.javaparser.ast.Node visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public class `com.github.javaparser.ast.visitor.NoCommentEqualsVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Boolean,com.github.javaparser.ast.visitor.Visitable>`  

**Constructors:**
- `public NoCommentEqualsVisitor()`

**Methods:**
- `public static boolean equals(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ArrayCreationLevel p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.CompilationUnit p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ImportDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.Modifier p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.PackageDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.FieldDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.InitializerDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.MethodDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ReceiverParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.RecordDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.VariableDeclarator p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.BlockComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.JavadocComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.LineComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.AssignExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BinaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CastExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ClassExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ConditionalExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.EnclosedExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LambdaExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MemberValuePair p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodCallExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NameExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.PatternExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SuperExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SwitchExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ThisExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TypeExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.UnaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.AssertStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BlockStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BreakStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.CatchClause p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ContinueStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.DoStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.EmptyStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForEachStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.IfStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LabeledStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ReturnStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchEntry p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ThrowStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.TryStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.WhileStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.YieldStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ArrayType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.IntersectionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.PrimitiveType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.TypeParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnknownType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VarType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VoidType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.WildcardType p0, com.github.javaparser.ast.visitor.Visitable p1)`

---

## public class `com.github.javaparser.ast.visitor.NoCommentHashCodeVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Integer,java.lang.Void>`  

**Constructors:**
- `public NoCommentHashCodeVisitor()`

**Methods:**
- `public static int hashCode(com.github.javaparser.ast.Node p0)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.Modifier p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.Name p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VarType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Void p1)`

---

## public class `com.github.javaparser.ast.visitor.ObjectIdentityEqualsVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Boolean,com.github.javaparser.ast.visitor.Visitable>`  

**Constructors:**
- `public ObjectIdentityEqualsVisitor()`

**Methods:**
- `public static boolean equals(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ArrayCreationLevel p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.CompilationUnit p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.ImportDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.Modifier p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.NodeList p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.PackageDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.EnumDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.FieldDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.InitializerDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.MethodDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.Parameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.ReceiverParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.RecordDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.body.VariableDeclarator p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.BlockComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.JavadocComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.comments.LineComment p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.AssignExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BinaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CastExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ClassExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ConditionalExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.EnclosedExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LambdaExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MemberValuePair p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodCallExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.Name p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NameExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.PatternExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SimpleName p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SuperExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.SwitchExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.ThisExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.TypeExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.UnaryExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.AssertStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BlockStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.BreakStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.CatchClause p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ContinueStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.DoStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.EmptyStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForEachStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ForStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.IfStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LabeledStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ReturnStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchEntry p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SwitchStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.ThrowStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.TryStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.WhileStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.stmt.YieldStmt p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ArrayType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.IntersectionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.PrimitiveType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.TypeParameter p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnionType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.UnknownType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VarType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.VoidType p0, com.github.javaparser.ast.visitor.Visitable p1)`
- `public java.lang.Boolean visit(com.github.javaparser.ast.type.WildcardType p0, com.github.javaparser.ast.visitor.Visitable p1)`

---

## public class `com.github.javaparser.ast.visitor.ObjectIdentityHashCodeVisitor`
implements `com.github.javaparser.ast.visitor.GenericVisitor<java.lang.Integer,java.lang.Void>`  

**Constructors:**
- `public ObjectIdentityHashCodeVisitor()`

**Methods:**
- `public static int hashCode(com.github.javaparser.ast.Node p0)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.Modifier p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.Name p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VarType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Void p1)`
- `public java.lang.Integer visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Void p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.TreeVisitor`

**Constructors:**
- `public TreeVisitor()`

**Methods:**
- `public abstract void process(com.github.javaparser.ast.Node p0)`
- `public void visitBreadthFirst(com.github.javaparser.ast.Node p0)`
- `public void visitDirectChildren(com.github.javaparser.ast.Node p0)`
- `public void visitLeavesFirst(com.github.javaparser.ast.Node p0)`
- `public void visitPostOrder(com.github.javaparser.ast.Node p0)`
- `public void visitPreOrder(com.github.javaparser.ast.Node p0)`

---

## public abstract interface `com.github.javaparser.ast.visitor.Visitable`

**Methods:**
- `public abstract <R extends java.lang.Object, A extends java.lang.Object> R accept(com.github.javaparser.ast.visitor.GenericVisitor p0, A p1)`
- `public abstract <A extends java.lang.Object> void accept(com.github.javaparser.ast.visitor.VoidVisitor p0, A p1)`

---

## public abstract interface `com.github.javaparser.ast.visitor.VoidVisitor`<A extends java.lang.Object>

**Methods:**
- `public abstract void visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public abstract void visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.VoidVisitorAdapter`<A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.VoidVisitor<A>`  

**Constructors:**
- `public VoidVisitorAdapter()`

**Methods:**
- `public void visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public void visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public void visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public void visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public void visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public abstract class `com.github.javaparser.ast.visitor.VoidVisitorWithDefaults`<A extends java.lang.Object>
implements `com.github.javaparser.ast.visitor.VoidVisitor<A>`  

**Constructors:**
- `public VoidVisitorWithDefaults()`

**Methods:**
- `public void defaultAction(com.github.javaparser.ast.Node p0, A p1)`
- `public void defaultAction(com.github.javaparser.ast.NodeList p0, A p1)`
- `public void visit(com.github.javaparser.ast.ArrayCreationLevel p0, A p1)`
- `public void visit(com.github.javaparser.ast.CompilationUnit p0, A p1)`
- `public void visit(com.github.javaparser.ast.ImportDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.Modifier p0, A p1)`
- `public void visit(com.github.javaparser.ast.NodeList p0, A p1)`
- `public void visit(com.github.javaparser.ast.PackageDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.EnumDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.FieldDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.InitializerDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.MethodDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.Parameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.ReceiverParameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.RecordDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.body.VariableDeclarator p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.BlockComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.JavadocComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.comments.LineComment p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.AssignExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.BinaryExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.CastExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ClassExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ConditionalExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.EnclosedExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.LambdaExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MemberValuePair p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodCallExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.Name p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NameExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.PatternExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SuperExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.SwitchExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.ThisExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.TypeExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.UnaryExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.AssertStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.BlockStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.BreakStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.CatchClause p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ContinueStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.DoStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.EmptyStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForEachStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.IfStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LabeledStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ReturnStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchEntry p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.ThrowStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.TryStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.WhileStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.stmt.YieldStmt p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.ArrayType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.IntersectionType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.PrimitiveType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.TypeParameter p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.UnionType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.UnknownType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.VarType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.VoidType p0, A p1)`
- `public void visit(com.github.javaparser.ast.type.WildcardType p0, A p1)`

---

## public class `com.github.javaparser.javadoc.Javadoc`

**Constructors:**
- `public Javadoc(com.github.javaparser.javadoc.description.JavadocDescription p0)`

**Methods:**
- `public com.github.javaparser.javadoc.Javadoc addBlockTag(com.github.javaparser.javadoc.JavadocBlockTag p0)`
- `public com.github.javaparser.javadoc.Javadoc addBlockTag(java.lang.String p0)`
- `public com.github.javaparser.javadoc.Javadoc addBlockTag(java.lang.String p0, java.lang.String p1)`
- `public com.github.javaparser.javadoc.Javadoc addBlockTag(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getBlockTags()`
- `public com.github.javaparser.javadoc.description.JavadocDescription getDescription()`
- `public int hashCode()`
- `public com.github.javaparser.ast.comments.JavadocComment toComment()`
- `public com.github.javaparser.ast.comments.JavadocComment toComment(java.lang.String p0)`
- `public java.lang.String toString()`
- `public java.lang.String toText()`

---

## public class `com.github.javaparser.javadoc.JavadocBlockTag`

**Constructors:**
- `public JavadocBlockTag(com.github.javaparser.javadoc.JavadocBlockTag$Type p0, java.lang.String p1)`
- `public JavadocBlockTag(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public static com.github.javaparser.javadoc.JavadocBlockTag createParamBlockTag(java.lang.String p0, java.lang.String p1)`
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.javadoc.description.JavadocDescription getContent()`
- `public java.util.Optional getName()`
- `public java.lang.String getTagName()`
- `public com.github.javaparser.javadoc.JavadocBlockTag$Type getType()`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public java.lang.String toText()`

---

## public final static enum `com.github.javaparser.javadoc.JavadocBlockTag$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type AUTHOR`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type DEPRECATED`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type EXCEPTION`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type PARAM`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type RETURN`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type SEE`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type SERIAL`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type SERIAL_DATA`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type SERIAL_FIELD`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type SINCE`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type THROWS`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type UNKNOWN`
- `public final static com.github.javaparser.javadoc.JavadocBlockTag$Type VERSION`

---

## public class `com.github.javaparser.javadoc.description.JavadocDescription`

**Constructors:**
- `public JavadocDescription()`
- `public JavadocDescription(java.util.List p0)`

**Methods:**
- `public boolean addElement(com.github.javaparser.javadoc.description.JavadocDescriptionElement p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getElements()`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public static com.github.javaparser.javadoc.description.JavadocDescription parseText(java.lang.String p0)`
- `public java.lang.String toString()`
- `public java.lang.String toText()`

---

## public abstract interface `com.github.javaparser.javadoc.description.JavadocDescriptionElement`

**Methods:**
- `public abstract java.lang.String toText()`

---

## public class `com.github.javaparser.javadoc.description.JavadocInlineTag`
implements `com.github.javaparser.javadoc.description.JavadocDescriptionElement`  

**Constructors:**
- `public JavadocInlineTag(java.lang.String p0, com.github.javaparser.javadoc.description.JavadocInlineTag$Type p1, java.lang.String p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static com.github.javaparser.javadoc.description.JavadocDescriptionElement fromText(java.lang.String p0)`
- `public java.lang.String getContent()`
- `public java.lang.String getName()`
- `public com.github.javaparser.javadoc.description.JavadocInlineTag$Type getType()`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public java.lang.String toText()`

---

## public final static enum `com.github.javaparser.javadoc.description.JavadocInlineTag$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type CODE`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type DOC_ROOT`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type INHERIT_DOC`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type LINK`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type LINKPLAIN`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type LITERAL`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type SYSTEM_PROPERTY`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type UNKNOWN`
- `public final static com.github.javaparser.javadoc.description.JavadocInlineTag$Type VALUE`

---

## public class `com.github.javaparser.javadoc.description.JavadocSnippet`
implements `com.github.javaparser.javadoc.description.JavadocDescriptionElement`  

**Constructors:**
- `public JavadocSnippet(java.lang.String p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public java.lang.String toText()`

---

## public class `com.github.javaparser.metamodel.AnnotationDeclarationMetaModel`
extends `com.github.javaparser.metamodel.TypeDeclarationMetaModel`  

---

## public class `com.github.javaparser.metamodel.AnnotationExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Constructors:**
- `protected AnnotationExprMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.AnnotationMemberDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel defaultValuePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ArrayAccessExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel indexPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ArrayCreationExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel elementTypePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel initializerPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel levelsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ArrayCreationLevelMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel dimensionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ArrayInitializerExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel valuesPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ArrayTypeMetaModel`
extends `com.github.javaparser.metamodel.ReferenceTypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel componentTypePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel originPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.AssertStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel checkPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel messagePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.AssignExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel operatorPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel targetPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel valuePropertyMetaModel`

---

## public abstract class `com.github.javaparser.metamodel.BaseNodeMetaModel`

**Constructors:**
- `public BaseNodeMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Methods:**
- `public com.github.javaparser.ast.Node construct(java.util.Map p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getAllPropertyMetaModels()`
- `public java.util.List getConstructorParameters()`
- `public java.util.List getDeclaredPropertyMetaModels()`
- `public java.util.List getDerivedPropertyMetaModels()`
- `public java.lang.String getMetaModelFieldName()`
- `public java.lang.String getPackageName()`
- `public java.lang.String getQualifiedClassName()`
- `public java.util.Optional getSuperNodeMetaModel()`
- `public java.lang.Class getType()`
- `public java.lang.String getTypeName()`
- `public java.lang.String getTypeNameGenerified()`
- `public boolean hasWildcard()`
- `public int hashCode()`
- `public boolean is(java.lang.Class p0)`
- `public boolean isAbstract()`
- `public boolean isInstanceOfMetaModel(com.github.javaparser.metamodel.BaseNodeMetaModel p0)`
- `public boolean isRootNode()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.metamodel.BinaryExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel leftPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel operatorPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel rightPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.BlockCommentMetaModel`
extends `com.github.javaparser.metamodel.CommentMetaModel`  

---

## public class `com.github.javaparser.metamodel.BlockStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel statementsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.BodyDeclarationMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected BodyDeclarationMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.BooleanLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralExprMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel valuePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.BreakStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel labelPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CallableDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Constructors:**
- `protected CallableDeclarationMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel parametersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel receiverParameterPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel thrownExceptionsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeParametersPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CastExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CatchClauseMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel parameterPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CharLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.ClassExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ClassOrInterfaceDeclarationMetaModel`
extends `com.github.javaparser.metamodel.TypeDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel extendedTypesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel implementedTypesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isInterfacePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeParametersPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ClassOrInterfaceTypeMetaModel`
extends `com.github.javaparser.metamodel.ReferenceTypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel scopePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CommentMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected CommentMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel contentPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CompactConstructorDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel thrownExceptionsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeParametersPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.CompilationUnitMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel importsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modulePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel packageDeclarationPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typesPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ConditionalExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel conditionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel elseExprPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel thenExprPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ConstructorDeclarationMetaModel`
extends `com.github.javaparser.metamodel.CallableDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ContinueStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel labelPropertyMetaModel`

---

## public abstract interface `com.github.javaparser.metamodel.DerivedProperty`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.metamodel.DoStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel conditionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.DoubleLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.EmptyStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

---

## public class `com.github.javaparser.metamodel.EnclosedExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel innerPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.EnumConstantDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel argumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel classBodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.EnumDeclarationMetaModel`
extends `com.github.javaparser.metamodel.TypeDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel entriesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel implementedTypesPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ExplicitConstructorInvocationStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel argumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isThisPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ExpressionMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected ExpressionMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `com.github.javaparser.metamodel.ExpressionStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.FieldAccessExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel scopePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.FieldDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel maximumCommonTypePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel variablesPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ForEachStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel iterablePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel variablePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ForStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel comparePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel initializationPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel updatePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.IfStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel cascadingIfStmtPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel conditionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel elseBlockPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel elseBranchPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel elseStmtPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel thenBlockPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel thenStmtPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ImportDeclarationMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel isAsteriskPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isStaticPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.InitializerDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isStaticPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.InstanceOfExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel patternPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.IntegerLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public abstract interface `com.github.javaparser.metamodel.InternalProperty`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.metamodel.IntersectionTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel elementsPropertyMetaModel`

---

## public final class `com.github.javaparser.metamodel.JavaParserMetaModel`

**Fields:**
- `public final static com.github.javaparser.metamodel.AnnotationDeclarationMetaModel annotationDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.AnnotationExprMetaModel annotationExprMetaModel`
- `public final static com.github.javaparser.metamodel.AnnotationMemberDeclarationMetaModel annotationMemberDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ArrayAccessExprMetaModel arrayAccessExprMetaModel`
- `public final static com.github.javaparser.metamodel.ArrayCreationExprMetaModel arrayCreationExprMetaModel`
- `public final static com.github.javaparser.metamodel.ArrayCreationLevelMetaModel arrayCreationLevelMetaModel`
- `public final static com.github.javaparser.metamodel.ArrayInitializerExprMetaModel arrayInitializerExprMetaModel`
- `public final static com.github.javaparser.metamodel.ArrayTypeMetaModel arrayTypeMetaModel`
- `public final static com.github.javaparser.metamodel.AssertStmtMetaModel assertStmtMetaModel`
- `public final static com.github.javaparser.metamodel.AssignExprMetaModel assignExprMetaModel`
- `public final static com.github.javaparser.metamodel.BinaryExprMetaModel binaryExprMetaModel`
- `public final static com.github.javaparser.metamodel.BlockCommentMetaModel blockCommentMetaModel`
- `public final static com.github.javaparser.metamodel.BlockStmtMetaModel blockStmtMetaModel`
- `public final static com.github.javaparser.metamodel.BodyDeclarationMetaModel bodyDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.BooleanLiteralExprMetaModel booleanLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.BreakStmtMetaModel breakStmtMetaModel`
- `public final static com.github.javaparser.metamodel.CallableDeclarationMetaModel callableDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.CastExprMetaModel castExprMetaModel`
- `public final static com.github.javaparser.metamodel.CatchClauseMetaModel catchClauseMetaModel`
- `public final static com.github.javaparser.metamodel.CharLiteralExprMetaModel charLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.ClassExprMetaModel classExprMetaModel`
- `public final static com.github.javaparser.metamodel.ClassOrInterfaceDeclarationMetaModel classOrInterfaceDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ClassOrInterfaceTypeMetaModel classOrInterfaceTypeMetaModel`
- `public final static com.github.javaparser.metamodel.CommentMetaModel commentMetaModel`
- `public final static com.github.javaparser.metamodel.CompactConstructorDeclarationMetaModel compactConstructorDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.CompilationUnitMetaModel compilationUnitMetaModel`
- `public final static com.github.javaparser.metamodel.ConditionalExprMetaModel conditionalExprMetaModel`
- `public final static com.github.javaparser.metamodel.ConstructorDeclarationMetaModel constructorDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ContinueStmtMetaModel continueStmtMetaModel`
- `public final static com.github.javaparser.metamodel.DoStmtMetaModel doStmtMetaModel`
- `public final static com.github.javaparser.metamodel.DoubleLiteralExprMetaModel doubleLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.EmptyStmtMetaModel emptyStmtMetaModel`
- `public final static com.github.javaparser.metamodel.EnclosedExprMetaModel enclosedExprMetaModel`
- `public final static com.github.javaparser.metamodel.EnumConstantDeclarationMetaModel enumConstantDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.EnumDeclarationMetaModel enumDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ExplicitConstructorInvocationStmtMetaModel explicitConstructorInvocationStmtMetaModel`
- `public final static com.github.javaparser.metamodel.ExpressionMetaModel expressionMetaModel`
- `public final static com.github.javaparser.metamodel.ExpressionStmtMetaModel expressionStmtMetaModel`
- `public final static com.github.javaparser.metamodel.FieldAccessExprMetaModel fieldAccessExprMetaModel`
- `public final static com.github.javaparser.metamodel.FieldDeclarationMetaModel fieldDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ForEachStmtMetaModel forEachStmtMetaModel`
- `public final static com.github.javaparser.metamodel.ForStmtMetaModel forStmtMetaModel`
- `public final static com.github.javaparser.metamodel.IfStmtMetaModel ifStmtMetaModel`
- `public final static com.github.javaparser.metamodel.ImportDeclarationMetaModel importDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.InitializerDeclarationMetaModel initializerDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.InstanceOfExprMetaModel instanceOfExprMetaModel`
- `public final static com.github.javaparser.metamodel.IntegerLiteralExprMetaModel integerLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.IntersectionTypeMetaModel intersectionTypeMetaModel`
- `public final static com.github.javaparser.metamodel.JavadocCommentMetaModel javadocCommentMetaModel`
- `public final static com.github.javaparser.metamodel.LabeledStmtMetaModel labeledStmtMetaModel`
- `public final static com.github.javaparser.metamodel.LambdaExprMetaModel lambdaExprMetaModel`
- `public final static com.github.javaparser.metamodel.LineCommentMetaModel lineCommentMetaModel`
- `public final static com.github.javaparser.metamodel.LiteralExprMetaModel literalExprMetaModel`
- `public final static com.github.javaparser.metamodel.LiteralStringValueExprMetaModel literalStringValueExprMetaModel`
- `public final static com.github.javaparser.metamodel.LocalClassDeclarationStmtMetaModel localClassDeclarationStmtMetaModel`
- `public final static com.github.javaparser.metamodel.LocalRecordDeclarationStmtMetaModel localRecordDeclarationStmtMetaModel`
- `public final static com.github.javaparser.metamodel.LongLiteralExprMetaModel longLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.MarkerAnnotationExprMetaModel markerAnnotationExprMetaModel`
- `public final static com.github.javaparser.metamodel.MemberValuePairMetaModel memberValuePairMetaModel`
- `public final static com.github.javaparser.metamodel.MethodCallExprMetaModel methodCallExprMetaModel`
- `public final static com.github.javaparser.metamodel.MethodDeclarationMetaModel methodDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.MethodReferenceExprMetaModel methodReferenceExprMetaModel`
- `public final static com.github.javaparser.metamodel.ModifierMetaModel modifierMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleDeclarationMetaModel moduleDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleDirectiveMetaModel moduleDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleExportsDirectiveMetaModel moduleExportsDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleOpensDirectiveMetaModel moduleOpensDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleProvidesDirectiveMetaModel moduleProvidesDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleRequiresDirectiveMetaModel moduleRequiresDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.ModuleUsesDirectiveMetaModel moduleUsesDirectiveMetaModel`
- `public final static com.github.javaparser.metamodel.NameExprMetaModel nameExprMetaModel`
- `public final static com.github.javaparser.metamodel.NameMetaModel nameMetaModel`
- `public final static com.github.javaparser.metamodel.NodeMetaModel nodeMetaModel`
- `public final static com.github.javaparser.metamodel.NormalAnnotationExprMetaModel normalAnnotationExprMetaModel`
- `public final static com.github.javaparser.metamodel.NullLiteralExprMetaModel nullLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.ObjectCreationExprMetaModel objectCreationExprMetaModel`
- `public final static com.github.javaparser.metamodel.PackageDeclarationMetaModel packageDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ParameterMetaModel parameterMetaModel`
- `public final static com.github.javaparser.metamodel.PatternExprMetaModel patternExprMetaModel`
- `public final static com.github.javaparser.metamodel.PrimitiveTypeMetaModel primitiveTypeMetaModel`
- `public final static com.github.javaparser.metamodel.ReceiverParameterMetaModel receiverParameterMetaModel`
- `public final static com.github.javaparser.metamodel.RecordDeclarationMetaModel recordDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.ReferenceTypeMetaModel referenceTypeMetaModel`
- `public final static com.github.javaparser.metamodel.ReturnStmtMetaModel returnStmtMetaModel`
- `public final static com.github.javaparser.metamodel.SimpleNameMetaModel simpleNameMetaModel`
- `public final static com.github.javaparser.metamodel.SingleMemberAnnotationExprMetaModel singleMemberAnnotationExprMetaModel`
- `public final static com.github.javaparser.metamodel.StatementMetaModel statementMetaModel`
- `public final static com.github.javaparser.metamodel.StringLiteralExprMetaModel stringLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.SuperExprMetaModel superExprMetaModel`
- `public final static com.github.javaparser.metamodel.SwitchEntryMetaModel switchEntryMetaModel`
- `public final static com.github.javaparser.metamodel.SwitchExprMetaModel switchExprMetaModel`
- `public final static com.github.javaparser.metamodel.SwitchStmtMetaModel switchStmtMetaModel`
- `public final static com.github.javaparser.metamodel.SynchronizedStmtMetaModel synchronizedStmtMetaModel`
- `public final static com.github.javaparser.metamodel.TextBlockLiteralExprMetaModel textBlockLiteralExprMetaModel`
- `public final static com.github.javaparser.metamodel.ThisExprMetaModel thisExprMetaModel`
- `public final static com.github.javaparser.metamodel.ThrowStmtMetaModel throwStmtMetaModel`
- `public final static com.github.javaparser.metamodel.TryStmtMetaModel tryStmtMetaModel`
- `public final static com.github.javaparser.metamodel.TypeDeclarationMetaModel typeDeclarationMetaModel`
- `public final static com.github.javaparser.metamodel.TypeExprMetaModel typeExprMetaModel`
- `public final static com.github.javaparser.metamodel.TypeMetaModel typeMetaModel`
- `public final static com.github.javaparser.metamodel.TypeParameterMetaModel typeParameterMetaModel`
- `public final static com.github.javaparser.metamodel.UnaryExprMetaModel unaryExprMetaModel`
- `public final static com.github.javaparser.metamodel.UnionTypeMetaModel unionTypeMetaModel`
- `public final static com.github.javaparser.metamodel.UnknownTypeMetaModel unknownTypeMetaModel`
- `public final static com.github.javaparser.metamodel.UnparsableStmtMetaModel unparsableStmtMetaModel`
- `public final static com.github.javaparser.metamodel.VarTypeMetaModel varTypeMetaModel`
- `public final static com.github.javaparser.metamodel.VariableDeclarationExprMetaModel variableDeclarationExprMetaModel`
- `public final static com.github.javaparser.metamodel.VariableDeclaratorMetaModel variableDeclaratorMetaModel`
- `public final static com.github.javaparser.metamodel.VoidTypeMetaModel voidTypeMetaModel`
- `public final static com.github.javaparser.metamodel.WhileStmtMetaModel whileStmtMetaModel`
- `public final static com.github.javaparser.metamodel.WildcardTypeMetaModel wildcardTypeMetaModel`
- `public final static com.github.javaparser.metamodel.YieldStmtMetaModel yieldStmtMetaModel`

**Methods:**
- `public static java.util.Optional getNodeMetaModel(java.lang.Class p0)`
- `public static java.util.List getNodeMetaModels()`

---

## public class `com.github.javaparser.metamodel.JavadocCommentMetaModel`
extends `com.github.javaparser.metamodel.CommentMetaModel`  

---

## public class `com.github.javaparser.metamodel.LabeledStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel labelPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel statementPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.LambdaExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionBodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isEnclosingParametersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel parametersPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.LineCommentMetaModel`
extends `com.github.javaparser.metamodel.CommentMetaModel`  

---

## public class `com.github.javaparser.metamodel.LiteralExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Constructors:**
- `protected LiteralExprMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralExprMetaModel`  

**Constructors:**
- `protected LiteralStringValueExprMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel valuePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.LocalClassDeclarationStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel classDeclarationPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.LocalRecordDeclarationStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel recordDeclarationPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.LongLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.MarkerAnnotationExprMetaModel`
extends `com.github.javaparser.metamodel.AnnotationExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.MemberValuePairMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel valuePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.MethodCallExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel argumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel scopePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.MethodDeclarationMetaModel`
extends `com.github.javaparser.metamodel.CallableDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.MethodReferenceExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel identifierPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel scopePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModifierMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel keywordPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleDeclarationMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel directivesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isOpenPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected ModuleDirectiveMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `com.github.javaparser.metamodel.ModuleExportsDirectiveMetaModel`
extends `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel moduleNamesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleOpensDirectiveMetaModel`
extends `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel moduleNamesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleProvidesDirectiveMetaModel`
extends `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel withPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleRequiresDirectiveMetaModel`
extends `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ModuleUsesDirectiveMetaModel`
extends `com.github.javaparser.metamodel.ModuleDirectiveMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.NameExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.NameMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel identifierPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel qualifierPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.NodeMetaModel`
extends `com.github.javaparser.metamodel.BaseNodeMetaModel`  

**Constructors:**
- `protected NodeMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel commentPropertyMetaModel`

---

## public abstract interface `com.github.javaparser.metamodel.NonEmptyProperty`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.metamodel.NormalAnnotationExprMetaModel`
extends `com.github.javaparser.metamodel.AnnotationExprMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel pairsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.NullLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.ObjectCreationExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel anonymousClassBodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel argumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel scopePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeArgumentsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel usingDiamondOperatorPropertyMetaModel`

---

## public abstract interface `com.github.javaparser.metamodel.OptionalProperty`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.github.javaparser.metamodel.PackageDeclarationMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ParameterMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel isVarArgsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel varArgsAnnotationsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.PatternExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.PrimitiveTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.PropertyMetaModel`

**Constructors:**
- `public PropertyMetaModel(com.github.javaparser.metamodel.BaseNodeMetaModel p0, java.lang.String p1, java.lang.Class p2, java.util.Optional p3, boolean p4, boolean p5, boolean p6, boolean p7)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.metamodel.BaseNodeMetaModel getContainingNodeMetaModel()`
- `public java.lang.String getGetterMethodName()`
- `public java.lang.String getMetaModelFieldName()`
- `public java.lang.String getName()`
- `public java.util.Optional getNodeReference()`
- `public java.lang.String getSetterMethodName()`
- `public java.lang.Class getType()`
- `public java.lang.String getTypeName()`
- `public java.lang.String getTypeNameForGetter()`
- `public java.lang.String getTypeNameForSetter()`
- `public java.lang.String getTypeNameGenerified()`
- `public java.lang.Object getValue(com.github.javaparser.ast.Node p0)`
- `public boolean hasWildcard()`
- `public int hashCode()`
- `public boolean is(java.lang.Class p0, java.lang.String p1)`
- `public boolean is(java.lang.String p0)`
- `public boolean isAttribute()`
- `public boolean isNode()`
- `public boolean isNodeList()`
- `public boolean isNonEmpty()`
- `public boolean isOptional()`
- `public boolean isRequired()`
- `public boolean isSingular()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.metamodel.ReceiverParameterMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.RecordDeclarationMetaModel`
extends `com.github.javaparser.metamodel.TypeDeclarationMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel implementedTypesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel parametersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel receiverParameterPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeParametersPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ReferenceTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

**Constructors:**
- `protected ReferenceTypeMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `com.github.javaparser.metamodel.ReturnStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SimpleNameMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel identifierPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SingleMemberAnnotationExprMetaModel`
extends `com.github.javaparser.metamodel.AnnotationExprMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel memberValuePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.StatementMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected StatementMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `com.github.javaparser.metamodel.StringLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.SuperExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel typeNamePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SwitchEntryMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel labelsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel statementsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SwitchExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel entriesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel selectorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SwitchStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel entriesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel selectorPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.SynchronizedStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TextBlockLiteralExprMetaModel`
extends `com.github.javaparser.metamodel.LiteralStringValueExprMetaModel`  

---

## public class `com.github.javaparser.metamodel.ThisExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel typeNamePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.ThrowStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TryStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel catchClausesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel finallyBlockPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel resourcesPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel tryBlockPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TypeDeclarationMetaModel`
extends `com.github.javaparser.metamodel.BodyDeclarationMetaModel`  

**Constructors:**
- `protected TypeDeclarationMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel membersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TypeExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TypeMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Constructors:**
- `protected TypeMetaModel(java.util.Optional p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.TypeParameterMetaModel`
extends `com.github.javaparser.metamodel.ReferenceTypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typeBoundPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.UnaryExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel operatorPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel postfixPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel prefixPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.UnionTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel elementsPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.UnknownTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

---

## public class `com.github.javaparser.metamodel.UnparsableStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

---

## public class `com.github.javaparser.metamodel.VarTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

---

## public class `com.github.javaparser.metamodel.VariableDeclarationExprMetaModel`
extends `com.github.javaparser.metamodel.ExpressionMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel annotationsPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel maximumCommonTypePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel modifiersPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel variablesPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.VariableDeclaratorMetaModel`
extends `com.github.javaparser.metamodel.NodeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel initializerPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel namePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel typePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.VoidTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

---

## public class `com.github.javaparser.metamodel.WhileStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel bodyPropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel conditionPropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.WildcardTypeMetaModel`
extends `com.github.javaparser.metamodel.TypeMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel extendedTypePropertyMetaModel`
- `public com.github.javaparser.metamodel.PropertyMetaModel superTypePropertyMetaModel`

---

## public class `com.github.javaparser.metamodel.YieldStmtMetaModel`
extends `com.github.javaparser.metamodel.StatementMetaModel`  

**Fields:**
- `public com.github.javaparser.metamodel.PropertyMetaModel expressionPropertyMetaModel`

---

## public class `com.github.javaparser.printer.ConcreteSyntaxModel`

**Methods:**
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement forClass(java.lang.Class p0)`
- `public static java.lang.String genericPrettyPrint(com.github.javaparser.ast.Node p0)`
- `public static void genericPrettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public class `com.github.javaparser.printer.DefaultPrettyPrinter`
implements `com.github.javaparser.printer.Printer`  

**Constructors:**
- `public DefaultPrettyPrinter()`
- `public DefaultPrettyPrinter(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `public DefaultPrettyPrinter(java.util.function.Function p0, com.github.javaparser.printer.configuration.PrinterConfiguration p1)`

**Methods:**
- `public com.github.javaparser.printer.configuration.PrinterConfiguration getConfiguration()`
- `public java.lang.String print(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.printer.Printer setConfiguration(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`

---

## public class `com.github.javaparser.printer.DefaultPrettyPrinterVisitor`
implements `com.github.javaparser.ast.visitor.VoidVisitor<java.lang.Void>`  

**Constructors:**
- `public DefaultPrettyPrinterVisitor(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`
- `public DefaultPrettyPrinterVisitor(com.github.javaparser.printer.configuration.PrinterConfiguration p0, com.github.javaparser.printer.SourcePrinter p1)`

**Fields:**
- `protected final com.github.javaparser.printer.configuration.PrinterConfiguration configuration`
- `protected final com.github.javaparser.printer.SourcePrinter printer`

**Methods:**
- `protected void printAnnotations(com.github.javaparser.ast.NodeList p0, boolean p1, java.lang.Void p2)`
- `protected void printArguments(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printComment(java.util.Optional p0, java.lang.Void p1)`
- `protected void printMemberAnnotations(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printMembers(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printModifiers(com.github.javaparser.ast.NodeList p0)`
- `protected void printPrePostFixOptionalList(com.github.javaparser.ast.NodeList p0, java.lang.Void p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `protected void printPrePostFixRequiredList(com.github.javaparser.ast.NodeList p0, java.lang.Void p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `protected void printTypeArgs(com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments p0, java.lang.Void p1)`
- `protected void printTypeParameters(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public java.lang.String toString()`
- `public void visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.Modifier p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.Name p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.VarType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Void p1)`

---

## public class `com.github.javaparser.printer.DotPrinter`

**Constructors:**
- `public DotPrinter(boolean p0)`

**Methods:**
- `public java.lang.String output(com.github.javaparser.ast.Node p0)`
- `public void output(com.github.javaparser.ast.Node p0, java.lang.String p1, java.lang.String p2, java.lang.StringBuilder p3)`

---

## public class `com.github.javaparser.printer.PrettyPrintVisitor`
annotations: @java.lang.Deprecated  
implements `com.github.javaparser.ast.visitor.VoidVisitor<java.lang.Void>`  

**Constructors:**
- `public PrettyPrintVisitor(com.github.javaparser.printer.configuration.PrettyPrinterConfiguration p0)`

**Fields:**
- `protected com.github.javaparser.printer.configuration.PrettyPrinterConfiguration configuration`
- `protected final com.github.javaparser.printer.SourcePrinter printer`

**Methods:**
- `public java.lang.String getSource()`
- `protected void printAnnotations(com.github.javaparser.ast.NodeList p0, boolean p1, java.lang.Void p2)`
- `protected void printArguments(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printComment(java.util.Optional p0, java.lang.Void p1)`
- `protected void printMemberAnnotations(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printMembers(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `protected void printModifiers(com.github.javaparser.ast.NodeList p0)`
- `protected void printPrePostFixOptionalList(com.github.javaparser.ast.NodeList p0, java.lang.Void p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `protected void printPrePostFixRequiredList(com.github.javaparser.ast.NodeList p0, java.lang.Void p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`
- `protected void printTypeArgs(com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments p0, java.lang.Void p1)`
- `protected void printTypeParameters(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public void setConfiguration(com.github.javaparser.printer.configuration.PrettyPrinterConfiguration p0)`
- `public java.lang.String toString()`
- `public void visit(com.github.javaparser.ast.ArrayCreationLevel p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.CompilationUnit p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.ImportDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.Modifier p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.NodeList p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.PackageDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.AnnotationMemberDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.CompactConstructorDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ConstructorDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.EnumConstantDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.EnumDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.FieldDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.InitializerDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.MethodDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.Parameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.ReceiverParameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.RecordDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.body.VariableDeclarator p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.BlockComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.JavadocComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.comments.LineComment p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayAccessExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayCreationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ArrayInitializerExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.AssignExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.BinaryExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.BooleanLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.CastExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.CharLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ClassExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ConditionalExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.DoubleLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.EnclosedExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.FieldAccessExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.InstanceOfExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.IntegerLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.LambdaExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.LongLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MarkerAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MemberValuePair p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodCallExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.MethodReferenceExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.Name p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NameExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NormalAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.NullLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ObjectCreationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.PatternExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SimpleName p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SingleMemberAnnotationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.StringLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SuperExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.SwitchExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.TextBlockLiteralExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.ThisExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.TypeExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.UnaryExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.expr.VariableDeclarationExpr p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleDeclaration p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleExportsDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleOpensDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleProvidesDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleRequiresDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.modules.ModuleUsesDirective p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.AssertStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.BlockStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.BreakStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.CatchClause p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ContinueStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.DoStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.EmptyStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ExpressionStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForEachStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ForStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.IfStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LabeledStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalClassDeclarationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.LocalRecordDeclarationStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ReturnStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchEntry p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SwitchStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.SynchronizedStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.ThrowStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.TryStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.UnparsableStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.WhileStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.stmt.YieldStmt p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.ArrayType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.ClassOrInterfaceType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.IntersectionType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.PrimitiveType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.TypeParameter p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.UnionType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.UnknownType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.VarType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.VoidType p0, java.lang.Void p1)`
- `public void visit(com.github.javaparser.ast.type.WildcardType p0, java.lang.Void p1)`

---

## public class `com.github.javaparser.printer.PrettyPrinter`
annotations: @java.lang.Deprecated  
implements `com.github.javaparser.printer.Printer`  

**Constructors:**
- `public PrettyPrinter()`
- `public PrettyPrinter(com.github.javaparser.printer.configuration.PrettyPrinterConfiguration p0)`
- `public PrettyPrinter(com.github.javaparser.printer.configuration.PrettyPrinterConfiguration p0, java.util.function.Function p1)`

**Methods:**
- `public com.github.javaparser.printer.configuration.PrinterConfiguration getConfiguration()`
- `public java.lang.String print(com.github.javaparser.ast.Node p0)`
- `public com.github.javaparser.printer.Printer setConfiguration(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`

---

## public abstract interface `com.github.javaparser.printer.Printer`

**Methods:**
- `public abstract com.github.javaparser.printer.configuration.PrinterConfiguration getConfiguration()`
- `public abstract java.lang.String print(com.github.javaparser.ast.Node p0)`
- `public abstract com.github.javaparser.printer.Printer setConfiguration(com.github.javaparser.printer.configuration.PrinterConfiguration p0)`

---

## public class `com.github.javaparser.printer.SourcePrinter`

**Methods:**
- `public void duplicateIndent()`
- `public com.github.javaparser.Position getCursor()`
- `public java.lang.String getSource()`
- `public com.github.javaparser.printer.SourcePrinter indent()`
- `public com.github.javaparser.printer.SourcePrinter indentWithAlignTo(int p0)`
- `public java.lang.String normalizeEolInTextBlock(java.lang.String p0)`
- `public com.github.javaparser.printer.SourcePrinter print(java.lang.String p0)`
- `public com.github.javaparser.printer.SourcePrinter println()`
- `public com.github.javaparser.printer.SourcePrinter println(java.lang.String p0)`
- `public void reindentToPreviousLevel()`
- `public void reindentWithAlignToCursor()`
- `public java.lang.String toString()`
- `public com.github.javaparser.printer.SourcePrinter unindent()`

---

## public abstract interface `com.github.javaparser.printer.Stringable`

**Methods:**
- `public abstract java.lang.String asString()`

---

## public class `com.github.javaparser.printer.XmlPrinter`

**Constructors:**
- `public XmlPrinter(boolean p0)`

**Methods:**
- `public java.lang.String output(com.github.javaparser.ast.Node p0)`
- `public void output(com.github.javaparser.ast.Node p0, java.lang.String p1, int p2, java.lang.StringBuilder p3)`
- `public static void print(com.github.javaparser.ast.Node p0)`

---

## public class `com.github.javaparser.printer.YamlPrinter`

**Constructors:**
- `public YamlPrinter(boolean p0)`

**Methods:**
- `public java.lang.String output(com.github.javaparser.ast.Node p0)`
- `public void output(com.github.javaparser.ast.Node p0, java.lang.String p1, int p2, java.lang.StringBuilder p3)`
- `public static void print(com.github.javaparser.ast.Node p0)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmAttribute`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmAttribute(com.github.javaparser.ast.observer.ObservableProperty p0)`

**Methods:**
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public int getTokenType(com.github.javaparser.ast.Node p0, java.lang.String p1, java.lang.String p2)`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmChar`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmChar(com.github.javaparser.ast.observer.ObservableProperty p0)`

**Methods:**
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmComment`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmComment()`

**Methods:**
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmConditional`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmConditional(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2)`
- `public CsmConditional(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3)`
- `public CsmConditional(java.util.List p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3)`

**Methods:**
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition getCondition()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getElseElement()`
- `public java.util.List getProperties()`
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getThenElement()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public final static enum `com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition FLAG`
- `public final static com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition IS_EMPTY`
- `public final static com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition IS_NOT_EMPTY`
- `public final static com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition IS_PRESENT`

---

## public abstract interface `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`

**Methods:**
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement attribute(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement block(com.github.javaparser.printer.concretesyntaxmodel.CsmElement p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement charToken(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement child(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement comma()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement comment()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement conditional(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement conditional(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement conditional(java.util.List p0, com.github.javaparser.printer.concretesyntaxmodel.CsmConditional$Condition p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement indent()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement list(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement list(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p1)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement list(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement list(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p4)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement newline()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement newline(com.github.javaparser.utils.LineSeparator p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement none()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement orphanCommentsBeforeThis()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement orphanCommentsEnding()`
- `public abstract void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement semicolon()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement sequence(com.github.javaparser.printer.concretesyntaxmodel.CsmElement... p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement space()`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement string(int p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement string(int p0, java.lang.String p1)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement stringToken(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement textBlockToken(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement token(int p0)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement token(int p0, com.github.javaparser.printer.concretesyntaxmodel.CsmToken$TokenContentCalculator p1)`
- `public static com.github.javaparser.printer.concretesyntaxmodel.CsmElement unindent()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmIndent`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmIndent()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmList`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmList(com.github.javaparser.ast.observer.ObservableProperty p0)`
- `public CsmList(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p1)`
- `public CsmList(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p1, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p2, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p3, com.github.javaparser.printer.concretesyntaxmodel.CsmElement p4)`

**Methods:**
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getFollowing()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getPreceeding()`
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getSeparatorPost()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getSeparatorPre()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmMix`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmMix(java.util.List p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getElements()`
- `public int hashCode()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmNone`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmNone()`

**Methods:**
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmOrphanCommentsEnding`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmOrphanCommentsEnding()`

**Methods:**
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmSequence`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmSequence(java.util.List p0)`

**Methods:**
- `public java.util.List getElements()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmSingleReference`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmSingleReference(com.github.javaparser.ast.observer.ObservableProperty p0)`

**Methods:**
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmString`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmString(com.github.javaparser.ast.observer.ObservableProperty p0)`

**Methods:**
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmTextBlock`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmTextBlock(com.github.javaparser.ast.observer.ObservableProperty p0)`

**Methods:**
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmToken`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmToken(int p0)`
- `public CsmToken(int p0, com.github.javaparser.printer.concretesyntaxmodel.CsmToken$TokenContentCalculator p1)`
- `public CsmToken(int p0, java.lang.String p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getContent(com.github.javaparser.ast.Node p0)`
- `public int getTokenType()`
- `public int hashCode()`
- `public boolean isNewLine()`
- `public boolean isWhiteSpace()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`
- `public java.lang.String toString()`

---

## public abstract static interface `com.github.javaparser.printer.concretesyntaxmodel.CsmToken$TokenContentCalculator`

**Methods:**
- `public abstract java.lang.String calculate(com.github.javaparser.ast.Node p0)`

---

## public class `com.github.javaparser.printer.concretesyntaxmodel.CsmUnindent`
implements `com.github.javaparser.printer.concretesyntaxmodel.CsmElement`  

**Constructors:**
- `public CsmUnindent()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public void prettyPrint(com.github.javaparser.ast.Node p0, com.github.javaparser.printer.SourcePrinter p1)`

---

## public abstract interface `com.github.javaparser.printer.configuration.ConfigurationOption`

**Methods:**
- `public abstract java.lang.Boolean asBoolean()`
- `public abstract java.lang.Integer asInteger()`
- `public abstract java.lang.String asString()`
- `public abstract <T extends java.lang.Object> T asValue()`
- `public abstract boolean hasValue()`
- `public abstract com.github.javaparser.printer.configuration.ConfigurationOption value(java.lang.Object p0)`

---

## public class `com.github.javaparser.printer.configuration.DefaultConfigurationOption`
implements `com.github.javaparser.printer.configuration.ConfigurationOption`  

**Constructors:**
- `public DefaultConfigurationOption(com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption p0)`
- `public DefaultConfigurationOption(com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption p0, java.lang.Object p1)`

**Methods:**
- `public java.lang.Boolean asBoolean()`
- `public java.lang.Integer asInteger()`
- `public java.lang.String asString()`
- `public <T extends java.lang.Object> T asValue()`
- `public boolean equals(java.lang.Object p0)`
- `public boolean hasValue()`
- `public int hashCode()`
- `public com.github.javaparser.printer.configuration.ConfigurationOption value(java.lang.Object p0)`

---

## public class `com.github.javaparser.printer.configuration.DefaultPrinterConfiguration`
implements `com.github.javaparser.printer.configuration.PrinterConfiguration`  

**Constructors:**
- `public DefaultPrinterConfiguration()`

**Methods:**
- `public com.github.javaparser.printer.configuration.PrinterConfiguration addOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public java.util.Set get()`
- `public java.util.Optional get(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public boolean isActivated(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public com.github.javaparser.printer.configuration.PrinterConfiguration removeOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`

---

## public final static enum `com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption COLUMN_ALIGN_FIRST_METHOD_CHAIN`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption COLUMN_ALIGN_PARAMETERS`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption END_OF_LINE_CHARACTER`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption INDENTATION`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption INDENT_CASE_IN_SWITCH`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption MAX_ENUM_CONSTANTS_TO_ALIGN_HORIZONTALLY`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption ORDER_IMPORTS`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption PRINT_COMMENTS`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption PRINT_JAVADOC`
- `public final static com.github.javaparser.printer.configuration.DefaultPrinterConfiguration$ConfigOption SPACE_AROUND_OPERATORS`

---

## public class `com.github.javaparser.printer.configuration.Indentation`

**Constructors:**
- `public Indentation(com.github.javaparser.printer.configuration.Indentation$IndentType p0)`
- `public Indentation(com.github.javaparser.printer.configuration.Indentation$IndentType p0, int p1)`

**Methods:**
- `public java.lang.String getIndent()`
- `public int getSize()`
- `public com.github.javaparser.printer.configuration.Indentation$IndentType getType()`
- `public com.github.javaparser.printer.configuration.Indentation setSize(int p0)`
- `public com.github.javaparser.printer.configuration.Indentation setType(com.github.javaparser.printer.configuration.Indentation$IndentType p0)`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javaparser.printer.configuration.Indentation$IndentType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.printer.configuration.Indentation$IndentType SPACES`
- `public final static com.github.javaparser.printer.configuration.Indentation$IndentType TABS`
- `public final static com.github.javaparser.printer.configuration.Indentation$IndentType TABS_WITH_SPACE_ALIGN`

**Methods:**
- `public java.lang.Character getCar()`
- `public int getWidth()`

---

## public class `com.github.javaparser.printer.configuration.PrettyPrinterConfiguration`
annotations: @java.lang.Deprecated  
implements `com.github.javaparser.printer.configuration.PrinterConfiguration`  

**Constructors:**
- `public PrettyPrinterConfiguration()`

**Methods:**
- `public com.github.javaparser.printer.configuration.PrinterConfiguration addOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public java.util.Set get()`
- `public java.util.Optional get(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public java.lang.String getEndOfLineCharacter()`
- `public java.lang.String getIndent()`
- `public int getIndentSize()`
- `public com.github.javaparser.printer.configuration.Indentation$IndentType getIndentType()`
- `public com.github.javaparser.printer.configuration.Indentation getIndentation()`
- `public int getMaxEnumConstantsToAlignHorizontally()`
- `public int getTabWidth()`
- `public boolean isActivated(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public boolean isColumnAlignFirstMethodChain()`
- `public boolean isColumnAlignParameters()`
- `public boolean isIgnoreComments()`
- `public boolean isIndentCaseInSwitch()`
- `public boolean isOrderImports()`
- `public boolean isPrintComments()`
- `public boolean isPrintJavadoc()`
- `public boolean isSpaceAroundOperators()`
- `public com.github.javaparser.printer.configuration.PrinterConfiguration removeOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setColumnAlignFirstMethodChain(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setColumnAlignParameters(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setEndOfLineCharacter(java.lang.String p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setIndentCaseInSwitch(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setIndentSize(int p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setIndentType(com.github.javaparser.printer.configuration.Indentation$IndentType p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setIndentation(com.github.javaparser.printer.configuration.Indentation p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setMaxEnumConstantsToAlignHorizontally(int p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setOrderImports(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setPrintComments(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setPrintJavadoc(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setSpaceAroundOperators(boolean p0)`
- `public com.github.javaparser.printer.configuration.PrettyPrinterConfiguration setTabWidth(int p0)`

---

## public abstract interface `com.github.javaparser.printer.configuration.PrinterConfiguration`

**Methods:**
- `public abstract com.github.javaparser.printer.configuration.PrinterConfiguration addOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public abstract java.util.Set get()`
- `public abstract java.util.Optional get(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public abstract boolean isActivated(com.github.javaparser.printer.configuration.ConfigurationOption p0)`
- `public abstract com.github.javaparser.printer.configuration.PrinterConfiguration removeOption(com.github.javaparser.printer.configuration.ConfigurationOption p0)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.Added`
implements `com.github.javaparser.printer.lexicalpreservation.DifferenceElement`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getElement()`
- `public int hashCode()`
- `public boolean isAdded()`
- `public boolean isIndent()`
- `public boolean isRemoved()`
- `public boolean isUnindent()`
- `public java.lang.String toString()`
- `public com.github.javaparser.printer.lexicalpreservation.TextElement toTextElement()`

---

## public class `com.github.javaparser.printer.lexicalpreservation.Difference`

**Fields:**
- `public final static int STANDARD_INDENTATION_SIZE`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract interface `com.github.javaparser.printer.lexicalpreservation.DifferenceElement`

**Methods:**
- `public static com.github.javaparser.printer.lexicalpreservation.DifferenceElement added(com.github.javaparser.printer.concretesyntaxmodel.CsmElement p0)`
- `public abstract com.github.javaparser.printer.concretesyntaxmodel.CsmElement getElement()`
- `public abstract boolean isAdded()`
- `public default boolean isChild()`
- `public abstract boolean isRemoved()`
- `public static com.github.javaparser.printer.lexicalpreservation.DifferenceElement kept(com.github.javaparser.printer.concretesyntaxmodel.CsmElement p0)`
- `public static com.github.javaparser.printer.lexicalpreservation.DifferenceElement removed(com.github.javaparser.printer.concretesyntaxmodel.CsmElement p0)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.Kept`
implements `com.github.javaparser.printer.lexicalpreservation.DifferenceElement`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getElement()`
- `public int getTokenType()`
- `public int hashCode()`
- `public boolean isAdded()`
- `public boolean isIndent()`
- `public boolean isNewLine()`
- `public boolean isPrimitiveType()`
- `public boolean isRemoved()`
- `public boolean isToken()`
- `public boolean isUnindent()`
- `public boolean isWhiteSpace()`
- `public boolean isWhiteSpaceOrComment()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter`

**Constructors:**
- `public LexicalPreservingPrinter()`

**Fields:**
- `public final static com.github.javaparser.ast.DataKey NODE_TEXT_DATA`

**Methods:**
- `public static java.lang.String print(com.github.javaparser.ast.Node p0)`
- `public static void print(com.github.javaparser.ast.Node p0, java.io.Writer p1) throws java.io.IOException`
- `public static <N extends com.github.javaparser.ast.Node> N setup(N p0)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.PhantomNodeLogic`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public PhantomNodeLogic()`

**Methods:**
- `public static void cleanUpCache()`

---

## public class `com.github.javaparser.printer.lexicalpreservation.Removed`
implements `com.github.javaparser.printer.lexicalpreservation.DifferenceElement`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.ast.Node getChild()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmElement getElement()`
- `public int getTokenType()`
- `public int hashCode()`
- `public boolean isAdded()`
- `public boolean isNewLine()`
- `public boolean isPrimitiveType()`
- `public boolean isRemoved()`
- `public boolean isToken()`
- `public boolean isWhiteSpace()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.printer.lexicalpreservation.Reshuffled`
implements `com.github.javaparser.printer.lexicalpreservation.DifferenceElement`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmMix getElement()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmMix getNextOrder()`
- `public com.github.javaparser.printer.concretesyntaxmodel.CsmMix getPreviousOrder()`
- `public int hashCode()`
- `public boolean isAdded()`
- `public boolean isRemoved()`
- `public java.lang.String toString()`

---

## public abstract class `com.github.javaparser.printer.lexicalpreservation.TextElement`
implements `com.github.javaparser.printer.lexicalpreservation.TextElementMatcher`  

**Constructors:**
- `public TextElement()`

**Methods:**
- `public boolean isChild()`
- `public abstract boolean isChildOfClass(java.lang.Class p0)`
- `public abstract boolean isComment()`
- `public abstract boolean isIdentifier()`
- `public abstract boolean isKeyword()`
- `public abstract boolean isLiteral()`
- `public abstract boolean isNewline()`
- `public abstract boolean isPrimitive()`
- `public abstract boolean isSeparator()`
- `public abstract boolean isSpaceOrTab()`
- `public abstract boolean isWhiteSpace()`
- `public final boolean isWhiteSpaceOrComment()`
- `public boolean match(com.github.javaparser.printer.lexicalpreservation.TextElement p0)`

---

## public abstract interface `com.github.javaparser.printer.lexicalpreservation.TextElementMatcher`

**Methods:**
- `public default com.github.javaparser.printer.lexicalpreservation.TextElementMatcher and(com.github.javaparser.printer.lexicalpreservation.TextElementMatcher p0)`
- `public abstract boolean match(com.github.javaparser.printer.lexicalpreservation.TextElement p0)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.WrappingRangeIterator`
implements `java.util.Iterator<java.lang.Integer>`  

**Constructors:**
- `public WrappingRangeIterator(int p0)`

**Methods:**
- `public boolean hasNext()`
- `public java.lang.Integer next()`

---

## public abstract interface `com.github.javaparser.printer.lexicalpreservation.changes.Change`

**Methods:**
- `public default boolean evaluate(com.github.javaparser.printer.concretesyntaxmodel.CsmConditional p0, com.github.javaparser.ast.Node p1)`
- `public abstract java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.changes.ListAdditionChange`
implements `com.github.javaparser.printer.lexicalpreservation.changes.Change`  

**Constructors:**
- `public ListAdditionChange(com.github.javaparser.ast.observer.ObservableProperty p0, int p1, com.github.javaparser.ast.Node p2)`

**Methods:**
- `public java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.changes.ListRemovalChange`
implements `com.github.javaparser.printer.lexicalpreservation.changes.Change`  

**Constructors:**
- `public ListRemovalChange(com.github.javaparser.ast.observer.ObservableProperty p0, int p1)`

**Methods:**
- `public java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.changes.ListReplacementChange`
implements `com.github.javaparser.printer.lexicalpreservation.changes.Change`  

**Constructors:**
- `public ListReplacementChange(com.github.javaparser.ast.observer.ObservableProperty p0, int p1, com.github.javaparser.ast.Node p2)`

**Methods:**
- `public java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.changes.NoChange`
implements `com.github.javaparser.printer.lexicalpreservation.changes.Change`  

**Constructors:**
- `public NoChange()`

**Methods:**
- `public java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.printer.lexicalpreservation.changes.PropertyChange`
implements `com.github.javaparser.printer.lexicalpreservation.changes.Change`  

**Constructors:**
- `public PropertyChange(com.github.javaparser.ast.observer.ObservableProperty p0, java.lang.Object p1, java.lang.Object p2)`

**Methods:**
- `public java.lang.Object getNewValue()`
- `public java.lang.Object getOldValue()`
- `public com.github.javaparser.ast.observer.ObservableProperty getProperty()`
- `public java.lang.Object getValue(com.github.javaparser.ast.observer.ObservableProperty p0, com.github.javaparser.ast.Node p1)`

---

## public class `com.github.javaparser.resolution.MethodAmbiguityException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public MethodAmbiguityException(java.lang.String p0)`

---

## public class `com.github.javaparser.resolution.MethodUsage`
implements `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametrized`  

**Constructors:**
- `public MethodUsage(com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration p0)`
- `public MethodUsage(com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration p0, java.util.List p1, com.github.javaparser.resolution.types.ResolvedType p2)`
- `public MethodUsage(com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration p0, java.util.List p1, com.github.javaparser.resolution.types.ResolvedType p2, java.util.List p3)`

**Methods:**
- `public com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration declaringType()`
- `public java.util.List exceptionTypes()`
- `public com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration getDeclaration()`
- `public java.lang.String getName()`
- `public int getNoParams()`
- `public com.github.javaparser.resolution.types.ResolvedType getParamType(int p0)`
- `public java.util.List getParamTypes()`
- `public java.lang.String getQualifiedSignature()`
- `public java.lang.String getSignature()`
- `public com.github.javaparser.resolution.MethodUsage replaceExceptionType(int p0, com.github.javaparser.resolution.types.ResolvedType p1)`
- `public com.github.javaparser.resolution.MethodUsage replaceParamType(int p0, com.github.javaparser.resolution.types.ResolvedType p1)`
- `public com.github.javaparser.resolution.MethodUsage replaceReturnType(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.MethodUsage replaceTypeParameter(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1)`
- `public com.github.javaparser.resolution.types.ResolvedType returnType()`
- `public java.lang.String toString()`
- `public com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap typeParametersMap()`

---

## public abstract interface `com.github.javaparser.resolution.Resolvable`<T extends java.lang.Object>

**Methods:**
- `public abstract T resolve()`

---

## public abstract interface `com.github.javaparser.resolution.SymbolResolver`

**Methods:**
- `public abstract com.github.javaparser.resolution.types.ResolvedType calculateType(com.github.javaparser.ast.expr.Expression p0)`
- `public abstract <T extends java.lang.Object> T resolveDeclaration(com.github.javaparser.ast.Node p0, java.lang.Class p1)`
- `public abstract <T extends java.lang.Object> T toResolvedType(com.github.javaparser.ast.type.Type p0, java.lang.Class p1)`

---

## public class `com.github.javaparser.resolution.UnsolvedSymbolException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public UnsolvedSymbolException(java.lang.String p0)`
- `public UnsolvedSymbolException(java.lang.String p0, java.lang.String p1)`
- `public UnsolvedSymbolException(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2)`
- `public UnsolvedSymbolException(java.lang.String p0, java.lang.Throwable p1)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String toString()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.AssociableToAST`<N extends com.github.javaparser.ast.Node>

**Methods:**
- `public default java.util.Optional toAst()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.HasAccessSpecifier`

**Methods:**
- `public abstract com.github.javaparser.ast.AccessSpecifier accessSpecifier()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.body.AnnotationDeclaration>`, `com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration asAnnotation()`
- `public abstract java.util.List getAnnotationMembers()`
- `public default boolean isAnnotation()`
- `public abstract boolean isInheritable()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedAnnotationMemberDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`  

**Methods:**
- `public abstract com.github.javaparser.ast.expr.Expression getDefaultValue()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedClassDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.Node>`, `com.github.javaparser.resolution.declarations.HasAccessSpecifier`, `com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration`, `com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable`  

**Methods:**
- `public abstract java.util.List getAllInterfaces()`
- `public abstract java.util.List getAllSuperClasses()`
- `public abstract java.util.List getConstructors()`
- `public abstract java.util.List getInterfaces()`
- `public abstract java.util.Optional getSuperClass()`
- `public default boolean isClass()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.body.ConstructorDeclaration>`, `com.github.javaparser.resolution.declarations.ResolvedMethodLikeDeclaration`  

**Methods:**
- `public abstract com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration declaringType()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedDeclaration`

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration asEnumConstant()`
- `public default com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration asField()`
- `public default com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration asMethod()`
- `public default com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration asParameter()`
- `public default com.github.javaparser.resolution.declarations.ResolvedPatternDeclaration asPattern()`
- `public default com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration asType()`
- `public abstract java.lang.String getName()`
- `public default boolean hasName()`
- `public default boolean isEnumConstant()`
- `public default boolean isField()`
- `public default boolean isMethod()`
- `public default boolean isParameter()`
- `public default boolean isPattern()`
- `public default boolean isType()`
- `public default boolean isVariable()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration asEnumConstant()`
- `public abstract java.lang.String getName()`
- `public default boolean isEnumConstant()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedEnumDeclaration`
implements `com.github.javaparser.resolution.declarations.HasAccessSpecifier`, `com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedEnumDeclaration asEnum()`
- `public default com.github.javaparser.resolution.declarations.ResolvedEnumConstantDeclaration getEnumConstant(java.lang.String p0)`
- `public abstract java.util.List getEnumConstants()`
- `public default boolean hasEnumConstant(java.lang.String p0)`
- `public default boolean isEnum()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.body.FieldDeclaration>`, `com.github.javaparser.resolution.declarations.HasAccessSpecifier`, `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration asField()`
- `public abstract com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration declaringType()`
- `public default boolean isField()`
- `public abstract boolean isStatic()`
- `public abstract boolean isVolatile()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedInterfaceDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.body.ClassOrInterfaceDeclaration>`, `com.github.javaparser.resolution.declarations.HasAccessSpecifier`, `com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration`, `com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable`  

**Methods:**
- `public default java.util.List getAllInterfacesExtended()`
- `public abstract java.util.List getInterfacesExtended()`
- `public default boolean isInterface()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration`
implements `com.github.javaparser.resolution.declarations.AssociableToAST<com.github.javaparser.ast.body.MethodDeclaration>`, `com.github.javaparser.resolution.declarations.ResolvedMethodLikeDeclaration`  

**Methods:**
- `public abstract com.github.javaparser.resolution.types.ResolvedType getReturnType()`
- `public abstract boolean isAbstract()`
- `public abstract boolean isDefaultMethod()`
- `public abstract boolean isStatic()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedMethodLikeDeclaration`
implements `com.github.javaparser.resolution.declarations.HasAccessSpecifier`, `com.github.javaparser.resolution.declarations.ResolvedDeclaration`, `com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable`  

**Methods:**
- `public abstract com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration declaringType()`
- `public default java.util.Optional findTypeParameter(java.lang.String p0)`
- `public default java.lang.String getClassName()`
- `public default com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration getLastParam()`
- `public abstract int getNumberOfParams()`
- `public abstract int getNumberOfSpecifiedExceptions()`
- `public default java.lang.String getPackageName()`
- `public abstract com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration getParam(int p0)`
- `public default java.lang.String getQualifiedName()`
- `public default java.lang.String getQualifiedSignature()`
- `public default java.lang.String getSignature()`
- `public abstract com.github.javaparser.resolution.types.ResolvedType getSpecifiedException(int p0)`
- `public default java.util.List getSpecifiedExceptions()`
- `public default boolean hasVariadicParameter()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedParameterDeclaration asParameter()`
- `public default java.lang.String describeType()`
- `public default boolean hasName()`
- `public default boolean isParameter()`
- `public abstract boolean isVariadic()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedPatternDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedPatternDeclaration asPattern()`
- `public default java.lang.String describeType()`
- `public default boolean hasName()`
- `public default boolean isPattern()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration`, `com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable`  

**Fields:**
- `public final static java.lang.String JAVA_LANG_ENUM`
- `public final static java.lang.String JAVA_LANG_OBJECT`
- `public final static java.util.function.Function breadthFirstFunc`
- `public final static java.util.function.Function depthFirstFunc`

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration asReferenceType()`
- `public default boolean canBeAssignedTo(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0)`
- `public default java.util.Optional findTypeParameter(java.lang.String p0)`
- `public default java.util.List getAllAncestors()`
- `public default java.util.List getAllAncestors(java.util.function.Function p0)`
- `public abstract java.util.List getAllFields()`
- `public abstract java.util.Set getAllMethods()`
- `public default java.util.List getAllNonStaticFields()`
- `public default java.util.List getAllStaticFields()`
- `public default java.util.List getAncestors()`
- `public abstract java.util.List getAncestors(boolean p0)`
- `public abstract java.util.List getConstructors()`
- `public default java.util.List getDeclaredFields()`
- `public abstract java.util.Set getDeclaredMethods()`
- `public default com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration getField(java.lang.String p0)`
- `public default com.github.javaparser.resolution.declarations.ResolvedFieldDeclaration getVisibleField(java.lang.String p0)`
- `public default java.util.List getVisibleFields()`
- `public default boolean hasAnnotation(java.lang.String p0)`
- `public abstract boolean hasDirectlyAnnotation(java.lang.String p0)`
- `public default boolean hasField(java.lang.String p0)`
- `public default boolean hasVisibleField(java.lang.String p0)`
- `public abstract boolean isAssignableBy(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0)`
- `public abstract boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public abstract boolean isFunctionalInterface()`
- `public default boolean isJavaLangEnum()`
- `public default boolean isJavaLangObject()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedDeclaration`  

**Methods:**
- `public default com.github.javaparser.resolution.declarations.ResolvedAnnotationDeclaration asAnnotation()`
- `public default com.github.javaparser.resolution.declarations.ResolvedClassDeclaration asClass()`
- `public default com.github.javaparser.resolution.declarations.ResolvedEnumDeclaration asEnum()`
- `public default com.github.javaparser.resolution.declarations.ResolvedInterfaceDeclaration asInterface()`
- `public default com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration asReferenceType()`
- `public default com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration asType()`
- `public default com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration asTypeParameter()`
- `public abstract java.util.Optional containerType()`
- `public abstract java.lang.String getClassName()`
- `public default java.lang.String getId()`
- `public default com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration getInternalType(java.lang.String p0)`
- `public abstract java.lang.String getPackageName()`
- `public abstract java.lang.String getQualifiedName()`
- `public default boolean hasInternalType(java.lang.String p0)`
- `public default java.util.Set internalTypes()`
- `public default boolean isAnnotation()`
- `public default boolean isAnonymousClass()`
- `public default boolean isClass()`
- `public default boolean isEnum()`
- `public default boolean isInterface()`
- `public default boolean isType()`
- `public default boolean isTypeParameter()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration`  

**Methods:**
- `public default boolean declaredOnConstructor()`
- `public default boolean declaredOnMethod()`
- `public default boolean declaredOnType()`
- `public abstract java.util.List getBounds()`
- `public default java.lang.String getClassName()`
- `public abstract com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable getContainer()`
- `public abstract java.lang.String getContainerId()`
- `public abstract java.lang.String getContainerQualifiedName()`
- `public default com.github.javaparser.resolution.types.ResolvedType getLowerBound()`
- `public abstract java.lang.String getName()`
- `public default java.lang.String getPackageName()`
- `public default java.lang.String getQualifiedName()`
- `public default com.github.javaparser.resolution.types.ResolvedType getUpperBound()`
- `public default boolean hasLowerBound()`
- `public default boolean hasUpperBound()`
- `public default boolean isBounded()`
- `public default boolean isUnbounded()`
- `public abstract com.github.javaparser.resolution.types.ResolvedReferenceType object()`
- `public static com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration onType(java.lang.String p0, java.lang.String p1, java.util.List p2)`

---

## public static class `com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration$Bound`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration$Bound extendsBound(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.types.ResolvedType getType()`
- `public int hashCode()`
- `public boolean isExtends()`
- `public boolean isSuper()`
- `public static com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration$Bound superBound(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedTypeParametrizable`

**Methods:**
- `public abstract java.util.Optional findTypeParameter(java.lang.String p0)`
- `public abstract java.util.List getTypeParameters()`
- `public default boolean isGeneric()`

---

## public abstract interface `com.github.javaparser.resolution.declarations.ResolvedValueDeclaration`
implements `com.github.javaparser.resolution.declarations.ResolvedDeclaration`  

**Methods:**
- `public abstract com.github.javaparser.resolution.types.ResolvedType getType()`

---

## public class `com.github.javaparser.resolution.types.ResolvedArrayType`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Constructors:**
- `public ResolvedArrayType(com.github.javaparser.resolution.types.ResolvedType p0)`

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedArrayType asArrayType()`
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.resolution.types.ResolvedType erasure()`
- `public com.github.javaparser.resolution.types.ResolvedType getComponentType()`
- `public int hashCode()`
- `public boolean isArray()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.resolution.types.ResolvedIntersectionType`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Constructors:**
- `public ResolvedIntersectionType(java.util.Collection p0)`

**Methods:**
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`

---

## public class `com.github.javaparser.resolution.types.ResolvedLambdaConstraintType`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedLambdaConstraintType asConstraintType()`
- `public static com.github.javaparser.resolution.types.ResolvedLambdaConstraintType bound(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public java.lang.String describe()`
- `public com.github.javaparser.resolution.types.ResolvedType getBound()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isConstraint()`
- `public java.lang.String toString()`

---

## public final enum `com.github.javaparser.resolution.types.ResolvedPrimitiveType`
extends `java.lang.Enum`  
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Fields:**
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType BOOLEAN`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType BYTE`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType CHAR`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType DOUBLE`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType FLOAT`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType INT`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType LONG`
- `public final static com.github.javaparser.resolution.types.ResolvedPrimitiveType SHORT`

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedPrimitiveType asPrimitive()`
- `public com.github.javaparser.resolution.types.ResolvedPrimitiveType bnp(com.github.javaparser.resolution.types.ResolvedPrimitiveType p0)`
- `public static com.github.javaparser.resolution.types.ResolvedType byName(java.lang.String p0)`
- `public java.lang.String describe()`
- `public java.lang.String getBoxTypeQName()`
- `public static com.github.javaparser.resolution.types.ResolvedPrimitiveType[] getNumericPrimitiveTypes()`
- `public boolean in(com.github.javaparser.resolution.types.ResolvedPrimitiveType[] p0)`
- `public boolean isArray()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isBoolean()`
- `public boolean isNumeric()`
- `public boolean isPrimitive()`
- `public boolean isReferenceType()`
- `public boolean isTypeVariable()`
- `public java.lang.String toString()`
- `public static com.github.javaparser.resolution.types.ResolvedType unp(com.github.javaparser.resolution.types.ResolvedType p0)`

---

## public abstract class `com.github.javaparser.resolution.types.ResolvedReferenceType`
implements `com.github.javaparser.resolution.types.ResolvedType`, `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParameterValueProvider`, `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametrized`  

**Constructors:**
- `public ResolvedReferenceType(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0)`
- `public ResolvedReferenceType(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0, java.util.List p1)`

**Fields:**
- `protected static java.lang.String JAVA_LANG_ENUM`
- `protected static java.lang.String JAVA_LANG_OBJECT`
- `protected com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration typeDeclaration`
- `protected com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap typeParametersMap`

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedReferenceType asReferenceType()`
- `protected boolean compareConsideringTypeParameters(com.github.javaparser.resolution.types.ResolvedReferenceType p0)`
- `protected abstract com.github.javaparser.resolution.types.ResolvedReferenceType create(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0)`
- `protected com.github.javaparser.resolution.types.ResolvedReferenceType create(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0, com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap p1)`
- `protected abstract com.github.javaparser.resolution.types.ResolvedReferenceType create(com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration p0, java.util.List p1)`
- `public abstract com.github.javaparser.resolution.types.ResolvedReferenceType deriveTypeParameters(com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap p0)`
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.resolution.types.ResolvedType erasure()`
- `public abstract java.util.List getAllAncestors()`
- `public final java.util.List getAllClassesAncestors()`
- `public java.util.List getAllFieldsVisibleToInheritors()`
- `public final java.util.List getAllInterfacesAncestors()`
- `public java.util.List getAllMethods()`
- `public java.util.List getAllMethodsVisibleToInheritors()`
- `public abstract java.util.Set getDeclaredFields()`
- `public abstract java.util.Set getDeclaredMethods()`
- `public abstract java.util.List getDirectAncestors()`
- `public java.util.Optional getFieldType(java.lang.String p0)`
- `public java.util.Optional getGenericParameterByName(java.lang.String p0)`
- `public java.lang.String getId()`
- `public java.lang.String getQualifiedName()`
- `public final java.util.Optional getTypeDeclaration()`
- `public java.util.List getTypeParametersMap()`
- `public boolean hasName()`
- `public int hashCode()`
- `public abstract boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `protected boolean isCorrespondingBoxingType(java.lang.String p0)`
- `public boolean isJavaLangEnum()`
- `public boolean isJavaLangObject()`
- `public boolean isRawType()`
- `public final boolean isReferenceType()`
- `public boolean isUnboxable()`
- `public boolean isUnboxableTo(com.github.javaparser.resolution.types.ResolvedPrimitiveType p0)`
- `public com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`
- `public abstract com.github.javaparser.resolution.types.ResolvedType toRawType()`
- `public java.lang.String toString()`
- `public java.util.Optional toUnboxedType()`
- `public abstract com.github.javaparser.resolution.types.ResolvedType transformTypeParameters(com.github.javaparser.resolution.types.ResolvedTypeTransformer p0)`
- `public java.util.Optional typeParamValue(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0)`
- `public com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap typeParametersMap()`
- `public java.util.List typeParametersValues()`

---

## public abstract interface `com.github.javaparser.resolution.types.ResolvedType`

**Methods:**
- `public default int arrayLevel()`
- `public default com.github.javaparser.resolution.types.ResolvedArrayType asArrayType()`
- `public default com.github.javaparser.resolution.types.ResolvedLambdaConstraintType asConstraintType()`
- `public default com.github.javaparser.resolution.types.ResolvedPrimitiveType asPrimitive()`
- `public default com.github.javaparser.resolution.types.ResolvedReferenceType asReferenceType()`
- `public default com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration asTypeParameter()`
- `public default com.github.javaparser.resolution.types.ResolvedTypeVariable asTypeVariable()`
- `public default com.github.javaparser.resolution.types.ResolvedUnionType asUnionType()`
- `public default com.github.javaparser.resolution.types.ResolvedWildcard asWildcard()`
- `public abstract java.lang.String describe()`
- `public default com.github.javaparser.resolution.types.ResolvedType erasure()`
- `public default boolean isArray()`
- `public abstract boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public default boolean isConstraint()`
- `public default boolean isInferenceVariable()`
- `public default boolean isNull()`
- `public default boolean isNumericType()`
- `public default boolean isPrimitive()`
- `public default boolean isReference()`
- `public default boolean isReferenceType()`
- `public default boolean isTypeVariable()`
- `public default boolean isUnionType()`
- `public default boolean isVoid()`
- `public default boolean isWildcard()`
- `public default boolean mention(java.util.List p0)`
- `public default com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1)`
- `public default com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`

---

## public abstract interface `com.github.javaparser.resolution.types.ResolvedTypeTransformer`
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract com.github.javaparser.resolution.types.ResolvedType transform(com.github.javaparser.resolution.types.ResolvedType p0)`

---

## public class `com.github.javaparser.resolution.types.ResolvedTypeVariable`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Constructors:**
- `public ResolvedTypeVariable(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0)`

**Methods:**
- `public com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration asTypeParameter()`
- `public com.github.javaparser.resolution.types.ResolvedTypeVariable asTypeVariable()`
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public com.github.javaparser.resolution.types.ResolvedType erasure()`
- `public int hashCode()`
- `public boolean isArray()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isPrimitive()`
- `public boolean isReferenceType()`
- `public boolean isTypeVariable()`
- `public boolean mention(java.util.List p0)`
- `public java.lang.String qualifiedName()`
- `public com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.resolution.types.ResolvedUnionType`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Constructors:**
- `public ResolvedUnionType(java.util.List p0)`

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedUnionType asUnionType()`
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Optional getCommonAncestor()`
- `public int hashCode()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isUnionType()`

---

## public class `com.github.javaparser.resolution.types.ResolvedVoidType`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Fields:**
- `public final static com.github.javaparser.resolution.types.ResolvedType INSTANCE`

**Methods:**
- `public java.lang.String describe()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isVoid()`

---

## public class `com.github.javaparser.resolution.types.ResolvedWildcard`
implements `com.github.javaparser.resolution.types.ResolvedType`  

**Fields:**
- `public static com.github.javaparser.resolution.types.ResolvedWildcard UNBOUNDED`

**Methods:**
- `public com.github.javaparser.resolution.types.ResolvedWildcard asWildcard()`
- `public java.lang.String describe()`
- `public boolean equals(java.lang.Object p0)`
- `public static com.github.javaparser.resolution.types.ResolvedWildcard extendsBound(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.types.ResolvedType getBoundedType()`
- `public int hashCode()`
- `public boolean isAssignableBy(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public boolean isBounded()`
- `public boolean isExtends()`
- `public boolean isLowerBounded()`
- `public boolean isSuper()`
- `public boolean isUpperBounded()`
- `public boolean isWildcard()`
- `public boolean mention(java.util.List p0)`
- `public com.github.javaparser.resolution.types.ResolvedType replaceTypeVariables(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1, java.util.Map p2)`
- `public static com.github.javaparser.resolution.types.ResolvedWildcard superBound(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javaparser.resolution.types.ResolvedWildcard$BoundType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.resolution.types.ResolvedWildcard$BoundType EXTENDS`
- `public final static com.github.javaparser.resolution.types.ResolvedWildcard$BoundType SUPER`

---

## public abstract interface `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParameterValueProvider`

**Methods:**
- `public abstract java.util.Optional getGenericParameterByName(java.lang.String p0)`
- `public abstract java.util.Optional typeParamValue(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0)`
- `public default com.github.javaparser.resolution.types.ResolvedType useThisTypeParametersOnTheGivenType(com.github.javaparser.resolution.types.ResolvedType p0)`

---

## public class `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap`

**Methods:**
- `public static com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap empty()`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getNames()`
- `public java.util.List getTypes()`
- `public com.github.javaparser.resolution.types.ResolvedType getValue(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0)`
- `public java.util.Optional getValueBySignature(java.lang.String p0)`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public com.github.javaparser.resolution.types.ResolvedType replaceAll(com.github.javaparser.resolution.types.ResolvedType p0)`
- `public com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public static class `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap$Builder`

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap build()`
- `public com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap$Builder setValue(com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration p0, com.github.javaparser.resolution.types.ResolvedType p1)`

---

## public abstract interface `com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametrized`

**Methods:**
- `public abstract com.github.javaparser.resolution.types.parametrization.ResolvedTypeParametersMap typeParametersMap()`

---

## public class `com.github.javaparser.utils.ClassUtils`

**Constructors:**
- `public ClassUtils()`

**Methods:**
- `public static boolean isPrimitiveOrWrapper(java.lang.Class p0)`
- `public static boolean isPrimitiveWrapper(java.lang.Class p0)`

---

## public final class `com.github.javaparser.utils.CodeGenerationUtils`

**Methods:**
- `public static java.nio.file.Path classLoaderRoot(java.lang.Class p0)`
- `public static java.lang.String f(java.lang.String p0, java.lang.Object... p1)`
- `public static java.nio.file.Path fileInPackageAbsolutePath(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.nio.file.Path fileInPackageAbsolutePath(java.nio.file.Path p0, java.lang.String p1, java.lang.String p2)`
- `public static java.nio.file.Path fileInPackageRelativePath(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String getterName(java.lang.Class p0, java.lang.String p1)`
- `public static java.lang.String getterToPropertyName(java.lang.String p0)`
- `public static java.nio.file.Path mavenModuleRoot(java.lang.Class p0)`
- `public static java.lang.String optionalOf(java.lang.String p0, boolean p1)`
- `public static java.nio.file.Path packageAbsolutePath(java.lang.String p0, java.lang.String p1)`
- `public static java.nio.file.Path packageAbsolutePath(java.nio.file.Path p0, java.lang.String p1)`
- `public static java.lang.String packageToPath(java.lang.String p0)`
- `public static java.lang.String setterName(java.lang.String p0)`
- `public static java.nio.file.Path subtractPaths(java.nio.file.Path p0, java.nio.file.Path p1)`

---

## public abstract interface `com.github.javaparser.utils.CollectionStrategy`

**Methods:**
- `public abstract com.github.javaparser.utils.ProjectRoot collect(java.nio.file.Path p0)`
- `public abstract com.github.javaparser.ParserConfiguration getParserConfiguration()`
- `public default java.nio.file.PathMatcher getPathMatcher(java.lang.String p0)`
- `public default java.util.Optional getRoot(java.nio.file.Path p0)`

---

## public final enum `com.github.javaparser.utils.LineSeparator`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.utils.LineSeparator ARBITRARY`
- `public final static com.github.javaparser.utils.LineSeparator CR`
- `public final static com.github.javaparser.utils.LineSeparator CRLF`
- `public final static com.github.javaparser.utils.LineSeparator LF`
- `public final static com.github.javaparser.utils.LineSeparator MIXED`
- `public final static com.github.javaparser.utils.LineSeparator NONE`
- `public final static com.github.javaparser.utils.LineSeparator SYSTEM`
- `public final static com.github.javaparser.utils.LineSeparator UNKNOWN`

**Methods:**
- `public java.lang.String asEscapedString()`
- `public java.lang.String asRawString()`
- `public java.lang.String describe()`
- `public static com.github.javaparser.utils.LineSeparator detect(java.lang.String p0)`
- `public boolean equalsString(com.github.javaparser.utils.LineSeparator p0)`
- `public static com.github.javaparser.utils.LineSeparator getLineEnding(int p0, int p1, int p2)`
- `public boolean isStandardEol()`
- `public static java.util.Optional lookup(java.lang.String p0)`
- `public static java.util.Optional lookupEscaped(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.utils.Log`

**Constructors:**
- `public Log()`

**Methods:**
- `public static void error(java.lang.String p0, java.util.function.Supplier... p1)`
- `public static void error(java.lang.Throwable p0)`
- `public static void error(java.lang.Throwable p0, java.lang.String p1, java.util.function.Supplier... p2)`
- `public static void info(java.lang.String p0, java.util.function.Supplier... p1)`
- `public static void setAdapter(com.github.javaparser.utils.Log$Adapter p0)`
- `public static void trace(java.lang.String p0, java.util.function.Supplier... p1)`

---

## public abstract static interface `com.github.javaparser.utils.Log$Adapter`

**Methods:**
- `public abstract void error(java.util.function.Supplier p0, java.util.function.Supplier p1)`
- `public abstract void info(java.util.function.Supplier p0)`
- `public abstract void trace(java.util.function.Supplier p0)`

---

## public static class `com.github.javaparser.utils.Log$SilentAdapter`
implements `com.github.javaparser.utils.Log$Adapter`  

**Constructors:**
- `public SilentAdapter()`

**Methods:**
- `public void error(java.util.function.Supplier p0, java.util.function.Supplier p1)`
- `public void info(java.util.function.Supplier p0)`
- `public void trace(java.util.function.Supplier p0)`

---

## public static class `com.github.javaparser.utils.Log$StandardOutStandardErrorAdapter`
implements `com.github.javaparser.utils.Log$Adapter`  

**Constructors:**
- `public StandardOutStandardErrorAdapter()`

**Methods:**
- `public void error(java.util.function.Supplier p0, java.util.function.Supplier p1)`
- `public void info(java.util.function.Supplier p0)`
- `public void trace(java.util.function.Supplier p0)`

---

## public class `com.github.javaparser.utils.Pair`<A extends java.lang.Object, B extends java.lang.Object>

**Constructors:**
- `public Pair(A p0, B p1)`

**Fields:**
- `public final A a`
- `public final B b`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.utils.ParserCollectionStrategy`
implements `com.github.javaparser.utils.CollectionStrategy`  

**Constructors:**
- `public ParserCollectionStrategy()`
- `public ParserCollectionStrategy(com.github.javaparser.ParserConfiguration p0)`

**Methods:**
- `public com.github.javaparser.utils.ProjectRoot collect(java.nio.file.Path p0)`
- `public com.github.javaparser.ParserConfiguration getParserConfiguration()`

---

## public final class `com.github.javaparser.utils.PositionUtils`

**Methods:**
- `public static boolean areInOrder(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1)`
- `public static boolean areInOrder(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1, boolean p2)`
- `public static com.github.javaparser.ast.expr.AnnotationExpr getLastAnnotation(com.github.javaparser.ast.Node p0)`
- `public static boolean nodeContains(com.github.javaparser.ast.Node p0, com.github.javaparser.ast.Node p1, boolean p2)`
- `public static <T extends com.github.javaparser.ast.Node> void sortByBeginPosition(com.github.javaparser.ast.NodeList p0)`
- `public static <T extends com.github.javaparser.ast.Node> void sortByBeginPosition(java.util.List p0)`
- `public static <T extends com.github.javaparser.ast.Node> void sortByBeginPosition(java.util.List p0, boolean p1)`

---

## public class `com.github.javaparser.utils.ProjectRoot`

**Constructors:**
- `public ProjectRoot(java.nio.file.Path p0)`
- `public ProjectRoot(java.nio.file.Path p0, com.github.javaparser.ParserConfiguration p1)`

**Methods:**
- `public void addSourceRoot(java.nio.file.Path p0)`
- `public java.nio.file.Path getRoot()`
- `public java.util.Optional getSourceRoot(java.nio.file.Path p0)`
- `public java.util.List getSourceRoots()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.utils.SeparatedItemStringBuilder`

**Constructors:**
- `public SeparatedItemStringBuilder(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public com.github.javaparser.utils.SeparatedItemStringBuilder append(java.lang.CharSequence p0, java.lang.Object... p1)`
- `public boolean hasItems()`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.utils.SourceRoot`

**Constructors:**
- `public SourceRoot(java.nio.file.Path p0)`
- `public SourceRoot(java.nio.file.Path p0, com.github.javaparser.ParserConfiguration p1)`

**Methods:**
- `public com.github.javaparser.utils.SourceRoot add(com.github.javaparser.ast.CompilationUnit p0)`
- `public com.github.javaparser.utils.SourceRoot add(java.lang.String p0, java.lang.String p1, com.github.javaparser.ast.CompilationUnit p2)`
- `public java.util.List getCache()`
- `public java.util.List getCompilationUnits()`
- `public com.github.javaparser.ParserConfiguration getParserConfiguration()`
- `public java.util.function.Function getPrinter()`
- `public java.nio.file.Path getRoot()`
- `public com.github.javaparser.utils.SourceRoot parse(java.lang.String p0, com.github.javaparser.ParserConfiguration p1, com.github.javaparser.utils.SourceRoot$Callback p2) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceRoot parse(java.lang.String p0, com.github.javaparser.utils.SourceRoot$Callback p1) throws java.io.IOException`
- `public com.github.javaparser.ast.CompilationUnit parse(java.lang.String p0, java.lang.String p1)`
- `public com.github.javaparser.utils.SourceRoot parse(java.lang.String p0, java.lang.String p1, com.github.javaparser.ParserConfiguration p2, com.github.javaparser.utils.SourceRoot$Callback p3) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceRoot parse(java.lang.String p0, java.lang.String p1, com.github.javaparser.utils.SourceRoot$Callback p2) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceRoot parseParallelized(com.github.javaparser.utils.SourceRoot$Callback p0) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceRoot parseParallelized(java.lang.String p0, com.github.javaparser.ParserConfiguration p1, com.github.javaparser.utils.SourceRoot$Callback p2)`
- `public com.github.javaparser.utils.SourceRoot parseParallelized(java.lang.String p0, com.github.javaparser.utils.SourceRoot$Callback p1) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceRoot saveAll()`
- `public com.github.javaparser.utils.SourceRoot saveAll(java.nio.charset.Charset p0)`
- `public com.github.javaparser.utils.SourceRoot saveAll(java.nio.file.Path p0)`
- `public com.github.javaparser.utils.SourceRoot saveAll(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public com.github.javaparser.utils.SourceRoot setParserConfiguration(com.github.javaparser.ParserConfiguration p0)`
- `public com.github.javaparser.utils.SourceRoot setPrinter(java.util.function.Function p0)`
- `public java.lang.String toString()`
- `public java.util.List tryToParse() throws java.io.IOException`
- `public java.util.List tryToParse(java.lang.String p0) throws java.io.IOException`
- `public com.github.javaparser.ParseResult tryToParse(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public com.github.javaparser.ParseResult tryToParse(java.lang.String p0, java.lang.String p1, com.github.javaparser.ParserConfiguration p2) throws java.io.IOException`
- `public java.util.List tryToParseParallelized()`
- `public java.util.List tryToParseParallelized(java.lang.String p0)`

---

## public abstract static interface `com.github.javaparser.utils.SourceRoot$Callback`
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract com.github.javaparser.utils.SourceRoot$Callback$Result process(java.nio.file.Path p0, java.nio.file.Path p1, com.github.javaparser.ParseResult p2)`

---

## public final static enum `com.github.javaparser.utils.SourceRoot$Callback$Result`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javaparser.utils.SourceRoot$Callback$Result DONT_SAVE`
- `public final static com.github.javaparser.utils.SourceRoot$Callback$Result SAVE`
- `public final static com.github.javaparser.utils.SourceRoot$Callback$Result TERMINATE`

---

## public class `com.github.javaparser.utils.SourceZip`

**Constructors:**
- `public SourceZip(java.nio.file.Path p0)`
- `public SourceZip(java.nio.file.Path p0, com.github.javaparser.ParserConfiguration p1)`

**Methods:**
- `public com.github.javaparser.ParserConfiguration getParserConfiguration()`
- `public java.nio.file.Path getZipPath()`
- `public java.util.List parse() throws java.io.IOException`
- `public com.github.javaparser.utils.SourceZip parse(com.github.javaparser.utils.SourceZip$Callback p0) throws java.io.IOException`
- `public com.github.javaparser.utils.SourceZip setParserConfiguration(com.github.javaparser.ParserConfiguration p0)`

---

## public abstract static interface `com.github.javaparser.utils.SourceZip$Callback`
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract void process(java.nio.file.Path p0, com.github.javaparser.ParseResult p1)`

---

## public final class `com.github.javaparser.utils.StringEscapeUtils`

**Methods:**
- `public static java.lang.String escapeJava(java.lang.String p0)`
- `public static java.lang.String unescapeJava(java.lang.String p0)`
- `public static java.lang.String unescapeJavaTextBlock(java.lang.String p0)`

---

## public class `com.github.javaparser.utils.Utils`

**Constructors:**
- `public Utils()`

**Fields:**
- `public final static java.lang.String EOL`
- `public final static java.lang.String SYSTEM_EOL`

**Methods:**
- `public static java.lang.String assertNonEmpty(java.lang.String p0)`
- `public static <T extends java.lang.Number> T assertNonNegative(T p0)`
- `public static <T extends java.lang.Object> T assertNotNull(T p0)`
- `public static <T extends java.lang.Number> T assertPositive(T p0)`
- `public static java.lang.String camelCaseToScreaming(java.lang.String p0)`
- `public static java.lang.String capitalize(java.lang.String p0)`
- `public static java.lang.String decapitalize(java.lang.String p0)`
- `public static java.lang.String escapeEndOfLines(java.lang.String p0)`
- `public static boolean hasUnaryMinusAsParent(com.github.javaparser.ast.Node p0)`
- `public static java.lang.StringBuilder indent(java.lang.StringBuilder p0, int p1)`
- `public static <E extends java.lang.Object> int indexOfElementByObjectIdentity(java.util.List p0, E p1)`
- `public static <E extends java.lang.Object> boolean isNullOrEmpty(java.util.Collection p0)`
- `public static java.lang.String nextWord(java.lang.String p0)`
- `public static java.lang.String normalizeEolInTextBlock(java.lang.String p0, com.github.javaparser.utils.LineSeparator p1)`
- `public static java.lang.String normalizeEolInTextBlock(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String readerToString(java.io.Reader p0) throws java.io.IOException`
- `public static <E extends java.lang.Object> void removeElementByObjectIdentity(java.util.List p0, E p1)`
- `public static java.lang.String removeFileExtension(java.lang.String p0)`
- `public static <E extends java.lang.Object> void replaceElementByObjectIdentity(java.util.List p0, E p1, E p2)`
- `public static java.lang.String screamingToCamelCase(java.lang.String p0)`
- `public static <T extends java.lang.Object> java.util.Set set(T... p0)`
- `public static java.lang.String toCamelCase(java.lang.String p0)`
- `public static java.lang.String trimTrailingSpaces(java.lang.String p0)`
- `public static boolean valueIsNullOrEmpty(java.lang.Object p0)`
- `public static boolean valueIsNullOrEmptyStringOrOptional(java.lang.Object p0)`

---

## public class `com.github.javaparser.utils.VisitorList`<N extends com.github.javaparser.ast.Node>
implements `java.util.List<N>`  

**Constructors:**
- `public VisitorList(com.github.javaparser.ast.visitor.GenericVisitor p0, com.github.javaparser.ast.visitor.GenericVisitor p1)`

**Fields:**
- `protected final com.github.javaparser.ast.visitor.GenericVisitor equalsVisitor`
- `protected final com.github.javaparser.ast.visitor.GenericVisitor hashcodeVisitor`
- `protected java.util.List innerList`

**Methods:**
- `public boolean add(N p0)`
- `public void add(int p0, N p1)`
- `public boolean addAll(int p0, java.util.Collection p1)`
- `public boolean addAll(java.util.Collection p0)`
- `public void clear()`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public N get(int p0)`
- `public int indexOf(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public int lastIndexOf(java.lang.Object p0)`
- `public java.util.ListIterator listIterator()`
- `public java.util.ListIterator listIterator(int p0)`
- `public N remove(int p0)`
- `public boolean remove(java.lang.Object p0)`
- `public boolean removeAll(java.util.Collection p0)`
- `public boolean retainAll(java.util.Collection p0)`
- `public N set(int p0, N p1)`
- `public int size()`
- `public java.util.List subList(int p0, int p1)`
- `public java.lang.Object[] toArray()`
- `public <T extends java.lang.Object> T[] toArray(T[] p0)`
- `public java.lang.String toString()`

---

## public class `com.github.javaparser.utils.VisitorMap`<N extends com.github.javaparser.ast.Node, V extends java.lang.Object>
implements `java.util.Map<N,V>`  

**Constructors:**
- `public VisitorMap(com.github.javaparser.ast.visitor.GenericVisitor p0, com.github.javaparser.ast.visitor.GenericVisitor p1)`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public V get(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public V put(N p0, V p1)`
- `public void putAll(java.util.Map p0)`
- `public V remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public class `com.github.javaparser.utils.VisitorSet`<N extends com.github.javaparser.ast.Node>
implements `java.util.Set<N>`  

**Constructors:**
- `public VisitorSet(com.github.javaparser.ast.visitor.GenericVisitor p0, com.github.javaparser.ast.visitor.GenericVisitor p1)`

**Methods:**
- `public boolean add(N p0)`
- `public boolean addAll(java.util.Collection p0)`
- `public void clear()`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public boolean remove(java.lang.Object p0)`
- `public boolean removeAll(java.util.Collection p0)`
- `public boolean retainAll(java.util.Collection p0)`
- `public int size()`
- `public java.lang.Object[] toArray()`
- `public <T extends java.lang.Object> T[] toArray(T[] p0)`
- `public java.lang.String toString()`

---

