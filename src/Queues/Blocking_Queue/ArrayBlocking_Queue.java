package Queues.Blocking_Queue;
// =============== BLOCKING QUEUE ===============
// It is an interface, which is thread safe, better for multi-threaded environments.
// Wait for space, wait for queue to be non-empty, and it is bounded, which means it has a fixed capacity that is set when the queue is created. If the queue is full, any attempt to add an element will block until space becomes available. Similarly, if the queue is empty, any attempt to remove an element will block until an element becomes available.
// Simplify concurrency problems like producer-consumer.

// Standard Queue --> immediately
// i) empty -> remove (no waiting)
// ii) full -> add (no waiting)

// Blocking Queue:
// i) offer -> wait for space to become available upto specified amount
// ii) put -> blocks if queue is full until space becomes available


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    Producer(BlockingQueue<Integer> queue){
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

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue){
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

public class ArrayBlocking_Queue {
    public static void main(String[] args) {
        // ArrayBlockingQueue is a bounded blocking queue backed by an array. It is a thread-safe implementation of the BlockingQueue interface, which means that it can be used in concurrent programming scenarios where multiple threads need to access the queue simultaneously. The ArrayBlockingQueue class provides methods for adding, removing, and inspecting elements in the queue, as well as methods for blocking and waiting when the queue is full or empty.
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // A bounded blocking queue backed by an array. This queue orders elements FIFO (first-in-first-out). The head of the queue is that element that has been on the queue the longest time. The tail of the queue is that element that has been on the queue the shortest time. New elements are inserted at the tail of the queue, and the queue retrieves elements from the head of the queue. This class does not permit null elements. A BlockingQueue does not accept null elements because null is used as a special return value to indicate that the queue is empty.
       // Circular array
        // Low memory overhead
        // Single lock
        // More Threads -> Problems
        // Producer and consumer blocks each other or uses single lock for enqueue and dequeue.
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}
