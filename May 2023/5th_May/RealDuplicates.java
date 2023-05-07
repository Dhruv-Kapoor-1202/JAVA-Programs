import java.util.*;

public class RealDuplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = obj.nextLine();

        char chArr[] = str.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            for (int j = i + 1; j < chArr.length; j++) {
                if (chArr[i] == chArr[j]) {
                    System.out.println("yes");
                } else {
                    System.out.println("No");
                }
            }
        }

    }
}
