import java.util.*;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = obj.nextLine();

        String strArr[] = str.split(" ");

        System.out.println("Number of words in the string: " + strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

    }
}
