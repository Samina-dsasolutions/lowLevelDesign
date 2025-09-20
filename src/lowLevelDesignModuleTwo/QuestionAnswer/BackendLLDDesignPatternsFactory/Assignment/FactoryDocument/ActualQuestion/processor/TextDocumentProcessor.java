package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor {

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }
    @Override
    public void processDocument() {
        //process document
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }
}
