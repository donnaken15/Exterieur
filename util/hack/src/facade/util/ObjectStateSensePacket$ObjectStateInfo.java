/*    */ package facade.util;
/*    */ 
/*    */ public class ObjectStateSensePacket$ObjectStateInfo
/*    */ {
/*    */   public int objectID;
/*    */   public int state;
/*    */   final ObjectStateSensePacket this$0;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 11 */     this.objectID = -1;
/* 12 */     this.state = -1;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 16 */     if (!paramObject.getClass().getName().equals("facade.util.ObjectStateSensePacket")) {
/* 17 */       return false;
/*    */     }
/* 19 */     ObjectStateInfo localObjectStateInfo = (ObjectStateInfo)paramObject;
/* 20 */     if ((this.objectID == localObjectStateInfo.objectID) && (this.state == localObjectStateInfo.state)) {
/* 21 */       return true;
/*    */     }
/* 23 */     return false;
/*    */   }
/*    */   
/*    */   public ObjectStateSensePacket$ObjectStateInfo(ObjectStateSensePacket paramObjectStateSensePacket, int paramInt1, int paramInt2)
/*    */   {
/* 28 */     jdMethod_this();
/* 29 */     this.objectID = paramInt1;
/* 30 */     this.state = paramInt2;
/*    */   }
/*    */   
/* 33 */   public ObjectStateSensePacket$ObjectStateInfo(ObjectStateSensePacket paramObjectStateSensePacket) { jdMethod_this(); }
/*    */   
/*    */ 
/*    */   public String toString()
/*    */   {
/* 38 */     return "(ObjectStateInfo  objectID == " + PrintUtilities.spriteID_EnumToString(this.objectID) + "  state == " + this.state + ')';
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ObjectStateSensePacket$ObjectStateInfo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */