package zadanie3;
import java.util.Random;

public class Zawodnik {
    String name;
    int min;
    int max;
    int distance;


    public Zawodnik(String name, int min, int max){
        this.name=name;
        this.min=min;
        this.max=max;
        this.distance=0;
        
    }
    public void przedstawSie(){
        System.out.println("Jestem " + name + " biegam z predkoscia " + min + "-" + max +"km/h ");
    }
    public void biegnij(){
        Random rand = new Random();
        int random = rand.nextInt(max - min) + min;
        distance=distance + random;
    }

    public int returnDistance() {
        return distance;
        
    }
}
