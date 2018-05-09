/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Context;
/*    */ 
/*    */ public class undefinerule implements jess.Userfunction {
/*    */   public String getName() {
/*  7 */     return "undefinerule";
/*    */   }
/*    */   
/*    */   public jess.Value call(jess.ValueVector paramValueVector, Context paramContext) throws jess.JessException
/*    */   {
/* 12 */     RefCountRete localRefCountRete = (RefCountRete)paramContext.getEngine();
/*    */     
/* 14 */     return localRefCountRete.undefineRule(paramValueVector, paramContext);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\undefinerule.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */