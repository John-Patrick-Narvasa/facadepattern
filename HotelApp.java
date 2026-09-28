package facadepattern;

public class HotelApp {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        FrontDesk frontDesk = new FrontDesk(hotelService);

        frontDesk.requestCart(5);
        frontDesk.cleanRoom(101);
        frontDesk.pickUpVehicle("ABC123");
    }  
}