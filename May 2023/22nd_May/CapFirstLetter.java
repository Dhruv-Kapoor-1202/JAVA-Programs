import java.util.Scanner;

public class CapFirstLetter {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = obj.nextLine();

        String arr[] = str.trim().split("\\s");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
