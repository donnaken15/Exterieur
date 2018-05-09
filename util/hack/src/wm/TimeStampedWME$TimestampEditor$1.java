/*    */ package wm;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
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
/*    */ final class TimeStampedWME$TimestampEditor$1
/*    */   implements ActionListener
/*    */ {
/*    */   final TimeStampedWME.TimestampEditor this$0;
/*    */   
/*    */   public final void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 45 */     this.this$0.setFieldValue(Long.toString(System.currentTimeMillis()));
/*    */   }
/*    */   
/*    */   TimeStampedWME$TimestampEditor$1(TimeStampedWME.TimestampEditor paramTimestampEditor) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\TimeStampedWME$TimestampEditor$1.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */