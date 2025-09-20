package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class SpreadSheetDocumentParser extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentParser {

    public SpreadSheetDocumentParser(String path){
        super(path);
    }
    @Override
    public void parseDocument(){
        //purse document
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType supportDocument() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType.SPREAD_SHEET;
    }

}
