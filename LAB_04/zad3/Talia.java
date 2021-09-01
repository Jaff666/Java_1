package zadanie2;
import java.util.ArrayList;
public class Talia {
    private ArrayList<Karta> deck;


    public Talia(){
        deck = new ArrayList<>();
		for (Kolor kolor : Kolor.values()) {
			for (Figura figura : Figura.values()) {
				deck.add(new Karta(kolor, figura));
			}
		}		
    }
    @Override
    public String toString() {
        return String.format("%s",deck);
    }
}
