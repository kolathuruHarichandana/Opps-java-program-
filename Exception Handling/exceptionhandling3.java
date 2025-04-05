import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 2500.00;
        try {
            System.out.println("Current balance: ₹" + balance);
            System.out.print("Enter withdrawal amount: ₹");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new InsufficientFundsException("Not enough balance to withdraw ₹" + amount);
            }
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
