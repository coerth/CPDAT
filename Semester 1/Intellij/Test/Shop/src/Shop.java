import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shop {
    private static Random rand = new Random();
    private static ArrayList<Product> products = new ArrayList<Product>();
    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String choice;
        int customersInShop = rand.nextInt(5, 10);
        for(int i=0; i<customersInShop; i++){
            System.out.println("Name?:");
            choice = scan.nextLine();
            customers.add(new Customer(choice, i+1));
        }
        for(Customer c : customers){
            System.out.println(c);
        }
        displayProducts();
    }

    private static void displayProducts() {

    }


}
