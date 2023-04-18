import java.util.Scanner;

class PosAndNeg {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = obj.nextInt();

		int arr[] = new int[size];

		int posArr[] = new int[size];
		int negArr[] = new int[size];
		int zeroArr[] = new int[size];
		
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		System.out.print("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();

			if (arr[i] > 0) {
				posCount++;
				posArr[i] = arr[i];
			}
			else if (arr[i] < 0) {
				negCount++;
				negArr[i] = arr[i];
			}
			else {
				zeroCount++;
				zeroArr[i] = arr[i];
			}

		}

		System.out.println("\nPositives count: " + posCount);
		System.out.print("The Positives: ");
		for (int i = 0; i < size; i++) {
			System.out.print(posArr[i] + " ");
		}

		System.out.println("\nNegatives count: " + negCount);
		System.out.print("The Negatives: ");
		for (int i = 0; i < size; i++) {
                        System.out.print(negArr[i] + " ");
                }

		System.out.println("\nZeros count: " + zeroCount);
		System.out.print("The Zeros: ");
		for (int i = 0; i < size; i++) {
                        System.out.print(zeroArr[i] + " ");
                }
	}
}


		
