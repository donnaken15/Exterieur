/*    */ package facade.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class ObjectStateSensePacket implements SpriteID {
/*    */   private final HashMap info;
/*    */   
/*    */   public class ObjectStateInfo { public int objectID;
/*    */     public int state;
/*    */     
/* 11 */     private final void jdMethod_this() { this.objectID = -1;
/* 12 */       this.state = -1;
/*    */     }
/*    */     
/*    */     public boolean equals(Object paramObject) {
/* 16 */       if (!paramObject.getClass().getName().equals("facade.util.ObjectStateSensePacket")) {
/* 17 */         return false;
/*    */       }
/* 19 */       ObjectStateInfo localObjectStateInfo = (ObjectStateInfo)paramObject;
/* 20 */       if ((this.objectID == localObjectStateInfo.objectID) && (this.state == localObjectStateInfo.state)) {
/* 21 */         return true;
/*    */       }
/* 23 */       return false;
/*    */     }
/*    */     
/*    */     public ObjectStateInfo(int paramInt1, int paramInt2)
/*    */     {
/* 28 */       jdMethod_this();
/* 29 */       this.objectID = paramInt1;
/* 30 */       this.state = paramInt2;
/*    */     }
/*    */     
/* 33 */     public ObjectStateInfo() { jdMethod_this(); }
/*    */     
/*    */ 
/*    */     public String toString()
/*    */     {
/* 38 */       return "(ObjectStateInfo  objectID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  state == " + this.state + ')';
/*    */     }
/*    */   }
/*    */   
/*    */ 
/* 43 */   private final void jdMethod_this() { this.info = new HashMap(); }
/*    */   
/* 45 */   public ObjectStateSensePacket() { jdMethod_this(); }
/*    */   
/* 47 */   public int getNumberOfObjects() { return this.info.size(); }
/*    */   
/*    */   public void setObjectInfo(int paramInt1, int paramInt2)
/*    */   {
/* 51 */     this.info.put(new Integer(paramInt1), new ObjectStateInfo(paramInt1, paramInt2));
/*    */   }
/*    */   
/*    */   public void setObjectInfo(ObjectStateInfo paramObjectStateInfo)
/*    */   {
/* 56 */     this.info.put(new Integer(paramObjectStateInfo.objectID), paramObjectStateInfo);
/*    */   }
/*    */   
/*    */   public ObjectStateInfo getObjectInfo(int paramInt)
/*    */   {
/* 61 */     ObjectStateInfo localObjectStateInfo = (ObjectStateInfo)this.info.get(new Integer(paramInt));
/* 62 */     if (localObjectStateInfo != null) {
/* 63 */       return new ObjectStateInfo(localObjectStateInfo.objectID, localObjectStateInfo.state);
/*    */     }
/* 65 */     return null;
/*    */   }
/*    */   
/* 68 */   public java.util.Iterator iterator() { return this.info.values().iterator(); }
/*    */   
/*    */   public boolean objectInfoEquality(ObjectStateInfo paramObjectStateInfo)
/*    */   {
/* 72 */     ObjectStateInfo localObjectStateInfo = (ObjectStateInfo)this.info.get(new Integer(paramObjectStateInfo.objectID));
/* 73 */     if (localObjectStateInfo == null) return false;
/* 74 */     return localObjectStateInfo.equals(paramObjectStateInfo);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ObjectStateSensePacket.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */