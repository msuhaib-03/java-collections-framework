package Queues.Blocking_Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriortiyBlocking_Queue {
    public static void main(String[] args) {
            // PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as java.util.PriorityQueue and supplies blocking retrieval operations.
            // It does not permit null elements. A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException).
            // The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements -- ties are broken arbitrarily.
            // The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
            // The add, offer, put, and offer methods insert elements into the queue according to their priority.
            // This class does not permit null elements. Attempts to add a null element result in NullPointerException.
            // A PriorityBlockingQueue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException).
        // Put won't block as the queue is unbounded, but take will block if the queue is empty
        // Binary Heap as array is used to implement the priority queue and grows dynamically.

        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
            new Thread(new Producer(queue)).start();
            new Thread(new Consumer(queue)).start();
    }
}
