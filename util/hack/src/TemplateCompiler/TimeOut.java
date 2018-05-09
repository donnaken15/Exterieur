/*    */ package TemplateCompiler;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.Vector;
/*    */ import jess.Rete;
/*    */ 
/*    */ public class TimeOut
/*    */ {
/*    */   private Vector BeatTimeouts;
/*    */   private Vector SecondTimeouts;
/*    */   private Vector UttTimeouts;
/*    */   private Rete r;
/*    */   
/*    */   private final void jdMethod_this()
/*    */   {
/* 16 */     this.BeatTimeouts = new Vector();
/* 17 */     this.SecondTimeouts = new Vector();
/* 18 */     this.UttTimeouts = new Vector();
/*    */   }
/*    */   
/* 21 */   public TimeOut(Rete paramRete) { jdMethod_this();
/* 22 */     this.r = paramRete;
/* 23 */     java.util.Timer localTimer = new java.util.Timer();
/* 24 */     TimeSweepThread localTimeSweepThread = new TimeSweepThread();
/* 25 */     localTimer.schedule(localTimeSweepThread, 1000L, 1000L);
/*    */   }
/*    */   
/*    */   public void addnew(String paramString, int paramInt1, int paramInt2)
/*    */   {
/* 30 */     TimeOutObject localTimeOutObject = new TimeOutObject();
/* 31 */     localTimeOutObject.name = paramString;
/* 32 */     localTimeOutObject.value = paramInt1;
/*    */     
/* 34 */     switch (paramInt2) {
/*    */     case 10: 
/* 36 */       this.UttTimeouts.add(localTimeOutObject);
/*    */     case 7: 
/* 38 */       this.SecondTimeouts.add(localTimeOutObject);
/*    */     case 4: 
/* 40 */       this.BeatTimeouts.add(localTimeOutObject);
/*    */     }
/*    */   }
/*    */   
/*    */   public void UttSweep(Rete paramRete) throws jess.JessException {
/* 45 */     Enumeration localEnumeration = this.UttTimeouts.elements();
/* 46 */     while (localEnumeration.hasMoreElements()) {
/* 47 */       TimeOutObject localTimeOutObject = (TimeOutObject)localEnumeration.nextElement();
/* 48 */       localTimeOutObject.value -= 1;
/*    */       
/* 50 */       if (localTimeOutObject.value == 0) {
/* 51 */         paramRete.executeCommand("(assert (RETRACT" + localTimeOutObject.name + "))");
/* 52 */         paramRete.executeCommand("(undefrule " + localTimeOutObject.name + ')');
/* 53 */         paramRete.run();
/* 54 */         paramRete.reset();
/* 55 */         this.UttTimeouts.remove(localTimeOutObject);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void BeatSweep(Rete paramRete) throws jess.JessException {
/* 61 */     Enumeration localEnumeration = this.BeatTimeouts.elements();
/* 62 */     while (localEnumeration.hasMoreElements()) {
/* 63 */       TimeOutObject localTimeOutObject = (TimeOutObject)localEnumeration.nextElement();
/* 64 */       localTimeOutObject.value -= 1;
/*    */       
/* 66 */       if (localTimeOutObject.value == 0) {
/* 67 */         paramRete.executeCommand("(assert (RETRACT" + localTimeOutObject.name + "))");
/* 68 */         paramRete.executeCommand("(undefrule " + localTimeOutObject.name + ')');
/* 69 */         paramRete.run();
/* 70 */         paramRete.reset();
/* 71 */         this.BeatTimeouts.remove(localTimeOutObject);
/*    */       } } }
/*    */   
/*    */   protected class TimeOutObject { public String name;
/*    */     public int value;
/*    */     
/*    */     protected TimeOutObject() {} }
/*    */   
/* 79 */   public class TimeSweepThread extends java.util.TimerTask { public void run() { Enumeration localEnumeration = TimeOut.this.SecondTimeouts.elements();
/* 80 */       while (localEnumeration.hasMoreElements()) {
/* 81 */         TimeOut.TimeOutObject localTimeOutObject = (TimeOut.TimeOutObject)localEnumeration.nextElement();
/* 82 */         localTimeOutObject.value -= 1;
/*    */         
/* 84 */         if (localTimeOutObject.value == 0) {
/*    */           try {
/* 86 */             TimeOut.this.r.executeCommand("(assert (RETRACT" + localTimeOutObject.name + "))");
/* 87 */             TimeOut.this.r.executeCommand("(undefrule " + localTimeOutObject.name + ')');
/* 88 */             TimeOut.this.r.run();
/* 89 */             TimeOut.this.r.reset();
/* 90 */             TimeOut.this.SecondTimeouts.remove(localTimeOutObject);
/*    */           }
/*    */           catch (jess.JessException localJessException) {
/* 93 */             JessExceptionHelper.processJessException(localJessException);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */     public TimeSweepThread() {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\TemplateCompiler\TimeOut.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */