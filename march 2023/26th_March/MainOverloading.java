public class MainOverloading {
    public void main() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        MainOverloading obj = new MainOverloading();
        String ar[] = { " " };
        obj.main();
    }

}
