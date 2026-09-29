package facadepattern;

public class FrontDesk {
    private HotelService cartService;
    private HotelService houseKeepingService;
    private HotelService valetService;

    public FrontDesk() {
        this.cartService = new Cart();
        this.houseKeepingService = new HouseKeeping();
        this.valetService = new Valet();
    }

    public void requestCart(int numberOfCarts) {
        cartService.requestCart(numberOfCarts);
    }

    public void cleanRoom(int roomNumber) {
        houseKeepingService.cleanRoom(roomNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        valetService.pickUpVehicle(plateNumber);
    }

    public void parkVehicle(String plateNumber) {
        valetService.parkVehicle(plateNumber);
    }
    
    public void hotelService(int numberOfCarts, int roomNumber, String plateNumber) {
        cartService.requestCart(numberOfCarts);
        houseKeepingService.cleanRoom(roomNumber);
        valetService.pickUpVehicle(plateNumber);
        valetService.parkVehicle(plateNumber);
    }
}