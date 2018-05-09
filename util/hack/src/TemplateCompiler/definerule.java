/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.ValueVector;
/*    */ 
/*    */ public class definerule implements jess.Userfunction {
/*    */   public String getName() {
/*  7 */     return "definerule";
/*    */   }
/*    */   
/*    */   public jess.Value call(ValueVector paramValueVector, jess.Context paramContext) throws jess.JessException
/*    */   {
/* 12 */     RefCountRete localRefCountRete = (RefCountRete)paramContext.getEngine();
/* 13 */     String str1 = paramValueVector.get(1).stringValue(paramContext);
/* 14 */     int i = paramValueVector.get(2).intValue(paramContext);
/* 15 */     String str2 = paramValueVector.get(3).stringValue(paramContext);
/*    */     
/*    */ 
/* 18 */     return localRefCountRete.defineRule(str1, i, str2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\definerule.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */