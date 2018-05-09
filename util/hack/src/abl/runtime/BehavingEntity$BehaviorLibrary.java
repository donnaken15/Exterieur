/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashSet;
/*    */ import java.util.Hashtable;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BehavingEntity$BehaviorLibrary
/*    */ {
/*    */   Hashtable behaviorNames;
/*    */   Hashtable behaviors;
/*    */   final BehavingEntity this$0;
/*    */   
/*    */   public BehavingEntity$BehaviorLibrary(BehavingEntity paramBehavingEntity, int paramInt)
/*    */   {
/* 27 */     this.behaviors = new Hashtable(paramInt);
/*    */   }
/*    */   
/*    */   public synchronized void registerBehavior(__BehaviorDesc param__BehaviorDesc) {
/* 31 */     Object localObject = (List)this.behaviors.get(param__BehaviorDesc.signature);
/*    */     
/* 33 */     if (localObject == null)
/*    */     {
/*    */ 
/*    */ 
/* 37 */       localObject = new Vector();
/* 38 */       ((List)localObject).add(param__BehaviorDesc);
/* 39 */       if (this.this$0.debugLevel == 2) {
/* 40 */         param__BehaviorDesc.uniqueName = (param__BehaviorDesc.signature.substring(0, param__BehaviorDesc.signature.indexOf('(')) + "_1");
/*    */       }
/*    */       
/* 43 */       this.behaviors.put(param__BehaviorDesc.signature, localObject);
/*    */     }
/*    */     else {
/* 46 */       ((List)localObject).add(param__BehaviorDesc);
/* 47 */       if (this.this$0.debugLevel == 2) {
/* 48 */         param__BehaviorDesc.uniqueName = (param__BehaviorDesc.signature.substring(0, param__BehaviorDesc.signature.indexOf('(')) + '_' + ((List)localObject).size());
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public synchronized List lookupBehavior(String paramString) {
/* 54 */     List localList = (List)this.behaviors.get(paramString);
/* 55 */     if (localList == null)
/*    */     {
/* 57 */       return new Vector(0);
/*    */     }
/* 59 */     return new ArrayList(localList);
/*    */   }
/*    */   
/*    */   private final synchronized Set getRegisteredBehaviors()
/*    */   {
/* 64 */     return new HashSet(this.behaviors.keySet());
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\BehavingEntity$BehaviorLibrary.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */