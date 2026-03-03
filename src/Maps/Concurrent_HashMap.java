package Maps;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_HashMap {
    public static void main(String[] args) {
            // ConcurrentHashMap is a thread-safe implementation of the Map interface in Java. It allows concurrent access and modifications by multiple threads without the need for external synchronization. It achieves thread safety by dividing the map into segments and using locks on those segments, allowing multiple threads to access different segments simultaneously.

            // ConcurrentHashMap provides better performance than synchronized maps (like Collections.synchronizedMap) in multi-threaded environments because it allows concurrent read and write operations without blocking the entire map.

            // Some key features of ConcurrentHashMap include:
            // - It does not allow null keys or null values.
            // - It provides methods like putIfAbsent, remove, and replace that allow atomic operations on the map.
            // - It uses a combination of locking and non-blocking algorithms to achieve thread safety while maintaining high performance.

            // ConcurrentHashMap is commonly used in scenarios where multiple threads need to access and modify a shared map concurrently, such as in caching, concurrent data processing, or when implementing thread-safe collections.

        // Java7 -> segment based locking -> 16 segments -> smaller hashmap
        // Only the segment being written to or read from is locked.
        // read: no locking
        // write: locks the segment

        // Java8 -> no segmentation
        // Compare-And-Swap Approach -> No locking except collision or resizing.
        // No locking in read, only on write operations.

        //For Example:
        // Thread A last saw : x=42;
        // Thread A works: x=50;
        // If x is still 42, then update to 50 else do nothing because some other thread has updated x in the meantime.
        // Other thread could work on it too so it reads again .

        // In case of a loop where we want to update x, we can do it like this:
        // while (true){
        //     int oldValue = x;
        //     int newValue = oldValue + 1;
        //     if (compareAndSwap(oldValue, newValue)){
        //         break;
        //     }
        // }

        // Lock can be applied to bucket and resizing by increasing capacity.
        // Methods are same like hashmap but they are thread safe and they are not blocking each other.

        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Apple", 5);
        concurrentHashMap.put("Banana", 10);
        System.out.println("ConcurrentHashMap: " + concurrentHashMap); // This will print {Apple=5, Banana=10} because the entries are stored in a hash table and the order of the entries is not guaranteed.

    }
}
