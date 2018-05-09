/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.Vector;
/*    */ 
/*    */ class AblEventSupport { private Vector listeners;
/*    */   private Object source;
/*    */   
/*  8 */   private final void jdMethod_this() { this.listeners = new Vector(); }
/*    */   
/*    */   AblEventSupport()
/*    */   {
/* 12 */     jdMethod_this();this.source = null;
/*    */   }
/*    */   
/* 15 */   AblEventSupport(Object paramObject) { jdMethod_this();this.source = paramObject; }
/*    */   
/* 17 */   void addAblListener(AblListener paramAblListener) { this.listeners.add(paramAblListener); }
/* 18 */   void removeAblListener(AblListener paramAblListener) { this.listeners.remove(paramAblListener); }
/*    */   
/* 20 */   void setSource(Object paramObject) { this.source = paramObject; }
/*    */   
/*    */   void fireAblEvent(int paramInt, Object paramObject)
/*    */   {
/* 24 */     AblEvent localAblEvent = new AblEvent(this.source, paramInt, paramObject);
/* 25 */     for (int i = 0; i < this.listeners.size(); i++) {
/* 26 */       ((AblListener)this.listeners.get(i)).eventHappened(localAblEvent);
/*    */     }
/*    */   }
/*    */   
/*    */   void fireAblEvent(int paramInt1, Object paramObject, int paramInt2) {
/* 31 */     AblEvent localAblEvent = new AblEvent(this.source, paramInt1, paramObject, paramInt2);
/* 32 */     for (int i = 0; i < this.listeners.size(); i++) {
/* 33 */       ((AblListener)this.listeners.get(i)).eventHappened(localAblEvent);
/*    */     }
/*    */   }
/*    */   
/*    */   void fireAblEvent(int paramInt1, Object paramObject1, Object paramObject2, int paramInt2) {
/* 38 */     AblEvent localAblEvent = new AblEvent(paramObject1, paramInt1, paramObject2, paramInt2);
/* 39 */     for (int i = 0; i < this.listeners.size(); i++) {
/* 40 */       ((AblListener)this.listeners.get(i)).eventHappened(localAblEvent);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\AblEventSupport.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */