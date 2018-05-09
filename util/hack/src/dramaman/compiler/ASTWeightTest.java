/*    */ package dramaman.compiler;
/*    */ 
/*    */ import jd.MethodDescriptor;
/*    */ 
/*    */ public class ASTWeightTest extends BeatTest {
/*    */   private float weight;
/*    */   private boolean weightDefined;
/*    */   
/*    */   private final void jdMethod_this() {
/* 10 */     this.weight = 1.0F;
/* 11 */     this.weightDefined = false;
/*    */   }
/*    */   
/* 14 */   public ASTWeightTest(int paramInt) { super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   public ASTWeightTest(BeatParser paramBeatParser, int paramInt) {
/* 18 */     super(paramBeatParser, paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   boolean getWeightDefined() {
/* 22 */     return this.weightDefined;
/*    */   }
/*    */   
/* 25 */   float getWeight() { return this.weight; }
/*    */   
/*    */   void setWeight(float paramFloat) {
/* 28 */     if (!this.weightDefined) {
/* 29 */       this.weight = paramFloat;
/* 30 */       this.weightDefined = true;
/*    */     }
/*    */     else {
/* 33 */       throw new CompileError("Attempt to set the weight more than once on a weight test");
/*    */     }
/*    */   }
/*    */   
/* 37 */   BeatScopeMaintainer getEnclosingBeatScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingBeatScope(); }
/*    */   
/* 39 */   BeatScopeMaintainer getEnclosingScope() { return ((BeatParseNode)jjtGetParent()).getEnclosingScope(); }
/*    */   
/*    */ 
/*    */   String weightTestName(String paramString, int paramInt)
/*    */   {
/* 44 */     return "_" + paramString + "_weighttest" + paramInt;
/*    */   }
/*    */   
/*    */   MethodDescriptor compileToJava(String paramString, int paramInt)
/*    */     throws CompileException
/*    */   {
/* 50 */     return super.compileToJava(weightTestName(paramString, paramInt));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTWeightTest.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */