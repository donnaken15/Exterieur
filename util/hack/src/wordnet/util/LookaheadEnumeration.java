/*    */ package wordnet.util;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.NoSuchElementException;
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
/*    */ public class LookaheadEnumeration
/*    */   implements Enumeration
/*    */ {
/*    */   protected Enumeration ground;
/*    */   protected boolean peeked;
/*    */   protected Object nextObject;
/*    */   protected boolean more;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 60 */     this.peeked = false;
/*    */   }
/*    */   
/*    */   public LookaheadEnumeration(Enumeration paramEnumeration) {
/* 64 */     jdMethod_this();
/* 65 */     this.ground = paramEnumeration;
/*    */   }
/*    */   
/*    */   protected void lookahead() {
/* 69 */     if (!this.peeked) {
/* 70 */       this.more = this.ground.hasMoreElements();
/* 71 */       if (this.more) {
/*    */         try {
/* 73 */           this.nextObject = this.ground.nextElement();
/*    */         } catch (NoSuchElementException localNoSuchElementException) {
/* 75 */           this.more = false;
/*    */         }
/*    */       }
/* 78 */       this.peeked = true;
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean hasMoreElements() {
/* 83 */     lookahead();
/* 84 */     return this.more;
/*    */   }
/*    */   
/*    */   public Object nextElement() {
/* 88 */     lookahead();
/* 89 */     if (this.more) {
/* 90 */       Object localObject = this.nextObject;
/* 91 */       this.nextObject = null;
/* 92 */       this.peeked = false;
/* 93 */       return localObject;
/*    */     }
/* 95 */     throw new NoSuchElementException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\util\LookaheadEnumeration.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */