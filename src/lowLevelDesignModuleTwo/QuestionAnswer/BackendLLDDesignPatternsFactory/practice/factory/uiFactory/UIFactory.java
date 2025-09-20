package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.uiFactory;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.button.Button;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.practice.factory.ui.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
