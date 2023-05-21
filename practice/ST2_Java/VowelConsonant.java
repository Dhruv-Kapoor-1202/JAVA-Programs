import java.util.*;

public class VowelConsonant {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = obj.nextLine();

        countVowel(str);

    }

    private static void countVowel(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowel count = " + vowelCount);
        System.out.println("Consonant count = " + consonantCount);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

}
