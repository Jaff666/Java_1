
public class Pozycja {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki){
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }
    
    protected double obliczWartosc(){

        return iloscSztuk * cenaSztuki;
    }
    @Override
    public String toString(){
        return  nazwaTowaru +   "\t" + iloscSztuk + "szt." + "\t" + cenaSztuki + "zł" + "\t" + obliczWartosc() + "zł";
    }
}
