package zadania;

import java.util.Scanner;

public class Bankomat {
    int id;
    int balance;
    
    public void menu(Konto[] konta){
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Enter an id: ");
        boolean trueOrFalse = true;
        id = scanner.nextInt();
        while (trueOrFalse == true) {
            Konto konto = konta[id];
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.println("Enter a choice: ");
            int operation = scanner.nextInt();
            switch (operation){
                case 1:
                    System.out.println("The balance is: " + konto.getBalance());
                    break;
                case 2:
                    System.out.println("How much would you like to whitdraw?");
                    int withdrawSum=scanner.nextInt();
                    System.out.println("You withdrawed: " + withdrawSum);
                    System.out.println("Your new balance is: "  + konto.withdraw(withdrawSum));
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    int depositSum=scanner.nextInt();
                    System.out.println("You deposited: " + depositSum);
                    System.out.println("Your new balance is: "  + konto.deposit(depositSum));
                    break;
                case 4:
                    System.out.println("Exiting");
                    trueOrFalse = false;
                    break;
                    
                default:
                    System.out.println("Please try again");

        
                }
            }
        }
    }
}
