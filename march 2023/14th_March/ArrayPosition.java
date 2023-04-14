// Write a java program to insert the elements into secific position into the given 1D array.

import java.util.Scanner;

class ArrayPosition {
	public static void main(String args[]) {
		System.out.print("Enter the size of the array: ");
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();
		}


		System.out.print("Enter element: ");
		int element = obj.nextInt();
		System.out.print("Enter position: ");
		int position = obj.nextInt();
		

		int newArr[] = new int[size + 1];
		

		System.out.print("New Array; ");
		for (int i = 0; i < size + 1; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}

		
