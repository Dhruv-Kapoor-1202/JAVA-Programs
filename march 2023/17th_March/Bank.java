// Create a menu driven program to implement a banking login session. The user can create an account or login by giving username and password and he may perform the following actions 
// transfer
// check balance 
// deposit
// withdraw
// or he may logout.



import java.util.Scanner;

class Person {
	public String userName;
	public String password;
	public String confP;
}



class Bank {
	//public static class Person {
	//	public String userName;	
	//	public String password;
	//};

	public static int firstMenu() {
		System.out.println("****Welcome****");
		System.out.println("\nPress the number for the action");
		System.out.println("1 for Create Account");
		System.out.println("2 for Login");
		
		Scanner obj = new Scanner(System.in);
		int login = obj.nextInt();
		return login;
	}
	public static void loginMenu(int login) {
		Scanner sObj = new Scanner(System.in);
		
		Person person = new Person();
			
		if (login == 2) {
			System.out.print("Enter Username: ");
			person.userName = sObj.nextLine();
			
			System.out.print("Enter Password: ");
			person.password = sObj.nextLine();
		}
		else if (login == 1) {
			System.out.print("Enter Username: ");
			person.userName = sObj.nextLine();

			System.out.print("Enter Password: ");
			person.password = sObj.nextLine();

			System.out.print("Confirm Password: ");
			person.confP = sObj.nextline();

			if (person.password != person.confP) {
				System.out.println("***Error***");
			}


		}

		else {
			System.out.print("***Error***");
		}
	}


	public static void main(String args[]) {
		int login = firstMenu();
		loginMenu(login);
	}

}



