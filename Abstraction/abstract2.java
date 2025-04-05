abstract class Product {
    abstract void addToCart();
    public void showDiscount() {
        System.out.println("You get a 10% discount on this product.");
    }
}
class Electronics extends Product {
    void addToCart() {
        System.out.println("Laptop added to cart.");
        showDiscount();
    }
}
class Clothing extends Product {
    void addToCart() {
        System.out.println("T-shirt added to cart.");
        showDiscount();
    }
}
public class S {
    public static void main(String[] args) {
        Product item1 = new Electronics();
        item1.addToCart();
        Product item2 = new Clothing();
        item2.addToCart();
    }
}
