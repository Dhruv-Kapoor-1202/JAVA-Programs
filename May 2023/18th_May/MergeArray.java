import java.util.*;

public class MergeArray {

    public static void displaySort(int[] arr) {

    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int[] merge = new int[50];

        System.out.print("Enter size of first array: ");
        int N = obj.nextInt();

        int[] arr1 = new int[N];

        int k = 0;
        System.out.print("Enter array: ");
        for (int i = 0; i < N; i++) {
            arr1[i] = obj.nextInt();
            merge[k] = arr1[i];
            k++;
        }

        System.out.print("Enter size of second array: ");
        int M = obj.nextInt();

        int[] arr2 = new int[M];

        k = N;

        System.out.print("Enter array: ");
        for (int i = 0; i < M; i++) {
            arr2[i] = obj.nextInt();
            merge[k] = arr2[i];
            k++;
        }

        obj.close();

        for (int i = 0; i < N + M; i++) {
            for (int j = i + 1; j < N + M; j++) {
                if (merge[i] > merge[j]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        for (int i = 0; i < N + M; i++) {
            System.out.print(merge[i]);
        }
    }
}
