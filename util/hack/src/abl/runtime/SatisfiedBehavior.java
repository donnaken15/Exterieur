/*    */ package abl.runtime;
/*    */ 
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ 
/*    */ class SatisfiedBehavior
/*    */ {
/*    */   __BehaviorDesc behDesc;
/*    */   Hashtable preconditionBoundVariables;
/*    */   
/*    */   public SatisfiedBehavior(__BehaviorDesc param__BehaviorDesc, Hashtable paramHashtable)
/*    */   {
/* 13 */     this.behDesc = param__BehaviorDesc;
/* 14 */     this.preconditionBoundVariables = paramHashtable;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\SatisfiedBehavior.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */