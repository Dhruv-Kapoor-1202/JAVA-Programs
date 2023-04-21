import java.util.Scanner;

class Search {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int row = obj.nextInt();

		System.out.print("Enter columns: ");
		int col = obj.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (in j = 0; j < col; j++) {
				arr[i][j] = obj.nextInt();
			}
		}
		
		System.out.print("Enter element: ");
		int element = obj.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == element) {
					System.out.print

