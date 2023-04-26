import java.util.Scanner;

class Base {
	public int[] getArray() {
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = s.nextInt();  //no. of elements
		
		System.out.print("Enter elements: ");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}

		return a;
	}
}

class Child extends Base {
	public int[] logic(){
		Child obj = new Child();
		int b[]=obj.getArray();
		
		for(int i=0; i<b.length; i++)
		{
			int sum =0;
			while(b[i]/10>0)
			{
				sum = sum + b[i]%10;
				b[i]/=10;
			}
			sum = sum + b[i];
			b[i] = sum;
		}
	
		return b;
	}

}

class SumOfSums extends Child {
	public void display(int sum){
		System.out.println("Sum: " + sum);
	}

	public static void main(String args[]){
		SumOfSums obj1 = new SumOfSums();
		int c[] = obj1.logic();
		int sum1 =0;
		for(int i=0; i<c.length;i++)
		{
			sum1 = sum1 + c[i];
		}
		obj1.display(sum1);
	}
}



