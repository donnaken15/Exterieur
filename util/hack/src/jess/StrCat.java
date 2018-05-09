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
/*    */ class StrCat
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 32 */     return "str-cat";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 36 */     Value localValue = paramValueVector.get(1).resolveValue(paramContext);
/*    */     
/* 38 */     if ((paramValueVector.size() == 2) && (localValue.type() == 2)) {
/* 39 */       return localValue;
/*    */     }
/* 41 */     StringBuffer localStringBuffer = new StringBuffer("");
/*    */     
/* 43 */     for (int i = 1; i < paramValueVector.size(); i++) {
/* 44 */       localValue = paramValueVector.get(i).resolveValue(paramContext);
/* 45 */       if (localValue.type() == 2) {
/* 46 */         localStringBuffer.append(localValue.stringValue(paramContext));
/* 47 */       } else if (localValue.type() == 2048) {
/* 48 */         localStringBuffer.append(localValue.externalAddressValue(paramContext).toString());
/*    */       } else
/* 50 */         localStringBuffer.append(localValue.toString());
/*    */     }
/* 52 */     return new Value(localStringBuffer.toString(), 2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\StrCat.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */