package facadepattern;

public class Valet implements HotelService {
    @Override
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }
}