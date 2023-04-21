
//Callng same method with different parrameters or with different types of parameters list.

import java.util.Scanner;


class MethodOverloading {
	public static double area(double radius) {
		return 3.14 * radius * radius;
	}

	public static int area(int length, int breadth) {
		return length * breadth;
	}

	public static int area(int side) {
		return side * side;
	}

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);	
	

		double radius;
		int length;
		int breadth;
		int side;


		System.out.print("Enter the radius: ");
		radius = obj.nextDouble();

		System.out.print("Enter length: ");
		length = obj.nextInt();

		System.out.print("Enter breadth: ");
		breadth = obj.nextInt();

		System.out.print("Enter Side: ");
		side = obj.nextInt();

		double areaCircle = area(radius);
		int areaRect = area(length, breadth);
		int areaSq = area(side);

		System.out.println("Area of Circle: " + areaCircle);
		System.out.println("Area of Rectangle: " + areaRect);
		System.out.println("Area of Square " + areaSq);
	}
}



