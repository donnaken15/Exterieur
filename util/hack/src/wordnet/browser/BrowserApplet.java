/*    */ package wordnet.browser;
/*    */ 
/*    */ import java.applet.Applet;
/*    */ import java.io.PrintStream;
/*    */ import java.net.URL;
/*    */ import wordnet.wn.FileBackedDictionary;
/*    */ import wordnet.wn.RemoteFileManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BrowserApplet
/*    */   extends Applet
/*    */ {
/*    */   public void init()
/*    */   {
/* 18 */     URL localURL = getCodeBase();
/* 19 */     System.out.println("url = " + localURL);
/* 20 */     String str = localURL.getHost();
/* 21 */     if (localURL.getPort() != -1) {
/* 22 */       str = str + ':' + localURL.getPort();
/*    */     }
/* 24 */     System.out.println("hostname = " + str);
/*    */     FileBackedDictionary localFileBackedDictionary;
/*    */     try {
/* 27 */       localFileBackedDictionary = new FileBackedDictionary(RemoteFileManager.lookup(str));
/*    */     } catch (Exception localException) {
/* 29 */       throw new RuntimeException(localException.toString());
/*    */     }
/* 31 */     System.out.println("dictionary = " + localFileBackedDictionary);
/* 32 */     add(new BrowserPanel(localFileBackedDictionary));
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\browser\BrowserApplet.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */