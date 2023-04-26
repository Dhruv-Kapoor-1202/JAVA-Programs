import java.util.Scanner;

class Base {
	int row = 0;
	int col = 0;
	public int[][] getArray() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter rows: ");
		row = obj.nextInt();

		System.out.print("Enter Columns: ");
		col = obj.nextInt();

		int arr[][] = new int[row][col];


		System.out.print("Enter elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = obj.nextInt();
			}
		}
		return arr;
	}
}

class Child extends Base {
	public int getSum() {
		Child obj = new Child();
		int arr[][] = obj.getArray();
		int sum = 0;
		
		for (int i = 0; i < obj.row; i++) {
			sum = sum + arr[0][i];
		}

		for (int i = 1; i < obj.row; i++) {
			sum = sum + arr[i][0];
		}

		return sum;
	}
}

class DSum extends Child {
	public void display(int sum) {
		System.out.println("Sum: " + sum);
	}

	public static void main(String args[]) {
		DSum obj = new DSum();
		
		int sum = obj.getSum();
		obj.display(sum);
	}
}
