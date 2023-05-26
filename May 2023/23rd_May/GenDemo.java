import java.util.*;

public class GenDemo<T> {
    T obj;

    GenDemo(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println("The given thing: " + obj);
    }

    public static void main(String args[]) {
        // Scanner obj = new Scanner(System.in);

        // System.out.print("Enter a boolean: ");
        // boolean bool = obj.nextBoolean();

        Integer n = 10;
        Integer n2 = 20;
        Integer n3 = n + n2;

        System.out.println(n3);

        // GenDemo<Boolean> obj1 = new GenDemo<Boolean>(bool);

        // GenDemo<Character> obj2 = new GenDemo<Character>('C');

        // obj1.display();
        // obj2.display();

        // obj.close();

    }
}