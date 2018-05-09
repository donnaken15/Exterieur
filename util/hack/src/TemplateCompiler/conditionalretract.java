/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.ValueVector;
/*    */ 
/*    */ public class conditionalretract implements jess.Userfunction {
/*    */   public String getName() {
/*  7 */     return "conditionalRetract";
/*    */   }
/*    */   
/*    */   public jess.Value call(ValueVector paramValueVector, jess.Context paramContext) throws jess.JessException {
/* 11 */     RefCountRete localRefCountRete = (RefCountRete)paramContext.getEngine();
/* 12 */     String str1 = paramValueVector.get(1).stringValue(paramContext);
/* 13 */     String str2 = paramValueVector.get(2).stringValue(paramContext);
/* 14 */     String str3 = paramValueVector.get(3).stringValue(paramContext);
/*    */     
/*    */ 
/*    */ 
/*    */     int i;
/*    */     
/*    */ 
/* 21 */     if (str2.equals("any")) {
/* 22 */       i = Integer.MIN_VALUE;
/*    */     } else
/* 24 */       i = paramValueVector.get(2).intValue(paramContext);
/*    */     int j;
/* 26 */     if (str3.equals("any")) {
/* 27 */       j = Integer.MAX_VALUE;
/*    */     } else {
/* 29 */       j = paramValueVector.get(3).intValue(paramContext);
/*    */     }
/* 31 */     localRefCountRete.conditionalRetract(str1, i, j);
/* 32 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\conditionalretract.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */