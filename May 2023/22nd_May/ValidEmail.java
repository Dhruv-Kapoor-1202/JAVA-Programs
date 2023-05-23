import java.util.*;

public class ValidEmail {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter email: ");
        String s = obj.nextLine();

        String str = s.trim();

        String atTheRate = "@";
        String topDomain = ".com";
        System.out.println(str.contains(atTheRate + topDomain));
    }
}
