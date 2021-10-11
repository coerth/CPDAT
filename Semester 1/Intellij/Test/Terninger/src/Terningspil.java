import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Terningspil {
    public static Random rand = new Random();
    public static Terning terning1 = new Terning(1);
    public static Terning terning2 = new Terning(1);
    public static Scanner scan = new Scanner(System.in);
    public static int tryProdukt;
    public static void main(String[] args) {
        int restartgame = 1;
        do {
            System.out.println("Hvad vil du gerne slå?:");
            int produkt = scan.nextInt();
            try {
                ValidateProdukt(produkt);
                DoThrows(produkt);
            }
            catch(Exception e){
                System.out.println(e);
            }


            System.out.println("Would you like to try again? 1 for yes 0 for no:");
            restartgame = scan.nextInt();
        }while(restartgame == 1);




    }

    private static void DoThrows(int produkt){
        int antalSlaaet = 0;
        do {
            terning1.Throw();
            terning2.Throw();
            tryProdukt = terning1.getEyes() * terning2.getEyes();
            System.out.println(terning1.getEyes() + " og " + terning2.getEyes() + " = " + tryProdukt);
            antalSlaaet++;
        } while (tryProdukt != produkt);
        System.out.println("Du slog " + antalSlaaet + " antal slag");
    }

    private static void ValidateProdukt(int tal){
        ArrayList<Integer> possibilities = new ArrayList<Integer>();
        for(int i = 1; i<=6; i++){
            for(int j = 1; j<=6; j++){
                int possible = i*j;
                possibilities.add(possible);
            }
        }
            if(!possibilities.contains(tal)){
                throw new IllegalArgumentException("Produktet "+tal+" kan ikke nås med 2 terninger");
            }

        //if(tal>(6*6)){
          //
        //}
    }
}
