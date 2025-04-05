class Payment {
        void makePayment(long cardNumber) {
        System.out.println("Payment done using Card: " + cardNumber);
    }
    void makePayment(String upiID) {
        System.out.println("Payment done using UPI ID: " + upiID);
    }
    void makePayment(String walletName, double amount) {
        System.out.println("Payment of ₹" + amount + " done using Wallet: " + walletName);
    }
}
public class F {
    public static void main(String[] args) {
        Payment pay = new Payment();
        pay.makePayment(1234567890123456L);                
        pay.makePayment("user@upi");                       
        pay.makePayment("Paytm", 750.00);                  
    }
}
