import java.util.Scanner;

class First {
	public int getData() {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int IP = obj.nextInt();
		return IP;
	}
}

class Second extends First {
	int n1 = 0;
	int n2 = 0;

	/*public void display() {
        	n1 = obj2.getData();
        	n2 = obj2.getData();

		System.out.println(n1);
		System.out.println(n2);
	}*/

	public void sum() {
		Second obj2 = new Second();
		n1 = obj2.getData();
		n2 = obj2.getData();

		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
	}
}

class PrimeSum extends Second {

	public static void main(String args[]) {
		PrimeSum obj = new PrimeSum();
		//obj.display();
		obj.sum();
	}

}
