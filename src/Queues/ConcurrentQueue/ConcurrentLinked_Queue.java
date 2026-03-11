package Queues.ConcurrentQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinked_Queue {
    public static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    // An implementation of queue interface that supports lock-free, thread-safe operations.
    // In case of task submission system, why waiting for task to be free or locking task, don't block consumer from taking.
    // Producer puts and consumer takes.
    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String item = "Item " + i;
                queue.add(item);
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
                while ((item = queue.poll()) == null) {
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
