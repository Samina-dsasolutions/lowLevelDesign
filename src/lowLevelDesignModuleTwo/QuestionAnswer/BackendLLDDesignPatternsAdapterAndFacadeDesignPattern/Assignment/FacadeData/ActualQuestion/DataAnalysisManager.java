package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.*;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.AnalysisAlgorithmService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.DataCollectionService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.DataPreProcessingService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.VisualizationService;

public class DataAnalysisManager {

    private DataAnalysisProcessor dataAnalysisProcessor;
    public DataAnalysisManager(DataCollectionService dataCollectionService, DataPreProcessingService dataPreProcessingService, AnalysisAlgorithmService analysisAlgorithmService, VisualizationService visualizationService) {
            dataAnalysisProcessor=new DataAnalysisProcessor(dataCollectionService, dataPreProcessingService, analysisAlgorithmService, visualizationService);
    }

    public AnalysisResult performFullAnalysis(
            DataCollectionParams dataCollectionParams,
            PreProcessingOptions preProcessingOptions,
            AnalysisAlgorithmConfig analysisAlgorithmConfig
    ){
        return dataAnalysisProcessor.process(dataCollectionParams, preProcessingOptions, analysisAlgorithmConfig);
    }
}
