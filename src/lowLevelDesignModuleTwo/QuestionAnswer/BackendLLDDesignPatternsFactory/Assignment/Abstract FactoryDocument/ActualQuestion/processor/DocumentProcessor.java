package lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract;

public abstract class DocumentProcessor {
    private String documentName;
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }
    public String getDocumentName() {
        return documentName;
    }
    public abstract void processDocument();
    public abstract lowLevelDesignModuleTwo.QuestionAnswer.BackendLLDDesignPatternsFactory.Assignment.Abstract.DocumentType supportType();
}
