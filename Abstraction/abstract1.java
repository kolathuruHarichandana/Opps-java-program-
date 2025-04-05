abstract class OnlinePayment {
    abstract void makePayment(double amount);
    public void transactionSuccessful() {
        System.out.println("Transaction Completed Successfully!");
    }
}
class CreditCardPayment extends OnlinePayment {
    void makePayment(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
        transactionSuccessful();
    }
}
class UpiPayment extends OnlinePayment {
    void makePayment(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
        transactionSuccessful();
    }
}
public class P{
    public static void main(String[] args) {
        OnlinePayment payment1 = new CreditCardPayment();
        payment1.makePayment(1000.50);
        OnlinePayment payment2 = new UpiPayment();
        payment2.makePayment(500.75);
    }
}
