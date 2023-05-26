interface First<T> {
    public void display(T obj);
}

public class GenInterface implements First<Integer> {

    public void display(Integer x) {
        System.out.println(x);
    }

    public void display(String str) {
        System.out.println(str);
    }

    public static void main(String args[]) {
        new GenInterface().display(45);
        new GenInterface().display("Hello Java");
    }

}
