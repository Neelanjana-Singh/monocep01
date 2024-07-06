package com.techlabs.test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.techlabs.model.EvictionStrategy;
import com.techlabs.model.FIFOEvictionStrategy;
import com.techlabs.model.LFUEvictionStrategy;
import com.techlabs.model.LRUEvictionStrategy;

public class MemoryMap {
    private Map<String, Integer> memoryMap;
    private Map<String, Integer> readCounts;
    private EvictionStrategy evictionStrategy;

    public MemoryMap(EvictionStrategy evictionStrategy) {
        this.memoryMap = new LinkedHashMap<>();
        this.readCounts = new HashMap<>();
        this.evictionStrategy = evictionStrategy;
    }

    public void put(String key, int value) {
        if (memoryMap.size() >= 3) {
            evictionStrategy.evict(memoryMap, readCounts);
        }
        memoryMap.put(key, value);
        readCounts.put(key, 0);
    }

    public int get(String key) {
        if (memoryMap.containsKey(key)) {
            readCounts.put(key, readCounts.get(key) + 1);
            return memoryMap.get(key);
        }
        return -1; // or throw an exception
    }

    public static void main(String[] args) {
        // Test case for LFU Eviction Strategy
        System.out.println("Testing LFU Eviction Strategy:");
        EvictionStrategy lfuStrategy = new LFUEvictionStrategy();
        MemoryMap lfuMemoryMap = new MemoryMap(lfuStrategy);

        lfuMemoryMap.put("a", 0);
        lfuMemoryMap.put("b", 0);
        lfuMemoryMap.put("c", 0);

        lfuMemoryMap.get("a");
        lfuMemoryMap.get("a");

        lfuMemoryMap.put("d", 0); // This will evict the least frequently used element ("b" or "c")

        System.out.println(lfuMemoryMap.memoryMap); // Should print the remaining elements in the map

        // Test case for FIFO Eviction Strategy
        System.out.println("\nTesting FIFO Eviction Strategy:");
        EvictionStrategy fifoStrategy = new FIFOEvictionStrategy();
        MemoryMap fifoMemoryMap = new MemoryMap(fifoStrategy);

        fifoMemoryMap.put("a", 0);
        fifoMemoryMap.put("b", 0);
        fifoMemoryMap.put("c", 0);

        fifoMemoryMap.get("a");
        fifoMemoryMap.get("a");

        fifoMemoryMap.put("d", 0); // This will evict the first inserted element ("a")

        System.out.println(fifoMemoryMap.memoryMap); // Should print the remaining elements in the map

        // Test case for LRU Eviction Strategy
        System.out.println("\nTesting LRU Eviction Strategy:");
        EvictionStrategy lruStrategy = new LRUEvictionStrategy();
        MemoryMap lruMemoryMap = new MemoryMap(lruStrategy);

        lruMemoryMap.put("a", 0);
        lruMemoryMap.put("b", 0);
        lruMemoryMap.put("c", 0);

        lruMemoryMap.get("a");
        lruMemoryMap.get("a");

        lruMemoryMap.put("d", 0); // This will evict the least recently used element ("b" or "c")

        System.out.println(lruMemoryMap.memoryMap); // Should print the remaining elements in the map
    }
}