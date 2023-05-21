import java.util.*;

public class ReverseEachWord {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = obj.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            StringBuffer rev = new StringBuffer(arr[i]).reverse();
            System.out.println(arr[i] + " : " + rev);
        }
    }

}