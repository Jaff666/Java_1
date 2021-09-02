package zadanie2;

public class Karta {
    Kolor kolor;
    Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.figura = figura;
        this.kolor = kolor;
        
    }

    @Override
    public String toString() {
        return String.format("%s%s%s", figura, " ",kolor);
    }

}
