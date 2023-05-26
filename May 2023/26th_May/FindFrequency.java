import java.util.*;

public class FindFrequency {
    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = obj.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        while (num > 0) {
            al.add(num % 10);
            num = num / 10;
        }

        System.out.print("Enter search digit: ");
        int search = obj.nextInt();

        int f = Collections.frequency(al, search);

        System.out.println("Frequency of " + search + " = " + f);

    }
}
