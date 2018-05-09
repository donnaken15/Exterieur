/*     */ package dramaman.compiler;
/*     */ 
/*     */ import jd.CodeBlockDescriptor;
/*     */ 
/*     */ public class ASTTestExpression extends BeatScopeMaintainer
/*     */ {
/*     */   public static final int PRECONDITION = 0;
/*     */   public static final int WEIGHT_TEST = 1;
/*     */   public static final int PRIORITY_TEST = 2;
/*     */   private int testType;
/*     */   private int testCounter;
/*     */   private java.util.List testList;
/*     */   private java.util.ListIterator testIter;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  17 */     this.testType = -1;
/*     */     
/*     */ 
/*     */ 
/*  21 */     this.testList = new java.util.Vector();
/*     */   }
/*     */   
/*  24 */   public ASTTestExpression(int paramInt) { super(paramInt);jdMethod_this(); }
/*     */   
/*  26 */   public ASTTestExpression(BeatParser paramBeatParser, int paramInt) { super(paramBeatParser, paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */   void setTestType(int paramInt)
/*     */   {
/*  31 */     if ((paramInt < 0) || (paramInt > 2))
/*  32 */       throw new CompileError("Illegal test type in call to ASTTestExpression.setTestType(int)");
/*  33 */     this.testType = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */   int getTestType()
/*     */   {
/*  39 */     if (this.testType == -1)
/*  40 */       throw new CompileError("Attempt to get the test type of an ASTTestExpression node before the test type was set.");
/*  41 */     return this.testType;
/*     */   }
/*     */   
/*     */   BeatScopeMaintainer getEnclosingBeatScope() {
/*  45 */     return ((BeatParseNode)jjtGetParent()).getEnclosingBeatScope();
/*     */   }
/*     */   
/*     */   CodeBlockDescriptor compileNextTest()
/*     */     throws CompileException
/*     */   {
/*  51 */     this.testCounter += 1;
/*  52 */     if (!this.testIter.hasNext())
/*     */     {
/*  54 */       throw new CompileError("Call to ASTTestExpression.compileNextTest() with no more tests.");
/*     */     }
/*  56 */     return (CodeBlockDescriptor)((Compileable)this.testIter.next()).compileToJava();
/*     */   }
/*     */   
/*     */ 
/*     */   public int getTestCounter()
/*     */   {
/*  62 */     return this.testCounter;
/*     */   }
/*     */   
/*  65 */   public boolean hasNextTest() { return this.testIter.hasNext(); }
/*     */   
/*     */   java.util.HashSet getBoundVariables() {
/*  68 */     java.util.HashSet localHashSet = new java.util.HashSet();
/*     */     
/*     */ 
/*  71 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/*  74 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/*  75 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMETest")
/*     */       {
/*  77 */         localHashSet.addAll(((ASTWMETest)localBeatParseNode).getBoundVariables());
/*     */       }
/*     */     }
/*  80 */     return localHashSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected boolean allNegatedTests()
/*     */   {
/*  87 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/*  90 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/*  91 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMETest")
/*     */       {
/*  93 */         if (!((ASTWMETest)localBeatParseNode).negated) {
/*  94 */           return false;
/*     */         }
/*  96 */       } else if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "ConditionalExpression")
/*  97 */         return false;
/*     */     }
/*  99 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final java.util.HashSet preprocessVariableRefs()
/*     */     throws CompileException
/*     */   {
/* 107 */     java.util.HashSet localHashSet = new java.util.HashSet();
/*     */     
/*     */ 
/* 110 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/* 113 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 114 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMETest")
/*     */       {
/* 116 */         localHashSet.addAll(((ASTWMETest)localBeatParseNode).preprocessVariableRefs());
/*     */       }
/*     */     }
/* 119 */     return localHashSet;
/*     */   }
/*     */   
/*     */   void initializeTestScope(String paramString)
/*     */     throws CompileException
/*     */   {
/* 125 */     super.initializeScope(1, paramString, getNextEnclosingScope());
/* 126 */     preprocessVariableRefs();
/*     */   }
/*     */   
/*     */ 
/*     */   void compileVariableCopyThrough(CodeBlockDescriptor paramCodeBlockDescriptor)
/*     */   {
/* 132 */     java.util.List localList = getDeclaredVariables();
/* 133 */     java.util.Iterator localIterator = localList.iterator();
/* 134 */     String[] arrayOfString; int i; for (; localIterator.hasNext(); 
/*     */         
/*     */ 
/* 137 */         i < arrayOfString.length)
/*     */     {
/* 135 */       jd.FieldDescriptor localFieldDescriptor = (jd.FieldDescriptor)localIterator.next();
/* 136 */       arrayOfString = localFieldDescriptor.getFieldNames();
/* 137 */       i = 0; continue;
/* 138 */       if ((lookupVariableScopeInParentScope(arrayOfString[i]) != -1) && (lookupVariableTypeInParentScope(arrayOfString[i]).equals(localFieldDescriptor.fieldType)))
/*     */       {
/*     */ 
/*     */ 
/* 142 */         paramCodeBlockDescriptor.addToBlockBody(new jd.CodeStringDescriptor("_scope.getParentVariable(\"" + arrayOfString[i] + "\").value = _scope.getVariable(\"" + arrayOfString[i] + "\").value;"));
/*     */       }
/* 137 */       i++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final CodeBlockDescriptor compileTests()
/*     */     throws CompileException
/*     */   {
/* 150 */     this.testCounter = 0;
/*     */     
/* 152 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/* 155 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 156 */       if ((BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMETest") || (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "ConditionalExpression"))
/*     */       {
/* 158 */         this.testList.add((Compileable)localBeatParseNode);
/*     */       }
/*     */     }
/* 161 */     this.testIter = this.testList.listIterator();
/* 162 */     if (this.testIter.hasNext()) {
/* 163 */       return (CodeBlockDescriptor)((Compileable)this.testIter.next()).compileToJava();
/*     */     }
/*     */     
/* 166 */     return null;
/*     */   }
/*     */   
/*     */   public CodeBlockDescriptor compileToJava() throws CompileException
/*     */   {
/* 171 */     CodeBlockDescriptor localCodeBlockDescriptor = compileTests();
/* 172 */     if (!allNegatedTests())
/*     */     {
/*     */ 
/*     */ 
/* 176 */       localCodeBlockDescriptor.addToBlockBody(new jd.CodeStringDescriptor("return false;")); }
/* 177 */     return localCodeBlockDescriptor;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTTestExpression.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */