package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.model;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.services.LoyalityService;

import java.time.LocalDate;

public class BookingConfirmation {

    private String userId;
    private String accomodationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public BookingConfirmation(String userId, String accomodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        this.userId = userId;
        this.accomodationId = accomodationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getAccomodationId() {
        return accomodationId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
