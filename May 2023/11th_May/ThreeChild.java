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
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.print("Removing Vowel : ");

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o'
                    && input.charAt(i) != 'u') {
                System.out.print(input.charAt(i));
            }
        }

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

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Descending: ");

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

        new One(input);

        new Three(input);
    }

}
