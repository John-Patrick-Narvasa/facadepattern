package facadepattern;

public class HouseKeeping implements HotelService {
    @Override
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }
}