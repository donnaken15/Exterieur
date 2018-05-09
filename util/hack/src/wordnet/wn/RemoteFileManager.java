/*    */ package wordnet.wn;
/*    */ 
/*    */ import java.rmi.AccessException;
/*    */ import java.rmi.AlreadyBoundException;
/*    */ import java.rmi.NotBoundException;
/*    */ import java.rmi.Remote;
/*    */ import java.rmi.RemoteException;
/*    */ import java.rmi.UnknownHostException;
/*    */ import java.rmi.registry.LocateRegistry;
/*    */ import java.rmi.registry.Registry;
/*    */ import java.rmi.server.UnicastRemoteObject;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RemoteFileManager
/*    */   extends FileManager
/*    */   implements Remote
/*    */ {
/* 35 */   public static final String BINDING_NAME = "edu.brandeis.cs.steele.wn" + FileManager.VERSION;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public RemoteFileManager()
/*    */     throws RemoteException
/*    */   {
/* 43 */     UnicastRemoteObject.exportObject(this);
/*    */   }
/*    */   
/*    */ 
/*    */   public RemoteFileManager(String paramString)
/*    */     throws RemoteException
/*    */   {
/* 50 */     super(paramString);
/* 51 */     UnicastRemoteObject.exportObject(this);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void bind()
/*    */     throws RemoteException, AlreadyBoundException
/*    */   {
/* 60 */     Registry localRegistry = LocateRegistry.getRegistry();
/* 61 */     localRegistry.bind(BINDING_NAME, this);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static FileManagerInterface lookup(String paramString)
/*    */     throws AccessException, NotBoundException, RemoteException, UnknownHostException
/*    */   {
/* 73 */     Registry localRegistry = LocateRegistry.getRegistry(paramString);
/* 74 */     return (FileManagerInterface)localRegistry.lookup(BINDING_NAME);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\wordnet\wn\RemoteFileManager.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */