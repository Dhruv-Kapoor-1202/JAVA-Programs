import java.util.Scanner;

class CharIP {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter the elements: ");
		String str = new Scanner(System.in).nextLine();
		char ch[] = str.toCharArray();
		System.out.println("Given char array is: ");
		for (char c:ch) {
			System.out.print(c);
		}
		System.out.print("\n");
	}
}

