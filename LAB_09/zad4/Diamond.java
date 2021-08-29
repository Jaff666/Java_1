package zad4;
public class Diamond implements Figure, Comparable<Figure> {
    private double a;
    private double h;

    Diamond(double a, double h){
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return a*h;
    }

    @Override
    public double calculateCircuit() {
        return 4*a;
    }

    @Override
    public int compareTo(Figure that) {
        return (int) (this.calculateArea() - that.calculateArea());
    }
}

