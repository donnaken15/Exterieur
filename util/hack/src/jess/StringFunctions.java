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
/*    */ class StringFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 16 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap) {
/* 20 */     addFunction(new StrCat(), paramHashMap);
/* 21 */     addFunction(new StrCompare(), paramHashMap);
/* 22 */     addFunction(new StrIndex(), paramHashMap);
/* 23 */     addFunction(new SubString(), paramHashMap);
/* 24 */     addFunction(new StrSimple(0), paramHashMap);
/* 25 */     addFunction(new StrSimple(1), paramHashMap);
/* 26 */     addFunction(new StrSimple(2), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\StringFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */