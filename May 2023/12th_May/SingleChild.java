import java.util.*;

class Child implements Runnable {

    String input;
    Thread t;

    Child(String input) {
        this.input = input;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        System.out.println("I am working into child thread " + input + ".");
    }
}

public class SingleChild {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter First Thread's name: ");
        String one = obj.nextLine();

        System.out.print("Enter Second Thread's name: ");
        String two = obj.nextLine();

        System.out.print("enter third Thread's name: ");
        String three = obj.nextLine();

        new Child(one);
        new Child(two);
        new Child(three);
    }

}