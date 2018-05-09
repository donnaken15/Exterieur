/*    */ package wordnet.wn;
/*    */ 
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TokenizerParser
/*    */   extends StringTokenizer
/*    */ {
/*    */   public TokenizerParser(String paramString1, String paramString2)
/*    */   {
/* 18 */     super(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   public int nextByte() {
/* 22 */     return Byte.parseByte(nextToken());
/*    */   }
/*    */   
/*    */   public int nextShort() {
/* 26 */     return Short.parseShort(nextToken());
/*    */   }
/*    */   
/*    */   public int nextInt() {
/* 30 */     return Integer.parseInt(nextToken());
/*    */   }
/*    */   
/*    */   public int nextInt(int paramInt) {
/* 34 */     return Integer.parseInt(nextToken(), paramInt);
/*    */   }
/*    */   
/*    */   public int nextHexInt() {
/* 38 */     return nextInt(16);
/*    */   }
/*    */   
/*    */   public long nextLong() {
/* 42 */     return Long.parseLong(nextToken());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\TokenizerParser.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */