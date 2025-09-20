package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.enums.Platform;



public class UIfactoryFactory {
    public static UIFactory getUIfactoryFactory(Platform platform) {
        return switch(platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
