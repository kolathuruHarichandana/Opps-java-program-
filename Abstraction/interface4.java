import java.util.Scanner;
interface Flight {
    void bookTicket(String passengerName, String destination);
}
class EconomyClass implements Flight {
    public void bookTicket(String passengerName, String destination) {
        int price = calculatePrice(destination, "Economy");
        System.out.println(" Booking Confirmed for " + passengerName);
        System.out.println("Class: Economy | Destination: " + destination);
        System.out.println("Total Fare: $" + price);
    }
    private int calculatePrice(String destination, String type) {
        return (destination.length() * 20) + (type.equals("Economy") ? 100 : 200);
    }
}
class BusinessClass implements Flight {
    public void bookTicket(String passengerName, String destination) {
        int price = calculatePrice(destination, "Business");
        System.out.println(" Booking Confirmed for " + passengerName);
        System.out.println("Class: Business | Destination: " + destination);
        System.out.println("Total Fare: $" + price);
    }
    private int calculatePrice(String destination, String type) {
        return (destination.length() * 20) + (type.equals("Economy") ? 100 : 200);
    }
}
public class FB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Passenger Name: ");
        String passengerName = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.println("Select Class: 1. Economy  2. Business");
        int choice = scanner.nextInt();
        Flight flight;
        if (choice == 1) {
            flight = new EconomyClass();
        } else {
            flight = new BusinessClass();
        }
        flight.bookTicket(passengerName, destination);
        scanner.close();
    }
}
