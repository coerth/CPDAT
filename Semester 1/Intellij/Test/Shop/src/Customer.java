public class Customer {
    private String userName;
    private int id;

    public Customer(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }

    @Override
    public String toString() {
        String s;
        s = id + " : " + userName + "\n";
        return s;
    }

}
