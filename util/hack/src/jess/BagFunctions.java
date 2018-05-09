/*    */ package jess;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class BagFunctions
/*    */   implements Userpackage, IntrinsicPackage, Serializable
/*    */ {
/*    */   public void add(Rete paramRete)
/*    */   {
/* 19 */     paramRete.addUserfunction(new Bag());
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 23 */     paramHashMap.put("bag", new Bag());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\BagFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */