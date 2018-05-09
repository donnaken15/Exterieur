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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ViewFunctions
/*    */   implements Userpackage, IntrinsicPackage, Serializable
/*    */ {
/*    */   public void add(Rete paramRete)
/*    */   {
/* 24 */     paramRete.addUserfunction(new View());
/* 25 */     paramRete.addUserfunction(new Matches());
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 29 */     addFunction(new View(), paramHashMap);
/* 30 */     addFunction(new Matches(), paramHashMap);
/*    */   }
/*    */   
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap) {
/* 34 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ViewFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */