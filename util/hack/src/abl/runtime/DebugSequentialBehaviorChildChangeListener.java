/*    */ package abl.runtime;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ 
/*    */ 
/*    */ public class DebugSequentialBehaviorChildChangeListener
/*    */   implements java.beans.PropertyChangeListener
/*    */ {
/*    */   SequentialBehavior b;
/*    */   private static final boolean $noassert = Class.forName("[Labl.runtime.DebugSequentialBehaviorChildChangeListener;").getComponentType().desiredAssertionStatus() ^ true;
/*    */   
/* 12 */   public DebugSequentialBehaviorChildChangeListener(SequentialBehavior paramSequentialBehavior) { this.b = paramSequentialBehavior; }
/*    */   
/*    */   public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
/* 15 */     if ((!$noassert) && (((paramPropertyChangeEvent.getOldValue() != null) && (paramPropertyChangeEvent.getNewValue() != null)) || ((paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() == null)))) { throw new AssertionError("Behavior " + this.b);
/*    */     }
/* 17 */     if (paramPropertyChangeEvent.getOldValue() == null)
/*    */     {
/*    */ 
/* 20 */       System.out.println("Adding child " + paramPropertyChangeEvent.getNewValue() + " to sequential behavior " + this.b.getSignature());
/* 21 */       System.out.println("ignoreFailure = " + ((Step)paramPropertyChangeEvent.getNewValue()).getIgnoreFailure());
/* 22 */       Thread.currentThread();Thread.dumpStack();
/*    */ 
/*    */     }
/*    */     else
/*    */     {
/* 27 */       System.out.println("Removing child " + paramPropertyChangeEvent.getOldValue() + " from sequential behavior " + this.b.getSignature());
/*    */       
/* 29 */       Thread.currentThread();Thread.dumpStack();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\abl\runtime\DebugSequentialBehaviorChildChangeListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */