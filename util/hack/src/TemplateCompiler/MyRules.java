/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Rete;
/*    */ 
/*    */ public class MyRules implements jess.Userpackage
/*    */ {
/*    */   public void add(Rete paramRete)
/*    */   {
/*  9 */     paramRete.addUserfunction(new definerule());
/* 10 */     paramRete.addUserfunction(new undefinerule());
/* 11 */     paramRete.addUserfunction(new conditionalretract());
/* 12 */     paramRete.addUserfunction(new MyEquals());
/* 13 */     paramRete.addUserfunction(new MyGreater());
/* 14 */     paramRete.addUserfunction(new MyPlus());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\MyRules.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */