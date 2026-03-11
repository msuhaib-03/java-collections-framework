package Queues.ConcurrentQueue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinked_Deque {
    public static void main(String[] args) {

        // ConcurrentLinkedDeque is an implementation of the Deque interface that supports lock-free, thread-safe operations. It is an unbounded concurrent deque based on linked nodes. Concurrent insertion, removal, and access operations execute safely across multiple threads.
        // Non-blocking, thread-safe, double-ended queue.
        // Compare and Swap Strategy is used to achieve thread safety without locks.
        // Same methods as Deque interface, but they are thread-safe and non-blocking.
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String item = "Item " + i;
                deque.addLast(item); // Add to the end of the deque
                System.out.println("Produced: " + item);
                try {
                    Thread.sleep(1000); // Sleep for a while to simulate time taken to produce an item
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer was interrupted");
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String item;
                while ((item = deque.pollFirst()) == null) {
                    // Wait until an item is available
                }
                System.out.println("Consumed: " + item);
                try {
                    Thread.sleep(1500); // Sleep for a while to simulate time taken to consume an item
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer was interrupted");
                }
            }
        });

        producer.start();
        consumer.start();

    }
}