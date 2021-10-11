package Task3;

public class Customer {
    String firstName;
    String lastName;
    String userName;
    int id;

    public Customer(String firstName,String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Username: " + userName;
    }
}
