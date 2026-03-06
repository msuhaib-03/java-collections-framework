package Sets;

import java.util.*;

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
        System.out.println("Unordered Hashset:" + set);


        // If you want to maintain order, then go with LinkedHashSet and if you want to maintain sorted order, then go with TreeSet.
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(91);
        linkedHashSet.add(26);
        linkedHashSet.add(37);
        System.out.println("Insertion Ordered LinkedHashSet" + linkedHashSet); // This will print the elements in the order they were added to the set because LinkedHashSet maintains the insertion order of the elements.

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(91);
        treeSet.add(26);
        treeSet.add(37);
        System.out.println( "Ascending Ordered TreeSet" + treeSet); // This will print the elements in ascending order because TreeSet maintains the natural ordering of the elements. If you want to maintain the elements in descending order, you can use a custom comparator when creating the TreeSet.

         Set<Integer> descendingTreeSet = new TreeSet<>(Comparator.reverseOrder());
         descendingTreeSet.add(91);
         descendingTreeSet.add(26);
         descendingTreeSet.add(37);
         System.out.println("Descending Ordered TreeSet" + descendingTreeSet); // This will print the elements in descending order because we have used a custom comparator that reverses the natural ordering of the elements.
    }

}
