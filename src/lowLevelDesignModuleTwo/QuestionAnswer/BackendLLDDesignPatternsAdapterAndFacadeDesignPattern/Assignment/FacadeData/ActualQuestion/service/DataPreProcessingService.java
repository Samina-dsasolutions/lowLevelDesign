package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.PreProcessedData;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.PreProcessingOptions;

import java.util.List;

public class DataPreProcessingService {
    public PreProcessedData preprocessData(List<Object> rawData, PreProcessingOptions processingOptions){
        return new PreProcessedData();
    }
}
