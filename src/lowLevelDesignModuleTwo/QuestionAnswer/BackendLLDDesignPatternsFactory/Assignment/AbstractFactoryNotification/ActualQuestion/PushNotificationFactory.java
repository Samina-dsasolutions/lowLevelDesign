package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.Notification;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.PushNotification;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender.NotificationSender;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender.PushNotificationSender;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recepient, String sender, NotificationTemplate notificationTemplate) {
        return new PushNotification(recepient, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
}
