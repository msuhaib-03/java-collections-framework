package Maps.SortedMaps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigable_Map {
    public static void main(String[] args) {
            // NavigableMap is an interface in Java that extends the SortedMap interface and provides additional methods for navigating and manipulating the map. It allows you to retrieve entries based on their position in the map, such as the first entry, last entry, or entries that are less than or greater than a specified key.

            // The NavigableMap interface provides methods such as:
            // - firstEntry(): Returns the first entry in the map.
            // - lastEntry(): Returns the last entry in the map.
            // - lowerEntry(K key): Returns the greatest entry less than the specified key.
            // - higherEntry(K key): Returns the least entry greater than the specified key.
            // - floorEntry(K key): Returns the greatest entry less than or equal to the specified key.
            // - ceilingEntry(K key): Returns the least entry greater than or equal to the specified key.

            // NavigableMap is typically implemented by classes such as TreeMap, which provides a red-black tree implementation of the map. It is useful when you need to perform range queries or navigate through the entries in a sorted order.

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(3, "Three");
        navigableMap.put(1, "One");
        navigableMap.put(6, "Six");
        navigableMap.put(2, "Two");

        System.out.println(navigableMap);
        System.out.println("First Entry: " + navigableMap.firstEntry());
        System.out.println(navigableMap.ceilingEntry(4)); // prints key-value of least entry greater than or equal to 4, which is 6=Six
        System.out.println(navigableMap.lowerKey(2));
        System.out.println(navigableMap.ceilingKey(4)); // prints key of least entry greater than or equal to 4, which is 6.
    }
}
