/*    */ package facade.characters.wmedef;
/*    */ 
/*    */ import wm.WME;
/*    */ 
/*    */ public class IsPlayerRotatingWME extends WME {
/*    */   private boolean b;
/*    */   
/*  8 */   public IsPlayerRotatingWME(boolean paramBoolean) { this.b = paramBoolean; }
/*    */   
/*    */ 
/*    */ 
/* 12 */   public synchronized boolean getB() { return this.b; }
/*    */   
/* 14 */   public synchronized void setB(boolean paramBoolean) { this.b = paramBoolean; }
/*    */   
/*    */   public IsPlayerRotatingWME() {}
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\wmedef\IsPlayerRotatingWME.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */