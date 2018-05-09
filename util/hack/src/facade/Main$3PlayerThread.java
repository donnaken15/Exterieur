package facade;

import facade.characters.player.java.Player;

class Main$3PlayerThread
  extends Thread
{
  private Player player;
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: new 11	facade/characters/player/java/Player
    //   4: dup
    //   5: invokespecial 15	facade/characters/player/java/Player:<init>	()V
    //   8: putfield 17	facade/Main$3PlayerThread:player	Lfacade/characters/player/java/Player;
    //   11: goto +6 -> 17
    //   14: aload_1
    //   15: monitorexit
    //   16: athrow
    //   17: aload_0
    //   18: dup
    //   19: astore_1
    //   20: monitorenter
    //   21: aload_0
    //   22: invokevirtual 20	java/lang/Object:notify	()V
    //   25: aload_1
    //   26: monitorexit
    //   27: aload_0
    //   28: getfield 17	facade/Main$3PlayerThread:player	Lfacade/characters/player/java/Player;
    //   31: invokevirtual 25	facade/characters/player/java/Player:startBehaving	()V
    //   34: goto +9 -> 43
    //   37: astore_1
    //   38: aload_1
    //   39: iconst_1
    //   40: invokestatic 31	facade/Main:access$0	(Ljava/lang/Throwable;Z)V
    //   43: return
    // Line number table:
    //   Java source line #92	-> byte code offset #0
    //   Java source line #93	-> byte code offset #0
    //   Java source line #94	-> byte code offset #11
    //   Java source line #94	-> byte code offset #21
    //   Java source line #95	-> byte code offset #27
    //   Java source line #97	-> byte code offset #38
    //   Java source line #99	-> byte code offset #43
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	3PlayerThread
    //   14	12	1	Ljava/lang/Object;	Object
    //   37	2	1	localError	Error
    // Exception table:
    //   from	to	target	type
    //   14	16	14	finally
    //   21	27	14	finally
    //   0	34	37	java/lang/Error
  }
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\Main$3PlayerThread.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */