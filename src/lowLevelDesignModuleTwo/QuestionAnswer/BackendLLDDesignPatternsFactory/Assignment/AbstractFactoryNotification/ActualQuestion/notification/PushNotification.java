package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;

public class PushNotification extends Notification {

    public PushNotification(String recipient, NotificationTemplate notificationTemplate) {
        super(recipient, notificationTemplate);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent to device : "+getRecipient());
        System.out.println("Message : "+getNotificationTemplate().getMessage());
    }
}
