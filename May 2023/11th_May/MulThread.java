class First extends Thread {
    public void run() {
        // try {
        // Thread.sleep(1000);
        // } catch (Exception e) {
        // }
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Exit Thread 1");
    }
}

class Sec extends Thread {
    public void run() {
        // try {
        // Thread.sleep(2000);
        // } catch (Exception e) {
        // }
        for (int j = 10; j <= 20; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("Exit Thread 2");
    }
}

class Third extends Thread {
    public void run() {
        // try {
        // Thread.sleep(4000);
        // } catch (Exception e) {
        // }
        for (int k = 100; k <= 110; k++) {
            System.out.println("k = " + k);
        }
        System.out.println("Exit Thread 3");
    }
}

public class MulThread {

    public static void main(String[] args) throws Exception {
        First f = new First();
        Sec s = new Sec();
        Third t = new Third();

        f.start();
        s.start();
        t.start();

        System.out.println("Hello");

    }

}