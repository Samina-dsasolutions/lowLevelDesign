package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.services;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeBooking.ActualQuestion.model.PaymentStatus;

public class PaymentService {

    public PaymentStatus makePayment(String userId,String accomodationId){
        return PaymentStatus.SUCCESS;
    }
    public double calculatePaymentAmount(String accomodationId){
        return 0.0;
    }
}
