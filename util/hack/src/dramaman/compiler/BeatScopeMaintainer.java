/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ import jd.FieldDescriptor;
/*     */ import macro.SimpleMacro;
/*     */ 
/*     */ public class BeatScopeMaintainer extends BeatParseNode
/*     */ {
/*     */   private final void jdMethod_this()
/*     */   {
/*  11 */     this.variableDecl = new Hashtable();
/*     */     
/*  13 */     this.fieldDescriptors = new java.util.LinkedList();
/*     */     
/*  15 */     this.scopeParent = null;
/*     */     
/*     */ 
/*     */ 
/*  19 */     this.scopeType = -1;
/*     */   }
/*     */   
/*  22 */   private static final SimpleMacro defineVariableMacro = new SimpleMacro("definemacro defineVariable(variableName, initializer, type)_scope.defineVariable(\"variableName\", initializer, \"type\");");
/*     */   
/*     */ 
/*     */ 
/*  26 */   private static final SimpleMacro scopeInitializerMacro = new SimpleMacro("definemacro scope(parentScope, scopeName)new VariableScopeThrowsErrors(parentScope, \"@scopeName_scope\")");
/*     */   public static final int noScope = -1;
/*     */   public static final int beatScope = 0;
/*     */   public static final int methodScope = 1;
/*     */   protected Hashtable variableDecl;
/*     */   
/*     */   public BeatScopeMaintainer(int paramInt)
/*     */   {
/*  34 */     super(paramInt);jdMethod_this(); }
/*     */   
/*  36 */   public BeatScopeMaintainer(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt);jdMethod_this();
/*     */   }
/*     */   
/*  39 */   public void setScopeName(String paramString) { this.scopeName = paramString; }
/*  40 */   public String getScopeName() { return this.scopeName; }
/*     */   
/*     */ 
/*  43 */   public void setScopeParent(BeatScopeMaintainer paramBeatScopeMaintainer) { this.scopeParent = paramBeatScopeMaintainer; }
/*  44 */   public BeatScopeMaintainer getScopeParent() { return this.scopeParent; }
/*     */   
/*     */   public void setScopeType(int paramInt) {
/*  47 */     if ((paramInt == 0) || (paramInt == 1))
/*     */     {
/*  49 */       this.scopeType = paramInt;
/*     */     } else
/*  51 */       throw new CompileError("Attempt to set illegal scope type " + paramInt);
/*     */   }
/*     */   
/*     */   public BeatScopeMaintainer getEnclosingScope() {
/*  55 */     return this;
/*     */   }
/*     */   
/*     */   public BeatScopeMaintainer getNextEnclosingScope() {
/*  59 */     BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetParent();
/*  60 */     if (localBeatParseNode != null) {
/*  61 */       return localBeatParseNode.getEnclosingScope();
/*     */     }
/*  63 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void addVariableDeclaration(FieldDescriptor paramFieldDescriptor)
/*     */   {
/*  70 */     this.fieldDescriptors.add(paramFieldDescriptor);
/*  71 */     String str = paramFieldDescriptor.fieldType;
/*  72 */     String[] arrayOfString = paramFieldDescriptor.getFieldNames();
/*  73 */     for (int i = 0; i < arrayOfString.length; i++) {
/*  74 */       if (this.variableDecl.get(arrayOfString[i]) != null) {
/*  75 */         throw new CompileError("Variable " + arrayOfString[i] + " multiply defined in scope " + this.scopeName);
/*     */       }
/*  77 */       this.variableDecl.put(arrayOfString[i].intern(), str.intern());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String lookupVariableType(String paramString)
/*     */   {
/*  85 */     String str = (String)this.variableDecl.get(paramString);
/*  86 */     if (str != null)
/*     */     {
/*     */ 
/*  89 */       return str; }
/*  90 */     if (this.scopeParent != null)
/*     */     {
/*     */ 
/*     */ 
/*  94 */       return this.scopeParent.lookupVariableType(paramString);
/*     */     }
/*     */     
/*     */ 
/*  98 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public String lookupVariableTypeInParentScope(String paramString)
/*     */   {
/* 104 */     if (this.scopeParent != null) {
/* 105 */       return this.scopeParent.lookupVariableType(paramString);
/*     */     }
/* 107 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   protected java.util.LinkedList fieldDescriptors;
/*     */   protected BeatScopeMaintainer scopeParent;
/*     */   protected String scopeName;
/*     */   private int scopeType;
/*     */   public int lookupVariableScope(String paramString)
/*     */   {
/* 117 */     String str = (String)this.variableDecl.get(paramString);
/* 118 */     if (str != null)
/*     */     {
/*     */ 
/* 121 */       return this.scopeType; }
/* 122 */     if (this.scopeParent != null)
/*     */     {
/*     */ 
/*     */ 
/* 126 */       return this.scopeParent.lookupVariableScope(paramString);
/*     */     }
/*     */     
/*     */ 
/* 130 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public int lookupVariableScopeInParentScope(String paramString)
/*     */   {
/* 136 */     if (this.scopeParent != null) {
/* 137 */       return this.scopeParent.lookupVariableScope(paramString);
/*     */     }
/* 139 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean declaredInLocalScope(String paramString)
/*     */   {
/* 145 */     if (this.variableDecl.get(paramString) != null) {
/* 146 */       return true;
/*     */     }
/* 148 */     return false;
/*     */   }
/*     */   
/*     */   public java.util.List getDeclaredVariables() {
/* 152 */     return this.fieldDescriptors;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void addChildVariableDeclarations()
/*     */   {
/* 159 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/* 162 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 163 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "BeatVariableDecl")
/*     */       {
/*     */ 
/* 166 */         FieldDescriptor localFieldDescriptor = ((ASTBeatVariableDecl)localBeatParseNode).getFieldDescriptor();
/* 167 */         addVariableDeclaration(localFieldDescriptor);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   void initializeScope(int paramInt, String paramString, BeatScopeMaintainer paramBeatScopeMaintainer)
/*     */   {
/* 174 */     setScopeType(paramInt);
/* 175 */     setScopeParent(paramBeatScopeMaintainer);
/* 176 */     setScopeName(paramString);
/* 177 */     this.fieldDescriptors.clear();
/* 178 */     this.variableDecl.clear();
/*     */   }
/*     */   
/*     */ 
/*     */   void defineRuntimeScope(jd.MethodDescriptor paramMethodDescriptor, String paramString1, String paramString2)
/*     */     throws CompileException
/*     */   {
/*     */     try
/*     */     {
/* 187 */       java.util.Iterator localIterator = getDeclaredVariables().iterator();
/* 188 */       FieldDescriptor localFieldDescriptor1 = new FieldDescriptor();
/* 189 */       localFieldDescriptor1.fieldType = "VariableScopeThrowsErrors";
/* 190 */       localFieldDescriptor1.addFieldName("_scope");
/* 191 */       String[] arrayOfString1 = { paramString2, paramString1 };
/* 192 */       localFieldDescriptor1.initializer = scopeInitializerMacro.expand(arrayOfString1);
/* 193 */       paramMethodDescriptor.addToBlockBody(localFieldDescriptor1);
/* 194 */       String[] arrayOfString2; int i; for (; localIterator.hasNext(); 
/*     */           
/*     */ 
/* 197 */           i < arrayOfString2.length)
/*     */       {
/* 195 */         FieldDescriptor localFieldDescriptor2 = (FieldDescriptor)localIterator.next();
/* 196 */         arrayOfString2 = localFieldDescriptor2.getFieldNames();
/* 197 */         i = 0; continue;
/* 198 */         String[] arrayOfString3; if (i == arrayOfString2.length - 1) {
/* 199 */           arrayOfString3 = new String[3];
/* 200 */           arrayOfString3[0] = arrayOfString2[i];
/* 201 */           arrayOfString3[2] = localFieldDescriptor2.fieldType;
/* 202 */           if (localFieldDescriptor2.initializer != null) {
/* 203 */             if (localFieldDescriptor2.fieldType.equals("int")) {
/* 204 */               arrayOfString3[1] = ("new VariableScope.IntValue(" + localFieldDescriptor2.initializer + ')');
/* 205 */             } else if (localFieldDescriptor2.fieldType.equals("long")) {
/* 206 */               arrayOfString3[1] = ("new VariableScope.LongValue(" + localFieldDescriptor2.initializer + ')');
/* 207 */             } else if (localFieldDescriptor2.fieldType.equals("short")) {
/* 208 */               arrayOfString3[1] = ("new VariableScope.ShortValue(" + localFieldDescriptor2.initializer + ')');
/* 209 */             } else if (localFieldDescriptor2.fieldType.equals("byte")) {
/* 210 */               arrayOfString3[1] = ("new VariableScope.ByteValue(" + localFieldDescriptor2.initializer + ')');
/* 211 */             } else if (localFieldDescriptor2.fieldType.equals("float")) {
/* 212 */               arrayOfString3[1] = ("new VariableScope.FloatValue(" + localFieldDescriptor2.initializer + ')');
/* 213 */             } else if (localFieldDescriptor2.fieldType.equals("double")) {
/* 214 */               arrayOfString3[1] = ("new VariableScope.DoubleValue(" + localFieldDescriptor2.initializer + ')');
/* 215 */             } else if (localFieldDescriptor2.fieldType.equals("boolean")) {
/* 216 */               arrayOfString3[1] = ("new VariableScope.BooleanValue(" + localFieldDescriptor2.initializer + ')');
/*     */             } else {
/* 218 */               arrayOfString3[1] = localFieldDescriptor2.initializer;
/*     */             }
/*     */           } else {
/* 221 */             arrayOfString3[1] = null;
/*     */           }
/* 223 */           paramMethodDescriptor.addToBlockBody(new jd.CodeStringDescriptor(defineVariableMacro.expand(arrayOfString3)));
/*     */         }
/*     */         else {
/* 226 */           arrayOfString3 = new String[] { arrayOfString2[i], 0, localFieldDescriptor2.fieldType };
/* 227 */           paramMethodDescriptor.addToBlockBody(new jd.CodeStringDescriptor(defineVariableMacro.expand(arrayOfString3)));
/*     */         }
/* 197 */         i++;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
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
/*     */     }
/*     */     catch (macro.SimpleMacroException localSimpleMacroException)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */       throw new CompileException(localSimpleMacroException.getMessage());
/*     */     } }
/*     */   
/* 234 */   public String toString() { return BeatParserTreeConstants.jjtNodeName[this.id] + ": scopeName = " + this.scopeName + " scopeParent = " + this.scopeParent; }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\BeatScopeMaintainer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */