import java.util.*;

class ChildIP implements Runnable {

    Thread t;
    String IP;

    ChildIP(String IP) {
        this.IP = IP;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        String[] strArr = IP.split(".");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        System.out.println("HI");

    }
}

public class ValidIp {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String IP = obj.nextLine();

        new ChildIP(IP);
    }

}
