import java.util.Scanner;

class ArrayInput {
	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		
		//input array size
		int size = obj.nextInt();
		
		int arr[] = new int[size];

		//input array elements
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = obj.nextInt();
			System.out.print("\n");
		}

		//display
		System.out.print("Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
}



