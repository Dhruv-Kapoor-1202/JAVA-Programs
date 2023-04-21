// Calling same constructor with different parameter


import java.util.Scanner;

class Bank {
	int b;

	Bank() {
		b = 800;
	}
	Bank(int b) {
		this.b = b;
	}
}


class ConstructorOverloading {
	public static void main(String args[]) {

		Bank obj1 = new Bank();
		Bank obj2 = new Bank(100000);

		System.out.println(obj1.b);
		System.out.println(obj2.b);
	}
}



