public class ManualQueue {
    int [] queue;
    int front, rear, size;

    public ManualQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue (int value){
        if (size == queue.length){
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = value;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            System.out.println("Queue is empty");
        }
        int removed = queue[front];
        front++;
        size--;
        return removed;
    }

    public int peek() {
        return queue[front];
    }

    public void print() {
        for (int i = front; i < rear; i++){
            System.out.print(queue[i]+ " ");
        }
        System.out.println();
    }
}
