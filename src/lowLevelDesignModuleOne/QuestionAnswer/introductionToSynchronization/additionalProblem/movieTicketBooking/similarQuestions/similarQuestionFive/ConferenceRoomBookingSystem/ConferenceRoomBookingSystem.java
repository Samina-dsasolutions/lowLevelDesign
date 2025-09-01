package lowLevelDesignModuleOne.QuestionAnswer
        .introductionToSynchronization.additionalProblem
        .movieTicketBooking.similarQuestions
        .similarQuestionFive
        .ConferenceRoomBookingSystem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConferenceRoomBookingSystem {
    private int availableTimeSlots;
    private final Lock reservationLock;
    public ConferenceRoomBookingSystem(int totalTimeSlots) {
        this.availableTimeSlots = totalTimeSlots;
        reservationLock = new ReentrantLock();
    }
    public boolean reserveSlots(int numSlots){
        if(numSlots<=availableTimeSlots){
            try{
                reservationLock.lock();
                if(numSlots<=availableTimeSlots){
                    availableTimeSlots-=numSlots;
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
    public int getAvailableSlots(){
        return availableTimeSlots;
    }
}
