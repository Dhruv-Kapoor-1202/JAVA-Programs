import java.util.Scanner;

class SumEvenOdd {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = obj.nextInt();

		int arr[] = new int[size];
		
		int evenSum = 0;
		int oddSum = 0;

		System.out.print("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();

			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i];
			}
			else {
				oddSum = oddSum + arr[i];
			}


		}

		System.out.println("Even Sum: " + evenSum);
		System.out.println("Odd Sum: " + oddSum);
	}
}


		
