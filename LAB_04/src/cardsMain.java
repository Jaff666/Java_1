import zadanie2.Figura;
import zadanie2.Karta;
import zadanie2.Kolor;
import zadanie2.Talia;

public class cardsMain {
    public static void main(String[] args) {
        
        Karta karta = new Karta(Kolor.Kier, Figura.As);
        System.out.println("Jedna karta: ");
        System.out.println(karta);

        Talia talia = new Talia();
        System.out.println("Talia kart: ");
        System.out.println(talia);
    }

}
