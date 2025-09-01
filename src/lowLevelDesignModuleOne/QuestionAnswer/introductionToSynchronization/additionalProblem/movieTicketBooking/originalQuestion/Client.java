package lowLevelDesignModuleOne.QuestionAnswer.introductionToSynchronization.additionalProblem.movieTicketBooking.originalQuestion;

public class Client {
    public static void main(String[] args) {
        // Initialize the booking system with total seats, e.g., 10.
        movieTicketBooking bookingSystem = new movieTicketBooking(10);

        // Create multiple threads simulating different users trying to reserve seats.
        Runnable user1 = () -> {
            boolean success = bookingSystem.reserveSeats(3);
            System.out.println("User1 attempted to reserve 3 seats: " + success);
            System.out.println("Remaining seats: " + bookingSystem.getAvailableSeats());
        };

        Runnable user2 = () -> {
            boolean success = bookingSystem.reserveSeats(5);
            System.out.println("User2 attempted to reserve 5 seats: " + success);
            System.out.println("Remaining seats: " + bookingSystem.getAvailableSeats());
        };

        Runnable user3 = () -> {
            boolean success = bookingSystem.reserveSeats(4);
            System.out.println("User3 attempted to reserve 4 seats: " + success);
            System.out.println("Remaining seats: " + bookingSystem.getAvailableSeats());
        };

        // Launch threads
        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);
        Thread t3 = new Thread(user3);

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final available seats: " + bookingSystem.getAvailableSeats());
    }
}