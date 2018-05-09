/*     */ package wm;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JTextPane;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.text.EditorKit;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeCellRenderer;
/*     */ import javax.swing.tree.TreeCellRenderer;
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
/*     */ public class WorkingMemoryDebugger$WMCellRenderer
/*     */   extends JTextPane
/*     */   implements TreeCellRenderer
/*     */ {
/*     */   private final DefaultTreeCellRenderer defaultRenderer;
/*     */   final WorkingMemoryDebugger this$0;
/*     */   
/*  69 */   private final void jdMethod_this() { this.defaultRenderer = new DefaultTreeCellRenderer(); }
/*     */   
/*     */   public WorkingMemoryDebugger$WMCellRenderer(WorkingMemoryDebugger paramWorkingMemoryDebugger) {
/*  72 */     jdMethod_this();
/*  73 */     setContentType("text/html");
/*     */   }
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
/*     */   public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
/*     */   {
/*     */     Icon localIcon;
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
/* 104 */     if (paramBoolean2) {
/* 105 */       localIcon = this.defaultRenderer.getOpenIcon();
/* 106 */     } else if (paramBoolean3) {
/* 107 */       localIcon = this.defaultRenderer.getLeafIcon();
/*     */     } else {
/* 109 */       localIcon = this.defaultRenderer.getClosedIcon();
/*     */     }
/*     */     
/*     */     Color localColor;
/* 113 */     if (paramBoolean1) {
/* 114 */       localColor = this.defaultRenderer.getBackgroundSelectionColor();
/*     */     } else {
/* 116 */       localColor = this.defaultRenderer.getBackgroundNonSelectionColor();
/*     */     }
/* 118 */     DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)paramObject;
/* 119 */     if (localDefaultMutableTreeNode.getUserObject() != null) {
/* 120 */       setDocument(getEditorKit().createDefaultDocument());
/* 121 */       if (localDefaultMutableTreeNode.getUserObject().getClass().getName().equals("java.lang.String")) {
/* 122 */         setText("<font size = \"-1\" face=\"Helvetica, Arial, sans-serif\">" + (String)localDefaultMutableTreeNode.getUserObject());
/*     */       }
/*     */       else {
/* 125 */         setText(((WME)localDefaultMutableTreeNode.getUserObject()).toString_HTML());
/*     */       }
/*     */     }
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
/* 139 */     setBackground(localColor);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$WMCellRenderer.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */