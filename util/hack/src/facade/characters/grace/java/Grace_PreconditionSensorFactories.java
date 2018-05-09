/*     */ package facade.characters.grace.java;
/*     */ 
/*     */ import abl.runtime.SensorActivation;
/*     */ import facade.sensor.GraceArmBaseSensor;
/*     */ import facade.sensor.GraceObjectPickupPositionSensor;
/*     */ import facade.sensor.GraceObjectPickupRotationSensor;
/*     */ import facade.sensor.HeldObjectsSensor;
/*     */ import facade.sensor.ObjectPositionSensor;
/*     */ import facade.sensor.ObjectRotationSensor;
/*     */ import facade.sensor.ObjectStateSensor;
/*     */ import facade.util.BeatConstants;
/*     */ import facade.util.BeatStatus;
/*     */ import facade.util.BodyResource;
/*     */ 
/*     */ public class Grace_PreconditionSensorFactories implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, facade.util.PoseScripts, facade.util.GestureBodyPart, BodyResource, BeatStatus, BeatConstants, facade.util.ReactionConstants, facade.util.DAType, facade.util.ReactionID, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, facade.util.BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*     */ {
/*     */   public static SensorActivation[] preconditionSensorFactory0(int paramInt)
/*     */   {
/*     */     SensorActivation[] arrayOfSensorActivation;
/*  20 */     switch (paramInt) {
/*     */     case 170: 
/*  22 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  26 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 273: 
/*  30 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  34 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 279: 
/*  38 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  42 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 297: 
/*  46 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  50 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 352: 
/*  54 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  58 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 355: 
/*  62 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  66 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 356: 
/*  70 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  74 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 357: 
/*  78 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  82 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 358: 
/*  86 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  90 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 359: 
/*  94 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*  98 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 456: 
/* 102 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 106 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 665: 
/* 110 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 114 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1820: 
/* 118 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 122 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1821: 
/* 126 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 130 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1822: 
/* 134 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 138 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1823: 
/* 142 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 146 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1824: 
/* 150 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 154 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 1825: 
/* 158 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 162 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2097: 
/* 166 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 170 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2098: 
/* 174 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 178 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2222: 
/* 182 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 186 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2520: 
/* 190 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 194 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2522: 
/* 198 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 202 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2523: 
/* 206 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 210 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2524: 
/* 214 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 218 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2525: 
/* 222 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 226 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2902: 
/* 230 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 234 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2903: 
/* 238 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 242 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2953: 
/* 246 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 250 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2954: 
/* 254 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 258 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2955: 
/* 262 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 266 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2956: 
/* 270 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 274 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2983: 
/* 278 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 282 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2984: 
/* 286 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 290 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2985: 
/* 294 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 298 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 2986: 
/* 302 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 306 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3597: 
/* 310 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 314 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3598: 
/* 318 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 322 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3605: 
/* 326 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 330 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3606: 
/* 334 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 338 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3717: 
/* 342 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 346 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3764: 
/* 350 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 354 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3765: 
/* 358 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 362 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3766: 
/* 366 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 370 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 3767: 
/* 374 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 378 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4499: 
/* 382 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 386 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4666: 
/* 390 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 394 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4672: 
/* 398 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 403 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4676: 
/* 407 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 412 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4677: 
/* 416 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 421 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4679: 
/* 425 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 430 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4681: 
/* 434 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 438 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4682: 
/* 442 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 446 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4683: 
/* 450 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupPositionSensor(), null), new SensorActivation(new GraceObjectPickupRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 455 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4686: 
/* 459 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 463 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4687: 
/* 467 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 471 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4690: 
/* 475 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 479 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4691: 
/* 483 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 487 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4692: 
/* 491 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupPositionSensor(), null), new SensorActivation(new GraceObjectPickupRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 496 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4693: 
/* 500 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 504 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4694: 
/* 508 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceObjectPickupRotationSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 512 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4696: 
/* 516 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 520 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4697: 
/* 524 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 528 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4699: 
/* 532 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 536 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4703: 
/* 540 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 544 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4706: 
/* 548 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 552 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4707: 
/* 556 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 560 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4712: 
/* 564 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 568 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4722: 
/* 572 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 577 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4731: 
/* 581 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 585 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4732: 
/* 589 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 594 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4733: 
/* 598 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 603 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4737: 
/* 607 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 611 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4749: 
/* 615 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 619 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4775: 
/* 623 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceArmBaseSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 627 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4776: 
/* 631 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceArmBaseSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 635 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4821: 
/* 639 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceArmBaseSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 643 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4822: 
/* 647 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new GraceArmBaseSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 651 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4871: 
/* 655 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 659 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4872: 
/* 663 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 667 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4884: 
/* 671 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 675 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4885: 
/* 679 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 683 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4893: 
/* 687 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 691 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4916: 
/* 695 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 699 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4942: 
/* 703 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 707 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4943: 
/* 711 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 715 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4944: 
/* 719 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 723 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4947: 
/* 727 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 732 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4951: 
/* 736 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 740 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4955: 
/* 744 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/* 748 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4956: 
/* 752 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 759 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4960: 
/* 763 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 768 */       return arrayOfSensorActivation;
/*     */     
/*     */ 
/*     */     case 4968: 
/* 772 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 777 */       return arrayOfSensorActivation;
/*     */     }
/*     */     
/*     */     
/* 781 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\grace\java\Grace_PreconditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */