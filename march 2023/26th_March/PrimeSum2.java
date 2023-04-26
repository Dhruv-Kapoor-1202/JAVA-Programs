import java.util.Scanner;

class First {
    int data = 0;

    public int getData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number: ");
        data = obj.nextInt();
        return data;
    }
}

class PrimeSum2 extends First {
    public static void main(String args[]) {
        PrimeSum2 obj = new PrimeSum2();
        System.out.println(obj.data);

    }
}