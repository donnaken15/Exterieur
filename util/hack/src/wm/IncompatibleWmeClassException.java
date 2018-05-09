/*    */ package wm;
/*    */ 
/*    */ public class IncompatibleWmeClassException extends WorkingMemoryException {
/*    */   private static final String errorString = "Attempt to modify a WME with an incompatible WME class";
/*    */   
/*  6 */   public IncompatibleWmeClassException() { super("Attempt to modify a WME with an incompatible WME class"); }
/*    */   
/*    */   public IncompatibleWmeClassException(String paramString)
/*    */   {
/* 10 */     super("Attempt to modify a WME with an incompatible WME class: " + paramString);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\IncompatibleWmeClassException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */