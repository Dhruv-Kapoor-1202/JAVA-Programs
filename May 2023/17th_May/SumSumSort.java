import java.util.*;

class Child implements Runnable {

    String name;
    int rollNo = 0;
    Thread t;

    Child(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        char[] nameArr = name.toCharArray();
        int result = 0;

        while (rollNo > 0) {
            result = result + rollNo % 10;
            rollNo = rollNo / 10;
        }

        for (int i = 0; i < nameArr.length; i++) {
            int sum = 0;

            int num = (int) nameArr[i];

            result = result + SumSumSort.getSum(num);

        }

        System.out.println(result);
    }
}

class SumSumSort {

    public static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        if (sum > 9) {
            return getSum(sum);
        } else {
            return sum;
        }

    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = obj.nextLine();

        System.out.print("Enter roll number : ");
        int rollNo = obj.nextInt();

        new Child(name, rollNo);

    }

}