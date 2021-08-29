public class zad12 {
    public static void main(String[] args) {
        int [] [] array = new int [3][3];
        int counter = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                array[i][j] = counter;
                counter++;
            }
        }
      display(array);  
}

    private static void display(int[][] array) {
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
