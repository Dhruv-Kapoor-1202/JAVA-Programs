import java.util.*;

public class IsRotated {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str = obj.nextLine();

        System.out.print("Enter String 2: ");
        String rotatedStr = obj.nextLine();

        if (isRotated(str, rotatedStr)) {
            System.out.println("Yes, it is the rotated string");
        } else {
            System.out.println("Not a rotated string!");
        }

    }

    public static boolean isRotated(String str, String rotatedStr) {
        if (str == null || rotatedStr == null) {
            return false;
        } else if (str.length() != rotatedStr.length()) {
            return false;
        } else {
            String bigStr = str + str;
            return bigStr.contains(rotatedStr);
        }
    }
}
