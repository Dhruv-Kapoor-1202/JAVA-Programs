import java.io.File;

public class FileDemo {
    public static void main(String args[]) {
        File obj = new File("abc.txt");
        System.out.println("Exists: " + obj.exists());
        System.out.println("Name: " + obj.getName());
        System.out.println("path: " + obj.getPath());
        System.out.println("Absolute Path: " + obj.getAbsolutePath());
        System.out.println("File: " + obj.isFile());
        System.out.println("Directory: " + obj.isDirectory());
        System.out.println("Read: " + obj.canRead());
        System.out.println("Write: " + obj.canWrite());

    }
}