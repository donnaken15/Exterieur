package debug;

import abl.runtime.BehavingEntity;

public class Trace
{
  static final boolean traceAll = false;
  static final boolean traceFreeze = false;
  static final boolean traceTrip = false;
  static final boolean traceGrace = true;
  static final int eTraceType_traceFreeze = 0;
  
  public static void ablTrace(String paramString)
  {
    String str = BehavingEntity.getBehavingEntity().getBehavingEntityShortName();
    str.equals("Trip");
    if (str.equals("Grace")) {
      0;
    }
    1;
  }
}
