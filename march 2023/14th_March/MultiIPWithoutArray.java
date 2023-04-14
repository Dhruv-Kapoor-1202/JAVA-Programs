//Take multiple values from user, and print no of positive, negative and zeros from all the inputs. (Without arrays)


import java.util.Scanner;

class MultiIPWithoutArray {
	public static void main(String args[]) {
		int flag = 1;
		int a = 0;
			
		Scanner obj = new Scanner(System.in);

		int positives = 0;
		int negatives = 0;
		int zeros = 0;

		while (flag == 1) {

			System.out.println("\nEnter 1 to continue");
			System.out.println("Enter 0 to exit");
			int b = obj.nextInt();
			if (b == 0) {
				flag = 0;
			}
			else if (b == 1) {
				System.out.print("\nEnter number: ");	
				a = obj.nextInt();

				if (a > 0) {
					positives++;
				}
				else if (a < 0) {
					negatives++;
				}
				else if (a == 0) {
					zeros++;
				}
				else {
					flag = 0;
				}
			}
		}

		System.out.println("\nPositives: " + positives);
		System.out.println("Negatives: " + negatives);
		System.out.println("Zeros: " + zeros);

	}
}

