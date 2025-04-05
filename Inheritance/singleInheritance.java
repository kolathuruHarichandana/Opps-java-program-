class Restaurant {
    String name = "Spice Villa";
    String location = "MG Road";

    void displayRestaurant() {
        System.out.println("Restaurant: " + name);
        System.out.println("Location: " + location);
    }
}
class Delivery extends Restaurant {
    int deliveryTime = 30; 
    void displayDeliveryDetails() {
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
    }
}
public class FoodDeliveryApp {
    public static void main(String[] args) {
        Delivery order = new Delivery();
        order.displayRestaurant();
        order.displayDeliveryDetails();
    }
}
