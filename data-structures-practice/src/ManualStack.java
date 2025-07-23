public class ManualStack {
    private int [] stack;
    private int top;

    public ManualStack (int size){
        stack = new int[size];
        top = -1;
    }

    public void push (int value) {
        if (top == stack.length-1){
            System.out.println("Stack is full.");
            return;
        }
        stack[++top] = value;
    }

    public int pop () {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top--];
    }

    public int peek () {
        return (top == -1) ? -1 : stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}