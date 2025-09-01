package lowLevelDesignModuleOne.QuestionAnswer.introductionToSynchronization.additionalProblem.movieTicketBooking.originalQuestion;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class movieTicketBooking {
    private int availableSeats;
    private final Lock reservationLock;
    public movieTicketBooking(int totalSeats) {
        this.availableSeats=totalSeats;
        reservationLock = new ReentrantLock();
    }
    public boolean reserveSeats(int numseats) {
        if(numseats<=availableSeats){
            try {
                reservationLock.lock();
                if(numseats<=availableSeats){
                    availableSeats-=numseats;
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
    public int getAvailableSeats() {
        return availableSeats;
    }


}
