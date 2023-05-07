import java.util.*;

// reversing each word in the given string

public class Duplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = obj.nextLine();

        String strArr[] = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = new StringBuffer(strArr[i]).reverse().toString();
            System.out.print(strArr[i] + " ");
        }
    }

}
