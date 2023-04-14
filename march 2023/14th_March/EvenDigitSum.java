import java.util.Scanner;

class EvenDigitSum {
	public static int getData() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Input: ");
		int input = obj.nextInt();
		return input;
	}
	public static int logic(int input) {
		int sum = 0;
		while (input > 0) {
			int digit = input % 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}
			input = input / 10;
		}
		return sum;
	}

	public static void display(int result) {
		System.out.println("Output (Sum of even digits): " + result);
	}

	public static void main(String args[]) {
		int a = getData();
		int sum = logic(a);
		display(sum);
	}
}
