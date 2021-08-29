public class zad2_5 {
    public static  int convertMatrix(int[][] array1, int[][] array2)
    {
        int sum = 0;
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array1[i].length;j++)
            {
                sum = sum + array1[i][j];
                sum = sum + array2[i][j];
            }
    
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int [][] array1 = new int [3][3];
        int [][] array2 = new int [3][3];

        for (int i=0; i<array1.length && i<array2.length; i++){
            for (int j=0; j<array1[0].length && j < array2[0].length; j++){
                array1[i][j] = (int)(Math.random()*10);
                array2[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) 
            {
                System.out.print(array1[i][j] + " ");	
			}
			System.out.println();
		}

        System.out.println(" ");

        for(int i = 0; i < array2.length; i++) {

			for(int j = 0; j < array2[i].length; j++) 
            {
				System.out.print( array2[i][j] + " ");
			}
			System.out.println();
		}   
        System.out.println("\n" + "Sum of matrixs: " + convertMatrix(array1,array2));
    }    
}        
        
        
    







