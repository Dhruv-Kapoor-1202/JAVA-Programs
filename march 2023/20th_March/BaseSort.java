import java.util.Scanner;


class Parent {
	public static int getData() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number: ");
		int IP = obj.nextInt();
		return IP;
	}
	public static int[] intoArray(int IP) {
		int decoy = IP;
		int count = 0;
		while (decoy > 0) {
			int rem = decoy % 10;
			count++;
			decoy = decoy / 10;
		}

		int unArray[] = new int[count];
		
		decoy = IP;
		int k = 0;
		while (decoy > 0) {
			int rem = decoy % 10;
			unArray[k] = rem;
			decoy = decoy / 10;
			k++;
		}
		
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (unArray[i] > unArray[j]) {
					int temp = unArray[i];
					unArray[i] = unArray[j];
					unArray[j] = temp;
				}
			}
		}
		return unArray;
	}
	public static void display(int unArray[]) {
		for (int i:unArray) {
			System.out.print(i);
		}
		System.out.print("\n");
	}

}

class Child extends Parent {
	public static void main(String args[]) {
		Child obj = new Child();
		int IP = obj.getData();
		int result[] = obj.intoArray(IP);
		obj.display(result);
	}
}

