import java.util.*;

public class RowSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": Sum = " + sum);
        }

        obj.close();
    }
}
