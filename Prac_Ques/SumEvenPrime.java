import java.util.*;

public class SumEvenPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n1 = obj.nextInt();
        int n2 = obj.nextInt();

        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            int primeCount = 0;
            int prime = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.print(i + " + ");
                sum = sum + i;
            }
        }
        System.out.println("\nThe sum = " + sum + "\n");

    }
}
