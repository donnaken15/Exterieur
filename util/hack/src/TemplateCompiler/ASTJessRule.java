/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.math.BigInteger;
/*     */ import java.util.HashSet;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ 
/*     */ class ASTJessRule extends SimpleNode
/*     */ {
/*  13 */   protected static Hashtable tableOfConsts = new Hashtable(); private static final boolean $noassert = Class.forName("[LTemplateCompiler.ASTJessRule;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */ 
/*  16 */   private static BigInteger ruleID = new BigInteger("0");
/*  17 */   private static final BigInteger inc1 = new BigInteger("1");
/*     */   
/*  19 */   private static Hashtable idTable = new Hashtable(10000);
/*     */   
/*     */   protected String patternHead;
/*     */   protected String ruleName;
/*     */   
/*     */   ASTJessRule(int paramInt)
/*     */   {
/*  26 */     super(paramInt);
/*     */   }
/*     */   
/*     */   ASTJessRule(NLU paramNLU, int paramInt) {
/*  30 */     super(paramNLU, paramInt);
/*     */   }
/*     */   
/*     */   int getFirstLineNumber() {
/*  34 */     return this.firstToken.endLine - 1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   String dumpTokens()
/*     */   {
/*  41 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/*  43 */     for (Token localToken = this.firstToken; localToken != this.lastToken; localToken = localToken.next)
/*     */     {
/*  45 */       localStringBuffer.append(localToken.image);
/*  46 */       localStringBuffer.append(" ");
/*     */     }
/*  48 */     localStringBuffer.append(localToken.image);
/*  49 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */   public String toString() {
/*  53 */     return NLUTreeConstants.jjtNodeName[this.id];
/*     */   }
/*     */   
/*     */   public void dump(String paramString) {
/*  57 */     System.out.println(paramString + toString() + ": " + dumpTokens() + '\n');
/*  58 */     if (this.children != null) {
/*  59 */       for (int i = 0; i < this.children.length; i++) {
/*  60 */         ASTJessRule localASTJessRule = (ASTJessRule)this.children[i];
/*  61 */         if (localASTJessRule != null) {
/*  62 */           localASTJessRule.dump(paramString + '-');
/*     */         }
/*     */       }
/*     */     }
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String getID(String paramString)
/*     */   {
/*  84 */     String str1 = (String)idTable.get(paramString);
/*  85 */     if (str1 == null) {
/*  86 */       String str2 = ruleID.toString();
/*  87 */       ruleID = ruleID.add(inc1);
/*  88 */       idTable.put(paramString, str2);
/*  89 */       return str2;
/*     */     }
/*     */     
/*     */ 
/*  93 */     return str1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected String getID()
/*     */   {
/* 100 */     String str = ruleID.toString();
/* 101 */     ruleID = ruleID.add(inc1);
/* 102 */     return str;
/*     */   }
/*     */   
/*     */   static String[] getIDKeys() {
/* 106 */     String[] arrayOfString = new String[idTable.size()];
/* 107 */     int i = 0;
/* 108 */     java.util.Enumeration localEnumeration = idTable.keys();
/* 109 */     while (localEnumeration.hasMoreElements())
/* 110 */       arrayOfString[(i++)] = ((String)localEnumeration.nextElement());
/* 111 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   static void printIDKeysToFile(String paramString) {
/*     */     try {
/* 116 */       PrintWriter localPrintWriter = new PrintWriter(new java.io.FileOutputStream(paramString));
/* 117 */       String[] arrayOfString = getIDKeys();
/* 118 */       java.util.Arrays.sort(arrayOfString);
/* 119 */       for (int i = 0; i < arrayOfString.length; i++)
/* 120 */         localPrintWriter.println(arrayOfString[i]);
/* 121 */       localPrintWriter.close();
/* 122 */     } catch (Exception localException) { throw new Error(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   void compileToJess(BufferedWriter paramBufferedWriter) throws java.io.IOException, CompileException {
/* 127 */     if (!$noassert) { throw new AssertionError("Don't call compileToJess() on ASTJessRule");
/*     */     }
/*     */   }
/*     */   
/*     */   void prepareRetraction(BufferedWriter paramBufferedWriter)
/*     */     throws java.io.IOException
/*     */   {
/* 134 */     if (this.children != null) {
/* 135 */       for (int i = 0; i < this.children.length; i++) {
/* 136 */         ASTJessRule localASTJessRule = (ASTJessRule)this.children[i];
/* 137 */         if (localASTJessRule != null) {
/* 138 */           localASTJessRule.prepareRetraction(paramBufferedWriter);
/* 139 */           String str1 = ((PatternProducingNode)localASTJessRule).getPatternHead();
/* 140 */           String str2 = toString();
/* 141 */           if ((!str2.equals("Template")) && (str1 != null) && (!str1.equals("_OBSOLETE"))) {
/* 142 */             paramBufferedWriter.write("(undefinerule " + str1 + ")\n");
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   int handleDeclare(BufferedWriter paramBufferedWriter)
/*     */     throws java.io.IOException, CompileException
/*     */   {
/* 152 */     int i = 0;
/*     */     
/* 154 */     ASTJessRule localASTJessRule = (ASTJessRule)this.children[i];
/* 155 */     String str = this.firstToken.next.next.image;
/*     */     
/* 157 */     while (localASTJessRule.toString().equals("Declare")) {
/* 158 */       ASTDeclare localASTDeclare = (ASTDeclare)localASTJessRule;
/* 159 */       localASTDeclare.setName(str);
/* 160 */       localASTDeclare.compileToJess(paramBufferedWriter);
/* 161 */       int j = localASTDeclare.getSalience();
/* 162 */       if (j != 65281)
/* 163 */         NLU.salience = j;
/* 164 */       i++;
/* 165 */       localASTJessRule = (ASTJessRule)this.children[i];
/*     */     }
/* 167 */     return i;
/*     */   }
/*     */   
/*     */   void compileToJessRule(String paramString1, String paramString2, BufferedWriter paramBufferedWriter, int paramInt)
/*     */     throws java.io.IOException, CompileException
/*     */   {
/* 173 */     StringWriter localStringWriter = new StringWriter();
/* 174 */     String str1 = this.firstToken.next.next.image;
/* 175 */     int i = paramInt;
/* 176 */     int j = NLU.salience;
/*     */     
/*     */ 
/* 179 */     paramBufferedWriter.write("(defrule " + str1 + " (declare (salience " + j + ")) ");
/* 180 */     int k = 0;
/*     */     
/* 182 */     localStringWriter.write(paramString1);
/* 184 */     for (; 
/* 184 */         i < this.children.length; i++)
/*     */     {
/* 186 */       ASTJessRule localASTJessRule = (ASTJessRule)this.children[i];
/*     */       
/* 188 */       if (localASTJessRule != null)
/*     */       {
/* 190 */         if (!localASTJessRule.toString().equals("Start"))
/*     */         {
/*     */ 
/* 193 */           if (localASTJessRule.toString().equals("RHside")) {
/* 194 */             if (k == 0) {
/* 195 */               localStringWriter.write("\n => ");
/* 196 */               localStringWriter.write(paramString2);
/* 197 */               k = 1;
/*     */             }
/* 199 */             ((ASTRHside)this.children[i]).compileToJess(localStringWriter);
/*     */           }
/*     */           else {
/* 202 */             ((ASTLHside)this.children[i]).compileToJess(localStringWriter);
/*     */           } }
/*     */       }
/*     */     }
/* 206 */     String str2 = localStringWriter.getBuffer().toString();
/* 207 */     paramBufferedWriter.write(str2 + " )\n\n");
/*     */     
/*     */ 
/* 210 */     if (NLU.generateRuleRetractionRules) {
/* 211 */       paramBufferedWriter.write("(defrule retract" + str1 + " (RETRACT" + str1 + ") => \n");
/* 212 */       prepareRetraction(paramBufferedWriter);
/* 213 */       paramBufferedWriter.write("(undefrule " + str1 + ")\n(undefrule retract" + str1 + "))\n\n");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   boolean isRegexp()
/*     */   {
/* 221 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected int getNumberOfArgumentsForDeclaredFact(String paramString)
/*     */   {
/* 228 */     Vector localVector = (Vector)tableOfConsts.get(paramString);
/* 229 */     if (localVector == null) {
/* 230 */       return -1;
/*     */     }
/* 232 */     return localVector.size();
/*     */   }
/*     */   
/*     */   protected boolean isDeclaredFact(String paramString) {
/* 236 */     if (tableOfConsts.get(paramString) != null) {
/* 237 */       return true;
/*     */     }
/* 239 */     return false;
/*     */   }
/*     */   
/*     */   void typeCheck(HashSet paramHashSet) throws CompileException
/*     */   {
/* 244 */     Token localToken = this.firstToken;
/* 245 */     localToken = localToken.next;
/*     */     
/* 247 */     String str1 = localToken.image;
/* 248 */     int j = 0;
/* 249 */     Object localObject = new Object();
/* 250 */     String str2 = new String();
/*     */     
/* 252 */     localToken = localToken.next;
/*     */     
/*     */ 
/* 255 */     if (tableOfConsts.containsKey(str1))
/*     */     {
/*     */ 
/* 258 */       Vector localVector1 = (Vector)tableOfConsts.get(str1);
/*     */       
/* 260 */       if (localVector1.size() == 0) { return;
/*     */       }
/* 262 */       int k = 0;
/*     */       
/*     */ 
/* 265 */       while (localToken != this.lastToken)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 270 */         String str3 = localToken.image;
/*     */         try {
/* 272 */           localObject = localVector1.get(k);
/*     */         }
/*     */         catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException) {
/* 275 */           throw new CompileException(getFirstLineNumber(), "The type definition of " + str1 + " did not match against the excessive argument " + str3);
/*     */         }
/*     */         
/*     */         int i;
/*     */         
/* 280 */         if (localObject.getClass().getName().equals("java.lang.String"))
/*     */         {
/* 282 */           str2 = (String)localObject;
/*     */           
/* 284 */           if (!str2.equals("*"))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */             if (!str3.startsWith("?"))
/*     */             {
/* 295 */               i = finder(paramHashSet, str2, str3);
/*     */               
/*     */ 
/* 298 */               if (i == 1) {
/* 299 */                 throw new CompileException(getFirstLineNumber(), "Constant not found " + str3 + ". ");
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/* 309 */           else if (str3.equals("(")) {
/* 310 */             while (!localToken.image.equals(")"))
/* 311 */               localToken = localToken.next;
/* 312 */             localToken = localToken.next;
/* 313 */             j = 1;
/* 314 */             k++;
/*     */           }
/*     */           
/*     */ 
/* 318 */           if (j != 1) {
/* 319 */             localToken = localToken.next;
/* 320 */             k++;
/*     */           }
/* 322 */           j = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 327 */           Vector localVector2 = (Vector)localObject;
/*     */           
/*     */ 
/*     */ 
/* 331 */           if (!str3.startsWith("?"))
/*     */           {
/*     */ 
/* 334 */             i = 1;
/* 335 */             int m = 0;
/* 336 */             while (i == 1) {
/*     */               try
/*     */               {
/* 339 */                 str2 = (String)localVector2.get(m);
/* 340 */                 i = finder(paramHashSet, str2, str3);
/* 341 */                 m++;
/*     */               }
/*     */               catch (Throwable localThrowable)
/*     */               {
/* 345 */                 throw new CompileException(getFirstLineNumber(), "Constant not found " + str3 + ". ");
/*     */               }
/*     */             }
/*     */           }
/* 349 */           localToken = localToken.next;
/* 350 */           k++;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private final int finder(HashSet paramHashSet, String paramString1, String paramString2)
/*     */     throws CompileException
/*     */   {
/* 360 */     int j = 0;
/*     */     Class localClass;
/* 362 */     try { localClass = Class.forName("facade.util." + paramString1);
/*     */     } catch (ClassNotFoundException localClassNotFoundException) {
/* 364 */       throw new CompileException(getFirstLineNumber(), "Class not found in declarations " + localClassNotFoundException);
/*     */     }
/*     */     
/* 367 */     java.lang.reflect.Field[] arrayOfField = localClass.getDeclaredFields();
/*     */     
/* 369 */     for (int i = 0; i < arrayOfField.length; i++)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */       if (arrayOfField[i].getName().equals(paramString2)) {
/* 377 */         Integer localInteger = new Integer(65281);
/* 378 */         try { localInteger = (Integer)arrayOfField[i].get(new Integer(0));
/*     */         } catch (IllegalAccessException localIllegalAccessException) {
/* 380 */           throw new CompileException(getFirstLineNumber(), localIllegalAccessException.getMessage());
/*     */         }
/* 382 */         paramHashSet.add("(assert (DefConst " + paramString2 + ' ' + localInteger.toString() + "))\n");
/* 383 */         return 0;
/*     */       }
/*     */     }
/*     */     
/* 387 */     return 1;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRuleName()
/*     */   {
/* 393 */     if ((!$noassert) && (this.ruleName == null)) throw new AssertionError();
/* 394 */     return this.ruleName;
/*     */   }
/*     */   
/*     */   public String getPatternHead()
/*     */   {
/* 399 */     if ((!$noassert) && (this.patternHead == null)) throw new AssertionError();
/* 400 */     return this.patternHead;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPatternToMatch(int paramInt)
/*     */   {
/* 406 */     if ((!$noassert) && (this.patternHead == null)) { throw new AssertionError();
/*     */     }
/* 408 */     StringBuffer localStringBuffer = new StringBuffer(100);
/*     */     
/* 410 */     if (paramInt != -1)
/*     */     {
/* 412 */       localStringBuffer.append("(" + this.patternHead + " ?startpos" + paramInt + " ?endpos" + paramInt);
/*     */     } else {
/* 414 */       localStringBuffer.append("(" + this.patternHead + " ?startpos ?endpos");
/*     */     }
/* 416 */     java.util.Iterator localIterator = getPatternBindingVariablesCanonical().iterator();
/* 417 */     while (localIterator.hasNext())
/* 418 */       localStringBuffer.append(" " + localIterator.next());
/* 419 */     localStringBuffer.append(")");
/*     */     
/* 421 */     return localStringBuffer.toString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public HashSet getPatternBindingVariables()
/*     */   {
/* 428 */     HashSet localHashSet = new HashSet();
/* 429 */     for (int i = 0; i < jjtGetNumChildren(); i++) {
/* 430 */       localHashSet.addAll(((PatternProducingNode)jjtGetChild(i)).getPatternBindingVariables());
/*     */     }
/* 432 */     return localHashSet;
/*     */   }
/*     */   
/*     */   public java.util.List getPatternBindingVariablesCanonical() {
/* 436 */     return new java.util.ArrayList(getPatternBindingVariables());
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\ASTJessRule.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */