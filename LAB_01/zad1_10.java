import java.util.Scanner;

public class zad1_10 {
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    double random_number = Math.random()*3;
    int random_number1 = (int)random_number;
    System.out.println("Welcome in rock, paper, scissors game!");
    System.out.println("0 - rock");
    System.out.println("1 - paper");
    System.out.println("2 - scissors");
    System.out.println("Select number from 0 to 2:");
    int number = scanner.nextInt();
    if (number == random_number1) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("Draw!");
      } else if (number==0 && random_number1==1) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You lose!");
      }else if (number==1 && random_number1==0) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You won!");
      }else if (number==1 && random_number1==2) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You lose!");
      }else if (number==2 && random_number1==1) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You won!");
      }else if (number==2 && random_number1==0) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You lose!");
      }else if (number==0 && random_number1==2) {
        System.out.println("Your opponent picked:" + random_number1);
        System.out.println("You won!");
      }else {
        System.out.println("Out of reach! Select other number.");
    }
}
}