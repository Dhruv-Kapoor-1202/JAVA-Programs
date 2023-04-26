import java.util.*;

public class GreatestDec {
    public static void main(String[] args) {

        int a[] = new int[30];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[10];
        Arrays.fill(b, 0);

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int i = 0;
        int k = 0;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    b[k]++;
                } else {
                    k++;
                    i = j;
                }
            }
        }

        int max1 = b[0];

        System.out.println(k);
        for (int x = 1; x < b.length; x++) {
            if (max1 < b[x]) {
                max1 = b[x];
            }
        }
        System.out.println(max1);
    }
}
