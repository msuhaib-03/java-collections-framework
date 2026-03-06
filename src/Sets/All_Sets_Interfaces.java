package Sets;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

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


        // For Thread safety, we can use STATIC class:
        Collections.synchronizedSet(set);
         // This will return a synchronized (thread-safe) set backed by the specified set. In this case, we are synchronizing the HashSet, which means that all operations on the set will be thread-safe. However, it is important to note that the synchronized set returned by Collections.synchronizedSet() is not a concurrent collection and may still have performance issues in highly concurrent environments. If you need a thread-safe set with better performance, you may want to consider using a concurrent collection like ConcurrentHashMap or CopyOnWriteArraySet instead.
        // This costs performance so that's wht it is not implemented in Map too.


        // Rather we use ConcurrentSkipListSet which is a thread-safe implementation of the NavigableSet interface in Java. It is based on a skip list data structure, which allows for efficient concurrent access and modifications. The ConcurrentSkipListSet provides a sorted set that can be accessed and modified by multiple threads without the need for external synchronization.
        // Weakly consistent
        // Sorted and Range based operations.
        // Thread safe
        // Used when frequent read and writes.
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(91);
        concurrentSkipListSet.add(26);
        concurrentSkipListSet.add(37);
        System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet); // This will print the elements in ascending order because ConcurrentSkipListSet maintains the natural ordering of the elements.
        // It extends NavigableSet.


        // Set has unmodifiableSet as well like this:
        Set<Object> objects = Set.of("Apple", "Banana", "Mango");
        System.out.println("Unmodifiable Set: " + objects); // This will print [Apple, Banana, Mango] because the Set.of() method creates an unmodifiable set containing the specified elements. The elements are stored in a hash table and the order of the elements is not guaranteed.
        // We can add more than 10 entries unlike Map because it is not based on key-value pair but it is based on unique elements. It is immutable and thread safe because it is unmodifiable. It does not allow null values and it will throw NullPointerException if you try to add null values to the set. It is a static factory method that returns an unmodifiable set containing the specified elements. The set returned by this method is immutable, which means that you cannot add, remove, or modify the elements in the set after it has been created. If you try to modify the set, it will throw an UnsupportedOperationException. The Set.of() method is a convenient way to create small sets of elements without having to use a mutable collection like HashSet or LinkedHashSet.

        Collections.unmodifiableSet(set);
         // This will return an unmodifiable view of the specified set. In this case, we are creating an unmodifiable view of the HashSet, which means that any attempt to modify the set through the returned view will throw an UnsupportedOperationException. However, it is important to note that the original set can still be modified through other references, so if you want to create a truly immutable set, you should consider using a different approach, such as using a concurrent collection or creating a new set with the desired elements and not exposing any references to it.


    }

}
