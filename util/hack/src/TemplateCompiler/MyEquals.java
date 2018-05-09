/*    */ package TemplateCompiler;
/*    */ 
/*    */ import jess.Value;
/*    */ 
/*    */ public class MyEquals implements jess.Userfunction {
/*    */   public String getName() {
/*  7 */     return "MyEquals";
/*    */   }
/*    */   
/*    */   public Value call(jess.ValueVector paramValueVector, jess.Context paramContext) throws jess.JessException {
/* 11 */     String str1 = paramValueVector.get(1).stringValue(paramContext);
/* 12 */     String str2 = paramValueVector.get(2).stringValue(paramContext);
/*    */     
/* 14 */     if ((str1.equals("any")) || (str2.equals("any"))) { return new Value("TRUE", 1);
/*    */     }
/*    */     
/* 17 */     int i = Integer.parseInt(str1);
/* 18 */     int j = Integer.parseInt(str2);
/* 19 */     if (i == j) return new Value("TRUE", 1);
/* 20 */     return new Value("FALSE", 1);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\MyEquals.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */