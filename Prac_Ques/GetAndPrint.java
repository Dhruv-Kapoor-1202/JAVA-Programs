import java.util.Scanner;

public class GetAndPrint {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String g = obj.nextLine();
        System.out.println("The String = " + g);

        System.out.print("Enter integer: ");
        int a = obj.nextInt();
        System.out.println("The Integer = " + a);

        System.out.print("Enter float: ");
        float b = obj.nextFloat();
        System.out.println("The Float = " + b);

        System.out.print("Enter double: ");
        double c = obj.nextDouble();
        System.out.println("The Double = " + c);

        System.out.print("Enter long: ");
        long d = obj.nextLong();
        System.out.println("The long = " + d);

        System.out.print("Enter boolean: ");
        boolean e = obj.nextBoolean();
        System.out.println("The Boolean = " + e);

        System.out.print("Enter char: ");
        // char f = obj.nextLine().charAt(0);
        char f;
        f = (char) System.in.read();
        System.out.println("The Character = " + f);

    }
}
