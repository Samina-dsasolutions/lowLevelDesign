package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.parser;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public class SpreadSheetDocumentParser extends DocumentParser {

    public SpreadSheetDocumentParser(String path){
        super(path);
    }
    @Override
    public void parseDocument(){
        //purse document
    }

    @Override
    public DocumentType supportDocument() {
        return DocumentType.SPREAD_SHEET;
    }

}
