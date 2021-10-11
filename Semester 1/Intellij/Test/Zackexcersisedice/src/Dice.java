import java.util.Random;

public class Dice {
    Random rand = new Random();
    private int diceValue;

    public Dice(){
        diceValue = rand.nextInt(1,7);
    }

    public void rollDiceValue(){
        diceValue = rand.nextInt(1,7);
    }

    public int getDiceValue() {
        return diceValue;
    }
}
