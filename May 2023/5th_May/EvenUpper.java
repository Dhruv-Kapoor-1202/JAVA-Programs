import java.util.*;

class EvenUpper {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = obj.nextLine();

        char[] chArr = s1.toCharArray();

        // the toUppercase only works for the string, so to make it work for each
        // character we use the Character class.

        for (int i = 0; i < chArr.length; i++) {
            if (i % 2 != 0) {
                chArr[i] = Character.toUpperCase(chArr[i]);
            } else {
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        }

        String s2 = new String(chArr);

        System.out.println("New String = " + s2);

    }
}