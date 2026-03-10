package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Demo {
    public static void main(String[] args) {
        // A deque (double-ended queue) is a data structure that allows elements to be added or removed from both ends. It can be implemented using various data structures, such as arrays or linked lists. In Java, the Deque interface from the java.util package provides an implementation of a deque using a linked list.

        // Deque allows us to add and remove elements from both ends of the queue, making it more versatile than a regular queue. We can use it as a stack (LIFO) or as a queue (FIFO) depending on how we add and remove elements.

        // In Java, we can use the ArrayDeque class, which is a resizable array implementation of the Deque interface. It provides efficient operations for adding and removing elements from both ends of the deque.

        // Time complexity:
        // Insertion: O(1) - because we can add elements to either end of the deque in constant time.
        // Removal: O(1) - because we can remove elements from either end of the deque in constant time.
        // Peek: O(1) - because we can access the front and rear elements of the deque in constant time.

        // Allows insertion and deletion at both ends of the queue
        // Not thread safe
        // Versatile that regular queues and stacks because they support all the operations of both.


        Deque<Integer> deque = new ArrayDeque<>();
        // Circular array implementation, internally array.
        // Faster iterator, low memory, no null elements allowed, not thread safe.
        // this class is likely to faster than Stack when used as a stack and faster than LinkedList when used as a queue.
        deque.addFirst(10); // adds an element to the rear of the deque
        deque.addLast(20); // adds an element to the front of the deque
        deque.offerFirst(5); // adds an element to the rear of the deque, null and error handling
        deque.offerLast(25); // adds an element to the front of the deque, null and error handling
        System.out.println("Deque: " + deque);

        System.out.println("Gets First element " + deque.getFirst());
        System.out.println("Gets Last element " + deque.getLast());
        System.out.println("Elements in the deque: " + deque);

        System.out.println("Removes First element " + deque.removeFirst());
        System.out.println("Removes Last element " + deque.removeLast());

        for (int num: deque) {
            System.out.println("Queue after removal: " + num);
        }

        // It manages some pointers to the front and rear of the queue, allowing it to efficiently add and remove elements from both ends. When an element is added to the front of the deque, it updates the front pointer to point to the new element. Similarly, when an element is added to the rear of the deque, it updates the rear pointer to point to the new element. When an element is removed from either end of the deque, it updates the corresponding pointer accordingly. This allows for efficient insertion and deletion operations at both ends of the deque.
        // If we want to add at front or head but there's no space, it will wrap around to the end of the array and add the element there. Similarly, if we want to add at rear or tail but there's no space, it will wrap around to the front of the array and add the element there. This circular behavior allows us to efficiently utilize the available space in the array and avoid unnecessary shifting of elements when adding or removing from either end of the deque.
        // When head and tail meet, then queue is full and size increases.
        // That is why it is fast because no need to push elements further in array, just change pointers.
        // No need of shifting elements when adding or removing from either end of the deque, which can be time-consuming in a regular array-based implementation. This allows for efficient insertion and deletion operations at both ends of the deque, making it a versatile data structure for various applications.



    }
}
