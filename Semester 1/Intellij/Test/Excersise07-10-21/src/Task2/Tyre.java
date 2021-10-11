package Task2;

public class Tyre {
    private String make;
    private String name;
    private String tread;
    private String drivingCons;
    private int grip;
    private int durability;

    public Tyre(String make, String name, String tread, String drivingCons, int grip, int durability) {
        this.make = make;
        this.name = name;
        this.tread = tread;
        this.drivingCons = drivingCons;
        this.grip = grip;
        this.durability = durability;
    }

    @Override
    public String toString(){
        String s;
        s = "Tyre compound:" + name + " - Tread:" + tread + " - Conditions:" + drivingCons + " - Grip:"+grip;
        return s;
    }
}
