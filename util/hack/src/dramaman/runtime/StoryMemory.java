/*    */ package dramaman.runtime;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class StoryMemory extends wm.WorkingMemory
/*    */ {
/*    */   public static StoryMemory memory;
/*    */   
/*    */   public StoryMemory()
/*    */   {
/* 12 */     super("StoryMemory");
/* 13 */     memory = this;
/*    */   }
/*    */   
/*    */   public static StoryMemory getStoryMemory()
/*    */   {
/* 18 */     return memory;
/*    */   }
/*    */   
/*    */   public StoryStatusWME getStoryStatusWME()
/*    */   {
/* 23 */     LinkedList localLinkedList = lookupWME("StoryStatusWME");
/* 24 */     if (localLinkedList.size() != 1)
/* 25 */       throw new DramaManagerError("Number of StoryStatusWME's " + localLinkedList.size() + " != 1");
/* 26 */     return (StoryStatusWME)localLinkedList.get(0);
/*    */   }
/*    */   
/*    */   public float getStoryValue(String paramString)
/*    */   {
/* 31 */     LinkedList localLinkedList = lookupWME(paramString);
/* 32 */     if (localLinkedList.size() == 0)
/* 33 */       throw new DramaManagerError("No WME found in story memory for story value " + paramString);
/* 34 */     if (localLinkedList.size() > 1) {
/* 35 */       throw new DramaManagerError("More than one WME found in story memory for story value " + paramString);
/*    */     }
/* 37 */     return ((StoryValueWME)localLinkedList.get(0)).getValue();
/*    */   }
/*    */   
/*    */ 
/*    */   public void setStoryValue(String paramString, float paramFloat)
/*    */   {
/* 43 */     LinkedList localLinkedList = lookupWME(paramString);
/* 44 */     if (localLinkedList.size() == 0)
/* 45 */       throw new DramaManagerError("No WME found in story memory for story value " + paramString);
/* 46 */     if (localLinkedList.size() > 1) {
/* 47 */       throw new DramaManagerError("More than one WME found in story memory for story value " + paramString);
/*    */     }
/* 49 */     ((StoryValueWME)localLinkedList.get(0)).setValue(paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Extérieur\util\classes\!\dramaman\runtime\StoryMemory.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       0.7.1
 */