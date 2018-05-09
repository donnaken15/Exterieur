/*     */ package wm;
/*     */ 
/*     */ import abl.runtime.BehaviorWME;
/*     */ import abl.runtime.GoalStepWME;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class WorkingMemory
/*     */ {
/*     */   private static Hashtable workingMemoryRegistry;
/*     */   private static final Class goalStepWME;
/*     */   private static final Class primitiveStepWME;
/*     */   private static final Class mentalStepWME;
/*     */   private static final Class waitStepWME;
/*     */   private static final Class failStepWME;
/*     */   private static final Class succeedStepWME;
/*     */   private static final Class collectionBehaviorWME;
/*     */   private static final Class parallelBehaviorWME;
/*     */   private static final Class sequentialBehaviorWME;
/*     */   private static final Class stepWME;
/*     */   private static final Class behaviorWME;
/*     */   protected Hashtable memory;
/*     */   protected WorkingMemoryDebugger workingMemoryDebugger;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  29 */     this.memory = new Hashtable();
/*  30 */     this.workingMemoryDebugger = null; }
/*  31 */   private static final boolean $noassert = Class.forName("[Lwm.WorkingMemory;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   public WorkingMemory() {
/*  34 */     jdMethod_this();
/*     */   }
/*     */   
/*     */   public WorkingMemory(String paramString) {
/*  38 */     jdMethod_this();
/*  39 */     workingMemoryRegistry.put(paramString, this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  44 */   public static WorkingMemory lookupRegisteredMemory(String paramString) { return (WorkingMemory)workingMemoryRegistry.get(paramString); }
/*     */   
/*     */   protected class ReflectionWMEEntry {
/*     */     private final LinkedList wmeList;
/*     */     private final Hashtable signatureTable;
/*     */     
/*  50 */     private final void jdMethod_this() { this.wmeList = new LinkedList();
/*     */       
/*     */ 
/*  53 */       this.signatureTable = new Hashtable();
/*     */       
/*     */ 
/*  56 */       this.propertyTable = new Hashtable(); }
/*     */     
/*  58 */     public ReflectionWMEEntry() { jdMethod_this(); }
/*     */     
/*     */     public void addWME(WME paramWME)
/*     */     {
/*  62 */       String str = WorkingMemory.wmeShortName(paramWME);
/*  63 */       if (str.equals("GoalStepWME")) {
/*  64 */         addGoalStepWME((GoalStepWME)paramWME);
/*  65 */       } else if (str.equals("WaitStepWME")) {
/*  66 */         addWaitStepWME((abl.runtime.WaitStepWME)paramWME);
/*  67 */       } else if (str.equals("MentalStepWME")) {
/*  68 */         addMentalStepWME((abl.runtime.MentalStepWME)paramWME);
/*  69 */       } else if (str.equals("PrimitiveStepWME")) {
/*  70 */         addPrimitiveStepWME((abl.runtime.PrimitiveStepWME)paramWME);
/*  71 */       } else if (str.equals("FailStepWME")) {
/*  72 */         addFailStepWME((abl.runtime.FailStepWME)paramWME);
/*  73 */       } else if (str.equals("SucceedStepWME")) {
/*  74 */         addSucceedStepWME((abl.runtime.SucceedStepWME)paramWME);
/*  75 */       } else if ((str.equals("CollectionBehaviorWME")) || (str.equals("ParallelBehaviorWME")) || (str.equals("SequentialBehaviorWME")))
/*     */       {
/*     */ 
/*  78 */         addBehaviorWME((BehaviorWME)paramWME);
/*     */       }
/*     */     }
/*     */     
/*     */     public void deleteWME(WME paramWME) {
/*  83 */       String str = WorkingMemory.wmeShortName(paramWME);
/*  84 */       if (str.equals("GoalStepWME")) {
/*  85 */         deleteGoalStepWME((GoalStepWME)paramWME);
/*  86 */       } else if (str.equals("WaitStepWME")) {
/*  87 */         deleteWaitStepWME((abl.runtime.WaitStepWME)paramWME);
/*  88 */       } else if (str.equals("MentalStepWME")) {
/*  89 */         deleteMentalStepWME((abl.runtime.MentalStepWME)paramWME);
/*  90 */       } else if (str.equals("PrimitiveStepWME")) {
/*  91 */         deletePrimitiveStepWME((abl.runtime.PrimitiveStepWME)paramWME);
/*  92 */       } else if (str.equals("FailStepWME")) {
/*  93 */         deleteFailStepWME((abl.runtime.FailStepWME)paramWME);
/*  94 */       } else if (str.equals("SucceedStepWME")) {
/*  95 */         deleteSucceedStepWME((abl.runtime.SucceedStepWME)paramWME);
/*  96 */       } else if ((str.equals("CollectionBehaviorWME")) || (str.equals("ParallelBehaviorWME")) || (str.equals("SequentialBehaviorWME")))
/*     */       {
/*     */ 
/*  99 */         deleteBehaviorWME((BehaviorWME)paramWME);
/*     */       }
/*     */     }
/*     */     
/*     */     public void addGoalStepWME(GoalStepWME paramGoalStepWME) {
/* 104 */       this.wmeList.add(paramGoalStepWME);
/*     */       
/* 106 */       indexBySignature(paramGoalStepWME, paramGoalStepWME.getSignature());
/* 107 */       indexByUserProperties(paramGoalStepWME, paramGoalStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     private final Hashtable propertyTable;
/*     */     
/*     */ 
/*     */ 
/*     */     private static final boolean $noassert = Class.forName("[Lwm.WorkingMemory;").getComponentType().desiredAssertionStatus() ^ true;
/*     */     
/*     */ 
/*     */     public void addWaitStepWME(abl.runtime.WaitStepWME paramWaitStepWME)
/*     */     {
/* 122 */       this.wmeList.add(paramWaitStepWME);
/* 123 */       indexByUserProperties(paramWaitStepWME, paramWaitStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void addMentalStepWME(abl.runtime.MentalStepWME paramMentalStepWME)
/*     */     {
/* 128 */       this.wmeList.add(paramMentalStepWME);
/* 129 */       indexByUserProperties(paramMentalStepWME, paramMentalStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void addPrimitiveStepWME(abl.runtime.PrimitiveStepWME paramPrimitiveStepWME)
/*     */     {
/* 134 */       this.wmeList.add(paramPrimitiveStepWME);
/* 135 */       indexByUserProperties(paramPrimitiveStepWME, paramPrimitiveStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void addFailStepWME(abl.runtime.FailStepWME paramFailStepWME)
/*     */     {
/* 140 */       this.wmeList.add(paramFailStepWME);
/* 141 */       indexByUserProperties(paramFailStepWME, paramFailStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void addSucceedStepWME(abl.runtime.SucceedStepWME paramSucceedStepWME)
/*     */     {
/* 146 */       this.wmeList.add(paramSucceedStepWME);
/* 147 */       indexByUserProperties(paramSucceedStepWME, paramSucceedStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void addBehaviorWME(BehaviorWME paramBehaviorWME) {
/* 151 */       this.wmeList.add(paramBehaviorWME);
/* 152 */       indexBySignature(paramBehaviorWME, paramBehaviorWME.getSignature());
/* 153 */       indexByUserProperties(paramBehaviorWME, paramBehaviorWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteGoalStepWME(GoalStepWME paramGoalStepWME)
/*     */     {
/* 158 */       this.wmeList.remove(paramGoalStepWME);
/* 159 */       deleteFromSignatureTable(paramGoalStepWME, paramGoalStepWME.getSignature());
/* 160 */       deleteFromUserPropertiesTable(paramGoalStepWME, paramGoalStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteWaitStepWME(abl.runtime.WaitStepWME paramWaitStepWME)
/*     */     {
/* 165 */       this.wmeList.remove(paramWaitStepWME);
/* 166 */       deleteFromUserPropertiesTable(paramWaitStepWME, paramWaitStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteMentalStepWME(abl.runtime.MentalStepWME paramMentalStepWME)
/*     */     {
/* 171 */       this.wmeList.remove(paramMentalStepWME);
/* 172 */       deleteFromUserPropertiesTable(paramMentalStepWME, paramMentalStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deletePrimitiveStepWME(abl.runtime.PrimitiveStepWME paramPrimitiveStepWME)
/*     */     {
/* 177 */       this.wmeList.remove(paramPrimitiveStepWME);
/* 178 */       deleteFromUserPropertiesTable(paramPrimitiveStepWME, paramPrimitiveStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteFailStepWME(abl.runtime.FailStepWME paramFailStepWME)
/*     */     {
/* 183 */       this.wmeList.remove(paramFailStepWME);
/* 184 */       deleteFromUserPropertiesTable(paramFailStepWME, paramFailStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteSucceedStepWME(abl.runtime.SucceedStepWME paramSucceedStepWME)
/*     */     {
/* 189 */       this.wmeList.remove(paramSucceedStepWME);
/* 190 */       deleteFromUserPropertiesTable(paramSucceedStepWME, paramSucceedStepWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     public void deleteBehaviorWME(BehaviorWME paramBehaviorWME)
/*     */     {
/* 195 */       this.wmeList.remove(paramBehaviorWME);
/* 196 */       deleteFromSignatureTable(paramBehaviorWME, paramBehaviorWME.getSignature());
/* 197 */       deleteFromUserPropertiesTable(paramBehaviorWME, paramBehaviorWME.getAllDefinedProperties());
/*     */     }
/*     */     
/*     */     private final void indexBySignature(WME paramWME, String paramString)
/*     */     {
/* 202 */       Object localObject = (List)this.signatureTable.get(paramString);
/* 203 */       if (localObject == null) {
/* 204 */         localObject = new LinkedList();
/* 205 */         ((List)localObject).add(paramWME);
/* 206 */         this.signatureTable.put(paramString, localObject);
/*     */       }
/*     */       else {
/* 209 */         ((List)localObject).add(paramWME);
/*     */       }
/*     */     }
/*     */     
/*     */     private final void indexByUserProperties(WME paramWME, List paramList) {
/* 214 */       Iterator localIterator = paramList.iterator();
/* 215 */       while (localIterator.hasNext()) {
/* 216 */         abl.runtime.AblNamedPropertySupport.UserProperty localUserProperty = (abl.runtime.AblNamedPropertySupport.UserProperty)localIterator.next();
/* 217 */         String str = localUserProperty.getName();
/* 218 */         Object localObject = (List)this.propertyTable.get(str);
/* 219 */         if (localObject == null) {
/* 220 */           localObject = new LinkedList();
/* 221 */           ((List)localObject).add(paramWME);
/* 222 */           this.propertyTable.put(str, localObject);
/*     */         }
/*     */         else {
/* 225 */           ((List)localObject).add(paramWME);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     private final void deleteFromSignatureTable(WME paramWME, String paramString)
/*     */     {
/* 241 */       List localList = (List)this.signatureTable.get(paramString);
/*     */       
/* 243 */       if ((!$noassert) && ((localList == null) || (localList.size() <= 0) || (!localList.contains(paramWME)))) { throw new AssertionError();
/*     */       }
/* 245 */       localList.remove(paramWME);
/* 246 */       if (localList.size() == 0) {
/* 247 */         this.signatureTable.remove(paramString);
/*     */       }
/*     */     }
/*     */     
/*     */     private final void deleteFromUserPropertiesTable(WME paramWME, List paramList) {
/* 252 */       Iterator localIterator = paramList.iterator();
/*     */       
/* 254 */       while (localIterator.hasNext()) {
/* 255 */         abl.runtime.AblNamedPropertySupport.UserProperty localUserProperty = (abl.runtime.AblNamedPropertySupport.UserProperty)localIterator.next();
/* 256 */         String str = localUserProperty.getName();
/* 257 */         List localList = (List)this.propertyTable.get(str);
/*     */         
/* 259 */         if ((!$noassert) && ((localList == null) || (localList.size() <= 0) || (!localList.contains(paramWME)))) { throw new AssertionError();
/*     */         }
/* 261 */         localList.remove(paramWME);
/*     */       }
/*     */     }
/*     */     
/*     */     public LinkedList lookupWMEBySignature(String paramString)
/*     */     {
/* 267 */       LinkedList localLinkedList = (LinkedList)this.signatureTable.get(paramString);
/* 268 */       if (localLinkedList == null) {
/* 269 */         localLinkedList = new LinkedList();
/*     */       }
/* 271 */       return localLinkedList;
/*     */     }
/*     */     
/*     */     public LinkedList lookupWMEByProperty(String paramString)
/*     */     {
/* 276 */       LinkedList localLinkedList = (LinkedList)this.propertyTable.get(paramString);
/* 277 */       if (localLinkedList == null) {
/* 278 */         localLinkedList = new LinkedList();
/*     */       }
/* 280 */       return localLinkedList;
/*     */     }
/*     */     
/* 283 */     public LinkedList getWMEList() { return this.wmeList; }
/*     */   }
/*     */   
/*     */ 
/*     */   public static String wmeShortName(WME paramWME)
/*     */   {
/* 289 */     String str = paramWME.getClass().getName();
/* 290 */     return str.substring(str.lastIndexOf('.') + 1);
/*     */   }
/*     */   
/*     */ 
/*     */   public static String wmeShortName(String paramString)
/*     */   {
/* 296 */     if (paramString.indexOf('.') != -1) {
/* 297 */       return paramString.substring(paramString.lastIndexOf('.') + 1);
/*     */     }
/* 299 */     return paramString;
/*     */   }
/*     */   
/*     */   public synchronized void addWME(WME paramWME)
/*     */   {
/* 304 */     if ((!$noassert) && (paramWME == null)) { throw new AssertionError();
/*     */     }
/* 306 */     if (isReflectionWME(paramWME)) {
/* 307 */       addReflectionWME(paramWME);
/*     */     }
/*     */     else
/*     */     {
/*     */       try {
/* 312 */         if ((Class.forName("wm.TimeStampedWME").isAssignableFrom(paramWME.getClass())) && (((TimeStampedWME)paramWME).getTimestamp() == 0L))
/* 313 */           ((TimeStampedWME)paramWME).setTimestamp(System.currentTimeMillis());
/* 314 */       } catch (Exception localException) { throw new WmeReflectionError(localException);
/*     */       }
/* 316 */       String str = wmeShortName(paramWME);
/* 317 */       LinkedList localLinkedList; if (!this.memory.containsKey(str))
/*     */       {
/*     */ 
/*     */ 
/* 321 */         localLinkedList = new LinkedList();
/* 322 */         localLinkedList.add(paramWME);
/* 323 */         this.memory.put(str, localLinkedList);
/*     */       }
/*     */       else
/*     */       {
/* 327 */         localLinkedList = (LinkedList)this.memory.get(str);
/* 328 */         localLinkedList.add(paramWME);
/*     */       }
/*     */     }
/* 331 */     if (this.workingMemoryDebugger != null) {
/* 332 */       this.workingMemoryDebugger.updateIfMonitoring();
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void addWMEs(List paramList)
/*     */   {
/* 338 */     if ((!$noassert) && (paramList == null)) { throw new AssertionError();
/*     */     }
/* 340 */     Iterator localIterator = paramList.iterator();
/* 341 */     while (localIterator.hasNext()) {
/* 342 */       addWME((WME)localIterator.next());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addWME(String paramString, WME paramWME)
/*     */   {
/* 348 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString);
/* 349 */     localWorkingMemory.addWME(paramWME);
/*     */   }
/*     */   
/*     */ 
/*     */   public static void addWMEs(String paramString, List paramList)
/*     */   {
/* 355 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString);
/* 356 */     localWorkingMemory.addWMEs(paramList);
/*     */   }
/*     */   
/*     */ 
/*     */   public synchronized void modifyWME(WME paramWME1, WME paramWME2)
/*     */     throws IncompatibleWmeClassException, NonexistentWmeException
/*     */   {
/* 363 */     if ((!$noassert) && (isReflectionWME(wmeShortName(paramWME1)))) { throw new AssertionError();
/*     */     }
/* 365 */     if (!wmeShortName(paramWME1).equals(wmeShortName(paramWME2))) {
/* 366 */       throw new IncompatibleWmeClassException();
/*     */     }
/* 368 */     String str = wmeShortName(paramWME1);
/*     */     
/* 370 */     if (!this.memory.containsKey(str)) {
/* 371 */       throw new NonexistentWmeException();
/*     */     }
/* 373 */     LinkedList localLinkedList = (LinkedList)this.memory.get(str);
/* 374 */     if (!localLinkedList.contains(paramWME1)) {
/* 375 */       throw new NonexistentWmeException();
/*     */     }
/* 377 */     paramWME1.assign(paramWME2);
/*     */     
/* 379 */     if (this.workingMemoryDebugger != null) {
/* 380 */       this.workingMemoryDebugger.updateIfMonitoring();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void modifyWME(String paramString, WME paramWME1, WME paramWME2)
/*     */     throws IncompatibleWmeClassException, NonexistentWmeException
/*     */   {
/* 387 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString);
/* 388 */     localWorkingMemory.modifyWME(paramWME1, paramWME2);
/*     */   }
/*     */   
/*     */ 
/*     */   public synchronized void deleteWME(WME paramWME)
/*     */   {
/* 394 */     String str = wmeShortName(paramWME);
/* 395 */     if (isReflectionWME(str)) {
/* 396 */       deleteReflectionWME(paramWME);
/*     */ 
/*     */     }
/* 399 */     else if (this.memory.containsKey(str))
/*     */     {
/* 401 */       LinkedList localLinkedList = (LinkedList)this.memory.get(str);
/* 402 */       if (localLinkedList.contains(paramWME))
/*     */       {
/* 404 */         localLinkedList.remove(paramWME);
/*     */       }
/*     */       
/* 407 */       if (localLinkedList.size() == 0) {
/* 408 */         this.memory.remove(str);
/*     */       }
/*     */     }
/* 411 */     if (this.workingMemoryDebugger != null) {
/* 412 */       this.workingMemoryDebugger.updateIfMonitoring();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void deleteWME(String paramString, WME paramWME)
/*     */   {
/* 418 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString);
/* 419 */     localWorkingMemory.deleteWME(paramWME);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public synchronized void deleteAllWMEClass(String paramString)
/*     */   {
/* 426 */     if (isReflectionWME(paramString)) {
/* 427 */       deleteAllReflectionWMEClass(paramString);
/*     */ 
/*     */     }
/* 430 */     else if (this.memory.containsKey(paramString)) {
/* 431 */       LinkedList localLinkedList = (LinkedList)this.memory.get(paramString);
/* 432 */       java.util.ListIterator localListIterator = localLinkedList.listIterator();
/* 433 */       while (localListIterator.hasNext()) {
/* 434 */         localListIterator.next();
/* 435 */         localListIterator.remove();
/*     */       }
/*     */     }
/*     */     
/* 439 */     if (this.workingMemoryDebugger != null) {
/* 440 */       this.workingMemoryDebugger.updateIfMonitoring();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void deleteAllWMEClass(String paramString1, String paramString2)
/*     */   {
/* 446 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString1);
/* 447 */     localWorkingMemory.deleteAllWMEClass(paramString2);
/*     */   }
/*     */   
/*     */   protected synchronized void deleteReflectionWME(WME paramWME)
/*     */   {
/* 452 */     if ((!$noassert) && (!isReflectionWME(paramWME))) { throw new AssertionError();
/*     */     }
/* 454 */     String str = wmeShortName(paramWME);
/* 455 */     ReflectionWMEEntry localReflectionWMEEntry = (ReflectionWMEEntry)this.memory.get(str);
/*     */     
/* 457 */     if ((!$noassert) && (localReflectionWMEEntry == null)) { throw new AssertionError(str);
/*     */     }
/* 459 */     localReflectionWMEEntry.deleteWME(paramWME);
/* 460 */     if (localReflectionWMEEntry.getWMEList().size() == 0) {
/* 461 */       this.memory.remove(str);
/*     */     }
/*     */   }
/*     */   
/*     */   protected synchronized void deleteAllReflectionWMEClass(String paramString) {
/* 466 */     if ((!$noassert) && (this.memory.get(paramString) == null)) throw new AssertionError();
/* 467 */     this.memory.remove(paramString);
/*     */   }
/*     */   
/*     */   public synchronized LinkedList lookupWME(String paramString)
/*     */   {
/*     */     LinkedList localLinkedList;
/* 473 */     if (isReflectionWME(paramString)) {
/* 474 */       ReflectionWMEEntry localReflectionWMEEntry = (ReflectionWMEEntry)this.memory.get(paramString);
/* 475 */       if (localReflectionWMEEntry == null) {
/* 476 */         return new LinkedList();
/*     */       }
/* 478 */       localLinkedList = localReflectionWMEEntry.getWMEList();
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/*     */ 
/* 484 */       localLinkedList = (LinkedList)this.memory.get(paramString);
/*     */     }
/* 486 */     if (localLinkedList == null) {
/* 487 */       return new LinkedList();
/*     */     }
/* 489 */     return (LinkedList)localLinkedList.clone();
/*     */   }
/*     */   
/*     */ 
/*     */   public static LinkedList lookupWME(String paramString1, String paramString2)
/*     */   {
/* 495 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString1);
/* 496 */     return localWorkingMemory.lookupWME(paramString2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized List lookupReflectionWMEBySignature(String paramString1, String paramString2)
/*     */   {
/* 505 */     if ((!$noassert) && (!paramString1.equals("GoalStepWME")) && (!paramString1.equals("SequentialBehaviorWME")) && (!paramString1.equals("ParallelBehaviorWME")) && (!paramString1.equals("CollectionBehaviorWME"))) { throw new AssertionError();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 510 */     ReflectionWMEEntry localReflectionWMEEntry = (ReflectionWMEEntry)this.memory.get(paramString1);
/* 511 */     if (localReflectionWMEEntry == null) {
/* 512 */       return new LinkedList();
/*     */     }
/* 514 */     return (LinkedList)localReflectionWMEEntry.lookupWMEBySignature(paramString2).clone();
/*     */   }
/*     */   
/*     */ 
/*     */   public static List lookupReflectionWMEBySignature(String paramString1, String paramString2, String paramString3)
/*     */   {
/* 520 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString1);
/* 521 */     return localWorkingMemory.lookupReflectionWMEBySignature(paramString2, paramString3);
/*     */   }
/*     */   
/*     */ 
/*     */   public synchronized List lookupReflectionWMEByUserProperty(String paramString1, String paramString2)
/*     */   {
/* 527 */     if ((!$noassert) && (!isReflectionWME(paramString1))) { throw new AssertionError();
/*     */     }
/* 529 */     ReflectionWMEEntry localReflectionWMEEntry = (ReflectionWMEEntry)this.memory.get(paramString1);
/* 530 */     if (localReflectionWMEEntry == null) {
/* 531 */       return new LinkedList();
/*     */     }
/* 533 */     return (LinkedList)localReflectionWMEEntry.lookupWMEByProperty(paramString2).clone();
/*     */   }
/*     */   
/*     */ 
/*     */   public static List lookupReflectionWMEByUserProperty(String paramString1, String paramString2, String paramString3)
/*     */   {
/* 539 */     WorkingMemory localWorkingMemory = lookupRegisteredMemory(paramString1);
/* 540 */     return localWorkingMemory.lookupReflectionWMEByUserProperty(paramString2, paramString3);
/*     */   }
/*     */   
/*     */   protected synchronized void addReflectionWME(WME paramWME)
/*     */   {
/* 545 */     if ((!$noassert) && (!isReflectionWME(paramWME))) { throw new AssertionError();
/*     */     }
/*     */     
/* 548 */     String str = wmeShortName(paramWME);
/* 549 */     ReflectionWMEEntry localReflectionWMEEntry; if (!this.memory.containsKey(str))
/*     */     {
/*     */ 
/* 552 */       localReflectionWMEEntry = new ReflectionWMEEntry();
/* 553 */       localReflectionWMEEntry.addWME(paramWME);
/* 554 */       this.memory.put(str, localReflectionWMEEntry);
/*     */     }
/*     */     else
/*     */     {
/* 558 */       localReflectionWMEEntry = (ReflectionWMEEntry)this.memory.get(str);
/* 559 */       localReflectionWMEEntry.addWME(paramWME);
/*     */     }
/*     */   }
/*     */   
/*     */   static
/*     */   {
/*  31 */     workingMemoryRegistry = new Hashtable();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 577 */       goalStepWME = Class.forName("abl.runtime.GoalStepWME");
/* 578 */       primitiveStepWME = Class.forName("abl.runtime.PrimitiveStepWME");
/* 579 */       mentalStepWME = Class.forName("abl.runtime.MentalStepWME");
/* 580 */       waitStepWME = Class.forName("abl.runtime.WaitStepWME");
/* 581 */       failStepWME = Class.forName("abl.runtime.FailStepWME");
/* 582 */       succeedStepWME = Class.forName("abl.runtime.SucceedStepWME");
/* 583 */       collectionBehaviorWME = Class.forName("abl.runtime.CollectionBehaviorWME");
/* 584 */       parallelBehaviorWME = Class.forName("abl.runtime.ParallelBehaviorWME");
/* 585 */       sequentialBehaviorWME = Class.forName("abl.runtime.SequentialBehaviorWME");
/* 586 */       stepWME = Class.forName("abl.runtime.StepWME");
/* 587 */       behaviorWME = Class.forName("abl.runtime.BehaviorWME");
/* 588 */     } catch (ClassNotFoundException localClassNotFoundException) { throw new WmeReflectionError(localClassNotFoundException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static boolean isReflectionWME(String paramString)
/*     */   {
/* 596 */     if ((paramString.equals("GoalStepWME")) || (paramString.equals("PrimitiveStepWME")) || (paramString.equals("MentalStepWME")) || (paramString.equals("WaitStepWME")) || (paramString.equals("FailStepWME")) || (paramString.equals("SucceedStepWME")) || (paramString.equals("CollectionBehaviorWME")) || (paramString.equals("ParallelBehaviorWME")) || (paramString.equals("SequentialBehaviorWME")))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */       return true;
/*     */     }
/*     */     
/* 608 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static boolean isReflectionWME(WME paramWME)
/*     */   {
/* 615 */     Class localClass = paramWME.getClass();
/*     */     
/* 617 */     return isReflectionWME(wmeShortName(localClass.getName()));
/*     */   }
/*     */   
/*     */   public static boolean isReflectionWME(Class paramClass)
/*     */   {
/* 622 */     return isReflectionWME(wmeShortName(paramClass.getName()));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized WME findNext(String paramString, long paramLong)
/*     */   {
/*     */     try
/*     */     {
/* 632 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 633 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 634 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 635 */     if (localLinkedList.size() == 0) {
/* 636 */       return null;
/*     */     }
/* 638 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 639 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 640 */     for (int i = 0; i < arrayOfTimeStampedWME.length; i++) {
/* 641 */       if (arrayOfTimeStampedWME[i].getTimestamp() > paramLong)
/* 642 */         return arrayOfTimeStampedWME[i];
/*     */     }
/* 644 */     return null;
/*     */   }
/*     */   
/*     */   public synchronized WME findPrev(String paramString, long paramLong)
/*     */   {
/*     */     try
/*     */     {
/* 651 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 652 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 653 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 654 */     if (localLinkedList.size() == 0) {
/* 655 */       return null;
/*     */     }
/* 657 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 658 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 659 */     for (int i = arrayOfTimeStampedWME.length - 1; i >= 0; i--) {
/* 660 */       if (arrayOfTimeStampedWME[i].getTimestamp() < paramLong)
/* 661 */         return arrayOfTimeStampedWME[i];
/*     */     }
/* 663 */     return null;
/*     */   }
/*     */   
/*     */   public synchronized WME findFirst(String paramString)
/*     */   {
/*     */     try
/*     */     {
/* 670 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 671 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 672 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 673 */     if (localLinkedList.size() == 0) {
/* 674 */       return null;
/*     */     }
/* 676 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 677 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 678 */     return arrayOfTimeStampedWME[0];
/*     */   }
/*     */   
/*     */   public synchronized WME findLast(String paramString)
/*     */   {
/*     */     try
/*     */     {
/* 685 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 686 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 687 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 688 */     if (localLinkedList.size() == 0) {
/* 689 */       return null;
/*     */     }
/* 691 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 692 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 693 */     return arrayOfTimeStampedWME[(arrayOfTimeStampedWME.length - 1)];
/*     */   }
/*     */   
/*     */   public synchronized List findAll(String paramString, long paramLong1, long paramLong2)
/*     */   {
/*     */     try
/*     */     {
/* 700 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 701 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 702 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 703 */     if (localLinkedList.size() == 0) {
/* 704 */       return new java.util.Vector();
/*     */     }
/* 706 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 707 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 708 */     java.util.Vector localVector = new java.util.Vector();
/* 709 */     for (int i = 0; i < arrayOfTimeStampedWME.length; i++) {
/* 710 */       if ((arrayOfTimeStampedWME[i].getTimestamp() >= paramLong1) && (arrayOfTimeStampedWME[i].getTimestamp() <= paramLong2))
/*     */       {
/* 712 */         localVector.add(arrayOfTimeStampedWME[i]); }
/* 713 */       if (arrayOfTimeStampedWME[i].getTimestamp() > paramLong2) {
/*     */         break;
/*     */       }
/*     */     }
/* 717 */     return localVector;
/*     */   }
/*     */   
/*     */   public synchronized int countWMEBefore(String paramString, long paramLong)
/*     */   {
/*     */     try
/*     */     {
/* 724 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 725 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 726 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 727 */     if (localLinkedList.size() == 0) {
/* 728 */       return 0;
/*     */     }
/* 730 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 731 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 732 */     int i = 0;
/* 733 */     for (int j = 0; j < arrayOfTimeStampedWME.length; j++) {
/* 734 */       if (arrayOfTimeStampedWME[j].getTimestamp() < paramLong) i++;
/* 735 */       if (arrayOfTimeStampedWME[j].getTimestamp() >= paramLong) break;
/*     */     }
/* 737 */     return i;
/*     */   }
/*     */   
/*     */   public synchronized int countWMEAfter(String paramString, long paramLong)
/*     */   {
/*     */     try
/*     */     {
/* 744 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 745 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 746 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 747 */     if (localLinkedList.size() == 0) {
/* 748 */       return 0;
/*     */     }
/* 750 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 751 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 752 */     int i = 0;
/* 753 */     for (int j = arrayOfTimeStampedWME.length - 1; j >= 0; j--) {
/* 754 */       if (arrayOfTimeStampedWME[j].getTimestamp() > paramLong) i++;
/* 755 */       if (arrayOfTimeStampedWME[j].getTimestamp() <= paramLong) break;
/*     */     }
/* 757 */     return i;
/*     */   }
/*     */   
/*     */   public synchronized int countWMEBetween(String paramString, long paramLong1, long paramLong2)
/*     */   {
/*     */     try
/*     */     {
/* 764 */       if ((!$noassert) && (!Class.forName("wm.TimeStampedWME").isAssignableFrom(Class.forName(paramString)))) throw new AssertionError();
/* 765 */     } catch (Exception localException) { throw new WmeReflectionError(localException); }
/* 766 */     LinkedList localLinkedList = lookupWME(wmeShortName(paramString));
/* 767 */     if (localLinkedList.size() == 0) {
/* 768 */       return 0;
/*     */     }
/* 770 */     TimeStampedWME[] arrayOfTimeStampedWME = (TimeStampedWME[])localLinkedList.toArray(new TimeStampedWME[localLinkedList.size()]);
/* 771 */     java.util.Arrays.sort(arrayOfTimeStampedWME);
/* 772 */     int i = 0;
/* 773 */     for (int j = 0; j < arrayOfTimeStampedWME.length; j++) {
/* 774 */       if ((arrayOfTimeStampedWME[j].getTimestamp() >= paramLong1) && (arrayOfTimeStampedWME[j].getTimestamp() <= paramLong2))
/*     */       {
/* 776 */         i++; }
/* 777 */       if (arrayOfTimeStampedWME[j].getTimestamp() > paramLong2) {
/*     */         break;
/*     */       }
/*     */     }
/* 781 */     return i;
/*     */   }
/*     */   
/*     */   class WMTreeNode extends javax.swing.tree.DefaultMutableTreeNode {
/*     */     private boolean isClassNode;
/*     */     
/* 787 */     private final void jdMethod_this() { this.isClassNode = false; }
/*     */     
/*     */     WMTreeNode(Object paramObject, boolean paramBoolean)
/*     */     {
/* 791 */       super();jdMethod_this();
/* 792 */       this.isClassNode = paramBoolean;
/*     */     }
/*     */     
/*     */     WMTreeNode(String paramString)
/*     */     {
/* 797 */       super();jdMethod_this();
/*     */     }
/*     */     
/* 800 */     boolean getIsClassNode() { return this.isClassNode; }
/*     */   }
/*     */   
/*     */   public synchronized javax.swing.tree.DefaultTreeModel getWMTreeModel()
/*     */   {
/* 805 */     java.util.Enumeration localEnumeration = this.memory.keys();
/*     */     
/*     */ 
/*     */ 
/* 809 */     javax.swing.tree.DefaultTreeModel localDefaultTreeModel = new javax.swing.tree.DefaultTreeModel(new javax.swing.tree.DefaultMutableTreeNode("working memory root"));
/* 810 */     javax.swing.tree.DefaultMutableTreeNode localDefaultMutableTreeNode = (javax.swing.tree.DefaultMutableTreeNode)localDefaultTreeModel.getRoot();
/*     */     
/*     */ 
/* 813 */     while (localEnumeration.hasMoreElements()) {
/* 814 */       String str = (String)localEnumeration.nextElement();
/* 815 */       LinkedList localLinkedList; if (isReflectionWME(str)) {
/* 816 */         localLinkedList = ((ReflectionWMEEntry)this.memory.get(str)).getWMEList();
/*     */       }
/*     */       else {
/* 819 */         localLinkedList = (LinkedList)this.memory.get(str);
/*     */       }
/* 821 */       if (!localLinkedList.isEmpty()) {
/* 822 */         java.util.ListIterator localListIterator = localLinkedList.listIterator();
/* 823 */         WMTreeNode localWMTreeNode1 = new WMTreeNode(str, true);
/* 824 */         localDefaultMutableTreeNode.add(localWMTreeNode1);
/* 825 */         while (localListIterator.hasNext()) {
/* 826 */           WMTreeNode localWMTreeNode2 = new WMTreeNode(localListIterator.next(), false);
/* 827 */           localWMTreeNode1.add(localWMTreeNode2);
/*     */         }
/*     */       }
/*     */     }
/* 831 */     return localDefaultTreeModel;
/*     */   }
/*     */   
/*     */ 
/*     */   public WorkingMemoryDebugger getWMDebugInterface()
/*     */   {
/* 837 */     return new WorkingMemoryDebugger(this);
/*     */   }
/*     */   
/*     */ 
/*     */   void setWMDebugger(WorkingMemoryDebugger paramWorkingMemoryDebugger)
/*     */   {
/* 843 */     if ((!$noassert) && (this.workingMemoryDebugger != null)) { throw new AssertionError();
/*     */     }
/* 845 */     this.workingMemoryDebugger = paramWorkingMemoryDebugger;
/*     */   }
/*     */   
/*     */   public synchronized void markTransientWMEs() {
/* 849 */     java.util.Enumeration localEnumeration = this.memory.keys();
/* 850 */     while (localEnumeration.hasMoreElements()) {
/* 851 */       String str = (String)localEnumeration.nextElement();
/* 852 */       if (!isReflectionWME(str))
/*     */       {
/* 854 */         List localList = (List)this.memory.get(str);
/* 855 */         if ((!localList.isEmpty()) && 
/* 856 */           (((WME)localList.get(0)).isTransient()))
/*     */         {
/* 858 */           Iterator localIterator = localList.iterator();
/* 859 */           while (localIterator.hasNext()) {
/* 860 */             ((TransientWME)localIterator.next()).mark();
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void deleteMarkedTransientWMEs() {
/* 868 */     java.util.Enumeration localEnumeration = this.memory.keys();
/* 869 */     while (localEnumeration.hasMoreElements()) {
/* 870 */       String str = (String)localEnumeration.nextElement();
/* 871 */       if (!isReflectionWME(str))
/*     */       {
/* 873 */         java.util.Vector localVector = new java.util.Vector((List)this.memory.get(str));
/* 874 */         if ((!localVector.isEmpty()) && 
/* 875 */           (((WME)localVector.get(0)).isTransient()))
/*     */         {
/* 877 */           Iterator localIterator = localVector.iterator();
/* 878 */           while (localIterator.hasNext()) {
/* 879 */             TransientWME localTransientWME = (TransientWME)localIterator.next();
/* 880 */             if (localTransientWME.getMarked()) {
/* 881 */               deleteWME(localTransientWME);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemory.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */