/*     */ package wm;
/*     */ 
/*     */ import abl.runtime.AblNamedPropertySupport.UserProperty;
/*     */ import abl.runtime.BehaviorWME;
/*     */ import abl.runtime.FailStepWME;
/*     */ import abl.runtime.GoalStepWME;
/*     */ import abl.runtime.MentalStepWME;
/*     */ import abl.runtime.PrimitiveStepWME;
/*     */ import abl.runtime.SucceedStepWME;
/*     */ import abl.runtime.WaitStepWME;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WorkingMemory$ReflectionWMEEntry
/*     */ {
/*     */   private final LinkedList wmeList;
/*     */   private final Hashtable signatureTable;
/*     */   private final Hashtable propertyTable;
/*     */   final WorkingMemory this$0;
/*     */   private static final boolean $noassert = Class.forName("[Lwm.WorkingMemory;").getComponentType().desiredAssertionStatus() ^ true;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/*  50 */     this.wmeList = new LinkedList();
/*     */     
/*     */ 
/*  53 */     this.signatureTable = new Hashtable();
/*     */     
/*     */ 
/*  56 */     this.propertyTable = new Hashtable(); }
/*     */   
/*  58 */   public WorkingMemory$ReflectionWMEEntry(WorkingMemory paramWorkingMemory) { jdMethod_this(); }
/*     */   
/*     */   public void addWME(WME paramWME)
/*     */   {
/*  62 */     String str = WorkingMemory.wmeShortName(paramWME);
/*  63 */     if (str.equals("GoalStepWME")) {
/*  64 */       addGoalStepWME((GoalStepWME)paramWME);
/*  65 */     } else if (str.equals("WaitStepWME")) {
/*  66 */       addWaitStepWME((WaitStepWME)paramWME);
/*  67 */     } else if (str.equals("MentalStepWME")) {
/*  68 */       addMentalStepWME((MentalStepWME)paramWME);
/*  69 */     } else if (str.equals("PrimitiveStepWME")) {
/*  70 */       addPrimitiveStepWME((PrimitiveStepWME)paramWME);
/*  71 */     } else if (str.equals("FailStepWME")) {
/*  72 */       addFailStepWME((FailStepWME)paramWME);
/*  73 */     } else if (str.equals("SucceedStepWME")) {
/*  74 */       addSucceedStepWME((SucceedStepWME)paramWME);
/*  75 */     } else if ((str.equals("CollectionBehaviorWME")) || (str.equals("ParallelBehaviorWME")) || (str.equals("SequentialBehaviorWME")))
/*     */     {
/*     */ 
/*  78 */       addBehaviorWME((BehaviorWME)paramWME);
/*     */     }
/*     */   }
/*     */   
/*     */   public void deleteWME(WME paramWME) {
/*  83 */     String str = WorkingMemory.wmeShortName(paramWME);
/*  84 */     if (str.equals("GoalStepWME")) {
/*  85 */       deleteGoalStepWME((GoalStepWME)paramWME);
/*  86 */     } else if (str.equals("WaitStepWME")) {
/*  87 */       deleteWaitStepWME((WaitStepWME)paramWME);
/*  88 */     } else if (str.equals("MentalStepWME")) {
/*  89 */       deleteMentalStepWME((MentalStepWME)paramWME);
/*  90 */     } else if (str.equals("PrimitiveStepWME")) {
/*  91 */       deletePrimitiveStepWME((PrimitiveStepWME)paramWME);
/*  92 */     } else if (str.equals("FailStepWME")) {
/*  93 */       deleteFailStepWME((FailStepWME)paramWME);
/*  94 */     } else if (str.equals("SucceedStepWME")) {
/*  95 */       deleteSucceedStepWME((SucceedStepWME)paramWME);
/*  96 */     } else if ((str.equals("CollectionBehaviorWME")) || (str.equals("ParallelBehaviorWME")) || (str.equals("SequentialBehaviorWME")))
/*     */     {
/*     */ 
/*  99 */       deleteBehaviorWME((BehaviorWME)paramWME);
/*     */     }
/*     */   }
/*     */   
/*     */   public void addGoalStepWME(GoalStepWME paramGoalStepWME) {
/* 104 */     this.wmeList.add(paramGoalStepWME);
/*     */     
/* 106 */     indexBySignature(paramGoalStepWME, paramGoalStepWME.getSignature());
/* 107 */     indexByUserProperties(paramGoalStepWME, paramGoalStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void addWaitStepWME(WaitStepWME paramWaitStepWME)
/*     */   {
/* 122 */     this.wmeList.add(paramWaitStepWME);
/* 123 */     indexByUserProperties(paramWaitStepWME, paramWaitStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void addMentalStepWME(MentalStepWME paramMentalStepWME)
/*     */   {
/* 128 */     this.wmeList.add(paramMentalStepWME);
/* 129 */     indexByUserProperties(paramMentalStepWME, paramMentalStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void addPrimitiveStepWME(PrimitiveStepWME paramPrimitiveStepWME)
/*     */   {
/* 134 */     this.wmeList.add(paramPrimitiveStepWME);
/* 135 */     indexByUserProperties(paramPrimitiveStepWME, paramPrimitiveStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void addFailStepWME(FailStepWME paramFailStepWME)
/*     */   {
/* 140 */     this.wmeList.add(paramFailStepWME);
/* 141 */     indexByUserProperties(paramFailStepWME, paramFailStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void addSucceedStepWME(SucceedStepWME paramSucceedStepWME)
/*     */   {
/* 146 */     this.wmeList.add(paramSucceedStepWME);
/* 147 */     indexByUserProperties(paramSucceedStepWME, paramSucceedStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void addBehaviorWME(BehaviorWME paramBehaviorWME) {
/* 151 */     this.wmeList.add(paramBehaviorWME);
/* 152 */     indexBySignature(paramBehaviorWME, paramBehaviorWME.getSignature());
/* 153 */     indexByUserProperties(paramBehaviorWME, paramBehaviorWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteGoalStepWME(GoalStepWME paramGoalStepWME)
/*     */   {
/* 158 */     this.wmeList.remove(paramGoalStepWME);
/* 159 */     deleteFromSignatureTable(paramGoalStepWME, paramGoalStepWME.getSignature());
/* 160 */     deleteFromUserPropertiesTable(paramGoalStepWME, paramGoalStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteWaitStepWME(WaitStepWME paramWaitStepWME)
/*     */   {
/* 165 */     this.wmeList.remove(paramWaitStepWME);
/* 166 */     deleteFromUserPropertiesTable(paramWaitStepWME, paramWaitStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteMentalStepWME(MentalStepWME paramMentalStepWME)
/*     */   {
/* 171 */     this.wmeList.remove(paramMentalStepWME);
/* 172 */     deleteFromUserPropertiesTable(paramMentalStepWME, paramMentalStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deletePrimitiveStepWME(PrimitiveStepWME paramPrimitiveStepWME)
/*     */   {
/* 177 */     this.wmeList.remove(paramPrimitiveStepWME);
/* 178 */     deleteFromUserPropertiesTable(paramPrimitiveStepWME, paramPrimitiveStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteFailStepWME(FailStepWME paramFailStepWME)
/*     */   {
/* 183 */     this.wmeList.remove(paramFailStepWME);
/* 184 */     deleteFromUserPropertiesTable(paramFailStepWME, paramFailStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteSucceedStepWME(SucceedStepWME paramSucceedStepWME)
/*     */   {
/* 189 */     this.wmeList.remove(paramSucceedStepWME);
/* 190 */     deleteFromUserPropertiesTable(paramSucceedStepWME, paramSucceedStepWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   public void deleteBehaviorWME(BehaviorWME paramBehaviorWME)
/*     */   {
/* 195 */     this.wmeList.remove(paramBehaviorWME);
/* 196 */     deleteFromSignatureTable(paramBehaviorWME, paramBehaviorWME.getSignature());
/* 197 */     deleteFromUserPropertiesTable(paramBehaviorWME, paramBehaviorWME.getAllDefinedProperties());
/*     */   }
/*     */   
/*     */   private final void indexBySignature(WME paramWME, String paramString)
/*     */   {
/* 202 */     Object localObject = (List)this.signatureTable.get(paramString);
/* 203 */     if (localObject == null) {
/* 204 */       localObject = new LinkedList();
/* 205 */       ((List)localObject).add(paramWME);
/* 206 */       this.signatureTable.put(paramString, localObject);
/*     */     }
/*     */     else {
/* 209 */       ((List)localObject).add(paramWME);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void indexByUserProperties(WME paramWME, List paramList) {
/* 214 */     Iterator localIterator = paramList.iterator();
/* 215 */     while (localIterator.hasNext()) {
/* 216 */       AblNamedPropertySupport.UserProperty localUserProperty = (AblNamedPropertySupport.UserProperty)localIterator.next();
/* 217 */       String str = localUserProperty.getName();
/* 218 */       Object localObject = (List)this.propertyTable.get(str);
/* 219 */       if (localObject == null) {
/* 220 */         localObject = new LinkedList();
/* 221 */         ((List)localObject).add(paramWME);
/* 222 */         this.propertyTable.put(str, localObject);
/*     */       }
/*     */       else {
/* 225 */         ((List)localObject).add(paramWME);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final void deleteFromSignatureTable(WME paramWME, String paramString)
/*     */   {
/* 241 */     List localList = (List)this.signatureTable.get(paramString);
/*     */     
/* 243 */     if ((!$noassert) && ((localList == null) || (localList.size() <= 0) || (!localList.contains(paramWME)))) { throw new AssertionError();
/*     */     }
/* 245 */     localList.remove(paramWME);
/* 246 */     if (localList.size() == 0) {
/* 247 */       this.signatureTable.remove(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void deleteFromUserPropertiesTable(WME paramWME, List paramList) {
/* 252 */     Iterator localIterator = paramList.iterator();
/*     */     
/* 254 */     while (localIterator.hasNext()) {
/* 255 */       AblNamedPropertySupport.UserProperty localUserProperty = (AblNamedPropertySupport.UserProperty)localIterator.next();
/* 256 */       String str = localUserProperty.getName();
/* 257 */       List localList = (List)this.propertyTable.get(str);
/*     */       
/* 259 */       if ((!$noassert) && ((localList == null) || (localList.size() <= 0) || (!localList.contains(paramWME)))) { throw new AssertionError();
/*     */       }
/* 261 */       localList.remove(paramWME);
/*     */     }
/*     */   }
/*     */   
/*     */   public LinkedList lookupWMEBySignature(String paramString)
/*     */   {
/* 267 */     LinkedList localLinkedList = (LinkedList)this.signatureTable.get(paramString);
/* 268 */     if (localLinkedList == null) {
/* 269 */       localLinkedList = new LinkedList();
/*     */     }
/* 271 */     return localLinkedList;
/*     */   }
/*     */   
/*     */   public LinkedList lookupWMEByProperty(String paramString)
/*     */   {
/* 276 */     LinkedList localLinkedList = (LinkedList)this.propertyTable.get(paramString);
/* 277 */     if (localLinkedList == null) {
/* 278 */       localLinkedList = new LinkedList();
/*     */     }
/* 280 */     return localLinkedList;
/*     */   }
/*     */   
/* 283 */   public LinkedList getWMEList() { return this.wmeList; }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wm\WorkingMemory$ReflectionWMEEntry.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */