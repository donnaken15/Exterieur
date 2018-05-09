/*     */ package TemplateCompiler;
/*     */ 
/*     */ import java.util.Hashtable;
/*     */ import jess.Fact;
/*     */ import jess.JessEvent;
/*     */ import jess.JessException;
/*     */ import jess.JessListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class RefCountRete$FactTableListener
/*     */   implements JessListener
/*     */ {
/*     */   final RefCountRete this$0;
/*     */   
/*     */   public void eventHappened(JessEvent paramJessEvent)
/*     */     throws JessException
/*     */   {
/*  98 */     int i = paramJessEvent.getType();
/*  99 */     if ((i & 0x10) != 0)
/*     */     {
/* 101 */       Fact localFact = (Fact)paramJessEvent.getObject();
/*     */       
/* 103 */       if (!localFact.getName().equals("MAIN::anaphoricRef"))
/*     */       {
/* 105 */         if ((i & 0x80000000) == 0)
/*     */         {
/* 107 */           RefCountRete.access$0(this.this$0, localFact);
/*     */         }
/* 109 */         else if ((i & 0x80000000) != 0)
/*     */         {
/* 111 */           RefCountRete.access$1(this.this$0, localFact);
/*     */         }
/*     */       }
/*     */     }
/* 115 */     if ((i & 0x1000) != 0)
/*     */     {
/* 117 */       RefCountRete.access$2(this.this$0).clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public RefCountRete$FactTableListener(RefCountRete paramRefCountRete) {}
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\RefCountRete$FactTableListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */