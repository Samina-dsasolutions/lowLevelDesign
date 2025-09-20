package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.EmailNotification;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.notification.Notification;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender.EmailNotificationSender;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.sender.NotificationSender;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.EmailNotificationTemplate;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recepient, String sender, NotificationTemplate notificationTemplate) {
        return new EmailNotification(recepient, sender, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }
}
