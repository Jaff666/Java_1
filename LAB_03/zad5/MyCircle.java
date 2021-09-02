public class MyCircle {
    int radius;

    public MyCircle(int radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return (Math.PI*(radius*radius));
    }

    public double circut()
    {
        return (2 * Math.PI *radius);
    }

    public int diameter()
    {
        return (2*radius);
    }
}