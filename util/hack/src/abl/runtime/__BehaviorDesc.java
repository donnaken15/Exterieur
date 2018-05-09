/*    */ package abl.runtime;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class __BehaviorDesc
/*    */ {
/*    */   final int behaviorID;
/*    */   final Method factory;
/*    */   final Method precondition;
/*    */   final Method preconditionSensorFactory;
/*    */   final String signature;
/*    */   String uniqueName;
/*    */   final String[] teamMembers;
/*    */   final short specificity;
/*    */   
/*    */   public __BehaviorDesc(int paramInt, Method paramMethod1, Method paramMethod2, Method paramMethod3, String paramString, String[] paramArrayOfString, short paramShort)
/*    */   {
/* 22 */     this.behaviorID = paramInt;
/* 23 */     this.factory = paramMethod1;
/* 24 */     this.precondition = paramMethod2;
/* 25 */     this.preconditionSensorFactory = paramMethod3;
/* 26 */     this.signature = paramString;
/* 27 */     this.uniqueName = null;
/* 28 */     this.teamMembers = paramArrayOfString;
/* 29 */     this.specificity = paramShort;
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\__BehaviorDesc.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */