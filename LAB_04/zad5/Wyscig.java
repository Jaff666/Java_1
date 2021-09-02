import zadanie3.Zawodnik;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Filip",1,10);
        Zawodnik zawodnik2 = new Zawodnik("Grzegorz",8,18);
        Zawodnik zawodnik3 = new Zawodnik("Andrzej",6,16);
        
        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik3.przedstawSie();
    

        int meta = 50;

        while(zawodnik1.returnDistance()<meta && zawodnik2.returnDistance() <meta && zawodnik3.returnDistance()<meta){   
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();
        }
                 
        if(zawodnik1.returnDistance()>meta){
            System.out.println("Wygral: ");
            zawodnik1.przedstawSie();
        }
        else if (zawodnik2.returnDistance()>meta){
            System.out.println("Wygral: ");
            zawodnik2.przedstawSie();
        }
        else if (zawodnik3.returnDistance()>meta){
            System.out.println("Wygral: ");
            zawodnik3.przedstawSie();
        }
    }
                   
}
