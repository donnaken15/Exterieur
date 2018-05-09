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
/*    */ class DumpFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 17 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 21 */     addFunction(new Dumper(0), paramHashMap);
/* 22 */     addFunction(new Dumper(1), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\DumpFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */