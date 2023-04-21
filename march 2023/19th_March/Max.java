import java.util.Scanner;

public class Max {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);

		int arr[] = new int[5];

		int k = Integer.MIN_VALUE;

		System.out.print("Enter elements: ");
		for (int i = 0; i < 5; i++) {
			arr[i] = obj.nextInt();
		}

	



		for (int i = 0; i < 5; i++) {
			if (arr[i] >= k) {
				k = arr[i];
			}
		}

		System.out.print("Max: " + k);
	}
}
