package tables;

public class main {
    public static void main(String[] args) {
        
        int[] number1 = { 11, 22, 33, 44, 55 };
        int[] number2 = { 66, 77, 88, 99, 101 };
        System.out.println("Sum of arrays: " + twoArrays(number1, number2));
    }

    private static int twoArrays(int[]... numbers) {
        int summary = 0;
        for (int[] array : numbers) {
            for (int i : array) {
                summary = summary + i;
            }
        }
        return summary;
    }
}

