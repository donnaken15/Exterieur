/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ 
/*     */ public class ASTJavaName extends BeatParseNode
/*     */ {
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.compiler.ASTJavaName;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public ASTJavaName(int paramInt)
/*     */   {
/*  11 */     super(paramInt);
/*     */   }
/*     */   
/*     */   public ASTJavaName(BeatParser paramBeatParser, int paramInt) {
/*  15 */     super(paramBeatParser, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public int lookupVariableScope(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */   {
/*  21 */     String str = dumpTokens(0, 1);
/*  22 */     return paramBeatScopeMaintainer.lookupVariableScope(str);
/*     */   }
/*     */   
/*     */ 
/*     */   public String lookupVariableType(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */   {
/*  28 */     String str = dumpTokens(0, 1);
/*  29 */     return paramBeatScopeMaintainer.lookupVariableType(str);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean declaredInLocalScope(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */   {
/*  36 */     String str = dumpTokens(0, 1);
/*  37 */     return paramBeatScopeMaintainer.declaredInLocalScope(str);
/*     */   }
/*     */   
/*  40 */   public String getName() { return dumpTokens(0, 1); }
/*     */   
/*  42 */   public String getFullName() { return dumpTokens(); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String lookupFieldType(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/*  50 */     String str1 = lookupVariableType(paramBeatScopeMaintainer);
/*     */     
/*  52 */     if (numberOfTokens() == 1)
/*     */     {
/*  54 */       return str1;
/*     */     }
/*     */     
/*     */ 
/*  58 */     int i = numberOfTokens();
/*  59 */     if ((!$noassert) && (i % 2 != 1)) throw new AssertionError();
/*  60 */     int j = 2;
/*  61 */     while (j < i)
/*     */     {
/*     */ 
/*  64 */       String str2 = dumpTokens(j, i);
/*     */       try {
/*  66 */         str1 = getFieldType(str1, str2).getName();
/*  67 */         j += 2;
/*     */       } catch (ClassNotFoundException localClassNotFoundException) {
/*  69 */         throw new CompileException("Class not found in variable reference. " + localClassNotFoundException.getMessage());
/*     */       } catch (NoSuchFieldException localNoSuchFieldException) {
/*  71 */         throw new CompileException("No such field found in variable reference. " + localNoSuchFieldException.getMessage());
/*     */       }
/*     */     }
/*  74 */     return str1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean isVariableReference(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */   {
/*  81 */     int i = lookupVariableScope(paramBeatScopeMaintainer);
/*  82 */     if (i == -1) {
/*  83 */       return false;
/*     */     }
/*  85 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public java.lang.reflect.Method getMethod()
/*     */     throws CompileException
/*     */   {
/*  92 */     if (numberOfTokens() == 1) return null;
/*     */     try
/*     */     {
/*  95 */       int i = numberOfTokens();
/*  96 */       if ((!$noassert) && (i % 2 != 1)) throw new AssertionError();
/*  97 */       Class localClass = getClass(dumpTokens(0, 1));
/*  98 */       String str = localClass.getName();
/*  99 */       int j = 2;
/*     */       
/*     */ 
/* 102 */       while (j < i - 1) {
/* 103 */         localClass = getFieldType(str, dumpTokens(j, j + 1));
/* 104 */         str = localClass.getName();
/* 105 */         j += 2;
/*     */       }
/*     */       
/* 108 */       return localClass.getMethod(dumpTokens(i - 1, i), null);
/*     */     } catch (ClassNotFoundException localClassNotFoundException) {
/* 110 */       throw new CompileException(getFirstLineNumber(), "Class not found in method reference. " + localClassNotFoundException.getMessage());
/*     */     } catch (NoSuchFieldException localNoSuchFieldException) {
/* 112 */       throw new CompileException(getFirstLineNumber(), "Field not found in method reference. " + localNoSuchFieldException.getMessage());
/*     */     } catch (NoSuchMethodException localNoSuchMethodException) {}
/* 114 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVariableReference(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws ScopeException
/*     */   {
/* 123 */     int i = lookupVariableScope(paramBeatScopeMaintainer);
/* 124 */     String str1 = lookupVariableType(paramBeatScopeMaintainer);
/* 125 */     String str2 = getName();
/* 126 */     String str3 = "";
/* 127 */     if (numberOfTokens() > 1) {
/* 128 */       str3 = dumpTokens(1, numberOfTokens());
/*     */     }
/* 130 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 132 */     if ((i == 0) || (i == 1)) {
/* 133 */       if (str1.equals("int")) {
/* 134 */         localStringBuffer.append("((VariableScope.IntValue)_scope.getValue(\"" + str2 + "\")).i");
/* 135 */       } else if (str1.equals("long")) {
/* 136 */         localStringBuffer.append("((VariableScope.LongValue)_scope.getValue(\"" + str2 + "\")).l");
/* 137 */       } else if (str1.equals("short")) {
/* 138 */         localStringBuffer.append("((VariableScope.ShortValue)_scope.getValue(\"" + str2 + "\")).s");
/* 139 */       } else if (str1.equals("byte")) {
/* 140 */         localStringBuffer.append("((VariableScope.ByteValue)_scope.getValue(\"" + str2 + "\")).b");
/* 141 */       } else if (str1.equals("float")) {
/* 142 */         localStringBuffer.append("((VariableScope.FloatValue)_scope.getValue(\"" + str2 + "\")).f");
/* 143 */       } else if (str1.equals("double")) {
/* 144 */         localStringBuffer.append("((VariableScope.DoubleValue)_scope.getValue(\"" + str2 + "\")).d");
/* 145 */       } else if (str1.equals("boolean")) {
/* 146 */         localStringBuffer.append("((VariableScope.BooleanValue)_scope.getValue(\"" + str2 + "\")).b");
/*     */       }
/* 148 */       else if (!getName().equals(getFullName())) {
/* 149 */         localStringBuffer.append("((" + str1 + ")_scope.getVariable(\"" + str2 + "\").value)");
/*     */       } else {
/* 151 */         localStringBuffer.append("_scope.getVariable(\"" + str2 + "\").value");
/*     */       }
/*     */       
/* 154 */       localStringBuffer.append(str3);
/* 155 */       return localStringBuffer.toString();
/*     */     }
/*     */     
/*     */ 
/* 159 */     throw new ScopeException(getFullName());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVariableReferenceAsObject(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws ScopeException
/*     */   {
/* 168 */     String str1 = getVariableReference(paramBeatScopeMaintainer);
/* 169 */     String str2 = lookupVariableType(paramBeatScopeMaintainer);
/*     */     
/*     */ 
/* 172 */     if (str2.equals("int"))
/* 173 */       return "new Integer(" + str1 + ')';
/* 174 */     if (str2.equals("long"))
/* 175 */       return "new Long(" + str1 + ')';
/* 176 */     if (str2.equals("short"))
/* 177 */       return "new Short(" + str1 + ')';
/* 178 */     if (str2.equals("float"))
/* 179 */       return "new Float(" + str1 + ')';
/* 180 */     if (str2.equals("double"))
/* 181 */       return "new Double(" + str1 + ')';
/* 182 */     if (str2.equals("char"))
/* 183 */       return "new Character(" + str1 + ')';
/* 184 */     if (str2.equals("boolean")) {
/* 185 */       return "new Boolean(" + str1 + ')';
/*     */     }
/*     */     
/* 188 */     return str1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getVariableReferenceOrConstant(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/*     */     try
/*     */     {
/* 198 */       return getVariableReference(paramBeatScopeMaintainer);
/*     */     } catch (ScopeException localScopeException) {
/* 200 */       String str1 = dumpTokens();
/* 201 */       Field localField = ASTBeatTopLevel.getBeatTopLevel().getDeclaredConstant(str1);
/* 202 */       if (localField != null) {
/* 203 */         String str2 = localField.getType().getName();
/*     */         Object localObject;
/*     */         try {
/* 206 */           localObject = localField.get(null);
/*     */         } catch (IllegalAccessException localIllegalAccessException) {
/* 208 */           throw new CompileException(getFirstLineNumber(), "Illegal access exception while processing constant " + str1);
/*     */         }
/* 210 */         if ((!str2.equals("int")) && (!str2.equals("float")) && (!str2.equals("char")) && (!str2.equals("String")) && (!str2.equals("boolean")))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           throw new CompileException(getFirstLineNumber(), "Constant " + str1 + " of type " + str2 + " has an unrecognized type.");
/*     */         }
/* 218 */         if (str2.equals("String")) {
/* 219 */           return "\"" + localObject.toString() + '"';
/*     */         }
/* 221 */         return localObject.toString();
/*     */       }
/*     */       
/* 224 */       throw new CompileException(getFirstLineNumber(), "The variable " + str1 + " is not defined in any scope nor is it a constant.");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVariableReferenceOrConstantAsObject(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/*     */     try
/*     */     {
/* 239 */       return getVariableReferenceAsObject(paramBeatScopeMaintainer);
/*     */     } catch (ScopeException localScopeException) {
/* 241 */       String str1 = dumpTokens();
/* 242 */       Field localField = ASTBeatTopLevel.getBeatTopLevel().getDeclaredConstant(str1);
/* 243 */       if (localField != null) {
/* 244 */         String str2 = localField.getType().getName();
/*     */         Object localObject;
/*     */         try {
/* 247 */           localObject = localField.get(null);
/*     */         } catch (IllegalAccessException localIllegalAccessException) {
/* 249 */           throw new CompileException(getFirstLineNumber(), "Illegal access exception while processing constant " + str1);
/*     */         }
/* 251 */         if (str2.equals("int"))
/* 252 */           return "new Integer(" + localObject + ')';
/* 253 */         if (str2.equals("float"))
/* 254 */           return "new Float(" + localObject + ')';
/* 255 */         if (str2.equals("char"))
/* 256 */           return "new Character(" + localObject + ')';
/* 257 */         if (str2.equals("boolean"))
/* 258 */           return "new Boolean(" + localObject + ')';
/* 259 */         if (str2.equals("String")) {
/* 260 */           return "new String(\"" + localObject + "\")";
/*     */         }
/* 262 */         throw new CompileException(getFirstLineNumber(), "Constant " + str1 + " of type " + str2 + " has an unrecognized type.");
/*     */       }
/*     */       
/*     */ 
/* 266 */       throw new CompileException(getFirstLineNumber(), "The variable " + str1 + " is not defined in any scope nor is it a constant.");
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isConstant(BeatScopeMaintainer paramBeatScopeMaintainer) throws CompileException
/*     */   {
/* 272 */     if (isVariableReference(paramBeatScopeMaintainer)) {
/* 273 */       return false;
/*     */     }
/* 275 */     String str = dumpTokens();
/* 276 */     if (ASTBeatTopLevel.getBeatTopLevel().getDeclaredConstant(str) != null) {
/* 277 */       return true;
/*     */     }
/* 279 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public Object getConstantValue()
/*     */     throws CompileException
/*     */   {
/* 286 */     String str1 = dumpTokens();
/* 287 */     Field localField = ASTBeatTopLevel.getBeatTopLevel().getDeclaredConstant(str1);
/* 288 */     if (localField != null) {
/* 289 */       String str2 = localField.getType().getName();
/*     */       Object localObject;
/*     */       try {
/* 292 */         localObject = localField.get(null);
/*     */       } catch (IllegalAccessException localIllegalAccessException) {
/* 294 */         throw new CompileException(getFirstLineNumber(), "Illegal access exception while processing constant " + str1);
/*     */       }
/* 296 */       if ((!str2.equals("int")) && (!str2.equals("float")) && (!str2.equals("char")) && (!str2.equals("String")) && (!str2.equals("boolean")))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         throw new CompileException(getFirstLineNumber(), "Constant " + str1 + " of type " + str2 + " has an unrecognized type.");
/*     */       }
/* 304 */       return localObject;
/*     */     }
/*     */     
/* 307 */     throw new CompileException(getFirstLineNumber(), "The variable " + str1 + " is not defined in any scope nor is it a constant.");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getConstantType()
/*     */     throws CompileException
/*     */   {
/* 315 */     String str = dumpTokens();
/* 316 */     Field localField = ASTBeatTopLevel.getBeatTopLevel().getDeclaredConstant(str);
/* 317 */     if (localField != null) {
/* 318 */       return localField.getType().getName();
/*     */     }
/* 320 */     throw new CompileException(getFirstLineNumber(), "The constant " + str + " is not defined");
/*     */   }
/*     */   
/*     */   public String getConstantString() throws CompileException
/*     */   {
/* 325 */     return getConstantValue().toString();
/*     */   }
/*     */   
/*     */ 
/*     */   public void setJavaNameImage(String paramString)
/*     */   {
/* 331 */     this.firstToken.image = paramString;
/* 332 */     this.firstToken.kind = 87;
/* 333 */     this.firstToken.next = this.lastToken.next;
/* 334 */     this.lastToken = this.firstToken;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getType(BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */     throws CompileException
/*     */   {
/* 341 */     if (isVariableReference(paramBeatScopeMaintainer))
/* 342 */       return lookupFieldType(paramBeatScopeMaintainer);
/* 343 */     if (isConstant(paramBeatScopeMaintainer)) {
/* 344 */       return getConstantType();
/*     */     }
/* 346 */     throw new CompileException(getFirstLineNumber(), "The expression " + dumpTokens(0, 1) + " is neither a declared variable nor constant");
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTJavaName.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */