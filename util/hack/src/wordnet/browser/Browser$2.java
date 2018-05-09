/*     */ package wordnet.browser;
/*     */ 
/*     */ import java.awt.Frame;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class Browser$2
/*     */   implements ActionListener
/*     */ {
/*     */   final Browser this$0;
/*     */   
/*     */   public final void actionPerformed(ActionEvent paramActionEvent)
/*     */   {
/*  97 */     Object localObject = paramActionEvent.getSource();
/*  98 */     Browser localBrowser = this.this$0;
/*  99 */     if (localObject == this.this$0.miAbout) {
/* 100 */       new AboutDialog(localBrowser);
/* 101 */     } else if (localObject == this.this$0.miSearch) {
/* 102 */       if (this.this$0.searchWindow == null) {
/* 103 */         this.this$0.searchWindow = new SearchFrame(this.val$browser);
/*     */       }
/* 105 */       this.this$0.searchWindow.toFront();
/* 106 */       this.this$0.searchWindow.show();
/* 107 */     } else if (localObject == this.this$0.miExit) {
/* 108 */       new QuitDialog(localBrowser, true).setVisible(true);
/*     */     }
/*     */   }
/*     */   
/*     */   Browser$2(Browser paramBrowser, BrowserPanel paramBrowserPanel) {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\Browser$2.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */