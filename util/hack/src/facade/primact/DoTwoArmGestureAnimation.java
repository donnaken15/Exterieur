/*    */ package facade.primact;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class DoTwoArmGestureAnimation extends FacadeAsynchronousAction implements facade.util.GestureBodyPart { private int armLCompletionStatus;
/*    */   
/*  7 */   public DoTwoArmGestureAnimation() { jdMethod_this(); }
/*    */   
/*  9 */   private final void jdMethod_this() { this.armLCompletionStatus = 0;
/* 10 */     this.armRCompletionStatus = 0;
/* 11 */     this.armLGesture = new DoGestureAnimationWithSpecialCompletion(this);
/* 12 */     this.armRGesture = new DoGestureAnimationWithSpecialCompletion(this);
/* 13 */     this.character = -1; }
/*    */   
/*    */   private int armRCompletionStatus;
/*    */   private DoGestureAnimationWithSpecialCompletion armLGesture;
/*    */   private DoGestureAnimationWithSpecialCompletion armRGesture;
/*    */   private int character;
/*    */   class DoGestureAnimationWithSpecialCompletion extends DoGestureAnimation { private DoTwoArmGestureAnimation twoArm;
/*    */     
/* 21 */     DoGestureAnimationWithSpecialCompletion(DoTwoArmGestureAnimation paramDoTwoArmGestureAnimation) { this.twoArm = paramDoTwoArmGestureAnimation; }
/*    */     
/*    */     public synchronized void completionCallback(boolean paramBoolean) {
/* 24 */       if (paramBoolean) {
/* 25 */         if (this.gestureBodyPart == 0) {
/* 26 */           DoTwoArmGestureAnimation.this.armLCompletionStatus = 1;
/* 27 */         } else if (this.gestureBodyPart == 1) {
/* 28 */           DoTwoArmGestureAnimation.this.armRCompletionStatus = 1;
/*    */         } else {
/* 30 */           throw new abl.runtime.AblRuntimeError("Unexpected body part index in DoTwoArmGestureAnimation");
/*    */         }
/* 32 */         if ((DoTwoArmGestureAnimation.this.armLCompletionStatus == 1) && (DoTwoArmGestureAnimation.this.armRCompletionStatus == 1)) {
/* 33 */           this.twoArm.completionStatus = 1;
/*    */         }
/*    */       } else {
/* 36 */         DoTwoArmGestureAnimation.this.armLGesture.abort();
/* 37 */         DoTwoArmGestureAnimation.this.armRGesture.abort();
/* 38 */         this.twoArm.completionStatus = 2;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void execute(Object[] paramArrayOfObject)
/*    */   {
/* 45 */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/* 46 */     int j = ((Integer)paramArrayOfObject[1]).intValue();
/* 47 */     int k = ((Integer)paramArrayOfObject[2]).intValue();
/*    */     
/* 49 */     Object[] arrayOfObject1 = { new Integer(i), new Integer(0), new Integer(j) };
/* 50 */     this.armLGesture.execute(arrayOfObject1);
/* 51 */     System.out.println("Executing left arm gesture");
/*    */     
/* 53 */     Object[] arrayOfObject2 = { new Integer(i), new Integer(1), new Integer(k) };
/* 54 */     this.armRGesture.execute(arrayOfObject2);
/* 55 */     System.out.println("Executing right arm gesture");
/*    */     
/* 57 */     this.character = i;
/*    */   }
/*    */   
/*    */   public void abort() {
/* 61 */     if (this.character != -1) {
/* 62 */       this.armLGesture.abort();
/* 63 */       this.armRGesture.abort();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\DoTwoArmGestureAnimation.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */