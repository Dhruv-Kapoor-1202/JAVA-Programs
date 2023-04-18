import java.util.*;

class Table 
{
	public static void main(String args[])
	{	
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = obj.nextInt();
	
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(x+" x "+i+" = "+(x*i));
		}
	}
}