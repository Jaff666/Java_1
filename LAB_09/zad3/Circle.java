package zad3;

public class Circle implements Figure {
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

}
