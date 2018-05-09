/*    */ package wm;
/*    */ 
/*    */ public class NonexistentWmeException extends WorkingMemoryException {
/*    */   private static final String errorString = "Attempt to modify a WME which doesn't exist in working memory";
/*    */   
/*  6 */   public NonexistentWmeException() { super("Attempt to modify a WME which doesn't exist in working memory"); }
/*    */   
/*    */   public NonexistentWmeException(String paramString)
/*    */   {
/* 10 */     super("Attempt to modify a WME which doesn't exist in working memory: " + paramString);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\NonexistentWmeException.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */