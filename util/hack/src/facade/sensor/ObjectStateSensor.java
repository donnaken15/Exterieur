/*    */ package facade.sensor;
/*    */ 
/*    */ import abl.runtime.BehavingEntity;
/*    */ import facade.characters.wmedef.ObjectStateWME;
/*    */ import facade.nativeinterface.NativeAnimationInterface;
/*    */ import facade.util.ObjectStateSensePacket;
/*    */ import facade.util.ObjectStateSensePacket.ObjectStateInfo;
/*    */ import facade.util.SpriteID;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import wm.WME;
/*    */ 
/*    */ public class ObjectStateSensor extends FacadeSensor implements SpriteID
/*    */ {
/*    */   private static final boolean $noassert = Class.forName("[Lfacade.sensor.ObjectStateSensor;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/*    */   private final synchronized void processChangedObjectState(ObjectStateSensePacket paramObjectStateSensePacket)
/*    */   {
/* 19 */     HashMap localHashMap = new HashMap();
/* 20 */     Iterator localIterator = BehavingEntity.getBehavingEntity().lookupWME("ObjectStateWME").iterator();
/* 21 */     while (localIterator.hasNext()) {
/* 22 */       localObject = (ObjectStateWME)localIterator.next();
/* 23 */       if (paramObjectStateSensePacket.getObjectInfo(((ObjectStateWME)localObject).getObjectID()) == null)
/*    */       {
/* 25 */         BehavingEntity.getBehavingEntity().deleteWME((WME)localObject);
/*    */       } else
/* 27 */         localHashMap.put(new Integer(((ObjectStateWME)localObject).getObjectID()), localObject);
/*    */     }
/* 29 */     Object localObject = paramObjectStateSensePacket.iterator();
/* 30 */     while (((Iterator)localObject).hasNext()) {
/* 31 */       ObjectStateSensePacket.ObjectStateInfo localObjectStateInfo = (ObjectStateSensePacket.ObjectStateInfo)((Iterator)localObject).next();
/*    */       
/* 33 */       if (localObjectStateInfo.objectID != -1)
/*    */       {
/* 35 */         ObjectStateWME localObjectStateWME = (ObjectStateWME)localHashMap.get(new Integer(localObjectStateInfo.objectID));
/* 36 */         if (localObjectStateWME == null)
/*    */         {
/* 38 */           BehavingEntity.getBehavingEntity().addWME(new ObjectStateWME(localObjectStateInfo.objectID, localObjectStateInfo.state));
/* 39 */         } else if (localObjectStateWME.getState() != localObjectStateInfo.state)
/*    */         {
/* 41 */           localObjectStateWME.setState(localObjectStateInfo.state);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private final synchronized void sense()
/*    */   {
/* 49 */     ObjectStateSensePacket localObjectStateSensePacket = new ObjectStateSensePacket();
/* 50 */     NativeAnimationInterface.getAllObjectStates(localObjectStateSensePacket);
/* 51 */     processChangedObjectState(localObjectStateSensePacket);
/*    */   }
/*    */   
/*    */   public void senseOneShot(Object[] paramArrayOfObject)
/*    */   {
/* 56 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 57 */     sense();
/*    */   }
/*    */   
/*    */   public void initializeContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 62 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 63 */     sense();
/*    */   }
/*    */   
/*    */   public void senseContinuous(Object[] paramArrayOfObject)
/*    */   {
/* 68 */     if ((!$noassert) && (paramArrayOfObject != null) && (paramArrayOfObject.length != 0)) throw new AssertionError();
/* 69 */     sense();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\sensor\ObjectStateSensor.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */