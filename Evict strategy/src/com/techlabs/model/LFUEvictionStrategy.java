package com.techlabs.model;

import java.util.Map;

public class LFUEvictionStrategy implements EvictionStrategy {
    @Override
    public void evict(Map<String, Integer> memoryMap, Map<String, Integer> readCounts) {
        String leastFrequentlyUsed = null;
        int minReadCount = Integer.MAX_VALUE;
        
        for (Map.Entry<String, Integer> entry : readCounts.entrySet()) {
            if (entry.getValue() < minReadCount) {
                minReadCount = entry.getValue();
                leastFrequentlyUsed = entry.getKey();
            }
        }
        
        if (leastFrequentlyUsed != null) {
            memoryMap.remove(leastFrequentlyUsed);
            readCounts.remove(leastFrequentlyUsed);
        }
    }
}

