package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.template;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.AbstractFactoryNotification.ActualQuestion.NotificationType;

public abstract class NotificationTemplate {
    private String message;
    public NotificationTemplate(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public abstract String applyTemplate();
    public abstract NotificationType notificationType();
}
