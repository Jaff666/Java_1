package zad3;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/micha/Desktop/Programowanie/Szkielety/szkielety/src/zad3/slowa.txt");
        Slownik<String, String> slownik = Slownik.wczytajSlownik(file);
        System.out.println(slownik);
    }
}
