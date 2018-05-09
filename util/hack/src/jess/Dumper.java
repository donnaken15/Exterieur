/*    */ package jess;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Serializable;
/*    */ import java.util.zip.GZIPInputStream;
/*    */ import java.util.zip.GZIPOutputStream;
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
/*    */ 
/*    */ class Dumper
/*    */   implements Userfunction, Serializable
/*    */ {
/*    */   public static final int DUMP = 0;
/*    */   public static final int RESTORE = 1;
/*    */   private int m_cmd;
/*    */   
/*    */   public Dumper(int paramInt)
/*    */   {
/* 31 */     this.m_cmd = paramInt;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 35 */     return this.m_cmd == 0 ? "bsave" : "bload";
/*    */   }
/*    */   
/*    */   public Value call(ValueVector paramValueVector, Context paramContext) throws JessException {
/* 39 */     String str = paramValueVector.get(1).stringValue(paramContext);
/*    */     try {
/* 41 */       switch (this.m_cmd)
/*    */       {
/*    */       case 0: 
/* 44 */         GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(new FileOutputStream(str), 10000);
/*    */         
/*    */ 
/* 47 */         paramContext.getEngine().bsave(localGZIPOutputStream);
/* 48 */         localGZIPOutputStream.flush();
/* 49 */         localGZIPOutputStream.close();
/* 50 */         return Funcall.TRUE;
/*    */       }
/*    */       
/*    */       
/* 54 */       GZIPInputStream localGZIPInputStream = new GZIPInputStream(new FileInputStream(str), 10000);
/*    */       
/*    */ 
/* 57 */       paramContext.getEngine().bload(localGZIPInputStream);
/* 58 */       localGZIPInputStream.close();
/* 59 */       return Funcall.TRUE;
/*    */     }
/*    */     catch (IOException localIOException) {
/* 62 */       throw new JessException(this.m_cmd == 0 ? "bsave" : "bload", "IO Exception", localIOException);
/*    */     }
/*    */     catch (ClassNotFoundException localClassNotFoundException) {
/* 65 */       throw new JessException("bload", "Class not found", localClassNotFoundException);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\jess\Dumper.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */