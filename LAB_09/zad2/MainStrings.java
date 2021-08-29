package zad2;

public class MainStrings {
    public static void main(String[] args) {
    Slownik<String, String> Slownik = new Slownik<>(7);
        Slownik.dodaj("Komputer",  "1");
        Slownik.dodaj("Myszka", "2");
        Slownik.dodaj("Monitor", "3");
        Slownik.dodaj("Klawiatura", "4");
        Slownik.dodaj("Mikrofon", "5");
        Slownik.dodaj("Słuchawki", "6");
        Slownik.dodaj("Telefon", "7");
        System.out.println("Tablica: " + Slownik.toString());
        System.out.println("Czy zawiera?:" + Slownik.czyZawiera("małpa"));
        System.out.println("Wielkość: " + Slownik.wielkosc());
    }
}
