package com.techlabs.model;
import java.util.Map;

public class LRUEvictionStrategy implements EvictionStrategy {
    @Override
    public void evict(Map<String, Integer> memoryMap, Map<String, Integer> readCounts) {
        if (!memoryMap.isEmpty()) {
            // Since LinkedHashMap maintains insertion order, we can simply remove the first element
            String leastRecentlyUsed = memoryMap.keySet().iterator().next();
            memoryMap.remove(leastRecentlyUsed);
            readCounts.remove(leastRecentlyUsed);
        }
    }
}
