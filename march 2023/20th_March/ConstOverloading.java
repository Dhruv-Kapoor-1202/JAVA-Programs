import java.util.Scanner;

class Bank {
	int b;
	Bank() {
		b = 100;
	}
	Bank(int b) {
		this.b = b;
	}
}


class ConstOverloading {
	
	public static void display(int b){
		System.out.println(b);
	}

	public static void main(String args[]) {

		Bank obj1 = new Bank();
		Bank obj2 = new Bank(505050);
		
		display(obj1.b);
		display(obj2.b);
	}
}



