import java.util.Scanner;

class Base {
    public int[] getData() {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = obj.nextInt();

        int array[] = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = obj.nextInt();
        }
        return array;
    }
}

class Child extends Base {
    public void getPrime() {
        Child obj = new Child();
        int array[] = obj.getData();

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }
            System.out.println("The Element: " + array[i] + " ---> " + "The Sum: " + sum);
        }
    }
}

public class First {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.getPrime();
    }
}
