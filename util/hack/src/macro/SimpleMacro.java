/*     */ package macro;
/*     */ 
/*     */ import java.io.StreamTokenizer;
/*     */ 
/*     */ public class SimpleMacro {
/*   6 */   private final void jdMethod_this() { this.maxArguments = 20;
/*     */     
/*   8 */     this.macroDefined = false;
/*   9 */     this.arguments = new String[20];
/*  10 */     this.numberOfArguments = 0;
/*     */   }
/*     */   
/*     */   private static final char macroAppendChar = '@';
/*     */   private static final boolean slashSlashComments = true;
/*     */   private static final boolean slashStarComments = true;
/*     */   private static final char singleLineCommentChar = '#';
/*     */   public final int maxArguments = 20;
/*     */   
/*  19 */   public SimpleMacro(String paramString) { jdMethod_this();
/*  20 */     java.io.StringReader localStringReader = new java.io.StringReader(paramString);
/*     */     try
/*     */     {
/*  23 */       StreamTokenizer localStreamTokenizer = new StreamTokenizer(localStringReader);
/*  24 */       localStreamTokenizer.slashSlashComments(true);
/*  25 */       localStreamTokenizer.slashStarComments(true);
/*  26 */       localStreamTokenizer.eolIsSignificant(true);
/*  27 */       localStreamTokenizer.nextToken();
/*  28 */       if (!localStreamTokenizer.sval.equals("definemacro")) {
/*  29 */         throw new SimpleMacroError("Macro " + paramString + " doesn't start with 'definemacro'");
/*     */       }
/*     */       
/*  32 */       localStreamTokenizer.nextToken();
/*  33 */       this.macroName = localStreamTokenizer.sval;
/*     */       
/*  35 */       localStreamTokenizer.nextToken();
/*  36 */       if (localStreamTokenizer.ttype != 40) {
/*  37 */         throw new SimpleMacroError("Error finding beginning of argument list in " + paramString);
/*     */       }
/*     */       
/*  40 */       int i = 40;
/*  41 */       localStreamTokenizer.nextToken();
/*  42 */       for (; localStreamTokenizer.ttype != 41; 
/*  43 */           localStreamTokenizer.nextToken())
/*     */       {
/*  45 */         if ((localStreamTokenizer.ttype != 44) && (localStreamTokenizer.ttype == -3) && ((i == 44) || (i == 40)))
/*     */         {
/*     */ 
/*     */ 
/*  49 */           this.arguments[(this.numberOfArguments++)] = localStreamTokenizer.sval;
/*  50 */           i = -3;
/*     */         }
/*  52 */         else if ((localStreamTokenizer.ttype == 44) && (i == -3))
/*     */         {
/*  54 */           i = 44;
/*     */         }
/*  56 */         else if (localStreamTokenizer.ttype != 41) {
/*  57 */           throw new SimpleMacroError("Error parsing the argument list of macro " + paramString);
/*     */         }
/*     */       }
/*     */       
/*  61 */       StringBuffer localStringBuffer = new StringBuffer();
/*     */       
/*  63 */       for (int j = localStringReader.read(); j != -1; j = localStringReader.read()) {
/*  64 */         localStringBuffer.append((char)j);
/*     */       }
/*  66 */       this.macroBody = localStringBuffer.toString();
/*  67 */       this.macroDefined = true;
/*     */     } catch (java.io.IOException localIOException) {
/*  69 */       throw new SimpleMacroError("IO error occurred while reading macro " + paramString + ". Error: " + localIOException.getMessage()); } }
/*     */   
/*     */   private boolean macroDefined;
/*     */   private String[] arguments;
/*     */   
/*  74 */   public SimpleMacro(java.io.File paramFile) { jdMethod_this();
/*  75 */     java.io.FileReader localFileReader = null;
/*     */     try
/*     */     {
/*  78 */       localFileReader = new java.io.FileReader(paramFile);
/*  79 */       StreamTokenizer localStreamTokenizer = new StreamTokenizer(localFileReader);
/*  80 */       localStreamTokenizer.slashSlashComments(true);
/*  81 */       localStreamTokenizer.slashStarComments(true);
/*  82 */       localStreamTokenizer.eolIsSignificant(true);
/*  83 */       localStreamTokenizer.nextToken();
/*  84 */       if (!localStreamTokenizer.sval.equals("definemacro")) {
/*  85 */         throw new SimpleMacroError("Macro definition file " + paramFile.getAbsolutePath() + " doesn't start with 'definemacro'");
/*     */       }
/*     */       
/*     */ 
/*  89 */       localStreamTokenizer.nextToken();
/*  90 */       this.macroName = localStreamTokenizer.sval;
/*     */       
/*  92 */       localStreamTokenizer.nextToken();
/*  93 */       if (localStreamTokenizer.ttype != 40) {
/*  94 */         throw new SimpleMacroError("Error finding beginning of argument list in " + paramFile.getAbsolutePath());
/*     */       }
/*     */       
/*  97 */       int i = 40;
/*  98 */       localStreamTokenizer.nextToken();
/*  99 */       for (; localStreamTokenizer.ttype != 41; 
/* 100 */           localStreamTokenizer.nextToken())
/*     */       {
/* 102 */         if ((localStreamTokenizer.ttype != 44) && (localStreamTokenizer.ttype == -3) && ((i == 44) || (i == 40)))
/*     */         {
/*     */ 
/*     */ 
/* 106 */           this.arguments[(this.numberOfArguments++)] = localStreamTokenizer.sval;
/* 107 */           i = -3;
/*     */         }
/* 109 */         else if ((localStreamTokenizer.ttype == 44) && (i == -3))
/*     */         {
/* 111 */           i = 44;
/*     */         }
/* 113 */         else if (localStreamTokenizer.ttype != 41) {
/* 114 */           throw new SimpleMacroError("Error parsing the argument list of macro definition file " + paramFile.getAbsolutePath());
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 119 */       StringBuffer localStringBuffer = new StringBuffer();
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       for (int j = localFileReader.read(); j != -1; j = localFileReader.read()) {
/* 131 */         localStringBuffer.append((char)j);
/*     */       }
/* 133 */       this.macroBody = localStringBuffer.toString();
/* 134 */       this.macroDefined = true;
/*     */     }
/*     */     catch (java.io.FileNotFoundException localFileNotFoundException) {
/* 137 */       throw new SimpleMacroError("Macro definition file " + paramFile.getAbsolutePath() + " not found.");
/*     */     }
/*     */     catch (java.io.IOException localIOException2) {
/* 140 */       throw new SimpleMacroError("IO error occurred while reading macro definition file " + paramFile.getAbsolutePath() + ". Error: " + localIOException2.getMessage());
/*     */     }
/*     */     finally
/*     */     {
/*     */       try {
/* 145 */         if (localFileReader != null) {
/* 146 */           localFileReader.close();
/*     */         }
/*     */       }
/*     */       catch (java.io.IOException localIOException1) {
/* 150 */         throw new SimpleMacroError("Error closing macro definition file " + paramFile.getAbsolutePath());
/*     */       } } }
/*     */   
/*     */   private int numberOfArguments;
/*     */   private String macroName;
/*     */   private String macroBody;
/* 156 */   private final int argLookup(String paramString) { for (int i = 0; i < this.arguments.length; i++) {
/* 157 */       if (paramString.equals(this.arguments[i])) {
/* 158 */         return i;
/*     */       }
/*     */     }
/* 161 */     return -1;
/*     */   }
/*     */   
/*     */   public String expand(String[] paramArrayOfString) throws SimpleMacroException {
/* 165 */     java.io.StringReader localStringReader = null;
/*     */     try
/*     */     {
/* 168 */       if (paramArrayOfString == null) {
/* 169 */         if (this.numberOfArguments != 0) {
/* 170 */           throw new SimpleMacroException("The number of expansion arguments for macro " + this.macroName + " does not equal the number of macro arguments.");
/*     */         }
/*     */         
/*     */       }
/* 174 */       else if (paramArrayOfString.length != this.numberOfArguments) {
/* 175 */         throw new SimpleMacroException("The number of expansion arguments for macro " + this.macroName + " does not equal the number of macro arguments.");
/*     */       }
/*     */       
/* 178 */       if (!this.macroDefined) {
/* 179 */         throw new SimpleMacroException("Macro not defined.");
/*     */       }
/*     */       
/* 182 */       String str2 = System.getProperty("line.separator");
/*     */       
/* 184 */       StringBuffer localStringBuffer = new StringBuffer();
/* 185 */       localStringReader = new java.io.StringReader(this.macroBody);
/* 186 */       StreamTokenizer localStreamTokenizer = new StreamTokenizer(localStringReader);
/* 187 */       localStreamTokenizer.slashSlashComments(true);
/* 188 */       localStreamTokenizer.slashStarComments(true);
/* 189 */       localStreamTokenizer.eolIsSignificant(true);
/* 190 */       localStreamTokenizer.ordinaryChar(32);
/* 191 */       localStreamTokenizer.ordinaryChar(9);
/* 192 */       localStreamTokenizer.ordinaryChar(34);
/* 193 */       localStreamTokenizer.ordinaryChar(39);
/* 194 */       localStreamTokenizer.ordinaryChar(46);
/* 195 */       localStreamTokenizer.wordChars(48, 57);
/*     */       
/*     */ 
/* 198 */       int i = -1;
/* 199 */       for (int j = localStreamTokenizer.nextToken(); 
/* 200 */           j != -1; 
/* 201 */           j = localStreamTokenizer.nextToken())
/*     */       {
/* 203 */         if (j == -3) {
/* 204 */           i = argLookup(localStreamTokenizer.sval);
/* 205 */           if (i != -1) {
/* 206 */             localStringBuffer.append(paramArrayOfString[i]);
/*     */           }
/*     */           else {
/* 209 */             localStringBuffer.append(localStreamTokenizer.sval);
/*     */           }
/*     */           
/*     */         }
/* 213 */         else if (j == 10) {
/* 214 */           localStringBuffer.append(str2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 222 */         else if (j == 35) {
/* 223 */           localStringBuffer.append("// ");
/*     */         }
/*     */         else {
/* 226 */           localStringBuffer.append((char)localStreamTokenizer.ttype);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 231 */       for (j = 0; j < localStringBuffer.length(); j++) {
/* 232 */         if (localStringBuffer.charAt(j) == '@') {
/* 233 */           localStringBuffer.deleteCharAt(j);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 238 */       String str3 = System.getProperty("line.separator");
/* 239 */       String str1; if (localStringBuffer.substring(0, str3.length()) == str3) {
/* 240 */         return localStringBuffer.substring(str3.length(), localStringBuffer.length());
/*     */       }
/* 242 */       return localStringBuffer.toString();
/*     */     }
/*     */     catch (java.io.IOException localIOException) {
/* 245 */       throw new SimpleMacroException("Error occurred while reading tokens during expand of macro " + this.macroName + ". Error: " + localIOException.getMessage());
/*     */     }
/*     */     finally
/*     */     {
/* 249 */       if (localStringReader != null) {
/* 250 */         localStringReader.close();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 257 */     java.io.StringWriter localStringWriter = new java.io.StringWriter();
/* 258 */     java.io.PrintWriter localPrintWriter = new java.io.PrintWriter(localStringWriter);
/*     */     
/* 260 */     localPrintWriter.println("Macro name: " + this.macroName);
/* 261 */     localPrintWriter.print("Arguments: ");
/* 262 */     for (int i = 0; i < this.numberOfArguments; i++) {
/* 263 */       localPrintWriter.print(this.arguments[i] + ' ');
/*     */     }
/* 265 */     localPrintWriter.println("");
/* 266 */     localPrintWriter.println("Macro body:");
/* 267 */     localPrintWriter.print(this.macroBody);
/*     */     
/* 269 */     return localStringWriter.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\macro\SimpleMacro.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */