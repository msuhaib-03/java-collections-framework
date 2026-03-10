package Queues.Blocking_Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer1 implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    Producer1(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("Produced: " + value);
                queue.put(value++);
                Thread.sleep(1000); // Sleep for a while to simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted");
            }
        }
    }
}

class Consumer1 implements Runnable{
    private BlockingQueue<Integer> queue;

    Consumer1(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try{
                int value = queue.take();
                System.out.println("Consumed: " + value);
                Thread.sleep(2000); // Sleep for a while to simulate time taken to consume an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted");
            }
        }
    }
}

public class LinkedBlocking_Queue {
    public static void main(String[] args) {
            // LinkedBlockingQueue is an optionally bounded blocking queue based on linked nodes.
            // It is typically used in producer-consumer scenarios where multiple threads are producing and consuming items concurrently.
            // The queue can be bounded (with a specified capacity) or unbounded (with no capacity limit).
            // If the queue is bounded and full, producers will block until space becomes available. If the queue is unbounded, producers will never block.
            // Consumers will block if the queue is empty until an item becomes available.
        // Uses 2 separate locks for enqueue and dequeue
        // Higher concurrency between producers and consumers

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread producer = new Thread(new Producer1(queue));
        Thread consumer = new Thread(new Consumer1(queue)) ;
        producer.start();
        consumer.start();
    }
}
