import java.util.*;

class First {
	int n1 = 0;
	int n2 = 0;

	public void getIP() {
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
	}

}

class Second extends First {
	public int[] logic() {
		Second obj = new Second();
		obj.getIP();
		int a[] = new int[20];

		for (int i=n1; i<=n2; i++) {
			int flag = 0;
			int k = 0;
			for (int j=2; j<=i/2; j++) {
				if (i%j==0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				a[k] = i;
				k++;
			}
		}
		return a;
	}

	public int sum() {
		Second obj1 = new Second();
		int b[] = obj1.logic();
		int sum = 0;
		for (int i = 0; i<b.length; i++) {
			sum = sum + b[i];
		}
		return sum;
	}

	public int even() {
		Second obj3 = new Second();
		int n = obj.sum();
		int even = 0;

		while(n/10!=0) {
			if ( (n%10)%2==0) {
				even++;
			}
			n=n/10;
		}
		return even;
}

class Third extends Second {
	public void display(int even) {
		System.out.println(even);
	}

	public static void main(String[] args) {
		Third obj = new Third();
		int even = obj.even();
		obj.display(even);
	}
}

