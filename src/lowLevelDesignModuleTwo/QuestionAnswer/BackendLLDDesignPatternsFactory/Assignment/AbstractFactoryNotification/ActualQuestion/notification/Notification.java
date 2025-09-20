package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;

public abstract class Notification {
    public String recipient;
    private NotificationTemplate notificationTemplate;
    public Notification(String recipient, NotificationTemplate notificationTemplate) {
        this.recipient = recipient;
        this.notificationTemplate = notificationTemplate;
    }

    public String getRecipient() {
        return recipient;
    }
    public NotificationTemplate getNotificationTemplate() {
        return notificationTemplate;
    }
    public abstract NotificationType notificationType();
    public abstract void sendNotification();
}
