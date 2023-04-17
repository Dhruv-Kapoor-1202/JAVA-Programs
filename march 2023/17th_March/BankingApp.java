import java.util.Scanner;

class BankDetails {
	String accNo;
	String name;
	long balance;


	Scanner obj = new Scanner(System.in);

	
	public int firstEntry() {
		System.out.println("\n-------- WELCOME -------");
		System.out.println("1. Create Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.print("\nEnter Your Choice: ");
		int ch = obj.nextInt();

		return ch;
	}

	public void loginEntry() {
		System.out.println("sdjfakjga");
	}

	public void openAccount() {
		System.out.print("Enter Account Number: ");
		accNo = obj.next();

		System.out.print("Enter Name: ");
		name = obj.next();

		System.out.print("Enter Balance: ");
		balance = obj.nextLong();
	}

	public void showAccount() {
		System.out.println("Name of Account Holder: " + name);
		System.out.println("Account Number: " + accNo);
		System.out.println("Account Balance: " + balance);
	}

	public void deposit() {
		long amt;

		System.out.print("Enter the amount you want to deposit: ");
		amt = obj.nextLong();
		balance = balance + amt;
	}

	public void widthdraw() {
		long amt;
		
		System.out.println("Current Balance: " + balance);
		System.out.print("Enter the amount you want to withdraw: ");
		amt = obj.nextLong();
		
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		}
		else {
			System.out.println("\n*****Transaction Failed*****");
		}
	}

	public boolean search(String ac_no) {
		if (accNo.equals(ac_no)) {
			showAccount();
			return true;
		}
		return false;
	}
}


public class BankingApp {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		BankDetails acc = new BankDetails();
		int ch = acc.firstEntry();
		System.out.println("Your Choice: " + ch);

		switch (ch) {
			case 1:
				//create 
				acc.openAccount();
				acc.showAccount();
				break;

			case 2:
				//login
				acc.loginEntry();
				break;

			case 3: 
				//exit
				break;
					
		}				
	}
}
























