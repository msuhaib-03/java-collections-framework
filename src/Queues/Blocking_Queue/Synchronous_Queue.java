package Queues.Blocking_Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Synchronous_Queue {
    public static void main(String[] args) {
                // SynchronousQueue is a blocking queue in which each insert operation must wait for a corresponding remove operation by another thread, and vice versa.
                // It does not have any internal capacity, not even a capacity of one. You cannot peek at a synchronous queue because an element is only present when you try to remove it; you cannot insert an element (using any method) unless another thread is trying to remove it; you cannot iterate as there is no way to obtain an element from the queue without removing it.
                // This queue is typically used for handoff designs, where one thread is producing an object and another thread is consuming that object. The producer thread will block until the consumer thread receives the object, and the consumer thread will block until the producer thread produces the object.
            // Put and take will always block as there is no internal capacity
            // Sorted by insertion order, not priority
        // Each insertion operation must wait for a corresponding remove operation by another thread, and vice versa.
        // Capacity of at most 1 element, means it cannot store any elements internally. Each put must wait for a take, and each take must wait for a put.

        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try{
                System.out.println("Producer waiting to transfer");
                queue.put("Hello from Producer");
                System.out.println("Producer transferred message");
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted");
            }
        });

        Thread consumer = new Thread(() -> {
            try{
                System.out.println("Consumer waiting to receive");
                String message = queue.take();
                System.out.println("Consumer received message: " + message);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted");
            }
        });

        producer.start();
        consumer.start();
    }
}
