import java.util.*;

/**
 * MyExcep
 */
class MyExcep extends Exception {
    // MyExcep() {
    // System.out.print("Invalid Input. ");

    // }

    public String less() {
        return "Digits can't be less than 3";
    }

    public String more() {
        return "Digits can't be more than 7";

    }

    // public String toString() {
    // return "Exception";
    // }

}

public class UserDefinedExcep {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Input: ");
        String input = obj.nextLine();

        int len = input.length();

        if (len >= 3 && len <= 7) {
            System.out.println("Normal Execution!");
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                int n = input.charAt(i) - 48;
                sum = sum + n;
            }
            System.out.println("Sum = " + sum);

        } else {
            if (len < 3) {
                try {
                    throw new MyExcep();
                } catch (MyExcep e) {
                    System.out.println(e.less());
                }
            } else {
                try {
                    throw new MyExcep();
                } catch (MyExcep e) {
                    System.out.println(e.more());
                }
            }

        }

    }

}
