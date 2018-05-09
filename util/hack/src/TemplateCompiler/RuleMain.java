/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Main;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RuleMain
/*    */   extends Main
/*    */ {
/* 15 */   public static RefCountRete r = new RefCountRete();
/*    */   
/*    */   public static void main(String[] paramArrayOfString)
/*    */   {
/* 19 */     RuleMain localRuleMain = new RuleMain();
/* 20 */     localRuleMain.initialize(paramArrayOfString, r);
/* 21 */     localRuleMain.execute(true);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\RuleMain.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */