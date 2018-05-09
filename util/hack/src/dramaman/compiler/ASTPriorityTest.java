/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTPriorityTest extends BeatTest {
/*    */   private int priority;
/*    */   private boolean priorityDefined;
/*    */   
/*    */   private final void jdMethod_this() {
/* 10 */     this.priority = 0;
/* 11 */     this.priorityDefined = false;
/*    */   }
/*    */   
/* 14 */   public ASTPriorityTest(int paramInt) { super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   public ASTPriorityTest(BeatParser paramBeatParser, int paramInt) {
/* 18 */     super(paramBeatParser, paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   boolean getPriorityDefined() {
/* 22 */     return this.priorityDefined;
/*    */   }
/*    */   
/* 25 */   int getPriority() { return this.priority; }
/*    */   
/*    */   void setPriority(int paramInt) {
/* 28 */     if (!this.priorityDefined) {
/* 29 */       this.priority = paramInt;
/* 30 */       this.priorityDefined = true;
/*    */     }
/*    */     else {
/* 33 */       throw new CompileError("Attempt to set the priority more than once on a priority test");
/*    */     }
/*    */   }
/*    */   
/* 37 */   BeatScopeMaintainer getEnclosingBeatScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingBeatScope(); }
/*    */   
/* 39 */   BeatScopeMaintainer getEnclosingScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingScope(); }
/*    */   
/*    */ 
/*    */   String priorityTestName(String paramString, int paramInt)
/*    */   {
/* 44 */     return "_" + paramString + "_prioritytest" + paramInt;
/*    */   }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString, int paramInt)
/*    */     throws CompileException
/*    */   {
/* 50 */     return super.compileToJava(priorityTestName(paramString, paramInt));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTPriorityTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */