package Queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
            // A priority queue is a data structure that stores elements based on their priority. Each element in the priority queue has an associated priority value, and the element with the highest priority is served before the elements with lower priorities. If two elements have the same priority, they are served according to their order in the queue (FIFO).
            // Priority queues can be implemented using various data structures, such as arrays, linked lists, or heaps. The most common implementation of a priority queue is using a binary heap, which allows for efficient insertion and removal of elements based on their priority.
            // In Java, the PriorityQueue class from the java.util package provides an implementation of a priority queue. It uses a binary heap to store the elements and allows for efficient retrieval of the highest-priority element.

        // Part of QUEUE interface;
        // Orders elements based on natural ordering (primitive lowest first)
        // custom ordering (using Comparator)
        // null elements not allowed
        // not thread safe

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(3);
        System.out.println("Priority Queue: " + queue); // Output may not be in the order of insertion because we are printing it directly.

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Output will be in the order of priority (1, 3, 5)
        }

        // Priority Queue is implemented as min-heap by default for natural ordering
        // In min-heap, each node has a value less than or equal to its child nodes, so the top element of the heap will have to be the smallest.
        // Root of tree is smallest element in the heap, and the last element is the largest. When we add an element to the heap, it is added at the end of the tree and then "bubbled up" to its correct position based on its priority. When we remove an element from the heap, the root element (the smallest) is removed, and the last element is moved to the root and then "bubbled down" to its correct position based on its priority.

        // Time complexity:
        // Insertion: O(log n) - because we may need to bubble up the new element to maintain the heap property.
        // Removal: O(log n) - because we may need to bubble down the last element to maintain the heap property after removing the root element.
        // Peek: O(1) - because the highest-priority element is always at the root of the heap.

        // If we want custom ordering, we can use Comparator:
        PriorityQueue<Integer> customQueue = new PriorityQueue<>(Comparator.reverseOrder()); // This will create a max-heap, where the largest element has the highest priority.
        customQueue.offer(5);
        customQueue.offer(1);
        customQueue.offer(3);
        customQueue.offer(6);
        customQueue.offer(7);
        System.out.println("Custom Priority Queue: " + customQueue);
    }
}
