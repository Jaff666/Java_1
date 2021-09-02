import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Diamond diamond = new Diamond(2.0,4.0);
        Trapeze trapeze = new Trapeze(2.0, 4.0, 6.0, 8.0, 4.0);
        
        Figure[] array = new Figure[] { circle, diamond, trapeze };
        

        for (Figure figure : array) {
            Arrays.sort(array);
            System.out.println("Area: " + figure.calculateArea());
        }

    }
}
