/*    */ package wordnet.wn;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class POS
/*    */ {
/* 21 */   public static final POS NOUN = new POS("noun", "n");
/* 22 */   public static final POS VERB = new POS("verb", "v");
/* 23 */   public static final POS ADJ = new POS("adjective", "a");
/* 24 */   public static final POS ADV = new POS("adverb", "r");
/*    */   
/*    */ 
/* 27 */   public static final POS[] CATS = { NOUN, VERB, ADJ, ADV };
/*    */   
/*    */   protected String label;
/*    */   
/*    */   protected String key;
/*    */   
/*    */ 
/*    */   protected POS(String paramString1, String paramString2)
/*    */   {
/* 36 */     this.label = paramString1;
/* 37 */     this.key = paramString2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 44 */     return "[POS " + this.label + ']';
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 48 */     if (((paramObject instanceof POS)) && (this.key.equals(((POS)paramObject).key))) 0; return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 52 */     return this.key.hashCode();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String getLabel()
/*    */   {
/* 60 */     return this.label;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static POS lookup(String paramString)
/*    */   {
/* 67 */     for (int i = 0; i < CATS.length; i++) {
/* 68 */       if (paramString.equals(CATS[i].key)) {
/* 69 */         return CATS[i];
/*    */       }
/*    */     }
/* 72 */     throw new NoSuchElementException("unknown POS " + paramString);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\POS.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */