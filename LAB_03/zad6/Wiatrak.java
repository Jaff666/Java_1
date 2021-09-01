public class Wiatrak {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak() 
    {
        speed=MEDIUM;
        on=true;
        radius=5;
        color="Red";
    }

    public Wiatrak(int speed,boolean on,int radius,String color) 
    {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public void information()
    {
        if(this.on==true)
        {
        System.out.println("Current speed: " + speed + " Current radius: " + radius + " Current color: " + color);
        }
        else
        {
        System.out.println("Windmill is inactive");
        }
    }

}
