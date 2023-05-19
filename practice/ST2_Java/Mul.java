import java.util.*;

class Child implements Runnable {

    Thread t;
    String str;

    Child(String str) {
        this.str = str;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int num = Integer.parseInt(str);
        System.out.println("The given string is : " + num);
    }
}

public class Mul {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        String str = obj.nextLine();

        new Child(str);

    }
}