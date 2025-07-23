import java.util.Stack;

//public class Stack; already defined stack structure
public class StackEx{
    public static void main(String [] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after popping: " + stack);
    }
}