package Task3;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        ArrayList<Room> rooms = new ArrayList<Room>();

        Room livingRoom = new Room(2,2,4);
        Room bedRoom = new Room(1,3,1);
        Room bathRoom = new Room(1, 0,100);


        Collections.addAll(rooms, livingRoom, bedRoom, bathRoom);

        Building hjem = new Building(rooms, 1,1,false);

        System.out.println(countLampsInBuilding(hjem));
        System.out.println(isNormal(hjem));
    }

    static int countLampsInBuilding(Building hjem){
        int totalLamps = 0;

        for(Room room : hjem.getListOfRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    static boolean isNormal(Building hjem){

        if(hjem.getNumberOfFloors() > hjem.getListOfRooms().toArray().length){
            return true;
        }else{
            System.out.println("This is an odd building");
            return false;
        }
    }
}
