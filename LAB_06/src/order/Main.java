package order;
public class Main {
    public static void main(String[] args){
    Pozycja pozycja1 = new Pozycja("Pizza", 4, 20);
    Pozycja pozycja2 = new Pozycja("Frytki", 4, 25);
    Pozycja pozycja3 = new Pozycja("Kebab", 4, 25);
    Zamowienie zamowienie1 = new Zamowienie(3); 
    System.out.println("Zamówienie:");
    zamowienie1.dodajPozycje(pozycja1);
    zamowienie1.dodajPozycje(pozycja2);
    zamowienie1.dodajPozycje(pozycja3);
    System.out.println(zamowienie1);

    }
}
