/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import facade.characters.wmedef.HeldObjectWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.HeldObjectSensePacket;
/*    */ import facade.util.HeldObjectSensePacket.HeldObjectInfo;
/*    */ import facade.util.SpriteID;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedList;
/*    */ import wm.WME;
/*    */ 
/*    */ public class HeldObjectsSensor
/*    */   extends FacadeSensor implements SpriteID
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.HeldObjectsSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   private final synchronized void processChangedHeldObjects(HeldObjectSensePacket paramHeldObjectSensePacket)
/*    */   {
/* 21 */     HashMap localHashMap = new HashMap();
/* 22 */     Iterator localIterator = BehavingEntity.getBehavingEntity().lookupWME("HeldObjectWME").iterator();
/* 23 */     while (localIterator.hasNext()) {
/* 24 */       localObject = (HeldObjectWME)localIterator.next();
/* 25 */       if (paramHeldObjectSensePacket.getObjectInfo(((HeldObjectWME)localObject).getObjectID()) == null)
/*    */       {
/* 27 */         BehavingEntity.getBehavingEntity().deleteWME((WME)localObject);
/*    */       } else
/* 29 */         localHashMap.put(new Integer(((HeldObjectWME)localObject).getObjectID()), localObject);
/*    */     }
/* 31 */     Object localObject = paramHeldObjectSensePacket.iterator();
/* 32 */     while (((Iterator)localObject).hasNext()) {
/* 33 */       HeldObjectSensePacket.HeldObjectInfo localHeldObjectInfo = (HeldObjectSensePacket.HeldObjectInfo)((Iterator)localObject).next();
/*    */       
/* 35 */       if (localHeldObjectInfo.objectID != -1)
/*    */       {
/* 37 */         HeldObjectWME localHeldObjectWME = (HeldObjectWME)localHashMap.get(new Integer(localHeldObjectInfo.objectID));
/* 38 */         if (localHeldObjectWME == null)
/*    */         {
/* 40 */           BehavingEntity.getBehavingEntity().addWME(new HeldObjectWME(localHeldObjectInfo.objectID, localHeldObjectInfo.characterID, localHeldObjectInfo.attachPointID, localHeldObjectInfo.objectCategory));
/* 41 */         } else if ((localHeldObjectWME.getCharacterID() != localHeldObjectInfo.characterID) || (localHeldObjectWME.getAttachPointID() != localHeldObjectInfo.attachPointID) || (localHeldObjectWME.getObjectCategory() != localHeldObjectInfo.objectCategory))
/*    */         {
/*    */ 
/*    */ 
/* 45 */           localHeldObjectWME.setCharacterID(localHeldObjectInfo.characterID);
/* 46 */           localHeldObjectWME.setAttachPointID(localHeldObjectInfo.attachPointID);
/* 47 */           localHeldObjectWME.setObjectCategory(localHeldObjectInfo.objectCategory);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private final synchronized void sense()
/*    */   {
/* 55 */     HeldObjectSensePacket localHeldObjectSensePacket = new HeldObjectSensePacket();
/* 56 */     NativeAnimationInterface.getAllHeldObjects(localHeldObjectSensePacket);
/* 57 */     processChangedHeldObjects(localHeldObjectSensePacket);
/*    */   }
/*    */   
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 62 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 63 */     sense();
/*    */   }
/*    */   
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 68 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 69 */     sense();
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 74 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 75 */     sense();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\HeldObjectsSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */