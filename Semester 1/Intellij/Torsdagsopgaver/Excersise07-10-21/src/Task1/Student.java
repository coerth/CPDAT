package Task1;

public class Student {
    private String name;
    private int age;
    private Address address;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){
        String s;
        s = "Navn: " + name + "\nAlder: "+ age + "\nAdresse: "+address;
        return s;
    }
}
