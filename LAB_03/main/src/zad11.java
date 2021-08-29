import java.util.Scanner;
import java.util.Arrays;

public class zad11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter table size:");
    int size = scanner.nextInt();
    System.out.println("Enter first number:");
    int first = scanner.nextInt();
    int[] array = new int[size];
    
    
    int index=1;
    array[0]=first;
    while (index<size){
        first++;
        if (first%2==0){
            array[index]=first;
            index++;
        }
    }
    System.out.println(Arrays.toString(array));
    //int min = min(array);
    //System.out.println(min);
    //int sum = sum(array);
    //System.out.println(sum);
    //double avg = avg(array);
    //System.out.println(avg);
    //double median = med(array);
    //System.out.println(median);
    System.out.println(String.format("Min: %d", min(array)));
    System.out.println(String.format("Sum: %d", sum(array)));
    System.out.println(String.format("Avg: %.1f", avg(array)));
    System.out.println(String.format("Min: %.2f", med(array)));
  }

private static double med(int[] array) {
    Arrays.sort(array);
    if (array.length%2==0){
        return (array[array.length/2]+array[array.length/2-1])/2.0;
    }else {
        return array[array.length/2];
    }
}

private static double avg(int[] array) {
    return sum(array)/(double)array.length;
}

private static int sum(int[] array) {
    int sum = 0;
    for (int i=0; i<array.length; i++){
        sum = sum+array[i];
    }
    return sum;
}

private static int min(int[] array) {
   int min = array[0];
    for (int i=1; i<array.length; i++){
        if (array[i]<min){
            min = array[i];
        }
    }
    return min;
}  
}
