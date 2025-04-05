class TicketBooking {
    void bookTicket(String destination) {
        System.out.println("Ticket booked to " + destination + " for 1 person.");
    }
    void bookTicket(String destination, String date) {
        System.out.println("Ticket booked to " + destination + " on " + date + " for 1 person.");
    }
    void bookTicket(String destination, String date, int passengers) {
        System.out.println("Ticket booked to " + destination + " on " + date + " for " + passengers + " passengers.");
    }
}

public class F {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();

        tb.bookTicket("Delhi");
        tb.bookTicket("Mumbai", "2025-04-10");
        tb.bookTicket("Goa", "2025-05-01", 4);
    }
}
