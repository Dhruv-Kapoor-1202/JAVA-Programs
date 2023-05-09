import java.util.*;

public class ExcepHandle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNum = obj.nextInt();

        System.out.print("Enter second number: ");
        int secNum = obj.nextInt();

        int result = 0;

        try {
            result = firstNum / secNum;
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled: " + e);
            System.out.println("ERROR");
        }

        System.out.println("The Result: " + result);
        obj.close();
    }

}