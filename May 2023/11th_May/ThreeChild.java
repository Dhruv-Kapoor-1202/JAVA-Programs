import java.util.*;

class One implements Runnable {

    Thread t;
    String input;

    One(String input) {
        this.input = input;
        t = new Thread(this);
        t.start();
    }

    public void run() {

    }
}

class Two implements Runnable {

    Thread t;
    String input;

    Two(String input) {
        this.input = input;
        t = new Thread(this);
        t.start();
    }

    public void run() {

    }
}

class Three implements Runnable {

    Thread t;
    String input;

    Three(String input) {
        this.input = input;
        t = new Thread(this);
        t.start();
    }

    public void run() {

        char charArray[] = input.toCharArray();
        Arrays.sort(charArray);
        String str = new String(charArray);
        StringBuffer rev = new StringBuffer(str);
        System.out.println(rev.reverse());

    }
}

public class ThreeChild {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = obj.nextLine();

        new Three(input);
    }

}
