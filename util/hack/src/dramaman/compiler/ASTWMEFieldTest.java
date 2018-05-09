/*     */ package dramaman.compiler;
/*     */ 
/*     */ import jd.CodeStringDescriptor;
/*     */ import jd.FieldDescriptor;
/*     */ import jd.JavaCodeDescriptor;
/*     */ 
/*     */ public class ASTWMEFieldTest extends BeatParseNode
/*     */ {
/*     */   private String wmeFieldName;
/*     */   private int testOp;
/*     */   private ASTBeatExpression wmeTestOperand;
/*     */   
/*     */   public ASTWMEFieldTest(int paramInt)
/*     */   {
/*  15 */     super(paramInt);
/*     */   }
/*     */   
/*     */   public ASTWMEFieldTest(BeatParser paramBeatParser, int paramInt) {
/*  19 */     super(paramBeatParser, paramInt);
/*     */   }
/*     */   
/*     */   void setWMEFieldName(String paramString) {
/*  23 */     this.wmeFieldName = paramString;
/*     */   }
/*     */   
/*  26 */   void setTestOp(int paramInt) { this.testOp = paramInt; }
/*     */   
/*     */   void setWMETestOperand(ASTBeatExpression paramASTBeatExpression) {
/*  29 */     this.wmeTestOperand = paramASTBeatExpression;
/*     */   }
/*     */   
/*     */   private final String getWMEFieldType()
/*     */     throws ClassNotFoundException, NoSuchFieldException
/*     */   {
/*  35 */     String str = ((ASTWMETest)jjtGetParent()).wmeClassName;
/*     */     try {
/*  37 */       return getWMEFieldType(str, this.wmeFieldName).getName();
/*  38 */     } catch (NoSuchMethodException localNoSuchMethodException) { throw new NoSuchFieldException();
/*     */     }
/*     */   }
/*     */   
/*  42 */   BeatScopeMaintainer getEnclosingBeatScope() { return ((ASTWMETest)jjtGetParent()).getEnclosingBeatScope(); }
/*     */   
/*     */   BeatScopeMaintainer getEnclosingScope() {
/*  45 */     return ((ASTWMETest)jjtGetParent()).getEnclosingScope();
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
/*     */   FieldDescriptor preprocessVariableRef()
/*     */     throws CompileException
/*     */   {
/*     */     try
/*     */     {
/*  63 */       String str = getWMEFieldType();
/*  64 */       if ((this.wmeTestOperand.isIdentifier()) && (this.testOp == 78))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  69 */         BeatScopeMaintainer localBeatScopeMaintainer = getEnclosingScope();
/*     */         
/*  71 */         if (!this.wmeTestOperand.getRef().declaredInLocalScope(localBeatScopeMaintainer))
/*     */         {
/*     */ 
/*  74 */           localObject = new FieldDescriptor();
/*  75 */           ((FieldDescriptor)localObject).addFieldName(this.wmeTestOperand.getRef().getName());
/*  76 */           ((FieldDescriptor)localObject).fieldType = str;
/*  77 */           localBeatScopeMaintainer.addVariableDeclaration((FieldDescriptor)localObject);
/*  78 */           return (FieldDescriptor)localObject;
/*     */         }
/*     */         
/*     */ 
/*  82 */         Object localObject = this.wmeTestOperand.getRef().lookupFieldType(localBeatScopeMaintainer);
/*  83 */         if (localObject != str.intern()) {
/*  84 */           throw new CompileException(getFirstLineNumber(), "Type error in WME field test: " + dumpTokens());
/*     */         }
/*     */       }
/*  87 */       return null;
/*     */     }
/*     */     catch (ClassNotFoundException localClassNotFoundException)
/*     */     {
/*  91 */       throw new CompileException(getFirstLineNumber(), "Reference to undefined WME " + localClassNotFoundException.getMessage() + " in WME test: " + dumpTokens());
/*     */     }
/*     */     catch (NoSuchFieldException localNoSuchFieldException)
/*     */     {
/*  95 */       throw new CompileException(getFirstLineNumber(), "Reference to undefined WME field in WME test: " + dumpTokens());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBoundVariable()
/*     */   {
/* 102 */     if ((this.wmeTestOperand.isIdentifier()) && (this.testOp == 78)) {
/* 103 */       return this.wmeTestOperand.getRef().getName();
/*     */     }
/*     */     
/* 106 */     return null;
/*     */   }
/*     */   
/*     */   protected int getTestType() {
/* 110 */     return ((ASTWMETest)jjtGetParent()).getTestType();
/*     */   }
/*     */   
/*     */   public JavaCodeDescriptor compileToJava() throws CompileException {
/* 114 */     int i = ((ASTWMETest)jjtGetParent()).getWMECounter();
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
/* 125 */     BeatScopeMaintainer localBeatScopeMaintainer = getEnclosingScope();
/* 126 */     String str1 = this.wmeTestOperand.getVariableReferenceConstantOrLiteral(localBeatScopeMaintainer);
/*     */     
/*     */ 
/* 129 */     StringBuffer localStringBuffer = new StringBuffer();
/*     */     
/* 131 */     String str2 = "get" + uppercaseFirstCharacter(this.wmeFieldName) + "()";
/*     */     
/* 133 */     if (this.testOp == 78)
/*     */     {
/*     */ 
/*     */ 
/* 137 */       localStringBuffer.append("DramaManager.constantTrue(" + str1 + " = wme__" + i + '.' + str2 + ')');
/*     */     }
/*     */     else
/*     */     {
/*     */       String str3;
/*     */       
/*     */ 
/*     */ 
/*     */       try
/*     */       {
/* 147 */         str3 = getWMEFieldType();
/*     */       }
/*     */       catch (ClassNotFoundException localClassNotFoundException) {
/* 150 */         throw new CompileException(getFirstLineNumber(), "Reference to undefined WME " + localClassNotFoundException.getMessage() + " in WME test: " + dumpTokens());
/*     */       }
/*     */       catch (NoSuchFieldException localNoSuchFieldException)
/*     */       {
/* 154 */         throw new CompileException(getFirstLineNumber(), "Reference to undefined WME field in WME test: " + dumpTokens());
/*     */       }
/*     */       
/*     */ 
/* 158 */       if (((str3.equals("java.lang.String")) || (str3.equals("String"))) && (stripQuotes(tokenImage[this.testOp]).equals("==")))
/*     */       {
/* 160 */         localStringBuffer.append("(wme__" + i + '.' + str2 + ".equals(" + str1 + "))");
/*     */       }
/*     */       else
/*     */       {
/* 164 */         localStringBuffer.append("( wme__" + i + '.' + str2 + ' ' + stripQuotes(tokenImage[this.testOp]) + ' ');
/*     */         
/*     */ 
/*     */ 
/* 168 */         localStringBuffer.append(str1 + " )");
/*     */       }
/*     */     }
/* 171 */     return new CodeStringDescriptor(localStringBuffer.toString());
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTWMEFieldTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */