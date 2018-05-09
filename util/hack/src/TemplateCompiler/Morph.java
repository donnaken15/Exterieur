/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ class Morph {
/*    */   static {
/*  7 */     System.loadLibrary("morph");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static void main(String[] paramArrayOfString)
/*    */   {
/* 14 */     System.out.println(morphstr(paramArrayOfString[0]));
/*    */   }
/*    */   
/*    */   public static native String morphstr(String paramString);
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\Morph.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */