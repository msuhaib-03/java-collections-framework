package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
            // HashMap is a class in Java that implements the Map interface and provides a hash table-based implementation of the Map data structure. It allows us to store key-value pairs, where each key is unique and maps to a specific value. HashMap uses a hash function to compute an index for each key, which allows for efficient retrieval of values based on their corresponding keys.

            // HashMap does not maintain any order of its elements, meaning that the order of key-value pairs is not guaranteed. It allows one null key and multiple null values. HashMap is not synchronized, which means it is not thread-safe and should be used in single-threaded environments or with external synchronization when used in multi-threaded environments.

            // HashMap provides constant-time performance for basic operations such as get() and put(), assuming the hash function disperses the elements properly across the buckets. However, in cases where there are many collisions (i.e., multiple keys hashing to the same index), the performance can degrade to O(n) in the worst case.

            // To use a HashMap, you can create an instance of it and use its methods to add, retrieve, and manipulate key-value pairs. For example:
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Sobi");
        map.put(2,"Taha");
        map.put(3,"Baba");
        System.out.println(map);

        // To retrieve a value based on its key, you can use the get() method:
        String student = map.get(2); // returns "Taha" as it is the value associated with the key 2 in the map.
        System.out.println("Student with ID 2: " + student);

        System.out.println(map.containsKey(1)); // returns true as the key 1 is present in the map.
        System.out.println(map.containsValue("Taha")); // returns true.

        // There's no order in HashMap, and if you want to iterate over it, you have to use Set, which is a list interface and doesn't contain dulicates.
        Set<Integer> integers = map.keySet();
        for(Integer key: integers){
            System.out.println(map.get(key));
        }


        // Now if you want to print both key and value, you can use entrySet() method which returns a set of key-value pairs in the map.
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }

    }
}
