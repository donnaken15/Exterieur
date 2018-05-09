package dramaman.runtime;

public abstract interface DramaManagerConstants
{
  public static final int eAffinity_NOAFFINITY = Integer.MAX_VALUE;
  public static final int eAffinity_graceStrong = -2;
  public static final int eAffinity_grace = -1;
  public static final int eAffinity_neutral = 0;
  public static final int eAffinity_trip = 1;
  public static final int eAffinity_tripStrong = 2;
  public static final int eBeatPriority_max = Integer.MAX_VALUE;
  public static final int eBeatPriority_discourseAct = 10;
  public static final int eBeatPriority_discourseActMinus1 = 9;
  public static final int eBeatPriority_default = 0;
  public static final float eBeatWeight_partIEarly1 = 2.5F;
  public static final float eBeatWeight_partIEarly2 = 2.0F;
  public static final float eBeatWeight_partIEarly3 = 1.5F;
  public static final float eBeatWeight_previousDiscourseReferTo = 3.0F;
  public static final float eBeatWeight_previousDiscourseReferToSlightlySmaller = 2.999F;
  public static final float eBeatWeight_previousDiscourseRedirect = 3.0F;
  public static final float eBeatWeight_staticWeight = 0.0F;
  public static final int eBeatEvent_start = 0;
  public static final int eBeatEvent_complete = 1;
  public static final int eBeatEvent_abort = 2;
  public static final int eStorySegment_1 = 1;
  public static final int eStorySegment_2 = 2;
  public static final int eStorySegment_3 = 3;
  public static final int eBeatAbortReason_unspecified = 0;
  public static final int eBeatAbortReason_affinityChangeTowardsGPA = 1;
  public static final int eBeatAbortReason_affinityChangeTowardsTPA = 2;
  public static final int eBeatAbortReason_pushedTooFarT1 = 3;
  public static final int eBeatAbortReason_leftOneOnOneAffChr = 4;
  public static final int eBeatAbortReason_ltbRecoverable = 5;
  public static final int MAX_STORY_TOPIC_BEATS_BY_T1 = 2;
  public static final int MAX_STORY_TOPIC_BEATS_BY_T2 = 2;
  public static final int NUMBER_OF_GPA_AFFINITY_BEATS_FOR_ROM_PROP = 2;
}


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\DramaManagerConstants.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */