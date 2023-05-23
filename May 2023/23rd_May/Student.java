import java.util.*;

public class Student<T> {
    T obj;

    Student(T obj) {
        this.obj = obj;
    }

    public String logic() {
        String output = "" + new StringBuffer("" + obj).reverse();
        System.out.println("Output : " + output);
        return output;

    }

    // Generic Method
    public void logic(T x) {
        String output = "" + new StringBuffer("" + x).reverse();
        System.out.println("Output: " + output);
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = obj.nextLine();

        System.out.print("Enter roll number: ");
        int roll = obj.nextInt();

        Student<String> obj1 = new Student<String>(name);
        Student<Integer> obj2 = new Student<Integer>(roll);

        String st = obj1.logic();
        obj2.logic();

        obj1.logic(st); // Generic Method

    }
}
