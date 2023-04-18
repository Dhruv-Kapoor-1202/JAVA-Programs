import java.util.Scanner;

class Cricket {
	public static void main(String args[]) {
		int players[] = new int[11];

		Scanner obj = new Scanner(System.in);

		for (int i = 0; i < 11; i++) {
			System.out.println("Player " + i + ": ");
			players[i] = obj.nextInt();
		}

		for (int i = 0; i < 11; i++) {
			if (players[i] == 50) {
				System.out.println("Half century done.");
			}
			else if (players[i] == 100) {
				System.out.println("Century done.");
			}
			else {
				System.out.println(players[i]);
			}
		
		}
	}
}


