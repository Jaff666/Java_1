package zad2;

public class MainInteger {
    public static void main(String[] args) {
        Slownik<Integer, String> Slownik = new Slownik<>(6);
        
        Slownik.dodaj(1, "Komputer");
        Slownik.dodaj(2, "Myszka");
        Slownik.dodaj(3, "Monitor");
        Slownik.dodaj(4, "Klawiatura");
        Slownik.dodaj(5, "Mikrofon");
        Slownik.dodaj(6, "Słuchawki");
        System.out.println("Tablica: " + Slownik.toString());
        Slownik.dodaj(1, "Sok");
        System.out.println("Tablica: " + Slownik.toString());
        System.out.println("Czy zawiera?:" + Slownik.czyZawiera(4));
        System.out.println("Wielkość: " + Slownik.wielkosc());
        
    }
}
