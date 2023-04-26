class First {
    public static void main(String args[]) {
        System.out.println("hello");
    }
}

class Second {
    public static void main(String args[]) {
        System.out.println("Java");
    }
}

public class Ques {
    public static void main(String args[]) {

        String ar[] = new String[10];

        First.main(ar);
        Second.main(ar);
        System.out.println("Programming");
    }
}
