package lowLevelDesignModuleOne.QuestionAnswer.introductionToSynchronization.additionalProblem.movieTicketBooking.similarQuestions.similarQuestionFour.SportsEventTicketingSystem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SportsEventTicketingSystem {
    private int availableTickets;
    private final Lock reservationLock;
    public SportsEventTicketingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
        reservationLock = new ReentrantLock();
    }
    public boolean reserveTickets(int numTickets){
        if(numTickets<=availableTickets){
            try {
                reservationLock.lock();
                if(numTickets<=availableTickets){
                    availableTickets-=numTickets;
                    return true;
                }else{
                    return false;
                }
            }finally {
                reservationLock.unlock();
            }
        }else{
            return false;
        }
    }
    public int getAvailableTickets() {
        return availableTickets;
    }
}
