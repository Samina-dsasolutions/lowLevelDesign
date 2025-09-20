package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public class SpreadSheetDocumentProcessor extends DocumentProcessor {
    public SpreadSheetDocumentProcessor(String documentName) {
        super(documentName);
    }
    @Override
    public void processDocument() {
        //process document
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }
}
