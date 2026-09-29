package facadepattern;

public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " carts from the hotel.");
    }
}