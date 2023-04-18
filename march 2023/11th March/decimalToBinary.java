import java.util.Scanner;

class Bin
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int x = obj.nextInt();
	
		int bno = 0;
		int base = 1;
		int rem;		
	
		
		while (x > 0)
		{
			rem = bno % 2;
			bno = bno + rem * base;
			base = base * 10;
			x = x / 10;
		}
		
		System.out.println("Binary Number: "+bno);
	}
}
			