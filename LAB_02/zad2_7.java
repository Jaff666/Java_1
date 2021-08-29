import java.util.Arrays;

public class zad2_7 {

	public static int positiveNumbers(int[] array)
	{
		int sum = 0;
        for(int i=0;i<array.length;i++)
		{
            if(array[i] > 0)
			{
                sum = sum + array[i];
            }
        }
        return sum;
    }
	public static void main(String[] args) {

		int[] array = {-1,5,-2,3,-10,15}; 
		
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Sum of positive numbers: " + positiveNumbers(array));
	} 
} 
