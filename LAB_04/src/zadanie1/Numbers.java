package zadanie1;
import java.util.Scanner;
import java.util.Random;

public class Numbers {
    int min;
    int max;
    int random;

    public void Game(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set mininum:");
        min=scanner.nextInt();
        System.out.println("Set maximum:");
        max=scanner.nextInt();
        Random rand = new Random();
        int random = rand.nextInt(max - min) + min;
        int number = 0;
        for(int i=0; i<=5; i++){
            System.out.println("Enter number:");
            number = scanner.nextInt();
            if (number>random){
                System.out.println("Too big!");
            }
            else if (number<random){
                System.out.println("Too small!");
            }
            else if (number==random){
                System.out.println("You won!");
                System.exit(0);
            }
            if(i==5){
                System.out.println("You lost!");
                System.out.println("Random number: " + random);
                System.exit(0);
            }
        }
    }    
}








