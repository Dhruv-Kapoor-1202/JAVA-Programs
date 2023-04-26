/* Print the sum of sums in cyclic order
 * n = 2345
 * (2+3+4+5) + (3+4+5) + (4+5) + (5)
 */

import java.util.Scanner;

public class CyclicSum {
    public int getData() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int data = obj.nextInt();
        return data;
    }

    public int logic(int data) {
        int arr[] = new int[50];
        int count = 0;
        int i = 0;
        while (data > 0) {
            arr[i] = data % 10;
            i++;
            count++;
            data = data / 10;
        }

        int sum = 0;
        for (int j = 0; j < count; j++) {
            for (int k = j; k < count; k++) {
                sum = sum + arr[j];
                System.out.print(arr[j] + " ");
            }
        }
        return sum;
    }

    public void display(int sum) {
        System.out.println("The Sum = " + sum);
    }

    public static void main(String args[]) {
        CyclicSum obj = new CyclicSum();
        int data = obj.getData();
        int sum = obj.logic(data);
        obj.display(sum);
    }
}
