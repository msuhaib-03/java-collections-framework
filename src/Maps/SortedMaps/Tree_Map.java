package Maps.SortedMaps;

import java.util.SortedMap;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
            // TreeMap is a class in Java that implements the Map interface and uses a Red-Black tree data structure to store key-value pairs. It is part of the Java Collections Framework and provides a sorted map implementation, where the keys are stored in a sorted order based on their natural ordering or a specified comparator.
            // TreeMap provides several advantages over other Map implementations, such as HashMap. One of the main advantages is that it maintains the keys in a sorted order, which allows for efficient retrieval of values based on their keys. Additionally, TreeMap provides logarithmic time complexity for basic operations such as get(), put(), and remove(), making it suitable for large datasets.
            // However, it is important to note that TreeMap does not allow null keys, and it may not be suitable for all use cases. It is generally recommended to use HashMap or other Map implementations unless you specifically need the behavior provided by TreeMap.

        // SortedMap is am interface & TreeMap is its implementation. It extends Map & guarantees that entries are sorted based on keys either in natural ordering or specified comparator.
        // We could use Map but we use SortedMap because it provides additional methods such as firstKey(), lastKey(), headMap(), tailMap(), and subMap() that allow us to perform operations based on the sorted order of the keys. These methods can be useful when we need to retrieve a specific range of keys or values from the map, or when we want to perform operations such as finding the minimum or maximum key in the map.

        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(92, "Suhaib");
        treeMap.put(77, "Akbar");
        treeMap.put(100, "Amjad");
        treeMap.put(83, "Sana");
        System.out.println(treeMap); // This will print the entries in sorted order based on the keys, which are the integers in this case.

        System.out.println("First Sorted Key: " + treeMap.firstKey());
        System.out.println("Last Sorted Key: " + treeMap.lastKey());
        System.out.println("All elements from First Sorted Key upto till provided number excluded: " +treeMap.headMap(85)); // This will return a view of the portion of the map whose keys are strictly less than 85, which means it will include the entries with keys 77 and 83, but not the entry with key 92. It excludes the provided number.
        System.out.println("All elements from this provided number till last sorted: " + treeMap.tailMap(92)); // This returns all values from provided till last.

    // You can pass comparator in TreeMap like this: TreeMap<>((a,b) -> b-a), and it will sort in descending order. Its a use of comparator.

        // The idea here of TreeMap is Red-Black tree / Self balancing binary search tree. The complexity is 0(log(n)).
        // Insertion, deletion, searching all can be done here like Mpa.
        // In Binary Search Tree, the node on right of parent node is greater than parent node and node on left of parent node is smaller than parent node and in worst case scenarios, it is 0(n).
        // But in red-black tree, it is self balancing so the tree balances itself and complexity is now 0(log(n)) in worst case scenarios too.

        // For example in BST, we we add 10,20,30 it will be added like this:
        //         10
        //           \
        //            20
        //              \
        //               30
        // But in Red-Black tree, it will be added like this:
        //         20
        //        /  \
        //      10    30
    }
}
