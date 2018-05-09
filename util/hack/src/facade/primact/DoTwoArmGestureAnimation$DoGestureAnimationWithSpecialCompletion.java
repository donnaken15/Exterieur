/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.AblRuntimeError;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class DoTwoArmGestureAnimation$DoGestureAnimationWithSpecialCompletion
/*    */   extends DoGestureAnimation
/*    */ {
/*    */   private DoTwoArmGestureAnimation twoArm;
/*    */   final DoTwoArmGestureAnimation this$0;
/*    */   
/* 21 */   DoTwoArmGestureAnimation$DoGestureAnimationWithSpecialCompletion(DoTwoArmGestureAnimation paramDoTwoArmGestureAnimation1, DoTwoArmGestureAnimation paramDoTwoArmGestureAnimation2) { this.twoArm = paramDoTwoArmGestureAnimation2; }
/*    */   
/*    */   public synchronized void completionCallback(boolean paramBoolean) {
/* 24 */     if (paramBoolean) {
/* 25 */       if (this.gestureBodyPart == 0) {
/* 26 */         DoTwoArmGestureAnimation.access$1(this.this$0, 1);
/* 27 */       } else if (this.gestureBodyPart == 1) {
/* 28 */         DoTwoArmGestureAnimation.access$3(this.this$0, 1);
/*    */       } else {
/* 30 */         throw new AblRuntimeError("Unexpected body part index in DoTwoArmGestureAnimation");
/*    */       }
/* 32 */       if ((DoTwoArmGestureAnimation.access$0(this.this$0) == 1) && (DoTwoArmGestureAnimation.access$2(this.this$0) == 1)) {
/* 33 */         this.twoArm.completionStatus = 1;
/*    */       }
/*    */     } else {
/* 36 */       DoTwoArmGestureAnimation.access$4(this.this$0).abort();
/* 37 */       DoTwoArmGestureAnimation.access$5(this.this$0).abort();
/* 38 */       this.twoArm.completionStatus = 2;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoTwoArmGestureAnimation$DoGestureAnimationWithSpecialCompletion.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */