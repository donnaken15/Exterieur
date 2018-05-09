/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.TimeStampedWME;
/*    */ 
/*    */ public class DeflectModeWME
/*    */   extends TimeStampedWME
/*    */ {
/*    */   private int mode;
/*    */   private int reestWho;
/*    */   private int reestPlayer;
/*    */   private int reestDialog1;
/*    */   private int reestFEBase1;
/*    */   private int reestMood1;
/*    */   private int reestDialog2;
/*    */   private int reestFEBase2;
/*    */   private int reestMood2;
/*    */   private int reestDialog3;
/*    */   private int reestFEBase3;
/*    */   private int reestMood3;
/*    */   private int reestOtherFinalSigh;
/*    */   private boolean reestBSetReest;
/*    */   
/*    */   public DeflectModeWME(int paramInt)
/*    */   {
/* 25 */     this.mode = paramInt;
/* 26 */     this.reestWho = -1;
/* 27 */     this.reestPlayer = -1;
/* 28 */     this.reestDialog1 = -1;
/* 29 */     this.reestFEBase1 = -1;
/* 30 */     this.reestMood1 = -1;
/* 31 */     this.reestDialog2 = -1;
/* 32 */     this.reestFEBase2 = -1;
/* 33 */     this.reestMood2 = -1;
/* 34 */     this.reestDialog3 = -1;
/* 35 */     this.reestFEBase3 = -1;
/* 36 */     this.reestMood3 = -1;
/* 37 */     this.reestOtherFinalSigh = -1;
/* 38 */     this.reestBSetReest = false;
/*    */   }
/*    */   
/* 41 */   public synchronized int getMode() { return this.mode; }
/* 42 */   public synchronized int getReestWho() { return this.reestWho; }
/* 43 */   public synchronized int getReestPlayer() { return this.reestPlayer; }
/* 44 */   public synchronized int getReestDialog1() { return this.reestDialog1; }
/* 45 */   public synchronized int getReestFEBase1() { return this.reestFEBase1; }
/* 46 */   public synchronized int getReestMood1() { return this.reestMood1; }
/* 47 */   public synchronized int getReestDialog2() { return this.reestDialog2; }
/* 48 */   public synchronized int getReestFEBase2() { return this.reestFEBase2; }
/* 49 */   public synchronized int getReestMood2() { return this.reestMood2; }
/* 50 */   public synchronized int getReestDialog3() { return this.reestDialog3; }
/* 51 */   public synchronized int getReestFEBase3() { return this.reestFEBase3; }
/* 52 */   public synchronized int getReestMood3() { return this.reestMood3; }
/* 53 */   public synchronized int getReestOtherFinalSigh() { return this.reestOtherFinalSigh; }
/* 54 */   public synchronized boolean getReestBSetReest() { return this.reestBSetReest; }
/*    */   
/* 56 */   public synchronized void setMode(int paramInt) { this.mode = paramInt; }
/* 57 */   public synchronized void setReestWho(int paramInt) { this.reestWho = paramInt; }
/* 58 */   public synchronized void setReestPlayer(int paramInt) { this.reestPlayer = paramInt; }
/* 59 */   public synchronized void setReestDialog1(int paramInt) { this.reestDialog1 = paramInt; }
/* 60 */   public synchronized void setReestFEBase1(int paramInt) { this.reestFEBase1 = paramInt; }
/* 61 */   public synchronized void setReestMood1(int paramInt) { this.reestMood1 = paramInt; }
/* 62 */   public synchronized void setReestDialog2(int paramInt) { this.reestDialog2 = paramInt; }
/* 63 */   public synchronized void setReestFEBase2(int paramInt) { this.reestFEBase2 = paramInt; }
/* 64 */   public synchronized void setReestMood2(int paramInt) { this.reestMood2 = paramInt; }
/* 65 */   public synchronized void setReestDialog3(int paramInt) { this.reestDialog3 = paramInt; }
/* 66 */   public synchronized void setReestFEBase3(int paramInt) { this.reestFEBase3 = paramInt; }
/* 67 */   public synchronized void setReestMood3(int paramInt) { this.reestMood3 = paramInt; }
/* 68 */   public synchronized void setReestOtherFinalSigh(int paramInt) { this.reestOtherFinalSigh = paramInt; }
/* 69 */   public synchronized void setReestBSetReest(boolean paramBoolean) { this.reestBSetReest = paramBoolean; }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\DeflectModeWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */