abstract class HotelRoom {
    abstract void bookRoom();
    public void provideAmenities() {
        System.out.println("WiFi and breakfast included.");
    }
}
class DeluxeRoom extends HotelRoom {
    void bookRoom() {
        System.out.println("Deluxe Room booked with sea view.");
        provideAmenities();
    }
}
class StandardRoom extends HotelRoom {
    void bookRoom() {
        System.out.println("Standard Room booked with city view.");
        provideAmenities();
    }
}
public class S {
    public static void main(String[] args) {
        HotelRoom room1 = new DeluxeRoom();
        room1.bookRoom();
        HotelRoom room2 = new StandardRoom();
        room2.bookRoom();
    }
}
