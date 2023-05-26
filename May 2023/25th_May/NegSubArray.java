// Print the maximum number of sub arrays from the given array with negative sum.

import java.util.*;

public class NegSubArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) < 0) {
                    count++;
                }
            }
        }

        System.out.println("Count :" + count);
    }

}
