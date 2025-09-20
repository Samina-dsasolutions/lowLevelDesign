package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.menu;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.enums.Platform;

public class IOSMenu implements Menu {
    @Override
    public void printMenuType() {
        System.out.println(Platform.IOS);
    }
}
