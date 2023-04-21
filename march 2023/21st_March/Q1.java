import java.util.Scanner;

class Base {
	int n = 0;
	public void getdata(){
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	}
}

class Bassy extends Base {
	public int getsum(){
		int sum = 0;
		while(n/10>0)
		{
			sum = sum + n%10;
			n=n/10;
		}
		sum = sum + n;

		return sum;
	}
}

class Basiest extends Bassy {
	public static void main(String[] args){
		Basiest b = new Basiest();
		b.getdata();
		int sum = b.getsum();
		System.out.println(sum);
	}
}
