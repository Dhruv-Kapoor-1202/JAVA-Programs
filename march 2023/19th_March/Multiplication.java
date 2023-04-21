import java.util.Scanner;

class Multiplication {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		//input
		System.out.println("*** Matrix 1 ***");
		System.out.print("Enter Rows: ");
		int r1 = obj.nextInt();
		System.out.print("Enter Columns: ");
		int c1 = obj.nextInt();

		int arr1[][] = new int[r1][c1];

		System.out.print("Enter 2D Array: ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = obj.nextInt();
			}
		}


		System.out.printl("*** Matrix 2 ***");
		System.out.print("Enter Rows: ");
                int r2 = obj.nextInt();
                System.out.print("Enter Columns: ");
                int c2 = obj.nextInt();

                int arr2[][] = new int[r2][c2];

                System.out.print("Enter 2D Array: ");
                for (int i = 0; i < r2; i++) {
                        for (int j = 0; j < c2; j++) {
                                arr2[i][j] = obj.nextInt();
                        }
                }

		
		//Multiplication

		int row = r1;
		int col = c1;
		int res[][] = new int[row][col];

		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < i; k++) {
					int temp = arr1[i][j] * 	










		System.out.println("The Given Array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}


