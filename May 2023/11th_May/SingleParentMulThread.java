
class NewThread implements Runnable {

    Thread t;
    String name;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": Child = " + i);
        }
        System.out.println("Exit Child: " + name);
    }
}

public class SingleParentMulThread {
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        new NewThread("four");
        new NewThread("five");
    }

}