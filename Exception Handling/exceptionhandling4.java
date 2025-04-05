: import java.util.Scanner;
class MaxLoginAttemptsExceededException extends Exception {
    public MaxLoginAttemptsExceededException(String message) {
        super(message);
    }
}
public class Login {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "123";
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        Scanner scanner = new Scanner(System.in);
        try {
            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter username: ");
                String user = scanner.nextLine();
                System.out.print("Enter password: ");
                String pass = scanner.nextLine();
                if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                    System.out.println("Login successful!");
                    return;
                } else {
                    attempts++;
                    System.out.println("Invalid credentials. Attempt " + attempts + " of " + MAX_ATTEMPTS);
                }
            }
            throw new MaxLoginAttemptsExceededException("Too many failed login attempts. Account locked.");
        } catch (MaxLoginAttemptsExceededException e) {
            System.out.println("Access Denied: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
