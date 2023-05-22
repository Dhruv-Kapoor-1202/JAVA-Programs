import java.util.*;

class Printer<T> {
    T thingToPrint;

    Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

public class Next {
    public static void main(String args[]) {

        Printer<Integer> obj = new Printer<>(23);
        Printer<String> StringPrinter = new Printer<>("Helloooooo how are you?");

        obj.print();
        StringPrinter.print();
    }
}
