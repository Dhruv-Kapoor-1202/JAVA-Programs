import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number: ");
		long n = obj.nextLong();
		
		long fact = 1L;

		while (n > 0) {
			fact = fact * n;
			n = n - 1;
		}

		System.out.println("The factorial: " + fact);
	}
}

