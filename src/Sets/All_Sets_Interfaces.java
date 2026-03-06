package Sets;

import java.util.HashSet;
import java.util.Set;

public class All_Sets_Interfaces {
    public static void main(String[] args) {
            // Set is a collection that contains no duplicate elements. It is an unordered collection, meaning that the elements are not stored in any particular order. The Set interface in Java provides methods for adding, removing, and checking for the presence of elements in the set.

            // The Set interface has several implementations in Java, including HashSet, LinkedHashSet, and TreeSet. Each implementation has its own characteristics and performance trade-offs.

            // HashSet: This implementation uses a hash table to store the elements. It provides constant-time performance for basic operations like add, remove, and contains. However, it does not maintain any order of the elements.

            // LinkedHashSet: This implementation is similar to HashSet but maintains a linked list of the entries in the set. This allows it to maintain the insertion order of the elements while still providing constant-time performance for basic operations.

            // TreeSet: This implementation uses a red-black tree to store the elements. It provides logarithmic time performance for basic operations and maintains the elements in sorted order based on their natural ordering or a specified comparator.

        // A collection that contains no duplicate elements, it has faster operations.
        // Set is an interface and HashSet is its implementation.
        // They are just keys, not values, so they are stored in a hash table and it is not ordered. It is not thread safe.

        Set<Integer> set = new HashSet<>();
        set.add(91);
        set.add(26);
        set.add(37);
        System.out.println(set);
    }
}
