package order;
import java.util.Arrays; 
public class Zamowienie {
    private Pozycja[] pozycje;
    private int maksRozmiar;
    private double sum;
    
    Zamowienie(int maksRozmiar){
        this.maksRozmiar=maksRozmiar;
        pozycje=new Pozycja[maksRozmiar];
    }

    Zamowienie(){
        this.maksRozmiar=10;
        pozycje=new Pozycja[10];
    }
    
    Pozycja dodajPozycje(Pozycja pozycja)
    {
        int a = 0;
        for (int i = 0; i < maksRozmiar; i++){
            if(pozycje[i] == null){
                pozycje[i] = pozycja;
                a = i;
                break;
            }
        }
        System.out.println(pozycje[a]);
        return pozycja;
    }   
    
    private double obliczWartosc1(){
        sum=0;
        for (int i = 0; i < pozycje.length; i++){
            if(pozycje[i] != null){
                sum  = sum + (pozycje[i].obliczWartosc());
            }
        }
        return sum;
    }

    @Override
    public String toString(){
        return  "Wartość całego zamówienia: " + obliczWartosc1() + "zł";
    }
}

