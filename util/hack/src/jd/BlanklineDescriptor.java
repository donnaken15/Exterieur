/*    */ package jd;
/*    */ 
/*    */ 
/*    */ public class BlanklineDescriptor
/*    */   extends CodeStringDescriptor
/*    */ {
/*    */   public String toString(int paramInt)
/*    */   {
/*  9 */     return "";
/*    */   }
/*    */   
/*    */   public void setCodeString(String paramString)
/*    */   {
/* 14 */     throw new JavaDescriptorError("setCodeString() should not be called on BlanklineDescriptor.");
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jd\BlanklineDescriptor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */