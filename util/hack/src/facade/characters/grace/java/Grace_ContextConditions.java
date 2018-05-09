/*     */ package facade.characters.grace.java;
/*     */ 
/*     */ import abl.runtime.BehavingEntity;
/*     */ import abl.runtime.BehaviorWME;
import abl.runtime.__ValueTypes;
/*     */ import abl.runtime.__ValueTypes.IntVar;
/*     */ import facade.characters.wmedef.BeatFlagWME;
/*     */ import facade.characters.wmedef.BodyResourceWME;
/*     */ import facade.characters.wmedef.MoodWME;
/*     */ import facade.characters.wmedef.ObjectPickupPositionWME;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ public class Grace_ContextConditions implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, facade.util.PoseScripts, facade.util.GestureBodyPart, facade.util.BodyResource, facade.util.BeatStatus, facade.util.BeatConstants, facade.util.ReactionConstants, facade.util.DAType, facade.util.ReactionID, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, facade.util.BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*     */ {
/*     */   public static boolean contextCondition0(int paramInt, Object[] paramArrayOfObject, BehavingEntity paramBehavingEntity)
/*     */   {
/*     */     Object localObject1;
/*     */     ListIterator localListIterator1;
/*     */     Object localObject2;
/*  20 */     switch (paramInt)
/*     */     {
/*     */ 
/*     */ 
/*     */     case 340: 
/*  25 */       localObject1 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  26 */       localListIterator1 = ((List)localObject1).listIterator();
/*  27 */       while (localListIterator1.hasNext()) {
/*  28 */         localObject2 = (BeatFlagWME)localListIterator1.next();
/*  29 */         if (((BeatFlagWME)localObject2).getSVal().equals("player hung up phone"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  34 */           return false;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  41 */       localObject2 = wm.WorkingMemory.lookupWME("StoryMemory", "BeatFlagWME");
/*  42 */       ListIterator localListIterator2 = ((List)localObject2).listIterator();
/*  43 */       while (localListIterator2.hasNext()) {
/*  44 */         BeatFlagWME localBeatFlagWME = (BeatFlagWME)localListIterator2.next();
/*  45 */         if (localBeatFlagWME.getSVal().equals("phone call ended"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  50 */           return false;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*  55 */       return true;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4349: 
/*  63 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/*  64 */       localListIterator1 = ((List)localObject1).listIterator();
/*  65 */       while (localListIterator1.hasNext()) {
/*  66 */         localObject2 = (BodyResourceWME)localListIterator1.next();
/*  67 */         if ((((BodyResourceWME)localObject2).getResourceID() == ((__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((BodyResourceWME)localObject2).getOwner() == (BehaviorWME)paramArrayOfObject[1]))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*  80 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4351: 
/*  86 */       localObject1 = BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("SequentialBehaviorWME", (String)paramArrayOfObject[0]);
/*  87 */       localListIterator1 = ((List)localObject1).listIterator();
/*  88 */       while (localListIterator1.hasNext()) {
/*  89 */         localObject2 = (abl.runtime.SequentialBehaviorWME)localListIterator1.next();
/*  90 */         paramArrayOfObject[2] = localObject2;
/*  91 */         if (((abl.runtime.SequentialBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  96 */           if ((abl.runtime.SequentialBehaviorWME)paramArrayOfObject[2] == (BehaviorWME)paramArrayOfObject[1])
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 101 */             return true;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4352: 
/* 116 */       localObject1 = BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("ParallelBehaviorWME", (String)paramArrayOfObject[0]);
/* 117 */       localListIterator1 = ((List)localObject1).listIterator();
/* 118 */       while (localListIterator1.hasNext()) {
/* 119 */         localObject2 = (abl.runtime.ParallelBehaviorWME)localListIterator1.next();
/* 120 */         paramArrayOfObject[2] = localObject2;
/* 121 */         if (((abl.runtime.ParallelBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 126 */           if ((abl.runtime.ParallelBehaviorWME)paramArrayOfObject[2] == (BehaviorWME)paramArrayOfObject[1])
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 131 */             return true;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4353: 
/* 146 */       localObject1 = BehavingEntity.getBehavingEntity().lookupReflectionWMEBySignature("CollectionBehaviorWME", (String)paramArrayOfObject[0]);
/* 147 */       localListIterator1 = ((List)localObject1).listIterator();
/* 148 */       while (localListIterator1.hasNext()) {
/* 149 */         localObject2 = (abl.runtime.CollectionBehaviorWME)localListIterator1.next();
/* 150 */         paramArrayOfObject[2] = localObject2;
/* 151 */         if (((abl.runtime.CollectionBehaviorWME)localObject2).getSignature().equals((String)paramArrayOfObject[0]))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 156 */           if ((abl.runtime.CollectionBehaviorWME)paramArrayOfObject[2] == (BehaviorWME)paramArrayOfObject[1])
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 161 */             return true;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4354: 
/* 176 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("BodyResourceWME");
/* 177 */       localListIterator1 = ((List)localObject1).listIterator();
/* 178 */       while (localListIterator1.hasNext()) {
/* 179 */         localObject2 = (BodyResourceWME)localListIterator1.next();
/* 180 */         if ((((BodyResourceWME)localObject2).getResourceID() == ((__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (((BodyResourceWME)localObject2).getOwner() == (BehaviorWME)paramArrayOfObject[2]))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 193 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4502: 
/* 199 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("MoodWME");
/* 200 */       localListIterator1 = ((List)localObject1).listIterator();
/* 201 */       while (localListIterator1.hasNext()) {
/* 202 */         localObject2 = (MoodWME)localListIterator1.next();
/* 203 */         if ((((MoodWME)localObject2).getType() == ((int)paramArrayOfObject[2])) && (((MoodWME)localObject2).getStrength() == ((int)paramArrayOfObject[3])) && (!((MoodWME)localObject2).getBTerminate()))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 218 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4619: 
/* 224 */       localObject1 = wm.WorkingMemory.lookupWME("BeatMemory", "BeatStatusWME");
/* 225 */       localListIterator1 = ((List)localObject1).listIterator();
/* 226 */       while (localListIterator1.hasNext()) {
/* 227 */         localObject2 = (facade.characters.wmedef.BeatStatusWME)localListIterator1.next();
/* 228 */         if (((facade.characters.wmedef.BeatStatusWME)localObject2).getStatus() == 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 233 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 239 */       return false;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 4688: 
/* 245 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("ObjectPickupPositionWME");
/* 246 */       localListIterator1 = ((List)localObject1).listIterator();
/* 247 */       while (localListIterator1.hasNext()) {
/* 248 */         localObject2 = (ObjectPickupPositionWME)localListIterator1.next();
/* 249 */         if ((((ObjectPickupPositionWME)localObject2).getObjectID() == ((__ValueTypes.IntVar)paramArrayOfObject[1]).i) && (((ObjectPickupPositionWME)localObject2).getX() == ((facade.util.Point3D)paramArrayOfObject[2]).x) && (((ObjectPickupPositionWME)localObject2).getZ() == ((facade.util.Point3D)paramArrayOfObject[2]).z))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */           return true;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 264 */       return false;
/*     */     }
/*     */     
/* 267 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\Grace_ContextConditions.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */