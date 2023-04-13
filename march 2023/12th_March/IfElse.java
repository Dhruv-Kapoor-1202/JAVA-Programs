import java.util.Scanner;

class IfElse {

	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = obj.nextInt();

		System.out.print("Enter number 2: ");
		int b = obj.nextInt();

		if (a > b) {
			System.out.println("a is greater.");
		}
		else if (b > a) {
			System.out.println("b is greater.");
		}
		else {
			System.out.println("Both are equal.");
		}

	}

}
