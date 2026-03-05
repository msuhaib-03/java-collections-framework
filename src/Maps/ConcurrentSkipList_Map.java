package Maps;

public class ConcurrentSkipList_Map {
    public static void main(String[] args) {
            // ConcurrentSkipListMap is a thread-safe implementation of the NavigableMap interface in Java. It is based on a skip list data structure, which allows for efficient concurrent access and modifications. The ConcurrentSkipListMap provides a sorted map that can be accessed and modified by multiple threads without the need for external synchronization.

            // The ConcurrentSkipListMap class provides methods for adding, removing, and retrieving key-value pairs, as well as methods for navigating through the map in a sorted order. It also supports concurrent read and write operations, making it suitable for use in multi-threaded environments.

            // One of the key features of ConcurrentSkipListMap is that it allows for concurrent modifications while maintaining the sorted order of the keys. This means that multiple threads can safely add or remove entries from the map without causing data corruption or inconsistencies.

            // ConcurrentSkipListMap is typically used in scenarios where there is a need for a thread-safe sorted map, such as in concurrent algorithms, caching mechanisms, or when maintaining a sorted collection of data that may be accessed by multiple threads simultaneously.

        // If you want things concurrent in hashmap and version of treemap, then use ConcurrentSkipListMap.
        // There's no strictness here, its flexible because things are random, using therefore to make things easier so atleast storage is easy.
        // It is only used in multi-threaded environment and it is thread safe and it is sorted map.

        // Map is sorted based on keys and it is thread safe.
        // Data is stored in skiplist data structure. It is thread safe treemap but stored in skiplist.
        // It is probabilistic data structure that allows for efficient search, insertion and deletion operations.
        // It is similar to sortedlinkedlist but with multiple layers that "skip" over portions of the list to provide faster access to elements.

        // Layers are created, and for our example lets say we want to search 2 in 1,2,3,4,5,6,7,8,9.

        // Layer 2 : 1           5              9
        // Layer 1:  1     3     5      7       9
        // Layer 0:  1  2  3  4  5  6   7   8   9

        // If you go search 2, it checks layer 2, it is less than 5, so it goes to layer 1, it is less than 3, so it goes to layer 0, it is greater than 1, so it goes to next node which is 2 and it finds the element.

        // The complexity is O(log n) for search, insertion and deletion operations in ConcurrentSkipListMap, which is efficient for a sorted map. However, it may have higher overhead compared to other map implementations due to the additional layers and probabilistic nature of the skip list data structure.

    }
}
