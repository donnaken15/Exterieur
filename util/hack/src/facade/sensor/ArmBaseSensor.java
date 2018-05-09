/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import facade.characters.wmedef.ArmBaseWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.AnimLayer;
/*    */ import facade.util.IntegerRef;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public abstract class ArmBaseSensor extends FacadeSensor implements AnimLayer
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.ArmBaseSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   public void sense_Utility(int paramInt)
/*    */   {
/* 17 */     IntegerRef localIntegerRef1 = new IntegerRef();
/* 18 */     IntegerRef localIntegerRef2 = new IntegerRef();
/* 19 */     IntegerRef localIntegerRef3 = new IntegerRef();
/*    */     
/* 21 */     NativeAnimationInterface.getArmGestureBases(paramInt, localIntegerRef1, localIntegerRef2, localIntegerRef3);
/* 22 */     if ((!$noassert) && ((localIntegerRef1.i != -1) || (localIntegerRef2.i != -1) || (localIntegerRef3.i == -1)) && ((localIntegerRef1.i == -1) || (localIntegerRef2.i == -1) || (localIntegerRef3.i != -1))) { throw new AssertionError();
/*    */     }
/*    */     
/* 25 */     updateWMEs(paramInt, localIntegerRef1.i, localIntegerRef2.i, localIntegerRef3.i);
/*    */   }
/*    */   
/*    */   private final void updateWMEs(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 30 */     Iterator localIterator = BehavingEntity.getBehavingEntity().lookupWME("ArmBaseWME").iterator();
/*    */     
/*    */ 
/* 33 */     HashMap localHashMap = new HashMap();
/*    */     
/* 35 */     while (localIterator.hasNext()) {
/* 36 */       localArmBaseWME = (ArmBaseWME)localIterator.next();
/* 37 */       localHashMap.put(new Integer(localArmBaseWME.getGestureLayer()), localArmBaseWME);
/*    */     }
/*    */     
/* 40 */     ArmBaseWME localArmBaseWME = (ArmBaseWME)localHashMap.get(new Integer(4));
/* 41 */     if (paramInt2 != -1) {
/* 42 */       if (localArmBaseWME == null)
/*    */       {
/* 44 */         BehavingEntity.getBehavingEntity().addWME(new ArmBaseWME(paramInt1, 4, paramInt2));
/* 45 */       } else if (localArmBaseWME.getBase() != paramInt2)
/*    */       {
/* 47 */         localArmBaseWME.setBase(paramInt2);
/*    */       }
/* 49 */     } else if (localArmBaseWME != null)
/*    */     {
/* 51 */       BehavingEntity.getBehavingEntity().deleteWME(localArmBaseWME);
/*    */     }
/* 53 */     localArmBaseWME = (ArmBaseWME)localHashMap.get(new Integer(5));
/* 54 */     if (paramInt3 != -1) {
/* 55 */       if (localArmBaseWME == null)
/*    */       {
/* 57 */         BehavingEntity.getBehavingEntity().addWME(new ArmBaseWME(paramInt1, 5, paramInt3));
/* 58 */       } else if (localArmBaseWME.getBase() != paramInt3)
/*    */       {
/* 60 */         localArmBaseWME.setBase(paramInt3);
/*    */       }
/* 62 */     } else if (localArmBaseWME != null)
/*    */     {
/* 64 */       BehavingEntity.getBehavingEntity().deleteWME(localArmBaseWME);
/*    */     }
/* 66 */     localArmBaseWME = (ArmBaseWME)localHashMap.get(new Integer(6));
/* 67 */     if (paramInt4 != -1) {
/* 68 */       if (localArmBaseWME == null)
/*    */       {
/* 70 */         BehavingEntity.getBehavingEntity().addWME(new ArmBaseWME(paramInt1, 6, paramInt4));
/* 71 */       } else if (localArmBaseWME.getBase() != paramInt4)
/*    */       {
/* 73 */         localArmBaseWME.setBase(paramInt4);
/*    */       }
/* 75 */     } else if (localArmBaseWME != null)
/*    */     {
/* 77 */       BehavingEntity.getBehavingEntity().deleteWME(localArmBaseWME);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ArmBaseSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */