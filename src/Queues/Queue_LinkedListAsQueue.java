package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedListAsQueue {
    public static void main(String[] args) {
        // Queue is a linear data structure that follows the First In First Out (FIFO) principle. It can be implemented using various data structures, including arrays and linked lists. When implemented using a linked list, a queue can dynamically grow and shrink as needed, without the need for resizing.
        // Elements added at the rear and removed from the front.

        // LinkedList act as Queue:
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); // adds an element to the rear of the queue
        list.addLast(5); // enqueue
        list.addLast(7);
        System.out.println("Queue: " + list);

        list.removeFirst(); // removes the element at the front of the queue
        System.out.println("Queue after dequeue: " + list);

        list.peek(); // returns the element at the front of the queue without removing it
        System.out.println("Front element: " + list.peek());

        // We implemented queue using LinkedList but Java provides a built-in Queue class, an interface that can be implemented using various data structures, including LinkedList. The LinkedList class implements the Queue interface, allowing us to use it as a queue without needing to implement the queue operations ourselves.
        // LinkedList is just an implemetation of Queue.

        // enqueue: i) offer ii) add
        // dequeue: i) poll ii) remove
        // peek : i) peek ii) element

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // adds an element to the rear of the queue, null and error handling
        queue.add(2); // adds an element to the rear of the queue and throws an exception if the queue is full
        System.out.println("Queue: " + queue);

        System.out.println("Size of queue: " + queue.size());

        System.out.println("Prints the element removed and boolean if empty/null: " + queue.poll()); // removes and returns the element at the front of the queue, null if the queue is empty
        System.out.println("Also prints the elements: " + queue.remove()); // removes and returns the element at the front of the queue, throws an exception if the queue is empty
        System.out.println("Queue after dequeue: " + queue);
    }
}
