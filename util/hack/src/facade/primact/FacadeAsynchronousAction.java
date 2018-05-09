/*    */ package facade.primact;
/*    */ 
/*    */ import abl.runtime.PrimitiveAction;
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ 
/*    */ public abstract class FacadeAsynchronousAction
/*    */   extends PrimitiveAction
/*    */ {
/* 10 */   public FacadeAsynchronousAction() { jdMethod_this(); }
/*    */   
/* 12 */   private static final boolean $noassert = Class.forName("[Lfacade.primact.FacadeAsynchronousAction;").getComponentType().desiredAssertionStatus() ^ true; private Long thisActID; private static Hashtable actionRegistry = new Hashtable();
/* 13 */   private final void jdMethod_this() { this.thisActID = null; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void callCompletionCallback(long paramLong, boolean paramBoolean)
/*    */   {
/* 20 */     Long localLong = new Long(paramLong);
/* 21 */     FacadeAsynchronousAction localFacadeAsynchronousAction = (FacadeAsynchronousAction)actionRegistry.get(localLong);
/*    */     try {
/* 23 */       localFacadeAsynchronousAction.completionCallback(paramBoolean);
/* 24 */     } catch (NullPointerException localNullPointerException) { throw new RuntimeException("Non-existent act ID " + paramLong); }
/* 25 */     actionRegistry.remove(localLong);
/*    */   }
/*    */   
/*    */   protected void unregisterAction() {
/* 29 */     if ((!$noassert) && (this.thisActID == null)) throw new AssertionError();
/* 30 */     actionRegistry.remove(this.thisActID);
/*    */   }
/*    */   
/*    */   public void registerActID(long paramLong) {
/* 34 */     actionRegistry.put(new Long(paramLong), this);
/* 35 */     this.thisActID = new Long(paramLong);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\primact\FacadeAsynchronousAction.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */