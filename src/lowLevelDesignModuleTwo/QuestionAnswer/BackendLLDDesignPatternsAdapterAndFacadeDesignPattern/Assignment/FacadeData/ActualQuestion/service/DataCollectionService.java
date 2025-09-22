package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.service;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.DataCollectionParams;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.model.DataCollectionResult;

public class DataCollectionService {
    public DataCollectionResult collectData(DataCollectionParams dataCollectionParams) {
        //stimulate data collection process
        //perform data collection logic
        //return collected data as datacollectionresult

        return new DataCollectionResult(/*collecte data */);
    }
}
