import java.util.Scanner;

public class zad1_2 {
    public static void main(String[] args)  {
        System.out.println("Welcome in degress conventor");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius degrees:");
        int x = scanner.nextInt();
        double y = (x*1.8)+32;
        System.out.println("Farenheit degrees:" + y);
    }
}

