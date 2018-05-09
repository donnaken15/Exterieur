package facade.util;

public abstract interface BeatArguments
{
  public static final int eBeatArgument_txnIn_NONE = -1;
  public static final int eBeatArgument_txnIn_Default = 0;
  public static final int eBeatArgument_txnIn_ReferTo = 1;
  public static final int eBeatArgument_txnIn_Redirect = 2;
  public static final int eBeatArgument_txnIn_InTripletAffinitySwitch = 3;
  public static final int eBeatArgument_txnOut_T2ToT3Transition = 4;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\facade\util\BeatArguments.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */