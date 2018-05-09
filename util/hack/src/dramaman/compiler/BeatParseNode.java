/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ abstract class BeatParseNode extends SimpleNode implements BeatParserConstants
/*     */ {
/*     */   protected static final String QUOTE = "\"";
/*     */   public Token firstToken;
/*     */   public Token lastToken;
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.compiler.BeatParseNode;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public BeatParseNode(int paramInt)
/*     */   {
/*  16 */     super(paramInt);
/*     */   }
/*     */   
/*     */   public BeatParseNode(BeatParser paramBeatParser, int paramInt) {
/*  20 */     super(paramBeatParser, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public int getFirstLineNumber()
/*     */   {
/*  26 */     return this.firstToken.beginLine;
/*     */   }
/*     */   
/*     */   public int getLastLineNumber() {
/*  30 */     return this.lastToken.endLine;
/*     */   }
/*     */   
/*     */   public int getFirstColumn() {
/*  34 */     return this.firstToken.beginColumn;
/*     */   }
/*     */   
/*     */   public int getLastColumn() {
/*  38 */     return this.lastToken.endColumn;
/*     */   }
/*     */   
/*     */   public String prettyPrintTokens()
/*     */   {
/*  43 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  45 */     for (Token localToken = this.firstToken; localToken != this.lastToken; localToken = localToken.next) {
/*  46 */       if ((localToken.next.image != ";") && (localToken.next.image != ".") && (localToken.next.image != "(") && (localToken.next.image != ")") && (localToken.image != ".") && (localToken.image != "("))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  52 */         localStringBuffer.append(localToken.image + ' ');
/*     */       } else
/*  54 */         localStringBuffer.append(localToken.image);
/*     */     }
/*  56 */     localStringBuffer.append(localToken.image);
/*  57 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public String dumpTokens()
/*     */   {
/*  62 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  64 */     for (Token localToken = this.firstToken; localToken != this.lastToken; localToken = localToken.next) {
/*  65 */       localStringBuffer.append(localToken.image);
/*     */     }
/*  67 */     localStringBuffer.append(localToken.image);
/*  68 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */   public int numberOfTokens()
/*     */   {
/*  74 */     int i = 0;
/*     */     
/*  76 */     for (Token localToken = this.firstToken; localToken != this.lastToken; localToken = localToken.next) {
/*  77 */       i++;
/*     */     }
/*  79 */     i++;return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String dumpTokens(int paramInt1, int paramInt2)
/*     */   {
/*  86 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  88 */     int i = 0;
/*     */     
/*  90 */     if ((!$noassert) && (paramInt2 > numberOfTokens())) throw new AssertionError();
/*  91 */     if ((!$noassert) && (paramInt2 < 1)) throw new AssertionError();
/*  92 */     if ((!$noassert) && (paramInt1 < 0)) throw new AssertionError();
/*  93 */     if ((!$noassert) && (paramInt1 >= paramInt2)) { throw new AssertionError();
/*     */     }
/*     */     
/*  96 */     for (Token localToken = this.firstToken; i != paramInt1; localToken = localToken.next) {
/*  97 */       i++;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 102 */     while (i < paramInt2) {
/* 103 */       localStringBuffer.append(localToken.image);
/* 104 */       localToken = localToken.next;
/* 105 */       i++;
/*     */     }
/*     */     
/* 108 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static String uppercaseFirstCharacter(String paramString)
/*     */   {
/* 115 */     StringBuffer localStringBuffer = new StringBuffer(paramString);
/* 116 */     localStringBuffer.setCharAt(0, Character.toUpperCase(localStringBuffer.charAt(0)));
/* 117 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected static String stripQuotes(String paramString)
/*     */   {
/* 125 */     return paramString.substring(1, paramString.length() - 1);
/*     */   }
/*     */   
/*     */ 
/*     */   public static boolean primitiveType(String paramString)
/*     */   {
/* 131 */     if ((paramString == "int") || (paramString == "float") || (paramString == "char") || (paramString == "boolean") || (paramString == "long") || (paramString == "short") || (paramString == "byte") || (paramString == "double"))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       return true;
/*     */     }
/* 141 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected Class getClass(String paramString)
/*     */     throws ClassNotFoundException
/*     */   {
/*     */     try
/*     */     {
/* 151 */       return Class.forName(ASTBeatTopLevel.getBeatTopLevel().beatPackage + '.' + paramString);
/*     */     }
/*     */     catch (ClassNotFoundException localClassNotFoundException1)
/*     */     {
/* 155 */       Iterator localIterator1 = ASTBeatTopLevel.getBeatTopLevel().getUserImportPackages();
/* 156 */       while (localIterator1.hasNext()) {
/*     */         try {
/* 158 */           String str1 = (String)localIterator1.next();
/* 159 */           return Class.forName(str1 + '.' + paramString);
/*     */         }
/*     */         catch (ClassNotFoundException localClassNotFoundException2) {}
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 166 */       Iterator localIterator2 = ASTBeatTopLevel.getBeatTopLevel().getUserImportClasses();
/* 167 */       while (localIterator2.hasNext()) {
/* 168 */         String str2 = (String)localIterator2.next();
/* 169 */         if (paramString.equals(str2.substring(str2.lastIndexOf('.') + 1, str2.length()))) {
/* 170 */           return Class.forName(str2);
/*     */         }
/*     */       }
/*     */       
/* 174 */       throw new ClassNotFoundException(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected Class getFieldType(String paramString1, String paramString2)
/*     */     throws ClassNotFoundException, NoSuchFieldException
/*     */   {
/* 184 */     return getClass(paramString1).getField(paramString2).getType();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected Class getWMEFieldType(String paramString1, String paramString2)
/*     */     throws ClassNotFoundException, NoSuchMethodException
/*     */   {
/* 193 */     return getClass(paramString1).getMethod("get" + uppercaseFirstCharacter(paramString2), null).getReturnType();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   BeatScopeMaintainer getEnclosingBeatScope()
/*     */   {
/* 202 */     throw new CompileError("getEnclosingBeatScope() called on a parse node which never appears in a subtree rooted at an ASTBeatDefinition");
/*     */   }
/*     */   
/*     */   BeatScopeMaintainer getEnclosingScope()
/*     */   {
/* 207 */     throw new CompileError("getEnclosingScope() called on BeatParseNode");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\BeatParseNode.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */