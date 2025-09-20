package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;

public class PushNotificationTemplate extends NotificationTemplate {
    public PushNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Push Notification Template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
