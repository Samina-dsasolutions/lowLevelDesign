package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.button;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.enums.Platform;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {

    }

    @Override
    public void printButtonType() {
        System.out.println(Platform.ANDROID);
    }
}
