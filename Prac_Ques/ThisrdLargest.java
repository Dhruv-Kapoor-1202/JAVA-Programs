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

    public int logic(int array[]) {
        // sorting the array;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[array.length - 3];
    }

    public static void main(String[] args) {
        ThisrdLargest obj = new ThisrdLargest();
        int arr[] = obj.getArray();
        // obj.display(arr);
        int third = obj.logic(arr);
        System.out.println("\nThe Third largest in the given array is : " + third);

    }

}
