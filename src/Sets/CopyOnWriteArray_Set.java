package Sets;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArray_Set {
    public static void main(String[] args) {
        // CopyOnWriteArraySet is a thread-safe variant of the Set interface in Java that is implemented using a copy-on-write strategy. It is designed for scenarios where there are more read operations than write operations, as it allows for concurrent reads without the need for synchronization.

        // When a write operation (such as adding or removing an element) is performed on a CopyOnWriteArraySet, it creates a new copy of the underlying array and modifies that copy. This means that read operations can continue to access the original array without being blocked by write operations, providing better performance in scenarios with high read concurrency.

        // However, it's important to note that CopyOnWriteArraySet is not suitable for scenarios with frequent write operations, as each write operation involves creating a new copy of the array, which can be inefficient in terms of memory and performance.

        // Iterate Stability
        // Read Intensive
        // Less Writes

        // No sorted manner storage and working on internal array.
        // No duplicate elements allowed and it is thread safe.
        // A new copy is created of an array.
        // Iterations don't reflect changes made to the set after the iterator was created.

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        for (int i=1; i<=5; i++) {
                copyOnWriteArraySet.add(i); // This will not affect the current iteration as it is working on a copy of the set.
        }
        System.out.println("Initial Set: " + copyOnWriteArraySet);


        for (Integer number: copyOnWriteArraySet){
            System.out.println("Reading number: " + number);
//            if (number == 2){
                copyOnWriteArraySet.add(6); // This will not affect the current iteration as it is working on a copy of the set.
                System.out.println("List after trying to add 6: "+ copyOnWriteArraySet );
//            }
        }
        System.out.println("Final Set: " + copyOnWriteArraySet);
        // We are adding, iterating and modifying at the same time, but it is not throwing any error because it is working on a copy of the set.
        // It doesn't add on iterations.
        // It is used in "read intensive" scenarios because memory is consumed at each write.
        // After printing, it adds number.
        // If it was concurrent, it would have done both operations at the same time.
    }
}
