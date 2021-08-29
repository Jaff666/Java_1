package zad4;
public class Circle implements Figure, Comparable<Figure> {
    private double r;
    
    Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * r * Math.PI;
    }

    @Override
    public double calculateCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    public int compareTo(Figure that) {
        return (int) (this.calculateArea() - that.calculateArea());
    }
}

