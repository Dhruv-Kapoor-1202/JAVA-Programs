import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{	
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int x = obj.nextInt();

		System.out.print("Enter 2nd number: ");
		int y = obj.nextInt();
		
		System.out.print("Enter 3rd number: ");	
		int z = obj.nextInt();

		int greatest;

		if (x > y && x > z)
		{
			System.out.println("X: "+x+" is the greatest");
			greatest = x;	
		}	
		else if (y > x && y > z)
		{
			System.out.println("Y: "+y+" is the greatest");
			greatest = y;
		}	
		else
		{
			System.out.println("Z: "+z+" is the greatest");
			greatest = z;
		}
		
		int sum = 0;	
		
		while (greatest > 0)
		{
			int rem = greatest % 10;
			sum = sum + rem;
			greatest = greatest / 10;
		}
		
		System.out.println("The sum of the greatest: "+sum);
		
		int count = 0;
		
		for (int i = 1; i <= sum / 2; i++)
		{
			if (sum % i == 0)
			{
				count++;	
			}
		}	
		
		if (count > 2)
		{
			System.out.println("Non-Prime!");
		}
		else 
		{
			System.out.println("Prime!");
		}
	}
}