public class EPattern {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 != 0) {
                    System.out.print("* ");
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}