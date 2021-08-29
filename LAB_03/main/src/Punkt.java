public class Punkt {
    int x;
    int y;

    public Punkt() //Konstruktor
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) //Konstruktor
    {
        this.x = x;
        this.y = y;
    }



    public double obliczOdleglosc(int x, int y) {
        return Math.sqrt(Math.pow((x-this.x),2) + Math.pow((y-this.y), 2));
    }

    public double obliczOdleglosc(Punkt punkt) {
        return Math.sqrt(Math.pow((punkt.x-this.x),2) + Math.pow((punkt.y-this.y), 2));
    }
}

