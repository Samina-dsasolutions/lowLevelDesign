package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.Notification;

public class EmailNotificationSender extends NotificationSender{

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending email notification to : "+getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
