/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class Deffunction$Argument
/*    */   implements Serializable
/*    */ {
/*    */   String m_name;
/*    */   int m_type;
/*    */   
/*    */   Deffunction$Argument(String paramString, int paramInt)
/*    */   {
/* 23 */     this.m_name = paramString;
/* 24 */     this.m_type = paramInt;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 29 */     return this.m_name;
/*    */   }
/*    */   
/*    */   public int getType() {
/* 33 */     return this.m_type;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Deffunction$Argument.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */