import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int x = scanner.nextInt();

        System.out.println(10 * x);
    }
}
