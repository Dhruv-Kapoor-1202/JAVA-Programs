import java.util.Scanner;

class Prime {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();

		int count = 0;
		for (int i = 1; i <= number / 2; i++) {

			if (number % i == 0) {

				count++;
			
			}
		}

		if (count > 2) {

			System.out.println("The number: " + number + ", is Non-Prime.");
		
		}
		else {

			System.out.println("The number: " + number + ", is Prime.");
		
		}

	}

}

