/*    */ package dramaman.runtime;
/*    */ 
/*    */ 
/*    */ public class StoryEffect
/*    */ {
/*    */   private String valueName;
/*    */   
/*    */   private float valueChange;
/*    */   private boolean isAbsolute;
/*    */   
/*    */   public StoryEffect(String paramString, float paramFloat, boolean paramBoolean)
/*    */   {
/* 13 */     this.valueName = paramString;
/* 14 */     this.valueChange = paramFloat;
/* 15 */     this.isAbsolute = paramBoolean;
/*    */   }
/*    */   
/*    */ 
/* 19 */   public String getValueName() { return this.valueName; }
/* 20 */   public float getValueChange() { return this.valueChange; }
/* 21 */   public boolean getIsAbsolute() { return this.isAbsolute; }
/* 22 */   public String getValueWMEName() { return DramaManager.getDramaManager().getStoryValueWMEName(this.valueName); }
/*    */   
/*    */   public String toString()
/*    */   {
/* 26 */     return "(" + this.valueName + ", " + this.valueChange + ", " + this.isAbsolute + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryEffect.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */