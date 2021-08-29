package zad4;

public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int numer;
    private int vmax;

    public Zawodnik(String imie, String nazwisko, int numer, int vmax) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.vmax = vmax;
    }

    @Override
    public String toString() {
        return String.format("%s %s Numer: %d  Prędkość: %d", imie, nazwisko, numer, vmax);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getNumer() {
        return numer;
    }

    public Integer getVmax() {
        return vmax;
    }
}
