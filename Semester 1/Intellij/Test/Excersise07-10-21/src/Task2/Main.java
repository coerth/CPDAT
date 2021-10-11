package Task2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Car> formel1 = new ArrayList<>();
    public static void main(String[] args) {
        Tyre c1 = new Tyre("Pirelli","Hard", "Slick", "Dry", 5, 1);
        Tyre c2 = new Tyre("Pirelli", "Medium", "Slick", "Dry", 4, 2);
        Tyre c3 = new Tyre("Pirelli", "Soft/Red", "Slick", "Dry", 3, 3);
        Tyre c4 = new Tyre("Pirelli", "Intermediate(Green)", "Treaded", "Wet(light)", 0, 0);
        Tyre c5 = new Tyre("Pirelli", "Wet(Blue)", "Treaded", "Wet(heavy)", 0, 0);

        Car mercedes1 = new Car(0,2,false,"Black, Patrolium","Mercedes", false, c1);
        Car mercedes2 = new Car(0,2 ,false,"Black, Patrolium","Mercedes", false, c2);

        Car redbull1 = new Car(0, 2, false, "Red, Black and Yellow", "Redbull", false, c3);
        Car redbull2 = new Car(0, 2, false, "Red, Black and Yellow", "Redbull", false, c4);

        Car mcLaren1 = new Car(0,2,false,"Orange","McLaren", false, c5);



        Driver mercDriver1 = new Driver("Bottas",32,false,7,70, false, 0);
        Driver mercDriver2 = new Driver("Hamilton",36,false,10,73, true, 2);

        Driver redDriver1 = new Driver("Verstappen",24,false,10,72, false, 0);
        Driver redDriver2 = new Driver("Perez",31,false,7,56, false, 0);

        Driver mcDriver1 = new Driver("Norris", 21, false, 9, 68, false, 0);

        Engine mercEngine = new Engine(6, 372, false, "Octane 95", "Mercedes");
        Engine redEngine = new Engine(6, 372, false, "Octane 95", "Honda");

        mercedes1.setDriver(mercDriver1);
        mercedes1.setEngine(mercEngine);
        mercedes2.setDriver(mercDriver2);
        mercedes2.setEngine(mercEngine);
        redbull1.setDriver(redDriver1);
        redbull1.setEngine(redEngine);
        redbull2.setDriver(redDriver2);
        redbull2.setEngine(redEngine);
        mcLaren1.setDriver(mcDriver1);
        mcLaren1.setEngine(mercEngine);

        formel1.add(mercedes1);
        formel1.add(mercedes2);
        formel1.add(redbull1);
        formel1.add(redbull2);
        formel1.add(mcLaren1);
        for (Car f : formel1){
            System.out.println(f);
            if(formel1.indexOf(f) != formel1.size()-1){
                System.out.println();
            }
        }
    }

}
