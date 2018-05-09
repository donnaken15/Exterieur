/*    */ package wm;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.util.LinkedList;
/*    */ import javax.swing.JCheckBox;
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
/*    */ class WorkingMemoryDebugger$PopupMenuActionListener
/*    */   implements ActionListener
/*    */ {
/*    */   final WorkingMemoryDebugger this$0;
/*    */   
/*    */   public void actionPerformed(ActionEvent paramActionEvent)
/*    */   {
/* 42 */     String str = paramActionEvent.getActionCommand();
/* 43 */     if (str.equals("Delete")) {
/* 44 */       WorkingMemoryDebugger.access$9(this.this$0).deleteWME(WorkingMemoryDebugger.access$5(this.this$0));
/*    */     }
/* 46 */     else if (str.equals("Delete all")) {
/* 47 */       WorkingMemoryDebugger.access$9(this.this$0).deleteAllWMEClass(WorkingMemoryDebugger.access$2(this.this$0));
/*    */     }
/* 49 */     else if (str.equals("Add..."))
/*    */     {
/* 51 */       WME localWME = (WME)WorkingMemoryDebugger.access$9(this.this$0).lookupWME(WorkingMemoryDebugger.access$2(this.this$0)).get(0);
/* 52 */       Class localClass = localWME.getClass();
/* 53 */       new WorkingMemoryDebugger.AddWMEDialog(this.this$0, localClass).setVisible(true);
/*    */     }
/* 55 */     else if (str.equals("Modify...")) {
/* 56 */       new WorkingMemoryDebugger.ModifyWMEDialog(this.this$0, WorkingMemoryDebugger.access$5(this.this$0)).setVisible(true);
/*    */     }
/* 58 */     else if (str.equals("Add WME...")) {
/* 59 */       new WorkingMemoryDebugger.ChooseWMEDialog(this.this$0).setVisible(true);
/*    */     }
/*    */     
/*    */ 
/* 63 */     if (!WorkingMemoryDebugger.access$0(this.this$0).isSelected()) {
/* 64 */       this.this$0.update();
/*    */     }
/*    */   }
/*    */   
/*    */   WorkingMemoryDebugger$PopupMenuActionListener(WorkingMemoryDebugger paramWorkingMemoryDebugger) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$PopupMenuActionListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */