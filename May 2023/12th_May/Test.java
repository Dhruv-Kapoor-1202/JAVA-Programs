
class ABC extends Thread implements Runnable {

    Thread t;

    ABC() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}

public class Test {
    public static void main(String[] args) {
        ABC t = new ABC();
        t.start();
    }
}
