/*      */ package facade.characters.trip.java;
/*      */ 
/*      */ import abl.runtime.SensorActivation;
/*      */ import facade.sensor.HeldObjectsSensor;
/*      */ import facade.sensor.ObjectPositionSensor;
/*      */ import facade.sensor.ObjectRotationSensor;
/*      */ import facade.sensor.ObjectStateSensor;
/*      */ import facade.sensor.TripArmBaseSensor;
/*      */ import facade.sensor.TripObjectPickupPositionSensor;
/*      */ import facade.sensor.TripObjectPickupRotationSensor;
/*      */ import facade.util.BackstoryCategories;
/*      */ import facade.util.BeatConstants;
/*      */ import facade.util.BeatStatus;
/*      */ import facade.util.BodyResource;
/*      */ import facade.util.PoseScripts;
/*      */ 
/*      */ public class Trip_PreconditionSensorFactories implements facade.util.GraceScript, facade.util.TripScript, facade.util.AnimLayer, facade.util.FullExpressions, facade.util.SpriteID, PoseScripts, facade.util.GestureBodyPart, BodyResource, BeatStatus, BeatConstants, facade.util.ReactionID, facade.util.ReactionConstants, facade.util.DAType, facade.util.UniversalScript, dramaman.runtime.DramaManagerConstants, facade.util.PlayerGestureID, facade.util.BeatArguments, facade.util.BeatID, facade.util.EpisodicMemoryConstants, BackstoryCategories, facade.util.CrisisAccusations, facade.util.TherapyGameConstants, facade.util.MusicDefs
/*      */ {
/*      */   public static SensorActivation[] preconditionSensorFactory0(int paramInt)
/*      */   {
/*      */     SensorActivation[] arrayOfSensorActivation;
/*   22 */     switch (paramInt) {
/*      */     case 196: 
/*   24 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   28 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 317: 
/*   32 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   36 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 318: 
/*   40 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   44 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 319: 
/*   48 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   52 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 372: 
/*   56 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*   61 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 402: 
/*   65 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   69 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 514: 
/*   73 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   77 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 515: 
/*   81 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   85 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 516: 
/*   89 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*   93 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 793: 
/*   97 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  101 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 798: 
/*  105 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  109 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 829: 
/*  113 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  117 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 849: 
/*  121 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  125 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 852: 
/*  129 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  133 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 853: 
/*  137 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  141 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 854: 
/*  145 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  149 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 855: 
/*  153 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  157 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 856: 
/*  161 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  165 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1511: 
/*  169 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  174 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1533: 
/*  178 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  182 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1577: 
/*  186 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  190 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1578: 
/*  194 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  198 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1603: 
/*  202 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  206 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1615: 
/*  210 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  214 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1616: 
/*  218 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  222 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1617: 
/*  226 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  230 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1618: 
/*  234 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  238 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1682: 
/*  242 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  246 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1727: 
/*  250 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  254 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1752: 
/*  258 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  262 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1766: 
/*  266 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  270 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1824: 
/*  274 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  278 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1868: 
/*  282 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  286 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1869: 
/*  290 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  294 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1896: 
/*  298 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  302 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1906: 
/*  306 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  310 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1907: 
/*  314 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  318 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1908: 
/*  322 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  326 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 1909: 
/*  330 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  334 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3010: 
/*  338 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  342 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3074: 
/*  346 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  350 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3113: 
/*  354 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  358 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3135: 
/*  362 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  366 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3196: 
/*  370 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  374 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3394: 
/*  378 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  382 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3398: 
/*  386 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  390 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3401: 
/*  394 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  398 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 3406: 
/*  402 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  406 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4041: 
/*  410 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  414 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4042: 
/*  418 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  422 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4043: 
/*  426 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  430 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4044: 
/*  434 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  438 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4045: 
/*  442 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  446 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4046: 
/*  450 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  454 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4338: 
/*  458 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  462 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4339: 
/*  466 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  470 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4443: 
/*  474 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  478 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4466: 
/*  482 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  486 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 4943: 
/*  490 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  494 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5310: 
/*  498 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  502 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5312: 
/*  506 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  510 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5313: 
/*  514 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  518 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5314: 
/*  522 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  526 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5315: 
/*  530 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  534 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5806: 
/*  538 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  542 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5807: 
/*  546 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  550 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5819: 
/*  554 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  558 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 5820: 
/*  562 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  566 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 6955: 
/*  570 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  574 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 6962: 
/*  578 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  582 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 6977: 
/*  586 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  590 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7040: 
/*  594 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  598 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7041: 
/*  602 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  606 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7048: 
/*  610 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  614 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7049: 
/*  618 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  622 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7178: 
/*  626 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  630 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 7179: 
/*  634 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  638 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8394: 
/*  642 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  646 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8561: 
/*  650 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  654 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8567: 
/*  658 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  663 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8571: 
/*  667 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  672 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8572: 
/*  676 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  681 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8574: 
/*  685 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  690 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8576: 
/*  694 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  698 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8577: 
/*  702 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  706 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8578: 
/*  710 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupPositionSensor(), null), new SensorActivation(new TripObjectPickupRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  715 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8581: 
/*  719 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  723 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8582: 
/*  727 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  731 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8585: 
/*  735 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  739 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8586: 
/*  743 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  747 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8587: 
/*  751 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupPositionSensor(), null), new SensorActivation(new TripObjectPickupRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  756 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8588: 
/*  760 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  764 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8589: 
/*  768 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripObjectPickupRotationSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  772 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8591: 
/*  776 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  780 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8592: 
/*  784 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  788 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8594: 
/*  792 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  796 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8598: 
/*  800 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  804 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8601: 
/*  808 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  812 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8602: 
/*  816 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  820 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8607: 
/*  824 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  828 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8617: 
/*  832 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  837 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8626: 
/*  841 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  845 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8627: 
/*  849 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  854 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8628: 
/*  858 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  863 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8632: 
/*  867 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  871 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8644: 
/*  875 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  879 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8670: 
/*  883 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripArmBaseSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  887 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8671: 
/*  891 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripArmBaseSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  895 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8716: 
/*  899 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripArmBaseSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  903 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8717: 
/*  907 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new TripArmBaseSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  911 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8766: 
/*  915 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  919 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8767: 
/*  923 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  927 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8779: 
/*  931 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  935 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8780: 
/*  939 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  943 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8788: 
/*  947 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  951 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8811: 
/*  955 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  959 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8837: 
/*  963 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  967 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8838: 
/*  971 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  975 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8839: 
/*  979 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*  983 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8842: 
/*  987 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  992 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8862: 
/*  996 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1000 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8871: 
/* 1004 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1008 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8874: 
/* 1012 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1017 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8879: 
/* 1021 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1025 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8913: 
/* 1029 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1033 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8917: 
/* 1037 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1041 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8918: 
/* 1045 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectRotationSensor(), null), new SensorActivation(new ObjectPositionSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1052 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8922: 
/* 1056 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1061 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8930: 
/* 1065 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null), new SensorActivation(new ObjectStateSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1070 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8933: 
/* 1074 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1078 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8934: 
/* 1082 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1086 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 8935: 
/* 1090 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1094 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9001: 
/* 1098 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1102 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9006: 
/* 1106 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1110 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9048: 
/* 1114 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1118 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9129: 
/* 1122 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1126 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9135: 
/* 1130 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1134 */       return arrayOfSensorActivation;
/*      */     
/*      */ 
/*      */     case 9141: 
/* 1138 */       arrayOfSensorActivation = new SensorActivation[] { new SensorActivation(new HeldObjectsSensor(), null) };
/*      */       
/*      */ 
/*      */ 
/* 1142 */       return arrayOfSensorActivation;
/*      */     }
/*      */     
/*      */     
/* 1146 */     throw new abl.runtime.AblRuntimeError("Unexpected behaviorID " + paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\characters\trip\java\Trip_PreconditionSensorFactories.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */