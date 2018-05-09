/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Value;
/*    */ 
/*    */ public class MyPlus implements jess.Userfunction
/*    */ {
/*    */   public String getName() {
/*  8 */     return "MyPlus";
/*    */   }
/*    */   
/*    */   public Value call(jess.ValueVector paramValueVector, jess.Context paramContext) throws jess.JessException {
/* 12 */     String str1 = paramValueVector.get(1).stringValue(paramContext);
/* 13 */     String str2 = paramValueVector.get(2).stringValue(paramContext);
/* 14 */     if (str1.equals("any")) { return new Value("any", 1);
/*    */     }
/* 16 */     int i = Integer.parseInt(str1);
/* 17 */     int j = Integer.parseInt(str2);
/* 18 */     return new Value(i + j, 4);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\MyPlus.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */