package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;
    LRU_Cache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRU_Cache<String, Integer> lruCache = new LRU_Cache<>(3);
        lruCache.put("Alice", 91);
        lruCache.put("Bob", 85);
        lruCache.put("Charlie", 78);
        System.out.println("LRU Cache: " + lruCache);

        // if I add another entry now, the least recently used entry (which is "Alice") will be removed from the cache to make room for the new entry.
        lruCache.put("David", 88);
        System.out.println("LRU Cache after adding David: " + lruCache);
    }
}
