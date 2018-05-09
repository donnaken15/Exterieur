/*    */ package facade.util;
/*    */ 
/*    */ public class ObjectActivationSensePacket$ObjectActivationEntry
/*    */ {
/*    */   public int activation;
/*    */   public int activatorID;
/*    */   final ObjectActivationSensePacket this$0;
/*    */   
/*    */   private final void jdMethod_this() {
/* 10 */     this.activation = -1;
/* 11 */     this.activatorID = -1;
/*    */   }
/*    */   
/* 14 */   ObjectActivationSensePacket$ObjectActivationEntry(ObjectActivationSensePacket paramObjectActivationSensePacket) { jdMethod_this();
/* 15 */     this.activation = -1;
/* 16 */     this.activatorID = -1;
/*    */   }
/*    */   
/*    */   ObjectActivationSensePacket$ObjectActivationEntry(ObjectActivationSensePacket paramObjectActivationSensePacket, ObjectActivationEntry paramObjectActivationEntry) {
/* 20 */     jdMethod_this();
/* 21 */     this.activation = paramObjectActivationEntry.activation;
/* 22 */     this.activatorID = paramObjectActivationEntry.activatorID;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\ObjectActivationSensePacket$ObjectActivationEntry.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */