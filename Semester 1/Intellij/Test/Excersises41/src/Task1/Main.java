package Task1;

public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Casper", 26);
        Driver driver2 = new Driver("Mia",30);
        Driver driver3 = new Driver("Lucia", 26);
        Car car1 = new Car("Honda", "Civic", 2016, "Sedan");
        Car car2 = new Car("BMW", "X5", 1999, "XLine");
        Car car3 = new Car("Mini", "Cooper", 1995, "Sedan");

        car1.setDriver(driver3);
        car2.setDriver(driver2);
        car3.setDriver(driver1);

        System.out.println(car1 +""+ car1.getDriver());
        System.out.println(car2 +""+ car2.getDriver());
        System.out.println(car3 +""+ car3.getDriver());

    }
}
