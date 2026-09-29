package facadepattern;

public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }
}