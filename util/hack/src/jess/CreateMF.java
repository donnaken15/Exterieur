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
/*    */ class CreateMF
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public String getName()
/*    */   {
/* 52 */     return "create$";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 56 */     ValueVector localValueVector1 = new ValueVector();
/*    */     
/* 58 */     for (int i = 1; i < paramValueVector.size(); i++) {
/* 59 */       Value localValue = paramValueVector.get(i).resolveValue(paramContext);
/* 60 */       switch (localValue.type()) {
/*    */       case 512: 
/* 62 */         ValueVector localValueVector2 = localValue.listValue(paramContext);
/* 63 */         for (int j = 0; j < localValueVector2.size(); j++) {
/* 64 */           localValueVector1.add(localValueVector2.get(j).resolveValue(paramContext));
/*    */         }
/* 66 */         break;
/*    */       default: 
/* 68 */         localValueVector1.add(localValue);
/*    */       }
/*    */       
/*    */     }
/* 72 */     return new Value(localValueVector1, 512);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\CreateMF.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */