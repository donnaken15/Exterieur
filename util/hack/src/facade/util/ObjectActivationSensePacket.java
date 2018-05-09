/*    */ package facade.util;
/*    */ 
/*    */ public class ObjectActivationSensePacket implements SpriteID {
/*    */   private final ObjectActivationEntry[] activationEntries;
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.util.ObjectActivationSensePacket;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public class ObjectActivationEntry { public int activation;
/*    */     public int activatorID;
/*    */     
/* 10 */     private final void jdMethod_this() { this.activation = -1;
/* 11 */       this.activatorID = -1;
/*    */     }
/*    */     
/* 14 */     ObjectActivationEntry() { jdMethod_this();
/* 15 */       this.activation = -1;
/* 16 */       this.activatorID = -1;
/*    */     }
/*    */     
/*    */     ObjectActivationEntry(ObjectActivationEntry paramObjectActivationEntry) {
/* 20 */       jdMethod_this();
/* 21 */       this.activation = paramObjectActivationEntry.activation;
/* 22 */       this.activatorID = paramObjectActivationEntry.activatorID;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ObjectActivationSensePacket()
/*    */   {
/* 31 */     this.activationEntries = new ObjectActivationEntry[49];
/* 32 */     for (int i = 0; i < this.activationEntries.length; i++) {
/* 33 */       this.activationEntries[i] = new ObjectActivationEntry();
/*    */     }
/*    */   }
/*    */   
/*    */   public void setActivationInfo(int[] paramArrayOfInt1, int[] paramArrayOfInt2) {
/* 38 */     if ((!$noassert) && ((paramArrayOfInt1.length != 49) || (paramArrayOfInt2.length != 49))) throw new AssertionError();
/* 39 */     for (int i = 0; i < 49; i++) {
/* 40 */       this.activationEntries[i].activation = paramArrayOfInt1[i];
/* 41 */       this.activationEntries[i].activatorID = paramArrayOfInt2[i];
/*    */     }
/*    */   }
/*    */   
/*    */   public ObjectActivationEntry getActivationInfo(int paramInt)
/*    */   {
/* 47 */     return new ObjectActivationEntry(this.activationEntries[paramInt]);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ObjectActivationSensePacket.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */