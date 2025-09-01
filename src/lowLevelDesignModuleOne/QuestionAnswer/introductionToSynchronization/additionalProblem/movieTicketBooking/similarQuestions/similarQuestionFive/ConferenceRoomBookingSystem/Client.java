package lowLevelDesignModuleOne.QuestionAnswer.introductionToSynchronization.additionalProblem.movieTicketBooking.similarQuestions.similarQuestionFive.ConferenceRoomBookingSystem;

public class Client {
    public static void main(String[] args) {
        ConferenceRoomBookingSystem
                conferenceRoomBookingSystem=new ConferenceRoomBookingSystem(30);

        //create runnable task -  team will book time slot

        Runnable user1 = ()->{
            boolean success = conferenceRoomBookingSystem.reserveSlots(10);
            System.out.println("User 1 attempted to book 10 slots :"+success);

        };
        Runnable user2 = ()->{
            boolean success = conferenceRoomBookingSystem.reserveSlots(20);
            System.out.println("User 2 attempted to book 20 slots :"+success);

        };
        Runnable user3 = ()->{
            boolean success = conferenceRoomBookingSystem.reserveSlots(30);
            System.out.println("User 3 attempted to book 30 slots :"+success);

        };

        Thread user1Thread=new Thread(user1);
        Thread user2Thread=new Thread(user2);
        Thread user3Thread=new Thread(user3);

        user1Thread.start();
        user2Thread.start();
        user3Thread.start();

        try {
            user1Thread.join();
            user2Thread.join();
            user3Thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Remaininhg slots available after trying to book :"+conferenceRoomBookingSystem.getAvailableSlots());

    }
}
