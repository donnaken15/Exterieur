/*    */ package abl.runtime;
/*    */ 
/*    */ import java.io.PrintStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ final class MentalStepDebug$1
/*    */   extends Thread
/*    */ {
/*    */   final MentalStepDebug this$0;
/*    */   
/*    */   public final void run()
/*    */   {
/*    */     try
/*    */     {
/* 38 */       sleep(1000L);
/* 39 */       System.err.println("WARNING: a mental act in behavior " + this.this$0.parent + " took longer than a second to complete. Mental acts that take a long time to execute block the decision cycle.");
/*    */     }
/*    */     catch (InterruptedException localInterruptedException) {}
/*    */   }
/*    */   
/*    */   MentalStepDebug$1(MentalStepDebug paramMentalStepDebug) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\MentalStepDebug$1.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */