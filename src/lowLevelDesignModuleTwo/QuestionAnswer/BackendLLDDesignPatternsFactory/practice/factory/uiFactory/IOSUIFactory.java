package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.button.Button;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.button.IOSButton;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.menu.IOSMenu;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
