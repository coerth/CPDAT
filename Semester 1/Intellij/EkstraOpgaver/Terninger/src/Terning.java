import java.util.Random;

public class Terning {
    Random rand = new Random();
    private int eyes;

    public Terning(int eyes) {
        this.eyes = eyes;
    }

    public void Throw(){
        eyes = (rand.nextInt(1, 7));
    }

    public int getEyes() {
        return eyes;
    }
}
