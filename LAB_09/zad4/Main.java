package zad4;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Zawodnik zawodnik = new Zawodnik("Pawel", "Nowak", 100, 10);
        Zawodnik zawodnik2 = new Zawodnik("Jacek", "Kowalski", 80, 18);
        Zawodnik zawodnik3 = new Zawodnik("Asia", "Kowalska", 34, 7);
        Zawodnik zawodnik4 = new Zawodnik("Katarzyna", "Pawlowicz", 150, 12);

        Zawodnik[] zawodnicy = new Zawodnik[]{zawodnik, zawodnik2, zawodnik3, zawodnik4};
        System.out.println(Arrays.toString(zawodnicy));

        Arrays.sort(zawodnicy, new ImieComparator());
        System.out.println(Arrays.toString(zawodnicy));
        Arrays.sort(zawodnicy, new MaxPredkoscComparator());
        System.out.println(Arrays.toString(zawodnicy));
        Arrays.sort(zawodnicy, new NumerComparator());
        System.out.println(Arrays.toString(zawodnicy));

    }
}
