package Task1;

public class Driver {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String s;
        s =" is driven by " + name;
        return s;
    }
}
