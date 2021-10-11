package Task1;

public class Address {
    private String streetName;
    private int houseNum;
    private String floorNumAndSide;
    private int zipCode;
    private String city;
    private String country;

    public Address(String streetName, int houseNum, String floorNumAndSide, int zipCode, String city,String country) {
        this.streetName = streetName;
        this.houseNum = houseNum;
        this.floorNumAndSide = floorNumAndSide;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString(){
        String s;
        s = streetName + ", " + houseNum + ": "+ zipCode+ ", "+city;
        return s;
    }
}
