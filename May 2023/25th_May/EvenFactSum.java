// Calculate sum of factorials of all the digits of a number, getting by sum of all digits at even position at given number
// n = 234567
// 4 + 6
// 10
//  1 factorial + 0 factorial

import java.util.*;

public class EvenFactSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String num = obj.nextLine();

        int sum = 0;

        for (int i = 0; i < num.length(); i = i + 2) {
            sum = sum + Integer.parseInt("" + num.charAt(i));
        }

        System.out.println("Even Sum : " + sum);

        int factSum = 0;
        while (sum > 0) {
            int temp = sum % 10;
            int fact = 1;

            if (temp == 0) {
                fact = 1;
            }

            for (int i = 1; i <= temp; i++) {
                fact = fact * i;
            }

            factSum = factSum + fact;
            sum = sum / 10;
        }

        System.out.println(
                "Sum of factorials of every digit of the sum of even position digits of the number = " + factSum);
    }
}
