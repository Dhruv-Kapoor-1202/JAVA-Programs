// Crazy Zak has designed the below steps which can be applied on any given string (Sentence) to produce a number. In  each word, find the sum of the difference between the first letter and the last letter, seconf letter and the penultimate letter, and so on till the center of the word.
// If the given string is "WORLD WIDE WEB"
// In each word, find the sum of difference between the first letter and the last letter, seconf letter adn the peniltimate letter and so on till the center of the word

// WORLD = [W - D] + [O - L] + [R] = (23 - 4) + (15 - 12) + (18) = (40)
// WIDE = 23
// WE = 26

// concatinate the sums of each word to form the result
// 40 23 26
// 402326

import java.util.*;

public class Scenario {

    public static int code(String str) {
        int len = str.length();
        int sum = 0;

        int left = 0;
        int right = len - 1;

        while (left <= right) {
            sum = sum + Math.abs((str.charAt(left) - str.charAt(right)));
            left++;
            right--;
        }

        if (len % 2 != 0) {
            sum = sum + str.charAt((len) / 2) - 'A' + 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = obj.nextLine();

        String strArr[] = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            int x = code(strArr[i]);
            System.out.print(x);
        }

    }
}
