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
/*    */ class LispFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 17 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 21 */     addFunction(new Progn(), paramHashMap);
/* 22 */     addFunction(new Apply(), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\LispFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */