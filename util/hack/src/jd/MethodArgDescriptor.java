/*    */ package jd;
/*    */ 
/*    */ public class MethodArgDescriptor
/*    */   extends JavaCodeDescriptor
/*    */ {
/*    */   public String argType;
/*    */   public String argName;
/*    */   
/*    */   public MethodArgDescriptor()
/*    */   {
/* 11 */     this.argType = null;
/* 12 */     this.argName = null;
/*    */   }
/*    */   
/*    */   public MethodArgDescriptor(String paramString1, String paramString2) {
/* 16 */     this.argType = paramString1;
/* 17 */     this.argName = paramString2;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 21 */     return this.argType + ' ' + this.argName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\MethodArgDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */