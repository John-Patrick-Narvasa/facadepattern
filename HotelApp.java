package facadepattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestCart(5);
        frontDesk.cleanRoom(101);
        frontDesk.pickUpVehicle("ABC123");
    }  
}