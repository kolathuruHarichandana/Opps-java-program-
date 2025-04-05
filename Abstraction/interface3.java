import java.util.Scanner;
interface FoodOrder {
    void orderFood();
}
class VegFood implements FoodOrder {
    public void orderFood() {
        System.out.println("You ordered a Vegetarian Meal!");
    }
}
class NonVegFood implements FoodOrder {
    public void orderFood() {
        System.out.println("You ordered a Non-Vegetarian Meal!");
    }
}
public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Food Type: 1. Vegetarian  2. Non-Vegetarian");
        int choice = scanner.nextInt();
        FoodOrder order;
        if (choice == 1) {
            order = new VegFood();
        } else {
            order = new NonVegFood();
        }
        order.orderFood();
        scanner.close();
    }
}
