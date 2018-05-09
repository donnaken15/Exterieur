/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.ListIterator;
/*     */ import jd.CodeBlockDescriptor;
/*     */ import jd.CodeStringDescriptor;
/*     */ import jd.FieldDescriptor;
/*     */ import jd.JavaCodeDescriptor;
/*     */ import jd.NestableCodeDescriptor;
/*     */ import macro.SimpleMacro;
/*     */ import macro.SimpleMacroException;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ASTWMETest
/*     */   extends BeatParseNode
/*     */   implements Compileable
/*     */ {
/*  20 */   private static final SimpleMacro wmeTestGetWMEListNoMemory = new SimpleMacro(MacroDefinitions.wmeTestGetWMEListNoMemoryMacroString);
/*     */   
/*     */ 
/*  23 */   private static final SimpleMacro wmeTestGetWMEListMemory = new SimpleMacro(MacroDefinitions.wmeTestGetWMEListMemoryMacroString);
/*     */   
/*     */ 
/*     */ 
/*  27 */   private static final SimpleMacro wmeTestWhile = new SimpleMacro("definemacro wmeTestWhile(wmeCount)while(wmeIter@wmeCount.hasNext()) {");
/*     */   
/*     */ 
/*     */ 
/*  31 */   private static final SimpleMacro wmeTestWhileNextAssign = new SimpleMacro(MacroDefinitions.wmeTestWhileNextAssignMacroString);
/*     */   
/*     */ 
/*     */ 
/*  35 */   private static final SimpleMacro wmeTestWhileNextNoAssign = new SimpleMacro("definemacro wmeTestWhileNext(wmeCount, wmeClassName)wmeClassName wme__@wmeCount = (wmeClassName)wmeIter@wmeCount.next();");
/*     */   public boolean negated;
/*     */   public String wmeClassName;
/*     */   private ASTJavaName wmeAssignmentVariable;
/*     */   String memoryName;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  16 */     this.wmeAssignmentVariable = null;
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
/*  39 */     this.memoryName = null;
/*     */   }
/*     */   
/*     */   public ASTWMETest(int paramInt) {
/*  43 */     super(paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */   public ASTWMETest(BeatParser paramBeatParser, int paramInt) {
/*  47 */     super(paramBeatParser, paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   BeatScopeMaintainer getEnclosingScope()
/*     */   {
/*  58 */     return (ASTTestExpression)jjtGetParent();
/*     */   }
/*     */   
/*     */   void setMemoryName(String paramString) {
/*  62 */     this.memoryName = paramString;
/*     */   }
/*     */   
/*  65 */   void setWMEAssignmentVariable(ASTJavaName paramASTJavaName) { this.wmeAssignmentVariable = paramASTJavaName; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   HashSet preprocessVariableRefs()
/*     */     throws CompileException
/*     */   {
/*  75 */     HashSet localHashSet = new HashSet();
/*     */     
/*     */     FieldDescriptor localFieldDescriptor;
/*  78 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/*     */ 
/*  82 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/*  83 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMEFieldTest")
/*     */       {
/*     */ 
/*  86 */         localFieldDescriptor = ((ASTWMEFieldTest)localBeatParseNode).preprocessVariableRef();
/*  87 */         if (localFieldDescriptor != null)
/*  88 */           localHashSet.add(localFieldDescriptor);
/*     */       }
/*     */     }
/*  91 */     if (this.wmeAssignmentVariable != null)
/*     */     {
/*  93 */       boolean bool = this.wmeAssignmentVariable.declaredInLocalScope(getEnclosingScope());
/*  94 */       if (!bool)
/*     */       {
/*  96 */         localFieldDescriptor = new FieldDescriptor();
/*  97 */         localFieldDescriptor.addFieldName(this.wmeAssignmentVariable.getName());
/*  98 */         localFieldDescriptor.fieldType = this.wmeClassName;
/*  99 */         localHashSet.add(localFieldDescriptor);
/* 100 */         getEnclosingScope().addVariableDeclaration(localFieldDescriptor);
/*     */       }
/* 102 */       else if (!this.wmeAssignmentVariable.lookupVariableType(getEnclosingScope()).equals(this.wmeClassName)) {
/* 103 */         throw new CompileException("Type error in WME assignment: " + prettyPrintTokens());
/*     */       }
/*     */     }
/* 106 */     return localHashSet;
/*     */   }
/*     */   
/*     */ 
/*     */   HashSet getBoundVariables()
/*     */   {
/* 112 */     HashSet localHashSet = new HashSet();
/*     */     
/*     */ 
/* 115 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/*     */ 
/* 119 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 120 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMEFieldTest")
/*     */       {
/*     */ 
/* 123 */         String str = ((ASTWMEFieldTest)localBeatParseNode).getBoundVariable();
/* 124 */         if (str != null)
/* 125 */           localHashSet.add(str);
/*     */       }
/*     */     }
/* 128 */     if (this.wmeAssignmentVariable != null) {
/* 129 */       localHashSet.add(this.wmeAssignmentVariable.getName());
/*     */     }
/* 131 */     return localHashSet;
/*     */   }
/*     */   
/*     */   int getWMECounter() {
/* 135 */     return ((ASTTestExpression)jjtGetParent()).getTestCounter();
/*     */   }
/*     */   
/*     */   protected LinkedList compileFieldTests() throws CompileException
/*     */   {
/* 140 */     LinkedList localLinkedList = new LinkedList();
/*     */     
/* 142 */     if (jjtGetNumChildren() == 0) {
/* 143 */       localLinkedList.add(new CodeStringDescriptor("true"));
/* 144 */       return localLinkedList;
/*     */     }
/*     */     
/* 147 */     for (int i = 0; i < jjtGetNumChildren(); i++)
/*     */     {
/*     */ 
/*     */ 
/* 151 */       BeatParseNode localBeatParseNode = (BeatParseNode)jjtGetChild(i);
/* 152 */       if (BeatParserTreeConstants.jjtNodeName[localBeatParseNode.id] == "WMEFieldTest")
/*     */       {
/*     */ 
/* 155 */         localLinkedList.add(((ASTWMEFieldTest)localBeatParseNode).compileToJava());
/*     */       }
/*     */     }
/* 158 */     return localLinkedList;
/*     */   }
/*     */   
/*     */   int getTestType() {
/* 162 */     return ((ASTTestExpression)jjtGetParent()).getTestType();
/*     */   }
/*     */   
/*     */   public JavaCodeDescriptor compileToJava() throws CompileException
/*     */   {
/*     */     try {
/* 168 */       int i = ((ASTTestExpression)jjtGetParent()).getTestCounter();
/* 169 */       CodeBlockDescriptor localCodeBlockDescriptor1 = new CodeBlockDescriptor();
/*     */       
/*     */ 
/* 172 */       String[] arrayOfString1 = { Integer.toString(i), this.wmeClassName };
/*     */       
/* 174 */       if (this.memoryName == null)
/*     */       {
/* 176 */         localCodeBlockDescriptor1.addToBlockBody(new CodeStringDescriptor(wmeTestGetWMEListNoMemory.expand(arrayOfString1)));
/*     */       }
/*     */       else {
/* 179 */         localObject1 = new String[] { Integer.toString(i), this.wmeClassName, this.memoryName };
/* 180 */         localCodeBlockDescriptor1.addToBlockBody(new CodeStringDescriptor(wmeTestGetWMEListMemory.expand((String[])localObject1)));
/*     */       }
/*     */       
/* 183 */       Object localObject1 = new CodeBlockDescriptor();
/* 184 */       String[] arrayOfString2 = { Integer.toString(i) };
/* 185 */       ((CodeBlockDescriptor)localObject1).setBlockHeader(wmeTestWhile.expand(arrayOfString2));
/* 186 */       ((CodeBlockDescriptor)localObject1).setBlockFooter("}");
/* 187 */       if (this.wmeAssignmentVariable != null) {
/* 188 */         localObject2 = this.wmeAssignmentVariable.getVariableReference(getEnclosingScope());
/* 189 */         localObject3 = new String[] { Integer.toString(i), this.wmeClassName, localObject2 };
/* 190 */         ((CodeBlockDescriptor)localObject1).addToBlockBody(new CodeStringDescriptor(wmeTestWhileNextAssign.expand((String[])localObject3)));
/*     */       }
/*     */       else {
/* 193 */         ((CodeBlockDescriptor)localObject1).addToBlockBody(new CodeStringDescriptor(wmeTestWhileNextNoAssign.expand(arrayOfString1)));
/*     */       }
/*     */       
/* 196 */       Object localObject2 = new CodeBlockDescriptor("if (", ")");
/*     */       
/* 198 */       Object localObject3 = compileFieldTests();
/* 199 */       ListIterator localListIterator = ((LinkedList)localObject3).listIterator();
/* 200 */       if (localListIterator.hasNext())
/*     */       {
/* 202 */         ((CodeBlockDescriptor)localObject2).addToBlockBody((CodeStringDescriptor)localListIterator.next());
/*     */       }
/*     */       
/* 205 */       while (localListIterator.hasNext()) {
/* 206 */         ((CodeBlockDescriptor)localObject2).addToBlockBody(new CodeStringDescriptor("&&"));
/* 207 */         ((CodeBlockDescriptor)localObject2).addToBlockBody((CodeStringDescriptor)localListIterator.next());
/*     */       }
/*     */       
/* 210 */       CodeBlockDescriptor localCodeBlockDescriptor2 = new CodeBlockDescriptor("{", "}");
/*     */       
/* 212 */       if (!this.negated)
/*     */       {
/* 214 */         if (((ASTTestExpression)jjtGetParent()).hasNextTest()) {
/* 215 */           localCodeBlockDescriptor2.addToBlockBody(((ASTTestExpression)jjtGetParent()).compileNextTest());
/*     */         }
/*     */         else {
/* 218 */           ((ASTTestExpression)jjtGetParent()).compileVariableCopyThrough(localCodeBlockDescriptor2);
/* 219 */           localCodeBlockDescriptor2.addToBlockBody(new CodeStringDescriptor("return true;"));
/*     */         }
/*     */         
/*     */       }
/*     */       else {
/* 224 */         localCodeBlockDescriptor2.addToBlockBody(new CodeStringDescriptor("return false;"));
/*     */       }
/* 226 */       ((CodeBlockDescriptor)localObject1).addToBlockBody((NestableCodeDescriptor)localObject2);
/* 227 */       ((CodeBlockDescriptor)localObject1).addToBlockBody(localCodeBlockDescriptor2);
/* 228 */       localCodeBlockDescriptor1.addToBlockBody((NestableCodeDescriptor)localObject1);
/* 229 */       if (this.negated)
/*     */       {
/* 231 */         if (((ASTTestExpression)jjtGetParent()).hasNextTest()) {
/* 232 */           localCodeBlockDescriptor1.addToBlockBody(((ASTTestExpression)jjtGetParent()).compileNextTest());
/*     */         }
/*     */         else {
/* 235 */           ((ASTTestExpression)jjtGetParent()).compileVariableCopyThrough(localCodeBlockDescriptor1);
/* 236 */           localCodeBlockDescriptor1.addToBlockBody(new CodeStringDescriptor("return true;"));
/*     */         }
/*     */       }
/* 239 */       return localCodeBlockDescriptor1;
/*     */     }
/*     */     catch (SimpleMacroException localSimpleMacroException) {
/* 242 */       throw new CompileError("Error in ASTWMETest.compileToJava()", localSimpleMacroException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTWMETest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */