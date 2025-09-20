package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.processor;

import lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.FactoryDocument.ActualQuestion.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }
    public String getDocumentName() {
        return documentName;
    }
    public abstract void processDocument();
    public abstract DocumentType supportType();
}
