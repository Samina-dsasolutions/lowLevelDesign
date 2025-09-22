package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeImage.ActualQuestion.services;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeImage.ActualQuestion.models.Image;

public class ImageLoader {
    public Image loadImage(String imagePath){
        return new Image();
    }
}
