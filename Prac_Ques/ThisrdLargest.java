import java.util.Scanner;

public class ThisrdLargest {
    public int[] getArray() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = obj.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        return arr;
    }

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ThisrdLargest obj = new ThisrdLargest();
        int arr[] = obj.getArray();
        obj.display(arr);

    }

}
