import java.util.Scanner;
import java.util.Arrays;

public class zad2_3 {

    public static int[] sumArrays(int[] array1, int[] array2)
    {
        if (array1.length == array2.length)
        {
            int[] finalArray = new int[array1.length];

            for(int i=0;i<array1.length;i++){
                finalArray[i] = array1[i] + array2[i];
            }
            return finalArray;
        }
        
        else
        {
            System.out.println("Your tables have diffrent size!");
            int[] finalArray = {};
            return finalArray;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter table 1 size:");
        int size1 = scanner.nextInt();
        
        System.out.println("Enter table 2 size:");
        int size2 = scanner.nextInt();
        
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        
        
        for (int i=0; i<array1.length && i<array2.length; i++)
        {
            array1[i] = (int)(Math.random()*10);
            array2[i] = (int)(Math.random()*10);
        }
        
        System.out.println("First table: " + Arrays.toString(array1));
        System.out.println("Second table: " + Arrays.toString(array2));
        System.out.print("Summed tables: " + Arrays.toString(sumArrays(array1, array2)));
    }
}
    





