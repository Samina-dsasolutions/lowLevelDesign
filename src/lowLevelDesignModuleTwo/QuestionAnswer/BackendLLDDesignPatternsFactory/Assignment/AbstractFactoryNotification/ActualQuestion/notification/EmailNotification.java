package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;

public class EmailNotification extends Notification {
    private String sender;
    public EmailNotification(String recipient, String Sender,NotificationTemplate notificationTemplate) {
        super(recipient, notificationTemplate);
        this.sender = sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to "+getRecipient());
        System.out.println("Message "+getNotificationTemplate().getMessage());
    }
}
