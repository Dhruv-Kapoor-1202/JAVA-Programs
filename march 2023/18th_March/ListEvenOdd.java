import java.util.Scanner;

class ListEvenOdd {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = obj.nextInt();

		int arr[] = new int[size];
		
		int evenCount = 0;
		int oddCount = 0;

		int j = 0;
		int k = 0;

		int evenArr[] = new int[size];
                int oddArr[] = new int[size];

		System.out.print("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();

			if (arr[i] % 2 == 0) {
				evenCount++;
				evenArr[j] = arr[i];
				j++;
			}
			else {
				oddCount++;
				oddArr[k] = arr[i];
				k++;
			}
		}
		
		System.out.print("\nEven List: ");
		for (int i = 0; i < evenCount; i++) {
			System.out.print(evenArr[i] + " ");
		}

		System.out.print("\nOdd List: ");
		for (int i = 0; i < oddCount; i++) {
			System.out.print(oddArr[i] + " ");
		}

		System.out.println("\n");
	}
}


		
