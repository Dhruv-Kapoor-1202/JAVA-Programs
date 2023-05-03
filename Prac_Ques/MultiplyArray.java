import java.util.Scanner;

public class MultiplyArray {
    public int[][] multiplyArray() {
        Scanner obj = new Scanner(System.in);

        // Matrix 1
        System.out.print("Enter number of rows: ");
        int row1 = obj.nextInt();

        System.out.print("Enter number of columns: ");
        int col1 = obj.nextInt();

        int arr1[][] = new int[row1][col1];
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = obj.nextInt();
            }
        }

        // Matrix 2
        System.out.print("Enter number of rows: ");
        int row2 = obj.nextInt();

        System.out.print("Enter number of columns: ");
        int col2 = obj.nextInt();

        int arr2[][] = new int[row2][col2];
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = obj.nextInt();
            }
        }

        // Multiplication

        int arr3[][] = new int[row1][col1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        return arr3;
    }

    public static void main(String[] args) {
        MultiplyArray obj = new MultiplyArray();

        int arr[][] = obj.multiplyArray();
    }

}
