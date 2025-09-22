package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion;


import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.model.BookingConfirmation;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.model.BookingResult;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.model.PaymentStatus;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.services.*;

import java.time.LocalDate;

public class BookingProcessor {
    private AccomodationDetailsService accomodationDetailsService;
    private AvailabilityService availabilityService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private LoyalityService loyalityService;

    public BookingProcessor(AvailabilityService availabilityService, PaymentService paymentService,
                            NotificationService notificationService,
                            LoyalityService loyalityService,
                            AccomodationDetailsService accomodationDetailsService) {

        this.accomodationDetailsService = accomodationDetailsService;
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.loyalityService = loyalityService;
    }
    public BookingResult process(String userId, String accomodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        boolean isAvailable=availabilityService.checkAvailability(accomodationId, checkInDate, checkOutDate);
        if(!isAvailable) {
            return BookingResult.notAvailable("accomodation not available for the given dates");
        }
        PaymentStatus paymentStatus=paymentService.makePayment(userId, accomodationId);
        if(paymentStatus!=PaymentStatus.SUCCESS){
            return BookingResult.paymentFailed("payment failed with status "+paymentStatus);
        }
        BookingConfirmation bookingConfirmation=new BookingConfirmation(userId,accomodationId,checkInDate,checkOutDate);
        notificationService.sendBookingConfirmation(bookingConfirmation);

        loyalityService.updateLoyalityPoints(userId,paymentService.calculatePaymentAmount(accomodationId));

        accomodationDetailsService.updateAccomodationDetails(accomodationId,checkInDate,checkOutDate);

        return BookingResult.success(bookingConfirmation);
    }

}
