package facadepattern;

public interface HotelService {
    default void requestCart(int numberOfCarts) {
    }

    default void cleanRoom(int roomNumber) {
    }

    default void pickUpVehicle(String plateNumber) {
    }
}

