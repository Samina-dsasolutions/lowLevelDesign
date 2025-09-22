package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.services;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.models.PreProcessedData;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.models.PreProcessingOptions;

import java.util.List;

public class DataPreProcessingService {
    public PreProcessedData preprocessData(List<Object> rawData, PreProcessingOptions processingOptions){
        return new PreProcessedData();
    }
}
