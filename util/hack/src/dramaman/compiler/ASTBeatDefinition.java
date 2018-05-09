/*     */ package dramaman.compiler;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.Iterator;
/*     */ import java.util.Vector;
/*     */ import jd.CodeStringDescriptor;
/*     */ import jd.FieldDescriptor;
/*     */ import jd.MethodDescriptor;
/*     */ import jd.NestableCodeDescriptor;
/*     */ 
/*     */ public class ASTBeatDefinition
/*     */   extends BeatScopeMaintainer
/*     */   implements BeatParserTreeConstants
/*     */ {
/*     */   private String beatName;
/*     */   private boolean staticWeightDefined;
/*     */   private boolean staticPriorityDefined;
/*     */   private float weight;
/*     */   private int priority;
/*     */   private String discourseRulesFilename;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  13 */     this.beatName = null;
/*  14 */     this.staticWeightDefined = false;
/*  15 */     this.staticPriorityDefined = false;
/*  16 */     this.weight = 1.0F;
/*  17 */     this.priority = 0;
/*     */     
/*     */ 
/*     */ 
/*  21 */     this.beatIDDefined = false;
/*  22 */     this.effects = new Vector();
/*  23 */     this.preconditions = new Vector();
/*  24 */     this.weightTests = new Vector();
/*  25 */     this.priorityTests = new Vector();
/*  26 */     this.initAction = null;
/*  27 */     this.selectAction = null;
/*  28 */     this.abortAction = null;
/*  29 */     this.succeedAction = null;
/*     */   }
/*     */   
/*     */   public ASTBeatDefinition(int paramInt)
/*     */   {
/*  31 */     super(paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */   public ASTBeatDefinition(BeatParser paramBeatParser, int paramInt)
/*     */   {
/*  33 */     super(paramBeatParser, paramInt);jdMethod_this();
/*     */   }
/*     */   
/*     */   void setBeatName(String paramString)
/*     */   {
/*  36 */     this.beatName = uppercaseFirstCharacter(paramString);
/*     */   }
/*     */   
/*     */   String getBeatName()
/*     */   {
/*  37 */     return new String(this.beatName);
/*     */   }
/*     */   
/*     */   boolean getStaticWeightDefined()
/*     */   {
/*  40 */     return this.staticWeightDefined;
/*     */   }
/*     */   
/*     */   boolean getStaticPriorityDefined()
/*     */   {
/*  43 */     return this.staticPriorityDefined;
/*     */   }
/*     */   
/*     */   float getWeight()
/*     */   {
/*  46 */     return this.weight;
/*     */   }
/*     */   
/*     */   void setWeight(float paramFloat)
/*     */     throws CompileException
/*     */   {
/*  49 */     if (!this.staticWeightDefined)
/*     */     {
/*  50 */       this.weight = paramFloat;
/*  51 */       this.staticWeightDefined = true;
/*     */     }
/*     */     else
/*     */     {
/*  54 */       throw new CompileException("Multiple static weights for beat " + this.beatName);
/*     */     }
/*     */   }
/*     */   
/*     */   int getPriority()
/*     */   {
/*  58 */     return this.priority;
/*     */   }
/*     */   
/*     */   void setPriority(int paramInt)
/*     */     throws CompileException
/*     */   {
/*  61 */     if (!this.staticPriorityDefined)
/*     */     {
/*  62 */       this.priority = paramInt;
/*  63 */       this.staticPriorityDefined = true;
/*     */     }
/*     */     else
/*     */     {
/*  66 */       throw new CompileException("Multiple static priorities for beat " + this.beatName);
/*     */     }
/*     */   }
/*     */   
/*     */   float getBeatID()
/*     */   {
/*  70 */     return this.beatID;
/*     */   }
/*     */   
/*     */   void setBeatID(int paramInt)
/*     */     throws CompileException
/*     */   {
/*  73 */     if (!this.beatIDDefined)
/*     */     {
/*  74 */       this.beatID = paramInt;
/*  75 */       this.beatIDDefined = true;
/*     */     }
/*     */     else
/*     */     {
/*  78 */       throw new CompileException("Multiple beatIDs for beat " + this.beatName);
/*     */     }
/*     */   }
/*     */   
/*     */   private String beatBehaviorsFilename;
/*     */   private int beatID;
/*     */   
/*     */   ASTEffect[] getEffects()
/*     */   {
/*  84 */     return (ASTEffect[])this.effects.toArray(new ASTEffect[this.effects.size()]);
/*     */   }
/*     */   
/*     */   void addEffect(ASTEffect paramASTEffect)
/*     */   {
/*  86 */     this.effects.add(paramASTEffect);
/*     */   }
/*     */   
/*     */   private boolean beatIDDefined;
/*     */   private Vector effects;
/*     */   private Vector preconditions;
/*     */   
/*     */   ASTPrecondition[] getPreconditions()
/*     */   {
/*  91 */     return (ASTPrecondition[])this.preconditions.toArray(new ASTPrecondition[this.preconditions.size()]);
/*     */   }
/*     */   
/*     */   void addPrecondition(ASTPrecondition paramASTPrecondition)
/*     */   {
/*  93 */     this.preconditions.add(paramASTPrecondition);
/*     */   }
/*     */   
/*     */   private Vector weightTests;
/*     */   private Vector priorityTests;
/*     */   
/*     */   ASTWeightTest[] getWeightTests()
/*     */   {
/*  98 */     return (ASTWeightTest[])this.weightTests.toArray(new ASTWeightTest[this.weightTests.size()]);
/*     */   }
/*     */   
/*     */   void addWeightTest(ASTWeightTest paramASTWeightTest)
/*     */   {
/* 100 */     this.weightTests.add(paramASTWeightTest);
/*     */   }
/*     */   
/*     */   private ASTInitAction initAction;
/*     */   
/*     */   ASTPriorityTest[] getPriorityTests()
/*     */   {
/* 105 */     return (ASTPriorityTest[])this.priorityTests.toArray(new ASTPriorityTest[this.priorityTests.size()]);
/*     */   }
/*     */   
/*     */   private ASTSelectAction selectAction;
/*     */   void addPriorityTest(ASTPriorityTest paramASTPriorityTest)
/*     */   {
/* 107 */     this.priorityTests.add(paramASTPriorityTest);
/*     */   }
/*     */   
/*     */   private ASTAbortAction abortAction;
/*     */   private ASTSucceedAction succeedAction;
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.compiler.ASTBeatDefinition;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   File getDiscourseRulesFilename()
/*     */   {
/* 112 */     if ((!$noassert) && (this.discourseRulesFilename == null)) throw new AssertionError();
/* 113 */     return new File(this.discourseRulesFilename);
/*     */   }
/*     */   
/*     */   void setDiscourseRulesFilename(String paramString)
/*     */   {
/* 117 */     if ((!$noassert) && (this.discourseRulesFilename != null)) throw new AssertionError();
/* 118 */     this.discourseRulesFilename = paramString;
/*     */   }
/*     */   
/*     */   File getBeatBehaviorsFilename()
/*     */   {
/* 124 */     if ((!$noassert) && (this.beatBehaviorsFilename == null)) throw new AssertionError();
/* 125 */     return new File(this.beatBehaviorsFilename);
/*     */   }
/*     */   
/*     */   void setBeatBehaviorsFilename(String paramString)
/*     */   {
/* 129 */     if ((!$noassert) && (this.beatBehaviorsFilename != null)) throw new AssertionError();
/* 130 */     this.beatBehaviorsFilename = paramString;
/*     */   }
/*     */   
/*     */   ASTInitAction getInitAction()
/*     */   {
/* 134 */     return this.initAction;
/*     */   }
/*     */   
/*     */   void setInitAction(ASTInitAction paramASTInitAction)
/*     */     throws CompileException
/*     */   {
/* 138 */     if (this.initAction != null) {
/* 139 */       throw new CompileException("Multiple init actions for beat " + this.beatName);
/*     */     }
/* 141 */     this.initAction = paramASTInitAction;
/*     */   }
/*     */   
/*     */   ASTSelectAction getSelectAction()
/*     */   {
/* 145 */     return this.selectAction;
/*     */   }
/*     */   
/*     */   void setSelectAction(ASTSelectAction paramASTSelectAction)
/*     */     throws CompileException
/*     */   {
/* 149 */     if (this.selectAction != null) {
/* 150 */       throw new CompileException("Multiple select actions for beat " + this.beatName);
/*     */     }
/* 152 */     this.selectAction = paramASTSelectAction;
/*     */   }
/*     */   
/*     */   ASTAbortAction getAbortAction()
/*     */   {
/* 156 */     return this.abortAction;
/*     */   }
/*     */   
/*     */   void setAbortAction(ASTAbortAction paramASTAbortAction)
/*     */     throws CompileException
/*     */   {
/* 160 */     if (this.abortAction != null) {
/* 161 */       throw new CompileException("Multiple abort actions for beat " + this.beatName);
/*     */     }
/* 163 */     this.abortAction = paramASTAbortAction;
/*     */   }
/*     */   
/*     */   ASTSucceedAction getSucceedAction()
/*     */   {
/* 167 */     return this.succeedAction;
/*     */   }
/*     */   
/*     */   void setSucceedAction(ASTSucceedAction paramASTSucceedAction)
/*     */     throws CompileException
/*     */   {
/* 171 */     if (this.succeedAction != null) {
/* 172 */       throw new CompileException("Multiple succeed actions for beat " + this.beatName);
/*     */     }
/* 174 */     this.succeedAction = paramASTSucceedAction;
/*     */   }
/*     */   
/*     */   BeatScopeMaintainer getEnclosingBeatScope()
/*     */   {
/* 179 */     return this;
/*     */   }
/*     */   
/*     */   Vector compileTestsToJava()
/*     */     throws CompileException
/*     */   {
/* 184 */     Vector localVector = new Vector();
/* 185 */     int i = 0;
/* 186 */     int j = 0;
/* 187 */     int k = 0;
/*     */     
/*     */ 
/* 190 */     Iterator localIterator1 = this.preconditions.iterator();
/* 191 */     while (localIterator1.hasNext()) {
/* 192 */       i++;
/* 193 */       localVector.add(((ASTPrecondition)localIterator1.next()).compileToJava(this.beatName, i));
/*     */     }
/*     */     
/*     */ 
/* 197 */     Iterator localIterator2 = this.weightTests.iterator();
/* 198 */     while (localIterator2.hasNext()) {
/* 199 */       j++;
/* 200 */       localVector.add(((ASTWeightTest)localIterator2.next()).compileToJava(this.beatName, j));
/*     */     }
/*     */     
/*     */ 
/* 204 */     Iterator localIterator3 = this.priorityTests.iterator();
/* 205 */     while (localIterator3.hasNext()) {
/* 206 */       k++;
/* 207 */       localVector.add(((ASTPriorityTest)localIterator3.next()).compileToJava(this.beatName, k));
/*     */     }
/*     */     
/* 210 */     return localVector;
/*     */   }
/*     */   
/*     */   Vector compileActionsToJava()
/*     */     throws CompileException
/*     */   {
/* 216 */     Vector localVector = new Vector();
/*     */     
/* 218 */     if (this.initAction != null) {
/* 219 */       localVector.add(this.initAction.compileToJava(this.beatName));
/*     */     }
/* 221 */     if (this.selectAction != null) {
/* 222 */       localVector.add(this.selectAction.compileToJava(this.beatName));
/*     */     }
/* 224 */     if (this.abortAction != null) {
/* 225 */       localVector.add(this.abortAction.compileToJava(this.beatName));
/*     */     }
/* 227 */     if (this.succeedAction != null) {
/* 228 */       localVector.add(this.succeedAction.compileToJava(this.beatName));
/*     */     }
/* 230 */     return localVector;
/*     */   }
/*     */   
/*     */   MethodDescriptor compileFactory()
/*     */     throws CompileException
/*     */   {
/* 235 */     if (!this.beatIDDefined) { throw new CompileError("No beatID defined for beat " + this.beatName);
/*     */     }
/* 237 */     MethodDescriptor localMethodDescriptor = new MethodDescriptor();
/* 238 */     localMethodDescriptor.methodName = ("_" + this.beatName + "_factory");
/* 239 */     localMethodDescriptor.addModifier("public");
/* 240 */     localMethodDescriptor.addModifier("static");
/* 241 */     localMethodDescriptor.addModifier("Beat");
/*     */     
/*     */ 
/*     */ 
/* 245 */     Iterator localIterator1 = this.effects.iterator();
/* 246 */     StringBuffer localStringBuffer1 = new StringBuffer();
/* 247 */     if (localIterator1.hasNext()) {
/* 248 */       localStringBuffer1.append("{");
/* 249 */       while (localIterator1.hasNext()) {
/* 250 */         localStringBuffer1.append(((ASTEffect)localIterator1.next()).compileToJava());
/* 251 */         if (localIterator1.hasNext()) {
/* 252 */           localStringBuffer1.append(", ");
/*     */         } else {
/* 254 */           localStringBuffer1.append("}");
/*     */         }
/*     */       }
/*     */     } else {
/* 258 */       localStringBuffer1.append("new StoryEffect[0]");
/*     */     }
/* 260 */     FieldDescriptor localFieldDescriptor1 = new FieldDescriptor();
/* 261 */     localFieldDescriptor1.fieldType = "StoryEffect[]";
/* 262 */     localFieldDescriptor1.addFieldName("effects");
/* 263 */     localFieldDescriptor1.initializer = localStringBuffer1.toString();
/* 264 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor1);
/*     */     
/*     */ 
/* 267 */     StringBuffer localStringBuffer2 = new StringBuffer();
/* 268 */     Iterator localIterator2 = this.preconditions.iterator();
/* 269 */     if (localIterator2.hasNext()) {
/* 270 */       localStringBuffer2.append("{");
/* 271 */       int i = 0;
/* 272 */       while (localIterator2.hasNext()) {
/* 273 */         localObject1 = (ASTPrecondition)localIterator2.next();
/* 274 */         localStringBuffer2.append("\"" + ((ASTPrecondition)localObject1).preconditionName(this.beatName, ++i) + '"');
/* 275 */         if (localIterator2.hasNext()) {
/* 276 */           localStringBuffer2.append(", ");
/*     */         } else {
/* 278 */           localStringBuffer2.append("}");
/*     */         }
/*     */       }
/*     */     } else {
/* 282 */       localStringBuffer2.append("new String[0]"); }
/* 283 */     FieldDescriptor localFieldDescriptor2 = new FieldDescriptor();
/* 284 */     localFieldDescriptor2.fieldType = "String[]";
/* 285 */     localFieldDescriptor2.addFieldName("preconditionNames");
/* 286 */     localFieldDescriptor2.initializer = localStringBuffer2.toString();
/* 287 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor2);
/*     */     
/*     */ 
/* 290 */     Object localObject1 = new StringBuffer();
/* 291 */     Iterator localIterator3 = this.weightTests.iterator();
/* 292 */     if (localIterator3.hasNext()) {
/* 293 */       ((StringBuffer)localObject1).append("{");
/* 294 */       int j = 0;
/* 295 */       while (localIterator3.hasNext()) {
/* 296 */         localObject2 = (ASTWeightTest)localIterator3.next();
/* 297 */         ((StringBuffer)localObject1).append("new Beat.WeightTest(\"" + ((ASTWeightTest)localObject2).weightTestName(this.beatName, ++j) + "\", " + ((ASTWeightTest)localObject2).getWeight() + "f)");
/*     */         
/*     */ 
/* 300 */         if (localIterator3.hasNext()) {
/* 301 */           ((StringBuffer)localObject1).append(", ");
/*     */         }
/*     */         else {
/* 304 */           ((StringBuffer)localObject1).append("}");
/*     */         }
/*     */       }
/*     */     }
/*     */     else {
/* 309 */       ((StringBuffer)localObject1).append("new Beat.WeightTest[0]");
/*     */     }
/* 311 */     FieldDescriptor localFieldDescriptor3 = new FieldDescriptor();
/* 312 */     localFieldDescriptor3.fieldType = "Beat.WeightTest[]";
/* 313 */     localFieldDescriptor3.addFieldName("weightTestArray");
/* 314 */     localFieldDescriptor3.initializer = ((StringBuffer)localObject1).toString();
/* 315 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor3);
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
/* 359 */     Object localObject2 = new StringBuffer();
/* 360 */     Iterator localIterator4 = this.priorityTests.iterator();
/* 361 */     if (localIterator4.hasNext()) {
/* 362 */       ((StringBuffer)localObject2).append("{");
/* 363 */       int k = 0;
/* 364 */       while (localIterator4.hasNext()) {
/* 365 */         localObject3 = (ASTPriorityTest)localIterator4.next();
/* 366 */         ((StringBuffer)localObject2).append("new Beat.PriorityTest(\"" + ((ASTPriorityTest)localObject3).priorityTestName(this.beatName, ++k) + "\", " + ((ASTPriorityTest)localObject3).getPriority() + ')');
/*     */         
/*     */ 
/* 369 */         if (localIterator4.hasNext()) {
/* 370 */           ((StringBuffer)localObject2).append(", ");
/*     */         }
/*     */         else {
/* 373 */           ((StringBuffer)localObject2).append("}");
/*     */         }
/*     */       }
/*     */     }
/*     */     else {
/* 378 */       ((StringBuffer)localObject2).append("new Beat.PriorityTest[0]");
/*     */     }
/* 380 */     FieldDescriptor localFieldDescriptor4 = new FieldDescriptor();
/* 381 */     localFieldDescriptor4.fieldType = "Beat.PriorityTest[]";
/* 382 */     localFieldDescriptor4.addFieldName("priorityTestArray");
/* 383 */     localFieldDescriptor4.initializer = ((StringBuffer)localObject2).toString();
/* 384 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor4);
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
/* 427 */     initializeScope(0, "beatName_scope", null);
/* 428 */     addChildVariableDeclarations();
/* 429 */     defineRuntimeScope(localMethodDescriptor, this.beatName, "null");
/*     */     
/*     */ 
/* 432 */     Object localObject3 = new FieldDescriptor();
/* 433 */     ((FieldDescriptor)localObject3).fieldType = "String";
/* 434 */     ((FieldDescriptor)localObject3).addFieldName("initActionMethodName");
/* 435 */     if (this.initAction != null)
/* 436 */       ((FieldDescriptor)localObject3).initializer = ("\"" + this.initAction.initActionName(this.beatName) + '"');
/* 437 */     localMethodDescriptor.addToBlockBody((NestableCodeDescriptor)localObject3);
/* 438 */     if (this.initAction == null) {
/* 439 */       localMethodDescriptor.addToBlockBody(new CodeStringDescriptor("initActionMethodName = null;"));
/*     */     }
/* 441 */     FieldDescriptor localFieldDescriptor5 = new FieldDescriptor();
/* 442 */     localFieldDescriptor5.fieldType = "String";
/* 443 */     localFieldDescriptor5.addFieldName("selectActionMethodName");
/* 444 */     if (this.selectAction != null)
/* 445 */       localFieldDescriptor5.initializer = ("\"" + this.selectAction.selectActionName(this.beatName) + '"');
/* 446 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor5);
/* 447 */     if (this.selectAction == null) {
/* 448 */       localMethodDescriptor.addToBlockBody(new CodeStringDescriptor("selectActionMethodName = null;"));
/*     */     }
/* 450 */     FieldDescriptor localFieldDescriptor6 = new FieldDescriptor();
/* 451 */     localFieldDescriptor6.fieldType = "String";
/* 452 */     localFieldDescriptor6.addFieldName("succeedActionMethodName");
/* 453 */     if (this.succeedAction != null)
/* 454 */       localFieldDescriptor6.initializer = ("\"" + this.succeedAction.succeedActionName(this.beatName) + '"');
/* 455 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor6);
/* 456 */     if (this.succeedAction == null) {
/* 457 */       localMethodDescriptor.addToBlockBody(new CodeStringDescriptor("succeedActionMethodName = null;"));
/*     */     }
/* 459 */     FieldDescriptor localFieldDescriptor7 = new FieldDescriptor();
/* 460 */     localFieldDescriptor7.fieldType = "String";
/* 461 */     localFieldDescriptor7.addFieldName("abortActionMethodName");
/* 462 */     if (this.abortAction != null)
/* 463 */       localFieldDescriptor7.initializer = ("\"" + this.abortAction.abortActionName(this.beatName) + '"');
/* 464 */     localMethodDescriptor.addToBlockBody(localFieldDescriptor7);
/* 465 */     if (this.abortAction == null) {
/* 466 */       localMethodDescriptor.addToBlockBody(new CodeStringDescriptor("abortActionMethodName = null;"));
/*     */     }
/*     */     
/* 469 */     localMethodDescriptor.addToBlockBody(new CodeStringDescriptor("return new Beat(" + this.beatID + ", \"" + this.beatName + "\", effects, " + this.weight + "f, " + this.priority + ", preconditionNames, weightTestArray, priorityTestArray, _scope, initActionMethodName, selectActionMethodName, succeedActionMethodName, abortActionMethodName);"));
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
/* 480 */     return localMethodDescriptor;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTBeatDefinition.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */