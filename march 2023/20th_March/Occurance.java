import java.util.Scanner;

class Base {
	public static int getData() {
		Scanner obj = new Scanner(System.in);
		int IP = obj.nextInt();
		return IP;
	}

	public static int[] intoArray(int IP) {
		int count = 0;
		int decoy = IP;

		while (decoy > 0) {

