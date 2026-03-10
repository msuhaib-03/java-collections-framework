package Queues;

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


    }
}
