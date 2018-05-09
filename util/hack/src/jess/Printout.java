/*     */ package jess;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.io.Writer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Printout
/*     */   implements Userfunction, Serializable
/*     */ {
/*     */   static final int PRINTOUT = 0;
/*     */   static final int SETMULTI = 1;
/*     */   static final int GETMULTI = 2;
/*     */   
/*     */   private final void jdMethod_this()
/*     */   {
/* 429 */     this.m_multithreadedIO = false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 434 */   private static final String[] s_names = { "printout", "set-multithreaded-io", "get-multithreaded-io" };
/*     */   private boolean m_multithreadedIO;
/*     */   
/* 437 */   Printout(int paramInt) { jdMethod_this();
/* 438 */     this.m_name = paramInt;
/*     */   }
/*     */   
/* 441 */   Printout(int paramInt, Printout paramPrintout) { jdMethod_this();
/* 442 */     this.m_name = paramInt;
/* 443 */     this.m_printout = paramPrintout; }
/*     */   
/*     */   private int m_name;
/*     */   private Printout m_printout;
/* 447 */   public String getName() { return s_names[this.m_name]; }
/*     */   
/*     */ 
/*     */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 451 */     switch (this.m_name) {
/*     */     case 1: 
/* 453 */       boolean bool = this.m_printout.m_multithreadedIO;
/* 454 */       this.m_printout.m_multithreadedIO = (paramValueVector.get(1).equals(Funcall.FALSE) ^ true);
/*     */       
/* 456 */       return bool ? Funcall.TRUE : Funcall.FALSE;
/*     */     
/*     */     case 2: 
/* 459 */       return this.m_printout.m_multithreadedIO ? Funcall.TRUE : Funcall.FALSE;
/*     */     }
/*     */     
/*     */     
/*     */ 
/*     */ 
/* 465 */     String str = paramValueVector.get(1).stringValue(paramContext);
/* 466 */     Writer localWriter = paramContext.getEngine().getOutputRouter(str);
/* 467 */     if (localWriter == null) {
/* 468 */       throw new JessException("printout", "printout: bad router", str);
/*     */     }
/*     */     
/*     */ 
/* 472 */     StringBuffer localStringBuffer = new StringBuffer(100);
/* 473 */     for (int i = 2; i < paramValueVector.size(); i++) {
/* 474 */       Value localValue = paramValueVector.get(i).resolveValue(paramContext);
/* 475 */       switch (localValue.type()) {
/*     */       case 1: 
/* 477 */         if (localValue.equals("crlf"))
/* 478 */           localStringBuffer.append("\n");
/* 479 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 2: 
/* 484 */         localStringBuffer.append(localValue.stringValue(paramContext));
/* 485 */         break;
/*     */       case 4: 
/* 487 */         localStringBuffer.append(localValue.intValue(paramContext));
/* 488 */         break;
/*     */       case 32: 
/* 490 */         localStringBuffer.append(localValue.numericValue(paramContext));
/* 491 */         break;
/*     */       case 16: 
/* 493 */         localStringBuffer.append(localValue);
/* 494 */         break;
/*     */       case 512: 
/* 496 */         localStringBuffer.append(localValue.listValue(paramContext).toStringWithParens());
/*     */         
/* 498 */         break;
/*     */       case 2048: 
/* 500 */         localStringBuffer.append(localValue.toString());
/* 501 */         break;
/*     */       }
/* 503 */       localStringBuffer.append(localValue.toString());
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 508 */       localWriter.write(localStringBuffer.toString());
/* 509 */       if (this.m_multithreadedIO) {
/* 510 */         PrintThread.getPrintThread().assignWork(localWriter);
/*     */       } else
/* 512 */         localWriter.flush();
/*     */     } catch (IOException localIOException) {
/* 514 */       throw new JessException("printout", "I/O Exception", localIOException);
/*     */     }
/*     */     
/* 517 */     return Funcall.NIL;
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Printout.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */