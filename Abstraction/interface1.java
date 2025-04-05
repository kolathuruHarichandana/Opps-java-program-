import java.util.Scanner;
interface Shopping {
    void buyItem();
}
class Electronics implements Shopping {
    public void buyItem() {
        System.out.println("You bought an electronic gadget!");
    }
}
class Clothing implements Shopping {
    public void buyItem() {
        System.out.println("You bought a clothing item!");
    }
}
public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Category: 1. Electronics  2. Clothing");
        int choice = scanner.nextInt();
        Shopping shopping;
        if (choice == 1) {
            shopping = new Electronics();
        } else {
            shopping = new Clothing();
        }
        shopping.buyItem();
        scanner.close();
    }
}
