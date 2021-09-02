public class Trapeze implements Figure, Comparable<Figure>  {
    private Double a;
    private Double b;
    private Double c;
    private Double d;
    private Double h;

    public Trapeze(Double a, double b, double c, double d, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return ((a+b)*h*(0.5));
    }

    @Override
    public double calculateCircuit() {
        double circuit = a + b + c + d;
        return circuit;
    }

    @Override
    public int compareTo(Figure that) {
        return (int) (this.calculateArea() - that.calculateArea());
    }
}
