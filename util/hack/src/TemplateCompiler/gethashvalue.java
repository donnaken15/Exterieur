/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Context;
/*    */ 
/*    */ public class gethashvalue implements jess.Userfunction {
/*    */   public String getName() {
/*  7 */     return "gethashvalue";
/*    */   }
/*    */   
/*    */   public jess.Value call(jess.ValueVector paramValueVector, Context paramContext) throws jess.JessException
/*    */   {
/* 12 */     RefCountRete localRefCountRete = (RefCountRete)paramContext.getEngine();
/* 13 */     String str = paramValueVector.get(1).stringValue(paramContext);
/*    */     
/* 15 */     return localRefCountRete.getHashValue(str);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\gethashvalue.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */