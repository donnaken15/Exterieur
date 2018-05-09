/*     */ package abl.runtime;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeCellRenderer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Debugger$ABTCellRenderer
/*     */   extends DefaultTreeCellRenderer
/*     */ {
/*     */   final Debugger this$0;
/*     */   
/*     */   public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
/*     */   {
/*  94 */     super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 100 */       DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramObject;
/* 101 */       Step localStep = (Step)localDefaultMutableTreeNode.getUserObject();
/* 102 */       if (localStep.isSuspended()) {
/* 103 */         setForeground(Color.red);
/* 104 */       } else if ((localStep.getStepType() == 1) && (((GoalStep)localStep).isJointGoal()) && (((JointGoalStep)localStep).getIsNegotiating()))
/*     */       {
/*     */ 
/* 107 */         setForeground(Color.blue);
/*     */       } else
/* 109 */         setForeground(Color.black);
/* 110 */       return this;
/*     */     }
/*     */     catch (ClassCastException localClassCastException)
/*     */     {
/* 114 */       setForeground(Color.black);
/* 115 */       return this;
/*     */     }
/*     */     catch (NullPointerException localNullPointerException)
/*     */     {
/* 119 */       setForeground(Color.black); }
/* 120 */     return this;
/*     */   }
/*     */   
/*     */   protected Debugger$ABTCellRenderer(Debugger paramDebugger) {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\Debugger$ABTCellRenderer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */