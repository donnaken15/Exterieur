/*    */ package facade.util;
/*    */ 
/*    */ public class HeldObjectSensePacket$HeldObjectInfo {
/*    */   public int objectID;
/*    */   public int characterID;
/*    */   public int attachPointID;
/*    */   public int objectCategory;
/*    */   final HeldObjectSensePacket this$0;
/*    */   
/*    */   private final void jdMethod_this() {
/* 11 */     this.objectID = -1;
/* 12 */     this.characterID = -1;
/* 13 */     this.attachPointID = -1;
/* 14 */     this.objectCategory = -1;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 18 */     if (!paramObject.getClass().getName().equals("facade.util.HeldObjectSensePacket")) {
/* 19 */       return false;
/*    */     }
/* 21 */     HeldObjectInfo localHeldObjectInfo = (HeldObjectInfo)paramObject;
/* 22 */     if ((this.objectID == localHeldObjectInfo.objectID) && (this.characterID == localHeldObjectInfo.characterID) && (this.attachPointID == localHeldObjectInfo.attachPointID) && (this.objectCategory == localHeldObjectInfo.objectCategory))
/*    */     {
/*    */ 
/*    */ 
/* 26 */       return true;
/*    */     }
/* 28 */     return false;
/*    */   }
/*    */   
/*    */   public HeldObjectSensePacket$HeldObjectInfo(HeldObjectSensePacket paramHeldObjectSensePacket, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 33 */     jdMethod_this();
/* 34 */     this.objectID = paramInt1;
/* 35 */     this.characterID = paramInt2;
/* 36 */     this.attachPointID = paramInt3;
/* 37 */     this.objectCategory = paramInt4;
/*    */   }
/*    */   
/* 40 */   public HeldObjectSensePacket$HeldObjectInfo(HeldObjectSensePacket paramHeldObjectSensePacket) { jdMethod_this(); }
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 45 */     return "(HeldObjectInfo  objectID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  characterID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  attachPointID " + this.attachPointID + " objectCategory " + this.objectCategory + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\HeldObjectSensePacket$HeldObjectInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */