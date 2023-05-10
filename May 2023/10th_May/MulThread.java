class First extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Exit Thread 1");
    }
}

class Sec extends Thread {
    public void run() {
        for (int j = 10; j <= 20; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("Exit Thread 2");
    }
}

class Third extends Thread {
    public void run() {
        for (int k = 100; k <= 110; k++) {
            System.out.println("k = " + k);
        }
        System.out.println("Exit Thread 3");
    }
}

public class MulThread {

    public static void main(String[] args) {
        First f = new First();
        Sec s = new Sec();
        Third t = new Third();

        f.start();
        s.start();
        t.start();

    }

}