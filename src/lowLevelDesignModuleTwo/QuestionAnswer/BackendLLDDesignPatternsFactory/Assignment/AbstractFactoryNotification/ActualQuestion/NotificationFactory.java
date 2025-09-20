package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.Notification;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender.NotificationSender;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;

public abstract class NotificationFactory {

    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recepient, String sender,NotificationTemplate notificationTemplate);

    public abstract NotificationSender createNotificationSender(Notification notification);

    public  abstract NotificationTemplate createNotificationTemplate(String message);
}
