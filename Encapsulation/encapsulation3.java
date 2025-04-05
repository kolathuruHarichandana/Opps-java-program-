import java.util.Scanner;
class Ticket {
    private String ticketId;
    private String customerName;
    private String destination;
    private double price;
    private boolean isBooked;

    public Ticket(String ticketId, String customerName, String destination, double price) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.destination = destination;
        this.price = price;
        this.isBooked = false;
    }
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket already booked.");
        }
    }
    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Ticket canceled successfully.");
        } else {
            System.out.println("Ticket is not booked yet.");
        }
    }
    public void checkStatus() {
        if (isBooked) {
            System.out.println("Ticket is booked.");
        } else {
            System.out.println("Ticket is available.");
        }
    }
    public String getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }
}
public class Ti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ticket ticket1 = new Ticket("T123", "Alice", "New York", 150.00);

        // Main loop for ticket booking operations
        while (true) {
            System.out.println("\n--- Ticket Booking Menu ---");
            System.out.println("1. Check Ticket Status");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after int input

            switch (option) {
                case 1:
                    ticket1.checkStatus();
                    break;

                case 2:
                    ticket1.bookTicket();
                    break;

                case 3:
                    ticket1.cancelTicket();
                    break;

                case 4:
                    System.out.println("Exiting Ticket Booking System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
