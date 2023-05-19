import java.util.*;

class Pronounce {

    public static void checkPronounce(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u') {
                count++;
            } else {
                count = 0;
            }
            if (count >= 4) {
                System.out.println("No!!! Not easy to pronounce!!!!");
                return;
            }
        }
        System.out.println("Yes!!!");
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = obj.nextLine();

        checkPronounce(str);
    }
}