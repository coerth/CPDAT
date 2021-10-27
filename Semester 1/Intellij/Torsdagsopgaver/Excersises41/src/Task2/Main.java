package Task2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Room> rooms = new ArrayList<>();
    public static void main(String[] args) {
        Room room1 = new Room(4, 3, 2,1);
        Room room2 = new Room(2, 1, 5,3);
        Room room3 = new Room(3, 2, 10,6);
        Room room4 = new Room(4, 1,10,3);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        Building building1 = new Building(rooms, 3, 2, true);

        System.out.println(building1.getTotaltLamps());

        if(building1.getRooms().size() < building1.getNumberOfFloors()){
            System.out.println("This is an weird building");
        }
        else{
            System.out.println("This is a normal building");
        }

    }
}
