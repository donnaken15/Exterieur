/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class PlayerInfoWME extends WME
/*    */ {
/*    */   private int gender;
/*    */   private int nameIndex;
/*    */   
/*    */   public PlayerInfoWME(int paramInt1, int paramInt2) {
/* 11 */     this.gender = paramInt1;
/* 12 */     this.nameIndex = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public PlayerInfoWME()
/*    */   {
/* 20 */     this.gender = Integer.MIN_VALUE;
/* 21 */     this.nameIndex = Integer.MIN_VALUE;
/*    */   }
/*    */   
/*    */ 
/* 25 */   public synchronized int getGender() { return this.gender; }
/* 26 */   public synchronized int getNameIndex() { return this.nameIndex; }
/*    */   
/*    */ 
/* 29 */   public synchronized void setGender(int paramInt) { this.gender = paramInt; }
/* 30 */   public synchronized void setNameIndex(int paramInt) { this.nameIndex = paramInt; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\PlayerInfoWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */