import java.util.*;

public class NumberOfWords {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = obj.nextLine();
        String[] arr = str.trim().split(" ");

        System.out.println("The number of words = " + arr.length);
    }
}
