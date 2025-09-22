package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.models;

public class BookingResult {

    private BookingStatus bookingStatus;
    private  BookingConfirmation bookingConfirmation;
    private String erorMessage;

    public BookingResult(BookingStatus bookingStatus, BookingConfirmation bookingConfirmation, String erorMessage) {
        this.bookingStatus = bookingStatus;
        this.bookingConfirmation = bookingConfirmation;
        this.erorMessage = erorMessage;
    }

    public static BookingResult success(BookingConfirmation bookingConfirmation) {
        return new BookingResult(BookingStatus.SUCCESS, bookingConfirmation, null);
    }
    public static BookingResult notAvailable(String errorMessage) {
        return new BookingResult(BookingStatus.NOT_AVAILABLE, null, errorMessage);
    }
    public static BookingResult paymentFailed(String errorMessage){
        return new BookingResult(BookingStatus.PAYMENT_FAILED, null, errorMessage);
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public BookingConfirmation getBookingConfirmation() {
        return bookingConfirmation;
    }

    public String getErorMessage() {
        return erorMessage;
    }
}
