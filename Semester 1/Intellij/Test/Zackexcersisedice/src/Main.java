import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Dice> dices = new ArrayList<>();
    public static ArrayList<Integer> values = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String choice;
        System.out.println("Write the number of dices");
        choice = scan.nextLine();

        for(int i=0; i<Integer.parseInt(choice); i++){
            dices.add(new Dice());
            values.add(dices.get(i).getDiceValue());
            dices.get(i).rollDiceValue();
            System.out.println("New values: "+dices.get(i).getDiceValue()+ " - Old values: "+values.get(i));
        }

       /* System.out.println("Would you like to roll again? Y for yes N for no");
        choice = scan.nextLine();

        if(choice.equalsIgnoreCase("Y")){
            for(int i=0; i<dices.size(); i++) {
                values.add(dices.get(i).getDiceValue());
                dices.get(i).rollDiceValue();
                System.out.println("New values: "+dices.get(i).getDiceValue()+ " - Old values: "+values.get(i));
            }
        }*/
    }
}
