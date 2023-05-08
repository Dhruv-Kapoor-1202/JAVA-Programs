import java.util.*;

public class Print1D {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = obj.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.print("The given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
