import java.util.*;

abstract class Base {
	abstract public void display();
	public void display1()
	{
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	public void display() {
		System.out.println("Derived Class");
	}

	public static void main(String args[]) {
		Base obj = new Derived();

		obj.display1();
		obj.display();
	}

}
