import java.util.Scanner;

class Power {
	static int a, b;
	public int getData() {
		System.out.print("Enter number: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();

		return x;
	}

	public int logic(int x, int y) {
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			result = result * x;
		}

		return result;
	}

	public void display(int result) {
		System.out.println("The result = " + result);
	}

	public static void main(String args[]) {

		Power obj = new Power();

		a = obj.getData();
		b = obj.getData();

		int result = obj.logic(a, b);

		obj.display(result);
	}
}


