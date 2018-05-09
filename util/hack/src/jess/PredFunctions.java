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
/*    */ class PredFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 17 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 21 */     addFunction(new EvenP(), paramHashMap);
/* 22 */     addFunction(new OddP(), paramHashMap);
/* 23 */     addFunction(new TypeP("lexemep", 3), paramHashMap);
/* 24 */     addFunction(new TypeP("numberp", 65572), paramHashMap);
/*    */     
/* 26 */     addFunction(new TypeP("longp", 65536), paramHashMap);
/* 27 */     addFunction(new TypeP("floatp", 32), paramHashMap);
/* 28 */     addFunction(new TypeP("integerp", 4), paramHashMap);
/* 29 */     addFunction(new TypeP("stringp", 2), paramHashMap);
/* 30 */     addFunction(new TypeP("symbolp", 1), paramHashMap);
/* 31 */     addFunction(new TypeP("multifieldp", 512), paramHashMap);
/* 32 */     addFunction(new TypeP("external-addressp", 2048), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\PredFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */