/*    */ package dramaman.compiler;
/*    */ 
/*    */ public class ASTEffect extends BeatParseNode {
/*    */   static final int INCREMENT = 0;
/*    */   static final int DECREMENT = 1;
/*    */   private String effectName;
/*    */   private int relativeValueDirection;
/*    */   private float effectValue;
/*    */   private static final boolean $noassert = Class.forName("[Ldramaman.compiler.ASTEffect;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   private final void jdMethod_this() {
/* 12 */     this.effectName = null;
/* 13 */     this.relativeValueDirection = -1;
/* 14 */     this.effectValue = Float.MAX_VALUE;
/*    */   }
/*    */   
/* 17 */   public ASTEffect(int paramInt) { super(paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */   public ASTEffect(BeatParser paramBeatParser, int paramInt) {
/* 21 */     super(paramBeatParser, paramInt);jdMethod_this();
/*    */   }
/*    */   
/*    */ 
/* 25 */   String getEffectName() { return new String(this.effectName); }
/*    */   
/*    */   void setEffectName(String paramString) {
/* 28 */     if ((!$noassert) && (this.effectName != null)) throw new AssertionError();
/* 29 */     this.effectName = paramString;
/*    */   }
/*    */   
/*    */ 
/* 33 */   int getRelativeValueDirection() { return this.relativeValueDirection; }
/*    */   
/*    */   void setRelativeValueDirection(int paramInt) {
/* 36 */     if ((!$noassert) && (this.relativeValueDirection != -1)) throw new AssertionError();
/* 37 */     this.relativeValueDirection = paramInt;
/*    */   }
/*    */   
/*    */ 
/* 41 */   float getEffectValue() { return this.effectValue; }
/*    */   
/*    */   void setEffectValue(float paramFloat) {
/* 44 */     if ((!$noassert) && (this.effectValue != Float.MAX_VALUE)) throw new AssertionError();
/* 45 */     this.effectValue = paramFloat;
/*    */   }
/*    */   
/*    */   public String compileToJava() throws CompileException
/*    */   {
/* 50 */     if ((!$noassert) && ((this.effectName == null) || (this.effectValue == Float.MAX_VALUE))) { throw new AssertionError("effectName = " + this.effectName + ", effectValue = " + this.effectValue);
/*    */     }
/* 52 */     StringBuffer localStringBuffer = new StringBuffer();
/* 53 */     localStringBuffer.append("new StoryEffect(\"" + this.effectName + "\", ");
/* 54 */     switch (this.relativeValueDirection) {
/*    */     case 0: 
/* 56 */       localStringBuffer.append("+");
/* 57 */       break;
/*    */     case 1: 
/* 59 */       localStringBuffer.append("-");
/*    */     }
/*    */     
/* 62 */     localStringBuffer.append(this.effectValue + "f, ");
/* 63 */     if (this.relativeValueDirection == -1) {
/* 64 */       localStringBuffer.append("true)");
/*    */     } else {
/* 66 */       localStringBuffer.append("false)");
/*    */     }
/* 68 */     return localStringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\compiler\ASTEffect.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */