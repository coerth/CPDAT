public class Player {

    private int id;
    private static int counter = 0;
    private String name;

    public Player(String name, int balance) {
        counter++;
        this.name = name;
        this.id = counter;
        BankAccount account = new BankAccount(name, balance);

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
