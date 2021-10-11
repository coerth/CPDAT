import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    static ArrayList<Player> players = new ArrayList<>();
    static int MAX = 6;
    public static void main(String[] arg) {
        UI ui = new UI();
        try {
            readGameData();
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
            ui.createAccounts();
            //ui.manageAccount();

        }
        Board board = new Board();
        //todo: call gameloop(w. while)
        saveData();
        printAccounts();

    }

    private static void readGameData() throws FileNotFoundException {
        File file = new File("src/data.txt");
        Scanner scan;
        scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String[] values = scan.nextLine().split(" :");
            int converted_int = Integer.parseInt(values[1]);
            Player p = new Player(values[0], converted_int);
            players.add(p);
        }
    }

    private static void showMenu() {
        System.out.println("Press Q to quit");
        System.out.println("Press C to create Bank Account");
        System.out.println("Press T to do transaction");
    }

    private static void printAccounts() {
        for (Player s : players) {
            System.out.println(s);
        }
    }

    private static void saveData() {
        try {
            FileWriter writer = new FileWriter("src/data.txt");
            String gameData = "";
            for (Player s : players) {

                gameData += s;

            }
            writer.write(gameData);
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}