/*    */ package facade.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class HeldObjectSensePacket implements SpriteID {
/*    */   private final HashMap info;
/*    */   
/*    */   public class HeldObjectInfo { public int objectID;
/*    */     public int characterID;
/*    */     
/* 11 */     private final void jdMethod_this() { this.objectID = -1;
/* 12 */       this.characterID = -1;
/* 13 */       this.attachPointID = -1;
/* 14 */       this.objectCategory = -1;
/*    */     }
/*    */     
/*    */     public boolean equals(Object paramObject) {
/* 18 */       if (!paramObject.getClass().getName().equals("facade.util.HeldObjectSensePacket")) {
/* 19 */         return false;
/*    */       }
/* 21 */       HeldObjectInfo localHeldObjectInfo = (HeldObjectInfo)paramObject;
/* 22 */       if ((this.objectID == localHeldObjectInfo.objectID) && (this.characterID == localHeldObjectInfo.characterID) && (this.attachPointID == localHeldObjectInfo.attachPointID) && (this.objectCategory == localHeldObjectInfo.objectCategory))
/*    */       {
/*    */ 
/*    */ 
/* 26 */         return true;
/*    */       }
/* 28 */       return false;
/*    */     }
/*    */     
/*    */     public HeldObjectInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */     {
/* 33 */       jdMethod_this();
/* 34 */       this.objectID = paramInt1;
/* 35 */       this.characterID = paramInt2;
/* 36 */       this.attachPointID = paramInt3;
/* 37 */       this.objectCategory = paramInt4;
/*    */     }
/*    */     
/* 40 */     public HeldObjectInfo() { jdMethod_this(); }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 45 */     public String toString() { return "(HeldObjectInfo  objectID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  characterID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  attachPointID " + this.attachPointID + " objectCategory " + this.objectCategory + ')'; }
/*    */     
/*    */     public int attachPointID;
/*    */     public int objectCategory;
/*    */   }
/*    */   
/* 51 */   private final void jdMethod_this() { this.info = new HashMap(); }
/*    */   
/* 53 */   public HeldObjectSensePacket() { jdMethod_this(); }
/*    */   
/* 55 */   public int getNumberOfObjects() { return this.info.size(); }
/*    */   
/*    */   public void setObjectInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 59 */     this.info.put(new Integer(paramInt1), new HeldObjectInfo(paramInt1, paramInt2, paramInt3, paramInt4));
/*    */   }
/*    */   
/*    */   public void setObjectInfo(HeldObjectInfo paramHeldObjectInfo)
/*    */   {
/* 64 */     this.info.put(new Integer(paramHeldObjectInfo.objectID), paramHeldObjectInfo);
/*    */   }
/*    */   
/*    */   public HeldObjectInfo getObjectInfo(int paramInt)
/*    */   {
/* 69 */     HeldObjectInfo localHeldObjectInfo = (HeldObjectInfo)this.info.get(new Integer(paramInt));
/* 70 */     if (localHeldObjectInfo != null) {
/* 71 */       return new HeldObjectInfo(localHeldObjectInfo.objectID, localHeldObjectInfo.characterID, localHeldObjectInfo.attachPointID, localHeldObjectInfo.objectCategory);
/*    */     }
/* 73 */     return null;
/*    */   }
/*    */   
/* 76 */   public java.util.Iterator iterator() { return this.info.values().iterator(); }
/*    */   
/*    */   public boolean objectInfoEquality(HeldObjectInfo paramHeldObjectInfo)
/*    */   {
/* 80 */     HeldObjectInfo localHeldObjectInfo = (HeldObjectInfo)this.info.get(new Integer(paramHeldObjectInfo.objectID));
/* 81 */     if (localHeldObjectInfo == null) return false;
/* 82 */     if ((localHeldObjectInfo.characterID != paramHeldObjectInfo.characterID) || (localHeldObjectInfo.attachPointID != paramHeldObjectInfo.attachPointID) || (localHeldObjectInfo.objectCategory != paramHeldObjectInfo.objectCategory))
/*    */     {
/*    */ 
/* 85 */       return false;
/*    */     }
/* 87 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\HeldObjectSensePacket.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */