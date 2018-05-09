/*     */ package dramaman.runtime;
/*     */ 
/*     */ import java.util.List;
/*     */ 
/*     */ public class DramaManager implements facade.util.BeatID, DramaManagerConstants {
/*     */   private static StoryMemory storyMemory;
/*     */   private static DramaManager dramaManager;
/*     */   private String beatPackage;
/*     */   private java.util.HashSet beatCollection;
/*     */   private boolean storyComplete;
/*     */   private boolean isMonitored;
/*     */   private DramaManagerMonitor monitorGUI;
/*     */   private boolean manualTestMode;
/*     */   
/*     */   private final void jdMethod_this() {
/*  16 */     this.storyComplete = false;
/*     */     
/*  18 */     this.isMonitored = false;
/*  19 */     this.monitorGUI = null;
/*  20 */     this.manualTestMode = false;
/*  21 */     this.activeBeat = null;
/*  22 */     this.cumulativeSquareError = 0.0F;
/*     */     
/*     */ 
/*  25 */     this.beatProbabilityComparator = new BeatProbabilityComparator();
/*  26 */     this.beatPriorityComparator = new BeatPriorityComparator();
/*  27 */     this.randomGen = new java.util.Random();
/*  28 */     this.manuallySelectedBeat = null;
/*     */   }
/*     */   
/*     */   class BeatProbabilityComparator implements java.util.Comparator
/*     */   {
/*     */     public int compare(Object paramObject1, Object paramObject2)
/*     */     {
/*  35 */       Beat localBeat1 = (Beat)paramObject1;
/*  36 */       Beat localBeat2 = (Beat)paramObject2;
/*     */       
/*     */ 
/*  39 */       Float localFloat1 = new Float(localBeat1.getProbability());
/*  40 */       Float localFloat2 = new Float(localBeat2.getProbability());
/*  41 */       return localFloat2.compareTo(localFloat1);
/*     */     }
/*     */     
/*     */     BeatProbabilityComparator() {}
/*     */   }
/*     */   
/*     */   class BeatPriorityComparator implements java.util.Comparator {
/*     */     public int compare(Object paramObject1, Object paramObject2) {
/*  49 */       Beat localBeat1 = (Beat)paramObject1;
/*  50 */       Beat localBeat2 = (Beat)paramObject2;
/*     */       
/*     */ 
/*  53 */       Integer localInteger1 = new Integer(localBeat1.getPriority());
/*  54 */       Integer localInteger2 = new Integer(localBeat2.getPriority());
/*  55 */       return localInteger2.compareTo(localInteger1);
/*     */     }
/*     */     
/*     */     BeatPriorityComparator() {} }
/*     */   
/*  60 */   public DramaManager(String paramString, boolean paramBoolean1, boolean paramBoolean2) { jdMethod_this();
/*  61 */     if ((!$noassert) && ((paramBoolean1) || (paramBoolean2)) && (!paramBoolean1)) { throw new AssertionError();
/*     */     }
/*  63 */     this.beatPackage = paramString;
/*  64 */     this.isMonitored = paramBoolean1;
/*  65 */     this.manualTestMode = paramBoolean2;
/*  66 */     storyMemory = new StoryMemory();
/*  67 */     dramaManager = this;
/*  68 */     this.beatCollection = new java.util.HashSet();
/*     */     try {
/*  70 */       Class localClass1 = Class.forName(paramString + ".BeatFactories");
/*  71 */       java.lang.reflect.Method[] arrayOfMethod = localClass1.getDeclaredMethods();
/*  72 */       for (int i = 0; i < arrayOfMethod.length; i++) {
/*  73 */         this.beatCollection.add((Beat)arrayOfMethod[i].invoke(null, null));
/*     */       }
/*     */       
/*     */ 
/*  77 */       storyMemory.addWME(new TensionStoryValueWME(1.0F));
/*  78 */       storyMemory.addWME(new StoryStatusWME());
/*     */       
/*  80 */       Class localClass2 = Class.forName(paramString + ".StoryTargets");
/*  81 */       java.lang.reflect.Method localMethod = localClass2.getMethod("getTargets", null);
/*  82 */       this.targets = ((java.util.Hashtable)localMethod.invoke(null, null));
/*  83 */     } catch (Exception localException) { throw new DramaManagerError(localException);
/*     */     }
/*  85 */     if (paramBoolean1) {
/*  86 */       this.monitorGUI = new DramaManagerMonitor();
/*     */       
/*  88 */       this.monitorGUI.setStory((Beat[])this.beatCollection.toArray(new Beat[this.beatCollection.size()]), 17, this.targets);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void initializeDramaManagerState()
/*     */   {
/*  96 */     this.beatCollection = new java.util.HashSet();
/*     */     try {
/*  98 */       Class localClass1 = Class.forName(this.beatPackage + ".BeatFactories");
/*  99 */       java.lang.reflect.Method[] arrayOfMethod = localClass1.getDeclaredMethods();
/* 100 */       for (int i = 0; i < arrayOfMethod.length; i++) {
/* 101 */         this.beatCollection.add((Beat)arrayOfMethod[i].invoke(null, null));
/*     */       }
/*     */       
/*     */ 
/* 105 */       storyMemory.setStoryValue("TensionStoryValueWME", 1.0F);
/* 106 */       StoryStatusWME localStoryStatusWME = storyMemory.getStoryStatusWME();
/*     */       
/* 108 */       localStoryStatusWME.setBeatCount(1);
/* 109 */       localStoryStatusWME.setPreviousBeat(-1);
/* 110 */       localStoryStatusWME.setCurrentBeat(-1);
/*     */       
/*     */ 
/*     */ 
/* 114 */       localStoryStatusWME.setStorySegment(1);
/* 115 */       localStoryStatusWME.setDramaManagerEnabled(true);
/*     */       
/* 117 */       Class localClass2 = Class.forName(this.beatPackage + ".StoryTargets");
/* 118 */       java.lang.reflect.Method localMethod = localClass2.getMethod("getTargets", null);
/* 119 */       this.targets = ((java.util.Hashtable)localMethod.invoke(null, null));
/* 120 */     } catch (Exception localException) { throw new DramaManagerError(localException); }
/* 121 */     if (this.isMonitored)
/*     */     {
/* 123 */       this.monitorGUI.setStory((Beat[])this.beatCollection.toArray(new Beat[this.beatCollection.size()]), 17, this.targets);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/* 128 */   public static DramaManager getDramaManager() { return dramaManager; }
/* 129 */   public boolean isMonitored() { return this.isMonitored; }
/* 130 */   public DramaManagerMonitor getMonitorGUI() { return this.monitorGUI; }
/* 131 */   public boolean isManualTestMode() { return this.manualTestMode; }
/* 132 */   public String getBeatPackage() { return this.beatPackage; }
/* 133 */   public void setManuallySelectedBeat(Beat paramBeat) { this.manuallySelectedBeat = paramBeat; }
/*     */   
/*     */ 
/* 136 */   public static StoryMemory getStoryMemory() { return storyMemory; }
/* 137 */   public static void addWME(wm.WME paramWME) { storyMemory.addWME(paramWME); }
/*     */   
/*     */   public static void modifyWME(wm.WME paramWME1, wm.WME paramWME2) {
/* 140 */     try { storyMemory.modifyWME(paramWME1, paramWME2);
/* 141 */     } catch (wm.WorkingMemoryException localWorkingMemoryException) { throw new DramaManagerError(localWorkingMemoryException); } }
/*     */   
/* 143 */   public static void deleteWME(wm.WME paramWME) { storyMemory.deleteWME(paramWME); }
/* 144 */   public static void deleteAllWMEClass(String paramString) { storyMemory.deleteAllWMEClass(paramString); }
/* 145 */   public static List lookupWME(String paramString) { return storyMemory.lookupWME(paramString); }
/*     */   
/*     */ 
/*     */   public static void manageDrama(String paramString, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/* 150 */     DramaManager localDramaManager = new DramaManager(paramString, paramBoolean1, paramBoolean2);
/* 151 */     localDramaManager.startManaging();
/*     */   }
/*     */   
/* 154 */   public Beat getActiveBeat() { return this.activeBeat; }
/*     */   
/* 156 */   public String getStoryValueWMEName(String paramString) { return ((StoryTarget)this.targets.get(paramString)).getValueWMEName(); }
/*     */   
/*     */   public void succeedCurrentBeat()
/*     */   {
/* 160 */     if ((!$noassert) && (this.activeBeat == null)) { throw new AssertionError();
/*     */     }
/* 162 */     facade.util.StringUtil.println("Succeeding beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()));
/* 163 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Succeeding beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()));
/*     */     
/* 165 */     this.activeBeat.succeed();
/* 166 */     if (this.isMonitored) {
/* 167 */       this.monitorGUI.succeedBeat(this.activeBeat);
/*     */     }
/* 169 */     StoryStatusWME localStoryStatusWME = storyMemory.getStoryStatusWME();
/* 170 */     localStoryStatusWME.setPreviousBeat(this.activeBeat.getBeatID());
/* 171 */     localStoryStatusWME.setCurrentBeat(-1);
/* 172 */     localStoryStatusWME.setBeatCount(localStoryStatusWME.getBeatCount() + 1);
/* 173 */     storyMemory.addWME(new BeatCompletedWME(this.activeBeat));
/* 174 */     this.activeBeat = chooseBeat();
/* 175 */     if (this.activeBeat != null) {
/* 176 */       activateBeat();
/*     */     }
/*     */   }
/*     */   
/*     */   public void failCurrentBeat() {
/* 181 */     failCurrentBeat(0);
/*     */   }
/*     */   
/*     */   public void failCurrentBeat(int paramInt)
/*     */   {
/* 186 */     if ((!$noassert) && (this.activeBeat == null)) { throw new AssertionError();
/*     */     }
/* 188 */     facade.util.StringUtil.println("Aborting beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()) + " for reason " + facade.util.PrintUtilities.beatAbortReason_EnumToString(paramInt));
/* 189 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Aborting beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()) + " for reason " + facade.util.PrintUtilities.beatAbortReason_EnumToString(paramInt));
/*     */     
/* 191 */     this.activeBeat.abort();
/* 192 */     if (this.isMonitored) {
/* 193 */       this.monitorGUI.failBeat(this.activeBeat);
/*     */     }
/* 195 */     StoryStatusWME localStoryStatusWME = storyMemory.getStoryStatusWME();
/* 196 */     localStoryStatusWME.setPreviousBeat(this.activeBeat.getBeatID());
/* 197 */     localStoryStatusWME.setCurrentBeat(-1);
/* 198 */     storyMemory.addWME(new BeatAbortWME(this.activeBeat, paramInt));
/* 199 */     this.activeBeat = chooseBeat();
/* 200 */     if (this.activeBeat != null) {
/* 201 */       activateBeat();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void terminateStory()
/*     */   {
/* 208 */     if (this.activeBeat != null) {
/* 209 */       this.activeBeat.succeed();
/* 210 */       if (this.isMonitored)
/* 211 */         this.monitorGUI.succeedBeat(this.activeBeat);
/* 212 */       StoryStatusWME localStoryStatusWME = storyMemory.getStoryStatusWME();
/* 213 */       localStoryStatusWME.setPreviousBeat(this.activeBeat.getBeatID());
/* 214 */       localStoryStatusWME.setCurrentBeat(-1);
/* 215 */       localStoryStatusWME.setBeatCount(localStoryStatusWME.getBeatCount() + 1);
/* 216 */       storyMemory.addWME(new BeatCompletedWME(this.activeBeat));
/*     */     }
/*     */   }
/*     */   
/*     */   private Beat activeBeat;
/*     */   private float cumulativeSquareError;
/*     */   private java.util.Hashtable targets;
/*     */   private final BeatProbabilityComparator beatProbabilityComparator;
/*     */   
/* 225 */   public void startManaging() { this.activeBeat = chooseBeat();
/* 226 */     if (this.activeBeat != null) {
/* 227 */       activateBeat();
/*     */     }
/*     */   }
/*     */   
/*     */   private final void activateBeat()
/*     */   {
/* 233 */     facade.util.StringUtil.println("Activating beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()));
/* 234 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Activating beat " + facade.util.PrintUtilities.beatID_EnumToString(this.activeBeat.getBeatID()));
/*     */     
/* 236 */     StoryStatusWME localStoryStatusWME = storyMemory.getStoryStatusWME();
/*     */     
/* 238 */     localStoryStatusWME.setCurrentBeat(this.activeBeat.getBeatID());
/* 239 */     storyMemory.addWME(new BeatStartWME(this.activeBeat));
/* 240 */     this.activeBeat.select();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final void printSatisfiedBeats(List paramList)
/*     */   {
/* 247 */     java.util.Iterator localIterator = paramList.iterator();
/* 248 */     StringBuffer localStringBuffer = new StringBuffer(500);
/* 249 */     while (localIterator.hasNext()) {
/* 250 */       localStringBuffer.append(facade.util.PrintUtilities.beatID_EnumToString(((Beat)localIterator.next()).getBeatID()) + ' ');
/*     */     }
/* 252 */     facade.util.StringUtil.println("Beats with satisfied preconditions " + localStringBuffer.toString());
/* 253 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Beats with satisfied preconditions " + localStringBuffer.toString());
/*     */   }
/*     */   
/*     */   private final void printBeatsWithPriority(Beat[] paramArrayOfBeat)
/*     */   {
/* 258 */     StringBuffer localStringBuffer = new StringBuffer(1000);
/* 259 */     for (int i = 0; i < paramArrayOfBeat.length; i++) {
/* 260 */       Beat localBeat = paramArrayOfBeat[i];
/* 261 */       localStringBuffer.append(facade.util.PrintUtilities.beatID_EnumToString(localBeat.getBeatID()) + ", " + localBeat.getPriority() + ' ');
/*     */     }
/* 263 */     facade.util.StringUtil.println("Beats with priority " + localStringBuffer.toString());
/* 264 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Beats with priority " + localStringBuffer.toString());
/*     */   }
/*     */   
/*     */   private final void printBeatsWithProbability(Beat[] paramArrayOfBeat)
/*     */   {
/* 269 */     StringBuffer localStringBuffer = new StringBuffer(1000);
/* 270 */     for (int i = 0; i < paramArrayOfBeat.length; i++) {
/* 271 */       Beat localBeat = paramArrayOfBeat[i];
/* 272 */       localStringBuffer.append(facade.util.PrintUtilities.beatID_EnumToString(localBeat.getBeatID()) + ", " + localBeat.getProbability() + ' ');
/*     */     }
/* 274 */     facade.util.StringUtil.println("Beats with probability " + localStringBuffer.toString());
/* 275 */     facade.nativeinterface.NativeAnimationInterface.addEventInfoToLog("Beats with probability " + localStringBuffer.toString());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private final synchronized Beat chooseBeat()
/*     */   {
/* 282 */     if (this.beatCollection.size() == 0) {
/* 283 */       return null;
/*     */     }
/* 285 */     java.util.Iterator localIterator1 = this.beatCollection.iterator();
/* 286 */     java.util.ArrayList localArrayList1 = new java.util.ArrayList();
/* 287 */     while (localIterator1.hasNext()) {
/* 288 */       localObject1 = (Beat)localIterator1.next();
/* 289 */       ((Beat)localObject1).init();
/* 290 */       if (((Beat)localObject1).precondition())
/* 291 */         localArrayList1.add(localObject1);
/*     */     }
/* 293 */     printSatisfiedBeats(localArrayList1);
/* 294 */     if (localArrayList1.size() == 0) {
/* 295 */       return null;
/*     */     }
/*     */     
/* 298 */     Object localObject1 = localArrayList1.iterator();
/* 299 */     while (((java.util.Iterator)localObject1).hasNext()) {
/* 300 */       ((Beat)((java.util.Iterator)localObject1).next()).setPriority();
/*     */     }
/*     */     
/* 303 */     this.conflictSet = new java.util.ArrayList();
/* 304 */     Beat[] arrayOfBeat = (Beat[])localArrayList1.toArray(new Beat[localArrayList1.size()]);
/* 305 */     java.util.Arrays.sort(arrayOfBeat, this.beatPriorityComparator);
/* 306 */     printBeatsWithPriority(arrayOfBeat);
/* 307 */     this.conflictSet.add(arrayOfBeat[0]);
/* 308 */     for (int i = 1; i < arrayOfBeat.length; i++) {
/* 309 */       if (this.beatPriorityComparator.compare(arrayOfBeat[0], arrayOfBeat[i]) == 0) {
/* 310 */         this.conflictSet.add(arrayOfBeat[i]);
/*     */       } else {
/*     */         break;
/*     */       }
/*     */     }
/*     */     
/* 316 */     java.util.Iterator localIterator2 = this.conflictSet.iterator();
/* 317 */     float f = 0.0F;
/* 318 */     while (localIterator2.hasNext()) {
/* 319 */       localObject2 = (Beat)localIterator2.next();
/* 320 */       f += ((Beat)localObject2).rawProbability(this.targets, storyMemory.getStoryStatusWME().getBeatCount());
/*     */     }
/*     */     
/*     */ 
/* 324 */     localIterator2 = this.conflictSet.iterator();
/* 325 */     while (localIterator2.hasNext()) {
/* 326 */       localObject2 = (Beat)localIterator2.next();
/* 327 */       ((Beat)localObject2).setProbability(((Beat)localObject2).rawProbability(this.targets, storyMemory.getStoryStatusWME().getBeatCount()) / f);
/*     */     }
/*     */     
/* 330 */     Object localObject2 = (Beat[])this.conflictSet.toArray(new Beat[this.conflictSet.size()]);
/* 331 */     java.util.Arrays.sort((Object[])localObject2, this.beatProbabilityComparator);
/* 332 */     printBeatsWithProbability((Beat[])localObject2);
/*     */     
/*     */ 
/* 335 */     java.util.ArrayList localArrayList2 = new java.util.ArrayList(localObject2.length);
/* 336 */     for (int j = 0; j < localObject2.length; j++)
/* 337 */       localArrayList2.add(new Integer(localObject2[j].getBeatID()));
/* 338 */     storyMemory.addWME(new BeatDistributionWME(localArrayList2, new java.util.ArrayList(java.util.Arrays.asList((Object[])localObject2))));
/*     */     
/* 340 */     if (this.isMonitored)
/* 341 */       this.monitorGUI.refreshSatisfiedBeats((Beat[])localObject2, this.targets, storyMemory.getStoryStatusWME().getBeatCount());
/*     */     Beat localBeat;
/* 343 */     if (!this.manualTestMode)
/*     */     {
/* 345 */       localBeat = chooseBeatFromDistribution((Beat[])localObject2);
/*     */     }
/*     */     else
/*     */     {
/*     */       try {
/* 350 */         wait();
/* 351 */       } catch (InterruptedException localInterruptedException) { throw new DramaManagerError(localInterruptedException.getMessage()); }
/* 352 */       localBeat = this.manuallySelectedBeat;
/*     */     }
/* 354 */     this.beatCollection.remove(localBeat);
/* 355 */     if (this.isMonitored)
/* 356 */       this.monitorGUI.chooseBeat(localBeat);
/* 357 */     return localBeat;
/*     */   }
/*     */   
/*     */   private final BeatPriorityComparator beatPriorityComparator;
/*     */   private java.util.Random randomGen;
/*     */   private Beat manuallySelectedBeat;
/*     */   private List conflictSet;
/*     */   private static final boolean $noassert = Class.forName("[Ldramaman.runtime.DramaManager;").getComponentType().desiredAssertionStatus() ^ true;
/* 365 */   Beat chooseBeatFromDistribution(Beat[] paramArrayOfBeat) { if ((!$noassert) && (paramArrayOfBeat.length < 1)) throw new AssertionError();
/* 366 */     float f1 = this.randomGen.nextFloat();
/* 367 */     float f2 = 0.0F;
/* 368 */     for (int i = 0; i < paramArrayOfBeat.length; i++) {
/* 369 */       if (f1 < f2 + paramArrayOfBeat[i].getProbability()) {
/* 370 */         return paramArrayOfBeat[i];
/*     */       }
/* 372 */       f2 += paramArrayOfBeat[i].getProbability();
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 377 */     return paramArrayOfBeat[(paramArrayOfBeat.length - 1)];
/*     */   }
/*     */   
/* 380 */   public synchronized void releaseChooseThread() { notify(); }
/*     */   
/*     */ 
/*     */ 
/* 384 */   public static boolean constantTrue(int paramInt) { return true; }
/* 385 */   public static boolean constantTrue(float paramFloat) { return true; }
/* 386 */   public static boolean constantTrue(double paramDouble) { return true; }
/* 387 */   public static boolean constantTrue(short paramShort) { return true; }
/* 388 */   public static boolean constantTrue(long paramLong) { return true; }
/* 389 */   public static boolean constantTrue(char paramChar) { return true; }
/* 390 */   public static boolean constantTrue(byte paramByte) { return true; }
/* 391 */   public static boolean constantTrue(boolean paramBoolean) { return true; }
/* 392 */   public static boolean constantTrue(Object paramObject) { return true; }
/*     */   
/*     */   public static boolean truePrintln(String paramString)
/*     */   {
/* 396 */     System.out.println(paramString);
/* 397 */     return true;
/*     */   }
/*     */   
/* 400 */   public static boolean truePrintln(Object paramObject) { return truePrintln(paramObject.toString()); }
/*     */   
/*     */ 
/*     */   public int[] getConflictSetAsBeatIDs()
/*     */   {
/* 405 */     int[] arrayOfInt = new int[this.conflictSet.size()];
/* 406 */     java.util.Iterator localIterator = this.conflictSet.iterator();
/* 407 */     int i = 0;
/* 408 */     while (localIterator.hasNext()) {
/* 409 */       arrayOfInt[(i++)] = ((Beat)localIterator.next()).getBeatID();
/*     */     }
/* 411 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   public StoryTarget getStoryTarget(String paramString)
/*     */   {
/* 416 */     return (StoryTarget)this.targets.get(paramString);
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */