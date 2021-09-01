import data.Account;
import data.ATM;

public class BankMain{
    public static void main(String[] args) throws Exception {
        System.out.println("Witaj w banku!");

        Account a1 = new Account(1);
        Account a2 = new Account(2);
        Account a3 = new Account(3);
        Account a4 = new Account(4);
        Account a5 = new Account(5);
        Account a6 = new Account(6);
        Account a7 = new Account(7);
        Account a8 = new Account(8);
        Account a9 = new Account(9);
        Account a10 = new Account(10);

        Account[] accounts = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};

        ATM euronet = new ATM();

        euronet.menu(accounts);
       
    } 
}