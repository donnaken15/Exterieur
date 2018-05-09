/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JButton;
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
/*    */ final class NLUdebugger$2
/*    */   implements ActionListener
/*    */ {
/*    */   final NLUdebugger this$0;
/*    */   
/*    */   public final void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 29 */     if (NLUdebugger.observe) {
/* 30 */       NLUdebugger.observe = false;
/* 31 */       NLUdebugger.access$0().setLabel("Show Facts");
/*    */     }
/*    */     else {
/* 34 */       NLUdebugger.observe = true;
/* 35 */       NLUdebugger.access$0().setLabel("Hide Facts");
/*    */     }
/*    */   }
/*    */   
/*    */   NLUdebugger$2(NLUdebugger paramNLUdebugger) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\NLUdebugger$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */