import java.util.Scanner;

class Transpose {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Rows: ");
		int rows = obj.nextInt();
		System.out.print("Enter Columns: ");
		int cols = obj.nextInt();

		int arr[][] = new int[rows][cols];

		System.out.print("Enter 2D Array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = obj.nextInt();
			}
		}

		System.out.println("Transpose: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.print("\n");
		}
	}
}


