package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.services;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.models.DataCollectionParams;
import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsAdapterAndFacadeDesignPattern.Assignment.FacadeData.ActualQuestion.models.DataCollectionResult;

public class DataCollectionService {
    public DataCollectionResult collectData(DataCollectionParams dataCollectionParams) {
        //stimulate data collection process
        //perform data collection logic
        //return collected data as datacollectionresult

        return new DataCollectionResult(/*collecte data */);
    }
}
