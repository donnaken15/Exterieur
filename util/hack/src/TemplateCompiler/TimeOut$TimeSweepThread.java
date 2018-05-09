/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.TimerTask;
/*    */ import java.util.Vector;
/*    */ import jess.JessException;
/*    */ import jess.Rete;
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
/*    */ public class TimeOut$TimeSweepThread
/*    */   extends TimerTask
/*    */ {
/*    */   final TimeOut this$0;
/*    */   
/*    */   public void run()
/*    */   {
/* 79 */     Enumeration localEnumeration = TimeOut.access$0(this.this$0).elements();
/* 80 */     while (localEnumeration.hasMoreElements()) {
/* 81 */       TimeOut.TimeOutObject localTimeOutObject = (TimeOut.TimeOutObject)localEnumeration.nextElement();
/* 82 */       localTimeOutObject.value -= 1;
/*    */       
/* 84 */       if (localTimeOutObject.value == 0) {
/*    */         try {
/* 86 */           TimeOut.access$1(this.this$0).executeCommand("(assert (RETRACT" + localTimeOutObject.name + "))");
/* 87 */           TimeOut.access$1(this.this$0).executeCommand("(undefrule " + localTimeOutObject.name + ')');
/* 88 */           TimeOut.access$1(this.this$0).run();
/* 89 */           TimeOut.access$1(this.this$0).reset();
/* 90 */           TimeOut.access$0(this.this$0).remove(localTimeOutObject);
/*    */         }
/*    */         catch (JessException localJessException) {
/* 93 */           JessExceptionHelper.processJessException(localJessException);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public TimeOut$TimeSweepThread(TimeOut paramTimeOut) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\TimeOut$TimeSweepThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */