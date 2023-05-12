import java.util.*;

import java.math.*;

class SevenChild implements Runnable {

    int input = 0;
    Thread t;
    String func;

    SevenChild(int input, String func) {
        this.input = input;
        this.func = func;
        t = new Thread(this);
        t.start();
    }

    public void run() {

        // Factorial using BigInteger

        if (func == "Fact") {
            BigInteger fact = new BigInteger(1 + "");
            for (int i = 1; i <= input; i++) {
                fact = fact.multiply(new BigInteger("" + i));
            }
            System.out.println("Factorial : " + fact);
        }

        // =========================================================

        else if (func == "Pal") {
            String s = "" + new StringBuffer("" + input).reverse();

            if (("" + input).equals(s)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

        }

        // =========================================================

        else if (func == "Ascending") {
            String s = "" + input;
            int a[] = new int[s.length()];

            for (int i = 0; i < s.length(); i++) {
                a[i] = Integer.parseInt("" + s.charAt(i));
            }
            Arrays.sort(a);

            String str = "";
            for (int i = 0; i < a.length; i++) {
                str += a[i];
            }
            int x = Integer.parseInt(str);

            System.out.println("Ascending order: " + x);

        }

        // =========================================================

        else if (func == "Descending") {
            String s = "" + input;
            int a[] = new int[s.length()];

            for (int i = 0; i < s.length(); i++) {
                a[i] = Integer.parseInt("" + s.charAt(i));
            }
            Arrays.sort(a);

            String str = "";
            for (int i = a.length - 1; i >= 0; i--) {
                str += a[i];
            }
            int x = Integer.parseInt(str);

            System.out.println("Descending order: " + x);
        }

        // =========================================================

        else if (func == "odd") {
            while (input > 0) {
                if ((input % 10) % 2 != 0) {
                    System.out.print(input % 10 + " ");
                }
                input /= 10;
            }
            System.out.println();

        }

        // =========================================================

        else if (func == "even") {

            while (input > 0) {
                if ((input % 10) % 2 == 0) {
                    System.out.print(input % 10 + " ");
                }
                input /= 10;
            }
            System.out.println();

        }

        else if (func == "prime") {
            // BigInteger x = new BigInteger(input);
            // if (x.isProbablePrime(1))
            // System.out.println("PRIME");
            // else
            // System.out.println("NOT PRIME");
        }

    }
}

public class SevenS {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = obj.nextInt();

        new SevenChild(input, "Fact");
        new SevenChild(input, "Pal");
        new SevenChild(input, "Ascending");
        new SevenChild(input, "Descending");
        new SevenChild(input, "Pal");
        new SevenChild(input, "Pal");
        new SevenChild(input, "Pal");

    }
}
