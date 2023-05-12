import java.util.*;
import java.math.*;

class Kid implements Runnable {

    Thread t;
    String input;
    int num = 0;

    Kid(String input, int num) {
        this.input = input;
        this.num = num;
        t = new Thread(this);
        t.start();
    }

    public void run() {

    }
}

public class Ques5 {

    public static void main(String[] args) {
        new Kid("hello", 1);

    }

}
