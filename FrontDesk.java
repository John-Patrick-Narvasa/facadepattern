package facadepattern;

public class FrontDesk {

    private HotelService hs;

    public FrontDesk(HotelService hs) {
        this.hs = hs;
    }

    public void requestCart(int numberOfCarts) {
        hs.requestCart(numberOfCarts);
    }

    public void cleanRoom(int roomNumber) {
        hs.cleanRoom(roomNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        hs.pickUpVehicle(plateNumber);
    }
}