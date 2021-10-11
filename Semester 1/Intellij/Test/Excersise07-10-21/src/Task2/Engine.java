package Task2;

public class Engine {
    private int cylinders;
    private int topSpeed;
    private boolean hasFuelInjection;
    private String gasolinType;
    private String make;

    public Engine(int cylinders, int topSpeed, boolean hasFuelInjection, String gasolinType, String make) {
        this.cylinders = cylinders;
        this.topSpeed = topSpeed;
        this.hasFuelInjection = hasFuelInjection;
        this.gasolinType = gasolinType;
        this.make = make;
    }

    @Override
    public String toString(){
        String s;
        s = "Engine:" + make + " - Cylinders:"+cylinders+" - Top speed:"+topSpeed+"\n";
        return s;
    }

}
