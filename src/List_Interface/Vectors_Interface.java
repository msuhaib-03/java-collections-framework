package List_Interface;

import java.util.LinkedList;
import java.util.Vector;

public class Vectors_Interface {
    public static void main(String[] args) {
        // One of the main differences between Vector and ArrayList is that Vector is synchronized, which means that it is thread-safe and can be used in multi-threaded environments without the need for external synchronization. On the other hand, ArrayList is not synchronized, which means that it is not thread-safe and should not be used in multi-threaded environments without external synchronization.
        // Vectors is one of the legacy classes in Java that implements List interface and it is similar to ArrayList in terms of functionality. However, it is synchronized, which means that it is thread-safe and can be used in multi-threaded environments without the need for external synchronization. It also has a default capacity of 10 and automatically resizes itself when the number of elements exceeds its capacity. However, due to its synchronization overhead, it is generally recommended to use ArrayList instead of Vector in most cases, unless you specifically require thread safety.
        // As it grows automatically, so its dynamic
        // No data corruption can happen in multi-threaded environment as it is synchronized.
        // Random access using index is possible in O(1) time complexity.
        // Its capacity is 10 by default but it is doubled when capacity exceeds.

        Vector<Integer> vector = new Vector<>(5); // we can give increment as well, rather than doubling, we can specify what capacity to add to original if limit exceeds.
        vector.add(1);
        vector.add(5);
        System.out.println(vector.capacity()); // returns the current capacity of the vector, which is 5 in this case as we have initialized it with a capacity of 5.
        vector.add(1);
        vector.add(10);
        vector.add(3);
        vector.add(9);
        System.out.println("Capacity of vector initially set: "+vector.capacity()); // returns the current capacity of the vector, which is 10 in this case as we have added 6 elements to the vector and it has automatically resized itself to accommodate more elements.
        System.out.println("Elements in vector:" + vector);

        // we can pass other data in vectors as well like this:
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        Vector<Integer> vector2 = new Vector<>(linkedList);
        System.out.println("Vectors from LinkedList: "+vector2);
        vector2.add(37);
        // Above were basic constructors in Vectors, and now we will see some of the methods in Vectors:
        System.out.println("Elements of vector2: ");
        for(Integer i : vector2){
            System.out.println(i);
        }

    }
}
