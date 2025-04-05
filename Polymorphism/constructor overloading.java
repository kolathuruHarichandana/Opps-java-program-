class FoodOrder {
    String customerName;
    String foodItem;
    String deliveryType;
    int quantity;
    FoodOrder(String foodItem) {
        this.customerName = "Guest";
        this.foodItem = foodItem;
        this.quantity = 1;
        this.deliveryType = "Standard";
    }
   FoodOrder(String foodItem, int quantity) {
        this.customerName = "Guest";
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.deliveryType = "Standard";
    }
    FoodOrder(String customerName, String foodItem, int quantity, String deliveryType) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.deliveryType = deliveryType;
    }
    void showOrder() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item     : " + foodItem);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Delivery Type : " + deliveryType);
        System.out.println("--------------------------------");
    }
}

public class F {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder("Burger");
        FoodOrder order2 = new FoodOrder("Pizza", 2);
        FoodOrder order3 = new FoodOrder("Aarav", "Pasta", 3, "Express");

        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
