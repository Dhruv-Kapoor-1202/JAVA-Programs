// Input a number N (Even number of digits) fom user, divide the number in two halves and sort the first half in ascending order and the second half in descending order and print the resulting number.


import java.util.Scanner;

class HalfAndHalf {
	public static int getData() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Input: ");
		int input = obj.nextInt();

		return input;
	}
	public static int checkEven(int number) {
		int count = 0;
		int isEven = 0;
		while (number > 0) {
			int digit = number % 10;
			count++;
			number = number / 10;
		}
		if (count % 2 == 0) {
			return isEven;
		}
		else {
			isEven = 1;
			System.out.println("Enter A Valid Number!!!");
			return isEven;
		}
	}
	public static void main(String args[]) {
		int a = getData();
		int b = checkEven(a);
		System.out.println(b);

		System.out.println("Hiiii");

	}
}




