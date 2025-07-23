import java.util.LinkedList;
import java.util.Queue;

//public class Queue; already defined queue structure
public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //offer()= add() but if the queue is full, does not throw error, return false
        //poll() = remove() but if the queue is empty, does not throw error, return null
        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Front of queue: " + queue.peek());
        System.out.println("Queue: " + queue);
    }
}