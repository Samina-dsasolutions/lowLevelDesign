package lowLevelDesignModuleOne.QuestionAnswer.introductionToSynchronization.additionalProblem.movieTicketBooking.similarQuestions.similarQuestionFour.SportsEventTicketingSystem;

public class Client {
    public static void main(String[] args) {
        SportsEventTicketingSystem
                sportsEventTicketingSystem=
                    new SportsEventTicketingSystem(500);

        Runnable user1 = ()->{
            boolean success=sportsEventTicketingSystem.reserveTickets(399);
            System.out.println("one team trying to book 399 tickets "+success);
        };
        Runnable user2 = ()->{
            boolean success=sportsEventTicketingSystem.reserveTickets(400);
            System.out.println("two team trying to book 400 tickets "+success);
        };

        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("available tickets : "+sportsEventTicketingSystem.getAvailableTickets());
    }
}
