import zadania.Konto;
import zadania.Bankomat;

public class BankMain{
    public static void main(String[] args) throws Exception {
        System.out.println("Witaj w banku!");

        Konto k1 = new Konto(1);
        Konto k2 = new Konto(2);
        Konto k3 = new Konto(3);
        Konto k4 = new Konto(4);
        Konto k5 = new Konto(5);
        Konto k6 = new Konto(6);
        Konto k7 = new Konto(7);
        Konto k8 = new Konto(8);
        Konto k9 = new Konto(9);
        Konto k10 = new Konto(10);

        Konto[] konta = {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};

        Bankomat euronet = new Bankomat();

        euronet.menu(konta);
       
    } 
}