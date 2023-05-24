public class MulInput<T> {
    T x;
    T z;

    MulInput(T y, T z) {
        x = y;
        this.z = z;
    }

    public void fact() {
        String str = x.toString();
        String str1 = z.toString();
        System.out.println(str);
        System.out.println(str1);
        String str2 = "";
        for (char c : str.toCharArray()) {
            if (str1.contains(String.valueOf(c)) == false) {
                str2 += c;
            }
        }
        for (char c : str1.toCharArray()) {
            if (str.contains(String.valueOf(c)) == false) {
                str2 += c;
            }
        }
        int a = 0;
        System.out.println(str2);
        for (char c : str2.toCharArray()) {
            a += (int) c;
        }
        int i = 0;
        while (a > 0) {
            i += (a % 10) * (a % 10);
            a /= 10;
        }
        System.out.println(i);

    }

    public static void main(String[] args) {
        MulInput<String> str = new MulInput<String>("abc", "abde");
        MulInput<Integer> str1 = new MulInput<Integer>(124, 1267);
        str.fact();
        str1.fact();
    }

}

// import java.util.*;

// public class MulInput<T> {
// public static void main(String args[]) {
// Scanner obj = new Scanner(System.in);

// System.out.print("Enter string 1: ");
// String s1 = obj.nextLine();

// System.out.print("Enter string 2: ");
// String s2 = obj.nextLine();

// int len1 = s1.length();
// int len2 = s2.length();

// if (s1.contains(s2) || s2.contains(s1)) {
// System.out.println("The strings are same");
// return;
// }

// for (int i = 0; i < len1; i++) {
// for (int j = 0; j < len2; j++) {
// if (s1.charAt(i) == s2.charAt(j)) {
// break;
// // System.out.println(s1.charAt(i) + " " + s2.charAt(j));
// } else {
// System.out.println(s1.charAt(i) + " " + s2.charAt(j));
// }
// }
// }

// // s1.compareTo(s2)
// }
// }
