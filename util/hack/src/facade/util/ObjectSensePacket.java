/*    */ package facade.util;
/*    */ 
/*    */ public class ObjectSensePacket implements SpriteID { public final ObjectSenseInfo[] info;
/*    */   
/*    */   public class ObjectSenseInfo { public int objectID;
/*    */     
/*  7 */     public ObjectSenseInfo() { jdMethod_this(); }
/*  8 */     private final void jdMethod_this() { this.objectID = -1;
/*  9 */       this.x = Float.NEGATIVE_INFINITY;
/* 10 */       this.y = Float.NEGATIVE_INFINITY;
/* 11 */       this.z = Float.NEGATIVE_INFINITY;
/*    */     }
/*    */     
/*    */     public float x;
/*    */     public float y;
/*    */     public float z;
/*    */   }
/*    */   
/* 19 */   public ObjectSensePacket() { this.info = new ObjectSenseInfo[49];
/* 20 */     for (int i = 0; i < this.info.length; i++) {
/* 21 */       this.info[i] = new ObjectSenseInfo();
/*    */     }
/*    */   }
/*    */   
/*    */   public void setObjectInfo(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2) {
/* 26 */     this.info[paramInt2].objectID = paramInt1;
/* 27 */     this.info[paramInt2].x = paramFloat1;
/* 28 */     this.info[paramInt2].y = paramFloat2;
/* 29 */     this.info[paramInt2].z = paramFloat3;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ObjectSensePacket.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */