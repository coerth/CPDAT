package Task2;

public class Car {
    private int numOfDoors;
    private int numOfWindows;
    private boolean isConvertible;
    private String color;
    private String make;
    private boolean hasFatRims;
    private Tyre tyre;
    private Driver driver;
    private Engine engine;

    public Car(int numOfDoors, int numOfWindows, boolean isConvertible, String color, String make, boolean hasFatRims, Tyre tyre) {
        this.numOfDoors = numOfDoors;
        this.numOfWindows = numOfWindows;
        this.isConvertible = isConvertible;
        this.color = color;
        this.make = make;
        this.hasFatRims = hasFatRims;
        this.tyre = tyre;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString(){
        String s;
        s = driver + make+": " + engine +tyre;
        return s;
    }
}
