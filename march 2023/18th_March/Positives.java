import java.util.Scanner;

class Positives {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = obj.nextInt();

		int arr[] = new int[size];
		
		int count = 0;
		System.out.print("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();

			if (arr[i] > 0) {
				count++;
			}

		}

		System.out.println("Positives count: " + count);

	}
}


		
