import java.util.*;

public class FirstStack {

    public void stack_push(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    public void stack_pop(Stack<Integer> stack) {
        stack.pop();
    }

    public void stack_peek(Stack<Integer> stack) {
        System.out.println("Element at top: " + stack.peek());
    }

    public void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + pos);
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();

        FirstStack fs = new FirstStack();

        System.out.print("Enter number of operations: ");
        int oprCount = obj.nextInt();

        for (int i = 0; i < oprCount; i++) {
            System.out.print("Enter Operation: ");
            int opr = obj.nextInt();

            switch (opr) {
                case 1:
                    // push
                    System.out.print("Enter value: ");
                    Integer val = obj.nextInt();
                    fs.stack_push(stk, val);
                    break;

                case 2:
                    System.out.print("hello");

                default:
                    break;
            }
        }

    }
}