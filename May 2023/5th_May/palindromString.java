import java.util.*;

public class palindromString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s1 = obj.nextLine();

        StringBuffer rev = new StringBuffer(s1);
        rev.reverse();

        if (s1.equals(rev.toString())) {
            System.out.println("YES!! Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
