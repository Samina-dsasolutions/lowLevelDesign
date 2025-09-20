package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.enums.Platform;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory.UIFactory;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory.UIfactoryFactory;

public class Flutter {

    public void setTheme(){
        System.out.println("settting Theme");
    }
    public void setRefreshRate(){
        System.out.println("setting Refresh Rate");
    }
    public static UIFactory craeteFactory(Platform platform){
        /*
        if(platform == Platform.ANDROID){
            return new AndroidUIFactory();
        }else if(platform == Platform.IOS){
            return new IOSUIFactory();
        }
        return null;
        */
        return UIfactoryFactory.getUIfactoryFactory(platform);
    }
}
