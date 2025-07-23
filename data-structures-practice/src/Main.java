public class Main {
    public static void main(String[] args) {

        ManualStack stack = new ManualStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        ManualQueue queue = new ManualQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());

    }
}
