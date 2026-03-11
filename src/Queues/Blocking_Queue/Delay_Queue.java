package Queues.Blocking_Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Delay_Queue {
    public static void main(String[] args) throws InterruptedException {
        // Thread safe unbounded blocking queue of Delayed elements, in which an element can only be taken when its delay has expired. The head of the queue is that Delayed element whose delay expired furthest in the past. If no delay has expired there is no head and poll will return null. Expired elements are ordered in the queue according to the order of their expiration time. This class does not permit null elements.
        // Useful for scheduling tasks to be executed after a certain delay
        // Internally priority queue.

        BlockingQueue<DelayedTask> queue = new DelayQueue<>();
        queue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
        queue.put(new DelayedTask("Task2", 10, TimeUnit.SECONDS));
        queue.put(new DelayedTask("Task3", 3, TimeUnit.SECONDS));

        while (!queue.isEmpty()){
            DelayedTask task = queue.take(); // This will block until the head task's delay has expired
            System.out.println("Executing: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}

class DelayedTask implements Delayed{

    private final String taskName;
    private final long startTime;

    DelayedTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedTask) o).startTime) {
            return 1;
        }
        return 0;
    }
    public String getTaskName() {
        return taskName;
    }

}