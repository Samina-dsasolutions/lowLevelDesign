package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate {
    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email Notification Template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
