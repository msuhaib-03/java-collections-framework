package Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Immutable_Map {
    public static void main(String[] args) {
            // An immutable map is a type of map that cannot be modified after it has been created. Once an immutable map is instantiated, its contents cannot be changed, meaning you cannot add, remove, or update key-value pairs in the map. This immutability can provide several benefits, such as thread safety and improved performance, as immutable objects can be safely shared across multiple threads without the need for synchronization.

            // In Java, you can create an immutable map using the Collections.unmodifiableMap() method or by using the Map.of() method introduced in Java 9. Here's an example of how to create an immutable map using both approaches:

            // Using Collections.unmodifiableMap()
            Map<String, Integer> mutableMap = new HashMap<>();
            mutableMap.put("Alice", 91);
            mutableMap.put("Bob", 85);
            Map<String, Integer> immutableMap1 = Collections.unmodifiableMap(mutableMap);
            System.out.println("Immutable Map 1: " + immutableMap1);

            // Using Map.of() (Java 9 and later)
            Map<String, Integer> immutableMap2 = Map.of(
                    "Charlie", 78,
                    "David", 88
            );
            System.out.println("Immutable Map 2: " + immutableMap2);

            // Attempting to modify the immutable maps will result in UnsupportedOperationException
            try {
                immutableMap1.put("Eve", 95); // This will throw an exception
            } catch (UnsupportedOperationException e) {
                System.out.println("Cannot modify immutableMap1: " + e.getMessage());
            }

            try {
                immutableMap2.put("Eve", 95); // This will also throw an exception
            } catch (UnsupportedOperationException e) {
                System.out.println("Cannot modify immutableMap2: " + e.getMessage());
            }

            // If you need to create a new modified Map with more entries, then you can use Map.ofEntries() like this:
        Map<String, Integer> multipleEntriesMap = Map.ofEntries(Map.entry("Alice", 91), Map.entry("Bob", 88));
        System.out.println("Multiple Entries Map: " + multipleEntriesMap);
    }
}
