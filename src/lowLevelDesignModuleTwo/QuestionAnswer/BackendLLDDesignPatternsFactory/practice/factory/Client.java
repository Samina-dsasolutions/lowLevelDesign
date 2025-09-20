package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.enums.Platform;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.button.Button;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory=Flutter.craeteFactory(Platform.ANDROID);

        Button b=uiFactory.createButton();
        b.printButtonType();
    }
}
