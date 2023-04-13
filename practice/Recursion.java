import java.util.Scanner;

class Recursion {
	public int getData() {
		System.out.print("Enter number: ");
		Scanner obj = new Scanner(System.in);
		int IP = obj.nextInt();
		return IP;
	}

	public static void logic(int a) {
		if (a >= 1) {
			System.out.println("The number : " + a);
			logic(a - 1);
		}
	}

	public static void main(String args[]) {
		Recursion obj = new Recursion();

		int a = obj.getData();
		
		System.out.println("*****");
		logic(a);
	}
}


