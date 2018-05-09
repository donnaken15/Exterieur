/*     */ package jess;
/*     */ 
/*     */ import java.awt.Frame;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class View$2
/*     */   extends WindowAdapter
/*     */ {
/*     */   final View this$0;
/*     */   final Frame val$f;
/*     */   final Graph val$g;
/*     */   final Rete val$engine;
/*     */   
/*     */   View$2(View paramView, Frame paramFrame, Graph paramGraph, Rete paramRete)
/*     */   {
/* 103 */     this.this$0 = paramView;this.val$f = paramFrame;this.val$g = paramGraph;this.val$engine = paramRete; }
/*     */   
/* 105 */   public final void windowClosing(WindowEvent paramWindowEvent) { this.val$f.dispose();
/* 106 */     this.val$engine.removeJessListener(this.val$g);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\View$2.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */