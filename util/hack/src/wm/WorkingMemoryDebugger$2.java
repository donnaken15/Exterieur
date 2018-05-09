/*     */ package wm;
/*     */ 
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JPopupMenu;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.tree.TreePath;
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
/*     */ final class WorkingMemoryDebugger$2
/*     */   extends MouseAdapter
/*     */ {
/*     */   final WorkingMemoryDebugger this$0;
/*     */   
/*     */   public final void mouseClicked(MouseEvent paramMouseEvent)
/*     */   {
/* 207 */     if ((paramMouseEvent.getModifiers() & 0x4) == 4) {
/* 208 */       TreePath localTreePath = WorkingMemoryDebugger.access$1(this.this$0).getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
/* 209 */       if (localTreePath != null)
/*     */       {
/*     */ 
/* 212 */         WorkingMemory.WMTreeNode localWMTreeNode = (WorkingMemory.WMTreeNode)localTreePath.getLastPathComponent();
/* 213 */         if (localWMTreeNode.getIsClassNode()) {
/* 214 */           WorkingMemoryDebugger.access$3(this.this$0, (String)localWMTreeNode.getUserObject());
/* 215 */           WorkingMemoryDebugger.access$4(this.this$0).show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
/*     */         }
/*     */         else {
/* 218 */           WorkingMemoryDebugger.access$6(this.this$0, (WME)localWMTreeNode.getUserObject());
/* 219 */           WorkingMemoryDebugger.access$7(this.this$0).show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 224 */         WorkingMemoryDebugger.access$8(this.this$0).show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   WorkingMemoryDebugger$2(WorkingMemoryDebugger paramWorkingMemoryDebugger) {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemoryDebugger$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */