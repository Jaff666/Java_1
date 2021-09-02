import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class zad1_8 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a =  scanner.nextInt();
        int b =  scanner.nextInt();
        int c =  scanner.nextInt();
        Integer[] arr = {a,b,c};
        Arrays.sort(arr, Collections.reverseOrder()); 
  
        System.out.printf("Sorted numbers: %s", 
                          Arrays.toString(arr)); 
    }
}
