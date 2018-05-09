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
/*    */ class ModuleFunctions
/*    */   implements IntrinsicPackage, Serializable
/*    */ {
/*    */   private final void addFunction(Userfunction paramUserfunction, HashMap paramHashMap)
/*    */   {
/* 20 */     paramHashMap.put(paramUserfunction.getName(), paramUserfunction);
/*    */   }
/*    */   
/*    */   public void add(HashMap paramHashMap)
/*    */   {
/* 25 */     addFunction(new SetFocus(), paramHashMap);
/* 26 */     addFunction(new GetFocus(), paramHashMap);
/* 27 */     addFunction(new SetCurrentModule(), paramHashMap);
/* 28 */     addFunction(new GetCurrentModule(), paramHashMap);
/* 29 */     addFunction(new ListFocusStack(), paramHashMap);
/* 30 */     addFunction(new GetFocusStack(), paramHashMap);
/* 31 */     addFunction(new ClearFocusStack(), paramHashMap);
/* 32 */     addFunction(new PopFocus(), paramHashMap);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\ModuleFunctions.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */