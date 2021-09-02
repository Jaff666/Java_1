import java.util.Scanner;
import java.util.Arrays;

public class zad2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter table size:");
        int size = scanner.nextInt();
        String[] array = new String[size];
        System.out.println("Enter all the elements:");
        
        
        
        for(int i = 0; i < size; i++)

        {
            array[i] = scanner.next();
        }
        System.out.println("Your table: " + Arrays.toString(array));
        
    }

}        
