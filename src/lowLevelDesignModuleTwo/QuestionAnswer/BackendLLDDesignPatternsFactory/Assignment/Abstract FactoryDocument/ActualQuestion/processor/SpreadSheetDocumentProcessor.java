package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public class SpreadSheetDocumentProcessor extends lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentProcessor {
    public SpreadSheetDocumentProcessor(String documentName) {
        super(documentName);
    }
    @Override
    public void processDocument() {
        //process document
    }

    @Override
    public lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType supportType() {
        return lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType.SPREAD_SHEET;
    }
}
