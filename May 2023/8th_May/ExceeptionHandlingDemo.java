import java.util.*;

public class ExceeptionHandlingDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = obj.nextInt();

        System.out.print("Enter the second number: ");
        int secNum = obj.nextInt();

        int result = 0;
        try {
            result = firstNum / secNum;
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled: " + e);
        }

        // finally {
        // System.out.println("This is the finally block!");
        // }

        System.out.println("The result: " + result);

        System.out.println("This happens outside the try-catch thing!");
    }

}