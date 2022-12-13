public class MuseumTickets {
    public  static void main(String[] args) {

        int ticketPrice = 10;
        int age = 20;
        boolean isStudent = true;

        if ((age <= 15) || (age > 60) || (isStudent)) {
            ticketPrice = 5;
        }
            System.out.println("Ticket price: $" + ticketPrice);
    }
}
