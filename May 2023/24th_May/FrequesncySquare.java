import java.util.*;

public class FrequesncySquare {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = obj.nextInt();

        int arr[] = new int[10];
        int temp = num;

        while (temp > 0) {
            arr[temp % 10]++;
            temp /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (("" + num).contains(("" + i))) {
                System.out.println(i + " : " + arr[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                sum = sum + (arr[i] * arr[i] * arr[i]);
            }
        }

        String str = "" + sum;
        String rev = new StringBuffer(str).reverse().toString();

        System.out.println("The sum of cubes = " + sum);

        if (rev.equals(str)) {
            System.out.println("Yes! It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
