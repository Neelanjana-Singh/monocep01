package com.techlabs.model;

import java.util.Map;

public class FIFOEvictionStrategy implements EvictionStrategy {
    @Override
    public void evict(Map<String, Integer> memoryMap, Map<String, Integer> readCounts) {
        if (!memoryMap.isEmpty()) {
            String firstKey = memoryMap.keySet().iterator().next();
            memoryMap.remove(firstKey);
            readCounts.remove(firstKey);
        }
    }
}
