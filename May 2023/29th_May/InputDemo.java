import java.util.*;

public class InputDemo {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        String[] str = s.split(" ");

        ArrayList<String> al = new ArrayList<>();

        for (String i : str) {
            al.add(i);
        }

        System.out.println(al);
    }
}
