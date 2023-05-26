import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = obj.nextLine();

        Set set = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println("The Output: " + set);

        String output = "";

        Iterator i = set.iterator();

        while (i.hasNext()) {
            output = output + i.next();
        }
        System.out.println(output);
    }
}