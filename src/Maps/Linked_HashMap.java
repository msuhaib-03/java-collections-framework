package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        // LinkedHashMap is a class in Java that implements the Map interface and provides a hash table-based implementation of the Map data structure. It is similar to HashMap but maintains a linked list of the entries in the map, which allows it to preserve the order of insertion. This means that when you iterate over the keys or values of a LinkedHashMap, they will be returned in the order they were added to the map.
        // Double LinkedList is used to maintain the order of insertion in LinkedHashMap. Each entry in the LinkedHashMap is represented as a node in the linked list, and the nodes are connected in the order they were added to the map. This allows for efficient iteration over the entries while still providing fast access to values based on their keys.
        // LinkedHashMap is useful when you want to maintain the order of elements while still providing fast access to values based on their keys. It is not synchronized, so if you need to use it in a multi-threaded environment, you should consider using Collections.synchronizedMap() or using ConcurrentHashMap instead.
        // It is not thread safe.
        // The main advantage of LinkedHashMap over HashMap is that it maintains the order of insertion, which can be useful in certain scenarios where the order of elements matters. However, it may have slightly higher overhead compared to HashMap due to the additional linked list structure used to maintain the order.
        // Capacity and Load factor is provided alongwith access order which is false by default and it helps innLRU(Least Recently Used) removal because we can't keep everythingin caceh.
        // It helps in cache eviction strategy (LRU).
        // Element comes at top of list and it is removed when capacity exceeds and access order is true.

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(5, 0.75f, true);
        linkedHashMap.put("Guava", 5);
        linkedHashMap.put("Mango", 23);
        linkedHashMap.put("Banana", 17);
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Lets say now we provide capacity, load factor and access order as true.
        linkedHashMap.put("Guava", 2);
        linkedHashMap.put("Mango", 27);
        linkedHashMap.put("Guava", 55);
        linkedHashMap.put("Mango", 1);
        linkedHashMap.get("Guava");
        System.out.println("After updating values and accessing Guava: ");
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // In the above example, we have created a LinkedHashMap with a capacity of 5, a load factor of 0.75, and access order set to true. We added some key-value pairs to the map and then updated the values for "Guava" and "Mango". We also accessed "Guava" to demonstrate the access order feature. When we iterate over the entries of the LinkedHashMap, we can see that the order of the entries is based on their access order, with "Guava" appearing before "Mango" because it was accessed more recently.
        // The least used in Banana and it is at the top and removed while most used is at the end at is Guava and it can be placed in cache as it is most used.

    }
}