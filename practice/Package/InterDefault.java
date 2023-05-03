/**
 * InnerInterDefault
 */
interface InnerInterDefault {

    default void display() {
        System.out.println("Hello World!!!");
    }
}

public class InterDefault implements InnerInterDefault {
    public static void main(String[] args) {
        InterDefault obj = new InterDefault();
        obj.display();
    }
}
