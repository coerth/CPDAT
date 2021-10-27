package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        Customer customer1 = new Customer("Casper", "Posche", "Fluffa");
        Customer customer2 = new Customer("Mia", "Falk", "Schnackminister");
        Customer customer3 = new Customer("Morten", "Bendeke", "Desenor");
        Customer customer4 = new Customer("Yelong", "He", "Stiickish");
        Customer customer5 = new Customer("Mads", "Herlevsen", "Redhare");
        Customer customer6 = new Customer("Martin", "Lorentzen", "Zendary");
        Customer customer7 = new Customer("Pepsi", "Laks", "PepzLax");
        Customer customer8 = new Customer("Lars", "Larsen", "LarsLaks");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);

        printCustomers();


    }
    private static void printCustomers(){
        int index = 0;
        for(Customer c : customers){
            c.setId(index+1);
            System.out.println(c);
            if(customers.indexOf(c) != customers.size()-1){
                System.out.println();
            }
            index++;
        }
    }
}
