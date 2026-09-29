package facadepattern;

public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }

    public void parkVehicle(String plateNumber) {
        System.out.println("Parking the vehicle with plate number: " + plateNumber);
    }
}