import java.util.Scanner;

class EvenOdd {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = obj.nextInt();

		int arr[] = new int[size];
		
		int evenCount = 0;
		int oddCount = 0;

		System.out.print("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();

			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}


		}

		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
	}
}


		
