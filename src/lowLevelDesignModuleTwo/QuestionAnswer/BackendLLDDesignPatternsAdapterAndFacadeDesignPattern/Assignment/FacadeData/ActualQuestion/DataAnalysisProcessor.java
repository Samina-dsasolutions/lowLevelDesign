package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.*;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.AnalysisAlgorithmService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.DataCollectionService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.DataPreProcessingService;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service.VisualizationService;

public class DataAnalysisProcessor {

    private DataCollectionService dataCollectionService;
    private DataPreProcessingService dataPreProcessingService;
    private AnalysisAlgorithmService analysisAlgorithmService;
    private VisualizationService visualizationService;

    public DataAnalysisProcessor(DataCollectionService dataCollectionService, DataPreProcessingService dataPreProcessingService, AnalysisAlgorithmService analysisAlgorithmService, VisualizationService visualizationService) {

        this.dataCollectionService = dataCollectionService;
        this.dataPreProcessingService = dataPreProcessingService;
        this.analysisAlgorithmService = analysisAlgorithmService;
        this.visualizationService = visualizationService;
    }
    public AnalysisResult process(DataCollectionParams dataCollectionParams,
                                  PreProcessingOptions preProcessingOptions,
                                  AnalysisAlgorithmConfig analysisAlgorithmConfig) {

        //step 1 : collect data

        DataCollectionResult collectionResult=dataCollectionService.collectData(dataCollectionParams);

        //step : process data
        PreProcessedData preProcessedData= dataPreProcessingService.preprocessData(collectionResult.getData(), preProcessingOptions);

        //step 3: Apply analysis algorithm

        AnalysisResult analysisResult= analysisAlgorithmService.applyAnalysisAlgorithm(preProcessedData, analysisAlgorithmConfig);

        //step 4 : visualize results

        visualizationService.visualizeresult(analysisResult);

        return analysisResult;


    }
}
