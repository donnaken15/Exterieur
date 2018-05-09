/*     */ package scope;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class VariableScope {
/*     */   private Hashtable variables;
/*     */   private VariableScope parent;
/*     */   private String scopeName;
/*     */   
/*     */   public static class Variable {
/*     */     public Object value;
/*     */     String typeName;
/*     */     
/*     */     Variable(Object paramObject, String paramString) {
/*  15 */       this.value = paramObject;
/*  16 */       this.typeName = paramString;
/*     */     }
/*     */     
/*  19 */     public String toString() { return "Variable(" + this.value + ' ' + this.typeName + ')'; } }
/*     */   
/*     */   public static class IntValue { public int i;
/*     */     
/*     */     public IntValue() {}
/*     */     
/*  25 */     public IntValue(int paramInt) { this.i = paramInt; }
/*     */     
/*  27 */     public String toString() { return Integer.toString(this.i); } }
/*     */   
/*     */   public static class LongValue { public long l;
/*     */     
/*     */     public LongValue() {}
/*     */     
/*  33 */     public LongValue(long paramLong) { this.l = paramLong; }
/*     */     
/*  35 */     public String toString() { return Long.toString(this.l); } }
/*     */   
/*     */   public static class ShortValue { public short s;
/*     */     
/*     */     public ShortValue() {}
/*     */     
/*  41 */     public ShortValue(short paramShort) { this.s = paramShort; }
/*     */     
/*  43 */     public String toString() { return Short.toString(this.s); } }
/*     */   
/*     */   public static class ByteValue { public byte b;
/*     */     
/*     */     public ByteValue() {}
/*     */     
/*  49 */     public ByteValue(byte paramByte) { this.b = paramByte; }
/*     */     
/*  51 */     public String toString() { return Byte.toString(this.b); } }
/*     */   
/*     */   public static class FloatValue { public float f;
/*     */     
/*     */     public FloatValue() {}
/*     */     
/*  57 */     public FloatValue(float paramFloat) { this.f = paramFloat; }
/*     */     
/*  59 */     public String toString() { return Float.toString(this.f); } }
/*     */   
/*     */   public static class DoubleValue { public double d;
/*     */     
/*     */     public DoubleValue() {}
/*     */     
/*  65 */     public DoubleValue(double paramDouble) { this.d = paramDouble; }
/*     */     
/*  67 */     public String toString() { return Double.toString(this.d); } }
/*     */   
/*     */   public static class BooleanValue { public boolean b;
/*     */     
/*     */     public BooleanValue() {}
/*     */     
/*  73 */     public BooleanValue(boolean paramBoolean) { this.b = paramBoolean; }
/*     */     
/*  75 */     public String toString() { return new Boolean(this.b).toString(); }
/*     */   }
/*     */   
/*     */   private final void jdMethod_this() {
/*  79 */     this.variables = new Hashtable();
/*     */   }
/*     */   
/*     */   public VariableScope(VariableScope paramVariableScope, String paramString)
/*     */   {
/*  84 */     jdMethod_this();
/*  85 */     this.parent = paramVariableScope;
/*  86 */     this.scopeName = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void defineVariable(String paramString1, Object paramObject, String paramString2)
/*     */     throws MultipleDefinitionException
/*     */   {
/*  93 */     if (this.variables.containsKey(paramString1)) throw new MultipleDefinitionException(paramString1, this.scopeName);
/*  94 */     if (paramObject == null) {
/*  95 */       if (paramString2.equals("int")) {
/*  96 */         paramObject = new IntValue();
/*  97 */       } else if (paramString2.equals("long")) {
/*  98 */         paramObject = new LongValue();
/*  99 */       } else if (paramString2.equals("short")) {
/* 100 */         paramObject = new ShortValue();
/* 101 */       } else if (paramString2.equals("byte")) {
/* 102 */         paramObject = new ByteValue();
/* 103 */       } else if (paramString2.equals("float")) {
/* 104 */         paramObject = new FloatValue();
/* 105 */       } else if (paramString2.equals("double")) {
/* 106 */         paramObject = new DoubleValue();
/* 107 */       } else if (paramString2.equals("boolean"))
/* 108 */         paramObject = new BooleanValue();
/*     */     }
/* 110 */     this.variables.put(paramString1, new Variable(paramObject, paramString2));
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean variableDefined(String paramString)
/*     */   {
/* 116 */     if (this.variables.containsKey(paramString)) return true;
/* 117 */     if (this.parent != null) {
/* 118 */       return this.parent.variableDefined(paramString);
/*     */     }
/* 120 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getType(String paramString)
/*     */     throws UndefinedVariableException
/*     */   {
/* 127 */     if (this.variables.containsKey(paramString))
/* 128 */       return ((Variable)this.variables.get(paramString)).typeName;
/* 129 */     if (this.parent != null) {
/* 130 */       return this.parent.getType(paramString);
/*     */     }
/* 132 */     throw new UndefinedVariableException(paramString, this.scopeName);
/*     */   }
/*     */   
/*     */ 
/*     */   private final boolean isPrimitiveNumberType(String paramString)
/*     */   {
/* 138 */     if ((paramString.equals("int")) || (paramString.equals("long")) || (paramString.equals("short")) || (paramString.equals("byte")) || (paramString.equals("float")) || (paramString.equals("double")))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */       return true;
/*     */     }
/* 146 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   private final boolean checkTypeConsistency(Variable paramVariable)
/*     */   {
/* 152 */     if ((!isPrimitiveNumberType(paramVariable.typeName)) && (paramVariable.value == null)) {
/* 153 */       return true;
/*     */     }
/* 155 */     String str = paramVariable.value.getClass().getName();
/*     */     
/* 157 */     if (paramVariable.typeName.equals("int")) {
/* 158 */       if (!str.equals("scope.VariableScope$IntValue")) {
/* 159 */         return false;
/*     */       }
/* 161 */     } else if (paramVariable.typeName.equals("long")) {
/* 162 */       if (!str.equals("scope.VariableScope$LongValue")) {
/* 163 */         return false;
/*     */       }
/* 165 */     } else if (paramVariable.typeName.equals("short")) {
/* 166 */       if (!str.equals("scope.VariableScope$ShortValue")) {
/* 167 */         return false;
/*     */       }
/* 169 */     } else if (paramVariable.typeName.equals("byte")) {
/* 170 */       if (!str.equals("scope.VariableScope$ByteValue")) {
/* 171 */         return false;
/*     */       }
/* 173 */     } else if (paramVariable.typeName.equals("float")) {
/* 174 */       if (!str.equals("scope.VariableScope$FloatValue")) {
/* 175 */         return false;
/*     */       }
/* 177 */     } else if (paramVariable.typeName.equals("double")) {
/* 178 */       if (!str.equals("scope.VariableScope$DoubleValue")) {
/* 179 */         return false;
/*     */       }
/* 181 */     } else if (paramVariable.typeName.equals("boolean")) {
/* 182 */       if (!str.equals("scope.VariableScope$BooleanValue")) {
/* 183 */         return false;
/*     */       }
/*     */     }
/* 186 */     else if ((!str.equals(paramVariable.typeName)) && (!str.substring(str.lastIndexOf('.') + 1).equals(paramVariable.typeName)))
/*     */     {
/* 188 */       return false;
/*     */     }
/*     */     
/* 191 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object getValue(String paramString)
/*     */     throws UndefinedVariableException, TypeException
/*     */   {
/* 370 */     if (this.variables.containsKey(paramString)) {
/* 371 */       Variable localVariable = (Variable)this.variables.get(paramString);
/* 372 */       if (!checkTypeConsistency(localVariable)) throw new TypeException(paramString, this.scopeName, localVariable.typeName, localVariable.value.getClass().getName());
/* 373 */       return localVariable.value;
/*     */     }
/* 375 */     if (this.parent != null) {
/* 376 */       return this.parent.getValue(paramString);
/*     */     }
/* 378 */     throw new UndefinedVariableException(paramString, this.scopeName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public Object setValue(String paramString, Object paramObject)
/*     */     throws UndefinedVariableException, TypeException
/*     */   {
/* 386 */     String str1 = getType(paramString);
/* 387 */     String str2 = str1.substring(str1.lastIndexOf('.') + 1);
/* 388 */     String str3 = paramObject.getClass().getName();
/* 389 */     String str4 = str3.substring(str3.lastIndexOf('.') + 1);
/* 390 */     if ((str1.equals(str3)) || (str2.equals(str4))) {
/* 391 */       ((Variable)this.variables.get(paramString)).value = paramObject;
/* 392 */       return paramObject;
/*     */     }
/*     */     
/* 395 */     throw new TypeException(paramString, this.scopeName, str2, str4);
/*     */   }
/*     */   
/*     */ 
/*     */   public Variable getVariable(String paramString)
/*     */     throws UndefinedVariableException, TypeException
/*     */   {
/* 402 */     if (this.variables.containsKey(paramString)) {
/* 403 */       Variable localVariable = (Variable)this.variables.get(paramString);
/* 404 */       if (!checkTypeConsistency(localVariable)) throw new TypeException(paramString, this.scopeName, localVariable.typeName, localVariable.value.getClass().getName());
/* 405 */       return localVariable;
/*     */     }
/* 407 */     if (this.parent != null) {
/* 408 */       return this.parent.getVariable(paramString);
/*     */     }
/* 410 */     throw new UndefinedVariableException(paramString, this.scopeName);
/*     */   }
/*     */   
/*     */ 
/*     */   public Variable getParentVariable(String paramString)
/*     */     throws UndefinedVariableException, TypeException
/*     */   {
/* 417 */     if (this.parent != null) {
/* 418 */       return this.parent.getVariable(paramString);
/*     */     }
/* 420 */     throw new UndefinedVariableException(paramString, this.scopeName);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\scope\VariableScope.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */