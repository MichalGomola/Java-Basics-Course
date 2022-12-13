public class MuseumTickets {
    public  static void main(String[] args) {

        int ticketPrice = 10;
        int age = 20;
        boolean isStudent = true;

        if (age <= 15) {
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else if (isStudent) {
            ticketPrice = 5;
        }
        System.out.println("Ticket price: $" + ticketPrice);
    }
}
