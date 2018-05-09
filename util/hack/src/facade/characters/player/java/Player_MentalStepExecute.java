/*     */ package facade.characters.player.java;
/*     */ 
/*     */ import abl.runtime.BehavingEntity;
/*     */ import abl.runtime.__ValueTypes.BooleanVar;
/*     */ import abl.runtime.__ValueTypes.FloatVar;
/*     */ import abl.runtime.__ValueTypes.IntVar;
/*     */ import facade.characters.wmedef.PhysicallyFavorWME;
/*     */ import facade.characters.wmedef.PlayerUncoopWME;
/*     */ 
/*     */ public class Player_MentalStepExecute implements facade.util.BeatConstants, facade.util.SpriteID, dramaman.runtime.DramaManagerConstants
/*     */ {
/*     */   public static void mentalExecute0(int paramInt, Object[] paramArrayOfObject, BehavingEntity paramBehavingEntity, abl.runtime.MentalStep paramMentalStep)
/*     */   {
/*     */     Object localObject1;
/*     */     Object localObject2;
/*     */     int i;
/*  17 */     switch (paramInt)
/*     */     {
/*     */     case 0: 
/*  20 */       BehavingEntity.getBehavingEntity().addWME(new PreviousCachedPlayerPositionWME(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f, 0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f));
/*  21 */       break;
/*     */     
/*     */ 
/*     */     case 1: 
/*  25 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[4]).setX(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/*  26 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[4]).setY(0.0F);
/*  27 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[4]).setZ(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f);
/*  28 */       if (facade.util.Staging.getXZDistanceBetweenPoints(((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[0]).f) != 0.0F) { ((facade.characters.wmedef.IsPlayerTranslatingWME)paramArrayOfObject[7]).setB(true);((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)paramArrayOfObject[6]).setB(true);((facade.characters.wmedef.IsPlayerSettledWME)paramArrayOfObject[2]).setB(false); }
/*  29 */       break;
/*     */     
/*     */ 
/*     */     case 2: 
/*  33 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[3]).setX(((__ValueTypes.FloatVar)paramArrayOfObject[2]).f);
/*  34 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[3]).setY(0.0F);
/*  35 */       ((PreviousCachedPlayerPositionWME)paramArrayOfObject[3]).setZ(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f);
/*  36 */       if (facade.util.Staging.getXZDistanceBetweenPoints(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[2]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[0]).f) == 0.0F) { ((facade.characters.wmedef.IsPlayerTranslatingWME)paramArrayOfObject[7]).setB(false); if (!((__ValueTypes.BooleanVar)paramArrayOfObject[6]).b) ((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)paramArrayOfObject[5]).setB(false); }
/*  37 */       break;
/*     */     
/*     */ 
/*     */     case 3: 
/*  41 */       BehavingEntity.getBehavingEntity().addWME(new PreviousCachedPlayerRotationWME(0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[0]).f, 0.0F));
/*  42 */       break;
/*     */     
/*     */ 
/*     */     case 4: 
/*  46 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[3]).setX(0.0F);
/*  47 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[3]).setY(((__ValueTypes.FloatVar)paramArrayOfObject[2]).f);
/*  48 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[3]).setZ(0.0F);
/*  49 */       if (Math.abs(facade.util.Staging.normalizeNeg180to180(((__ValueTypes.FloatVar)paramArrayOfObject[1]).f - ((__ValueTypes.FloatVar)paramArrayOfObject[2]).f)) != 0.0F) { ((facade.characters.wmedef.IsPlayerRotatingWME)paramArrayOfObject[5]).setB(true);((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)paramArrayOfObject[4]).setB(true);((facade.characters.wmedef.IsPlayerSettledWME)paramArrayOfObject[0]).setB(false); }
/*  50 */       break;
/*     */     
/*     */ 
/*     */     case 5: 
/*  54 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[2]).setX(0.0F);
/*  55 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[2]).setY(((__ValueTypes.FloatVar)paramArrayOfObject[1]).f);
/*  56 */       ((PreviousCachedPlayerRotationWME)paramArrayOfObject[2]).setZ(0.0F);
/*  57 */       if (Math.abs(facade.util.Staging.normalizeNeg180to180(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f - ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f)) == 0.0F) { ((facade.characters.wmedef.IsPlayerRotatingWME)paramArrayOfObject[5]).setB(false); if (!((__ValueTypes.BooleanVar)paramArrayOfObject[4]).b) ((facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME)paramArrayOfObject[3]).setB(false); }
/*  58 */       break;
/*     */     
/*     */ 
/*     */     case 9: 
/*  62 */       if (!((facade.characters.wmedef.IsPlayerSettledWME)paramArrayOfObject[0]).getB()) ((facade.characters.wmedef.IsPlayerSettledWME)paramArrayOfObject[0]).setB(true);
/*  63 */       break;
/*     */     
/*     */ 
/*     */     case 10: 
/*  67 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.IsPlayerTranslatingWME(false));
/*  68 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.IsPlayerRotatingWME(false));
/*  69 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.IsPlayerTranslatingOrRotatingWME(false));
/*  70 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.IsPlayerSettledWME(true));
/*  71 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.PlayerCrowdWME(0L));
/*  72 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.PlayerRecentlyTypedTextWME(false, 0L));
/*  73 */       BehavingEntity.getBehavingEntity().addWME(new CachedPlayerPositionWME(0.0F, 0.0F, 0.0F));
/*  74 */       BehavingEntity.getBehavingEntity().addWME(new CachedPlayerRotationWME(0.0F, 0.0F, 0.0F));
/*  75 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.PlayerFuturePositionWME(0.0F, 0.0F, 0.0F));
/*  76 */       BehavingEntity.getBehavingEntity().addWME(new facade.characters.wmedef.PlayerFutureRotationWME(0.0F, 0.0F, 0.0F));
/*  77 */       BehavingEntity.getBehavingEntity().addWME(new PlayerUncoopWME());
/*  78 */       break;
/*     */     
/*     */ 
/*     */     case 11: 
/*  82 */       ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f = 5;
/*  83 */       ((facade.characters.wmedef.PlayerFuturePositionWME)paramArrayOfObject[9]).setX((((__ValueTypes.FloatVar)paramArrayOfObject[2]).f - ((CachedPlayerPositionWME)paramArrayOfObject[4]).getX()) * ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f + ((__ValueTypes.FloatVar)paramArrayOfObject[2]).f);
/*  84 */       ((facade.characters.wmedef.PlayerFuturePositionWME)paramArrayOfObject[9]).setY((((__ValueTypes.FloatVar)paramArrayOfObject[5]).f - ((CachedPlayerPositionWME)paramArrayOfObject[4]).getY()) * ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f + ((__ValueTypes.FloatVar)paramArrayOfObject[5]).f);
/*  85 */       ((facade.characters.wmedef.PlayerFuturePositionWME)paramArrayOfObject[9]).setZ((((__ValueTypes.FloatVar)paramArrayOfObject[7]).f - ((CachedPlayerPositionWME)paramArrayOfObject[4]).getZ()) * ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f + ((__ValueTypes.FloatVar)paramArrayOfObject[7]).f);
/*  86 */       ((facade.characters.wmedef.PlayerFutureRotationWME)paramArrayOfObject[6]).setY((((__ValueTypes.FloatVar)paramArrayOfObject[3]).f - ((CachedPlayerRotationWME)paramArrayOfObject[8]).getY()) * ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f + ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/*  87 */       ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[0]).l = System.currentTimeMillis();
/*  88 */       BehavingEntity.getBehavingEntity().deleteAllWMEClass("CachedPlayerPositionWME");
/*  89 */       BehavingEntity.getBehavingEntity().addWME(new CachedPlayerPositionWME(((__ValueTypes.FloatVar)paramArrayOfObject[2]).f, 0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[7]).f));
/*  90 */       BehavingEntity.getBehavingEntity().deleteAllWMEClass("CachedPlayerRotationWME");
/*  91 */       BehavingEntity.getBehavingEntity().addWME(new CachedPlayerRotationWME(0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f, 0.0F));
/*  92 */       break;
/*     */     case 14: 
/*     */       try
/*     */       {
/*  96 */         Thread.currentThread();Thread.sleep(100L); } catch (InterruptedException localInterruptedException) { throw new abl.runtime.AblRuntimeError(localInterruptedException); }
/*  97 */       break;
/*     */     
/*     */ 
/*     */     case 19: 
/* 101 */       facade.util.StringUtil.println("Turning off physicallyFavors sensor for sprite ID " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i) + " with timeout " + ((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/* 102 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Turning off physicallyFavors sensor for sprite ID " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i) + " with timeout " + ((__ValueTypes.IntVar)paramArrayOfObject[1]).i);
/* 103 */       break;
/*     */     
/*     */ 
/*     */     case 23: 
/* 107 */       if (((abl.runtime.GoalStepWME)paramArrayOfObject[1]).isValid()) ((abl.runtime.GoalStepWME)paramArrayOfObject[1]).fail(); else facade.util.StringUtil.println("!!!! Unexpected invalid goal WME in TurnOffPhysicallyFavorsWithTimeout");
/* 108 */       break;
/*     */     
/*     */ 
/*     */     case 25: 
/* 112 */       facade.util.StringUtil.println("### PhysicallyFavors csensor turned back on after timeout for sprite " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i) + " ###");
/* 113 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("PhysicallyFavors csensor turned back on after timeout for sprite " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/* 114 */       break;
/*     */     
/*     */ 
/*     */     case 28: 
/* 118 */       facade.util.StringUtil.println("Turning on physicallyFavors sensor for sprite ID " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/* 119 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Turning on physicallyFavors sensor for sprite ID " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/* 120 */       break;
/*     */     
/*     */ 
/*     */     case 31: 
/* 124 */       if (((abl.runtime.GoalStepWME)paramArrayOfObject[1]).isValid()) ((abl.runtime.GoalStepWME)paramArrayOfObject[1]).fail(); else facade.util.StringUtil.println("!!!! Unexpected invalid goal WME in TurnOnPhysicallyFavors_KillDemon");
/* 125 */       break;
/*     */     
/*     */ 
/*     */     case 33: 
/* 129 */       facade.util.StringUtil.println("csPlayerPhysicallyFavors_ObjectActivation " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/* 130 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("csPlayerPhysicallyFavors_ObjectActivation " + facade.util.PrintUtilities.spriteID_EnumToString(((__ValueTypes.IntVar)paramArrayOfObject[0]).i));
/* 131 */       wm.WorkingMemory.addWME("BeatMemory", new PhysicallyFavorWME(((__ValueTypes.IntVar)paramArrayOfObject[0]).i, 2));
/* 132 */       paramArrayOfObject[1] = new PhysicallyFavorWME(((__ValueTypes.IntVar)paramArrayOfObject[0]).i, 2);
/* 133 */       ((PhysicallyFavorWME)paramArrayOfObject[1]).setHandled(true);
/* 134 */       BehavingEntity.getBehavingEntity().addWME((PhysicallyFavorWME)paramArrayOfObject[1]);
/* 135 */       ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime = System.currentTimeMillis();
/* 136 */       break;
/*     */     
/*     */ 
/*     */     case 36: 
/* 140 */       paramArrayOfObject[2] = new PhysicallyFavorWME(((__ValueTypes.IntVar)paramArrayOfObject[0]).i, 2);
/* 141 */       BehavingEntity.getBehavingEntity().addWME((PhysicallyFavorWME)paramArrayOfObject[2]);
/* 142 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */     case 41: 
/* 147 */       float f = facade.util.Staging.getXZDistanceBetweenPoints(((__ValueTypes.FloatVar)paramArrayOfObject[1]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[2]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/* 148 */       facade.util.StringUtil.println("Player distance to object = " + f);
/* 149 */       break;
/*     */     
/*     */ 
/*     */     case 44: 
/* 153 */       BehavingEntity.getBehavingEntity().deleteWME((PhysicallyFavorWME)paramArrayOfObject[0]);
/* 154 */       facade.util.StringUtil.println("Done suppressing physicallyFavors_lookAt for object: " + facade.util.PrintUtilities.spriteID_EnumToString(((PhysicallyFavorWME)paramArrayOfObject[0]).getObjectID()));
/* 155 */       facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Done suppressing physicallyFavors_lookAt for object: " + facade.util.PrintUtilities.spriteID_EnumToString(((PhysicallyFavorWME)paramArrayOfObject[0]).getObjectID()));
/* 156 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     case 47: 
/* 164 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorWME");
/* 165 */       localObject2 = ((java.util.List)localObject1).iterator();
/* 166 */       java.util.Vector localVector = new java.util.Vector();
/* 167 */       while (((java.util.Iterator)localObject2).hasNext()) { PhysicallyFavorWME localPhysicallyFavorWME = (PhysicallyFavorWME)((java.util.Iterator)localObject2).next(); if (!localPhysicallyFavorWME.getHandled()) { localVector.add(new PhysicallyFavorWME(localPhysicallyFavorWME.getObjectID(), localPhysicallyFavorWME.getFavoringCharID()));localPhysicallyFavorWME.setHandled(true);facade.util.StringUtil.println("csPlayerPhysicallyFavors_LookAt " + facade.util.PrintUtilities.spriteID_EnumToString(localPhysicallyFavorWME.getObjectID()));facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("csPlayerPhysicallyFavors_LookAt " + facade.util.PrintUtilities.spriteID_EnumToString(localPhysicallyFavorWME.getObjectID())); } }
/* 168 */       wm.WorkingMemory.addWMEs("BeatMemory", localVector);
/* 169 */       ((Player)paramBehavingEntity).g_previousPhysicallyFavoredTime = System.currentTimeMillis();
/* 170 */       break;
/*     */     
/*     */ 
/*     */     case 48: 
/* 174 */       localObject1 = BehavingEntity.getBehavingEntity().lookupWME("SameAffinityBeatCounterWME");
/* 175 */       localObject2 = (SameAffinityBeatCounterWME[])((java.util.List)localObject1).toArray(new SameAffinityBeatCounterWME[((java.util.List)localObject1).size()]);
/* 176 */       for (int j = 0; j < localObject2.length; j++) if ((localObject2[j].getTargetBeatCount() == ((__ValueTypes.IntVar)paramArrayOfObject[0]).i) && (localObject2[j].getTargetAffinity() == ((__ValueTypes.IntVar)paramArrayOfObject[1]).i)) BehavingEntity.getBehavingEntity().deleteWME(localObject2[j]);
/* 177 */       BehavingEntity.getBehavingEntity().addWME(new SameAffinityBeatCounterWME(((__ValueTypes.IntVar)paramArrayOfObject[0]).i, 0, ((__ValueTypes.IntVar)paramArrayOfObject[1]).i));
/* 178 */       break;
/*     */     
/*     */ 
/*     */     case 51: 
/* 182 */       localObject1 = (dramaman.runtime.BeatStartWME)((dramaman.runtime.StoryMemory)paramArrayOfObject[2]).findPrev("dramaman.runtime.BeatStartWME", System.currentTimeMillis());
/* 183 */       if (localObject1 == null) ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l = 0L; else ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[3]).l = ((dramaman.runtime.BeatStartWME)localObject1).getTimestamp();
/* 184 */       break;
/*     */     
/*     */ 
/*     */     case 53: 
/* 188 */       ((SameAffinityBeatCounterWME)paramArrayOfObject[5]).setCounter(((SameAffinityBeatCounterWME)paramArrayOfObject[5]).getCounter() + 1);
/* 189 */       break;
/*     */     
/*     */ 
/*     */     case 55: 
/* 193 */       ((SameAffinityBeatCounterWME)paramArrayOfObject[3]).setCounter(0);
/* 194 */       break;
/*     */     
/*     */ 
/*     */     case 58: 
/* 198 */       wm.WorkingMemory.deleteWME("BeatMemory", (facade.characters.wmedef.SameAffinityNBeatsWME)paramArrayOfObject[2]);
/* 199 */       break;
/*     */     
/*     */ 
/*     */     case 60: 
/* 203 */       facade.util.StringUtil.println("Adding SameAffinityNBeatsWME(" + ((__ValueTypes.IntVar)paramArrayOfObject[0]).i + ", " + ((__ValueTypes.IntVar)paramArrayOfObject[1]).i + ") to beat memory");
/* 204 */       wm.WorkingMemory.addWME("BeatMemory", new facade.characters.wmedef.SameAffinityNBeatsWME(((__ValueTypes.IntVar)paramArrayOfObject[0]).i, ((__ValueTypes.IntVar)paramArrayOfObject[1]).i));
/* 205 */       break;
/*     */     
/*     */ 
/*     */     case 62: 
/* 209 */       ((OneCharacterVisibleInfoWME)paramArrayOfObject[1]).setLookDistance(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f);
/* 210 */       break;
/*     */     
/*     */ 
/*     */     case 63: 
/* 214 */       facade.util.StringUtil.println("OneCharacterVisbileSensorWME not found in player memory!");
/* 215 */       break;
/*     */     
/*     */ 
/*     */     case 64: 
/* 219 */       ((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b = facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[8]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[6]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[7]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f, 45.0F, 0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f);
/* 220 */       ((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b = facade.util.Staging.isPointWithinCharCone(((__ValueTypes.FloatVar)paramArrayOfObject[2]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[5]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[7]).f, ((__ValueTypes.FloatVar)paramArrayOfObject[3]).f, 45.0F, 0.0F, ((__ValueTypes.FloatVar)paramArrayOfObject[9]).f);
/* 221 */       break;
/*     */     
/*     */ 
/*     */     case 67: 
/* 225 */       wm.WorkingMemory.deleteWME("BeatMemory", (facade.characters.wmedef.OneCharacterVisibleWME)paramArrayOfObject[2]);
/* 226 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */     case 69: 
/* 231 */       if (((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) i = 1; else i = 0;
/* 232 */       wm.WorkingMemory.addWME("BeatMemory", new facade.characters.wmedef.OneCharacterVisibleWME(i));
/* 233 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */     case 70: 
/* 238 */       if (((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) i = 1; else i = 0;
/* 239 */       wm.WorkingMemory.addWME("BeatMemory", new facade.characters.wmedef.OneCharacterVisibleWME(i));
/* 240 */       break;
/*     */     
/*     */ 
/*     */     case 73: 
/* 244 */       if (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastSpoke() == 0L) { if (!((__ValueTypes.BooleanVar)paramArrayOfObject[5]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastSpoke(System.currentTimeMillis()); } else if (((__ValueTypes.BooleanVar)paramArrayOfObject[5]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastSpoke(0L);
/* 245 */       if ((((__ValueTypes.FloatVar)paramArrayOfObject[4]).f == ((PlayerUncoopWME)paramArrayOfObject[7]).getPrevPlayerX()) && (((__ValueTypes.FloatVar)paramArrayOfObject[6]).f == ((PlayerUncoopWME)paramArrayOfObject[7]).getPrevPlayerZ()) && (((__ValueTypes.FloatVar)paramArrayOfObject[3]).f == ((PlayerUncoopWME)paramArrayOfObject[7]).getPrevPlayerRot())) 0; ((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b = true;
/* 246 */       if (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastStill() == 0L) { if (((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastStill(System.currentTimeMillis()); } else if (!((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastStill(0L);
/* 247 */       ((PlayerUncoopWME)paramArrayOfObject[7]).setPrevPlayerX(((__ValueTypes.FloatVar)paramArrayOfObject[4]).f);
/* 248 */       ((PlayerUncoopWME)paramArrayOfObject[7]).setPrevPlayerZ(((__ValueTypes.FloatVar)paramArrayOfObject[6]).f);
/* 249 */       ((PlayerUncoopWME)paramArrayOfObject[7]).setPrevPlayerRot(((__ValueTypes.FloatVar)paramArrayOfObject[3]).f);
/* 250 */       if (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastBeganMoving() == 0L) { if (!((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastBeganMoving(System.currentTimeMillis()); } else if (((__ValueTypes.BooleanVar)paramArrayOfObject[0]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisLastBeganMoving(0L);
/* 251 */       if ((((__ValueTypes.FloatVar)paramArrayOfObject[4]).f < -150.0F) && (((__ValueTypes.FloatVar)paramArrayOfObject[6]).f > 50.0F)) 0; ((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b = true;
/* 252 */       if (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingApartment() == 0L) { if (((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisStartedLeavingApartment(System.currentTimeMillis()); } else if (!((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisStartedLeavingApartment(0L);
/* 253 */       if ((((__ValueTypes.FloatVar)paramArrayOfObject[4]).f > -115.0F) && (((__ValueTypes.FloatVar)paramArrayOfObject[6]).f > ((PlayerUncoopWME)paramArrayOfObject[7]).getLeavingForKitchenZ())) 0; ((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b = true;
/* 254 */       if (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingForKitchen() == 0L) { if (((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisStartedLeavingForKitchen(System.currentTimeMillis()); } else if (!((__ValueTypes.BooleanVar)paramArrayOfObject[1]).b) ((PlayerUncoopWME)paramArrayOfObject[7]).setMillisStartedLeavingForKitchen(0L);
/* 255 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBMonitorAntisocial()) && (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastSpoke() > 0L) && (System.currentTimeMillis() - ((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastSpoke() > 180000L)) { if (!((PlayerUncoopWME)paramArrayOfObject[7]).getBNotSpeaking()) facade.util.StringUtil.println("## Player has not spoken for a while"); ((PlayerUncoopWME)paramArrayOfObject[7]).setBNotSpeaking(true); } else { ((PlayerUncoopWME)paramArrayOfObject[7]).setBNotSpeaking(false); }
/* 256 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBMonitorAntisocial()) && (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastStill() > 0L) && (System.currentTimeMillis() - ((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastStill() > 300000L)) { if (!((PlayerUncoopWME)paramArrayOfObject[7]).getBNotMoving()) facade.util.StringUtil.println("## Player has not moved for a while"); ((PlayerUncoopWME)paramArrayOfObject[7]).setBNotMoving(true); } else { ((PlayerUncoopWME)paramArrayOfObject[7]).setBNotMoving(false); }
/* 257 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBMonitorAntisocial()) && (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastBeganMoving() > 0L) && (System.currentTimeMillis() - ((PlayerUncoopWME)paramArrayOfObject[7]).getMillisLastBeganMoving() > 45000L)) { if (!((PlayerUncoopWME)paramArrayOfObject[7]).getBFidgety()) facade.util.StringUtil.println("## Player has been fidgety for a while"); ((PlayerUncoopWME)paramArrayOfObject[7]).setBFidgety(true); } else { ((PlayerUncoopWME)paramArrayOfObject[7]).setBFidgety(false); }
/* 258 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBMonitorLeavingApartment()) && (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingApartment() > 0L) && (System.currentTimeMillis() - ((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingApartment() >= 3000L)) { if (!((PlayerUncoopWME)paramArrayOfObject[7]).getBLeavingApartment()) facade.util.StringUtil.println("## Player seems to be leaving apartment"); ((PlayerUncoopWME)paramArrayOfObject[7]).setBLeavingApartment(true); } else { ((PlayerUncoopWME)paramArrayOfObject[7]).setBLeavingApartment(false); }
/* 259 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBMonitorLeavingForKitchen()) && (((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingForKitchen() > 0L) && (System.currentTimeMillis() - ((PlayerUncoopWME)paramArrayOfObject[7]).getMillisStartedLeavingForKitchen() >= 3000L)) { if (!((PlayerUncoopWME)paramArrayOfObject[7]).getBLeavingForKitchen()) facade.util.StringUtil.println("## Player seems to be leaving for kitchen"); ((PlayerUncoopWME)paramArrayOfObject[7]).setBLeavingForKitchen(true); } else { ((PlayerUncoopWME)paramArrayOfObject[7]).setBLeavingForKitchen(false); }
/* 260 */       if ((((PlayerUncoopWME)paramArrayOfObject[7]).getBNotSpeaking()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBNotMoving()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBActingWeird()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBFidgety()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBLeavingForKitchen()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBLeavingApartment()) || (((PlayerUncoopWME)paramArrayOfObject[7]).getBLeftApartment())) 0; ((PlayerUncoopWME)paramArrayOfObject[7]).setBCurrentlyUncooperative(true);
/* 261 */       break;
/*     */     
/*     */ 
/*     */     case 74: 
/* 265 */       ((abl.runtime.__ValueTypes.LongVar)paramArrayOfObject[1]).l = (System.currentTimeMillis() + (int)(((__ValueTypes.FloatVar)paramArrayOfObject[0]).f * 1000.0F));
/* 266 */       break;
/*     */     
/*     */ 
/*     */     case 76: 
/* 270 */       ((__ValueTypes.FloatVar)paramArrayOfObject[1]).f = ((__ValueTypes.IntVar)paramArrayOfObject[0]).i;
/* 271 */       break;
/*     */     
/*     */ 
/*     */     case 78: 
/* 275 */       facade.util.StringUtil.println("** Player OverallControl");
/* 276 */       break;
/*     */     
/*     */ 
/*     */ 
/*     */     case 80: 
/* 281 */       BehavingEntity localBehavingEntity = BehavingEntity.getBehavingEntity();
/* 282 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(3, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 283 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(5, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 284 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(6, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 285 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(7, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 286 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(14, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 287 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(15, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 288 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(16, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 289 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(17, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 290 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(12, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 291 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(13, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 292 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(34, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Long));
/* 293 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(38, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 294 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(39, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 295 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(46, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Long));
/* 296 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(23, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 297 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(24, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 298 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(25, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 299 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(26, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 300 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(27, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 301 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(28, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 302 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(29, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 303 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(30, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 304 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(31, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 305 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(32, true, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 306 */       localBehavingEntity.addWME(new PhysicallyFavorInfoWME(11, false, true, ((Player)paramBehavingEntity).g_physicallyFavorLookDistance_Medium));
/* 307 */       localBehavingEntity.addWME(new OneCharacterVisibleInfoWME(9999.0F));
/* 308 */       break;
/*     */     
/*     */ 
/*     */     case 89: 
/* 312 */       paramArrayOfObject[0] = BehavingEntity.getBehavingEntity().lookupWME("PhysicallyFavorInfoWME");
/* 313 */       break;
/*     */     
/*     */ 
/*     */     case 91: 
/* 317 */       paramArrayOfObject[2] = ((java.util.List)paramArrayOfObject[1]).remove(0);
/* 318 */       ((__ValueTypes.IntVar)paramArrayOfObject[3]).i = ((PhysicallyFavorInfoWME)paramArrayOfObject[2]).getSpriteID();
/* 319 */       ((__ValueTypes.FloatVar)paramArrayOfObject[4]).f = ((PhysicallyFavorInfoWME)paramArrayOfObject[2]).getLookDistance();
/* 320 */       ((__ValueTypes.BooleanVar)paramArrayOfObject[5]).b = ((PhysicallyFavorInfoWME)paramArrayOfObject[2]).getLookAtSensorActive();
/* 321 */       ((__ValueTypes.BooleanVar)paramArrayOfObject[6]).b = ((PhysicallyFavorInfoWME)paramArrayOfObject[2]).getObjectActivateSensorActive();
/* 322 */       break;
/*     */     case 6: case 7: case 8: case 12: case 13: case 15: case 16: case 17: case 18: case 20: case 21: case 22: case 24: case 26: case 27: case 29: case 30: case 32: case 34: case 35: case 37: case 38: case 39: case 40: case 42: case 43: case 45: 
/*     */     case 46: case 49: case 50: case 52: case 54: case 56: case 57: case 59: case 61: case 65: case 66: case 68: case 71: case 72: case 75: case 77: case 79: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 90: default: 
/* 325 */       throw new abl.runtime.AblRuntimeError("Unexpected stepID " + paramInt);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\player\java\Player_MentalStepExecute.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */