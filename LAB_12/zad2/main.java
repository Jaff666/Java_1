package zad2;

public class main {

    interface StringLengthLambda{
        int getLength(String str);
    }

    public static void main(String[] args) {
            StringLengthLambda stringLengthLambda = (String str) -> str.length();
            int length = stringLengthLambda.getLength("Lambda");
            System.out.println("String length: " + length);
    }
}


