package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.models.BookingResult;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.services.*;

import java.time.LocalDate;

public class BookingManager {
    private BookingProcessor bookingProcessor;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                            NotificationService notificationService,
                            LoyalityService loyalityService,
                            AccomodationDetailsService accomodationDetailsService){
        this.bookingProcessor=new BookingProcessor(availabilityService,paymentService,notificationService,loyalityService,accomodationDetailsService);

    }
    public BookingResult bookAccomodation(String userId,
                                          String accomodationId,
                                          LocalDate checIndate,
                                          LocalDate checkOutDate){
        return bookingProcessor.process(userId,accomodationId,checIndate,checkOutDate);
    }

}
